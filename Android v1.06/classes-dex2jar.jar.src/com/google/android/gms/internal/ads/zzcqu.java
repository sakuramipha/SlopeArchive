package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcqu
  implements zzcww, zzaty
{
  private final zzezf zza;
  private final zzcwa zzb;
  private final zzcxf zzc;
  private final AtomicBoolean zzd = new AtomicBoolean();
  private final AtomicBoolean zze = new AtomicBoolean();
  
  public zzcqu(zzezf paramzzezf, zzcwa paramzzcwa, zzcxf paramzzcxf)
  {
    this.zza = paramzzezf;
    this.zzb = paramzzcwa;
    this.zzc = paramzzcxf;
  }
  
  private final void zza()
  {
    if (this.zzd.compareAndSet(false, true)) {
      this.zzb.zza();
    }
  }
  
  public final void zzc(zzatx paramzzatx)
  {
    if ((this.zza.zzf == 1) && (paramzzatx.zzj)) {
      zza();
    }
    if ((paramzzatx.zzj) && (this.zze.compareAndSet(false, true))) {
      this.zzc.zza();
    }
  }
  
  public final void zzn()
  {
    try
    {
      if (this.zza.zzf != 1)
      {
        zza();
        return;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */