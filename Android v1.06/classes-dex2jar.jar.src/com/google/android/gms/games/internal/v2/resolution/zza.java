package com.google.android.gms.games.internal.v2.resolution;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.internal.games_v2.zzfa;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zza
  extends ResultReceiver
{
  private final TaskCompletionSource zza = new TaskCompletionSource();
  
  public zza()
  {
    super(new zzfa(Looper.getMainLooper()));
  }
  
  protected final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    super.onReceiveResult(paramInt, paramBundle);
    boolean bool;
    if (paramInt == -1) {
      bool = true;
    } else {
      bool = false;
    }
    if (paramBundle == null)
    {
      paramBundle = new Intent();
    }
    else
    {
      Intent localIntent = (Intent)paramBundle.getParcelable("resultData");
      paramBundle = localIntent;
      if (localIntent == null) {
        paramBundle = new Intent();
      }
    }
    if (Boolean.valueOf(bool).booleanValue()) {
      paramBundle = zzc.zzc(paramBundle);
    } else {
      paramBundle = zzc.zzb(paramBundle);
    }
    this.zza.trySetResult(paramBundle);
  }
  
  public final Task zza()
  {
    return this.zza.getTask();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\v2\resolution\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */