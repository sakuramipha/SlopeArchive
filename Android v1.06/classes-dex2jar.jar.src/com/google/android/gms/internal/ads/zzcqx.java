package com.google.android.gms.internal.ads;

public final class zzcqx
{
  private final zzcxx zza;
  private final zzdae zzb;
  
  public zzcqx(zzcxx paramzzcxx, zzdae paramzzdae)
  {
    this.zza = paramzzcxx;
    this.zzb = paramzzdae;
  }
  
  public final zzcxx zza()
  {
    return this.zza;
  }
  
  final zzdae zzb()
  {
    return this.zzb;
  }
  
  final zzdco zzc()
  {
    zzdae localzzdae = this.zzb;
    if (localzzdae != null) {
      return new zzdco(localzzdae, zzcag.zzf);
    }
    return new zzdco(new zzcqw(this), zzcag.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */