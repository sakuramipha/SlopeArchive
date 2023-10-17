package com.google.android.gms.internal.ads;

public final class zzpk
{
  final zzpj zza = zzpj.zza;
  private zzoh zzb = zzoh.zza;
  private zzpm zzc;
  
  @Deprecated
  public final zzpk zzb(zzoh paramzzoh)
  {
    this.zzb = paramzzoh;
    return this;
  }
  
  public final zzpk zzc(zzdr[] paramArrayOfzzdr)
  {
    this.zzc = new zzpm(paramArrayOfzzdr);
    return this;
  }
  
  public final zzpw zzd()
  {
    if (this.zzc == null) {
      this.zzc = new zzpm(new zzdr[0]);
    }
    return new zzpw(this, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */