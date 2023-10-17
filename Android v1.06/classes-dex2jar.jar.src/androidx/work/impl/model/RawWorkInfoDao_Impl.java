package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class RawWorkInfoDao_Impl
  implements RawWorkInfoDao
{
  private final RoomDatabase __db;
  
  public RawWorkInfoDao_Impl(RoomDatabase paramRoomDatabase)
  {
    this.__db = paramRoomDatabase;
  }
  
  private void __fetchRelationshipWorkProgressAsandroidxWorkData(ArrayMap<String, ArrayList<Data>> paramArrayMap)
  {
    Object localObject2 = paramArrayMap.keySet();
    if (((Set)localObject2).isEmpty()) {
      return;
    }
    if (paramArrayMap.size() > 999)
    {
      localObject1 = new ArrayMap(999);
      int n = paramArrayMap.size();
      i = 0;
      int j;
      for (;;)
      {
        j = 0;
        int k = i;
        int m;
        do
        {
          if (k >= n) {
            break;
          }
          ((ArrayMap)localObject1).put((String)paramArrayMap.keyAt(k), (ArrayList)paramArrayMap.valueAt(k));
          i = k + 1;
          m = j + 1;
          k = i;
          j = m;
        } while (m != 999);
        __fetchRelationshipWorkProgressAsandroidxWorkData((ArrayMap)localObject1);
        localObject1 = new ArrayMap(999);
      }
      if (j > 0) {
        __fetchRelationshipWorkProgressAsandroidxWorkData((ArrayMap)localObject1);
      }
      return;
    }
    Object localObject1 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject1).append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
    int i = ((Set)localObject2).size();
    StringUtil.appendPlaceholders((StringBuilder)localObject1, i);
    ((StringBuilder)localObject1).append(")");
    localObject1 = RoomSQLiteQuery.acquire(((StringBuilder)localObject1).toString(), i + 0);
    Iterator localIterator = ((Set)localObject2).iterator();
    for (i = 1; localIterator.hasNext(); i++)
    {
      localObject2 = (String)localIterator.next();
      if (localObject2 == null) {
        ((RoomSQLiteQuery)localObject1).bindNull(i);
      } else {
        ((RoomSQLiteQuery)localObject1).bindString(i, (String)localObject2);
      }
    }
    localObject1 = DBUtil.query(this.__db, (SupportSQLiteQuery)localObject1, false, null);
    try
    {
      i = CursorUtil.getColumnIndex((Cursor)localObject1, "work_spec_id");
      if (i == -1) {
        return;
      }
      while (((Cursor)localObject1).moveToNext()) {
        if (!((Cursor)localObject1).isNull(i))
        {
          localObject2 = (ArrayList)paramArrayMap.get(((Cursor)localObject1).getString(i));
          if (localObject2 != null) {
            ((ArrayList)localObject2).add(Data.fromByteArray(((Cursor)localObject1).getBlob(0)));
          }
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  private void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap<String, ArrayList<String>> paramArrayMap)
  {
    Object localObject2 = paramArrayMap.keySet();
    if (((Set)localObject2).isEmpty()) {
      return;
    }
    if (paramArrayMap.size() > 999)
    {
      localObject1 = new ArrayMap(999);
      int n = paramArrayMap.size();
      int j;
      int k;
      for (i = 0;; i = k)
      {
        j = 0;
        int m;
        do
        {
          if (i >= n) {
            break;
          }
          ((ArrayMap)localObject1).put((String)paramArrayMap.keyAt(i), (ArrayList)paramArrayMap.valueAt(i));
          k = i + 1;
          m = j + 1;
          i = k;
          j = m;
        } while (m != 999);
        __fetchRelationshipWorkTagAsjavaLangString((ArrayMap)localObject1);
        localObject1 = new ArrayMap(999);
      }
      if (j > 0) {
        __fetchRelationshipWorkTagAsjavaLangString((ArrayMap)localObject1);
      }
      return;
    }
    Object localObject1 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject1).append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
    int i = ((Set)localObject2).size();
    StringUtil.appendPlaceholders((StringBuilder)localObject1, i);
    ((StringBuilder)localObject1).append(")");
    localObject1 = RoomSQLiteQuery.acquire(((StringBuilder)localObject1).toString(), i + 0);
    localObject2 = ((Set)localObject2).iterator();
    for (i = 1; ((Iterator)localObject2).hasNext(); i++)
    {
      String str = (String)((Iterator)localObject2).next();
      if (str == null) {
        ((RoomSQLiteQuery)localObject1).bindNull(i);
      } else {
        ((RoomSQLiteQuery)localObject1).bindString(i, str);
      }
    }
    localObject1 = DBUtil.query(this.__db, (SupportSQLiteQuery)localObject1, false, null);
    try
    {
      i = CursorUtil.getColumnIndex((Cursor)localObject1, "work_spec_id");
      if (i == -1) {
        return;
      }
      while (((Cursor)localObject1).moveToNext()) {
        if (!((Cursor)localObject1).isNull(i))
        {
          localObject2 = (ArrayList)paramArrayMap.get(((Cursor)localObject1).getString(i));
          if (localObject2 != null) {
            ((ArrayList)localObject2).add(((Cursor)localObject1).getString(0));
          }
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    this.__db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(this.__db, paramSupportSQLiteQuery, true, null);
    try
    {
      int m = CursorUtil.getColumnIndex(localCursor, "id");
      int k = CursorUtil.getColumnIndex(localCursor, "state");
      int j = CursorUtil.getColumnIndex(localCursor, "output");
      int i = CursorUtil.getColumnIndex(localCursor, "run_attempt_count");
      ArrayMap localArrayMap2 = new androidx/collection/ArrayMap;
      localArrayMap2.<init>();
      ArrayMap localArrayMap1 = new androidx/collection/ArrayMap;
      localArrayMap1.<init>();
      Object localObject1;
      while (localCursor.moveToNext())
      {
        if (!localCursor.isNull(m))
        {
          localObject1 = localCursor.getString(m);
          if ((ArrayList)localArrayMap2.get(localObject1) == null)
          {
            paramSupportSQLiteQuery = new java/util/ArrayList;
            paramSupportSQLiteQuery.<init>();
            localArrayMap2.put(localObject1, paramSupportSQLiteQuery);
          }
        }
        if (!localCursor.isNull(m))
        {
          localObject1 = localCursor.getString(m);
          if ((ArrayList)localArrayMap1.get(localObject1) == null)
          {
            paramSupportSQLiteQuery = new java/util/ArrayList;
            paramSupportSQLiteQuery.<init>();
            localArrayMap1.put(localObject1, paramSupportSQLiteQuery);
          }
        }
      }
      localCursor.moveToPosition(-1);
      __fetchRelationshipWorkTagAsjavaLangString(localArrayMap2);
      __fetchRelationshipWorkProgressAsandroidxWorkData(localArrayMap1);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (!localCursor.isNull(m)) {
          paramSupportSQLiteQuery = (ArrayList)localArrayMap2.get(localCursor.getString(m));
        } else {
          paramSupportSQLiteQuery = null;
        }
        localObject1 = paramSupportSQLiteQuery;
        if (paramSupportSQLiteQuery == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
        }
        if (!localCursor.isNull(m)) {
          paramSupportSQLiteQuery = (ArrayList)localArrayMap1.get(localCursor.getString(m));
        } else {
          paramSupportSQLiteQuery = null;
        }
        Object localObject2 = paramSupportSQLiteQuery;
        if (paramSupportSQLiteQuery == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
        }
        paramSupportSQLiteQuery = new androidx/work/impl/model/WorkSpec$WorkInfoPojo;
        paramSupportSQLiteQuery.<init>();
        if (m != -1) {
          paramSupportSQLiteQuery.id = localCursor.getString(m);
        }
        if (k != -1) {
          paramSupportSQLiteQuery.state = WorkTypeConverters.intToState(localCursor.getInt(k));
        }
        if (j != -1) {
          paramSupportSQLiteQuery.output = Data.fromByteArray(localCursor.getBlob(j));
        }
        if (i != -1) {
          paramSupportSQLiteQuery.runAttemptCount = localCursor.getInt(i);
        }
        paramSupportSQLiteQuery.tags = ((List)localObject1);
        paramSupportSQLiteQuery.progress = ((List)localObject2);
        localArrayList.add(paramSupportSQLiteQuery);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    InvalidationTracker localInvalidationTracker = this.__db.getInvalidationTracker();
    paramSupportSQLiteQuery = new Callable()
    {
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        Cursor localCursor = DBUtil.query(RawWorkInfoDao_Impl.this.__db, paramSupportSQLiteQuery, true, null);
        try
        {
          int m = CursorUtil.getColumnIndex(localCursor, "id");
          int i = CursorUtil.getColumnIndex(localCursor, "state");
          int k = CursorUtil.getColumnIndex(localCursor, "output");
          int j = CursorUtil.getColumnIndex(localCursor, "run_attempt_count");
          ArrayMap localArrayMap2 = new androidx/collection/ArrayMap;
          localArrayMap2.<init>();
          ArrayMap localArrayMap1 = new androidx/collection/ArrayMap;
          localArrayMap1.<init>();
          Object localObject3;
          Object localObject1;
          while (localCursor.moveToNext())
          {
            if (!localCursor.isNull(m))
            {
              localObject3 = localCursor.getString(m);
              if ((ArrayList)localArrayMap2.get(localObject3) == null)
              {
                localObject1 = new java/util/ArrayList;
                ((ArrayList)localObject1).<init>();
                localArrayMap2.put(localObject3, localObject1);
              }
            }
            if (!localCursor.isNull(m))
            {
              localObject3 = localCursor.getString(m);
              if ((ArrayList)localArrayMap1.get(localObject3) == null)
              {
                localObject1 = new java/util/ArrayList;
                ((ArrayList)localObject1).<init>();
                localArrayMap1.put(localObject3, localObject1);
              }
            }
          }
          localCursor.moveToPosition(-1);
          RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(localArrayMap2);
          RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(localArrayMap1);
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(localCursor.getCount());
          while (localCursor.moveToNext())
          {
            if (!localCursor.isNull(m)) {
              localObject1 = (ArrayList)localArrayMap2.get(localCursor.getString(m));
            } else {
              localObject1 = null;
            }
            localObject3 = localObject1;
            if (localObject1 == null)
            {
              localObject3 = new java/util/ArrayList;
              ((ArrayList)localObject3).<init>();
            }
            if (!localCursor.isNull(m)) {
              localObject1 = (ArrayList)localArrayMap1.get(localCursor.getString(m));
            } else {
              localObject1 = null;
            }
            Object localObject4 = localObject1;
            if (localObject1 == null)
            {
              localObject4 = new java/util/ArrayList;
              ((ArrayList)localObject4).<init>();
            }
            localObject1 = new androidx/work/impl/model/WorkSpec$WorkInfoPojo;
            ((WorkSpec.WorkInfoPojo)localObject1).<init>();
            if (m != -1) {
              ((WorkSpec.WorkInfoPojo)localObject1).id = localCursor.getString(m);
            }
            if (i != -1) {
              ((WorkSpec.WorkInfoPojo)localObject1).state = WorkTypeConverters.intToState(localCursor.getInt(i));
            }
            if (k != -1) {
              ((WorkSpec.WorkInfoPojo)localObject1).output = Data.fromByteArray(localCursor.getBlob(k));
            }
            if (j != -1) {
              ((WorkSpec.WorkInfoPojo)localObject1).runAttemptCount = localCursor.getInt(j);
            }
            ((WorkSpec.WorkInfoPojo)localObject1).tags = ((List)localObject3);
            ((WorkSpec.WorkInfoPojo)localObject1).progress = ((List)localObject4);
            localArrayList.add(localObject1);
          }
          return localArrayList;
        }
        finally
        {
          localCursor.close();
        }
      }
    };
    return localInvalidationTracker.createLiveData(new String[] { "WorkTag", "WorkProgress", "WorkSpec" }, false, paramSupportSQLiteQuery);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\RawWorkInfoDao_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */