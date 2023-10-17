package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class RoomDatabase
{
  private static final String DB_IMPL_SUFFIX = "_Impl";
  public static final int MAX_BIND_PARAMETER_CNT = 999;
  private boolean mAllowMainThreadQueries;
  private final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
  @Deprecated
  protected List<Callback> mCallbacks;
  private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
  @Deprecated
  protected volatile SupportSQLiteDatabase mDatabase;
  private final InvalidationTracker mInvalidationTracker = createInvalidationTracker();
  private SupportSQLiteOpenHelper mOpenHelper;
  private Executor mQueryExecutor;
  private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal();
  private Executor mTransactionExecutor;
  boolean mWriteAheadLoggingEnabled;
  
  private static boolean isMainThread()
  {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void assertNotMainThread()
  {
    if (this.mAllowMainThreadQueries) {
      return;
    }
    if (!isMainThread()) {
      return;
    }
    throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
  }
  
  public void assertNotSuspendingTransaction()
  {
    if ((!inTransaction()) && (this.mSuspendingTransactionId.get() != null)) {
      throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }
  }
  
  @Deprecated
  public void beginTransaction()
  {
    assertNotMainThread();
    SupportSQLiteDatabase localSupportSQLiteDatabase = this.mOpenHelper.getWritableDatabase();
    this.mInvalidationTracker.syncTriggers(localSupportSQLiteDatabase);
    localSupportSQLiteDatabase.beginTransaction();
  }
  
  public abstract void clearAllTables();
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 139	androidx/room/RoomDatabase:isOpen	()Z
    //   4: ifeq +51 -> 55
    //   7: aload_0
    //   8: getfield 56	androidx/room/RoomDatabase:mCloseLock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   11: invokevirtual 143	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   14: astore_2
    //   15: aload_2
    //   16: invokeinterface 148 1 0
    //   21: aload_0
    //   22: getfield 72	androidx/room/RoomDatabase:mInvalidationTracker	Landroidx/room/InvalidationTracker;
    //   25: invokevirtual 151	androidx/room/InvalidationTracker:stopMultiInstanceInvalidation	()V
    //   28: aload_0
    //   29: getfield 117	androidx/room/RoomDatabase:mOpenHelper	Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    //   32: invokeinterface 153 1 0
    //   37: aload_2
    //   38: invokeinterface 156 1 0
    //   43: goto +12 -> 55
    //   46: astore_1
    //   47: aload_2
    //   48: invokeinterface 156 1 0
    //   53: aload_1
    //   54: athrow
    //   55: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	RoomDatabase
    //   46	8	1	localObject	Object
    //   14	34	2	localWriteLock	java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock
    // Exception table:
    //   from	to	target	type
    //   15	37	46	finally
  }
  
  public SupportSQLiteStatement compileStatement(String paramString)
  {
    assertNotMainThread();
    assertNotSuspendingTransaction();
    return this.mOpenHelper.getWritableDatabase().compileStatement(paramString);
  }
  
  protected abstract InvalidationTracker createInvalidationTracker();
  
  protected abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration paramDatabaseConfiguration);
  
  @Deprecated
  public void endTransaction()
  {
    this.mOpenHelper.getWritableDatabase().endTransaction();
    if (!inTransaction()) {
      this.mInvalidationTracker.refreshVersionsAsync();
    }
  }
  
  Map<String, Object> getBackingFieldMap()
  {
    return this.mBackingFieldMap;
  }
  
  Lock getCloseLock()
  {
    return this.mCloseLock.readLock();
  }
  
  public InvalidationTracker getInvalidationTracker()
  {
    return this.mInvalidationTracker;
  }
  
  public SupportSQLiteOpenHelper getOpenHelper()
  {
    return this.mOpenHelper;
  }
  
  public Executor getQueryExecutor()
  {
    return this.mQueryExecutor;
  }
  
  ThreadLocal<Integer> getSuspendingTransactionId()
  {
    return this.mSuspendingTransactionId;
  }
  
  public Executor getTransactionExecutor()
  {
    return this.mTransactionExecutor;
  }
  
  public boolean inTransaction()
  {
    return this.mOpenHelper.getWritableDatabase().inTransaction();
  }
  
  public void init(DatabaseConfiguration paramDatabaseConfiguration)
  {
    SupportSQLiteOpenHelper localSupportSQLiteOpenHelper = createOpenHelper(paramDatabaseConfiguration);
    this.mOpenHelper = localSupportSQLiteOpenHelper;
    if ((localSupportSQLiteOpenHelper instanceof SQLiteCopyOpenHelper)) {
      ((SQLiteCopyOpenHelper)localSupportSQLiteOpenHelper).setDatabaseConfiguration(paramDatabaseConfiguration);
    }
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = false;
    if (i >= 16)
    {
      bool1 = bool2;
      if (paramDatabaseConfiguration.journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
        bool1 = true;
      }
      this.mOpenHelper.setWriteAheadLoggingEnabled(bool1);
    }
    this.mCallbacks = paramDatabaseConfiguration.callbacks;
    this.mQueryExecutor = paramDatabaseConfiguration.queryExecutor;
    this.mTransactionExecutor = new TransactionExecutor(paramDatabaseConfiguration.transactionExecutor);
    this.mAllowMainThreadQueries = paramDatabaseConfiguration.allowMainThreadQueries;
    this.mWriteAheadLoggingEnabled = bool1;
    if (paramDatabaseConfiguration.multiInstanceInvalidation) {
      this.mInvalidationTracker.startMultiInstanceInvalidation(paramDatabaseConfiguration.context, paramDatabaseConfiguration.name);
    }
  }
  
  protected void internalInitInvalidationTracker(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    this.mInvalidationTracker.internalInit(paramSupportSQLiteDatabase);
  }
  
  public boolean isOpen()
  {
    SupportSQLiteDatabase localSupportSQLiteDatabase = this.mDatabase;
    boolean bool;
    if ((localSupportSQLiteDatabase != null) && (localSupportSQLiteDatabase.isOpen())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Cursor query(SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    return query(paramSupportSQLiteQuery, null);
  }
  
  public Cursor query(SupportSQLiteQuery paramSupportSQLiteQuery, CancellationSignal paramCancellationSignal)
  {
    assertNotMainThread();
    assertNotSuspendingTransaction();
    if ((paramCancellationSignal != null) && (Build.VERSION.SDK_INT >= 16)) {
      return this.mOpenHelper.getWritableDatabase().query(paramSupportSQLiteQuery, paramCancellationSignal);
    }
    return this.mOpenHelper.getWritableDatabase().query(paramSupportSQLiteQuery);
  }
  
  public Cursor query(String paramString, Object[] paramArrayOfObject)
  {
    return this.mOpenHelper.getWritableDatabase().query(new SimpleSQLiteQuery(paramString, paramArrayOfObject));
  }
  
  /* Error */
  public <V> V runInTransaction(java.util.concurrent.Callable<V> paramCallable)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 285	androidx/room/RoomDatabase:beginTransaction	()V
    //   4: aload_1
    //   5: invokeinterface 290 1 0
    //   10: astore_1
    //   11: aload_0
    //   12: invokevirtual 293	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   15: aload_0
    //   16: invokevirtual 294	androidx/room/RoomDatabase:endTransaction	()V
    //   19: aload_1
    //   20: areturn
    //   21: astore_1
    //   22: goto +17 -> 39
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 300	androidx/room/util/SneakyThrow:reThrow	(Ljava/lang/Exception;)V
    //   30: aload_0
    //   31: invokevirtual 294	androidx/room/RoomDatabase:endTransaction	()V
    //   34: aconst_null
    //   35: areturn
    //   36: astore_1
    //   37: aload_1
    //   38: athrow
    //   39: aload_0
    //   40: invokevirtual 294	androidx/room/RoomDatabase:endTransaction	()V
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	RoomDatabase
    //   0	45	1	paramCallable	java.util.concurrent.Callable<V>
    // Exception table:
    //   from	to	target	type
    //   4	15	21	finally
    //   26	30	21	finally
    //   37	39	21	finally
    //   4	15	25	java/lang/Exception
    //   4	15	36	java/lang/RuntimeException
  }
  
  public void runInTransaction(Runnable paramRunnable)
  {
    beginTransaction();
    try
    {
      paramRunnable.run();
      setTransactionSuccessful();
      return;
    }
    finally
    {
      endTransaction();
    }
  }
  
  @Deprecated
  public void setTransactionSuccessful()
  {
    this.mOpenHelper.getWritableDatabase().setTransactionSuccessful();
  }
  
  public static class Builder<T extends RoomDatabase>
  {
    private boolean mAllowDestructiveMigrationOnDowngrade;
    private boolean mAllowMainThreadQueries;
    private ArrayList<RoomDatabase.Callback> mCallbacks;
    private final Context mContext;
    private String mCopyFromAssetPath;
    private File mCopyFromFile;
    private final Class<T> mDatabaseClass;
    private SupportSQLiteOpenHelper.Factory mFactory;
    private RoomDatabase.JournalMode mJournalMode;
    private final RoomDatabase.MigrationContainer mMigrationContainer;
    private Set<Integer> mMigrationStartAndEndVersions;
    private Set<Integer> mMigrationsNotRequiredFrom;
    private boolean mMultiInstanceInvalidation;
    private final String mName;
    private Executor mQueryExecutor;
    private boolean mRequireMigration;
    private Executor mTransactionExecutor;
    
    Builder(Context paramContext, Class<T> paramClass, String paramString)
    {
      this.mContext = paramContext;
      this.mDatabaseClass = paramClass;
      this.mName = paramString;
      this.mJournalMode = RoomDatabase.JournalMode.AUTOMATIC;
      this.mRequireMigration = true;
      this.mMigrationContainer = new RoomDatabase.MigrationContainer();
    }
    
    public Builder<T> addCallback(RoomDatabase.Callback paramCallback)
    {
      if (this.mCallbacks == null) {
        this.mCallbacks = new ArrayList();
      }
      this.mCallbacks.add(paramCallback);
      return this;
    }
    
    public Builder<T> addMigrations(Migration... paramVarArgs)
    {
      if (this.mMigrationStartAndEndVersions == null) {
        this.mMigrationStartAndEndVersions = new HashSet();
      }
      int j = paramVarArgs.length;
      for (int i = 0; i < j; i++)
      {
        Migration localMigration = paramVarArgs[i];
        this.mMigrationStartAndEndVersions.add(Integer.valueOf(localMigration.startVersion));
        this.mMigrationStartAndEndVersions.add(Integer.valueOf(localMigration.endVersion));
      }
      this.mMigrationContainer.addMigrations(paramVarArgs);
      return this;
    }
    
    public Builder<T> allowMainThreadQueries()
    {
      this.mAllowMainThreadQueries = true;
      return this;
    }
    
    public T build()
    {
      if (this.mContext != null)
      {
        if (this.mDatabaseClass != null)
        {
          Object localObject1 = this.mQueryExecutor;
          if ((localObject1 == null) && (this.mTransactionExecutor == null))
          {
            localObject1 = ArchTaskExecutor.getIOThreadExecutor();
            this.mTransactionExecutor = ((Executor)localObject1);
            this.mQueryExecutor = ((Executor)localObject1);
          }
          else if ((localObject1 != null) && (this.mTransactionExecutor == null))
          {
            this.mTransactionExecutor = ((Executor)localObject1);
          }
          else if (localObject1 == null)
          {
            localObject1 = this.mTransactionExecutor;
            if (localObject1 != null) {
              this.mQueryExecutor = ((Executor)localObject1);
            }
          }
          localObject1 = this.mMigrationStartAndEndVersions;
          Object localObject2;
          if ((localObject1 != null) && (this.mMigrationsNotRequiredFrom != null))
          {
            localObject2 = ((Set)localObject1).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject1 = (Integer)((Iterator)localObject2).next();
              if (this.mMigrationsNotRequiredFrom.contains(localObject1))
              {
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                ((StringBuilder)localObject2).append(localObject1);
                throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
              }
            }
          }
          if (this.mFactory == null) {
            this.mFactory = new FrameworkSQLiteOpenHelperFactory();
          }
          localObject1 = this.mCopyFromAssetPath;
          if ((localObject1 != null) || (this.mCopyFromFile != null))
          {
            if (this.mName != null)
            {
              if ((localObject1 != null) && (this.mCopyFromFile != null)) {
                throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
              }
              this.mFactory = new SQLiteCopyOpenHelperFactory(this.mCopyFromAssetPath, this.mCopyFromFile, this.mFactory);
            }
          }
          else
          {
            localObject1 = this.mContext;
            localObject2 = new DatabaseConfiguration((Context)localObject1, this.mName, this.mFactory, this.mMigrationContainer, this.mCallbacks, this.mAllowMainThreadQueries, this.mJournalMode.resolve((Context)localObject1), this.mQueryExecutor, this.mTransactionExecutor, this.mMultiInstanceInvalidation, this.mRequireMigration, this.mAllowDestructiveMigrationOnDowngrade, this.mMigrationsNotRequiredFrom, this.mCopyFromAssetPath, this.mCopyFromFile);
            localObject1 = (RoomDatabase)Room.getGeneratedImplementation(this.mDatabaseClass, "_Impl");
            ((RoomDatabase)localObject1).init((DatabaseConfiguration)localObject2);
            return (T)localObject1;
          }
          throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
        }
        throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
      }
      throw new IllegalArgumentException("Cannot provide null context for the database.");
    }
    
    public Builder<T> createFromAsset(String paramString)
    {
      this.mCopyFromAssetPath = paramString;
      return this;
    }
    
    public Builder<T> createFromFile(File paramFile)
    {
      this.mCopyFromFile = paramFile;
      return this;
    }
    
    public Builder<T> enableMultiInstanceInvalidation()
    {
      boolean bool;
      if (this.mName != null) {
        bool = true;
      } else {
        bool = false;
      }
      this.mMultiInstanceInvalidation = bool;
      return this;
    }
    
    public Builder<T> fallbackToDestructiveMigration()
    {
      this.mRequireMigration = false;
      this.mAllowDestructiveMigrationOnDowngrade = true;
      return this;
    }
    
    public Builder<T> fallbackToDestructiveMigrationFrom(int... paramVarArgs)
    {
      if (this.mMigrationsNotRequiredFrom == null) {
        this.mMigrationsNotRequiredFrom = new HashSet(paramVarArgs.length);
      }
      int j = paramVarArgs.length;
      for (int i = 0; i < j; i++)
      {
        int k = paramVarArgs[i];
        this.mMigrationsNotRequiredFrom.add(Integer.valueOf(k));
      }
      return this;
    }
    
    public Builder<T> fallbackToDestructiveMigrationOnDowngrade()
    {
      this.mRequireMigration = true;
      this.mAllowDestructiveMigrationOnDowngrade = true;
      return this;
    }
    
    public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory paramFactory)
    {
      this.mFactory = paramFactory;
      return this;
    }
    
    public Builder<T> setJournalMode(RoomDatabase.JournalMode paramJournalMode)
    {
      this.mJournalMode = paramJournalMode;
      return this;
    }
    
    public Builder<T> setQueryExecutor(Executor paramExecutor)
    {
      this.mQueryExecutor = paramExecutor;
      return this;
    }
    
    public Builder<T> setTransactionExecutor(Executor paramExecutor)
    {
      this.mTransactionExecutor = paramExecutor;
      return this;
    }
  }
  
  public static abstract class Callback
  {
    public void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onDestructiveMigration(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  }
  
  public static enum JournalMode
  {
    private static final JournalMode[] $VALUES;
    
    static
    {
      JournalMode localJournalMode1 = new JournalMode("AUTOMATIC", 0);
      AUTOMATIC = localJournalMode1;
      JournalMode localJournalMode3 = new JournalMode("TRUNCATE", 1);
      TRUNCATE = localJournalMode3;
      JournalMode localJournalMode2 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
      WRITE_AHEAD_LOGGING = localJournalMode2;
      $VALUES = new JournalMode[] { localJournalMode1, localJournalMode3, localJournalMode2 };
    }
    
    private JournalMode() {}
    
    private static boolean isLowRamDevice(ActivityManager paramActivityManager)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return paramActivityManager.isLowRamDevice();
      }
      return false;
    }
    
    JournalMode resolve(Context paramContext)
    {
      if (this != AUTOMATIC) {
        return this;
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramContext = (ActivityManager)paramContext.getSystemService("activity");
        if ((paramContext != null) && (!isLowRamDevice(paramContext))) {
          return WRITE_AHEAD_LOGGING;
        }
      }
      return TRUNCATE;
    }
  }
  
  public static class MigrationContainer
  {
    private HashMap<Integer, TreeMap<Integer, Migration>> mMigrations = new HashMap();
    
    private void addMigration(Migration paramMigration)
    {
      int i = paramMigration.startVersion;
      int j = paramMigration.endVersion;
      Object localObject2 = (TreeMap)this.mMigrations.get(Integer.valueOf(i));
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new TreeMap();
        this.mMigrations.put(Integer.valueOf(i), localObject1);
      }
      localObject2 = (Migration)((TreeMap)localObject1).get(Integer.valueOf(j));
      if (localObject2 != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Overriding migration ");
        localStringBuilder.append(localObject2);
        localStringBuilder.append(" with ");
        localStringBuilder.append(paramMigration);
        Log.w("ROOM", localStringBuilder.toString());
      }
      ((TreeMap)localObject1).put(Integer.valueOf(j), paramMigration);
    }
    
    private List<Migration> findUpMigrationPath(List<Migration> paramList, boolean paramBoolean, int paramInt1, int paramInt2)
    {
      while (paramBoolean ? paramInt1 < paramInt2 : paramInt1 > paramInt2)
      {
        TreeMap localTreeMap = (TreeMap)this.mMigrations.get(Integer.valueOf(paramInt1));
        if (localTreeMap == null) {
          return null;
        }
        if (paramBoolean) {
          localObject = localTreeMap.descendingKeySet();
        } else {
          localObject = localTreeMap.keySet();
        }
        Object localObject = ((Set)localObject).iterator();
        int j;
        int k;
        do
        {
          boolean bool = ((Iterator)localObject).hasNext();
          j = 1;
          int m = 0;
          if (!bool) {
            break;
          }
          k = ((Integer)((Iterator)localObject).next()).intValue();
          if (paramBoolean)
          {
            i = m;
            if (k <= paramInt2)
            {
              i = m;
              if (k <= paramInt1) {}
            }
          }
          else
          {
            do
            {
              i = 1;
              break;
              i = m;
              if (k < paramInt2) {
                break;
              }
              i = m;
            } while (k < paramInt1);
          }
        } while (i == 0);
        paramList.add(localTreeMap.get(Integer.valueOf(k)));
        paramInt1 = k;
        int i = j;
        break label197;
        i = 0;
        label197:
        if (i == 0) {
          return null;
        }
      }
      return paramList;
    }
    
    public void addMigrations(Migration... paramVarArgs)
    {
      int j = paramVarArgs.length;
      for (int i = 0; i < j; i++) {
        addMigration(paramVarArgs[i]);
      }
    }
    
    public List<Migration> findMigrationPath(int paramInt1, int paramInt2)
    {
      if (paramInt1 == paramInt2) {
        return Collections.emptyList();
      }
      boolean bool;
      if (paramInt2 > paramInt1) {
        bool = true;
      } else {
        bool = false;
      }
      return findUpMigrationPath(new ArrayList(), bool, paramInt1, paramInt2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\RoomDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */