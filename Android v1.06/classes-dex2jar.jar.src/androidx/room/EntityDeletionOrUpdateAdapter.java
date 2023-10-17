package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;

public abstract class EntityDeletionOrUpdateAdapter<T>
  extends SharedSQLiteStatement
{
  public EntityDeletionOrUpdateAdapter(RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  protected abstract void bind(SupportSQLiteStatement paramSupportSQLiteStatement, T paramT);
  
  protected abstract String createQuery();
  
  public final int handle(T paramT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      bind(localSupportSQLiteStatement, paramT);
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      return i;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final int handleMultiple(Iterable<? extends T> paramIterable)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    int i = 0;
    try
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        bind(localSupportSQLiteStatement, paramIterable.next());
        int j = localSupportSQLiteStatement.executeUpdateDelete();
        i += j;
      }
      return i;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
  
  public final int handleMultiple(T[] paramArrayOfT)
  {
    SupportSQLiteStatement localSupportSQLiteStatement = acquire();
    try
    {
      int k = paramArrayOfT.length;
      int i = 0;
      int j = 0;
      while (i < k)
      {
        bind(localSupportSQLiteStatement, paramArrayOfT[i]);
        int m = localSupportSQLiteStatement.executeUpdateDelete();
        j += m;
        i++;
      }
      return j;
    }
    finally
    {
      release(localSupportSQLiteStatement);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\EntityDeletionOrUpdateAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */