package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

public final class zzeal
  implements zzfee
{
  private final zzdzz zza;
  private final zzead zzb;
  
  zzeal(zzdzz paramzzdzz, zzead paramzzead)
  {
    this.zza = paramzzdzz;
    this.zzb = paramzzead;
  }
  
  public final void zzbB(zzfdx paramzzfdx, String paramString) {}
  
  public final void zzbC(zzfdx paramzzfdx, String paramString, Throwable paramThrowable)
  {
    paramString = zzbbk.zzfU;
    if ((((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) && (zzfdx.zzd == paramzzfdx) && (this.zza.zzc() != 0L)) {
      this.zza.zzf(zzt.zzB().elapsedRealtime() - this.zza.zzc());
    }
  }
  
  public final void zzc(zzfdx paramzzfdx, String paramString)
  {
    paramString = zzbbk.zzfU;
    if (!((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
      return;
    }
    if (zzfdx.zzd == paramzzfdx)
    {
      this.zza.zzg(zzt.zzB().elapsedRealtime());
      return;
    }
    if ((zzfdx.zzz != paramzzfdx) && (zzfdx.zzc != paramzzfdx)) {
      return;
    }
    this.zza.zzh(zzt.zzB().elapsedRealtime());
    paramzzfdx = this.zzb;
    long l = this.zza.zzd();
    paramzzfdx.zza.zza(new zzeac(paramzzfdx, l));
  }
  
  public final void zzd(zzfdx paramzzfdx, String paramString)
  {
    paramString = zzbbk.zzfU;
    if ((((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) && (zzfdx.zzd == paramzzfdx) && (this.zza.zzc() != 0L)) {
      this.zza.zzf(zzt.zzB().elapsedRealtime() - this.zza.zzc());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */