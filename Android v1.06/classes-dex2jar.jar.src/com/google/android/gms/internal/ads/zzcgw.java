package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

public abstract class zzcgw
  implements zzcmi
{
  @Nullable
  private static zzcgw zza;
  
  private static zzcgw zzC(Context paramContext, @Nullable zzbny paramzzbny, int paramInt1, boolean paramBoolean, int paramInt2, zzchz paramzzchz)
  {
    try
    {
      Object localObject1 = zza;
      if (localObject1 != null) {
        return (zzcgw)localObject1;
      }
      zzbbk.zza(paramContext);
      Object localObject2 = zzfat.zzd(paramContext);
      localObject1 = ((zzfat)localObject2).zzc(231700000, false, paramInt2);
      ((zzfat)localObject2).zze(paramzzbny);
      paramzzbny = new com/google/android/gms/internal/ads/zzcjn;
      paramzzbny.<init>(null);
      Object localObject3 = new com/google/android/gms/internal/ads/zzcgx;
      ((zzcgx)localObject3).<init>();
      ((zzcgx)localObject3).zzd((zzbzz)localObject1);
      ((zzcgx)localObject3).zzc(paramContext);
      localObject2 = new com/google/android/gms/internal/ads/zzcgz;
      ((zzcgz)localObject2).<init>((zzcgx)localObject3, null);
      paramzzbny.zzb((zzcgz)localObject2);
      localObject2 = new com/google/android/gms/internal/ads/zzcla;
      ((zzcla)localObject2).<init>(paramzzchz);
      paramzzbny.zzc((zzcla)localObject2);
      paramzzbny = paramzzbny.zza();
      zzt.zzo().zzs(paramContext, (zzbzz)localObject1);
      zzt.zzc().zzi(paramContext);
      zzt.zzp().zzj(paramContext);
      zzt.zzp().zzi(paramContext);
      zzd.zza(paramContext);
      zzt.zzb().zzd(paramContext);
      zzt.zzv().zzb(paramContext);
      zzbxz.zzd(paramContext);
      paramzzchz = zzbbk.zzfU;
      if (((Boolean)zzba.zzc().zzb(paramzzchz)).booleanValue())
      {
        paramzzchz = zzbbk.zzav;
        if (!((Boolean)zzba.zzc().zzb(paramzzchz)).booleanValue())
        {
          localObject2 = new com/google/android/gms/internal/ads/zzear;
          paramzzchz = new com/google/android/gms/internal/ads/zzawx;
          localObject3 = new com/google/android/gms/internal/ads/zzaxd;
          ((zzaxd)localObject3).<init>(paramContext);
          paramzzchz.<init>((zzaxd)localObject3);
          zzdzv localzzdzv = new com/google/android/gms/internal/ads/zzdzv;
          localObject3 = new com/google/android/gms/internal/ads/zzdzr;
          ((zzdzr)localObject3).<init>(paramContext);
          localzzdzv.<init>((zzdzr)localObject3, paramzzbny.zzz());
          zzt.zzp();
          ((zzear)localObject2).<init>(paramContext, (zzbzz)localObject1, paramzzchz, localzzdzv, UUID.randomUUID().toString(), paramzzbny.zzx());
          ((zzear)localObject2).zzb(zzt.zzo().zzh().zzP());
        }
      }
      zza = paramzzbny;
      return paramzzbny;
    }
    finally {}
  }
  
  public static zzcgw zza(Context paramContext, @Nullable zzbny paramzzbny, int paramInt)
  {
    return zzC(paramContext, paramzzbny, 231700000, false, paramInt, new zzchz());
  }
  
  public abstract Executor zzA();
  
  public abstract ScheduledExecutorService zzB();
  
  public abstract zzcll zzb();
  
  public abstract zzcoq zzc();
  
  public abstract zzcpz zzd();
  
  public abstract zzcxx zze();
  
  public abstract zzdep zzf();
  
  public abstract zzdfl zzg();
  
  public abstract zzdms zzh();
  
  public abstract zzdrk zzi();
  
  public abstract zzdsz zzj();
  
  public abstract zzdtt zzk();
  
  public abstract zzebn zzl();
  
  public abstract zzc zzm();
  
  public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();
  
  public abstract zzaa zzo();
  
  public final zzeri zzp(zzbug paramzzbug, int paramInt)
  {
    return zzq(new zzetk(paramzzbug, paramInt));
  }
  
  protected abstract zzeri zzq(zzetk paramzzetk);
  
  public abstract zzeuf zzr();
  
  public abstract zzevt zzs();
  
  public abstract zzexk zzt();
  
  public abstract zzeyy zzu();
  
  public abstract zzfam zzv();
  
  public abstract zzfaw zzw();
  
  public abstract zzfen zzx();
  
  public abstract zzfft zzy();
  
  public abstract zzfwc zzz();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */