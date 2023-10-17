package androidx.work.impl;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.Builder;
import androidx.room.RoomDatabase.Callback;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase
  extends RoomDatabase
{
  private static final String PRUNE_SQL_FORMAT_PREFIX = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
  private static final String PRUNE_SQL_FORMAT_SUFFIX = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
  private static final long PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(1L);
  
  public static WorkDatabase create(Context paramContext, Executor paramExecutor, boolean paramBoolean)
  {
    RoomDatabase.Builder localBuilder;
    if (paramBoolean)
    {
      localBuilder = Room.inMemoryDatabaseBuilder(paramContext, WorkDatabase.class).allowMainThreadQueries();
    }
    else
    {
      localBuilder = Room.databaseBuilder(paramContext, WorkDatabase.class, WorkDatabasePathHelper.getWorkDatabaseName());
      localBuilder.openHelperFactory(new SupportSQLiteOpenHelper.Factory()
      {
        public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration paramAnonymousConfiguration)
        {
          SupportSQLiteOpenHelper.Configuration.Builder localBuilder = SupportSQLiteOpenHelper.Configuration.builder(WorkDatabase.this);
          localBuilder.name(paramAnonymousConfiguration.name).callback(paramAnonymousConfiguration.callback).noBackupDirectory(true);
          return new FrameworkSQLiteOpenHelperFactory().create(localBuilder.build());
        }
      });
    }
    return (WorkDatabase)localBuilder.setQueryExecutor(paramExecutor).addCallback(generateCleanupCallback()).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_1_2 }).addMigrations(new Migration[] { new WorkDatabaseMigrations.RescheduleMigration(paramContext, 2, 3) }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_3_4 }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_4_5 }).addMigrations(new Migration[] { new WorkDatabaseMigrations.RescheduleMigration(paramContext, 5, 6) }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_6_7 }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_7_8 }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_8_9 }).addMigrations(new Migration[] { new WorkDatabaseMigrations.WorkMigration9To10(paramContext) }).addMigrations(new Migration[] { new WorkDatabaseMigrations.RescheduleMigration(paramContext, 10, 11) }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_11_12 }).fallbackToDestructiveMigration().build();
  }
  
  static RoomDatabase.Callback generateCleanupCallback()
  {
    new RoomDatabase.Callback()
    {
      public void onOpen(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        super.onOpen(paramAnonymousSupportSQLiteDatabase);
        paramAnonymousSupportSQLiteDatabase.beginTransaction();
        try
        {
          paramAnonymousSupportSQLiteDatabase.execSQL(WorkDatabase.getPruneSQL());
          paramAnonymousSupportSQLiteDatabase.setTransactionSuccessful();
          return;
        }
        finally
        {
          paramAnonymousSupportSQLiteDatabase.endTransaction();
        }
      }
    };
  }
  
  static long getPruneDate()
  {
    return System.currentTimeMillis() - PRUNE_THRESHOLD_MILLIS;
  }
  
  static String getPruneSQL()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
    localStringBuilder.append(getPruneDate());
    localStringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
    return localStringBuilder.toString();
  }
  
  public abstract DependencyDao dependencyDao();
  
  public abstract PreferenceDao preferenceDao();
  
  public abstract RawWorkInfoDao rawWorkInfoDao();
  
  public abstract SystemIdInfoDao systemIdInfoDao();
  
  public abstract WorkNameDao workNameDao();
  
  public abstract WorkProgressDao workProgressDao();
  
  public abstract WorkSpecDao workSpecDao();
  
  public abstract WorkTagDao workTagDao();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\WorkDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */