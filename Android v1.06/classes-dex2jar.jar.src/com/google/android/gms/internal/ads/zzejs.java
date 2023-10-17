package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;

public final class zzejs
{
  private final zzdhn zza;
  private final zzejf zzb;
  private final zzcvl zzc;
  
  public zzejs(zzdhn paramzzdhn, zzfen paramzzfen)
  {
    this.zza = paramzzdhn;
    paramzzfen = new zzejf(paramzzfen);
    this.zzb = paramzzfen;
    this.zzc = new zzejr(paramzzfen, paramzzdhn.zzg());
  }
  
  public final zzcvl zza()
  {
    return this.zzc;
  }
  
  public final zzcww zzb()
  {
    return this.zzb;
  }
  
  public final zzdfh zzc()
  {
    return new zzdfh(this.zza, this.zzb.zzc());
  }
  
  public final zzejf zzd()
  {
    return this.zzb;
  }
  
  public final void zze(zzbh paramzzbh)
  {
    this.zzb.zze(paramzzbh);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzejs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */