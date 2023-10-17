package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

public final class zzexi
  implements zzejv
{
  private final Context zza;
  private final Executor zzb;
  private final zzcgw zzc;
  private final zzejf zzd;
  private final zzeyi zze;
  private zzbci zzf;
  private final zzfft zzg;
  private final zzezy zzh;
  private zzfwb zzi;
  
  public zzexi(Context paramContext, Executor paramExecutor, zzcgw paramzzcgw, zzejf paramzzejf, zzeyi paramzzeyi, zzezy paramzzezy)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzcgw;
    this.zzd = paramzzejf;
    this.zzh = paramzzezy;
    this.zze = paramzzeyi;
    this.zzg = paramzzcgw.zzy();
  }
  
  public final boolean zza()
  {
    zzfwb localzzfwb = this.zzi;
    return (localzzfwb != null) && (!localzzfwb.isDone());
  }
  
  public final boolean zzb(zzl paramzzl, String paramString, zzejt paramzzejt, zzeju paramzzeju)
  {
    if (paramString == null)
    {
      zzbzt.zzg("Ad unit ID should not be null for interstitial ad.");
      this.zzb.execute(new zzexc(this));
      return false;
    }
    if (zza()) {
      return false;
    }
    Object localObject1 = zzbbk.zzir;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (paramzzl.zzf)) {
      this.zzc.zzj().zzm(true);
    }
    localObject1 = ((zzexb)paramzzejt).zza;
    paramzzejt = this.zzh;
    paramzzejt.zzs(paramString);
    paramzzejt.zzr((zzq)localObject1);
    paramzzejt.zzE(paramzzl);
    paramString = paramzzejt.zzG();
    localObject1 = zzffe.zzb(this.zza, zzffp.zzf(paramString), 4, paramzzl);
    paramzzejt = zzbbk.zzhJ;
    Object localObject2;
    if (((Boolean)zzba.zzc().zzb(paramzzejt)).booleanValue())
    {
      paramzzejt = this.zzc.zzf();
      localObject2 = new zzcuq();
      ((zzcuq)localObject2).zze(this.zza);
      ((zzcuq)localObject2).zzi(paramString);
      paramzzejt.zze(((zzcuq)localObject2).zzj());
      paramString = new zzdat();
      paramString.zzj(this.zzd, this.zzb);
      paramString.zzk(this.zzd, this.zzb);
      paramzzejt.zzd(paramString.zzn());
      paramzzejt.zzc(new zzeho(this.zzf));
    }
    zzdep localzzdep;
    for (paramString = paramzzejt.zzf();; paramString = localzzdep.zzf())
    {
      break;
      paramzzejt = new zzdat();
      localObject2 = this.zze;
      if (localObject2 != null)
      {
        paramzzejt.zze((zzcvi)localObject2, this.zzb);
        paramzzejt.zzf(this.zze, this.zzb);
        paramzzejt.zzb(this.zze, this.zzb);
      }
      localzzdep = this.zzc.zzf();
      localObject2 = new zzcuq();
      ((zzcuq)localObject2).zze(this.zza);
      ((zzcuq)localObject2).zzi(paramString);
      localzzdep.zze(((zzcuq)localObject2).zzj());
      paramzzejt.zzj(this.zzd, this.zzb);
      paramzzejt.zze(this.zzd, this.zzb);
      paramzzejt.zzf(this.zzd, this.zzb);
      paramzzejt.zzb(this.zzd, this.zzb);
      paramzzejt.zza(this.zzd, this.zzb);
      paramzzejt.zzl(this.zzd, this.zzb);
      paramzzejt.zzk(this.zzd, this.zzb);
      paramzzejt.zzi(this.zzd, this.zzb);
      paramzzejt.zzc(this.zzd, this.zzb);
      localzzdep.zzd(paramzzejt.zzn());
      localzzdep.zzc(new zzeho(this.zzf));
    }
    if (((Boolean)zzbcw.zzc.zze()).booleanValue())
    {
      paramzzejt = paramString.zzf();
      paramzzejt.zzh(4);
      paramzzejt.zzb(paramzzl.zzp);
      paramzzl = paramzzejt;
    }
    else
    {
      paramzzl = null;
    }
    paramzzejt = paramString.zza();
    paramzzejt = paramzzejt.zzi(paramzzejt.zzj());
    this.zzi = paramzzejt;
    zzfvr.zzq(paramzzejt, new zzexh(this, paramzzeju, paramzzl, (zzfff)localObject1, paramString), this.zzb);
    return true;
  }
  
  public final void zzi(zzbci paramzzbci)
  {
    this.zzf = paramzzbci;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzexi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */