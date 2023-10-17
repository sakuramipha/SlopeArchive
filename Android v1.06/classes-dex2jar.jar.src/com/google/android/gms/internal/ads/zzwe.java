package com.google.android.gms.internal.ads;

final class zzwe
  implements Comparable
{
  private final boolean zza;
  private final boolean zzb;
  
  public zzwe(zzam paramzzam, int paramInt)
  {
    int i = paramzzam.zze;
    boolean bool = true;
    if (1 != (i & 0x1)) {
      bool = false;
    }
    this.zza = bool;
    this.zzb = zzwv.zzm(paramInt, false);
  }
  
  public final int zza(zzwe paramzzwe)
  {
    return zzfrg.zzj().zzd(this.zzb, paramzzwe.zzb).zzd(this.zza, paramzzwe.zza).zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */