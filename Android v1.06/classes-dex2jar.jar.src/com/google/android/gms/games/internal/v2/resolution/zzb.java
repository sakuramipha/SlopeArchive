package com.google.android.gms.games.internal.v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.tasks.Task;

public final class zzb
{
  public static zzb zza()
  {
    return new zzb();
  }
  
  public static final Task zzb(Activity paramActivity, PendingIntent paramPendingIntent)
  {
    zza localzza = new zza();
    Intent localIntent = new Intent(paramActivity, GamesResolutionActivity.class);
    localIntent.putExtra("pendingIntent", paramPendingIntent);
    localIntent.putExtra("resultReceiver", localzza);
    paramActivity.startActivity(localIntent);
    return localzza.zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\v2\resolution\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */