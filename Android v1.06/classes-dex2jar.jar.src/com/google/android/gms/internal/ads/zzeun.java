package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public abstract class zzeun
  implements zzejv
{
  protected final zzcgw zza;
  private final Context zzb;
  private final Executor zzc;
  private final zzevd zzd;
  private final zzeww zze;
  private final zzbzz zzf;
  private final ViewGroup zzg;
  private final zzfft zzh;
  private final zzezy zzi;
  @Nullable
  private zzfwb zzj;
  
  protected zzeun(Context paramContext, Executor paramExecutor, zzcgw paramzzcgw, zzeww paramzzeww, zzevd paramzzevd, zzezy paramzzezy, zzbzz paramzzbzz)
  {
    this.zzb = paramContext;
    this.zzc = paramExecutor;
    this.zza = paramzzcgw;
    this.zze = paramzzeww;
    this.zzd = paramzzevd;
    this.zzi = paramzzezy;
    this.zzf = paramzzbzz;
    this.zzg = new FrameLayout(paramContext);
    this.zzh = paramzzcgw.zzy();
  }
  
  private final zzcuo zzm(zzewu paramzzewu)
  {
    try
    {
      paramzzewu = (zzeum)paramzzewu;
      Object localObject1 = zzbbk.zzhI;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = new com/google/android/gms/internal/ads/zzcpa;
        ((zzcpa)localObject1).<init>(this.zzg);
        localObject2 = new com/google/android/gms/internal/ads/zzcuq;
        ((zzcuq)localObject2).<init>();
        ((zzcuq)localObject2).zze(this.zzb);
        ((zzcuq)localObject2).zzi(paramzzewu.zza);
        paramzzewu = ((zzcuq)localObject2).zzj();
        localObject2 = new com/google/android/gms/internal/ads/zzdat;
        ((zzdat)localObject2).<init>();
        ((zzdat)localObject2).zzc(this.zzd, this.zzc);
        ((zzdat)localObject2).zzl(this.zzd, this.zzc);
        paramzzewu = zze((zzcpa)localObject1, paramzzewu, ((zzdat)localObject2).zzn());
        return paramzzewu;
      }
      Object localObject2 = zzevd.zzi(this.zzd);
      localObject1 = new com/google/android/gms/internal/ads/zzdat;
      ((zzdat)localObject1).<init>();
      ((zzdat)localObject1).zzb((zzcvl)localObject2, this.zzc);
      ((zzdat)localObject1).zzg((zzcxh)localObject2, this.zzc);
      ((zzdat)localObject1).zzh((zzo)localObject2, this.zzc);
      ((zzdat)localObject1).zzi((zzcxt)localObject2, this.zzc);
      ((zzdat)localObject1).zzc((zzcvy)localObject2, this.zzc);
      ((zzdat)localObject1).zzl((zzdcw)localObject2, this.zzc);
      ((zzdat)localObject1).zzm((zzewt)localObject2);
      localObject2 = new com/google/android/gms/internal/ads/zzcpa;
      ((zzcpa)localObject2).<init>(this.zzg);
      zzcuq localzzcuq = new com/google/android/gms/internal/ads/zzcuq;
      localzzcuq.<init>();
      localzzcuq.zze(this.zzb);
      localzzcuq.zzi(paramzzewu.zza);
      paramzzewu = zze((zzcpa)localObject2, localzzcuq.zzj(), ((zzdat)localObject1).zzn());
      return paramzzewu;
    }
    finally {}
  }
  
  public final boolean zza()
  {
    zzfwb localzzfwb = this.zzj;
    return (localzzfwb != null) && (!localzzfwb.isDone());
  }
  
  public final boolean zzb(zzl paramzzl, String paramString, zzejt paramzzejt, zzeju paramzzeju)
    throws RemoteException
  {
    try
    {
      if (((Boolean)zzbdb.zzd.zze()).booleanValue())
      {
        paramzzejt = zzbbk.zzjG;
        if (((Boolean)zzba.zzc().zzb(paramzzejt)).booleanValue())
        {
          i = 1;
          break label46;
        }
      }
      int i = 0;
      label46:
      int j = this.zzf.zzc;
      paramzzejt = zzbbk.zzjH;
      if ((j < ((Integer)zzba.zzc().zzb(paramzzejt)).intValue()) || (i == 0)) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
      }
      if (paramString == null)
      {
        zzbzt.zzg("Ad unit ID should not be null for app open ad.");
        paramString = this.zzc;
        paramzzl = new com/google/android/gms/internal/ads/zzeuh;
        paramzzl.<init>(this);
        paramString.execute(paramzzl);
        return false;
      }
      paramzzejt = this.zzj;
      if (paramzzejt != null) {
        return false;
      }
      if (((Boolean)zzbcw.zzc.zze()).booleanValue())
      {
        paramzzejt = this.zze;
        if (paramzzejt.zzd() != null)
        {
          paramzzejt = ((zzcon)paramzzejt.zzd()).zzh();
          paramzzejt.zzh(7);
          paramzzejt.zzb(paramzzl.zzp);
          break label199;
        }
      }
      paramzzejt = null;
      label199:
      zzfau.zza(this.zzb, paramzzl.zzf);
      Object localObject1 = zzbbk.zzir;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (paramzzl.zzf)) {
        this.zza.zzj().zzm(true);
      }
      localObject1 = this.zzi;
      ((zzezy)localObject1).zzs(paramString);
      ((zzezy)localObject1).zzr(zzq.zzb());
      ((zzezy)localObject1).zzE(paramzzl);
      localObject1 = ((zzezy)localObject1).zzG();
      paramzzl = zzffe.zzb(this.zzb, zzffp.zzf((zzfaa)localObject1), 7, paramzzl);
      paramString = new com/google/android/gms/internal/ads/zzeum;
      paramString.<init>(null);
      paramString.zza = ((zzfaa)localObject1);
      Object localObject2 = this.zze;
      localObject1 = new com/google/android/gms/internal/ads/zzewx;
      ((zzewx)localObject1).<init>(paramString, null);
      zzeui localzzeui = new com/google/android/gms/internal/ads/zzeui;
      localzzeui.<init>(this);
      localObject1 = ((zzeww)localObject2).zzc((zzewx)localObject1, localzzeui, null);
      this.zzj = ((zzfwb)localObject1);
      localObject2 = new com/google/android/gms/internal/ads/zzeuk;
      ((zzeuk)localObject2).<init>(this, paramzzeju, paramzzejt, paramzzl, paramString);
      zzfvr.zzq((zzfwb)localObject1, (zzfvn)localObject2, this.zzc);
      return true;
    }
    finally {}
  }
  
  protected abstract zzcuo zze(zzcpa paramzzcpa, zzcus paramzzcus, zzdav paramzzdav);
  
  public final void zzl(zzw paramzzw)
  {
    this.zzi.zzt(paramzzw);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */