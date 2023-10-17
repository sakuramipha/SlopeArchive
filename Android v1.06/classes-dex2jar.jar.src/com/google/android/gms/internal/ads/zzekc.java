package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

public final class zzekc
  implements zzejv
{
  private final zzezy zza;
  private final zzcgw zzb;
  private final Context zzc;
  private final zzejs zzd;
  private final zzfft zze;
  private zzcrt zzf;
  
  public zzekc(zzcgw paramzzcgw, Context paramContext, zzejs paramzzejs, zzezy paramzzezy)
  {
    this.zzb = paramzzcgw;
    this.zzc = paramContext;
    this.zzd = paramzzejs;
    this.zza = paramzzezy;
    this.zze = paramzzcgw.zzy();
    paramzzezy.zzu(paramzzejs.zzd());
  }
  
  public final boolean zza()
  {
    zzcrt localzzcrt = this.zzf;
    return (localzzcrt != null) && (localzzcrt.zzf());
  }
  
  public final boolean zzb(zzl paramzzl, String paramString, zzejt paramzzejt, zzeju paramzzeju)
    throws RemoteException
  {
    zzt.zzp();
    if ((zzs.zzD(this.zzc)) && (paramzzl.zzs == null))
    {
      zzbzt.zzg("Failed to load the ad because app ID is missing.");
      this.zzb.zzA().execute(new zzejx(this));
      return false;
    }
    if (paramString == null)
    {
      zzbzt.zzg("Ad unit ID should not be null for NativeAdLoader.");
      this.zzb.zzA().execute(new zzejy(this));
      return false;
    }
    zzfau.zza(this.zzc, paramzzl.zzf);
    paramString = zzbbk.zzir;
    if ((((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) && (paramzzl.zzf)) {
      this.zzb.zzj().zzm(true);
    }
    int i = ((zzejw)paramzzejt).zza;
    paramString = this.zza;
    paramString.zzE(paramzzl);
    paramString.zzz(i);
    paramString = paramString.zzG();
    paramzzejt = zzffe.zzb(this.zzc, zzffp.zzf(paramString), 8, paramzzl);
    Object localObject1 = paramString.zzn;
    if (localObject1 != null) {
      this.zzd.zzd().zzi((zzcb)localObject1);
    }
    localObject1 = this.zzb.zzg();
    Object localObject2 = new zzcuq();
    ((zzcuq)localObject2).zze(this.zzc);
    ((zzcuq)localObject2).zzi(paramString);
    ((zzdfl)localObject1).zzf(((zzcuq)localObject2).zzj());
    paramString = new zzdat();
    paramString.zzk(this.zzd.zzd(), this.zzb.zzA());
    ((zzdfl)localObject1).zze(paramString.zzn());
    ((zzdfl)localObject1).zzd(this.zzd.zzc());
    ((zzdfl)localObject1).zzc(new zzcpa(null));
    localObject1 = ((zzdfl)localObject1).zzg();
    if (((Boolean)zzbcw.zzc.zze()).booleanValue())
    {
      paramString = ((zzdfm)localObject1).zzf();
      paramString.zzh(8);
      paramString.zzb(paramzzl.zzp);
      paramzzl = paramString;
    }
    else
    {
      paramzzl = null;
    }
    this.zzb.zzw().zzc(1);
    localObject2 = zzcag.zza;
    zzgvw.zzb(localObject2);
    paramString = this.zzb.zzB();
    zzcsm localzzcsm = ((zzdfm)localObject1).zza();
    paramString = new zzcrt((Executor)localObject2, paramString, localzzcsm.zzi(localzzcsm.zzj()));
    this.zzf = paramString;
    paramString.zze(new zzekb(this, paramzzeju, paramzzl, paramzzejt, (zzdfm)localObject1));
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzekc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */