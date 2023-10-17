package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzlk
  implements zzkh
{
  private final zzdz zza;
  private boolean zzb;
  private long zzc;
  private long zzd;
  private zzci zze;
  
  public zzlk(zzdz paramzzdz)
  {
    this.zza = paramzzdz;
    this.zze = zzci.zza;
  }
  
  public final long zza()
  {
    long l2 = this.zzc;
    long l1 = l2;
    if (this.zzb)
    {
      l1 = SystemClock.elapsedRealtime() - this.zzd;
      zzci localzzci = this.zze;
      if (localzzci.zzc == 1.0F) {
        l1 = zzfn.zzo(l1);
      } else {
        l1 = localzzci.zza(l1);
      }
      l1 = l2 + l1;
    }
    return l1;
  }
  
  public final void zzb(long paramLong)
  {
    this.zzc = paramLong;
    if (this.zzb) {
      this.zzd = SystemClock.elapsedRealtime();
    }
  }
  
  public final zzci zzc()
  {
    return this.zze;
  }
  
  public final void zzd()
  {
    if (!this.zzb)
    {
      this.zzd = SystemClock.elapsedRealtime();
      this.zzb = true;
    }
  }
  
  public final void zze()
  {
    if (this.zzb)
    {
      zzb(zza());
      this.zzb = false;
    }
  }
  
  public final void zzg(zzci paramzzci)
  {
    if (this.zzb) {
      zzb(zza());
    }
    this.zze = paramzzci;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */