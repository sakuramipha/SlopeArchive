package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class DataHolder
  extends AbstractSafeParcelable
  implements Closeable
{
  public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
  private static final Builder zaf = new zab(new String[0], null);
  final int zaa;
  Bundle zab;
  int[] zac;
  int zad;
  boolean zae = false;
  private final String[] zag;
  private final CursorWindow[] zah;
  private final int zai;
  private final Bundle zaj;
  private boolean zak = true;
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.zaa = paramInt1;
    this.zag = paramArrayOfString;
    this.zah = paramArrayOfCursorWindow;
    this.zai = paramInt2;
    this.zaj = paramBundle;
  }
  
  public DataHolder(Cursor paramCursor, int paramInt, Bundle paramBundle) {}
  
  private DataHolder(Builder paramBuilder, int paramInt, Bundle paramBundle)
  {
    this(Builder.zac(paramBuilder), zaf(paramBuilder, -1), paramInt, null);
  }
  
  public DataHolder(String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt, Bundle paramBundle)
  {
    this.zaa = 1;
    this.zag = ((String[])Preconditions.checkNotNull(paramArrayOfString));
    this.zah = ((CursorWindow[])Preconditions.checkNotNull(paramArrayOfCursorWindow));
    this.zai = paramInt;
    this.zaj = paramBundle;
    zad();
  }
  
  public static Builder builder(String[] paramArrayOfString)
  {
    return new Builder(paramArrayOfString, null, null);
  }
  
  public static DataHolder empty(int paramInt)
  {
    return new DataHolder(zaf, paramInt, null);
  }
  
  private final void zae(String paramString, int paramInt)
  {
    Bundle localBundle = this.zab;
    if ((localBundle != null) && (localBundle.containsKey(paramString)))
    {
      if (!isClosed())
      {
        if ((paramInt >= 0) && (paramInt < this.zad)) {
          return;
        }
        throw new CursorIndexOutOfBoundsException(paramInt, this.zad);
      }
      throw new IllegalArgumentException("Buffer is closed.");
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "No such column: ".concat(paramString);
    } else {
      paramString = new String("No such column: ");
    }
    throw new IllegalArgumentException(paramString);
  }
  
  private static CursorWindow[] zaf(Builder paramBuilder, int paramInt)
  {
    paramInt = Builder.zac(paramBuilder).length;
    int k = 0;
    if (paramInt == 0) {
      return new CursorWindow[0];
    }
    Object localObject3 = Builder.zab(paramBuilder);
    int m = ((List)localObject3).size();
    Object localObject1 = new CursorWindow(false);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localObject1);
    ((CursorWindow)localObject1).setNumColumns(Builder.zac(paramBuilder).length);
    paramInt = 0;
    int i = 0;
    while (paramInt < m) {
      try
      {
        boolean bool = ((CursorWindow)localObject1).allocRow();
        Object localObject2;
        if (!bool)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(72);
          ((StringBuilder)localObject1).append("Allocating additional cursor window for large data set (row ");
          ((StringBuilder)localObject1).append(paramInt);
          ((StringBuilder)localObject1).append(")");
          Log.d("DataHolder", ((StringBuilder)localObject1).toString());
          localObject2 = new android/database/CursorWindow;
          ((CursorWindow)localObject2).<init>(false);
          ((CursorWindow)localObject2).setStartPosition(paramInt);
          ((CursorWindow)localObject2).setNumColumns(Builder.zac(paramBuilder).length);
          localArrayList.add(localObject2);
          localObject1 = localObject2;
          if (!((CursorWindow)localObject2).allocRow())
          {
            Log.e("DataHolder", "Unable to allocate row to hold data.");
            localArrayList.remove(localObject2);
            return (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
          }
        }
        Map localMap = (Map)((List)localObject3).get(paramInt);
        int j = 0;
        bool = true;
        while (j < Builder.zac(paramBuilder).length)
        {
          if (!bool) {
            break label595;
          }
          localObject2 = Builder.zac(paramBuilder)[j];
          Object localObject4 = localMap.get(localObject2);
          if (localObject4 == null)
          {
            bool = ((CursorWindow)localObject1).putNull(paramInt, j);
          }
          else if ((localObject4 instanceof String))
          {
            bool = ((CursorWindow)localObject1).putString((String)localObject4, paramInt, j);
          }
          else if ((localObject4 instanceof Long))
          {
            bool = ((CursorWindow)localObject1).putLong(((Long)localObject4).longValue(), paramInt, j);
          }
          else if ((localObject4 instanceof Integer))
          {
            bool = ((CursorWindow)localObject1).putLong(((Integer)localObject4).intValue(), paramInt, j);
          }
          else if ((localObject4 instanceof Boolean))
          {
            long l;
            if (true != ((Boolean)localObject4).booleanValue()) {
              l = 0L;
            } else {
              l = 1L;
            }
            bool = ((CursorWindow)localObject1).putLong(l, paramInt, j);
          }
          else if ((localObject4 instanceof byte[]))
          {
            bool = ((CursorWindow)localObject1).putBlob((byte[])localObject4, paramInt, j);
          }
          else if ((localObject4 instanceof Double))
          {
            bool = ((CursorWindow)localObject1).putDouble(((Double)localObject4).doubleValue(), paramInt, j);
          }
          else
          {
            if (!(localObject4 instanceof Float)) {
              break label498;
            }
            bool = ((CursorWindow)localObject1).putDouble(((Float)localObject4).floatValue(), paramInt, j);
          }
          j++;
          continue;
          label498:
          paramBuilder = new java/lang/IllegalArgumentException;
          localObject1 = localObject4.toString();
          paramInt = String.valueOf(localObject2).length();
          i = ((String)localObject1).length();
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>(paramInt + 32 + i);
          ((StringBuilder)localObject3).append("Unsupported object for column ");
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append(": ");
          ((StringBuilder)localObject3).append((String)localObject1);
          paramBuilder.<init>(((StringBuilder)localObject3).toString());
          throw paramBuilder;
        }
        if (bool)
        {
          i = 0;
        }
        else
        {
          label595:
          if (i != 0) {
            break label699;
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(74);
          ((StringBuilder)localObject2).append("Couldn't populate window data for row ");
          ((StringBuilder)localObject2).append(paramInt);
          ((StringBuilder)localObject2).append(" - allocating new window.");
          Log.d("DataHolder", ((StringBuilder)localObject2).toString());
          ((CursorWindow)localObject1).freeLastRow();
          localObject1 = new android/database/CursorWindow;
          ((CursorWindow)localObject1).<init>(false);
          ((CursorWindow)localObject1).setStartPosition(paramInt);
          ((CursorWindow)localObject1).setNumColumns(Builder.zac(paramBuilder).length);
          localArrayList.add(localObject1);
          paramInt--;
          i = 1;
        }
        paramInt++;
        continue;
        label699:
        paramBuilder = new com/google/android/gms/common/data/zad;
        paramBuilder.<init>("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        throw paramBuilder;
      }
      catch (RuntimeException paramBuilder)
      {
        i = localArrayList.size();
        for (paramInt = k; paramInt < i; paramInt++) {
          ((CursorWindow)localArrayList.get(paramInt)).close();
        }
        throw paramBuilder;
      }
    }
    return (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
  }
  
  public void close()
  {
    try
    {
      if (!this.zae)
      {
        this.zae = true;
        for (int i = 0;; i++)
        {
          CursorWindow[] arrayOfCursorWindow = this.zah;
          if (i >= arrayOfCursorWindow.length) {
            break;
          }
          arrayOfCursorWindow[i].close();
        }
      }
      return;
    }
    finally {}
  }
  
  protected final void finalize()
    throws Throwable
  {
    try
    {
      if ((this.zak) && (this.zah.length > 0) && (!isClosed()))
      {
        close();
        String str = toString();
        int i = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 178);
        localStringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
        localStringBuilder.append(str);
        localStringBuilder.append(")");
        Log.e("DataBuffer", localStringBuilder.toString());
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public boolean getBoolean(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return Long.valueOf(this.zah[paramInt2].getLong(paramInt1, this.zab.getInt(paramString))).longValue() == 1L;
  }
  
  public byte[] getByteArray(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].getBlob(paramInt1, this.zab.getInt(paramString));
  }
  
  public int getCount()
  {
    return this.zad;
  }
  
  public int getInteger(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].getInt(paramInt1, this.zab.getInt(paramString));
  }
  
  public long getLong(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].getLong(paramInt1, this.zab.getInt(paramString));
  }
  
  public Bundle getMetadata()
  {
    return this.zaj;
  }
  
  public int getStatusCode()
  {
    return this.zai;
  }
  
  public String getString(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].getString(paramInt1, this.zab.getInt(paramString));
  }
  
  public int getWindowIndex(int paramInt)
  {
    int j = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.zad)) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    int k;
    int i;
    for (;;)
    {
      int[] arrayOfInt = this.zac;
      k = arrayOfInt.length;
      i = j;
      if (j >= k) {
        break;
      }
      if (paramInt < arrayOfInt[j])
      {
        i = j - 1;
        break;
      }
      j++;
    }
    paramInt = i;
    if (i == k) {
      paramInt = i - 1;
    }
    return paramInt;
  }
  
  public boolean hasColumn(String paramString)
  {
    return this.zab.containsKey(paramString);
  }
  
  public boolean hasNull(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].isNull(paramInt1, this.zab.getInt(paramString));
  }
  
  public boolean isClosed()
  {
    try
    {
      boolean bool = this.zae;
      return bool;
    }
    finally {}
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeStringArray(paramParcel, 1, this.zag, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 2, this.zah, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, getStatusCode());
    SafeParcelWriter.writeBundle(paramParcel, 4, getMetadata(), false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zaa);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    if ((paramInt & 0x1) != 0) {
      close();
    }
  }
  
  public final double zaa(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].getDouble(paramInt1, this.zab.getInt(paramString));
  }
  
  public final float zab(String paramString, int paramInt1, int paramInt2)
  {
    zae(paramString, paramInt1);
    return this.zah[paramInt2].getFloat(paramInt1, this.zab.getInt(paramString));
  }
  
  public final void zac(String paramString, int paramInt1, int paramInt2, CharArrayBuffer paramCharArrayBuffer)
  {
    zae(paramString, paramInt1);
    this.zah[paramInt2].copyStringToBuffer(paramInt1, this.zab.getInt(paramString), paramCharArrayBuffer);
  }
  
  public final void zad()
  {
    this.zab = new Bundle();
    int j = 0;
    Object localObject;
    for (int i = 0;; i++)
    {
      localObject = this.zag;
      if (i >= localObject.length) {
        break;
      }
      this.zab.putInt(localObject[i], i);
    }
    this.zac = new int[this.zah.length];
    i = 0;
    for (;;)
    {
      localObject = this.zah;
      if (j >= localObject.length) {
        break;
      }
      this.zac[j] = i;
      int k = localObject[j].getStartPosition();
      i += this.zah[j].getNumRows() - (i - k);
      j++;
    }
    this.zad = i;
  }
  
  public static class Builder
  {
    private final String[] zaa;
    private final ArrayList<HashMap<String, Object>> zab;
    private final HashMap<Object, Integer> zac;
    
    public DataHolder build(int paramInt)
    {
      return new DataHolder(this, paramInt, null, null);
    }
    
    public DataHolder build(int paramInt, Bundle paramBundle)
    {
      return new DataHolder(this, paramInt, paramBundle, -1, null);
    }
    
    public Builder withRow(ContentValues paramContentValues)
    {
      Asserts.checkNotNull(paramContentValues);
      HashMap localHashMap = new HashMap(paramContentValues.size());
      paramContentValues = paramContentValues.valueSet().iterator();
      while (paramContentValues.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramContentValues.next();
        localHashMap.put((String)localEntry.getKey(), localEntry.getValue());
      }
      return zaa(localHashMap);
    }
    
    public Builder zaa(HashMap<String, Object> paramHashMap)
    {
      Asserts.checkNotNull(paramHashMap);
      this.zab.add(paramHashMap);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\DataHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */