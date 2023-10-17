package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

public final class zzeys
  implements zzejv
{
  private final Context zza;
  private final Executor zzb;
  private final zzcgw zzc;
  private final zzeyi zzd;
  private final zzeww zze;
  private final zzezs zzf;
  private final zzfft zzg;
  private final zzezy zzh;
  private zzfwb zzi;
  
  public zzeys(Context paramContext, Executor paramExecutor, zzcgw paramzzcgw, zzeww paramzzeww, zzeyi paramzzeyi, zzezy paramzzezy, zzezs paramzzezs)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzcgw;
    this.zze = paramzzeww;
    this.zzd = paramzzeyi;
    this.zzh = paramzzezy;
    this.zzf = paramzzezs;
    this.zzg = paramzzcgw.zzy();
  }
  
  private final zzdms zzk(zzewu paramzzewu)
  {
    Object localObject = (zzeyr)paramzzewu;
    zzdms localzzdms = this.zzc.zzh();
    paramzzewu = new zzcuq();
    paramzzewu.zze(this.zza);
    paramzzewu.zzi(((zzeyr)localObject).zza);
    localObject = ((zzeyr)localObject).zzb;
    paramzzewu.zzh(this.zzf);
    localzzdms.zzd(paramzzewu.zzj());
    localzzdms.zzc(new zzdat().zzn());
    return localzzdms;
  }
  
  public final boolean zza()
  {
    throw null;
  }
  
  public final boolean zzb(zzl paramzzl, String paramString, zzejt paramzzejt, zzeju paramzzeju)
    throws RemoteException
  {
    paramString = new zzbvd(paramzzl, paramString);
    paramzzl = paramString.zzb;
    boolean bool = true;
    if (paramzzl == null)
    {
      zzbzt.zzg("Ad unit ID should not be null for rewarded video ad.");
      this.zzb.execute(new zzeyl(this));
    }
    do
    {
      bool = false;
      break;
      paramzzl = this.zzi;
    } while ((paramzzl != null) && (!paramzzl.isDone()));
    if (((Boolean)zzbcw.zzc.zze()).booleanValue())
    {
      paramzzl = this.zze;
      if (paramzzl.zzd() != null)
      {
        paramzzl = ((zzdmt)paramzzl.zzd()).zzh();
        paramzzl.zzh(5);
        paramzzl.zzb(paramString.zza.zzp);
        break label136;
      }
    }
    paramzzl = null;
    label136:
    zzfau.zza(this.zza, paramString.zza.zzf);
    paramzzejt = zzbbk.zzir;
    if ((((Boolean)zzba.zzc().zzb(paramzzejt)).booleanValue()) && (paramString.zza.zzf)) {
      this.zzc.zzj().zzm(true);
    }
    paramzzejt = this.zzh;
    paramzzejt.zzs(paramString.zzb);
    paramzzejt.zzr(zzq.zzd());
    paramzzejt.zzE(paramString.zza);
    Object localObject = paramzzejt.zzG();
    paramzzejt = zzffe.zzb(this.zza, zzffp.zzf((zzfaa)localObject), 5, paramString.zza);
    paramString = new zzeyr(null);
    paramString.zza = ((zzfaa)localObject);
    paramString.zzb = null;
    localObject = this.zze.zzc(new zzewx(paramString, null), new zzeym(this), null);
    this.zzi = ((zzfwb)localObject);
    zzfvr.zzq((zzfwb)localObject, new zzeyp(this, paramzzeju, paramzzl, paramzzejt, paramString), this.zzb);
    return bool;
  }
  
  final void zzj(int paramInt)
  {
    this.zzh.zzo().zza(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */