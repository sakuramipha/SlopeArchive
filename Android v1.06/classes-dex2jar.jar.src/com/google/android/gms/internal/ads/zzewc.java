package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

public final class zzewc
  implements zzeww
{
  private final zzeww zza;
  private final zzeww zzb;
  private final zzfci zzc;
  private final String zzd;
  private zzcup zze;
  private final Executor zzf;
  
  public zzewc(zzeww paramzzeww1, zzeww paramzzeww2, zzfci paramzzfci, String paramString, Executor paramExecutor)
  {
    this.zza = paramzzeww1;
    this.zzb = paramzzeww2;
    this.zzc = paramzzfci;
    this.zzd = paramString;
    this.zzf = paramExecutor;
  }
  
  private final zzfwb zzg(zzfbv paramzzfbv, zzewx paramzzewx)
  {
    Object localObject = paramzzfbv.zza;
    this.zze = ((zzcup)localObject);
    if (paramzzfbv.zzc != null)
    {
      if (((zzcup)localObject).zzf() != null) {
        paramzzfbv.zzc.zzo().zzbG(paramzzfbv.zza.zzf());
      }
      return zzfvr.zzh(paramzzfbv.zzc);
    }
    ((zzcup)localObject).zzb().zzl(paramzzfbv.zzb);
    localObject = this.zza;
    paramzzfbv = paramzzfbv.zza;
    return ((zzewm)localObject).zzb(paramzzewx, null, paramzzfbv);
  }
  
  public final zzcup zza()
  {
    try
    {
      zzcup localzzcup = this.zze;
      return localzzcup;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzfwb zzf(zzewx paramzzewx, zzewv paramzzewv, zzcup paramzzcup)
  {
    try
    {
      Object localObject1 = paramzzewv.zza(paramzzewx.zzb);
      paramzzcup = new com/google/android/gms/internal/ads/zzewd;
      paramzzcup.<init>(this.zzd);
      ((zzcuo)localObject1).zza(paramzzcup);
      paramzzcup = (zzcup)((zzcuo)localObject1).zzh();
      paramzzcup.zzg();
      paramzzcup.zzg();
      localObject1 = paramzzcup.zzg().zzd;
      if ((((zzl)localObject1).zzs == null) && (((zzl)localObject1).zzx == null))
      {
        localObject1 = paramzzcup.zzg();
        Object localObject3 = ((zzfaa)localObject1).zzd;
        Object localObject2 = ((zzfaa)localObject1).zzf;
        zzw localzzw = ((zzfaa)localObject1).zzj;
        localObject1 = new com/google/android/gms/internal/ads/zzewb;
        ((zzewb)localObject1).<init>(paramzzewv, paramzzewx, (zzl)localObject3, (String)localObject2, this.zzf, localzzw, null);
        localObject2 = zzfvi.zzv(((zzewi)this.zzb).zzb(paramzzewx, paramzzewv, paramzzcup));
        localObject3 = new com/google/android/gms/internal/ads/zzevz;
        ((zzevz)localObject3).<init>(this, paramzzewx, (zzewb)localObject1, paramzzewv, paramzzcup);
        paramzzewx = zzfvr.zzm((zzfwb)localObject2, (zzfuy)localObject3, this.zzf);
        return paramzzewx;
      }
      this.zze = paramzzcup;
      paramzzewx = ((zzewm)this.zza).zzb(paramzzewx, paramzzewv, paramzzcup);
      return paramzzewx;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzewc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */