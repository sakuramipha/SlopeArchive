package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcrz
  implements zzo
{
  private final zzcwp zza;
  private final AtomicBoolean zzb = new AtomicBoolean(false);
  private final AtomicBoolean zzc = new AtomicBoolean(false);
  
  public zzcrz(zzcwp paramzzcwp)
  {
    this.zza = paramzzcwp;
  }
  
  private final void zzh()
  {
    if (!this.zzc.get())
    {
      this.zzc.set(true);
      this.zza.zza();
    }
  }
  
  public final void zzb()
  {
    this.zza.zzc();
  }
  
  public final void zzbF() {}
  
  public final void zzbo() {}
  
  public final void zzby()
  {
    zzh();
  }
  
  public final void zze() {}
  
  public final void zzf(int paramInt)
  {
    this.zzb.set(true);
    zzh();
  }
  
  public final boolean zzg()
  {
    return this.zzb.get();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcrz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */