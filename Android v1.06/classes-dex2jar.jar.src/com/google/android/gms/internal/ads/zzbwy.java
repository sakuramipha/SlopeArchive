package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbwy
{
  private final Clock zza;
  private final zzg zzb;
  private final zzbxy zzc;
  
  zzbwy(Clock paramClock, zzg paramzzg, zzbxy paramzzbxy)
  {
    this.zza = paramClock;
    this.zzb = paramzzg;
    this.zzc = paramzzbxy;
  }
  
  public final void zza()
  {
    zzbbc localzzbbc = zzbbk.zzar;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return;
    }
    this.zzc.zzt();
  }
  
  public final void zzb(int paramInt, long paramLong)
  {
    zzbbc localzzbbc = zzbbk.zzaq;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return;
    }
    if (paramLong - this.zzb.zzf() < 0L)
    {
      zze.zza("Receiving npa decision in the past, ignoring.");
      return;
    }
    localzzbbc = zzbbk.zzar;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      this.zzb.zzK(-1);
      this.zzb.zzL(paramLong);
    }
    else
    {
      this.zzb.zzK(paramInt);
      this.zzb.zzL(paramLong);
    }
    zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */