package com.google.android.gms.internal.ads;

public final class zzfet
  implements zzfen
{
  private final zzfex zza;
  private final zzfev zzb;
  private final zzfek zzc;
  
  public zzfet(zzfek paramzzfek, zzfex paramzzfex, zzfev paramzzfev)
  {
    this.zzc = paramzzfek;
    this.zza = paramzzfex;
    this.zzb = paramzzfev;
  }
  
  public final String zza(zzfem paramzzfem)
  {
    zzfex localzzfex = this.zza;
    paramzzfem = paramzzfem.zzj();
    this.zzb.zza(paramzzfem);
    return localzzfex.zza(paramzzfem);
  }
  
  public final void zzb(zzfem paramzzfem)
  {
    this.zzc.zzb(zza(paramzzfem));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */