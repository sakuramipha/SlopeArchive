package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzl
  implements AppSetIdClient
{
  private static AppSetIdClient zza;
  private final Context zzb;
  private boolean zzc = false;
  private final ScheduledExecutorService zzd;
  private final ExecutorService zze;
  
  zzl(Context paramContext)
  {
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    this.zzd = localScheduledExecutorService;
    this.zze = Executors.newSingleThreadExecutor();
    this.zzb = paramContext;
    if (!this.zzc)
    {
      localScheduledExecutorService.scheduleAtFixedRate(new zzj(this, null), 0L, 86400L, TimeUnit.SECONDS);
      this.zzc = true;
    }
  }
  
  static AppSetIdClient zzc(Context paramContext)
  {
    try
    {
      Preconditions.checkNotNull(paramContext, "Context must not be null");
      if (zza == null)
      {
        zzl localzzl = new com/google/android/gms/internal/appset/zzl;
        localzzl.<init>(paramContext.getApplicationContext());
        zza = localzzl;
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  protected static final void zze(Context paramContext)
  {
    if (!zzf(paramContext).edit().remove("app_set_id").commit())
    {
      String str = String.valueOf(paramContext.getPackageName());
      if (str.length() != 0) {
        str = "Failed to clear app set ID generated for App ".concat(str);
      } else {
        str = new String("Failed to clear app set ID generated for App ");
      }
      Log.e("AppSet", str);
    }
    if (!zzf(paramContext).edit().remove("app_set_id_last_used_time").commit())
    {
      paramContext = String.valueOf(paramContext.getPackageName());
      if (paramContext.length() != 0) {
        paramContext = "Failed to clear app set ID last used time for App ".concat(paramContext);
      } else {
        paramContext = new String("Failed to clear app set ID last used time for App ");
      }
      Log.e("AppSet", paramContext);
    }
  }
  
  private static final SharedPreferences zzf(Context paramContext)
  {
    return paramContext.getSharedPreferences("app_set_id_storage", 0);
  }
  
  private static final void zzg(Context paramContext)
    throws zzk
  {
    SharedPreferences localSharedPreferences = zzf(paramContext);
    long l = DefaultClock.getInstance().currentTimeMillis();
    if (!localSharedPreferences.edit().putLong("app_set_id_last_used_time", l).commit())
    {
      paramContext = String.valueOf(paramContext.getPackageName());
      if (paramContext.length() != 0) {
        paramContext = "Failed to store app set ID last used time for App ".concat(paramContext);
      } else {
        paramContext = new String("Failed to store app set ID last used time for App ");
      }
      Log.e("AppSet", paramContext);
      throw new zzk("Failed to store the app set ID last used time.");
    }
  }
  
  public final Task<AppSetIdInfo> getAppSetIdInfo()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    this.zze.execute(new zzh(this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  protected final long zza()
  {
    long l = zzf(this.zzb).getLong("app_set_id_last_used_time", -1L);
    if (l != -1L) {
      return l + 33696000000L;
    }
    return -1L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */