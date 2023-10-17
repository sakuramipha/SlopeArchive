package androidx.room;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class DatabaseConfiguration
{
  public final boolean allowDestructiveMigrationOnDowngrade;
  public final boolean allowMainThreadQueries;
  public final List<RoomDatabase.Callback> callbacks;
  public final Context context;
  public final String copyFromAssetPath;
  public final File copyFromFile;
  public final RoomDatabase.JournalMode journalMode;
  private final Set<Integer> mMigrationNotRequiredFrom;
  public final RoomDatabase.MigrationContainer migrationContainer;
  public final boolean multiInstanceInvalidation;
  public final String name;
  public final Executor queryExecutor;
  public final boolean requireMigration;
  public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
  public final Executor transactionExecutor;
  
  @Deprecated
  public DatabaseConfiguration(Context paramContext, String paramString, SupportSQLiteOpenHelper.Factory paramFactory, RoomDatabase.MigrationContainer paramMigrationContainer, List<RoomDatabase.Callback> paramList, boolean paramBoolean1, RoomDatabase.JournalMode paramJournalMode, Executor paramExecutor1, Executor paramExecutor2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Set<Integer> paramSet)
  {
    this(paramContext, paramString, paramFactory, paramMigrationContainer, paramList, paramBoolean1, paramJournalMode, paramExecutor1, paramExecutor2, paramBoolean2, paramBoolean3, paramBoolean4, paramSet, null, null);
  }
  
  public DatabaseConfiguration(Context paramContext, String paramString1, SupportSQLiteOpenHelper.Factory paramFactory, RoomDatabase.MigrationContainer paramMigrationContainer, List<RoomDatabase.Callback> paramList, boolean paramBoolean1, RoomDatabase.JournalMode paramJournalMode, Executor paramExecutor1, Executor paramExecutor2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Set<Integer> paramSet, String paramString2, File paramFile)
  {
    this.sqliteOpenHelperFactory = paramFactory;
    this.context = paramContext;
    this.name = paramString1;
    this.migrationContainer = paramMigrationContainer;
    this.callbacks = paramList;
    this.allowMainThreadQueries = paramBoolean1;
    this.journalMode = paramJournalMode;
    this.queryExecutor = paramExecutor1;
    this.transactionExecutor = paramExecutor2;
    this.multiInstanceInvalidation = paramBoolean2;
    this.requireMigration = paramBoolean3;
    this.allowDestructiveMigrationOnDowngrade = paramBoolean4;
    this.mMigrationNotRequiredFrom = paramSet;
    this.copyFromAssetPath = paramString2;
    this.copyFromFile = paramFile;
  }
  
  @Deprecated
  public DatabaseConfiguration(Context paramContext, String paramString, SupportSQLiteOpenHelper.Factory paramFactory, RoomDatabase.MigrationContainer paramMigrationContainer, List<RoomDatabase.Callback> paramList, boolean paramBoolean1, RoomDatabase.JournalMode paramJournalMode, Executor paramExecutor, boolean paramBoolean2, Set<Integer> paramSet)
  {
    this(paramContext, paramString, paramFactory, paramMigrationContainer, paramList, paramBoolean1, paramJournalMode, paramExecutor, paramExecutor, false, paramBoolean2, false, paramSet, null, null);
  }
  
  public boolean isMigrationRequired(int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    if (paramInt1 > paramInt2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    if ((paramInt2 != 0) && (this.allowDestructiveMigrationOnDowngrade)) {
      return false;
    }
    if (this.requireMigration)
    {
      Set localSet = this.mMigrationNotRequiredFrom;
      bool1 = bool2;
      if (localSet == null) {
        return bool1;
      }
      if (!localSet.contains(Integer.valueOf(paramInt1))) {
        return bool2;
      }
    }
    boolean bool1 = false;
    return bool1;
  }
  
  @Deprecated
  public boolean isMigrationRequiredFrom(int paramInt)
  {
    return isMigrationRequired(paramInt, paramInt + 1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\DatabaseConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */