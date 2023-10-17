package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.Map;

public final class zzdpn
  implements zzcyd, zzcww, zzcvl
{
  private final zzdpx zza;
  private final zzdqh zzb;
  
  public zzdpn(zzdpx paramzzdpx, zzdqh paramzzdqh)
  {
    this.zza = paramzzdpx;
    this.zzb = paramzzdqh;
  }
  
  public final void zza(zze paramzze)
  {
    this.zza.zza().put("action", "ftl");
    this.zza.zza().put("ftl", String.valueOf(paramzze.zza));
    this.zza.zza().put("ed", paramzze.zzc);
    this.zzb.zze(this.zza.zza());
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    this.zza.zzb(paramzzezr);
  }
  
  public final void zzbA(zzbug paramzzbug)
  {
    this.zza.zzc(paramzzbug.zza);
  }
  
  public final void zzn()
  {
    this.zza.zza().put("action", "loaded");
    this.zzb.zze(this.zza.zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */