package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zza
  implements Runnable
{
  final zzb zzc;
  
  zza(zzb paramzzb, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run()
  {
    Object localObject = this.zzc;
    if (zzb.zza((zzb)localObject) > 0)
    {
      LifecycleCallback localLifecycleCallback = this.zza;
      if (zzb.zzb((zzb)localObject) != null) {
        localObject = zzb.zzb((zzb)localObject).getBundle(this.zzb);
      } else {
        localObject = null;
      }
      localLifecycleCallback.onCreate((Bundle)localObject);
    }
    if (zzb.zza(this.zzc) >= 2) {
      this.zza.onStart();
    }
    if (zzb.zza(this.zzc) >= 3) {
      this.zza.onResume();
    }
    if (zzb.zza(this.zzc) >= 4) {
      this.zza.onStop();
    }
    if (zzb.zza(this.zzc) >= 5) {
      this.zza.onDestroy();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */