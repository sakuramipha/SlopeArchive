package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.TreeMap;

public class RoomSQLiteQuery
  implements SupportSQLiteQuery, SupportSQLiteProgram
{
  private static final int BLOB = 5;
  static final int DESIRED_POOL_SIZE = 10;
  private static final int DOUBLE = 3;
  private static final int LONG = 2;
  private static final int NULL = 1;
  static final int POOL_LIMIT = 15;
  private static final int STRING = 4;
  static final TreeMap<Integer, RoomSQLiteQuery> sQueryPool = new TreeMap();
  int mArgCount;
  private final int[] mBindingTypes;
  final byte[][] mBlobBindings;
  final int mCapacity;
  final double[] mDoubleBindings;
  final long[] mLongBindings;
  private volatile String mQuery;
  final String[] mStringBindings;
  
  private RoomSQLiteQuery(int paramInt)
  {
    this.mCapacity = paramInt;
    paramInt++;
    this.mBindingTypes = new int[paramInt];
    this.mLongBindings = new long[paramInt];
    this.mDoubleBindings = new double[paramInt];
    this.mStringBindings = new String[paramInt];
    this.mBlobBindings = new byte[paramInt][];
  }
  
  public static RoomSQLiteQuery acquire(String paramString, int paramInt)
  {
    synchronized (sQueryPool)
    {
      Object localObject2 = ((TreeMap)???).ceilingEntry(Integer.valueOf(paramInt));
      if (localObject2 != null)
      {
        ((TreeMap)???).remove(((Map.Entry)localObject2).getKey());
        localObject2 = (RoomSQLiteQuery)((Map.Entry)localObject2).getValue();
        ((RoomSQLiteQuery)localObject2).init(paramString, paramInt);
        return (RoomSQLiteQuery)localObject2;
      }
      ??? = new RoomSQLiteQuery(paramInt);
      ((RoomSQLiteQuery)???).init(paramString, paramInt);
      return (RoomSQLiteQuery)???;
    }
  }
  
  public static RoomSQLiteQuery copyFrom(SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = acquire(paramSupportSQLiteQuery.getSql(), paramSupportSQLiteQuery.getArgCount());
    paramSupportSQLiteQuery.bindTo(new SupportSQLiteProgram()
    {
      final RoomSQLiteQuery val$query;
      
      public void bindBlob(int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        this.val$query.bindBlob(paramAnonymousInt, paramAnonymousArrayOfByte);
      }
      
      public void bindDouble(int paramAnonymousInt, double paramAnonymousDouble)
      {
        this.val$query.bindDouble(paramAnonymousInt, paramAnonymousDouble);
      }
      
      public void bindLong(int paramAnonymousInt, long paramAnonymousLong)
      {
        this.val$query.bindLong(paramAnonymousInt, paramAnonymousLong);
      }
      
      public void bindNull(int paramAnonymousInt)
      {
        this.val$query.bindNull(paramAnonymousInt);
      }
      
      public void bindString(int paramAnonymousInt, String paramAnonymousString)
      {
        this.val$query.bindString(paramAnonymousInt, paramAnonymousString);
      }
      
      public void clearBindings()
      {
        this.val$query.clearBindings();
      }
      
      public void close() {}
    });
    return localRoomSQLiteQuery;
  }
  
  private static void prunePoolLocked()
  {
    Object localObject = sQueryPool;
    if (((TreeMap)localObject).size() > 15)
    {
      int i = ((TreeMap)localObject).size() - 10;
      localObject = ((TreeMap)localObject).descendingKeySet().iterator();
      while (i > 0)
      {
        ((Iterator)localObject).next();
        ((Iterator)localObject).remove();
        i--;
      }
    }
  }
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    this.mBindingTypes[paramInt] = 5;
    this.mBlobBindings[paramInt] = paramArrayOfByte;
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    this.mBindingTypes[paramInt] = 3;
    this.mDoubleBindings[paramInt] = paramDouble;
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    this.mBindingTypes[paramInt] = 2;
    this.mLongBindings[paramInt] = paramLong;
  }
  
  public void bindNull(int paramInt)
  {
    this.mBindingTypes[paramInt] = 1;
  }
  
  public void bindString(int paramInt, String paramString)
  {
    this.mBindingTypes[paramInt] = 4;
    this.mStringBindings[paramInt] = paramString;
  }
  
  public void bindTo(SupportSQLiteProgram paramSupportSQLiteProgram)
  {
    for (int i = 1; i <= this.mArgCount; i++)
    {
      int j = this.mBindingTypes[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4)
            {
              if (j == 5) {
                paramSupportSQLiteProgram.bindBlob(i, this.mBlobBindings[i]);
              }
            }
            else {
              paramSupportSQLiteProgram.bindString(i, this.mStringBindings[i]);
            }
          }
          else {
            paramSupportSQLiteProgram.bindDouble(i, this.mDoubleBindings[i]);
          }
        }
        else {
          paramSupportSQLiteProgram.bindLong(i, this.mLongBindings[i]);
        }
      }
      else {
        paramSupportSQLiteProgram.bindNull(i);
      }
    }
  }
  
  public void clearBindings()
  {
    Arrays.fill(this.mBindingTypes, 1);
    Arrays.fill(this.mStringBindings, null);
    Arrays.fill(this.mBlobBindings, null);
    this.mQuery = null;
  }
  
  public void close() {}
  
  public void copyArgumentsFrom(RoomSQLiteQuery paramRoomSQLiteQuery)
  {
    int i = paramRoomSQLiteQuery.getArgCount() + 1;
    System.arraycopy(paramRoomSQLiteQuery.mBindingTypes, 0, this.mBindingTypes, 0, i);
    System.arraycopy(paramRoomSQLiteQuery.mLongBindings, 0, this.mLongBindings, 0, i);
    System.arraycopy(paramRoomSQLiteQuery.mStringBindings, 0, this.mStringBindings, 0, i);
    System.arraycopy(paramRoomSQLiteQuery.mBlobBindings, 0, this.mBlobBindings, 0, i);
    System.arraycopy(paramRoomSQLiteQuery.mDoubleBindings, 0, this.mDoubleBindings, 0, i);
  }
  
  public int getArgCount()
  {
    return this.mArgCount;
  }
  
  public String getSql()
  {
    return this.mQuery;
  }
  
  void init(String paramString, int paramInt)
  {
    this.mQuery = paramString;
    this.mArgCount = paramInt;
  }
  
  public void release()
  {
    synchronized (sQueryPool)
    {
      ???.put(Integer.valueOf(this.mCapacity), this);
      prunePoolLocked();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\RoomSQLiteQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */