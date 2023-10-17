package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class InvalidationTracker
{
  private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
  private static final String INVALIDATED_COLUMN_NAME = "invalidated";
  static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
  static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
  private static final String TABLE_ID_COLUMN_NAME = "table_id";
  private static final String[] TRIGGERS = { "UPDATE", "DELETE", "INSERT" };
  private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
  volatile SupportSQLiteStatement mCleanupStatement;
  final RoomDatabase mDatabase;
  private volatile boolean mInitialized;
  private final InvalidationLiveDataContainer mInvalidationLiveDataContainer;
  private MultiInstanceInvalidationClient mMultiInstanceInvalidationClient;
  private ObservedTableTracker mObservedTableTracker;
  final SafeIterableMap<Observer, ObserverWrapper> mObserverMap;
  AtomicBoolean mPendingRefresh;
  Runnable mRefreshRunnable;
  final HashMap<String, Integer> mTableIdLookup;
  final String[] mTableNames;
  private Map<String, Set<String>> mViewTables;
  
  public InvalidationTracker(RoomDatabase paramRoomDatabase, Map<String, String> paramMap, Map<String, Set<String>> paramMap1, String... paramVarArgs)
  {
    int i = 0;
    this.mPendingRefresh = new AtomicBoolean(false);
    this.mInitialized = false;
    this.mObserverMap = new SafeIterableMap();
    this.mRefreshRunnable = new Runnable()
    {
      private Set<Integer> checkUpdatedTable()
      {
        HashSet localHashSet = new HashSet();
        Cursor localCursor = InvalidationTracker.this.mDatabase.query(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        try
        {
          while (localCursor.moveToNext()) {
            localHashSet.add(Integer.valueOf(localCursor.getInt(0)));
          }
          localCursor.close();
          if (!localHashSet.isEmpty()) {
            InvalidationTracker.this.mCleanupStatement.executeUpdateDelete();
          }
          return localHashSet;
        }
        finally
        {
          localCursor.close();
        }
      }
      
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   4: getfield 28	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   7: invokevirtual 87	androidx/room/RoomDatabase:getCloseLock	()Ljava/util/concurrent/locks/Lock;
        //   10: astore 7
        //   12: aconst_null
        //   13: astore 4
        //   15: aconst_null
        //   16: astore 5
        //   18: aconst_null
        //   19: astore 6
        //   21: aload 4
        //   23: astore_3
        //   24: aload 5
        //   26: astore_2
        //   27: aload 7
        //   29: invokeinterface 92 1 0
        //   34: aload 4
        //   36: astore_3
        //   37: aload 5
        //   39: astore_2
        //   40: aload_0
        //   41: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   44: invokevirtual 95	androidx/room/InvalidationTracker:ensureInitialization	()Z
        //   47: istore_1
        //   48: iload_1
        //   49: ifne +11 -> 60
        //   52: aload 7
        //   54: invokeinterface 98 1 0
        //   59: return
        //   60: aload 4
        //   62: astore_3
        //   63: aload 5
        //   65: astore_2
        //   66: aload_0
        //   67: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   70: getfield 102	androidx/room/InvalidationTracker:mPendingRefresh	Ljava/util/concurrent/atomic/AtomicBoolean;
        //   73: iconst_1
        //   74: iconst_0
        //   75: invokevirtual 108	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
        //   78: istore_1
        //   79: iload_1
        //   80: ifne +11 -> 91
        //   83: aload 7
        //   85: invokeinterface 98 1 0
        //   90: return
        //   91: aload 4
        //   93: astore_3
        //   94: aload 5
        //   96: astore_2
        //   97: aload_0
        //   98: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   101: getfield 28	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   104: invokevirtual 111	androidx/room/RoomDatabase:inTransaction	()Z
        //   107: istore_1
        //   108: iload_1
        //   109: ifeq +11 -> 120
        //   112: aload 7
        //   114: invokeinterface 98 1 0
        //   119: return
        //   120: aload 4
        //   122: astore_3
        //   123: aload 5
        //   125: astore_2
        //   126: aload_0
        //   127: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   130: getfield 28	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   133: getfield 115	androidx/room/RoomDatabase:mWriteAheadLoggingEnabled	Z
        //   136: ifeq +103 -> 239
        //   139: aload 4
        //   141: astore_3
        //   142: aload 5
        //   144: astore_2
        //   145: aload_0
        //   146: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   149: getfield 28	androidx/room/InvalidationTracker:mDatabase	Landroidx/room/RoomDatabase;
        //   152: invokevirtual 119	androidx/room/RoomDatabase:getOpenHelper	()Landroidx/sqlite/db/SupportSQLiteOpenHelper;
        //   155: invokeinterface 125 1 0
        //   160: astore 8
        //   162: aload 4
        //   164: astore_3
        //   165: aload 5
        //   167: astore_2
        //   168: aload 8
        //   170: invokeinterface 130 1 0
        //   175: aload 6
        //   177: astore 4
        //   179: aload_0
        //   180: invokespecial 132	androidx/room/InvalidationTracker$1:checkUpdatedTable	()Ljava/util/Set;
        //   183: astore 5
        //   185: aload 5
        //   187: astore 4
        //   189: aload 8
        //   191: invokeinterface 135 1 0
        //   196: aload 5
        //   198: astore_3
        //   199: aload 5
        //   201: astore_2
        //   202: aload 8
        //   204: invokeinterface 138 1 0
        //   209: aload 5
        //   211: astore_2
        //   212: goto +69 -> 281
        //   215: astore 5
        //   217: aload 4
        //   219: astore_3
        //   220: aload 4
        //   222: astore_2
        //   223: aload 8
        //   225: invokeinterface 138 1 0
        //   230: aload 4
        //   232: astore_3
        //   233: aload 4
        //   235: astore_2
        //   236: aload 5
        //   238: athrow
        //   239: aload 4
        //   241: astore_3
        //   242: aload 5
        //   244: astore_2
        //   245: aload_0
        //   246: invokespecial 132	androidx/room/InvalidationTracker$1:checkUpdatedTable	()Ljava/util/Set;
        //   249: astore 4
        //   251: aload 4
        //   253: astore_2
        //   254: goto +27 -> 281
        //   257: astore_2
        //   258: goto +111 -> 369
        //   261: astore 4
        //   263: aload_3
        //   264: astore_2
        //   265: aload 4
        //   267: astore_3
        //   268: goto +4 -> 272
        //   271: astore_3
        //   272: ldc -116
        //   274: ldc -114
        //   276: aload_3
        //   277: invokestatic 148	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   280: pop
        //   281: aload 7
        //   283: invokeinterface 98 1 0
        //   288: aload_2
        //   289: ifnull +79 -> 368
        //   292: aload_2
        //   293: invokeinterface 151 1 0
        //   298: ifne +70 -> 368
        //   301: aload_0
        //   302: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   305: getfield 155	androidx/room/InvalidationTracker:mObserverMap	Landroidx/arch/core/internal/SafeIterableMap;
        //   308: astore_3
        //   309: aload_3
        //   310: monitorenter
        //   311: aload_0
        //   312: getfield 14	androidx/room/InvalidationTracker$1:this$0	Landroidx/room/InvalidationTracker;
        //   315: getfield 155	androidx/room/InvalidationTracker:mObserverMap	Landroidx/arch/core/internal/SafeIterableMap;
        //   318: invokevirtual 161	androidx/arch/core/internal/SafeIterableMap:iterator	()Ljava/util/Iterator;
        //   321: astore 4
        //   323: aload 4
        //   325: invokeinterface 166 1 0
        //   330: ifeq +28 -> 358
        //   333: aload 4
        //   335: invokeinterface 170 1 0
        //   340: checkcast 172	java/util/Map$Entry
        //   343: invokeinterface 175 1 0
        //   348: checkcast 177	androidx/room/InvalidationTracker$ObserverWrapper
        //   351: aload_2
        //   352: invokevirtual 181	androidx/room/InvalidationTracker$ObserverWrapper:notifyByTableInvalidStatus	(Ljava/util/Set;)V
        //   355: goto -32 -> 323
        //   358: aload_3
        //   359: monitorexit
        //   360: goto +8 -> 368
        //   363: astore_2
        //   364: aload_3
        //   365: monitorexit
        //   366: aload_2
        //   367: athrow
        //   368: return
        //   369: aload 7
        //   371: invokeinterface 98 1 0
        //   376: aload_2
        //   377: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	378	0	this	1
        //   47	62	1	bool	boolean
        //   26	228	2	localObject1	Object
        //   257	1	2	localObject2	Object
        //   264	88	2	localObject3	Object
        //   363	14	2	localObject4	Object
        //   23	245	3	localObject5	Object
        //   271	6	3	localIllegalStateException	IllegalStateException
        //   308	57	3	localSafeIterableMap	SafeIterableMap
        //   13	239	4	localObject6	Object
        //   261	5	4	localSQLiteException	SQLiteException
        //   321	13	4	localIterator	Iterator
        //   16	194	5	localSet	Set
        //   215	28	5	localObject7	Object
        //   19	157	6	localObject8	Object
        //   10	360	7	localLock	Lock
        //   160	64	8	localSupportSQLiteDatabase	SupportSQLiteDatabase
        // Exception table:
        //   from	to	target	type
        //   179	185	215	finally
        //   189	196	215	finally
        //   27	34	257	finally
        //   40	48	257	finally
        //   66	79	257	finally
        //   97	108	257	finally
        //   126	139	257	finally
        //   145	162	257	finally
        //   168	175	257	finally
        //   202	209	257	finally
        //   223	230	257	finally
        //   236	239	257	finally
        //   245	251	257	finally
        //   272	281	257	finally
        //   27	34	261	android/database/sqlite/SQLiteException
        //   40	48	261	android/database/sqlite/SQLiteException
        //   66	79	261	android/database/sqlite/SQLiteException
        //   97	108	261	android/database/sqlite/SQLiteException
        //   126	139	261	android/database/sqlite/SQLiteException
        //   145	162	261	android/database/sqlite/SQLiteException
        //   168	175	261	android/database/sqlite/SQLiteException
        //   202	209	261	android/database/sqlite/SQLiteException
        //   223	230	261	android/database/sqlite/SQLiteException
        //   236	239	261	android/database/sqlite/SQLiteException
        //   245	251	261	android/database/sqlite/SQLiteException
        //   27	34	271	java/lang/IllegalStateException
        //   40	48	271	java/lang/IllegalStateException
        //   66	79	271	java/lang/IllegalStateException
        //   97	108	271	java/lang/IllegalStateException
        //   126	139	271	java/lang/IllegalStateException
        //   145	162	271	java/lang/IllegalStateException
        //   168	175	271	java/lang/IllegalStateException
        //   202	209	271	java/lang/IllegalStateException
        //   223	230	271	java/lang/IllegalStateException
        //   236	239	271	java/lang/IllegalStateException
        //   245	251	271	java/lang/IllegalStateException
        //   311	323	363	finally
        //   323	355	363	finally
        //   358	360	363	finally
        //   364	366	363	finally
      }
    };
    this.mDatabase = paramRoomDatabase;
    this.mObservedTableTracker = new ObservedTableTracker(paramVarArgs.length);
    this.mTableIdLookup = new HashMap();
    this.mViewTables = paramMap1;
    this.mInvalidationLiveDataContainer = new InvalidationLiveDataContainer(paramRoomDatabase);
    int j = paramVarArgs.length;
    this.mTableNames = new String[j];
    while (i < j)
    {
      paramRoomDatabase = paramVarArgs[i].toLowerCase(Locale.US);
      this.mTableIdLookup.put(paramRoomDatabase, Integer.valueOf(i));
      paramMap1 = (String)paramMap.get(paramVarArgs[i]);
      if (paramMap1 != null) {
        this.mTableNames[i] = paramMap1.toLowerCase(Locale.US);
      } else {
        this.mTableNames[i] = paramRoomDatabase;
      }
      i++;
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      paramMap1 = (Map.Entry)paramMap.next();
      paramRoomDatabase = ((String)paramMap1.getValue()).toLowerCase(Locale.US);
      if (this.mTableIdLookup.containsKey(paramRoomDatabase))
      {
        paramMap1 = ((String)paramMap1.getKey()).toLowerCase(Locale.US);
        paramVarArgs = this.mTableIdLookup;
        paramVarArgs.put(paramMap1, paramVarArgs.get(paramRoomDatabase));
      }
    }
  }
  
  public InvalidationTracker(RoomDatabase paramRoomDatabase, String... paramVarArgs)
  {
    this(paramRoomDatabase, new HashMap(), Collections.emptyMap(), paramVarArgs);
  }
  
  private static void appendTriggerName(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    paramStringBuilder.append("`");
    paramStringBuilder.append("room_table_modification_trigger_");
    paramStringBuilder.append(paramString1);
    paramStringBuilder.append("_");
    paramStringBuilder.append(paramString2);
    paramStringBuilder.append("`");
  }
  
  private String[] resolveViews(String[] paramArrayOfString)
  {
    HashSet localHashSet = new HashSet();
    int j = paramArrayOfString.length;
    for (int i = 0; i < j; i++)
    {
      String str1 = paramArrayOfString[i];
      String str2 = str1.toLowerCase(Locale.US);
      if (this.mViewTables.containsKey(str2)) {
        localHashSet.addAll((Collection)this.mViewTables.get(str2));
      } else {
        localHashSet.add(str1);
      }
    }
    return (String[])localHashSet.toArray(new String[localHashSet.size()]);
  }
  
  private void startTrackingTable(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(", 0)");
    paramSupportSQLiteDatabase.execSQL(((StringBuilder)localObject).toString());
    localObject = this.mTableNames[paramInt];
    StringBuilder localStringBuilder = new StringBuilder();
    for (String str : TRIGGERS)
    {
      localStringBuilder.setLength(0);
      localStringBuilder.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
      appendTriggerName(localStringBuilder, (String)localObject, str);
      localStringBuilder.append(" AFTER ");
      localStringBuilder.append(str);
      localStringBuilder.append(" ON `");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("` BEGIN UPDATE ");
      localStringBuilder.append("room_table_modification_log");
      localStringBuilder.append(" SET ");
      localStringBuilder.append("invalidated");
      localStringBuilder.append(" = 1");
      localStringBuilder.append(" WHERE ");
      localStringBuilder.append("table_id");
      localStringBuilder.append(" = ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" AND ");
      localStringBuilder.append("invalidated");
      localStringBuilder.append(" = 0");
      localStringBuilder.append("; END");
      paramSupportSQLiteDatabase.execSQL(localStringBuilder.toString());
    }
  }
  
  private void stopTrackingTable(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt)
  {
    String str1 = this.mTableNames[paramInt];
    StringBuilder localStringBuilder = new StringBuilder();
    for (String str2 : TRIGGERS)
    {
      localStringBuilder.setLength(0);
      localStringBuilder.append("DROP TRIGGER IF EXISTS ");
      appendTriggerName(localStringBuilder, str1, str2);
      paramSupportSQLiteDatabase.execSQL(localStringBuilder.toString());
    }
  }
  
  private String[] validateAndResolveTableNames(String[] paramArrayOfString)
  {
    Object localObject = resolveViews(paramArrayOfString);
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      paramArrayOfString = localObject[i];
      if (this.mTableIdLookup.containsKey(paramArrayOfString.toLowerCase(Locale.US)))
      {
        i++;
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("There is no table with name ");
        ((StringBuilder)localObject).append(paramArrayOfString);
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
    }
    return (String[])localObject;
  }
  
  public void addObserver(Observer paramObserver)
  {
    ??? = resolveViews(paramObserver.mTables);
    int[] arrayOfInt = new int[???.length];
    int j = ???.length;
    int i = 0;
    while (i < j)
    {
      localObject2 = (Integer)this.mTableIdLookup.get(???[i].toLowerCase(Locale.US));
      if (localObject2 != null)
      {
        arrayOfInt[i] = ((Integer)localObject2).intValue();
        i++;
      }
      else
      {
        paramObserver = new StringBuilder();
        paramObserver.append("There is no table with name ");
        paramObserver.append(???[i]);
        throw new IllegalArgumentException(paramObserver.toString());
      }
    }
    Object localObject2 = new ObserverWrapper(paramObserver, arrayOfInt, (String[])???);
    synchronized (this.mObserverMap)
    {
      paramObserver = (ObserverWrapper)this.mObserverMap.putIfAbsent(paramObserver, localObject2);
      if ((paramObserver == null) && (this.mObservedTableTracker.onAdded(arrayOfInt))) {
        syncTriggers();
      }
      return;
    }
  }
  
  public void addWeakObserver(Observer paramObserver)
  {
    addObserver(new WeakObserver(this, paramObserver));
  }
  
  @Deprecated
  public <T> LiveData<T> createLiveData(String[] paramArrayOfString, Callable<T> paramCallable)
  {
    return createLiveData(paramArrayOfString, false, paramCallable);
  }
  
  public <T> LiveData<T> createLiveData(String[] paramArrayOfString, boolean paramBoolean, Callable<T> paramCallable)
  {
    return this.mInvalidationLiveDataContainer.create(validateAndResolveTableNames(paramArrayOfString), paramBoolean, paramCallable);
  }
  
  boolean ensureInitialization()
  {
    if (!this.mDatabase.isOpen()) {
      return false;
    }
    if (!this.mInitialized) {
      this.mDatabase.getOpenHelper().getWritableDatabase();
    }
    if (!this.mInitialized)
    {
      Log.e("ROOM", "database is not initialized even though it is open");
      return false;
    }
    return true;
  }
  
  void internalInit(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    try
    {
      if (this.mInitialized)
      {
        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
        return;
      }
      paramSupportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
      paramSupportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
      paramSupportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
      syncTriggers(paramSupportSQLiteDatabase);
      this.mCleanupStatement = paramSupportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
      this.mInitialized = true;
      return;
    }
    finally {}
  }
  
  public void notifyObserversByTableNames(String... paramVarArgs)
  {
    synchronized (this.mObserverMap)
    {
      Iterator localIterator = this.mObserverMap.iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (!((Observer)localEntry.getKey()).isRemote()) {
          ((ObserverWrapper)localEntry.getValue()).notifyByTableNames(paramVarArgs);
        }
      }
      return;
    }
  }
  
  public void refreshVersionsAsync()
  {
    if (this.mPendingRefresh.compareAndSet(false, true)) {
      this.mDatabase.getQueryExecutor().execute(this.mRefreshRunnable);
    }
  }
  
  public void refreshVersionsSync()
  {
    syncTriggers();
    this.mRefreshRunnable.run();
  }
  
  public void removeObserver(Observer paramObserver)
  {
    synchronized (this.mObserverMap)
    {
      paramObserver = (ObserverWrapper)this.mObserverMap.remove(paramObserver);
      if ((paramObserver != null) && (this.mObservedTableTracker.onRemoved(paramObserver.mTableIds))) {
        syncTriggers();
      }
      return;
    }
  }
  
  void startMultiInstanceInvalidation(Context paramContext, String paramString)
  {
    this.mMultiInstanceInvalidationClient = new MultiInstanceInvalidationClient(paramContext, paramString, this, this.mDatabase.getQueryExecutor());
  }
  
  void stopMultiInstanceInvalidation()
  {
    MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = this.mMultiInstanceInvalidationClient;
    if (localMultiInstanceInvalidationClient != null)
    {
      localMultiInstanceInvalidationClient.stop();
      this.mMultiInstanceInvalidationClient = null;
    }
  }
  
  void syncTriggers()
  {
    if (!this.mDatabase.isOpen()) {
      return;
    }
    syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
  }
  
  void syncTriggers(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    if (paramSupportSQLiteDatabase.inTransaction()) {
      return;
    }
    try
    {
      for (;;)
      {
        Lock localLock = this.mDatabase.getCloseLock();
        localLock.lock();
        try
        {
          int[] arrayOfInt = this.mObservedTableTracker.getTablesToSync();
          if (arrayOfInt == null) {
            return;
          }
          int j = arrayOfInt.length;
          paramSupportSQLiteDatabase.beginTransaction();
          int i = 0;
          for (;;)
          {
            if (i < j)
            {
              int k = arrayOfInt[i];
              if ((k != 1) && (k != 2)) {}
            }
            try
            {
              stopTrackingTable(paramSupportSQLiteDatabase, i);
              break label101;
              startTrackingTable(paramSupportSQLiteDatabase, i);
              label101:
              i++;
            }
            finally {}
          }
          paramSupportSQLiteDatabase.setTransactionSuccessful();
          paramSupportSQLiteDatabase.endTransaction();
          this.mObservedTableTracker.onSyncCompleted();
          localLock.unlock();
        }
        finally
        {
          localLock.unlock();
        }
      }
      Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", paramSupportSQLiteDatabase);
    }
    catch (SQLiteException paramSupportSQLiteDatabase) {}catch (IllegalStateException paramSupportSQLiteDatabase) {}
  }
  
  static class ObservedTableTracker
  {
    static final int ADD = 1;
    static final int NO_OP = 0;
    static final int REMOVE = 2;
    boolean mNeedsSync;
    boolean mPendingSync;
    final long[] mTableObservers;
    final int[] mTriggerStateChanges;
    final boolean[] mTriggerStates;
    
    ObservedTableTracker(int paramInt)
    {
      long[] arrayOfLong = new long[paramInt];
      this.mTableObservers = arrayOfLong;
      boolean[] arrayOfBoolean = new boolean[paramInt];
      this.mTriggerStates = arrayOfBoolean;
      this.mTriggerStateChanges = new int[paramInt];
      Arrays.fill(arrayOfLong, 0L);
      Arrays.fill(arrayOfBoolean, false);
    }
    
    int[] getTablesToSync()
    {
      try
      {
        if ((this.mNeedsSync) && (!this.mPendingSync))
        {
          int k = this.mTableObservers.length;
          for (int i = 0;; i++)
          {
            int j = 1;
            if (i >= k) {
              break;
            }
            int m;
            if (this.mTableObservers[i] > 0L) {
              m = 1;
            } else {
              m = 0;
            }
            boolean[] arrayOfBoolean = this.mTriggerStates;
            if (m != arrayOfBoolean[i])
            {
              arrayOfInt = this.mTriggerStateChanges;
              if (m == 0) {
                j = 2;
              }
              arrayOfInt[i] = j;
            }
            else
            {
              this.mTriggerStateChanges[i] = 0;
            }
            arrayOfBoolean[i] = m;
          }
          this.mPendingSync = true;
          this.mNeedsSync = false;
          int[] arrayOfInt = this.mTriggerStateChanges;
          return arrayOfInt;
        }
        return null;
      }
      finally {}
    }
    
    boolean onAdded(int... paramVarArgs)
    {
      try
      {
        int j = paramVarArgs.length;
        int i = 0;
        boolean bool = false;
        while (i < j)
        {
          int k = paramVarArgs[i];
          long[] arrayOfLong = this.mTableObservers;
          long l = arrayOfLong[k];
          arrayOfLong[k] = (1L + l);
          if (l == 0L)
          {
            this.mNeedsSync = true;
            bool = true;
          }
          i++;
        }
        return bool;
      }
      finally {}
    }
    
    boolean onRemoved(int... paramVarArgs)
    {
      try
      {
        int j = paramVarArgs.length;
        int i = 0;
        boolean bool = false;
        while (i < j)
        {
          int k = paramVarArgs[i];
          long[] arrayOfLong = this.mTableObservers;
          long l = arrayOfLong[k];
          arrayOfLong[k] = (l - 1L);
          if (l == 1L)
          {
            this.mNeedsSync = true;
            bool = true;
          }
          i++;
        }
        return bool;
      }
      finally {}
    }
    
    void onSyncCompleted()
    {
      try
      {
        this.mPendingSync = false;
        return;
      }
      finally {}
    }
  }
  
  public static abstract class Observer
  {
    final String[] mTables;
    
    protected Observer(String paramString, String... paramVarArgs)
    {
      String[] arrayOfString = (String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length + 1);
      this.mTables = arrayOfString;
      arrayOfString[paramVarArgs.length] = paramString;
    }
    
    public Observer(String[] paramArrayOfString)
    {
      this.mTables = ((String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
    }
    
    boolean isRemote()
    {
      return false;
    }
    
    public abstract void onInvalidated(Set<String> paramSet);
  }
  
  static class ObserverWrapper
  {
    final InvalidationTracker.Observer mObserver;
    private final Set<String> mSingleTableSet;
    final int[] mTableIds;
    private final String[] mTableNames;
    
    ObserverWrapper(InvalidationTracker.Observer paramObserver, int[] paramArrayOfInt, String[] paramArrayOfString)
    {
      this.mObserver = paramObserver;
      this.mTableIds = paramArrayOfInt;
      this.mTableNames = paramArrayOfString;
      if (paramArrayOfInt.length == 1)
      {
        paramObserver = new HashSet();
        paramObserver.add(paramArrayOfString[0]);
        this.mSingleTableSet = Collections.unmodifiableSet(paramObserver);
      }
      else
      {
        this.mSingleTableSet = null;
      }
    }
    
    void notifyByTableInvalidStatus(Set<Integer> paramSet)
    {
      int j = this.mTableIds.length;
      Object localObject1 = null;
      int i = 0;
      while (i < j)
      {
        Object localObject2 = localObject1;
        if (paramSet.contains(Integer.valueOf(this.mTableIds[i]))) {
          if (j == 1)
          {
            localObject2 = this.mSingleTableSet;
          }
          else
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new HashSet(j);
            }
            ((Set)localObject2).add(this.mTableNames[i]);
          }
        }
        i++;
        localObject1 = localObject2;
      }
      if (localObject1 != null) {
        this.mObserver.onInvalidated((Set)localObject1);
      }
    }
    
    void notifyByTableNames(String[] paramArrayOfString)
    {
      int i = this.mTableNames.length;
      Object localObject2 = null;
      int j;
      if (i == 1)
      {
        j = paramArrayOfString.length;
        for (i = 0;; i++)
        {
          localObject1 = localObject2;
          if (i >= j) {
            break;
          }
          if (paramArrayOfString[i].equalsIgnoreCase(this.mTableNames[0]))
          {
            localObject1 = this.mSingleTableSet;
            break;
          }
        }
      }
      HashSet localHashSet = new HashSet();
      int k = paramArrayOfString.length;
      for (i = 0; i < k; i++)
      {
        localObject1 = paramArrayOfString[i];
        for (String str : this.mTableNames) {
          if (str.equalsIgnoreCase((String)localObject1))
          {
            localHashSet.add(str);
            break;
          }
        }
      }
      Object localObject1 = localObject2;
      if (localHashSet.size() > 0) {
        localObject1 = localHashSet;
      }
      if (localObject1 != null) {
        this.mObserver.onInvalidated((Set)localObject1);
      }
    }
  }
  
  static class WeakObserver
    extends InvalidationTracker.Observer
  {
    final WeakReference<InvalidationTracker.Observer> mDelegateRef;
    final InvalidationTracker mTracker;
    
    WeakObserver(InvalidationTracker paramInvalidationTracker, InvalidationTracker.Observer paramObserver)
    {
      super();
      this.mTracker = paramInvalidationTracker;
      this.mDelegateRef = new WeakReference(paramObserver);
    }
    
    public void onInvalidated(Set<String> paramSet)
    {
      InvalidationTracker.Observer localObserver = (InvalidationTracker.Observer)this.mDelegateRef.get();
      if (localObserver == null) {
        this.mTracker.removeObserver(this);
      } else {
        localObserver.onInvalidated(paramSet);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\InvalidationTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */