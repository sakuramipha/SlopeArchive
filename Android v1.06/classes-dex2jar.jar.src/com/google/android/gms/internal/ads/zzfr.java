package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;

public abstract class zzfr
  implements zzfx
{
  private final boolean zza;
  private final ArrayList zzb;
  private int zzc;
  private zzgc zzd;
  
  protected zzfr(boolean paramBoolean)
  {
    this.zza = paramBoolean;
    this.zzb = new ArrayList(1);
  }
  
  public final void zzf(zzgz paramzzgz)
  {
    Objects.requireNonNull(paramzzgz);
    if (!this.zzb.contains(paramzzgz))
    {
      this.zzb.add(paramzzgz);
      this.zzc += 1;
    }
  }
  
  protected final void zzg(int paramInt)
  {
    zzgc localzzgc = this.zzd;
    int i = zzfn.zza;
    for (i = 0; i < this.zzc; i++) {
      ((zzgz)this.zzb.get(i)).zza(this, localzzgc, this.zza, paramInt);
    }
  }
  
  protected final void zzh()
  {
    zzgc localzzgc = this.zzd;
    int i = zzfn.zza;
    for (i = 0; i < this.zzc; i++) {
      ((zzgz)this.zzb.get(i)).zzb(this, localzzgc, this.zza);
    }
    this.zzd = null;
  }
  
  protected final void zzi(zzgc paramzzgc)
  {
    for (int i = 0; i < this.zzc; i++) {
      ((zzgz)this.zzb.get(i)).zzc(this, paramzzgc, this.zza);
    }
  }
  
  protected final void zzj(zzgc paramzzgc)
  {
    this.zzd = paramzzgc;
    for (int i = 0; i < this.zzc; i++) {
      ((zzgz)this.zzb.get(i)).zzd(this, paramzzgc, this.zza);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */