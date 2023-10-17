package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzc
  implements Runnable
{
  final zzd zzc;
  
  zzc(zzd paramzzd, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run()
  {
    Object localObject = this.zzc;
    if (zzd.zza((zzd)localObject) > 0)
    {
      LifecycleCallback localLifecycleCallback = this.zza;
      if (zzd.zzb((zzd)localObject) != null) {
        localObject = zzd.zzb((zzd)localObject).getBundle(this.zzb);
      } else {
        localObject = null;
      }
      localLifecycleCallback.onCreate((Bundle)localObject);
    }
    if (zzd.zza(this.zzc) >= 2) {
      this.zza.onStart();
    }
    if (zzd.zza(this.zzc) >= 3) {
      this.zza.onResume();
    }
    if (zzd.zza(this.zzc) >= 4) {
      this.zza.onStop();
    }
    if (zzd.zza(this.zzc) >= 5) {
      this.zza.onDestroy();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */