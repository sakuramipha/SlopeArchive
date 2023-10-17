package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

public final class zzevr
  implements zzejv
{
  private final Context zza;
  private final Executor zzb;
  private final zzcgw zzc;
  private final zzejf zzd;
  private final zzejj zze;
  private final ViewGroup zzf;
  private zzbci zzg;
  private final zzcxx zzh;
  private final zzfft zzi;
  private final zzdae zzj;
  private final zzezy zzk;
  private zzfwb zzl;
  
  public zzevr(Context paramContext, Executor paramExecutor, zzq paramzzq, zzcgw paramzzcgw, zzejf paramzzejf, zzejj paramzzejj, zzezy paramzzezy, zzdae paramzzdae)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzcgw;
    this.zzd = paramzzejf;
    this.zze = paramzzejj;
    this.zzk = paramzzezy;
    this.zzh = paramzzcgw.zze();
    this.zzi = paramzzcgw.zzy();
    this.zzf = new FrameLayout(paramContext);
    this.zzj = paramzzdae;
    paramzzezy.zzr(paramzzq);
  }
  
  public final boolean zza()
  {
    zzfwb localzzfwb = this.zzl;
    return (localzzfwb != null) && (!localzzfwb.isDone());
  }
  
  public final boolean zzb(zzl paramzzl, String paramString, zzejt paramzzejt, zzeju paramzzeju)
    throws RemoteException
  {
    if (paramString == null)
    {
      zzbzt.zzg("Ad unit ID should not be null for banner ad.");
      this.zzb.execute(new zzevn(this));
      return false;
    }
    if (zza()) {
      return false;
    }
    paramzzejt = zzbbk.zzir;
    if ((((Boolean)zzba.zzc().zzb(paramzzejt)).booleanValue()) && (paramzzl.zzf)) {
      this.zzc.zzj().zzm(true);
    }
    paramzzejt = this.zzk;
    paramzzejt.zzs(paramString);
    paramzzejt.zzE(paramzzl);
    paramString = paramzzejt.zzG();
    zzfff localzzfff = zzffe.zzb(this.zza, zzffp.zzf(paramString), 3, paramzzl);
    if ((((Boolean)zzbdj.zzd.zze()).booleanValue()) && (this.zzk.zzg().zzk))
    {
      paramzzl = this.zzd;
      if (paramzzl != null) {
        paramzzl.zza(zzfba.zzd(7, null, null));
      }
      return false;
    }
    paramzzejt = zzbbk.zzhH;
    zzcuq localzzcuq;
    if (((Boolean)zzba.zzc().zzb(paramzzejt)).booleanValue())
    {
      paramzzejt = this.zzc.zzd();
      localzzcuq = new zzcuq();
      localzzcuq.zze(this.zza);
      localzzcuq.zzi(paramString);
      paramzzejt.zzi(localzzcuq.zzj());
      paramString = new zzdat();
      paramString.zzj(this.zzd, this.zzb);
      paramString.zzk(this.zzd, this.zzb);
      paramzzejt.zzf(paramString.zzn());
      paramzzejt.zze(new zzeho(this.zzg));
      paramzzejt.zzd(new zzdfh(zzdhn.zza, null));
      paramzzejt.zzg(new zzcqx(this.zzh, this.zzj));
      paramzzejt.zzc(new zzcpa(this.zzf));
      paramString = paramzzejt.zzk();
    }
    else
    {
      paramzzejt = this.zzc.zzd();
      localzzcuq = new zzcuq();
      localzzcuq.zze(this.zza);
      localzzcuq.zzi(paramString);
      paramzzejt.zzi(localzzcuq.zzj());
      paramString = new zzdat();
      paramString.zzj(this.zzd, this.zzb);
      paramString.zza(this.zzd, this.zzb);
      paramString.zza(this.zze, this.zzb);
      paramString.zzl(this.zzd, this.zzb);
      paramString.zzd(this.zzd, this.zzb);
      paramString.zze(this.zzd, this.zzb);
      paramString.zzf(this.zzd, this.zzb);
      paramString.zzb(this.zzd, this.zzb);
      paramString.zzk(this.zzd, this.zzb);
      paramString.zzi(this.zzd, this.zzb);
      paramzzejt.zzf(paramString.zzn());
      paramzzejt.zze(new zzeho(this.zzg));
      paramzzejt.zzd(new zzdfh(zzdhn.zza, null));
      paramzzejt.zzg(new zzcqx(this.zzh, this.zzj));
      paramzzejt.zzc(new zzcpa(this.zzf));
      paramString = paramzzejt.zzk();
    }
    if (((Boolean)zzbcw.zzc.zze()).booleanValue())
    {
      paramzzejt = paramString.zzj();
      paramzzejt.zzh(3);
      paramzzejt.zzb(paramzzl.zzp);
      paramzzl = paramzzejt;
    }
    else
    {
      paramzzl = null;
    }
    paramzzejt = paramString.zzd();
    paramzzejt = paramzzejt.zzi(paramzzejt.zzj());
    this.zzl = paramzzejt;
    zzfvr.zzq(paramzzejt, new zzevq(this, paramzzeju, paramzzl, localzzfff, paramString), this.zzb);
    return true;
  }
  
  public final ViewGroup zzd()
  {
    return this.zzf;
  }
  
  public final zzezy zzi()
  {
    return this.zzk;
  }
  
  public final void zzn()
  {
    this.zzh.zzd(this.zzj.zzc());
  }
  
  public final void zzo(zzbe paramzzbe)
  {
    this.zze.zza(paramzzbe);
  }
  
  public final void zzp(zzcxy paramzzcxy)
  {
    this.zzh.zzm(paramzzcxy, this.zzb);
  }
  
  public final void zzq(zzbci paramzzbci)
  {
    this.zzg = paramzzbci;
  }
  
  public final boolean zzr()
  {
    Object localObject = this.zzf.getParent();
    if (!(localObject instanceof View)) {
      return false;
    }
    localObject = (View)localObject;
    zzt.zzp();
    return zzs.zzS((View)localObject, ((View)localObject).getContext());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzevr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */