package com.google.android.gms.internal.ads;

final class zzen
{
  public final Object zza;
  private zzaf zzb;
  private boolean zzc;
  private boolean zzd;
  
  public zzen(Object paramObject)
  {
    this.zza = paramObject;
    this.zzb = new zzaf();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass())) {
      return this.zza.equals(((zzen)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public final void zza(int paramInt, zzel paramzzel)
  {
    if (!this.zzd)
    {
      if (paramInt != -1) {
        this.zzb.zza(paramInt);
      }
      this.zzc = true;
      paramzzel.zza(this.zza);
    }
  }
  
  public final void zzb(zzem paramzzem)
  {
    if ((!this.zzd) && (this.zzc))
    {
      zzah localzzah = this.zzb.zzb();
      this.zzb = new zzaf();
      this.zzc = false;
      paramzzem.zza(this.zza, localzzah);
    }
  }
  
  public final void zzc(zzem paramzzem)
  {
    this.zzd = true;
    if (this.zzc)
    {
      this.zzc = false;
      paramzzem.zza(this.zza, this.zzb.zzb());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */