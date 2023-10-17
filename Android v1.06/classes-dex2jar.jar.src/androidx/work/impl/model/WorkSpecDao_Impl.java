package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class WorkSpecDao_Impl
  implements WorkSpecDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<WorkSpec> __insertionAdapterOfWorkSpec;
  private final SharedSQLiteStatement __preparedStmtOfDelete;
  private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
  private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
  private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
  private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
  private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
  private final SharedSQLiteStatement __preparedStmtOfSetOutput;
  private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;
  
  public WorkSpecDao_Impl(RoomDatabase paramRoomDatabase)
  {
    this.__db = paramRoomDatabase;
    this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, WorkSpec paramAnonymousWorkSpec)
      {
        if (paramAnonymousWorkSpec.id == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, paramAnonymousWorkSpec.id);
        }
        paramAnonymousSupportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(paramAnonymousWorkSpec.state));
        if (paramAnonymousWorkSpec.workerClassName == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(3);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(3, paramAnonymousWorkSpec.workerClassName);
        }
        if (paramAnonymousWorkSpec.inputMergerClassName == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(4);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(4, paramAnonymousWorkSpec.inputMergerClassName);
        }
        byte[] arrayOfByte = Data.toByteArrayInternal(paramAnonymousWorkSpec.input);
        if (arrayOfByte == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(5);
        } else {
          paramAnonymousSupportSQLiteStatement.bindBlob(5, arrayOfByte);
        }
        arrayOfByte = Data.toByteArrayInternal(paramAnonymousWorkSpec.output);
        if (arrayOfByte == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(6);
        } else {
          paramAnonymousSupportSQLiteStatement.bindBlob(6, arrayOfByte);
        }
        paramAnonymousSupportSQLiteStatement.bindLong(7, paramAnonymousWorkSpec.initialDelay);
        paramAnonymousSupportSQLiteStatement.bindLong(8, paramAnonymousWorkSpec.intervalDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(9, paramAnonymousWorkSpec.flexDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(10, paramAnonymousWorkSpec.runAttemptCount);
        paramAnonymousSupportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(paramAnonymousWorkSpec.backoffPolicy));
        paramAnonymousSupportSQLiteStatement.bindLong(12, paramAnonymousWorkSpec.backoffDelayDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(13, paramAnonymousWorkSpec.periodStartTime);
        paramAnonymousSupportSQLiteStatement.bindLong(14, paramAnonymousWorkSpec.minimumRetentionDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(15, paramAnonymousWorkSpec.scheduleRequestedAt);
        paramAnonymousSupportSQLiteStatement.bindLong(16, paramAnonymousWorkSpec.expedited);
        paramAnonymousSupportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(paramAnonymousWorkSpec.outOfQuotaPolicy));
        paramAnonymousWorkSpec = paramAnonymousWorkSpec.constraints;
        if (paramAnonymousWorkSpec != null)
        {
          paramAnonymousSupportSQLiteStatement.bindLong(18, WorkTypeConverters.networkTypeToInt(paramAnonymousWorkSpec.getRequiredNetworkType()));
          paramAnonymousSupportSQLiteStatement.bindLong(19, paramAnonymousWorkSpec.requiresCharging());
          paramAnonymousSupportSQLiteStatement.bindLong(20, paramAnonymousWorkSpec.requiresDeviceIdle());
          paramAnonymousSupportSQLiteStatement.bindLong(21, paramAnonymousWorkSpec.requiresBatteryNotLow());
          paramAnonymousSupportSQLiteStatement.bindLong(22, paramAnonymousWorkSpec.requiresStorageNotLow());
          paramAnonymousSupportSQLiteStatement.bindLong(23, paramAnonymousWorkSpec.getTriggerContentUpdateDelay());
          paramAnonymousSupportSQLiteStatement.bindLong(24, paramAnonymousWorkSpec.getTriggerMaxContentDelay());
          paramAnonymousWorkSpec = WorkTypeConverters.contentUriTriggersToByteArray(paramAnonymousWorkSpec.getContentUriTriggers());
          if (paramAnonymousWorkSpec == null) {
            paramAnonymousSupportSQLiteStatement.bindNull(25);
          } else {
            paramAnonymousSupportSQLiteStatement.bindBlob(25, paramAnonymousWorkSpec);
          }
        }
        else
        {
          paramAnonymousSupportSQLiteStatement.bindNull(18);
          paramAnonymousSupportSQLiteStatement.bindNull(19);
          paramAnonymousSupportSQLiteStatement.bindNull(20);
          paramAnonymousSupportSQLiteStatement.bindNull(21);
          paramAnonymousSupportSQLiteStatement.bindNull(22);
          paramAnonymousSupportSQLiteStatement.bindNull(23);
          paramAnonymousSupportSQLiteStatement.bindNull(24);
          paramAnonymousSupportSQLiteStatement.bindNull(25);
        }
      }
      
      public String createQuery()
      {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE FROM workspec WHERE id=?";
      }
    };
    this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET output=? WHERE id=?";
      }
    };
    this.__preparedStmtOfSetPeriodStartTime = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
      }
    };
    this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
      }
    };
    this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
      }
    };
    this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
      }
    };
    this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
      }
    };
    this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
      }
    };
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
  
  /* Error */
  public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 272
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 29
    //   9: aload 29
    //   11: iconst_1
    //   12: iload_1
    //   13: i2l
    //   14: invokevirtual 276	androidx/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   17: aload_0
    //   18: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   21: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   24: aload_0
    //   25: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   28: aload 29
    //   30: iconst_0
    //   31: aconst_null
    //   32: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   35: astore 28
    //   37: aload 28
    //   39: ldc_w 278
    //   42: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   45: istore 16
    //   47: aload 28
    //   49: ldc_w 283
    //   52: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   55: istore 17
    //   57: aload 28
    //   59: ldc_w 285
    //   62: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   65: istore 8
    //   67: aload 28
    //   69: ldc_w 287
    //   72: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   75: istore 7
    //   77: aload 28
    //   79: ldc_w 289
    //   82: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 24
    //   87: aload 28
    //   89: ldc_w 291
    //   92: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   95: istore 25
    //   97: aload 28
    //   99: ldc_w 293
    //   102: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   105: istore 21
    //   107: aload 28
    //   109: ldc_w 295
    //   112: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   115: istore 22
    //   117: aload 28
    //   119: ldc_w 297
    //   122: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   125: istore 11
    //   127: aload 28
    //   129: ldc_w 299
    //   132: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   135: istore 23
    //   137: aload 28
    //   139: ldc_w 301
    //   142: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   145: istore 9
    //   147: aload 28
    //   149: ldc_w 303
    //   152: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   155: istore 19
    //   157: aload 28
    //   159: ldc_w 305
    //   162: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   165: istore 20
    //   167: aload 28
    //   169: ldc_w 307
    //   172: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 15
    //   177: aload 28
    //   179: ldc_w 309
    //   182: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   185: istore 13
    //   187: aload 28
    //   189: ldc_w 311
    //   192: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   195: istore 10
    //   197: aload 28
    //   199: ldc_w 313
    //   202: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   205: istore 18
    //   207: aload 28
    //   209: ldc_w 315
    //   212: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   215: istore 6
    //   217: aload 28
    //   219: ldc_w 317
    //   222: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   225: istore_1
    //   226: aload 28
    //   228: ldc_w 319
    //   231: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   234: istore 4
    //   236: aload 28
    //   238: ldc_w 321
    //   241: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   244: istore 14
    //   246: aload 28
    //   248: ldc_w 323
    //   251: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   254: istore_3
    //   255: aload 28
    //   257: ldc_w 325
    //   260: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   263: istore 5
    //   265: aload 28
    //   267: ldc_w 327
    //   270: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   273: istore_2
    //   274: aload 28
    //   276: ldc_w 329
    //   279: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   282: istore 12
    //   284: new 118	java/util/ArrayList
    //   287: astore 30
    //   289: aload 30
    //   291: aload 28
    //   293: invokeinterface 332 1 0
    //   298: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   301: aload 28
    //   303: invokeinterface 197 1 0
    //   308: ifeq +479 -> 787
    //   311: aload 28
    //   313: iload 11
    //   315: invokeinterface 205 2 0
    //   320: astore 33
    //   322: aload 28
    //   324: iload 9
    //   326: invokeinterface 205 2 0
    //   331: astore 31
    //   333: new 335	androidx/work/Constraints
    //   336: astore 27
    //   338: aload 27
    //   340: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   343: aload 27
    //   345: aload 28
    //   347: iload 16
    //   349: invokeinterface 340 2 0
    //   354: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   357: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   360: aload 28
    //   362: iload 17
    //   364: invokeinterface 340 2 0
    //   369: ifeq +9 -> 378
    //   372: iconst_1
    //   373: istore 26
    //   375: goto +6 -> 381
    //   378: iconst_0
    //   379: istore 26
    //   381: aload 27
    //   383: iload 26
    //   385: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   388: aload 28
    //   390: iload 8
    //   392: invokeinterface 340 2 0
    //   397: ifeq +9 -> 406
    //   400: iconst_1
    //   401: istore 26
    //   403: goto +6 -> 409
    //   406: iconst_0
    //   407: istore 26
    //   409: aload 27
    //   411: iload 26
    //   413: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   416: aload 28
    //   418: iload 7
    //   420: invokeinterface 340 2 0
    //   425: ifeq +9 -> 434
    //   428: iconst_1
    //   429: istore 26
    //   431: goto +6 -> 437
    //   434: iconst_0
    //   435: istore 26
    //   437: aload 27
    //   439: iload 26
    //   441: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   444: aload 28
    //   446: iload 24
    //   448: invokeinterface 340 2 0
    //   453: ifeq +9 -> 462
    //   456: iconst_1
    //   457: istore 26
    //   459: goto +6 -> 465
    //   462: iconst_0
    //   463: istore 26
    //   465: aload 27
    //   467: iload 26
    //   469: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   472: aload 27
    //   474: aload 28
    //   476: iload 25
    //   478: invokeinterface 367 2 0
    //   483: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   486: aload 27
    //   488: aload 28
    //   490: iload 21
    //   492: invokeinterface 367 2 0
    //   497: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   500: aload 27
    //   502: aload 28
    //   504: iload 22
    //   506: invokeinterface 213 2 0
    //   511: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   514: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   517: new 384	androidx/work/impl/model/WorkSpec
    //   520: astore 32
    //   522: aload 32
    //   524: aload 33
    //   526: aload 31
    //   528: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   531: aload 32
    //   533: aload 28
    //   535: iload 23
    //   537: invokeinterface 340 2 0
    //   542: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   545: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   548: aload 32
    //   550: aload 28
    //   552: iload 19
    //   554: invokeinterface 205 2 0
    //   559: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   562: aload 32
    //   564: aload 28
    //   566: iload 20
    //   568: invokeinterface 213 2 0
    //   573: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   576: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   579: aload 32
    //   581: aload 28
    //   583: iload 15
    //   585: invokeinterface 213 2 0
    //   590: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   593: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   596: aload 32
    //   598: aload 28
    //   600: iload 13
    //   602: invokeinterface 367 2 0
    //   607: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   610: aload 32
    //   612: aload 28
    //   614: iload 10
    //   616: invokeinterface 367 2 0
    //   621: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   624: aload 32
    //   626: aload 28
    //   628: iload 18
    //   630: invokeinterface 367 2 0
    //   635: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   638: aload 32
    //   640: aload 28
    //   642: iload 6
    //   644: invokeinterface 340 2 0
    //   649: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   652: aload 32
    //   654: aload 28
    //   656: iload_1
    //   657: invokeinterface 340 2 0
    //   662: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   665: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   668: aload 32
    //   670: aload 28
    //   672: iload 4
    //   674: invokeinterface 367 2 0
    //   679: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   682: aload 32
    //   684: aload 28
    //   686: iload 14
    //   688: invokeinterface 367 2 0
    //   693: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   696: aload 32
    //   698: aload 28
    //   700: iload_3
    //   701: invokeinterface 367 2 0
    //   706: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   709: aload 32
    //   711: aload 28
    //   713: iload 5
    //   715: invokeinterface 367 2 0
    //   720: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   723: aload 28
    //   725: iload_2
    //   726: invokeinterface 340 2 0
    //   731: ifeq +9 -> 740
    //   734: iconst_1
    //   735: istore 26
    //   737: goto +6 -> 743
    //   740: iconst_0
    //   741: istore 26
    //   743: aload 32
    //   745: iload 26
    //   747: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   750: aload 32
    //   752: aload 28
    //   754: iload 12
    //   756: invokeinterface 340 2 0
    //   761: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   764: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   767: aload 32
    //   769: aload 27
    //   771: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   774: aload 30
    //   776: aload 32
    //   778: invokeinterface 456 2 0
    //   783: pop
    //   784: goto -483 -> 301
    //   787: aload 28
    //   789: invokeinterface 194 1 0
    //   794: aload 29
    //   796: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   799: aload 30
    //   801: areturn
    //   802: astore 27
    //   804: goto +5 -> 809
    //   807: astore 27
    //   809: aload 28
    //   811: invokeinterface 194 1 0
    //   816: aload 29
    //   818: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   821: aload 27
    //   823: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	824	0	this	WorkSpecDao_Impl
    //   0	824	1	paramInt	int
    //   273	453	2	i	int
    //   254	447	3	j	int
    //   234	439	4	k	int
    //   263	451	5	m	int
    //   215	428	6	n	int
    //   75	344	7	i1	int
    //   65	326	8	i2	int
    //   145	180	9	i3	int
    //   195	420	10	i4	int
    //   125	189	11	i5	int
    //   282	473	12	i6	int
    //   185	416	13	i7	int
    //   244	443	14	i8	int
    //   175	409	15	i9	int
    //   45	303	16	i10	int
    //   55	308	17	i11	int
    //   205	424	18	i12	int
    //   155	398	19	i13	int
    //   165	402	20	i14	int
    //   105	386	21	i15	int
    //   115	390	22	i16	int
    //   135	401	23	i17	int
    //   85	362	24	i18	int
    //   95	382	25	i19	int
    //   373	373	26	bool	boolean
    //   336	434	27	localConstraints	Constraints
    //   802	1	27	localObject1	Object
    //   807	15	27	localObject2	Object
    //   35	775	28	localCursor	Cursor
    //   7	810	29	localRoomSQLiteQuery	RoomSQLiteQuery
    //   287	513	30	localArrayList	ArrayList
    //   331	196	31	str1	String
    //   520	257	32	localWorkSpec	WorkSpec
    //   320	205	33	str2	String
    // Exception table:
    //   from	to	target	type
    //   177	289	802	finally
    //   289	301	802	finally
    //   301	372	802	finally
    //   381	400	802	finally
    //   409	428	802	finally
    //   437	456	802	finally
    //   465	596	802	finally
    //   596	668	802	finally
    //   668	696	802	finally
    //   696	734	802	finally
    //   743	784	802	finally
    //   37	177	807	finally
  }
  
  public List<String> getAllUnfinishedWork()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
    this.__db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getAllWorkSpecIds()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
    this.__db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public LiveData<List<String>> getAllWorkSpecIdsLiveData()
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
    InvalidationTracker localInvalidationTracker = this.__db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<String> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 44	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$10:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_0
        //   22: aconst_null
        //   23: invokestatic 50	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore_1
        //   27: new 52	java/util/ArrayList
        //   30: astore_2
        //   31: aload_2
        //   32: aload_1
        //   33: invokeinterface 58 1 0
        //   38: invokespecial 61	java/util/ArrayList:<init>	(I)V
        //   41: aload_1
        //   42: invokeinterface 65 1 0
        //   47: ifeq +20 -> 67
        //   50: aload_2
        //   51: aload_1
        //   52: iconst_0
        //   53: invokeinterface 69 2 0
        //   58: invokeinterface 75 2 0
        //   63: pop
        //   64: goto -23 -> 41
        //   67: aload_0
        //   68: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   71: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   74: invokevirtual 78	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   77: aload_1
        //   78: invokeinterface 81 1 0
        //   83: aload_0
        //   84: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   87: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   90: invokevirtual 84	androidx/room/RoomDatabase:endTransaction	()V
        //   93: aload_2
        //   94: areturn
        //   95: astore_2
        //   96: aload_1
        //   97: invokeinterface 81 1 0
        //   102: aload_2
        //   103: athrow
        //   104: astore_1
        //   105: aload_0
        //   106: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   109: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   112: invokevirtual 84	androidx/room/RoomDatabase:endTransaction	()V
        //   115: aload_1
        //   116: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	117	0	this	10
        //   26	71	1	localCursor	Cursor
        //   104	12	1	localObject1	Object
        //   30	64	2	localArrayList	ArrayList
        //   95	8	2	localObject2	Object
        // Exception table:
        //   from	to	target	type
        //   27	41	95	finally
        //   41	64	95	finally
        //   67	77	95	finally
        //   10	27	104	finally
        //   77	83	104	finally
        //   96	104	104	finally
      }
      
      protected void finalize()
      {
        localObject.release();
      }
    };
    return localInvalidationTracker.createLiveData(new String[] { "workspec" }, true, (Callable)localObject);
  }
  
  /* Error */
  public List<WorkSpec> getEligibleWorkForScheduling(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 487
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 28
    //   9: aload 28
    //   11: iconst_1
    //   12: iload_1
    //   13: i2l
    //   14: invokevirtual 276	androidx/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   17: aload_0
    //   18: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   21: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   24: aload_0
    //   25: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   28: aload 28
    //   30: iconst_0
    //   31: aconst_null
    //   32: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   35: astore 29
    //   37: aload 29
    //   39: ldc_w 278
    //   42: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   45: istore 15
    //   47: aload 29
    //   49: ldc_w 283
    //   52: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   55: istore 19
    //   57: aload 29
    //   59: ldc_w 285
    //   62: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   65: istore 9
    //   67: aload 29
    //   69: ldc_w 287
    //   72: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   75: istore 7
    //   77: aload 29
    //   79: ldc_w 289
    //   82: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 25
    //   87: aload 29
    //   89: ldc_w 291
    //   92: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   95: istore 20
    //   97: aload 29
    //   99: ldc_w 293
    //   102: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   105: istore 23
    //   107: aload 29
    //   109: ldc_w 295
    //   112: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   115: istore 24
    //   117: aload 29
    //   119: ldc_w 297
    //   122: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   125: istore 13
    //   127: aload 29
    //   129: ldc_w 299
    //   132: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   135: istore 22
    //   137: aload 29
    //   139: ldc_w 301
    //   142: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   145: istore 8
    //   147: aload 29
    //   149: ldc_w 303
    //   152: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   155: istore 17
    //   157: aload 29
    //   159: ldc_w 305
    //   162: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   165: istore 21
    //   167: aload 29
    //   169: ldc_w 307
    //   172: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 18
    //   177: aload 29
    //   179: ldc_w 309
    //   182: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   185: istore 11
    //   187: aload 29
    //   189: ldc_w 311
    //   192: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   195: istore 10
    //   197: aload 29
    //   199: ldc_w 313
    //   202: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   205: istore 16
    //   207: aload 29
    //   209: ldc_w 315
    //   212: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   215: istore 6
    //   217: aload 29
    //   219: ldc_w 317
    //   222: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   225: istore_1
    //   226: aload 29
    //   228: ldc_w 319
    //   231: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   234: istore 4
    //   236: aload 29
    //   238: ldc_w 321
    //   241: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   244: istore 14
    //   246: aload 29
    //   248: ldc_w 323
    //   251: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   254: istore_3
    //   255: aload 29
    //   257: ldc_w 325
    //   260: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   263: istore 5
    //   265: aload 29
    //   267: ldc_w 327
    //   270: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   273: istore_2
    //   274: aload 29
    //   276: ldc_w 329
    //   279: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   282: istore 12
    //   284: new 118	java/util/ArrayList
    //   287: astore 30
    //   289: aload 30
    //   291: aload 29
    //   293: invokeinterface 332 1 0
    //   298: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   301: aload 29
    //   303: invokeinterface 197 1 0
    //   308: ifeq +479 -> 787
    //   311: aload 29
    //   313: iload 13
    //   315: invokeinterface 205 2 0
    //   320: astore 32
    //   322: aload 29
    //   324: iload 8
    //   326: invokeinterface 205 2 0
    //   331: astore 33
    //   333: new 335	androidx/work/Constraints
    //   336: astore 27
    //   338: aload 27
    //   340: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   343: aload 27
    //   345: aload 29
    //   347: iload 15
    //   349: invokeinterface 340 2 0
    //   354: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   357: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   360: aload 29
    //   362: iload 19
    //   364: invokeinterface 340 2 0
    //   369: ifeq +9 -> 378
    //   372: iconst_1
    //   373: istore 26
    //   375: goto +6 -> 381
    //   378: iconst_0
    //   379: istore 26
    //   381: aload 27
    //   383: iload 26
    //   385: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   388: aload 29
    //   390: iload 9
    //   392: invokeinterface 340 2 0
    //   397: ifeq +9 -> 406
    //   400: iconst_1
    //   401: istore 26
    //   403: goto +6 -> 409
    //   406: iconst_0
    //   407: istore 26
    //   409: aload 27
    //   411: iload 26
    //   413: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   416: aload 29
    //   418: iload 7
    //   420: invokeinterface 340 2 0
    //   425: ifeq +9 -> 434
    //   428: iconst_1
    //   429: istore 26
    //   431: goto +6 -> 437
    //   434: iconst_0
    //   435: istore 26
    //   437: aload 27
    //   439: iload 26
    //   441: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   444: aload 29
    //   446: iload 25
    //   448: invokeinterface 340 2 0
    //   453: ifeq +9 -> 462
    //   456: iconst_1
    //   457: istore 26
    //   459: goto +6 -> 465
    //   462: iconst_0
    //   463: istore 26
    //   465: aload 27
    //   467: iload 26
    //   469: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   472: aload 27
    //   474: aload 29
    //   476: iload 20
    //   478: invokeinterface 367 2 0
    //   483: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   486: aload 27
    //   488: aload 29
    //   490: iload 23
    //   492: invokeinterface 367 2 0
    //   497: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   500: aload 27
    //   502: aload 29
    //   504: iload 24
    //   506: invokeinterface 213 2 0
    //   511: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   514: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   517: new 384	androidx/work/impl/model/WorkSpec
    //   520: astore 31
    //   522: aload 31
    //   524: aload 32
    //   526: aload 33
    //   528: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   531: aload 31
    //   533: aload 29
    //   535: iload 22
    //   537: invokeinterface 340 2 0
    //   542: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   545: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   548: aload 31
    //   550: aload 29
    //   552: iload 17
    //   554: invokeinterface 205 2 0
    //   559: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   562: aload 31
    //   564: aload 29
    //   566: iload 21
    //   568: invokeinterface 213 2 0
    //   573: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   576: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   579: aload 31
    //   581: aload 29
    //   583: iload 18
    //   585: invokeinterface 213 2 0
    //   590: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   593: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   596: aload 31
    //   598: aload 29
    //   600: iload 11
    //   602: invokeinterface 367 2 0
    //   607: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   610: aload 31
    //   612: aload 29
    //   614: iload 10
    //   616: invokeinterface 367 2 0
    //   621: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   624: aload 31
    //   626: aload 29
    //   628: iload 16
    //   630: invokeinterface 367 2 0
    //   635: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   638: aload 31
    //   640: aload 29
    //   642: iload 6
    //   644: invokeinterface 340 2 0
    //   649: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   652: aload 31
    //   654: aload 29
    //   656: iload_1
    //   657: invokeinterface 340 2 0
    //   662: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   665: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   668: aload 31
    //   670: aload 29
    //   672: iload 4
    //   674: invokeinterface 367 2 0
    //   679: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   682: aload 31
    //   684: aload 29
    //   686: iload 14
    //   688: invokeinterface 367 2 0
    //   693: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   696: aload 31
    //   698: aload 29
    //   700: iload_3
    //   701: invokeinterface 367 2 0
    //   706: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   709: aload 31
    //   711: aload 29
    //   713: iload 5
    //   715: invokeinterface 367 2 0
    //   720: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   723: aload 29
    //   725: iload_2
    //   726: invokeinterface 340 2 0
    //   731: ifeq +9 -> 740
    //   734: iconst_1
    //   735: istore 26
    //   737: goto +6 -> 743
    //   740: iconst_0
    //   741: istore 26
    //   743: aload 31
    //   745: iload 26
    //   747: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   750: aload 31
    //   752: aload 29
    //   754: iload 12
    //   756: invokeinterface 340 2 0
    //   761: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   764: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   767: aload 31
    //   769: aload 27
    //   771: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   774: aload 30
    //   776: aload 31
    //   778: invokeinterface 456 2 0
    //   783: pop
    //   784: goto -483 -> 301
    //   787: aload 29
    //   789: invokeinterface 194 1 0
    //   794: aload 28
    //   796: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   799: aload 30
    //   801: areturn
    //   802: astore 27
    //   804: goto +5 -> 809
    //   807: astore 27
    //   809: aload 29
    //   811: invokeinterface 194 1 0
    //   816: aload 28
    //   818: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   821: aload 27
    //   823: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	824	0	this	WorkSpecDao_Impl
    //   0	824	1	paramInt	int
    //   273	453	2	i	int
    //   254	447	3	j	int
    //   234	439	4	k	int
    //   263	451	5	m	int
    //   215	428	6	n	int
    //   75	344	7	i1	int
    //   145	180	8	i2	int
    //   65	326	9	i3	int
    //   195	420	10	i4	int
    //   185	416	11	i5	int
    //   282	473	12	i6	int
    //   125	189	13	i7	int
    //   244	443	14	i8	int
    //   45	303	15	i9	int
    //   205	424	16	i10	int
    //   155	398	17	i11	int
    //   175	409	18	i12	int
    //   55	308	19	i13	int
    //   95	382	20	i14	int
    //   165	402	21	i15	int
    //   135	401	22	i16	int
    //   105	386	23	i17	int
    //   115	390	24	i18	int
    //   85	362	25	i19	int
    //   373	373	26	bool	boolean
    //   336	434	27	localConstraints	Constraints
    //   802	1	27	localObject1	Object
    //   807	15	27	localObject2	Object
    //   7	810	28	localRoomSQLiteQuery	RoomSQLiteQuery
    //   35	775	29	localCursor	Cursor
    //   287	513	30	localArrayList	ArrayList
    //   520	257	31	localWorkSpec	WorkSpec
    //   320	205	32	str1	String
    //   331	196	33	str2	String
    // Exception table:
    //   from	to	target	type
    //   177	289	802	finally
    //   289	301	802	finally
    //   301	372	802	finally
    //   381	400	802	finally
    //   409	428	802	finally
    //   437	456	802	finally
    //   465	596	802	finally
    //   596	668	802	finally
    //   668	696	802	finally
    //   696	734	802	finally
    //   743	784	802	finally
    //   37	177	807	finally
  }
  
  public List<Data> getInputsFromPrerequisites(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    this.__db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(Data.fromByteArray(paramString.getBlob(0)));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  /* Error */
  public List<WorkSpec> getRecentlyCompletedWork(long paramLong)
  {
    // Byte code:
    //   0: ldc_w 497
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 31
    //   9: aload 31
    //   11: iconst_1
    //   12: lload_1
    //   13: invokevirtual 276	androidx/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   16: aload_0
    //   17: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   20: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   23: aload_0
    //   24: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   27: aload 31
    //   29: iconst_0
    //   30: aconst_null
    //   31: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   34: astore 30
    //   36: aload 30
    //   38: ldc_w 278
    //   41: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   44: istore 18
    //   46: aload 30
    //   48: ldc_w 283
    //   51: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   54: istore 21
    //   56: aload 30
    //   58: ldc_w 285
    //   61: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   64: istore 13
    //   66: aload 30
    //   68: ldc_w 287
    //   71: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   74: istore 10
    //   76: aload 30
    //   78: ldc_w 289
    //   81: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   84: istore 25
    //   86: aload 30
    //   88: ldc_w 291
    //   91: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 26
    //   96: aload 30
    //   98: ldc_w 293
    //   101: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   104: istore 22
    //   106: aload 30
    //   108: ldc_w 295
    //   111: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   114: istore 23
    //   116: aload 30
    //   118: ldc_w 297
    //   121: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   124: istore 15
    //   126: aload 30
    //   128: ldc_w 299
    //   131: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   134: istore 24
    //   136: aload 30
    //   138: ldc_w 301
    //   141: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   144: istore 12
    //   146: aload 30
    //   148: ldc_w 303
    //   151: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   154: istore 19
    //   156: aload 30
    //   158: ldc_w 305
    //   161: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   164: istore 27
    //   166: aload 30
    //   168: ldc_w 307
    //   171: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   174: istore 17
    //   176: aload 30
    //   178: ldc_w 309
    //   181: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 8
    //   186: aload 30
    //   188: ldc_w 311
    //   191: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   194: istore 14
    //   196: aload 30
    //   198: ldc_w 313
    //   201: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   204: istore 20
    //   206: aload 30
    //   208: ldc_w 315
    //   211: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   214: istore 9
    //   216: aload 30
    //   218: ldc_w 317
    //   221: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   224: istore 4
    //   226: aload 30
    //   228: ldc_w 319
    //   231: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   234: istore 6
    //   236: aload 30
    //   238: ldc_w 321
    //   241: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   244: istore 16
    //   246: aload 30
    //   248: ldc_w 323
    //   251: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   254: istore 5
    //   256: aload 30
    //   258: ldc_w 325
    //   261: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   264: istore 7
    //   266: aload 30
    //   268: ldc_w 327
    //   271: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore_3
    //   275: aload 30
    //   277: ldc_w 329
    //   280: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   283: istore 11
    //   285: new 118	java/util/ArrayList
    //   288: astore 29
    //   290: aload 29
    //   292: aload 30
    //   294: invokeinterface 332 1 0
    //   299: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   302: aload 30
    //   304: invokeinterface 197 1 0
    //   309: ifeq +481 -> 790
    //   312: aload 30
    //   314: iload 15
    //   316: invokeinterface 205 2 0
    //   321: astore 35
    //   323: aload 30
    //   325: iload 12
    //   327: invokeinterface 205 2 0
    //   332: astore 33
    //   334: new 335	androidx/work/Constraints
    //   337: astore 32
    //   339: aload 32
    //   341: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   344: aload 32
    //   346: aload 30
    //   348: iload 18
    //   350: invokeinterface 340 2 0
    //   355: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   358: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   361: aload 30
    //   363: iload 21
    //   365: invokeinterface 340 2 0
    //   370: ifeq +9 -> 379
    //   373: iconst_1
    //   374: istore 28
    //   376: goto +6 -> 382
    //   379: iconst_0
    //   380: istore 28
    //   382: aload 32
    //   384: iload 28
    //   386: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   389: aload 30
    //   391: iload 13
    //   393: invokeinterface 340 2 0
    //   398: ifeq +9 -> 407
    //   401: iconst_1
    //   402: istore 28
    //   404: goto +6 -> 410
    //   407: iconst_0
    //   408: istore 28
    //   410: aload 32
    //   412: iload 28
    //   414: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   417: aload 30
    //   419: iload 10
    //   421: invokeinterface 340 2 0
    //   426: ifeq +9 -> 435
    //   429: iconst_1
    //   430: istore 28
    //   432: goto +6 -> 438
    //   435: iconst_0
    //   436: istore 28
    //   438: aload 32
    //   440: iload 28
    //   442: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   445: aload 30
    //   447: iload 25
    //   449: invokeinterface 340 2 0
    //   454: ifeq +9 -> 463
    //   457: iconst_1
    //   458: istore 28
    //   460: goto +6 -> 466
    //   463: iconst_0
    //   464: istore 28
    //   466: aload 32
    //   468: iload 28
    //   470: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   473: aload 32
    //   475: aload 30
    //   477: iload 26
    //   479: invokeinterface 367 2 0
    //   484: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   487: aload 32
    //   489: aload 30
    //   491: iload 22
    //   493: invokeinterface 367 2 0
    //   498: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   501: aload 32
    //   503: aload 30
    //   505: iload 23
    //   507: invokeinterface 213 2 0
    //   512: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   515: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   518: new 384	androidx/work/impl/model/WorkSpec
    //   521: astore 34
    //   523: aload 34
    //   525: aload 35
    //   527: aload 33
    //   529: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   532: aload 34
    //   534: aload 30
    //   536: iload 24
    //   538: invokeinterface 340 2 0
    //   543: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   546: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   549: aload 34
    //   551: aload 30
    //   553: iload 19
    //   555: invokeinterface 205 2 0
    //   560: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   563: aload 34
    //   565: aload 30
    //   567: iload 27
    //   569: invokeinterface 213 2 0
    //   574: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   577: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   580: aload 34
    //   582: aload 30
    //   584: iload 17
    //   586: invokeinterface 213 2 0
    //   591: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   594: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   597: aload 34
    //   599: aload 30
    //   601: iload 8
    //   603: invokeinterface 367 2 0
    //   608: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   611: aload 34
    //   613: aload 30
    //   615: iload 14
    //   617: invokeinterface 367 2 0
    //   622: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   625: aload 34
    //   627: aload 30
    //   629: iload 20
    //   631: invokeinterface 367 2 0
    //   636: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   639: aload 34
    //   641: aload 30
    //   643: iload 9
    //   645: invokeinterface 340 2 0
    //   650: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   653: aload 34
    //   655: aload 30
    //   657: iload 4
    //   659: invokeinterface 340 2 0
    //   664: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   667: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   670: aload 34
    //   672: aload 30
    //   674: iload 6
    //   676: invokeinterface 367 2 0
    //   681: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   684: aload 34
    //   686: aload 30
    //   688: iload 16
    //   690: invokeinterface 367 2 0
    //   695: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   698: aload 34
    //   700: aload 30
    //   702: iload 5
    //   704: invokeinterface 367 2 0
    //   709: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   712: aload 34
    //   714: aload 30
    //   716: iload 7
    //   718: invokeinterface 367 2 0
    //   723: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   726: aload 30
    //   728: iload_3
    //   729: invokeinterface 340 2 0
    //   734: ifeq +9 -> 743
    //   737: iconst_1
    //   738: istore 28
    //   740: goto +6 -> 746
    //   743: iconst_0
    //   744: istore 28
    //   746: aload 34
    //   748: iload 28
    //   750: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   753: aload 34
    //   755: aload 30
    //   757: iload 11
    //   759: invokeinterface 340 2 0
    //   764: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   767: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   770: aload 34
    //   772: aload 32
    //   774: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   777: aload 29
    //   779: aload 34
    //   781: invokeinterface 456 2 0
    //   786: pop
    //   787: goto -485 -> 302
    //   790: aload 30
    //   792: invokeinterface 194 1 0
    //   797: aload 31
    //   799: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   802: aload 29
    //   804: areturn
    //   805: astore 29
    //   807: goto +5 -> 812
    //   810: astore 29
    //   812: aload 30
    //   814: invokeinterface 194 1 0
    //   819: aload 31
    //   821: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   824: aload 29
    //   826: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	827	0	this	WorkSpecDao_Impl
    //   0	827	1	paramLong	long
    //   274	455	3	i	int
    //   224	434	4	j	int
    //   254	449	5	k	int
    //   234	441	6	m	int
    //   264	453	7	n	int
    //   184	418	8	i1	int
    //   214	430	9	i2	int
    //   74	346	10	i3	int
    //   283	475	11	i4	int
    //   144	182	12	i5	int
    //   64	328	13	i6	int
    //   194	422	14	i7	int
    //   124	191	15	i8	int
    //   244	445	16	i9	int
    //   174	411	17	i10	int
    //   44	305	18	i11	int
    //   154	400	19	i12	int
    //   204	426	20	i13	int
    //   54	310	21	i14	int
    //   104	388	22	i15	int
    //   114	392	23	i16	int
    //   134	403	24	i17	int
    //   84	364	25	i18	int
    //   94	384	26	i19	int
    //   164	404	27	i20	int
    //   374	375	28	bool	boolean
    //   288	515	29	localArrayList	ArrayList
    //   805	1	29	localObject1	Object
    //   810	15	29	localObject2	Object
    //   34	779	30	localCursor	Cursor
    //   7	813	31	localRoomSQLiteQuery	RoomSQLiteQuery
    //   337	436	32	localConstraints	Constraints
    //   332	196	33	str1	String
    //   521	259	34	localWorkSpec	WorkSpec
    //   321	205	35	str2	String
    // Exception table:
    //   from	to	target	type
    //   176	290	805	finally
    //   290	302	805	finally
    //   302	373	805	finally
    //   382	401	805	finally
    //   410	429	805	finally
    //   438	457	805	finally
    //   466	597	805	finally
    //   597	670	805	finally
    //   670	698	805	finally
    //   698	737	805	finally
    //   746	787	805	finally
    //   36	176	810	finally
  }
  
  /* Error */
  public List<WorkSpec> getRunningWork()
  {
    // Byte code:
    //   0: ldc_w 501
    //   3: iconst_0
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 29
    //   9: aload_0
    //   10: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   13: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   16: aload_0
    //   17: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   20: aload 29
    //   22: iconst_0
    //   23: aconst_null
    //   24: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   27: astore 28
    //   29: aload 28
    //   31: ldc_w 278
    //   34: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   37: istore 15
    //   39: aload 28
    //   41: ldc_w 283
    //   44: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   47: istore 16
    //   49: aload 28
    //   51: ldc_w 285
    //   54: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   57: istore 9
    //   59: aload 28
    //   61: ldc_w 287
    //   64: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload 28
    //   71: ldc_w 289
    //   74: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 22
    //   79: aload 28
    //   81: ldc_w 291
    //   84: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   87: istore 21
    //   89: aload 28
    //   91: ldc_w 293
    //   94: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   97: istore 24
    //   99: aload 28
    //   101: ldc_w 295
    //   104: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   107: istore 25
    //   109: aload 28
    //   111: ldc_w 297
    //   114: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   117: istore 13
    //   119: aload 28
    //   121: ldc_w 299
    //   124: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   127: istore 20
    //   129: aload 28
    //   131: ldc_w 301
    //   134: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   137: istore 10
    //   139: aload 28
    //   141: ldc_w 303
    //   144: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   147: istore 23
    //   149: aload 28
    //   151: ldc_w 305
    //   154: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 18
    //   159: aload 28
    //   161: ldc_w 307
    //   164: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   167: istore 19
    //   169: aload 28
    //   171: ldc_w 309
    //   174: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   177: istore 12
    //   179: aload 28
    //   181: ldc_w 311
    //   184: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   187: istore 8
    //   189: aload 28
    //   191: ldc_w 313
    //   194: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   197: istore 17
    //   199: aload 28
    //   201: ldc_w 315
    //   204: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   207: istore 6
    //   209: aload 28
    //   211: ldc_w 317
    //   214: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   217: istore_2
    //   218: aload 28
    //   220: ldc_w 319
    //   223: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   226: istore 4
    //   228: aload 28
    //   230: ldc_w 321
    //   233: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   236: istore 14
    //   238: aload 28
    //   240: ldc_w 323
    //   243: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   246: istore_3
    //   247: aload 28
    //   249: ldc_w 325
    //   252: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   255: istore 5
    //   257: aload 28
    //   259: ldc_w 327
    //   262: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore_1
    //   266: aload 28
    //   268: ldc_w 329
    //   271: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore 11
    //   276: new 118	java/util/ArrayList
    //   279: astore 30
    //   281: aload 30
    //   283: aload 28
    //   285: invokeinterface 332 1 0
    //   290: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   293: aload 28
    //   295: invokeinterface 197 1 0
    //   300: ifeq +479 -> 779
    //   303: aload 28
    //   305: iload 13
    //   307: invokeinterface 205 2 0
    //   312: astore 32
    //   314: aload 28
    //   316: iload 10
    //   318: invokeinterface 205 2 0
    //   323: astore 33
    //   325: new 335	androidx/work/Constraints
    //   328: astore 27
    //   330: aload 27
    //   332: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   335: aload 27
    //   337: aload 28
    //   339: iload 15
    //   341: invokeinterface 340 2 0
    //   346: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   349: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   352: aload 28
    //   354: iload 16
    //   356: invokeinterface 340 2 0
    //   361: ifeq +9 -> 370
    //   364: iconst_1
    //   365: istore 26
    //   367: goto +6 -> 373
    //   370: iconst_0
    //   371: istore 26
    //   373: aload 27
    //   375: iload 26
    //   377: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   380: aload 28
    //   382: iload 9
    //   384: invokeinterface 340 2 0
    //   389: ifeq +9 -> 398
    //   392: iconst_1
    //   393: istore 26
    //   395: goto +6 -> 401
    //   398: iconst_0
    //   399: istore 26
    //   401: aload 27
    //   403: iload 26
    //   405: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   408: aload 28
    //   410: iload 7
    //   412: invokeinterface 340 2 0
    //   417: ifeq +9 -> 426
    //   420: iconst_1
    //   421: istore 26
    //   423: goto +6 -> 429
    //   426: iconst_0
    //   427: istore 26
    //   429: aload 27
    //   431: iload 26
    //   433: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   436: aload 28
    //   438: iload 22
    //   440: invokeinterface 340 2 0
    //   445: ifeq +9 -> 454
    //   448: iconst_1
    //   449: istore 26
    //   451: goto +6 -> 457
    //   454: iconst_0
    //   455: istore 26
    //   457: aload 27
    //   459: iload 26
    //   461: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   464: aload 27
    //   466: aload 28
    //   468: iload 21
    //   470: invokeinterface 367 2 0
    //   475: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   478: aload 27
    //   480: aload 28
    //   482: iload 24
    //   484: invokeinterface 367 2 0
    //   489: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   492: aload 27
    //   494: aload 28
    //   496: iload 25
    //   498: invokeinterface 213 2 0
    //   503: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   506: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   509: new 384	androidx/work/impl/model/WorkSpec
    //   512: astore 31
    //   514: aload 31
    //   516: aload 32
    //   518: aload 33
    //   520: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   523: aload 31
    //   525: aload 28
    //   527: iload 20
    //   529: invokeinterface 340 2 0
    //   534: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   537: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   540: aload 31
    //   542: aload 28
    //   544: iload 23
    //   546: invokeinterface 205 2 0
    //   551: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   554: aload 31
    //   556: aload 28
    //   558: iload 18
    //   560: invokeinterface 213 2 0
    //   565: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   568: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   571: aload 31
    //   573: aload 28
    //   575: iload 19
    //   577: invokeinterface 213 2 0
    //   582: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   585: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   588: aload 31
    //   590: aload 28
    //   592: iload 12
    //   594: invokeinterface 367 2 0
    //   599: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   602: aload 31
    //   604: aload 28
    //   606: iload 8
    //   608: invokeinterface 367 2 0
    //   613: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   616: aload 31
    //   618: aload 28
    //   620: iload 17
    //   622: invokeinterface 367 2 0
    //   627: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   630: aload 31
    //   632: aload 28
    //   634: iload 6
    //   636: invokeinterface 340 2 0
    //   641: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   644: aload 31
    //   646: aload 28
    //   648: iload_2
    //   649: invokeinterface 340 2 0
    //   654: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   657: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   660: aload 31
    //   662: aload 28
    //   664: iload 4
    //   666: invokeinterface 367 2 0
    //   671: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   674: aload 31
    //   676: aload 28
    //   678: iload 14
    //   680: invokeinterface 367 2 0
    //   685: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   688: aload 31
    //   690: aload 28
    //   692: iload_3
    //   693: invokeinterface 367 2 0
    //   698: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   701: aload 31
    //   703: aload 28
    //   705: iload 5
    //   707: invokeinterface 367 2 0
    //   712: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   715: aload 28
    //   717: iload_1
    //   718: invokeinterface 340 2 0
    //   723: ifeq +9 -> 732
    //   726: iconst_1
    //   727: istore 26
    //   729: goto +6 -> 735
    //   732: iconst_0
    //   733: istore 26
    //   735: aload 31
    //   737: iload 26
    //   739: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   742: aload 31
    //   744: aload 28
    //   746: iload 11
    //   748: invokeinterface 340 2 0
    //   753: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   756: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   759: aload 31
    //   761: aload 27
    //   763: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   766: aload 30
    //   768: aload 31
    //   770: invokeinterface 456 2 0
    //   775: pop
    //   776: goto -483 -> 293
    //   779: aload 28
    //   781: invokeinterface 194 1 0
    //   786: aload 29
    //   788: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   791: aload 30
    //   793: areturn
    //   794: astore 27
    //   796: goto +5 -> 801
    //   799: astore 27
    //   801: aload 28
    //   803: invokeinterface 194 1 0
    //   808: aload 29
    //   810: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   813: aload 27
    //   815: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	816	0	this	WorkSpecDao_Impl
    //   265	453	1	i	int
    //   217	432	2	j	int
    //   246	447	3	k	int
    //   226	439	4	m	int
    //   255	451	5	n	int
    //   207	428	6	i1	int
    //   67	344	7	i2	int
    //   187	420	8	i3	int
    //   57	326	9	i4	int
    //   137	180	10	i5	int
    //   274	473	11	i6	int
    //   177	416	12	i7	int
    //   117	189	13	i8	int
    //   236	443	14	i9	int
    //   37	303	15	i10	int
    //   47	308	16	i11	int
    //   197	424	17	i12	int
    //   157	402	18	i13	int
    //   167	409	19	i14	int
    //   127	401	20	i15	int
    //   87	382	21	i16	int
    //   77	362	22	i17	int
    //   147	398	23	i18	int
    //   97	386	24	i19	int
    //   107	390	25	i20	int
    //   365	373	26	bool	boolean
    //   328	434	27	localConstraints	Constraints
    //   794	1	27	localObject1	Object
    //   799	15	27	localObject2	Object
    //   27	775	28	localCursor	Cursor
    //   7	802	29	localRoomSQLiteQuery	RoomSQLiteQuery
    //   279	513	30	localArrayList	ArrayList
    //   512	257	31	localWorkSpec	WorkSpec
    //   312	205	32	str1	String
    //   323	196	33	str2	String
    // Exception table:
    //   from	to	target	type
    //   169	281	794	finally
    //   281	293	794	finally
    //   293	364	794	finally
    //   373	392	794	finally
    //   401	420	794	finally
    //   429	448	794	finally
    //   457	588	794	finally
    //   588	660	794	finally
    //   660	688	794	finally
    //   688	726	794	finally
    //   735	776	794	finally
    //   29	169	799	finally
  }
  
  public LiveData<Long> getScheduleRequestedAtLiveData(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = this.__db.getInvalidationTracker();
    localObject = new Callable()
    {
      public Long call()
        throws Exception
      {
        Object localObject1 = WorkSpecDao_Impl.this.__db;
        Object localObject4 = localObject;
        Object localObject3 = null;
        localObject4 = DBUtil.query((RoomDatabase)localObject1, (SupportSQLiteQuery)localObject4, false, null);
        localObject1 = localObject3;
        try
        {
          if (((Cursor)localObject4).moveToFirst()) {
            if (((Cursor)localObject4).isNull(0)) {
              localObject1 = localObject3;
            } else {
              localObject1 = Long.valueOf(((Cursor)localObject4).getLong(0));
            }
          }
          return (Long)localObject1;
        }
        finally
        {
          ((Cursor)localObject4).close();
        }
      }
      
      protected void finalize()
      {
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "workspec" }, false, (Callable)localObject);
  }
  
  /* Error */
  public List<WorkSpec> getScheduledWork()
  {
    // Byte code:
    //   0: ldc_w 510
    //   3: iconst_0
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 28
    //   9: aload_0
    //   10: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   13: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   16: aload_0
    //   17: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   20: aload 28
    //   22: iconst_0
    //   23: aconst_null
    //   24: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   27: astore 29
    //   29: aload 29
    //   31: ldc_w 278
    //   34: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   37: istore 18
    //   39: aload 29
    //   41: ldc_w 283
    //   44: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   47: istore 19
    //   49: aload 29
    //   51: ldc_w 285
    //   54: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   57: istore 10
    //   59: aload 29
    //   61: ldc_w 287
    //   64: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload 29
    //   71: ldc_w 289
    //   74: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 20
    //   79: aload 29
    //   81: ldc_w 291
    //   84: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   87: istore 25
    //   89: aload 29
    //   91: ldc_w 293
    //   94: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   97: istore 24
    //   99: aload 29
    //   101: ldc_w 295
    //   104: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   107: istore 21
    //   109: aload 29
    //   111: ldc_w 297
    //   114: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   117: istore 11
    //   119: aload 29
    //   121: ldc_w 299
    //   124: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   127: istore 23
    //   129: aload 29
    //   131: ldc_w 301
    //   134: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   137: istore 9
    //   139: aload 29
    //   141: ldc_w 303
    //   144: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   147: istore 22
    //   149: aload 29
    //   151: ldc_w 305
    //   154: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 17
    //   159: aload 29
    //   161: ldc_w 307
    //   164: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   167: istore 16
    //   169: aload 29
    //   171: ldc_w 309
    //   174: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   177: istore 13
    //   179: aload 29
    //   181: ldc_w 311
    //   184: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   187: istore 8
    //   189: aload 29
    //   191: ldc_w 313
    //   194: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   197: istore 15
    //   199: aload 29
    //   201: ldc_w 315
    //   204: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   207: istore 6
    //   209: aload 29
    //   211: ldc_w 317
    //   214: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   217: istore_1
    //   218: aload 29
    //   220: ldc_w 319
    //   223: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   226: istore 4
    //   228: aload 29
    //   230: ldc_w 321
    //   233: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   236: istore 14
    //   238: aload 29
    //   240: ldc_w 323
    //   243: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   246: istore_3
    //   247: aload 29
    //   249: ldc_w 325
    //   252: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   255: istore 5
    //   257: aload 29
    //   259: ldc_w 327
    //   262: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore_2
    //   266: aload 29
    //   268: ldc_w 329
    //   271: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore 12
    //   276: new 118	java/util/ArrayList
    //   279: astore 32
    //   281: aload 32
    //   283: aload 29
    //   285: invokeinterface 332 1 0
    //   290: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   293: aload 29
    //   295: invokeinterface 197 1 0
    //   300: ifeq +479 -> 779
    //   303: aload 29
    //   305: iload 11
    //   307: invokeinterface 205 2 0
    //   312: astore 30
    //   314: aload 29
    //   316: iload 9
    //   318: invokeinterface 205 2 0
    //   323: astore 33
    //   325: new 335	androidx/work/Constraints
    //   328: astore 27
    //   330: aload 27
    //   332: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   335: aload 27
    //   337: aload 29
    //   339: iload 18
    //   341: invokeinterface 340 2 0
    //   346: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   349: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   352: aload 29
    //   354: iload 19
    //   356: invokeinterface 340 2 0
    //   361: ifeq +9 -> 370
    //   364: iconst_1
    //   365: istore 26
    //   367: goto +6 -> 373
    //   370: iconst_0
    //   371: istore 26
    //   373: aload 27
    //   375: iload 26
    //   377: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   380: aload 29
    //   382: iload 10
    //   384: invokeinterface 340 2 0
    //   389: ifeq +9 -> 398
    //   392: iconst_1
    //   393: istore 26
    //   395: goto +6 -> 401
    //   398: iconst_0
    //   399: istore 26
    //   401: aload 27
    //   403: iload 26
    //   405: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   408: aload 29
    //   410: iload 7
    //   412: invokeinterface 340 2 0
    //   417: ifeq +9 -> 426
    //   420: iconst_1
    //   421: istore 26
    //   423: goto +6 -> 429
    //   426: iconst_0
    //   427: istore 26
    //   429: aload 27
    //   431: iload 26
    //   433: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   436: aload 29
    //   438: iload 20
    //   440: invokeinterface 340 2 0
    //   445: ifeq +9 -> 454
    //   448: iconst_1
    //   449: istore 26
    //   451: goto +6 -> 457
    //   454: iconst_0
    //   455: istore 26
    //   457: aload 27
    //   459: iload 26
    //   461: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   464: aload 27
    //   466: aload 29
    //   468: iload 25
    //   470: invokeinterface 367 2 0
    //   475: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   478: aload 27
    //   480: aload 29
    //   482: iload 24
    //   484: invokeinterface 367 2 0
    //   489: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   492: aload 27
    //   494: aload 29
    //   496: iload 21
    //   498: invokeinterface 213 2 0
    //   503: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   506: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   509: new 384	androidx/work/impl/model/WorkSpec
    //   512: astore 31
    //   514: aload 31
    //   516: aload 30
    //   518: aload 33
    //   520: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   523: aload 31
    //   525: aload 29
    //   527: iload 23
    //   529: invokeinterface 340 2 0
    //   534: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   537: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   540: aload 31
    //   542: aload 29
    //   544: iload 22
    //   546: invokeinterface 205 2 0
    //   551: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   554: aload 31
    //   556: aload 29
    //   558: iload 17
    //   560: invokeinterface 213 2 0
    //   565: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   568: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   571: aload 31
    //   573: aload 29
    //   575: iload 16
    //   577: invokeinterface 213 2 0
    //   582: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   585: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   588: aload 31
    //   590: aload 29
    //   592: iload 13
    //   594: invokeinterface 367 2 0
    //   599: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   602: aload 31
    //   604: aload 29
    //   606: iload 8
    //   608: invokeinterface 367 2 0
    //   613: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   616: aload 31
    //   618: aload 29
    //   620: iload 15
    //   622: invokeinterface 367 2 0
    //   627: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   630: aload 31
    //   632: aload 29
    //   634: iload 6
    //   636: invokeinterface 340 2 0
    //   641: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   644: aload 31
    //   646: aload 29
    //   648: iload_1
    //   649: invokeinterface 340 2 0
    //   654: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   657: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   660: aload 31
    //   662: aload 29
    //   664: iload 4
    //   666: invokeinterface 367 2 0
    //   671: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   674: aload 31
    //   676: aload 29
    //   678: iload 14
    //   680: invokeinterface 367 2 0
    //   685: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   688: aload 31
    //   690: aload 29
    //   692: iload_3
    //   693: invokeinterface 367 2 0
    //   698: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   701: aload 31
    //   703: aload 29
    //   705: iload 5
    //   707: invokeinterface 367 2 0
    //   712: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   715: aload 29
    //   717: iload_2
    //   718: invokeinterface 340 2 0
    //   723: ifeq +9 -> 732
    //   726: iconst_1
    //   727: istore 26
    //   729: goto +6 -> 735
    //   732: iconst_0
    //   733: istore 26
    //   735: aload 31
    //   737: iload 26
    //   739: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   742: aload 31
    //   744: aload 29
    //   746: iload 12
    //   748: invokeinterface 340 2 0
    //   753: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   756: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   759: aload 31
    //   761: aload 27
    //   763: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   766: aload 32
    //   768: aload 31
    //   770: invokeinterface 456 2 0
    //   775: pop
    //   776: goto -483 -> 293
    //   779: aload 29
    //   781: invokeinterface 194 1 0
    //   786: aload 28
    //   788: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   791: aload 32
    //   793: areturn
    //   794: astore 27
    //   796: goto +5 -> 801
    //   799: astore 27
    //   801: aload 29
    //   803: invokeinterface 194 1 0
    //   808: aload 28
    //   810: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   813: aload 27
    //   815: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	816	0	this	WorkSpecDao_Impl
    //   217	432	1	i	int
    //   265	453	2	j	int
    //   246	447	3	k	int
    //   226	439	4	m	int
    //   255	451	5	n	int
    //   207	428	6	i1	int
    //   67	344	7	i2	int
    //   187	420	8	i3	int
    //   137	180	9	i4	int
    //   57	326	10	i5	int
    //   117	189	11	i6	int
    //   274	473	12	i7	int
    //   177	416	13	i8	int
    //   236	443	14	i9	int
    //   197	424	15	i10	int
    //   167	409	16	i11	int
    //   157	402	17	i12	int
    //   37	303	18	i13	int
    //   47	308	19	i14	int
    //   77	362	20	i15	int
    //   107	390	21	i16	int
    //   147	398	22	i17	int
    //   127	401	23	i18	int
    //   97	386	24	i19	int
    //   87	382	25	i20	int
    //   365	373	26	bool	boolean
    //   328	434	27	localConstraints	Constraints
    //   794	1	27	localObject1	Object
    //   799	15	27	localObject2	Object
    //   7	802	28	localRoomSQLiteQuery	RoomSQLiteQuery
    //   27	775	29	localCursor	Cursor
    //   312	205	30	str1	String
    //   512	257	31	localWorkSpec	WorkSpec
    //   279	513	32	localArrayList	ArrayList
    //   323	196	33	str2	String
    // Exception table:
    //   from	to	target	type
    //   169	281	794	finally
    //   281	293	794	finally
    //   293	364	794	finally
    //   373	392	794	finally
    //   401	420	794	finally
    //   429	448	794	finally
    //   457	588	794	finally
    //   588	660	794	finally
    //   660	688	794	finally
    //   688	726	794	finally
    //   735	776	794	finally
    //   29	169	799	finally
  }
  
  public WorkInfo.State getState(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
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
        paramString = WorkTypeConverters.intToState(((Cursor)localObject).getInt(0));
      }
      return paramString;
    }
    finally
    {
      ((Cursor)localObject).close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getUnfinishedWorkWithName(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    this.__db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(paramString.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getUnfinishedWorkWithTag(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    this.__db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(paramString.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  /* Error */
  public WorkSpec getWorkSpec(String paramString)
  {
    // Byte code:
    //   0: ldc_w 528
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 28
    //   9: aload_1
    //   10: ifnonnull +12 -> 22
    //   13: aload 28
    //   15: iconst_1
    //   16: invokevirtual 171	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   19: goto +10 -> 29
    //   22: aload 28
    //   24: iconst_1
    //   25: aload_1
    //   26: invokevirtual 175	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   29: aload_0
    //   30: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   33: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   36: aload_0
    //   37: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   40: aload 28
    //   42: iconst_0
    //   43: aconst_null
    //   44: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   47: astore 29
    //   49: aload 29
    //   51: ldc_w 278
    //   54: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   57: istore 12
    //   59: aload 29
    //   61: ldc_w 283
    //   64: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 17
    //   69: aload 29
    //   71: ldc_w 285
    //   74: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 21
    //   79: aload 29
    //   81: ldc_w 287
    //   84: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   87: istore 5
    //   89: aload 29
    //   91: ldc_w 289
    //   94: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   97: istore 26
    //   99: aload 29
    //   101: ldc_w 291
    //   104: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   107: istore 8
    //   109: aload 29
    //   111: ldc_w 293
    //   114: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   117: istore 10
    //   119: aload 29
    //   121: ldc_w 295
    //   124: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   127: istore 9
    //   129: aload 29
    //   131: ldc_w 297
    //   134: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   137: istore 14
    //   139: aload 29
    //   141: ldc_w 299
    //   144: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   147: istore 24
    //   149: aload 29
    //   151: ldc_w 301
    //   154: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 23
    //   159: aload 29
    //   161: ldc_w 303
    //   164: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   167: istore 15
    //   169: aload 29
    //   171: ldc_w 305
    //   174: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   177: istore 16
    //   179: aload 29
    //   181: ldc_w 307
    //   184: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   187: istore 13
    //   189: aload 29
    //   191: ldc_w 309
    //   194: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   197: istore 25
    //   199: aload 29
    //   201: ldc_w 311
    //   204: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   207: istore 11
    //   209: aload 29
    //   211: ldc_w 313
    //   214: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   217: istore_3
    //   218: aload 29
    //   220: ldc_w 315
    //   223: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   226: istore_2
    //   227: aload 29
    //   229: ldc_w 317
    //   232: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   235: istore 20
    //   237: aload 29
    //   239: ldc_w 319
    //   242: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   245: istore 7
    //   247: aload 29
    //   249: ldc_w 321
    //   252: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   255: istore 18
    //   257: aload 29
    //   259: ldc_w 323
    //   262: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore 19
    //   267: aload 29
    //   269: ldc_w 325
    //   272: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   275: istore 4
    //   277: aload 29
    //   279: ldc_w 327
    //   282: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   285: istore 22
    //   287: aload 29
    //   289: ldc_w 329
    //   292: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   295: istore 6
    //   297: aload 29
    //   299: invokeinterface 517 1 0
    //   304: ifeq +452 -> 756
    //   307: aload 29
    //   309: iload 14
    //   311: invokeinterface 205 2 0
    //   316: astore 30
    //   318: aload 29
    //   320: iload 23
    //   322: invokeinterface 205 2 0
    //   327: astore 31
    //   329: new 335	androidx/work/Constraints
    //   332: astore 32
    //   334: aload 32
    //   336: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   339: aload 32
    //   341: aload 29
    //   343: iload 12
    //   345: invokeinterface 340 2 0
    //   350: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   353: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   356: aload 29
    //   358: iload 17
    //   360: invokeinterface 340 2 0
    //   365: ifeq +9 -> 374
    //   368: iconst_1
    //   369: istore 27
    //   371: goto +6 -> 377
    //   374: iconst_0
    //   375: istore 27
    //   377: aload 32
    //   379: iload 27
    //   381: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   384: aload 29
    //   386: iload 21
    //   388: invokeinterface 340 2 0
    //   393: ifeq +9 -> 402
    //   396: iconst_1
    //   397: istore 27
    //   399: goto +6 -> 405
    //   402: iconst_0
    //   403: istore 27
    //   405: aload 32
    //   407: iload 27
    //   409: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   412: aload 29
    //   414: iload 5
    //   416: invokeinterface 340 2 0
    //   421: ifeq +9 -> 430
    //   424: iconst_1
    //   425: istore 27
    //   427: goto +6 -> 433
    //   430: iconst_0
    //   431: istore 27
    //   433: aload 32
    //   435: iload 27
    //   437: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   440: aload 29
    //   442: iload 26
    //   444: invokeinterface 340 2 0
    //   449: ifeq +9 -> 458
    //   452: iconst_1
    //   453: istore 27
    //   455: goto +6 -> 461
    //   458: iconst_0
    //   459: istore 27
    //   461: aload 32
    //   463: iload 27
    //   465: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   468: aload 32
    //   470: aload 29
    //   472: iload 8
    //   474: invokeinterface 367 2 0
    //   479: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   482: aload 32
    //   484: aload 29
    //   486: iload 10
    //   488: invokeinterface 367 2 0
    //   493: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   496: aload 32
    //   498: aload 29
    //   500: iload 9
    //   502: invokeinterface 213 2 0
    //   507: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   510: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   513: new 384	androidx/work/impl/model/WorkSpec
    //   516: astore_1
    //   517: aload_1
    //   518: aload 30
    //   520: aload 31
    //   522: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   525: aload_1
    //   526: aload 29
    //   528: iload 24
    //   530: invokeinterface 340 2 0
    //   535: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   538: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   541: aload_1
    //   542: aload 29
    //   544: iload 15
    //   546: invokeinterface 205 2 0
    //   551: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   554: aload_1
    //   555: aload 29
    //   557: iload 16
    //   559: invokeinterface 213 2 0
    //   564: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   567: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   570: aload_1
    //   571: aload 29
    //   573: iload 13
    //   575: invokeinterface 213 2 0
    //   580: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   583: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   586: aload_1
    //   587: aload 29
    //   589: iload 25
    //   591: invokeinterface 367 2 0
    //   596: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   599: aload_1
    //   600: aload 29
    //   602: iload 11
    //   604: invokeinterface 367 2 0
    //   609: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   612: aload_1
    //   613: aload 29
    //   615: iload_3
    //   616: invokeinterface 367 2 0
    //   621: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   624: aload_1
    //   625: aload 29
    //   627: iload_2
    //   628: invokeinterface 340 2 0
    //   633: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   636: aload_1
    //   637: aload 29
    //   639: iload 20
    //   641: invokeinterface 340 2 0
    //   646: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   649: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   652: aload_1
    //   653: aload 29
    //   655: iload 7
    //   657: invokeinterface 367 2 0
    //   662: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   665: aload_1
    //   666: aload 29
    //   668: iload 18
    //   670: invokeinterface 367 2 0
    //   675: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   678: aload_1
    //   679: aload 29
    //   681: iload 19
    //   683: invokeinterface 367 2 0
    //   688: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   691: aload_1
    //   692: aload 29
    //   694: iload 4
    //   696: invokeinterface 367 2 0
    //   701: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   704: aload 29
    //   706: iload 22
    //   708: invokeinterface 340 2 0
    //   713: ifeq +9 -> 722
    //   716: iconst_1
    //   717: istore 27
    //   719: goto +6 -> 725
    //   722: iconst_0
    //   723: istore 27
    //   725: aload_1
    //   726: iload 27
    //   728: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   731: aload_1
    //   732: aload 29
    //   734: iload 6
    //   736: invokeinterface 340 2 0
    //   741: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   744: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   747: aload_1
    //   748: aload 32
    //   750: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   753: goto +5 -> 758
    //   756: aconst_null
    //   757: astore_1
    //   758: aload 29
    //   760: invokeinterface 194 1 0
    //   765: aload 28
    //   767: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   770: aload_1
    //   771: areturn
    //   772: astore_1
    //   773: goto +4 -> 777
    //   776: astore_1
    //   777: aload 29
    //   779: invokeinterface 194 1 0
    //   784: aload 28
    //   786: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   789: aload_1
    //   790: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	791	0	this	WorkSpecDao_Impl
    //   0	791	1	paramString	String
    //   226	402	2	i	int
    //   217	399	3	j	int
    //   275	420	4	k	int
    //   87	328	5	m	int
    //   295	440	6	n	int
    //   245	411	7	i1	int
    //   107	366	8	i2	int
    //   127	374	9	i3	int
    //   117	370	10	i4	int
    //   207	396	11	i5	int
    //   57	287	12	i6	int
    //   187	387	13	i7	int
    //   137	173	14	i8	int
    //   167	378	15	i9	int
    //   177	381	16	i10	int
    //   67	292	17	i11	int
    //   255	414	18	i12	int
    //   265	417	19	i13	int
    //   235	405	20	i14	int
    //   77	310	21	i15	int
    //   285	422	22	i16	int
    //   157	164	23	i17	int
    //   147	382	24	i18	int
    //   197	393	25	i19	int
    //   97	346	26	i20	int
    //   369	358	27	bool	boolean
    //   7	778	28	localRoomSQLiteQuery	RoomSQLiteQuery
    //   47	731	29	localCursor	Cursor
    //   316	203	30	str1	String
    //   327	194	31	str2	String
    //   332	417	32	localConstraints	Constraints
    // Exception table:
    //   from	to	target	type
    //   189	368	772	finally
    //   377	396	772	finally
    //   405	424	772	finally
    //   433	452	772	finally
    //   461	716	772	finally
    //   725	753	772	finally
    //   49	189	776	finally
  }
  
  public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    this.__db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    try
    {
      int j = CursorUtil.getColumnIndexOrThrow(paramString, "id");
      int i = CursorUtil.getColumnIndexOrThrow(paramString, "state");
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext())
      {
        WorkSpec.IdAndState localIdAndState = new androidx/work/impl/model/WorkSpec$IdAndState;
        localIdAndState.<init>();
        localIdAndState.id = paramString.getString(j);
        localIdAndState.state = WorkTypeConverters.intToState(paramString.getInt(i));
        localArrayList.add(localIdAndState);
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  /* Error */
  public WorkSpec[] getWorkSpecs(List<String> paramList)
  {
    // Byte code:
    //   0: invokestatic 130	androidx/room/util/StringUtil:newStringBuilder	()Ljava/lang/StringBuilder;
    //   3: astore 29
    //   5: aload 29
    //   7: ldc_w 543
    //   10: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: pop
    //   14: aload 29
    //   16: ldc_w 545
    //   19: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: aload 29
    //   25: ldc_w 547
    //   28: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_1
    //   33: invokeinterface 548 1 0
    //   38: istore_2
    //   39: aload 29
    //   41: iload_2
    //   42: invokestatic 143	androidx/room/util/StringUtil:appendPlaceholders	(Ljava/lang/StringBuilder;I)V
    //   45: aload 29
    //   47: ldc -111
    //   49: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload 29
    //   55: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: iload_2
    //   59: iconst_0
    //   60: iadd
    //   61: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   64: astore 29
    //   66: aload_1
    //   67: invokeinterface 549 1 0
    //   72: astore_1
    //   73: iconst_1
    //   74: istore_2
    //   75: aload_1
    //   76: invokeinterface 164 1 0
    //   81: ifeq +42 -> 123
    //   84: aload_1
    //   85: invokeinterface 168 1 0
    //   90: checkcast 113	java/lang/String
    //   93: astore 30
    //   95: aload 30
    //   97: ifnonnull +12 -> 109
    //   100: aload 29
    //   102: iload_2
    //   103: invokevirtual 171	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   106: goto +11 -> 117
    //   109: aload 29
    //   111: iload_2
    //   112: aload 30
    //   114: invokevirtual 175	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   117: iinc 2 1
    //   120: goto -45 -> 75
    //   123: aload_0
    //   124: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   127: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   130: aload_0
    //   131: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   134: aload 29
    //   136: iconst_0
    //   137: aconst_null
    //   138: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   141: astore 30
    //   143: aload 30
    //   145: ldc_w 278
    //   148: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   151: istore 19
    //   153: aload 30
    //   155: ldc_w 283
    //   158: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   161: istore 20
    //   163: aload 30
    //   165: ldc_w 285
    //   168: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   171: istore 10
    //   173: aload 30
    //   175: ldc_w 287
    //   178: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   181: istore 23
    //   183: aload 30
    //   185: ldc_w 289
    //   188: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   191: istore 24
    //   193: aload 30
    //   195: ldc_w 291
    //   198: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   201: istore 27
    //   203: aload 30
    //   205: ldc_w 293
    //   208: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 22
    //   213: aload 30
    //   215: ldc_w 295
    //   218: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   221: istore 26
    //   223: aload 30
    //   225: ldc_w 297
    //   228: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   231: istore 16
    //   233: aload 30
    //   235: ldc_w 299
    //   238: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   241: istore 25
    //   243: aload 30
    //   245: ldc_w 301
    //   248: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   251: istore 13
    //   253: aload 30
    //   255: ldc_w 303
    //   258: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   261: istore 14
    //   263: aload 30
    //   265: ldc_w 305
    //   268: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   271: istore 21
    //   273: aload 30
    //   275: ldc_w 307
    //   278: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   281: istore 15
    //   283: aload 30
    //   285: ldc_w 309
    //   288: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   291: istore 18
    //   293: aload 30
    //   295: ldc_w 311
    //   298: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   301: istore 5
    //   303: aload 30
    //   305: ldc_w 313
    //   308: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   311: istore 17
    //   313: aload 30
    //   315: ldc_w 315
    //   318: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   321: istore_3
    //   322: aload 30
    //   324: ldc_w 317
    //   327: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   330: istore_2
    //   331: aload 30
    //   333: ldc_w 319
    //   336: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   339: istore 6
    //   341: aload 30
    //   343: ldc_w 321
    //   346: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   349: istore 12
    //   351: aload 30
    //   353: ldc_w 323
    //   356: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   359: istore 11
    //   361: aload 30
    //   363: ldc_w 325
    //   366: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   369: istore 7
    //   371: aload 30
    //   373: ldc_w 327
    //   376: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   379: istore 4
    //   381: aload 30
    //   383: ldc_w 329
    //   386: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   389: istore 8
    //   391: aload 30
    //   393: invokeinterface 332 1 0
    //   398: anewarray 384	androidx/work/impl/model/WorkSpec
    //   401: astore_1
    //   402: iconst_0
    //   403: istore 9
    //   405: aload 30
    //   407: invokeinterface 197 1 0
    //   412: ifeq +479 -> 891
    //   415: aload 30
    //   417: iload 16
    //   419: invokeinterface 205 2 0
    //   424: astore 32
    //   426: aload 30
    //   428: iload 13
    //   430: invokeinterface 205 2 0
    //   435: astore 34
    //   437: new 335	androidx/work/Constraints
    //   440: astore 33
    //   442: aload 33
    //   444: invokespecial 336	androidx/work/Constraints:<init>	()V
    //   447: aload 33
    //   449: aload 30
    //   451: iload 19
    //   453: invokeinterface 340 2 0
    //   458: invokestatic 346	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   461: invokevirtual 350	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   464: aload 30
    //   466: iload 20
    //   468: invokeinterface 340 2 0
    //   473: ifeq +9 -> 482
    //   476: iconst_1
    //   477: istore 28
    //   479: goto +6 -> 485
    //   482: iconst_0
    //   483: istore 28
    //   485: aload 33
    //   487: iload 28
    //   489: invokevirtual 354	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   492: aload 30
    //   494: iload 10
    //   496: invokeinterface 340 2 0
    //   501: ifeq +9 -> 510
    //   504: iconst_1
    //   505: istore 28
    //   507: goto +6 -> 513
    //   510: iconst_0
    //   511: istore 28
    //   513: aload 33
    //   515: iload 28
    //   517: invokevirtual 357	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   520: aload 30
    //   522: iload 23
    //   524: invokeinterface 340 2 0
    //   529: ifeq +9 -> 538
    //   532: iconst_1
    //   533: istore 28
    //   535: goto +6 -> 541
    //   538: iconst_0
    //   539: istore 28
    //   541: aload 33
    //   543: iload 28
    //   545: invokevirtual 360	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   548: aload 30
    //   550: iload 24
    //   552: invokeinterface 340 2 0
    //   557: ifeq +9 -> 566
    //   560: iconst_1
    //   561: istore 28
    //   563: goto +6 -> 569
    //   566: iconst_0
    //   567: istore 28
    //   569: aload 33
    //   571: iload 28
    //   573: invokevirtual 363	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   576: aload 33
    //   578: aload 30
    //   580: iload 27
    //   582: invokeinterface 367 2 0
    //   587: invokevirtual 371	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   590: aload 33
    //   592: aload 30
    //   594: iload 22
    //   596: invokeinterface 367 2 0
    //   601: invokevirtual 374	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   604: aload 33
    //   606: aload 30
    //   608: iload 26
    //   610: invokeinterface 213 2 0
    //   615: invokestatic 378	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   618: invokevirtual 382	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   621: new 384	androidx/work/impl/model/WorkSpec
    //   624: astore 31
    //   626: aload 31
    //   628: aload 32
    //   630: aload 34
    //   632: invokespecial 387	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   635: aload 31
    //   637: aload 30
    //   639: iload 25
    //   641: invokeinterface 340 2 0
    //   646: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   649: putfield 394	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   652: aload 31
    //   654: aload 30
    //   656: iload 14
    //   658: invokeinterface 205 2 0
    //   663: putfield 398	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   666: aload 31
    //   668: aload 30
    //   670: iload 21
    //   672: invokeinterface 213 2 0
    //   677: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   680: putfield 401	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   683: aload 31
    //   685: aload 30
    //   687: iload 15
    //   689: invokeinterface 213 2 0
    //   694: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   697: putfield 403	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   700: aload 31
    //   702: aload 30
    //   704: iload 18
    //   706: invokeinterface 367 2 0
    //   711: putfield 407	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   714: aload 31
    //   716: aload 30
    //   718: iload 5
    //   720: invokeinterface 367 2 0
    //   725: putfield 410	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   728: aload 31
    //   730: aload 30
    //   732: iload 17
    //   734: invokeinterface 367 2 0
    //   739: putfield 413	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   742: aload 31
    //   744: aload 30
    //   746: iload_3
    //   747: invokeinterface 340 2 0
    //   752: putfield 417	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   755: aload 31
    //   757: aload 30
    //   759: iload_2
    //   760: invokeinterface 340 2 0
    //   765: invokestatic 421	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   768: putfield 425	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   771: aload 31
    //   773: aload 30
    //   775: iload 6
    //   777: invokeinterface 367 2 0
    //   782: putfield 428	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   785: aload 31
    //   787: aload 30
    //   789: iload 12
    //   791: invokeinterface 367 2 0
    //   796: putfield 431	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   799: aload 31
    //   801: aload 30
    //   803: iload 11
    //   805: invokeinterface 367 2 0
    //   810: putfield 434	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   813: aload 31
    //   815: aload 30
    //   817: iload 7
    //   819: invokeinterface 367 2 0
    //   824: putfield 437	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   827: aload 30
    //   829: iload 4
    //   831: invokeinterface 340 2 0
    //   836: ifeq +9 -> 845
    //   839: iconst_1
    //   840: istore 28
    //   842: goto +6 -> 848
    //   845: iconst_0
    //   846: istore 28
    //   848: aload 31
    //   850: iload 28
    //   852: putfield 441	androidx/work/impl/model/WorkSpec:expedited	Z
    //   855: aload 31
    //   857: aload 30
    //   859: iload 8
    //   861: invokeinterface 340 2 0
    //   866: invokestatic 445	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   869: putfield 449	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   872: aload 31
    //   874: aload 33
    //   876: putfield 453	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   879: aload_1
    //   880: iload 9
    //   882: aload 31
    //   884: aastore
    //   885: iinc 9 1
    //   888: goto -483 -> 405
    //   891: aload 30
    //   893: invokeinterface 194 1 0
    //   898: aload 29
    //   900: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   903: aload_1
    //   904: areturn
    //   905: astore_1
    //   906: goto +4 -> 910
    //   909: astore_1
    //   910: aload 30
    //   912: invokeinterface 194 1 0
    //   917: aload 29
    //   919: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   922: aload_1
    //   923: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	924	0	this	WorkSpecDao_Impl
    //   0	924	1	paramList	List<String>
    //   38	722	2	i	int
    //   321	426	3	j	int
    //   379	451	4	k	int
    //   301	418	5	m	int
    //   339	437	6	n	int
    //   369	449	7	i1	int
    //   389	471	8	i2	int
    //   403	483	9	i3	int
    //   171	324	10	i4	int
    //   359	445	11	i5	int
    //   349	441	12	i6	int
    //   251	178	13	i7	int
    //   261	396	14	i8	int
    //   281	407	15	i9	int
    //   231	187	16	i10	int
    //   311	422	17	i11	int
    //   291	414	18	i12	int
    //   151	301	19	i13	int
    //   161	306	20	i14	int
    //   271	400	21	i15	int
    //   211	384	22	i16	int
    //   181	342	23	i17	int
    //   191	360	24	i18	int
    //   241	399	25	i19	int
    //   221	388	26	i20	int
    //   201	380	27	i21	int
    //   477	374	28	bool	boolean
    //   3	915	29	localObject1	Object
    //   93	818	30	localObject2	Object
    //   624	259	31	localWorkSpec	WorkSpec
    //   424	205	32	str1	String
    //   440	435	33	localConstraints	Constraints
    //   435	196	34	str2	String
    // Exception table:
    //   from	to	target	type
    //   283	402	905	finally
    //   405	476	905	finally
    //   485	504	905	finally
    //   513	532	905	finally
    //   541	560	905	finally
    //   569	714	905	finally
    //   714	771	905	finally
    //   771	799	905	finally
    //   799	813	905	finally
    //   813	839	905	finally
    //   848	879	905	finally
    //   143	283	909	finally
  }
  
  /* Error */
  public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String paramString)
  {
    // Byte code:
    //   0: ldc_w 553
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 8
    //   9: aload_1
    //   10: ifnonnull +12 -> 22
    //   13: aload 8
    //   15: iconst_1
    //   16: invokevirtual 171	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   19: goto +10 -> 29
    //   22: aload 8
    //   24: iconst_1
    //   25: aload_1
    //   26: invokevirtual 175	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   29: aload_0
    //   30: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   33: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   36: aload_0
    //   37: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   40: invokevirtual 254	androidx/room/RoomDatabase:beginTransaction	()V
    //   43: aload_0
    //   44: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   47: astore 6
    //   49: aconst_null
    //   50: astore_1
    //   51: aconst_null
    //   52: astore 7
    //   54: aload 6
    //   56: aload 8
    //   58: iconst_1
    //   59: aconst_null
    //   60: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   63: astore 9
    //   65: aload 9
    //   67: ldc_w 297
    //   70: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   73: istore 4
    //   75: aload 9
    //   77: ldc_w 299
    //   80: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   83: istore_3
    //   84: aload 9
    //   86: ldc_w 307
    //   89: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   92: istore 5
    //   94: aload 9
    //   96: ldc_w 315
    //   99: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   102: istore_2
    //   103: new 90	androidx/collection/ArrayMap
    //   106: astore 6
    //   108: aload 6
    //   110: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   113: new 90	androidx/collection/ArrayMap
    //   116: astore 10
    //   118: aload 10
    //   120: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   123: aload 9
    //   125: invokeinterface 197 1 0
    //   130: ifeq +118 -> 248
    //   133: aload 9
    //   135: iload 4
    //   137: invokeinterface 201 2 0
    //   142: ifne +47 -> 189
    //   145: aload 9
    //   147: iload 4
    //   149: invokeinterface 205 2 0
    //   154: astore 11
    //   156: aload 6
    //   158: aload 11
    //   160: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   163: checkcast 118	java/util/ArrayList
    //   166: ifnonnull +23 -> 189
    //   169: new 118	java/util/ArrayList
    //   172: astore 12
    //   174: aload 12
    //   176: invokespecial 555	java/util/ArrayList:<init>	()V
    //   179: aload 6
    //   181: aload 11
    //   183: aload 12
    //   185: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   188: pop
    //   189: aload 9
    //   191: iload 4
    //   193: invokeinterface 201 2 0
    //   198: ifne -75 -> 123
    //   201: aload 9
    //   203: iload 4
    //   205: invokeinterface 205 2 0
    //   210: astore 12
    //   212: aload 10
    //   214: aload 12
    //   216: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   219: checkcast 118	java/util/ArrayList
    //   222: ifnonnull -99 -> 123
    //   225: new 118	java/util/ArrayList
    //   228: astore 11
    //   230: aload 11
    //   232: invokespecial 555	java/util/ArrayList:<init>	()V
    //   235: aload 10
    //   237: aload 12
    //   239: aload 11
    //   241: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   244: pop
    //   245: goto -122 -> 123
    //   248: aload 9
    //   250: iconst_m1
    //   251: invokeinterface 558 2 0
    //   256: pop
    //   257: aload_0
    //   258: aload 6
    //   260: invokespecial 228	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   263: aload_0
    //   264: aload 10
    //   266: invokespecial 124	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   269: aload 9
    //   271: invokeinterface 517 1 0
    //   276: ifeq +181 -> 457
    //   279: aload 9
    //   281: iload 4
    //   283: invokeinterface 201 2 0
    //   288: ifne +24 -> 312
    //   291: aload 6
    //   293: aload 9
    //   295: iload 4
    //   297: invokeinterface 205 2 0
    //   302: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   305: checkcast 118	java/util/ArrayList
    //   308: astore_1
    //   309: goto +5 -> 314
    //   312: aconst_null
    //   313: astore_1
    //   314: aload_1
    //   315: astore 6
    //   317: aload_1
    //   318: ifnonnull +13 -> 331
    //   321: new 118	java/util/ArrayList
    //   324: astore 6
    //   326: aload 6
    //   328: invokespecial 555	java/util/ArrayList:<init>	()V
    //   331: aload 7
    //   333: astore_1
    //   334: aload 9
    //   336: iload 4
    //   338: invokeinterface 201 2 0
    //   343: ifne +21 -> 364
    //   346: aload 10
    //   348: aload 9
    //   350: iload 4
    //   352: invokeinterface 205 2 0
    //   357: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   360: checkcast 118	java/util/ArrayList
    //   363: astore_1
    //   364: aload_1
    //   365: astore 7
    //   367: aload_1
    //   368: ifnonnull +13 -> 381
    //   371: new 118	java/util/ArrayList
    //   374: astore 7
    //   376: aload 7
    //   378: invokespecial 555	java/util/ArrayList:<init>	()V
    //   381: new 560	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   384: astore_1
    //   385: aload_1
    //   386: invokespecial 561	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   389: aload_1
    //   390: aload 9
    //   392: iload 4
    //   394: invokeinterface 205 2 0
    //   399: putfield 562	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   402: aload_1
    //   403: aload 9
    //   405: iload_3
    //   406: invokeinterface 340 2 0
    //   411: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   414: putfield 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   417: aload_1
    //   418: aload 9
    //   420: iload 5
    //   422: invokeinterface 213 2 0
    //   427: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   430: putfield 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   433: aload_1
    //   434: aload 9
    //   436: iload_2
    //   437: invokeinterface 340 2 0
    //   442: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   445: aload_1
    //   446: aload 6
    //   448: putfield 569	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   451: aload_1
    //   452: aload 7
    //   454: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   457: aload_0
    //   458: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   461: invokevirtual 260	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   464: aload 9
    //   466: invokeinterface 194 1 0
    //   471: aload 8
    //   473: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   476: aload_0
    //   477: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   480: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   483: aload_1
    //   484: areturn
    //   485: astore_1
    //   486: aload 9
    //   488: invokeinterface 194 1 0
    //   493: aload 8
    //   495: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   498: aload_1
    //   499: athrow
    //   500: astore_1
    //   501: aload_0
    //   502: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   505: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   508: aload_1
    //   509: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	510	0	this	WorkSpecDao_Impl
    //   0	510	1	paramString	String
    //   102	335	2	i	int
    //   83	323	3	j	int
    //   73	320	4	k	int
    //   92	329	5	m	int
    //   47	400	6	localObject1	Object
    //   52	401	7	localObject2	Object
    //   7	487	8	localRoomSQLiteQuery	RoomSQLiteQuery
    //   63	424	9	localCursor	Cursor
    //   116	231	10	localArrayMap	ArrayMap
    //   154	86	11	localObject3	Object
    //   172	66	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   65	123	485	finally
    //   123	189	485	finally
    //   189	245	485	finally
    //   248	269	485	finally
    //   269	309	485	finally
    //   321	331	485	finally
    //   334	364	485	finally
    //   371	381	485	finally
    //   381	457	485	finally
    //   457	464	485	finally
    //   43	49	500	finally
    //   54	65	500	finally
    //   464	476	500	finally
    //   486	500	500	finally
  }
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> paramList)
  {
    // Byte code:
    //   0: invokestatic 130	androidx/room/util/StringUtil:newStringBuilder	()Ljava/lang/StringBuilder;
    //   3: astore 6
    //   5: aload 6
    //   7: ldc_w 577
    //   10: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: pop
    //   14: aload_1
    //   15: invokeinterface 548 1 0
    //   20: istore_2
    //   21: aload 6
    //   23: iload_2
    //   24: invokestatic 143	androidx/room/util/StringUtil:appendPlaceholders	(Ljava/lang/StringBuilder;I)V
    //   27: aload 6
    //   29: ldc -111
    //   31: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload 6
    //   37: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: iload_2
    //   41: iconst_0
    //   42: iadd
    //   43: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   46: astore 8
    //   48: aload_1
    //   49: invokeinterface 549 1 0
    //   54: astore_1
    //   55: iconst_1
    //   56: istore_2
    //   57: aload_1
    //   58: invokeinterface 164 1 0
    //   63: ifeq +42 -> 105
    //   66: aload_1
    //   67: invokeinterface 168 1 0
    //   72: checkcast 113	java/lang/String
    //   75: astore 6
    //   77: aload 6
    //   79: ifnonnull +12 -> 91
    //   82: aload 8
    //   84: iload_2
    //   85: invokevirtual 171	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   88: goto +11 -> 99
    //   91: aload 8
    //   93: iload_2
    //   94: aload 6
    //   96: invokevirtual 175	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   99: iinc 2 1
    //   102: goto -45 -> 57
    //   105: aload_0
    //   106: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   109: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   112: aload_0
    //   113: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   116: invokevirtual 254	androidx/room/RoomDatabase:beginTransaction	()V
    //   119: aload_0
    //   120: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   123: aload 8
    //   125: iconst_1
    //   126: aconst_null
    //   127: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   130: astore 9
    //   132: aload 9
    //   134: ldc_w 297
    //   137: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   140: istore_3
    //   141: aload 9
    //   143: ldc_w 299
    //   146: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   149: istore 5
    //   151: aload 9
    //   153: ldc_w 307
    //   156: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   159: istore_2
    //   160: aload 9
    //   162: ldc_w 315
    //   165: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   168: istore 4
    //   170: new 90	androidx/collection/ArrayMap
    //   173: astore 10
    //   175: aload 10
    //   177: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   180: new 90	androidx/collection/ArrayMap
    //   183: astore 11
    //   185: aload 11
    //   187: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   190: aload 9
    //   192: invokeinterface 197 1 0
    //   197: ifeq +108 -> 305
    //   200: aload 9
    //   202: iload_3
    //   203: invokeinterface 201 2 0
    //   208: ifne +43 -> 251
    //   211: aload 9
    //   213: iload_3
    //   214: invokeinterface 205 2 0
    //   219: astore_1
    //   220: aload 10
    //   222: aload_1
    //   223: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   226: checkcast 118	java/util/ArrayList
    //   229: ifnonnull +22 -> 251
    //   232: new 118	java/util/ArrayList
    //   235: astore 6
    //   237: aload 6
    //   239: invokespecial 555	java/util/ArrayList:<init>	()V
    //   242: aload 10
    //   244: aload_1
    //   245: aload 6
    //   247: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   250: pop
    //   251: aload 9
    //   253: iload_3
    //   254: invokeinterface 201 2 0
    //   259: ifne -69 -> 190
    //   262: aload 9
    //   264: iload_3
    //   265: invokeinterface 205 2 0
    //   270: astore_1
    //   271: aload 11
    //   273: aload_1
    //   274: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   277: checkcast 118	java/util/ArrayList
    //   280: ifnonnull -90 -> 190
    //   283: new 118	java/util/ArrayList
    //   286: astore 6
    //   288: aload 6
    //   290: invokespecial 555	java/util/ArrayList:<init>	()V
    //   293: aload 11
    //   295: aload_1
    //   296: aload 6
    //   298: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   301: pop
    //   302: goto -112 -> 190
    //   305: aload 9
    //   307: iconst_m1
    //   308: invokeinterface 558 2 0
    //   313: pop
    //   314: aload_0
    //   315: aload 10
    //   317: invokespecial 228	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   320: aload_0
    //   321: aload 11
    //   323: invokespecial 124	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   326: new 118	java/util/ArrayList
    //   329: astore 12
    //   331: aload 12
    //   333: aload 9
    //   335: invokeinterface 332 1 0
    //   340: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   343: aload 9
    //   345: invokeinterface 197 1 0
    //   350: ifeq +191 -> 541
    //   353: aload 9
    //   355: iload_3
    //   356: invokeinterface 201 2 0
    //   361: ifne +23 -> 384
    //   364: aload 10
    //   366: aload 9
    //   368: iload_3
    //   369: invokeinterface 205 2 0
    //   374: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   377: checkcast 118	java/util/ArrayList
    //   380: astore_1
    //   381: goto +5 -> 386
    //   384: aconst_null
    //   385: astore_1
    //   386: aload_1
    //   387: astore 6
    //   389: aload_1
    //   390: ifnonnull +13 -> 403
    //   393: new 118	java/util/ArrayList
    //   396: astore 6
    //   398: aload 6
    //   400: invokespecial 555	java/util/ArrayList:<init>	()V
    //   403: aload 9
    //   405: iload_3
    //   406: invokeinterface 201 2 0
    //   411: ifne +23 -> 434
    //   414: aload 11
    //   416: aload 9
    //   418: iload_3
    //   419: invokeinterface 205 2 0
    //   424: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   427: checkcast 118	java/util/ArrayList
    //   430: astore_1
    //   431: goto +5 -> 436
    //   434: aconst_null
    //   435: astore_1
    //   436: aload_1
    //   437: astore 7
    //   439: aload_1
    //   440: ifnonnull +13 -> 453
    //   443: new 118	java/util/ArrayList
    //   446: astore 7
    //   448: aload 7
    //   450: invokespecial 555	java/util/ArrayList:<init>	()V
    //   453: new 560	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   456: astore_1
    //   457: aload_1
    //   458: invokespecial 561	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   461: aload_1
    //   462: aload 9
    //   464: iload_3
    //   465: invokeinterface 205 2 0
    //   470: putfield 562	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   473: aload_1
    //   474: aload 9
    //   476: iload 5
    //   478: invokeinterface 340 2 0
    //   483: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   486: putfield 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   489: aload_1
    //   490: aload 9
    //   492: iload_2
    //   493: invokeinterface 213 2 0
    //   498: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   501: putfield 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   504: aload_1
    //   505: aload 9
    //   507: iload 4
    //   509: invokeinterface 340 2 0
    //   514: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   517: aload_1
    //   518: aload 6
    //   520: putfield 569	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   523: aload_1
    //   524: aload 7
    //   526: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   529: aload 12
    //   531: aload_1
    //   532: invokeinterface 456 2 0
    //   537: pop
    //   538: goto -195 -> 343
    //   541: aload_0
    //   542: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   545: invokevirtual 260	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   548: aload 9
    //   550: invokeinterface 194 1 0
    //   555: aload 8
    //   557: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   560: aload_0
    //   561: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   564: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   567: aload 12
    //   569: areturn
    //   570: astore_1
    //   571: aload 9
    //   573: invokeinterface 194 1 0
    //   578: aload 8
    //   580: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   583: aload_1
    //   584: athrow
    //   585: astore_1
    //   586: aload_0
    //   587: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   590: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   593: aload_1
    //   594: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	595	0	this	WorkSpecDao_Impl
    //   0	595	1	paramList	List<String>
    //   20	473	2	i	int
    //   140	325	3	j	int
    //   168	340	4	k	int
    //   149	328	5	m	int
    //   3	516	6	localObject1	Object
    //   437	88	7	localObject2	Object
    //   46	533	8	localRoomSQLiteQuery	RoomSQLiteQuery
    //   130	442	9	localCursor	Cursor
    //   173	192	10	localArrayMap1	ArrayMap
    //   183	232	11	localArrayMap2	ArrayMap
    //   329	239	12	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   132	190	570	finally
    //   190	251	570	finally
    //   251	302	570	finally
    //   305	343	570	finally
    //   343	381	570	finally
    //   393	403	570	finally
    //   403	431	570	finally
    //   443	453	570	finally
    //   453	538	570	finally
    //   541	548	570	finally
    //   119	132	585	finally
    //   548	560	585	finally
    //   571	585	585	finally
  }
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String paramString)
  {
    // Byte code:
    //   0: ldc_w 581
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 8
    //   9: aload_1
    //   10: ifnonnull +12 -> 22
    //   13: aload 8
    //   15: iconst_1
    //   16: invokevirtual 171	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   19: goto +10 -> 29
    //   22: aload 8
    //   24: iconst_1
    //   25: aload_1
    //   26: invokevirtual 175	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   29: aload_0
    //   30: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   33: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   36: aload_0
    //   37: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   40: invokevirtual 254	androidx/room/RoomDatabase:beginTransaction	()V
    //   43: aload_0
    //   44: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   47: aload 8
    //   49: iconst_1
    //   50: aconst_null
    //   51: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   54: astore 9
    //   56: aload 9
    //   58: ldc_w 297
    //   61: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   64: istore_3
    //   65: aload 9
    //   67: ldc_w 299
    //   70: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   73: istore 4
    //   75: aload 9
    //   77: ldc_w 307
    //   80: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   83: istore 5
    //   85: aload 9
    //   87: ldc_w 315
    //   90: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   93: istore_2
    //   94: new 90	androidx/collection/ArrayMap
    //   97: astore 11
    //   99: aload 11
    //   101: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   104: new 90	androidx/collection/ArrayMap
    //   107: astore 10
    //   109: aload 10
    //   111: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   114: aload 9
    //   116: invokeinterface 197 1 0
    //   121: ifeq +108 -> 229
    //   124: aload 9
    //   126: iload_3
    //   127: invokeinterface 201 2 0
    //   132: ifne +43 -> 175
    //   135: aload 9
    //   137: iload_3
    //   138: invokeinterface 205 2 0
    //   143: astore_1
    //   144: aload 11
    //   146: aload_1
    //   147: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   150: checkcast 118	java/util/ArrayList
    //   153: ifnonnull +22 -> 175
    //   156: new 118	java/util/ArrayList
    //   159: astore 6
    //   161: aload 6
    //   163: invokespecial 555	java/util/ArrayList:<init>	()V
    //   166: aload 11
    //   168: aload_1
    //   169: aload 6
    //   171: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   174: pop
    //   175: aload 9
    //   177: iload_3
    //   178: invokeinterface 201 2 0
    //   183: ifne -69 -> 114
    //   186: aload 9
    //   188: iload_3
    //   189: invokeinterface 205 2 0
    //   194: astore 6
    //   196: aload 10
    //   198: aload 6
    //   200: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   203: checkcast 118	java/util/ArrayList
    //   206: ifnonnull -92 -> 114
    //   209: new 118	java/util/ArrayList
    //   212: astore_1
    //   213: aload_1
    //   214: invokespecial 555	java/util/ArrayList:<init>	()V
    //   217: aload 10
    //   219: aload 6
    //   221: aload_1
    //   222: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   225: pop
    //   226: goto -112 -> 114
    //   229: aload 9
    //   231: iconst_m1
    //   232: invokeinterface 558 2 0
    //   237: pop
    //   238: aload_0
    //   239: aload 11
    //   241: invokespecial 228	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   244: aload_0
    //   245: aload 10
    //   247: invokespecial 124	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   250: new 118	java/util/ArrayList
    //   253: astore 12
    //   255: aload 12
    //   257: aload 9
    //   259: invokeinterface 332 1 0
    //   264: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   267: aload 9
    //   269: invokeinterface 197 1 0
    //   274: ifeq +191 -> 465
    //   277: aload 9
    //   279: iload_3
    //   280: invokeinterface 201 2 0
    //   285: ifne +23 -> 308
    //   288: aload 11
    //   290: aload 9
    //   292: iload_3
    //   293: invokeinterface 205 2 0
    //   298: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   301: checkcast 118	java/util/ArrayList
    //   304: astore_1
    //   305: goto +5 -> 310
    //   308: aconst_null
    //   309: astore_1
    //   310: aload_1
    //   311: astore 6
    //   313: aload_1
    //   314: ifnonnull +13 -> 327
    //   317: new 118	java/util/ArrayList
    //   320: astore 6
    //   322: aload 6
    //   324: invokespecial 555	java/util/ArrayList:<init>	()V
    //   327: aload 9
    //   329: iload_3
    //   330: invokeinterface 201 2 0
    //   335: ifne +23 -> 358
    //   338: aload 10
    //   340: aload 9
    //   342: iload_3
    //   343: invokeinterface 205 2 0
    //   348: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   351: checkcast 118	java/util/ArrayList
    //   354: astore_1
    //   355: goto +5 -> 360
    //   358: aconst_null
    //   359: astore_1
    //   360: aload_1
    //   361: astore 7
    //   363: aload_1
    //   364: ifnonnull +13 -> 377
    //   367: new 118	java/util/ArrayList
    //   370: astore 7
    //   372: aload 7
    //   374: invokespecial 555	java/util/ArrayList:<init>	()V
    //   377: new 560	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   380: astore_1
    //   381: aload_1
    //   382: invokespecial 561	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   385: aload_1
    //   386: aload 9
    //   388: iload_3
    //   389: invokeinterface 205 2 0
    //   394: putfield 562	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   397: aload_1
    //   398: aload 9
    //   400: iload 4
    //   402: invokeinterface 340 2 0
    //   407: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   410: putfield 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   413: aload_1
    //   414: aload 9
    //   416: iload 5
    //   418: invokeinterface 213 2 0
    //   423: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   426: putfield 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   429: aload_1
    //   430: aload 9
    //   432: iload_2
    //   433: invokeinterface 340 2 0
    //   438: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   441: aload_1
    //   442: aload 6
    //   444: putfield 569	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   447: aload_1
    //   448: aload 7
    //   450: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   453: aload 12
    //   455: aload_1
    //   456: invokeinterface 456 2 0
    //   461: pop
    //   462: goto -195 -> 267
    //   465: aload_0
    //   466: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   469: invokevirtual 260	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   472: aload 9
    //   474: invokeinterface 194 1 0
    //   479: aload 8
    //   481: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   484: aload_0
    //   485: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   488: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   491: aload 12
    //   493: areturn
    //   494: astore_1
    //   495: aload 9
    //   497: invokeinterface 194 1 0
    //   502: aload 8
    //   504: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   507: aload_1
    //   508: athrow
    //   509: astore_1
    //   510: aload_0
    //   511: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   514: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   517: aload_1
    //   518: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	519	0	this	WorkSpecDao_Impl
    //   0	519	1	paramString	String
    //   93	340	2	i	int
    //   64	325	3	j	int
    //   73	328	4	k	int
    //   83	334	5	m	int
    //   159	284	6	localObject1	Object
    //   361	88	7	localObject2	Object
    //   7	496	8	localRoomSQLiteQuery	RoomSQLiteQuery
    //   54	442	9	localCursor	Cursor
    //   107	232	10	localArrayMap1	ArrayMap
    //   97	192	11	localArrayMap2	ArrayMap
    //   253	239	12	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   56	114	494	finally
    //   114	175	494	finally
    //   175	226	494	finally
    //   229	267	494	finally
    //   267	305	494	finally
    //   317	327	494	finally
    //   327	355	494	finally
    //   367	377	494	finally
    //   377	462	494	finally
    //   465	472	494	finally
    //   43	56	509	finally
    //   472	484	509	finally
    //   495	509	509	finally
  }
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String paramString)
  {
    // Byte code:
    //   0: ldc_w 584
    //   3: iconst_1
    //   4: invokestatic 155	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore 8
    //   9: aload_1
    //   10: ifnonnull +12 -> 22
    //   13: aload 8
    //   15: iconst_1
    //   16: invokevirtual 171	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   19: goto +10 -> 29
    //   22: aload 8
    //   24: iconst_1
    //   25: aload_1
    //   26: invokevirtual 175	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   29: aload_0
    //   30: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   33: invokevirtual 242	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   36: aload_0
    //   37: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   40: invokevirtual 254	androidx/room/RoomDatabase:beginTransaction	()V
    //   43: aload_0
    //   44: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   47: aload 8
    //   49: iconst_1
    //   50: aconst_null
    //   51: invokestatic 181	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   54: astore 9
    //   56: aload 9
    //   58: ldc_w 297
    //   61: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   64: istore_2
    //   65: aload 9
    //   67: ldc_w 299
    //   70: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   73: istore_3
    //   74: aload 9
    //   76: ldc_w 307
    //   79: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   82: istore 5
    //   84: aload 9
    //   86: ldc_w 315
    //   89: invokestatic 281	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   92: istore 4
    //   94: new 90	androidx/collection/ArrayMap
    //   97: astore 10
    //   99: aload 10
    //   101: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   104: new 90	androidx/collection/ArrayMap
    //   107: astore 11
    //   109: aload 11
    //   111: invokespecial 554	androidx/collection/ArrayMap:<init>	()V
    //   114: aload 9
    //   116: invokeinterface 197 1 0
    //   121: ifeq +108 -> 229
    //   124: aload 9
    //   126: iload_2
    //   127: invokeinterface 201 2 0
    //   132: ifne +43 -> 175
    //   135: aload 9
    //   137: iload_2
    //   138: invokeinterface 205 2 0
    //   143: astore_1
    //   144: aload 10
    //   146: aload_1
    //   147: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   150: checkcast 118	java/util/ArrayList
    //   153: ifnonnull +22 -> 175
    //   156: new 118	java/util/ArrayList
    //   159: astore 6
    //   161: aload 6
    //   163: invokespecial 555	java/util/ArrayList:<init>	()V
    //   166: aload 10
    //   168: aload_1
    //   169: aload 6
    //   171: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   174: pop
    //   175: aload 9
    //   177: iload_2
    //   178: invokeinterface 201 2 0
    //   183: ifne -69 -> 114
    //   186: aload 9
    //   188: iload_2
    //   189: invokeinterface 205 2 0
    //   194: astore 6
    //   196: aload 11
    //   198: aload 6
    //   200: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   203: checkcast 118	java/util/ArrayList
    //   206: ifnonnull -92 -> 114
    //   209: new 118	java/util/ArrayList
    //   212: astore_1
    //   213: aload_1
    //   214: invokespecial 555	java/util/ArrayList:<init>	()V
    //   217: aload 11
    //   219: aload 6
    //   221: aload_1
    //   222: invokevirtual 122	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   225: pop
    //   226: goto -112 -> 114
    //   229: aload 9
    //   231: iconst_m1
    //   232: invokeinterface 558 2 0
    //   237: pop
    //   238: aload_0
    //   239: aload 10
    //   241: invokespecial 228	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   244: aload_0
    //   245: aload 11
    //   247: invokespecial 124	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   250: new 118	java/util/ArrayList
    //   253: astore 12
    //   255: aload 12
    //   257: aload 9
    //   259: invokeinterface 332 1 0
    //   264: invokespecial 333	java/util/ArrayList:<init>	(I)V
    //   267: aload 9
    //   269: invokeinterface 197 1 0
    //   274: ifeq +191 -> 465
    //   277: aload 9
    //   279: iload_2
    //   280: invokeinterface 201 2 0
    //   285: ifne +23 -> 308
    //   288: aload 10
    //   290: aload 9
    //   292: iload_2
    //   293: invokeinterface 205 2 0
    //   298: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   301: checkcast 118	java/util/ArrayList
    //   304: astore_1
    //   305: goto +5 -> 310
    //   308: aconst_null
    //   309: astore_1
    //   310: aload_1
    //   311: astore 6
    //   313: aload_1
    //   314: ifnonnull +13 -> 327
    //   317: new 118	java/util/ArrayList
    //   320: astore 6
    //   322: aload 6
    //   324: invokespecial 555	java/util/ArrayList:<init>	()V
    //   327: aload 9
    //   329: iload_2
    //   330: invokeinterface 201 2 0
    //   335: ifne +23 -> 358
    //   338: aload 11
    //   340: aload 9
    //   342: iload_2
    //   343: invokeinterface 205 2 0
    //   348: invokevirtual 209	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   351: checkcast 118	java/util/ArrayList
    //   354: astore_1
    //   355: goto +5 -> 360
    //   358: aconst_null
    //   359: astore_1
    //   360: aload_1
    //   361: astore 7
    //   363: aload_1
    //   364: ifnonnull +13 -> 377
    //   367: new 118	java/util/ArrayList
    //   370: astore 7
    //   372: aload 7
    //   374: invokespecial 555	java/util/ArrayList:<init>	()V
    //   377: new 560	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   380: astore_1
    //   381: aload_1
    //   382: invokespecial 561	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   385: aload_1
    //   386: aload 9
    //   388: iload_2
    //   389: invokeinterface 205 2 0
    //   394: putfield 562	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   397: aload_1
    //   398: aload 9
    //   400: iload_3
    //   401: invokeinterface 340 2 0
    //   406: invokestatic 391	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   409: putfield 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   412: aload_1
    //   413: aload 9
    //   415: iload 5
    //   417: invokeinterface 213 2 0
    //   422: invokestatic 219	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   425: putfield 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   428: aload_1
    //   429: aload 9
    //   431: iload 4
    //   433: invokeinterface 340 2 0
    //   438: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   441: aload_1
    //   442: aload 6
    //   444: putfield 569	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   447: aload_1
    //   448: aload 7
    //   450: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   453: aload 12
    //   455: aload_1
    //   456: invokeinterface 456 2 0
    //   461: pop
    //   462: goto -195 -> 267
    //   465: aload_0
    //   466: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   469: invokevirtual 260	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   472: aload 9
    //   474: invokeinterface 194 1 0
    //   479: aload 8
    //   481: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   484: aload_0
    //   485: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   488: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   491: aload 12
    //   493: areturn
    //   494: astore_1
    //   495: aload 9
    //   497: invokeinterface 194 1 0
    //   502: aload 8
    //   504: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   507: aload_1
    //   508: athrow
    //   509: astore_1
    //   510: aload_0
    //   511: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   514: invokevirtual 263	androidx/room/RoomDatabase:endTransaction	()V
    //   517: aload_1
    //   518: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	519	0	this	WorkSpecDao_Impl
    //   0	519	1	paramString	String
    //   64	325	2	i	int
    //   73	328	3	j	int
    //   92	340	4	k	int
    //   82	334	5	m	int
    //   159	284	6	localObject1	Object
    //   361	88	7	localObject2	Object
    //   7	496	8	localRoomSQLiteQuery	RoomSQLiteQuery
    //   54	442	9	localCursor	Cursor
    //   97	192	10	localArrayMap1	ArrayMap
    //   107	232	11	localArrayMap2	ArrayMap
    //   253	239	12	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   56	114	494	finally
    //   114	175	494	finally
    //   175	226	494	finally
    //   229	267	494	finally
    //   267	305	494	finally
    //   317	327	494	finally
    //   327	355	494	finally
    //   367	377	494	finally
    //   377	462	494	finally
    //   465	472	494	finally
    //   43	56	509	finally
    //   472	484	509	finally
    //   495	509	509	finally
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> paramList)
  {
    final Object localObject = StringUtil.newStringBuilder();
    ((StringBuilder)localObject).append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
    int i = paramList.size();
    StringUtil.appendPlaceholders((StringBuilder)localObject, i);
    ((StringBuilder)localObject).append(")");
    localObject = RoomSQLiteQuery.acquire(((StringBuilder)localObject).toString(), i + 0);
    Iterator localIterator = paramList.iterator();
    for (i = 1; localIterator.hasNext(); i++)
    {
      paramList = (String)localIterator.next();
      if (paramList == null) {
        ((RoomSQLiteQuery)localObject).bindNull(i);
      } else {
        ((RoomSQLiteQuery)localObject).bindString(i, paramList);
      }
    }
    paramList = this.__db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 44	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$11:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_1
        //   22: aconst_null
        //   23: invokestatic 50	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore 8
        //   28: aload 8
        //   30: ldc 52
        //   32: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   35: istore 4
        //   37: aload 8
        //   39: ldc 60
        //   41: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   44: istore_3
        //   45: aload 8
        //   47: ldc 62
        //   49: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   52: istore_1
        //   53: aload 8
        //   55: ldc 64
        //   57: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   60: istore_2
        //   61: new 66	androidx/collection/ArrayMap
        //   64: astore 10
        //   66: aload 10
        //   68: invokespecial 67	androidx/collection/ArrayMap:<init>	()V
        //   71: new 66	androidx/collection/ArrayMap
        //   74: astore 9
        //   76: aload 9
        //   78: invokespecial 67	androidx/collection/ArrayMap:<init>	()V
        //   81: aload 8
        //   83: invokeinterface 73 1 0
        //   88: ifeq +118 -> 206
        //   91: aload 8
        //   93: iload 4
        //   95: invokeinterface 77 2 0
        //   100: ifne +47 -> 147
        //   103: aload 8
        //   105: iload 4
        //   107: invokeinterface 81 2 0
        //   112: astore 6
        //   114: aload 10
        //   116: aload 6
        //   118: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   121: checkcast 87	java/util/ArrayList
        //   124: ifnonnull +23 -> 147
        //   127: new 87	java/util/ArrayList
        //   130: astore 5
        //   132: aload 5
        //   134: invokespecial 88	java/util/ArrayList:<init>	()V
        //   137: aload 10
        //   139: aload 6
        //   141: aload 5
        //   143: invokevirtual 92	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   146: pop
        //   147: aload 8
        //   149: iload 4
        //   151: invokeinterface 77 2 0
        //   156: ifne -75 -> 81
        //   159: aload 8
        //   161: iload 4
        //   163: invokeinterface 81 2 0
        //   168: astore 6
        //   170: aload 9
        //   172: aload 6
        //   174: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   177: checkcast 87	java/util/ArrayList
        //   180: ifnonnull -99 -> 81
        //   183: new 87	java/util/ArrayList
        //   186: astore 5
        //   188: aload 5
        //   190: invokespecial 88	java/util/ArrayList:<init>	()V
        //   193: aload 9
        //   195: aload 6
        //   197: aload 5
        //   199: invokevirtual 92	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   202: pop
        //   203: goto -122 -> 81
        //   206: aload 8
        //   208: iconst_m1
        //   209: invokeinterface 95 2 0
        //   214: pop
        //   215: aload_0
        //   216: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   219: aload 10
        //   221: invokestatic 99	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   224: aload_0
        //   225: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   228: aload 9
        //   230: invokestatic 102	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   233: new 87	java/util/ArrayList
        //   236: astore 11
        //   238: aload 11
        //   240: aload 8
        //   242: invokeinterface 106 1 0
        //   247: invokespecial 109	java/util/ArrayList:<init>	(I)V
        //   250: aload 8
        //   252: invokeinterface 73 1 0
        //   257: ifeq +211 -> 468
        //   260: aload 8
        //   262: iload 4
        //   264: invokeinterface 77 2 0
        //   269: ifne +25 -> 294
        //   272: aload 10
        //   274: aload 8
        //   276: iload 4
        //   278: invokeinterface 81 2 0
        //   283: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   286: checkcast 87	java/util/ArrayList
        //   289: astore 5
        //   291: goto +6 -> 297
        //   294: aconst_null
        //   295: astore 5
        //   297: aload 5
        //   299: astore 6
        //   301: aload 5
        //   303: ifnonnull +13 -> 316
        //   306: new 87	java/util/ArrayList
        //   309: astore 6
        //   311: aload 6
        //   313: invokespecial 88	java/util/ArrayList:<init>	()V
        //   316: aload 8
        //   318: iload 4
        //   320: invokeinterface 77 2 0
        //   325: ifne +25 -> 350
        //   328: aload 9
        //   330: aload 8
        //   332: iload 4
        //   334: invokeinterface 81 2 0
        //   339: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   342: checkcast 87	java/util/ArrayList
        //   345: astore 5
        //   347: goto +6 -> 353
        //   350: aconst_null
        //   351: astore 5
        //   353: aload 5
        //   355: astore 7
        //   357: aload 5
        //   359: ifnonnull +13 -> 372
        //   362: new 87	java/util/ArrayList
        //   365: astore 7
        //   367: aload 7
        //   369: invokespecial 88	java/util/ArrayList:<init>	()V
        //   372: new 111	androidx/work/impl/model/WorkSpec$WorkInfoPojo
        //   375: astore 5
        //   377: aload 5
        //   379: invokespecial 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
        //   382: aload 5
        //   384: aload 8
        //   386: iload 4
        //   388: invokeinterface 81 2 0
        //   393: putfield 115	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
        //   396: aload 5
        //   398: aload 8
        //   400: iload_3
        //   401: invokeinterface 119 2 0
        //   406: invokestatic 125	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
        //   409: putfield 128	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
        //   412: aload 5
        //   414: aload 8
        //   416: iload_1
        //   417: invokeinterface 132 2 0
        //   422: invokestatic 138	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
        //   425: putfield 141	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
        //   428: aload 5
        //   430: aload 8
        //   432: iload_2
        //   433: invokeinterface 119 2 0
        //   438: putfield 145	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
        //   441: aload 5
        //   443: aload 6
        //   445: putfield 149	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
        //   448: aload 5
        //   450: aload 7
        //   452: putfield 152	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
        //   455: aload 11
        //   457: aload 5
        //   459: invokeinterface 158 2 0
        //   464: pop
        //   465: goto -215 -> 250
        //   468: aload_0
        //   469: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   472: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   475: invokevirtual 161	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   478: aload 8
        //   480: invokeinterface 164 1 0
        //   485: aload_0
        //   486: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   489: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   492: invokevirtual 167	androidx/room/RoomDatabase:endTransaction	()V
        //   495: aload 11
        //   497: areturn
        //   498: astore 5
        //   500: aload 8
        //   502: invokeinterface 164 1 0
        //   507: aload 5
        //   509: athrow
        //   510: astore 5
        //   512: aload_0
        //   513: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   516: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   519: invokevirtual 167	androidx/room/RoomDatabase:endTransaction	()V
        //   522: aload 5
        //   524: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	525	0	this	11
        //   52	365	1	i	int
        //   60	373	2	j	int
        //   44	357	3	k	int
        //   35	352	4	m	int
        //   130	328	5	localObject1	Object
        //   498	10	5	localObject2	Object
        //   510	13	5	localObject3	Object
        //   112	332	6	localObject4	Object
        //   355	96	7	localObject5	Object
        //   26	475	8	localCursor	Cursor
        //   74	255	9	localArrayMap1	ArrayMap
        //   64	209	10	localArrayMap2	ArrayMap
        //   236	260	11	localArrayList	ArrayList
        // Exception table:
        //   from	to	target	type
        //   28	81	498	finally
        //   81	147	498	finally
        //   147	203	498	finally
        //   206	250	498	finally
        //   250	291	498	finally
        //   306	316	498	finally
        //   316	347	498	finally
        //   362	372	498	finally
        //   372	465	498	finally
        //   468	478	498	finally
        //   10	28	510	finally
        //   478	485	510	finally
        //   500	510	510	finally
      }
      
      protected void finalize()
      {
        localObject.release();
      }
    };
    return paramList.createLiveData(new String[] { "WorkTag", "WorkProgress", "workspec" }, true, (Callable)localObject);
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = this.__db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 44	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$13:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_1
        //   22: aconst_null
        //   23: invokestatic 50	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore 8
        //   28: aload 8
        //   30: ldc 52
        //   32: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   35: istore_2
        //   36: aload 8
        //   38: ldc 60
        //   40: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   43: istore 4
        //   45: aload 8
        //   47: ldc 62
        //   49: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   52: istore_1
        //   53: aload 8
        //   55: ldc 64
        //   57: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   60: istore_3
        //   61: new 66	androidx/collection/ArrayMap
        //   64: astore 9
        //   66: aload 9
        //   68: invokespecial 67	androidx/collection/ArrayMap:<init>	()V
        //   71: new 66	androidx/collection/ArrayMap
        //   74: astore 10
        //   76: aload 10
        //   78: invokespecial 67	androidx/collection/ArrayMap:<init>	()V
        //   81: aload 8
        //   83: invokeinterface 73 1 0
        //   88: ifeq +114 -> 202
        //   91: aload 8
        //   93: iload_2
        //   94: invokeinterface 77 2 0
        //   99: ifne +46 -> 145
        //   102: aload 8
        //   104: iload_2
        //   105: invokeinterface 81 2 0
        //   110: astore 6
        //   112: aload 9
        //   114: aload 6
        //   116: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   119: checkcast 87	java/util/ArrayList
        //   122: ifnonnull +23 -> 145
        //   125: new 87	java/util/ArrayList
        //   128: astore 5
        //   130: aload 5
        //   132: invokespecial 88	java/util/ArrayList:<init>	()V
        //   135: aload 9
        //   137: aload 6
        //   139: aload 5
        //   141: invokevirtual 92	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   144: pop
        //   145: aload 8
        //   147: iload_2
        //   148: invokeinterface 77 2 0
        //   153: ifne -72 -> 81
        //   156: aload 8
        //   158: iload_2
        //   159: invokeinterface 81 2 0
        //   164: astore 5
        //   166: aload 10
        //   168: aload 5
        //   170: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   173: checkcast 87	java/util/ArrayList
        //   176: ifnonnull -95 -> 81
        //   179: new 87	java/util/ArrayList
        //   182: astore 6
        //   184: aload 6
        //   186: invokespecial 88	java/util/ArrayList:<init>	()V
        //   189: aload 10
        //   191: aload 5
        //   193: aload 6
        //   195: invokevirtual 92	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   198: pop
        //   199: goto -118 -> 81
        //   202: aload 8
        //   204: iconst_m1
        //   205: invokeinterface 95 2 0
        //   210: pop
        //   211: aload_0
        //   212: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   215: aload 9
        //   217: invokestatic 99	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   220: aload_0
        //   221: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   224: aload 10
        //   226: invokestatic 102	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   229: new 87	java/util/ArrayList
        //   232: astore 11
        //   234: aload 11
        //   236: aload 8
        //   238: invokeinterface 106 1 0
        //   243: invokespecial 109	java/util/ArrayList:<init>	(I)V
        //   246: aload 8
        //   248: invokeinterface 73 1 0
        //   253: ifeq +207 -> 460
        //   256: aload 8
        //   258: iload_2
        //   259: invokeinterface 77 2 0
        //   264: ifne +24 -> 288
        //   267: aload 9
        //   269: aload 8
        //   271: iload_2
        //   272: invokeinterface 81 2 0
        //   277: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   280: checkcast 87	java/util/ArrayList
        //   283: astore 5
        //   285: goto +6 -> 291
        //   288: aconst_null
        //   289: astore 5
        //   291: aload 5
        //   293: astore 6
        //   295: aload 5
        //   297: ifnonnull +13 -> 310
        //   300: new 87	java/util/ArrayList
        //   303: astore 6
        //   305: aload 6
        //   307: invokespecial 88	java/util/ArrayList:<init>	()V
        //   310: aload 8
        //   312: iload_2
        //   313: invokeinterface 77 2 0
        //   318: ifne +24 -> 342
        //   321: aload 10
        //   323: aload 8
        //   325: iload_2
        //   326: invokeinterface 81 2 0
        //   331: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   334: checkcast 87	java/util/ArrayList
        //   337: astore 5
        //   339: goto +6 -> 345
        //   342: aconst_null
        //   343: astore 5
        //   345: aload 5
        //   347: astore 7
        //   349: aload 5
        //   351: ifnonnull +13 -> 364
        //   354: new 87	java/util/ArrayList
        //   357: astore 7
        //   359: aload 7
        //   361: invokespecial 88	java/util/ArrayList:<init>	()V
        //   364: new 111	androidx/work/impl/model/WorkSpec$WorkInfoPojo
        //   367: astore 5
        //   369: aload 5
        //   371: invokespecial 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
        //   374: aload 5
        //   376: aload 8
        //   378: iload_2
        //   379: invokeinterface 81 2 0
        //   384: putfield 115	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
        //   387: aload 5
        //   389: aload 8
        //   391: iload 4
        //   393: invokeinterface 119 2 0
        //   398: invokestatic 125	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
        //   401: putfield 128	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
        //   404: aload 5
        //   406: aload 8
        //   408: iload_1
        //   409: invokeinterface 132 2 0
        //   414: invokestatic 138	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
        //   417: putfield 141	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
        //   420: aload 5
        //   422: aload 8
        //   424: iload_3
        //   425: invokeinterface 119 2 0
        //   430: putfield 145	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
        //   433: aload 5
        //   435: aload 6
        //   437: putfield 149	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
        //   440: aload 5
        //   442: aload 7
        //   444: putfield 152	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
        //   447: aload 11
        //   449: aload 5
        //   451: invokeinterface 158 2 0
        //   456: pop
        //   457: goto -211 -> 246
        //   460: aload_0
        //   461: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   464: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   467: invokevirtual 161	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   470: aload 8
        //   472: invokeinterface 164 1 0
        //   477: aload_0
        //   478: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   481: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   484: invokevirtual 167	androidx/room/RoomDatabase:endTransaction	()V
        //   487: aload 11
        //   489: areturn
        //   490: astore 5
        //   492: aload 8
        //   494: invokeinterface 164 1 0
        //   499: aload 5
        //   501: athrow
        //   502: astore 5
        //   504: aload_0
        //   505: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   508: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   511: invokevirtual 167	androidx/room/RoomDatabase:endTransaction	()V
        //   514: aload 5
        //   516: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	517	0	this	13
        //   52	357	1	i	int
        //   35	344	2	j	int
        //   60	365	3	k	int
        //   43	349	4	m	int
        //   128	322	5	localObject1	Object
        //   490	10	5	localObject2	Object
        //   502	13	5	localObject3	Object
        //   110	326	6	localObject4	Object
        //   347	96	7	localObject5	Object
        //   26	467	8	localCursor	Cursor
        //   64	204	9	localArrayMap1	ArrayMap
        //   74	248	10	localArrayMap2	ArrayMap
        //   232	256	11	localArrayList	ArrayList
        // Exception table:
        //   from	to	target	type
        //   28	81	490	finally
        //   81	145	490	finally
        //   145	199	490	finally
        //   202	246	490	finally
        //   246	285	490	finally
        //   300	310	490	finally
        //   310	339	490	finally
        //   354	364	490	finally
        //   364	457	490	finally
        //   460	470	490	finally
        //   10	28	502	finally
        //   470	477	502	finally
        //   492	502	502	finally
      }
      
      protected void finalize()
      {
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "WorkTag", "WorkProgress", "workspec", "workname" }, true, (Callable)localObject);
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = this.__db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 44	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$12:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_1
        //   22: aconst_null
        //   23: invokestatic 50	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore 8
        //   28: aload 8
        //   30: ldc 52
        //   32: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   35: istore 4
        //   37: aload 8
        //   39: ldc 60
        //   41: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   44: istore_2
        //   45: aload 8
        //   47: ldc 62
        //   49: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   52: istore_1
        //   53: aload 8
        //   55: ldc 64
        //   57: invokestatic 58	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   60: istore_3
        //   61: new 66	androidx/collection/ArrayMap
        //   64: astore 9
        //   66: aload 9
        //   68: invokespecial 67	androidx/collection/ArrayMap:<init>	()V
        //   71: new 66	androidx/collection/ArrayMap
        //   74: astore 10
        //   76: aload 10
        //   78: invokespecial 67	androidx/collection/ArrayMap:<init>	()V
        //   81: aload 8
        //   83: invokeinterface 73 1 0
        //   88: ifeq +118 -> 206
        //   91: aload 8
        //   93: iload 4
        //   95: invokeinterface 77 2 0
        //   100: ifne +47 -> 147
        //   103: aload 8
        //   105: iload 4
        //   107: invokeinterface 81 2 0
        //   112: astore 6
        //   114: aload 9
        //   116: aload 6
        //   118: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   121: checkcast 87	java/util/ArrayList
        //   124: ifnonnull +23 -> 147
        //   127: new 87	java/util/ArrayList
        //   130: astore 5
        //   132: aload 5
        //   134: invokespecial 88	java/util/ArrayList:<init>	()V
        //   137: aload 9
        //   139: aload 6
        //   141: aload 5
        //   143: invokevirtual 92	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   146: pop
        //   147: aload 8
        //   149: iload 4
        //   151: invokeinterface 77 2 0
        //   156: ifne -75 -> 81
        //   159: aload 8
        //   161: iload 4
        //   163: invokeinterface 81 2 0
        //   168: astore 6
        //   170: aload 10
        //   172: aload 6
        //   174: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   177: checkcast 87	java/util/ArrayList
        //   180: ifnonnull -99 -> 81
        //   183: new 87	java/util/ArrayList
        //   186: astore 5
        //   188: aload 5
        //   190: invokespecial 88	java/util/ArrayList:<init>	()V
        //   193: aload 10
        //   195: aload 6
        //   197: aload 5
        //   199: invokevirtual 92	androidx/collection/ArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   202: pop
        //   203: goto -122 -> 81
        //   206: aload 8
        //   208: iconst_m1
        //   209: invokeinterface 95 2 0
        //   214: pop
        //   215: aload_0
        //   216: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   219: aload 9
        //   221: invokestatic 99	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   224: aload_0
        //   225: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   228: aload 10
        //   230: invokestatic 102	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   233: new 87	java/util/ArrayList
        //   236: astore 11
        //   238: aload 11
        //   240: aload 8
        //   242: invokeinterface 106 1 0
        //   247: invokespecial 109	java/util/ArrayList:<init>	(I)V
        //   250: aload 8
        //   252: invokeinterface 73 1 0
        //   257: ifeq +211 -> 468
        //   260: aload 8
        //   262: iload 4
        //   264: invokeinterface 77 2 0
        //   269: ifne +25 -> 294
        //   272: aload 9
        //   274: aload 8
        //   276: iload 4
        //   278: invokeinterface 81 2 0
        //   283: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   286: checkcast 87	java/util/ArrayList
        //   289: astore 5
        //   291: goto +6 -> 297
        //   294: aconst_null
        //   295: astore 5
        //   297: aload 5
        //   299: astore 6
        //   301: aload 5
        //   303: ifnonnull +13 -> 316
        //   306: new 87	java/util/ArrayList
        //   309: astore 6
        //   311: aload 6
        //   313: invokespecial 88	java/util/ArrayList:<init>	()V
        //   316: aload 8
        //   318: iload 4
        //   320: invokeinterface 77 2 0
        //   325: ifne +25 -> 350
        //   328: aload 10
        //   330: aload 8
        //   332: iload 4
        //   334: invokeinterface 81 2 0
        //   339: invokevirtual 85	androidx/collection/ArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   342: checkcast 87	java/util/ArrayList
        //   345: astore 5
        //   347: goto +6 -> 353
        //   350: aconst_null
        //   351: astore 5
        //   353: aload 5
        //   355: astore 7
        //   357: aload 5
        //   359: ifnonnull +13 -> 372
        //   362: new 87	java/util/ArrayList
        //   365: astore 7
        //   367: aload 7
        //   369: invokespecial 88	java/util/ArrayList:<init>	()V
        //   372: new 111	androidx/work/impl/model/WorkSpec$WorkInfoPojo
        //   375: astore 5
        //   377: aload 5
        //   379: invokespecial 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
        //   382: aload 5
        //   384: aload 8
        //   386: iload 4
        //   388: invokeinterface 81 2 0
        //   393: putfield 115	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
        //   396: aload 5
        //   398: aload 8
        //   400: iload_2
        //   401: invokeinterface 119 2 0
        //   406: invokestatic 125	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
        //   409: putfield 128	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
        //   412: aload 5
        //   414: aload 8
        //   416: iload_1
        //   417: invokeinterface 132 2 0
        //   422: invokestatic 138	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
        //   425: putfield 141	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
        //   428: aload 5
        //   430: aload 8
        //   432: iload_3
        //   433: invokeinterface 119 2 0
        //   438: putfield 145	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
        //   441: aload 5
        //   443: aload 6
        //   445: putfield 149	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
        //   448: aload 5
        //   450: aload 7
        //   452: putfield 152	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
        //   455: aload 11
        //   457: aload 5
        //   459: invokeinterface 158 2 0
        //   464: pop
        //   465: goto -215 -> 250
        //   468: aload_0
        //   469: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   472: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   475: invokevirtual 161	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   478: aload 8
        //   480: invokeinterface 164 1 0
        //   485: aload_0
        //   486: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   489: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   492: invokevirtual 167	androidx/room/RoomDatabase:endTransaction	()V
        //   495: aload 11
        //   497: areturn
        //   498: astore 5
        //   500: aload 8
        //   502: invokeinterface 164 1 0
        //   507: aload 5
        //   509: athrow
        //   510: astore 5
        //   512: aload_0
        //   513: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   516: invokestatic 39	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   519: invokevirtual 167	androidx/room/RoomDatabase:endTransaction	()V
        //   522: aload 5
        //   524: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	525	0	this	12
        //   52	365	1	i	int
        //   44	357	2	j	int
        //   60	373	3	k	int
        //   35	352	4	m	int
        //   130	328	5	localObject1	Object
        //   498	10	5	localObject2	Object
        //   510	13	5	localObject3	Object
        //   112	332	6	localObject4	Object
        //   355	96	7	localObject5	Object
        //   26	475	8	localCursor	Cursor
        //   64	209	9	localArrayMap1	ArrayMap
        //   74	255	10	localArrayMap2	ArrayMap
        //   236	260	11	localArrayList	ArrayList
        // Exception table:
        //   from	to	target	type
        //   28	81	498	finally
        //   81	147	498	finally
        //   147	203	498	finally
        //   206	250	498	finally
        //   250	291	498	finally
        //   306	316	498	finally
        //   316	347	498	finally
        //   362	372	498	finally
        //   372	465	498	finally
        //   468	478	498	finally
        //   10	28	510	finally
        //   478	485	510	finally
        //   500	510	510	finally
      }
      
      protected void finalize()
      {
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "WorkTag", "WorkProgress", "workspec", "worktag" }, true, (Callable)localObject);
  }
  
  public boolean hasUnfinishedWork()
  {
    boolean bool2 = false;
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
    this.__db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(this.__db, localRoomSQLiteQuery, false, null);
    boolean bool1 = bool2;
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        bool1 = bool2;
        if (i != 0) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public int incrementWorkSpecRunAttemptCount(String paramString)
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    this.__db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      this.__db.endTransaction();
      this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(localSupportSQLiteStatement);
    }
  }
  
  public void insertWorkSpec(WorkSpec paramWorkSpec)
  {
    this.__db.assertNotSuspendingTransaction();
    this.__db.beginTransaction();
    try
    {
      this.__insertionAdapterOfWorkSpec.insert(paramWorkSpec);
      this.__db.setTransactionSuccessful();
      return;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
  
  public int markWorkSpecScheduled(String paramString, long paramLong)
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
    localSupportSQLiteStatement.bindLong(1, paramLong);
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(2);
    } else {
      localSupportSQLiteStatement.bindString(2, paramString);
    }
    this.__db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      this.__db.endTransaction();
      this.__preparedStmtOfMarkWorkSpecScheduled.release(localSupportSQLiteStatement);
    }
  }
  
  public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast()
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
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
      this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(localSupportSQLiteStatement);
    }
  }
  
  public int resetScheduledState()
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfResetScheduledState.acquire();
    this.__db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      this.__db.endTransaction();
      this.__preparedStmtOfResetScheduledState.release(localSupportSQLiteStatement);
    }
  }
  
  public int resetWorkSpecRunAttemptCount(String paramString)
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    this.__db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      this.__db.endTransaction();
      this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(localSupportSQLiteStatement);
    }
  }
  
  public void setOutput(String paramString, Data paramData)
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfSetOutput.acquire();
    paramData = Data.toByteArrayInternal(paramData);
    if (paramData == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindBlob(1, paramData);
    }
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(2);
    } else {
      localSupportSQLiteStatement.bindString(2, paramString);
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
      this.__preparedStmtOfSetOutput.release(localSupportSQLiteStatement);
    }
  }
  
  public void setPeriodStartTime(String paramString, long paramLong)
  {
    this.__db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = this.__preparedStmtOfSetPeriodStartTime.acquire();
    localSupportSQLiteStatement.bindLong(1, paramLong);
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(2);
    } else {
      localSupportSQLiteStatement.bindString(2, paramString);
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
      this.__preparedStmtOfSetPeriodStartTime.release(localSupportSQLiteStatement);
    }
  }
  
  public int setState(WorkInfo.State paramState, String... paramVarArgs)
  {
    this.__db.assertNotSuspendingTransaction();
    Object localObject = StringUtil.newStringBuilder();
    ((StringBuilder)localObject).append("UPDATE workspec SET state=");
    ((StringBuilder)localObject).append("?");
    ((StringBuilder)localObject).append(" WHERE id IN (");
    StringUtil.appendPlaceholders((StringBuilder)localObject, paramVarArgs.length);
    ((StringBuilder)localObject).append(")");
    localObject = ((StringBuilder)localObject).toString();
    localObject = this.__db.compileStatement((String)localObject);
    ((SupportSQLiteStatement)localObject).bindLong(1, WorkTypeConverters.stateToInt(paramState));
    int k = paramVarArgs.length;
    int j = 2;
    for (int i = 0; i < k; i++)
    {
      paramState = paramVarArgs[i];
      if (paramState == null) {
        ((SupportSQLiteStatement)localObject).bindNull(j);
      } else {
        ((SupportSQLiteStatement)localObject).bindString(j, paramState);
      }
      j++;
    }
    this.__db.beginTransaction();
    try
    {
      i = ((SupportSQLiteStatement)localObject).executeUpdateDelete();
      this.__db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      this.__db.endTransaction();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\model\WorkSpecDao_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */