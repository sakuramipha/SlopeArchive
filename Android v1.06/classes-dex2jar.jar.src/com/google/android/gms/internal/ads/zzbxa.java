package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

public final class zzbxa
{
  private final Clock zza;
  private final zzbwy zzb;
  
  zzbxa(Clock paramClock, zzbwy paramzzbwy)
  {
    this.zza = paramClock;
    this.zzb = paramzzbwy;
  }
  
  public static zzbxa zza(Context paramContext)
  {
    return zzbxz.zzd(paramContext).zzb();
  }
  
  public final void zzb(int paramInt, long paramLong)
  {
    this.zzb.zzb(paramInt, paramLong);
  }
  
  public final void zzc()
  {
    this.zzb.zza();
  }
  
  public final void zzd(zzff paramzzff)
  {
    this.zzb.zzb(-1, this.zza.currentTimeMillis());
  }
  
  public final void zze()
  {
    this.zzb.zzb(-1, this.zza.currentTimeMillis());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */