package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WorkProgressDao_Impl
  implements WorkProgressDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<WorkProgress> __insertionAdapterOfWorkProgress;
  private final SharedSQLiteStatement __preparedStmtOfDelete;
  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
  
  public WorkProgressDao_Impl(RoomDatabase paramRoomDatabase)
  {
    this.__db = paramRoomDatabase;
    this.__insertionAdapterOfWorkProgress = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, WorkProgress paramAnonymousWorkProgress)
      {
        if (paramAnonymousWorkProgress.mWorkSpecId == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, paramAnonymousWorkProgress.mWorkSpecId);
        }
        paramAnonymousWorkProgress = Data.toByteArrayInternal(paramAnonymousWorkProgress.mProgress);
        if (paramAnonymousWorkProgress == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(2);
        } else {
          paramAnonymousSupportSQLiteStatement.bindBlob(2, paramAnonymousWorkProgress);
        }
      }
      
      public String createQuery()
      {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE from WorkProgress where work_spec_id=?";
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE FROM WorkProgress";
      }
    };
  }
  
  public void delete(String paramString)
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfDelete.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    this.__db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
      this.__preparedStmtOfDelete.release(localSupportSQLiteStatement);
    }
  }
  
  public void deleteAll()
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfDeleteAll.acquire();
    this.__db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
      this.__preparedStmtOfDeleteAll.release(localSupportSQLiteStatement);
    }
  }
  
  public Data getProgressForWorkSpecId(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    this.__db.assertNotSuspendingTransaction();
    Object localObject = this.__db;
    paramString = null;
    localObject = DBUtil.query((RoomDatabase)localObject, localRoomSQLiteQuery, false, null);
    try
    {
      if (((Cursor)localObject).moveToFirst()) {
        paramString = Data.fromByteArray(((Cursor)localObject).getBlob(0));
      }
      return paramString;
    }
    finally
    {
      ((Cursor)localObject).close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<Data> getProgressForWorkSpecIds(List<String> paramList)
  {
    Object localObject1 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject1).append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
    int i = paramList.size();
    StringUtil.appendPlaceholders((StringBuilder)localObject1, i);
    ((StringBuilder)localObject1).append(")");
    localObject1 = RoomSQLiteQuery.acquire(((StringBuilder)localObject1).toString(), i + 0);
    Object localObject2 = paramList.iterator();
    for (i = 1; ((Iterator)localObject2).hasNext(); i++)
    {
      paramList = (String)((Iterator)localObject2).next();
      if (paramList == null) {
        ((RoomSQLiteQuery)localObject1).bindNull(i);
      } else {
        ((RoomSQLiteQuery)localObject1).bindString(i, paramList);
      }
    }
    this.__db.assertNotSuspendingTransaction();
    paramList = DBUtil.query(this.__db, (SupportSQLiteQuery)localObject1, false, null);
    try
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(paramList.getCount());
      while (paramList.moveToNext()) {
        ((List)localObject2).add(Data.fromByteArray(paramList.getBlob(0)));
      }
      return (List<Data>)localObject2;
    }
    finally
    {
      paramList.close();
      ((RoomSQLiteQuery)localObject1).release();
    }
  }
  
  public void insert(WorkProgress paramWorkProgress)
  {
    this.__db.assertNotSuspendingTransaction();
    this.__db.beginTransaction();
    try
    {
      this.__insertionAdapterOfWorkProgress.insert(paramWorkProgress);
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkProgressDao_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */