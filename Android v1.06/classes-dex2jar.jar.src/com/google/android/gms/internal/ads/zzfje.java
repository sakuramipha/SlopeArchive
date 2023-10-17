package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

public final class zzfje
{
  private final Context zza;
  private final Looper zzb;
  
  public zzfje(Context paramContext, Looper paramLooper)
  {
    this.zza = paramContext;
    this.zzb = paramLooper;
  }
  
  public final void zza(String paramString)
  {
    zzfjs localzzfjs = zzfju.zza();
    localzzfjs.zza(this.zza.getPackageName());
    localzzfjs.zzc(2);
    zzfjp localzzfjp = zzfjq.zza();
    localzzfjp.zza(paramString);
    localzzfjp.zzb(2);
    localzzfjs.zzb(localzzfjp);
    paramString = (zzfju)localzzfjs.zzal();
    new zzfjf(this.zza, this.zzb, paramString).zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */