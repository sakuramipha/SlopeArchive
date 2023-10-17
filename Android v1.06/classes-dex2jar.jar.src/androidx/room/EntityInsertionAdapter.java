package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class EntityInsertionAdapter<T>
  extends SharedSQLiteStatement
{
  public EntityInsertionAdapter(RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  protected abstract void bind(SupportSQLiteStatement paramSupportSQLiteStatement, T paramT);
  
  public final void insert(Iterable<? extends T> paramIterable)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        bind(localSupportSQLiteStatement, paramIterable.next());
        localSupportSQLiteStatement.executeInsert();
      }
      return;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final void insert(T paramT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      bind(localSupportSQLiteStatement, paramT);
      localSupportSQLiteStatement.executeInsert();
      return;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final void insert(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      int j = paramArrayOfT.length;
      for (int i = 0; i < j; i++)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        localSupportSQLiteStatement.executeInsert();
      }
      return;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final long insertAndReturnId(T paramT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      bind(localSupportSQLiteStatement, paramT);
      long l = localSupportSQLiteStatement.executeInsert();
      return l;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final long[] insertAndReturnIdsArray(Collection<? extends T> paramCollection)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      long[] arrayOfLong = new long[paramCollection.size()];
      int i = 0;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        bind(localSupportSQLiteStatement, paramCollection.next());
        arrayOfLong[i] = localSupportSQLiteStatement.executeInsert();
        i++;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final long[] insertAndReturnIdsArray(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      long[] arrayOfLong = new long[paramArrayOfT.length];
      int k = paramArrayOfT.length;
      int j = 0;
      int i = 0;
      while (j < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[j]);
        arrayOfLong[i] = localSupportSQLiteStatement.executeInsert();
        i++;
        j++;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> paramCollection)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      Long[] arrayOfLong = new Long[paramCollection.size()];
      int i = 0;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        bind(localSupportSQLiteStatement, paramCollection.next());
        arrayOfLong[i] = Long.valueOf(localSupportSQLiteStatement.executeInsert());
        i++;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final Long[] insertAndReturnIdsArrayBox(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      Long[] arrayOfLong = new Long[paramArrayOfT.length];
      int k = paramArrayOfT.length;
      int j = 0;
      int i = 0;
      while (j < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[j]);
        arrayOfLong[i] = Long.valueOf(localSupportSQLiteStatement.executeInsert());
        i++;
        j++;
      }
      return arrayOfLong;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final List<Long> insertAndReturnIdsList(Collection<? extends T> paramCollection)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramCollection.size());
      int i = 0;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        bind(localSupportSQLiteStatement, paramCollection.next());
        localArrayList.add(i, Long.valueOf(localSupportSQLiteStatement.executeInsert()));
        i++;
      }
      return localArrayList;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final List<Long> insertAndReturnIdsList(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramArrayOfT.length);
      int k = paramArrayOfT.length;
      int i = 0;
      int j = 0;
      while (i < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        localArrayList.add(j, Long.valueOf(localSupportSQLiteStatement.executeInsert()));
        j++;
        i++;
      }
      return localArrayList;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\EntityInsertionAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */