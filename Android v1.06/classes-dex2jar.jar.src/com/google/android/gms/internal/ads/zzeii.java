package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;

public final class zzeii
  extends zzbp
{
  final zzezy zza;
  final zzdhl zzb;
  private final Context zzc;
  private final zzcgw zzd;
  private zzbh zze;
  
  public zzeii(zzcgw paramzzcgw, Context paramContext, String paramString)
  {
    zzezy localzzezy = new zzezy();
    this.zza = localzzezy;
    this.zzb = new zzdhl();
    this.zzd = paramzzcgw;
    localzzezy.zzs(paramString);
    this.zzc = paramContext;
  }
  
  public final zzbn zze()
  {
    zzdhn localzzdhn = this.zzb.zzg();
    this.zza.zzB(localzzdhn.zzi());
    this.zza.zzC(localzzdhn.zzh());
    zzezy localzzezy = this.zza;
    if (localzzezy.zzg() == null) {
      localzzezy.zzr(zzq.zzc());
    }
    return new zzeij(this.zzc, this.zzd, this.zza, localzzdhn, this.zze);
  }
  
  public final void zzf(zzbfo paramzzbfo)
  {
    this.zzb.zza(paramzzbfo);
  }
  
  public final void zzg(zzbfr paramzzbfr)
  {
    this.zzb.zzb(paramzzbfr);
  }
  
  public final void zzh(String paramString, zzbfx paramzzbfx, zzbfu paramzzbfu)
  {
    this.zzb.zzc(paramString, paramzzbfx, paramzzbfu);
  }
  
  public final void zzi(zzbkz paramzzbkz)
  {
    this.zzb.zzd(paramzzbkz);
  }
  
  public final void zzj(zzbgb paramzzbgb, zzq paramzzq)
  {
    this.zzb.zze(paramzzbgb);
    this.zza.zzr(paramzzq);
  }
  
  public final void zzk(zzbge paramzzbge)
  {
    this.zzb.zzf(paramzzbge);
  }
  
  public final void zzl(zzbh paramzzbh)
  {
    this.zze = paramzzbh;
  }
  
  public final void zzm(AdManagerAdViewOptions paramAdManagerAdViewOptions)
  {
    this.zza.zzq(paramAdManagerAdViewOptions);
  }
  
  public final void zzn(zzbkq paramzzbkq)
  {
    this.zza.zzv(paramzzbkq);
  }
  
  public final void zzo(zzbee paramzzbee)
  {
    this.zza.zzA(paramzzbee);
  }
  
  public final void zzp(PublisherAdViewOptions paramPublisherAdViewOptions)
  {
    this.zza.zzD(paramPublisherAdViewOptions);
  }
  
  public final void zzq(zzcf paramzzcf)
  {
    this.zza.zzQ(paramzzcf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */