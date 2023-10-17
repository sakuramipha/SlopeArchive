package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeyi
  implements OnAdMetadataChangedListener, zzcww, zzcvl, zzcvi, zzcvy, zzcxt, zzewt, zzdcw
{
  private final zzfbi zza;
  private final AtomicReference zzb = new AtomicReference();
  private final AtomicReference zzc = new AtomicReference();
  private final AtomicReference zzd = new AtomicReference();
  private final AtomicReference zze = new AtomicReference();
  private final AtomicReference zzf = new AtomicReference();
  private final AtomicReference zzg = new AtomicReference();
  private final AtomicReference zzh = new AtomicReference();
  
  public zzeyi(zzfbi paramzzfbi)
  {
    this.zza = paramzzfbi;
  }
  
  public final void onAdMetadataChanged()
  {
    zzewk.zza(this.zzb, zzeyc.zza);
  }
  
  public final void zza(zze paramzze)
  {
    int i = paramzze.zza;
    zzewk.zza(this.zzc, new zzexo(paramzze));
    zzewk.zza(this.zzc, new zzexp(i));
    zzewk.zza(this.zze, new zzexq(i));
  }
  
  public final void zzb(OnAdMetadataChangedListener paramOnAdMetadataChangedListener)
  {
    this.zzb.set(paramOnAdMetadataChangedListener);
  }
  
  public final void zzbG(zzewt paramzzewt)
  {
    throw null;
  }
  
  public final void zzbr()
  {
    zzewk.zza(this.zze, zzexx.zza);
  }
  
  public final void zzc(zzdg paramzzdg)
  {
    this.zzh.set(paramzzdg);
  }
  
  public final void zzd(zzbvs paramzzbvs)
  {
    this.zzd.set(paramzzbvs);
  }
  
  public final void zze(zzbvw paramzzbvw)
  {
    this.zzc.set(paramzzbvw);
  }
  
  @Deprecated
  public final void zzf(zzbvc paramzzbvc)
  {
    this.zze.set(paramzzbvc);
  }
  
  @Deprecated
  public final void zzg(zzbux paramzzbux)
  {
    this.zzg.set(paramzzbux);
  }
  
  public final void zzh(zzs paramzzs)
  {
    zzewk.zza(this.zzh, new zzexn(paramzzs));
  }
  
  public final void zzi(zzbvx paramzzbvx)
  {
    this.zzf.set(paramzzbvx);
  }
  
  public final void zzj()
  {
    this.zza.zza();
    zzewk.zza(this.zzd, zzexu.zza);
    zzewk.zza(this.zze, zzexv.zza);
  }
  
  public final void zzk(zze paramzze)
  {
    zzewk.zza(this.zzd, new zzexr(paramzze));
    zzewk.zza(this.zzd, new zzexs(paramzze));
  }
  
  public final void zzm()
  {
    zzewk.zza(this.zze, zzeyd.zza);
  }
  
  public final void zzn()
  {
    zzewk.zza(this.zzc, zzeya.zza);
    zzewk.zza(this.zze, zzeyb.zza);
  }
  
  public final void zzo()
  {
    zzewk.zza(this.zzd, zzexw.zza);
    zzewk.zza(this.zze, zzexy.zza);
    zzewk.zza(this.zzd, zzexz.zza);
  }
  
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2)
  {
    zzewk.zza(this.zzd, new zzeye(paramzzbuw));
    zzewk.zza(this.zzf, new zzeyf(paramzzbuw, paramString1, paramString2));
    zzewk.zza(this.zze, new zzeyg(paramzzbuw));
    zzewk.zza(this.zzg, new zzeyh(paramzzbuw, paramString1, paramString2));
  }
  
  public final void zzq()
  {
    zzewk.zza(this.zze, zzext.zza);
  }
  
  public final void zzr()
  {
    zzewk.zza(this.zzd, zzexm.zza);
  }
  
  public final void zzs() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeyi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */