package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;

public class PreferenceUtils
{
  public static final String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
  public static final String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
  public static final String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
  private final WorkDatabase mWorkDatabase;
  
  public PreferenceUtils(WorkDatabase paramWorkDatabase)
  {
    this.mWorkDatabase = paramWorkDatabase;
  }
  
  public static void migrateLegacyPreferences(Context paramContext, SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramContext = paramContext.getSharedPreferences("androidx.work.util.preferences", 0);
    long l1;
    long l2;
    if ((paramContext.contains("reschedule_needed")) || (paramContext.contains("last_cancel_all_time_ms")))
    {
      l1 = 0L;
      l2 = paramContext.getLong("last_cancel_all_time_ms", 0L);
      if (paramContext.getBoolean("reschedule_needed", false)) {
        l1 = 1L;
      }
      paramSupportSQLiteDatabase.beginTransaction();
    }
    try
    {
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "last_cancel_all_time_ms", Long.valueOf(l2) });
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", Long.valueOf(l1) });
      paramContext.edit().clear().apply();
      paramSupportSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSupportSQLiteDatabase.endTransaction();
    }
  }
  
  public long getLastCancelAllTimeMillis()
  {
    Long localLong = this.mWorkDatabase.preferenceDao().getLongValue("last_cancel_all_time_ms");
    long l;
    if (localLong != null) {
      l = localLong.longValue();
    } else {
      l = 0L;
    }
    return l;
  }
  
  public LiveData<Long> getLastCancelAllTimeMillisLiveData()
  {
    Transformations.map(this.mWorkDatabase.preferenceDao().getObservableLongValue("last_cancel_all_time_ms"), new Function()
    {
      public Long apply(Long paramAnonymousLong)
      {
        long l;
        if (paramAnonymousLong != null) {
          l = paramAnonymousLong.longValue();
        } else {
          l = 0L;
        }
        return Long.valueOf(l);
      }
    });
  }
  
  public boolean getNeedsReschedule()
  {
    Long localLong = this.mWorkDatabase.preferenceDao().getLongValue("reschedule_needed");
    boolean bool;
    if ((localLong != null) && (localLong.longValue() == 1L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setLastCancelAllTimeMillis(long paramLong)
  {
    Preference localPreference = new Preference("last_cancel_all_time_ms", paramLong);
    this.mWorkDatabase.preferenceDao().insertPreference(localPreference);
  }
  
  public void setNeedsReschedule(boolean paramBoolean)
  {
    Preference localPreference = new Preference("reschedule_needed", paramBoolean);
    this.mWorkDatabase.preferenceDao().insertPreference(localPreference);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\PreferenceUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */