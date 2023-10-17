package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

final class zzbxd
{
  private Context zza;
  private Clock zzb;
  private zzg zzc;
  private zzbxy zzd;
  
  public final zzbxd zza(zzg paramzzg)
  {
    this.zzc = paramzzg;
    return this;
  }
  
  public final zzbxd zzb(Context paramContext)
  {
    Objects.requireNonNull(paramContext);
    this.zza = paramContext;
    return this;
  }
  
  public final zzbxd zzc(Clock paramClock)
  {
    Objects.requireNonNull(paramClock);
    this.zzb = paramClock;
    return this;
  }
  
  public final zzbxd zzd(zzbxy paramzzbxy)
  {
    this.zzd = paramzzbxy;
    return this;
  }
  
  public final zzbxz zze()
  {
    zzgvw.zzc(this.zza, Context.class);
    zzgvw.zzc(this.zzb, Clock.class);
    zzgvw.zzc(this.zzc, zzg.class);
    zzgvw.zzc(this.zzd, zzbxy.class);
    return new zzbxf(this.zza, this.zzb, this.zzc, this.zzd, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */