package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbnc
  implements zzbmo
{
  private final zzbmq zza;
  private final zzbmr zzb;
  private final zzbmk zzc;
  private final String zzd;
  
  zzbnc(zzbmk paramzzbmk, String paramString, zzbmr paramzzbmr, zzbmq paramzzbmq)
  {
    this.zzc = paramzzbmk;
    this.zzd = paramString;
    this.zzb = paramzzbmr;
    this.zza = paramzzbmq;
  }
  
  public final zzfwb zza(Object paramObject)
    throws Exception
  {
    return zzb(paramObject);
  }
  
  public final zzfwb zzb(Object paramObject)
  {
    zzcal localzzcal = new zzcal();
    zzbme localzzbme = this.zzc.zzb(null);
    localzzbme.zzi(new zzbmz(this, localzzbme, paramObject, localzzcal), new zzbna(this, localzzcal, localzzbme));
    return localzzcal;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */