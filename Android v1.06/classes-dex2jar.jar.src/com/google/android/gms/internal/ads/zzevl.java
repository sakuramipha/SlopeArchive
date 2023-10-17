package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzevl
  extends zzbt
  implements zzo, zzavl
{
  protected zzcox zza;
  private final zzcgw zzb;
  private final Context zzc;
  private AtomicBoolean zzd = new AtomicBoolean();
  private final String zze;
  private final zzevf zzf;
  private final zzevd zzg;
  private final zzbzz zzh;
  private final zzdqc zzi;
  private long zzj = -1L;
  private zzcol zzk;
  
  public zzevl(zzcgw paramzzcgw, Context paramContext, String paramString, zzevf paramzzevf, zzevd paramzzevd, zzbzz paramzzbzz, zzdqc paramzzdqc)
  {
    this.zzb = paramzzcgw;
    this.zzc = paramContext;
    this.zze = paramString;
    this.zzf = paramzzevf;
    this.zzg = paramzzevd;
    this.zzh = paramzzbzz;
    this.zzi = paramzzdqc;
    paramzzevd.zzn(this);
  }
  
  private final void zzq(int paramInt)
  {
    try
    {
      if (this.zzd.compareAndSet(false, true))
      {
        this.zzg.zzj();
        zzcol localzzcol = this.zzk;
        if (localzzcol != null) {
          zzt.zzb().zze(localzzcol);
        }
        if (this.zza != null)
        {
          long l2 = this.zzj;
          long l1 = -1L;
          if (l2 != -1L) {
            l1 = zzt.zzB().elapsedRealtime() - this.zzj;
          }
          this.zza.zze(l1, paramInt);
        }
        zzx();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzA() {}
  
  public final void zzB()
  {
    try
    {
      Preconditions.checkMainThread("resume must be called on the main UI thread.");
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzC(zzbe paramzzbe) {}
  
  public final void zzD(zzbh paramzzbh) {}
  
  public final void zzE(zzby paramzzby) {}
  
  public final void zzF(zzq paramzzq)
  {
    try
    {
      Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
      return;
    }
    finally
    {
      paramzzq = finally;
      throw paramzzq;
    }
  }
  
  public final void zzG(zzcb paramzzcb) {}
  
  public final void zzH(zzavu paramzzavu)
  {
    this.zzg.zzp(paramzzavu);
  }
  
  public final void zzI(zzw paramzzw)
  {
    this.zzf.zzl(paramzzw);
  }
  
  public final void zzJ(zzci paramzzci) {}
  
  public final void zzK(zzdu paramzzdu) {}
  
  public final void zzL(boolean paramBoolean) {}
  
  public final void zzM(zzbse paramzzbse) {}
  
  public final void zzN(boolean paramBoolean) {}
  
  public final void zzO(zzbci paramzzbci) {}
  
  public final void zzP(zzdg paramzzdg) {}
  
  public final void zzQ(zzbsh paramzzbsh, String paramString) {}
  
  public final void zzR(String paramString) {}
  
  public final void zzS(zzbvc paramzzbvc) {}
  
  public final void zzT(String paramString) {}
  
  public final void zzU(zzfl paramzzfl) {}
  
  public final void zzW(IObjectWrapper paramIObjectWrapper) {}
  
  public final void zzX() {}
  
  public final boolean zzY()
  {
    try
    {
      boolean bool = this.zzf.zza();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzZ()
  {
    return false;
  }
  
  public final void zza()
  {
    zzq(3);
  }
  
  public final boolean zzaa(zzl paramzzl)
    throws RemoteException
  {
    try
    {
      if (((Boolean)zzbdb.zzd.zze()).booleanValue())
      {
        localObject = zzbbk.zzjG;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
        {
          i = 1;
          break label46;
        }
      }
      int i = 0;
      label46:
      int j = this.zzh.zzc;
      Object localObject = zzbbk.zzjH;
      if ((j < ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue()) || (i == 0)) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
      }
      zzt.zzp();
      if ((zzs.zzD(this.zzc)) && (paramzzl.zzs == null))
      {
        zzbzt.zzg("Failed to load the ad because app ID is missing.");
        this.zzg.zza(zzfba.zzd(4, null, null));
        return false;
      }
      boolean bool = zzY();
      if (bool) {
        return false;
      }
      localObject = new java/util/concurrent/atomic/AtomicBoolean;
      ((AtomicBoolean)localObject).<init>();
      this.zzd = ((AtomicBoolean)localObject);
      zzevj localzzevj = new com/google/android/gms/internal/ads/zzevj;
      localzzevj.<init>(this);
      zzevf localzzevf = this.zzf;
      String str = this.zze;
      localObject = new com/google/android/gms/internal/ads/zzevk;
      ((zzevk)localObject).<init>(this);
      bool = localzzevf.zzb(paramzzl, str, localzzevj, (zzeju)localObject);
      return bool;
    }
    finally {}
  }
  
  public final void zzab(zzcf paramzzcf) {}
  
  public final void zzb()
  {
    try
    {
      Object localObject1 = this.zza;
      if (localObject1 == null) {
        return;
      }
      this.zzj = zzt.zzB().elapsedRealtime();
      int i = this.zza.zza();
      if (i <= 0) {
        return;
      }
      localObject1 = new com/google/android/gms/internal/ads/zzcol;
      ((zzcol)localObject1).<init>(this.zzb.zzB(), zzt.zzB());
      this.zzk = ((zzcol)localObject1);
      zzevi localzzevi = new com/google/android/gms/internal/ads/zzevi;
      localzzevi.<init>(this);
      ((zzcol)localObject1).zzd(i, localzzevi);
      return;
    }
    finally {}
  }
  
  public final void zzbF() {}
  
  public final void zzbo() {}
  
  public final void zzby() {}
  
  public final Bundle zzd()
  {
    return new Bundle();
  }
  
  public final void zze()
  {
    try
    {
      zzcox localzzcox = this.zza;
      if (localzzcox != null)
      {
        localzzcox.zze(zzt.zzB().elapsedRealtime() - this.zzj, 1);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzf(int paramInt)
  {
    if (paramInt != 0)
    {
      paramInt--;
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            zzq(6);
            return;
          }
          zzq(3);
          return;
        }
        zzq(4);
        return;
      }
      zzq(2);
      return;
    }
    throw null;
  }
  
  public final zzq zzg()
  {
    return null;
  }
  
  public final zzbh zzi()
  {
    return null;
  }
  
  public final zzcb zzj()
  {
    return null;
  }
  
  public final zzdn zzk()
  {
    return null;
  }
  
  public final zzdq zzl()
  {
    return null;
  }
  
  public final IObjectWrapper zzn()
  {
    return null;
  }
  
  public final void zzp()
  {
    this.zzb.zzA().execute(new zzevh(this));
  }
  
  public final String zzr()
  {
    try
    {
      String str = this.zze;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzs()
  {
    return null;
  }
  
  public final String zzt()
  {
    return null;
  }
  
  public final void zzx()
  {
    try
    {
      Preconditions.checkMainThread("destroy must be called on the main UI thread.");
      zzcox localzzcox = this.zza;
      if (localzzcox != null)
      {
        localzzcox.zzb();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzy(zzl paramzzl, zzbk paramzzbk) {}
  
  public final void zzz()
  {
    try
    {
      Preconditions.checkMainThread("pause must be called on the main UI thread.");
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzevl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */