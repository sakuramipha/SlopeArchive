package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;

public class IdGenerator
{
  public static final int INITIAL_ID = 0;
  public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
  public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
  public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";
  private final WorkDatabase mWorkDatabase;
  
  public IdGenerator(WorkDatabase paramWorkDatabase)
  {
    this.mWorkDatabase = paramWorkDatabase;
  }
  
  public static void migrateLegacyIdGenerator(Context paramContext, SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramContext = paramContext.getSharedPreferences("androidx.work.util.id", 0);
    int j;
    int i;
    if ((paramContext.contains("next_job_scheduler_id")) || (paramContext.contains("next_job_scheduler_id")))
    {
      j = paramContext.getInt("next_job_scheduler_id", 0);
      i = paramContext.getInt("next_alarm_manager_id", 0);
      paramSupportSQLiteDatabase.beginTransaction();
    }
    try
    {
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_job_scheduler_id", Integer.valueOf(j) });
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_alarm_manager_id", Integer.valueOf(i) });
      paramContext.edit().clear().apply();
      paramSupportSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSupportSQLiteDatabase.endTransaction();
    }
  }
  
  private int nextId(String paramString)
  {
    this.mWorkDatabase.beginTransaction();
    try
    {
      Long localLong = this.mWorkDatabase.preferenceDao().getLongValue(paramString);
      int j = 0;
      int i;
      if (localLong != null) {
        i = localLong.intValue();
      } else {
        i = 0;
      }
      if (i != Integer.MAX_VALUE) {
        j = i + 1;
      }
      update(paramString, j);
      this.mWorkDatabase.setTransactionSuccessful();
      return i;
    }
    finally
    {
      this.mWorkDatabase.endTransaction();
    }
  }
  
  private void update(String paramString, int paramInt)
  {
    this.mWorkDatabase.preferenceDao().insertPreference(new Preference(paramString, paramInt));
  }
  
  public int nextAlarmManagerId()
  {
    try
    {
      int i = nextId("next_alarm_manager_id");
      return i;
    }
    finally {}
  }
  
  public int nextJobSchedulerIdWithRange(int paramInt1, int paramInt2)
  {
    try
    {
      int i = nextId("next_job_scheduler_id");
      if ((i >= paramInt1) && (i <= paramInt2)) {
        paramInt1 = i;
      } else {
        update("next_job_scheduler_id", paramInt1 + 1);
      }
      return paramInt1;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\IdGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */