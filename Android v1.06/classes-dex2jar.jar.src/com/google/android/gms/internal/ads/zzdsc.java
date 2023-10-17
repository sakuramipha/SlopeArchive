package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

final class zzdsc
  implements zzfvn
{
  final zzdse zza;
  
  zzdsc(zzdse paramzzdse) {}
  
  public final void zza(Throwable paramThrowable)
  {
    try
    {
      zzdse.zzi(this.zza, true);
      zzdse.zzk(this.zza, "com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int)(zzt.zzB().elapsedRealtime() - zzdse.zza(this.zza)));
      zzcal localzzcal = zzdse.zzb(this.zza);
      paramThrowable = new java/lang/Exception;
      paramThrowable.<init>();
      localzzcal.zze(paramThrowable);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */