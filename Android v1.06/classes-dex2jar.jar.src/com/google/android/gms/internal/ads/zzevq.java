package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

final class zzevq
  implements zzfvn
{
  final zzevr zze;
  
  zzevq(zzevr paramzzevr, zzeju paramzzeju, zzffq paramzzffq, zzfff paramzzfff, zzcqa paramzzcqa) {}
  
  public final void zza(Throwable paramThrowable)
  {
    Object localObject1 = this.zzd.zzd().zza(paramThrowable);
    synchronized (this.zze)
    {
      zzevr.zzl(this.zze, null);
      this.zzd.zzf().zza((zze)localObject1);
      Object localObject2 = zzbbk.zzhH;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        localObject2 = zzevr.zzk(this.zze);
        localObject3 = new com/google/android/gms/internal/ads/zzevp;
        ((zzevp)localObject3).<init>(this, (zze)localObject1);
        ((Executor)localObject2).execute((Runnable)localObject3);
      }
      localObject2 = this.zze;
      zzevr.zze((zzevr)localObject2).zzd(zzevr.zzf((zzevr)localObject2).zzc());
      zzfau.zzb(((zze)localObject1).zza, paramThrowable, "BannerAdLoader.onFailure");
      this.zza.zza();
      if (((Boolean)zzbcw.zzc.zze()).booleanValue())
      {
        localObject2 = this.zzb;
        if (localObject2 != null)
        {
          ((zzffq)localObject2).zzc((zze)localObject1);
          localObject1 = this.zzc;
          ((zzfff)localObject1).zzg(paramThrowable);
          ((zzfff)localObject1).zzf(false);
          ((zzffq)localObject2).zza((zzfff)localObject1);
          ((zzffq)localObject2).zzg();
          break label254;
        }
      }
      Object localObject3 = zzevr.zzj(this.zze);
      localObject2 = this.zzc;
      ((zzfff)localObject2).zza((zze)localObject1);
      ((zzfff)localObject2).zzg(paramThrowable);
      ((zzfff)localObject2).zzf(false);
      ((zzfft)localObject3).zzb(((zzfff)localObject2).zzl());
      label254:
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzevq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */