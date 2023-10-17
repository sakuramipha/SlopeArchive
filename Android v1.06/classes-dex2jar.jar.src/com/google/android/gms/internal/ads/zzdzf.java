package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzdzf
  implements zzcyd, zzcww, zzcvl
{
  private final zzfem zza;
  private final zzfen zzb;
  private final zzbzg zzc;
  
  public zzdzf(zzfem paramzzfem, zzfen paramzzfen, zzbzg paramzzbzg)
  {
    this.zza = paramzzfem;
    this.zzb = paramzzfen;
    this.zzc = paramzzbzg;
  }
  
  public final void zza(zze paramzze)
  {
    zzfem localzzfem = this.zza;
    localzzfem.zza("action", "ftl");
    localzzfem.zza("ftl", String.valueOf(paramzze.zza));
    localzzfem.zza("ed", paramzze.zzc);
    this.zzb.zzb(this.zza);
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    this.zza.zzh(paramzzezr, this.zzc);
  }
  
  public final void zzbA(zzbug paramzzbug)
  {
    this.zza.zzi(paramzzbug.zza);
  }
  
  public final void zzn()
  {
    zzfen localzzfen = this.zzb;
    zzfem localzzfem = this.zza;
    localzzfem.zza("action", "loaded");
    localzzfen.zzb(localzzfem);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */