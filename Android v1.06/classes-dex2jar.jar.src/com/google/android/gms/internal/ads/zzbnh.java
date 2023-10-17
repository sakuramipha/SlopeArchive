package com.google.android.gms.internal.ads;

public final class zzbnh
{
  private final zzbmk zza;
  private zzfwb zzb;
  
  zzbnh(zzbmk paramzzbmk)
  {
    this.zza = paramzzbmk;
  }
  
  private final void zzd()
  {
    if (this.zzb == null)
    {
      zzcal localzzcal = new zzcal();
      this.zzb = localzzcal;
      this.zza.zzb(null).zzi(new zzbnf(localzzcal), new zzbng(localzzcal));
    }
  }
  
  public final zzbnk zza(String paramString, zzbmr paramzzbmr, zzbmq paramzzbmq)
  {
    zzd();
    return new zzbnk(this.zzb, "google.afma.activeView.handleUpdate", paramzzbmr, paramzzbmq);
  }
  
  public final void zzb(String paramString, zzbii paramzzbii)
  {
    zzd();
    this.zzb = zzfvr.zzm(this.zzb, new zzbnd(paramString, paramzzbii), zzcag.zzf);
  }
  
  public final void zzc(String paramString, zzbii paramzzbii)
  {
    this.zzb = zzfvr.zzl(this.zzb, new zzbne(paramString, paramzzbii), zzcag.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */