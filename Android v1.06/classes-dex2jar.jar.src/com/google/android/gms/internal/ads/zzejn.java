package com.google.android.gms.internal.ads;

import android.app.Activity;
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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzejn
  extends zzbt
{
  private final zzq zza;
  private final Context zzb;
  private final zzexi zzc;
  private final String zzd;
  private final zzbzz zze;
  private final zzejf zzf;
  private final zzeyi zzg;
  private final zzaqq zzh;
  private final zzdqc zzi;
  private zzddp zzj;
  private boolean zzk;
  
  public zzejn(Context paramContext, zzq paramzzq, String paramString, zzexi paramzzexi, zzejf paramzzejf, zzeyi paramzzeyi, zzbzz paramzzbzz, zzaqq paramzzaqq, zzdqc paramzzdqc)
  {
    this.zza = paramzzq;
    this.zzd = paramString;
    this.zzb = paramContext;
    this.zzc = paramzzexi;
    this.zzf = paramzzejf;
    this.zzg = paramzzeyi;
    this.zze = paramzzbzz;
    paramContext = zzbbk.zzaD;
    this.zzk = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    this.zzh = paramzzaqq;
    this.zzi = paramzzdqc;
  }
  
  /* Error */
  private final boolean zze()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 77	com/google/android/gms/internal/ads/zzejn:zzj	Lcom/google/android/gms/internal/ads/zzddp;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +18 -> 26
    //   11: aload_2
    //   12: invokevirtual 82	com/google/android/gms/internal/ads/zzddp:zza	()Z
    //   15: istore_1
    //   16: iload_1
    //   17: ifne +9 -> 26
    //   20: iconst_1
    //   21: istore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: iload_1
    //   25: ireturn
    //   26: iconst_0
    //   27: istore_1
    //   28: goto -6 -> 22
    //   31: astore_2
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_2
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	zzejn
    //   15	13	1	bool	boolean
    //   6	6	2	localzzddp	zzddp
    //   31	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	31	finally
    //   11	16	31	finally
  }
  
  public final void zzA() {}
  
  public final void zzB()
  {
    try
    {
      Preconditions.checkMainThread("resume must be called on the main UI thread.");
      zzddp localzzddp = this.zzj;
      if (localzzddp != null)
      {
        localzzddp.zzm().zzc(null);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzC(zzbe paramzzbe) {}
  
  public final void zzD(zzbh paramzzbh)
  {
    Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
    this.zzf.zze(paramzzbh);
  }
  
  public final void zzE(zzby paramzzby)
  {
    Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
  }
  
  public final void zzF(zzq paramzzq) {}
  
  public final void zzG(zzcb paramzzcb)
  {
    Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
    this.zzf.zzi(paramzzcb);
  }
  
  public final void zzH(zzavu paramzzavu) {}
  
  public final void zzI(zzw paramzzw) {}
  
  public final void zzJ(zzci paramzzci)
  {
    this.zzf.zzt(paramzzci);
  }
  
  public final void zzK(zzdu paramzzdu) {}
  
  public final void zzL(boolean paramBoolean)
  {
    try
    {
      Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
      this.zzk = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzM(zzbse paramzzbse) {}
  
  public final void zzN(boolean paramBoolean) {}
  
  public final void zzO(zzbci paramzzbci)
  {
    try
    {
      Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
      this.zzc.zzi(paramzzbci);
      return;
    }
    finally
    {
      paramzzbci = finally;
      throw paramzzbci;
    }
  }
  
  public final void zzP(zzdg paramzzdg)
  {
    Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
    try
    {
      if (!paramzzdg.zzf()) {
        this.zzi.zze();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzf("Error in making CSI ping for reporting paid event callback", localRemoteException);
    }
    this.zzf.zzg(paramzzdg);
  }
  
  public final void zzQ(zzbsh paramzzbsh, String paramString) {}
  
  public final void zzR(String paramString) {}
  
  public final void zzS(zzbvc paramzzbvc)
  {
    this.zzg.zzf(paramzzbvc);
  }
  
  public final void zzT(String paramString) {}
  
  public final void zzU(zzfl paramzzfl) {}
  
  public final void zzW(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      if (this.zzj == null)
      {
        zzbzt.zzj("Interstitial can not be shown before loaded.");
        this.zzf.zzk(zzfba.zzd(9, null, null));
        return;
      }
      Object localObject = zzbbk.zzcr;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = this.zzh.zzc();
        Throwable localThrowable = new java/lang/Throwable;
        localThrowable.<init>();
        ((zzaqm)localObject).zzn(localThrowable.getStackTrace());
      }
      paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
      this.zzj.zzc(this.zzk, paramIObjectWrapper);
      return;
    }
    finally {}
  }
  
  public final void zzX()
  {
    try
    {
      Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
      if (this.zzj == null)
      {
        zzbzt.zzj("Interstitial can not be shown before loaded.");
        this.zzf.zzk(zzfba.zzd(9, null, null));
        return;
      }
      Object localObject1 = zzbbk.zzcr;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = this.zzh.zzc();
        Throwable localThrowable = new java/lang/Throwable;
        localThrowable.<init>();
        ((zzaqm)localObject1).zzn(localThrowable.getStackTrace());
      }
      this.zzj.zzc(this.zzk, null);
      return;
    }
    finally {}
  }
  
  public final boolean zzY()
  {
    try
    {
      boolean bool = this.zzc.zza();
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
    try
    {
      Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
      boolean bool = zze();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzaa(zzl paramzzl)
  {
    try
    {
      if (((Boolean)zzbdb.zzi.zze()).booleanValue())
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
      int j = this.zze.zzc;
      Object localObject = zzbbk.zzjH;
      if ((j < ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue()) || (i == 0)) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
      }
      zzt.zzp();
      if ((zzs.zzD(this.zzb)) && (paramzzl.zzs == null))
      {
        zzbzt.zzg("Failed to load the ad because app ID is missing.");
        paramzzl = this.zzf;
        if (paramzzl != null) {
          paramzzl.zza(zzfba.zzd(4, null, null));
        }
        return false;
      }
      boolean bool = zze();
      if (bool) {
        return false;
      }
      zzfau.zza(this.zzb, paramzzl.zzf);
      this.zzj = null;
      zzexi localzzexi = this.zzc;
      localObject = this.zzd;
      zzexb localzzexb = new com/google/android/gms/internal/ads/zzexb;
      localzzexb.<init>(this.zza);
      zzejm localzzejm = new com/google/android/gms/internal/ads/zzejm;
      localzzejm.<init>(this);
      bool = localzzexi.zzb(paramzzl, (String)localObject, localzzexb, localzzejm);
      return bool;
    }
    finally {}
  }
  
  public final void zzab(zzcf paramzzcf) {}
  
  public final Bundle zzd()
  {
    Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
    return new Bundle();
  }
  
  public final zzq zzg()
  {
    return null;
  }
  
  public final zzbh zzi()
  {
    return this.zzf.zzc();
  }
  
  public final zzcb zzj()
  {
    return this.zzf.zzd();
  }
  
  public final zzdn zzk()
  {
    try
    {
      Object localObject1 = zzbbk.zzgy;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
      if (!bool) {
        return null;
      }
      localObject1 = this.zzj;
      if (localObject1 == null) {
        return null;
      }
      localObject1 = ((zzcrf)localObject1).zzl();
      return (zzdn)localObject1;
    }
    finally {}
  }
  
  public final zzdq zzl()
  {
    return null;
  }
  
  public final IObjectWrapper zzn()
  {
    return null;
  }
  
  public final String zzr()
  {
    try
    {
      String str = this.zzd;
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
    try
    {
      Object localObject1 = this.zzj;
      if ((localObject1 != null) && (((zzcrf)localObject1).zzl() != null))
      {
        localObject1 = ((zzcrf)localObject1).zzl().zzg();
        return (String)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final String zzt()
  {
    try
    {
      Object localObject1 = this.zzj;
      if ((localObject1 != null) && (((zzcrf)localObject1).zzl() != null))
      {
        localObject1 = ((zzcrf)localObject1).zzl().zzg();
        return (String)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final void zzx()
  {
    try
    {
      Preconditions.checkMainThread("destroy must be called on the main UI thread.");
      zzddp localzzddp = this.zzj;
      if (localzzddp != null)
      {
        localzzddp.zzm().zza(null);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzy(zzl paramzzl, zzbk paramzzbk)
  {
    this.zzf.zzf(paramzzbk);
    zzaa(paramzzl);
  }
  
  public final void zzz()
  {
    try
    {
      Preconditions.checkMainThread("pause must be called on the main UI thread.");
      zzddp localzzddp = this.zzj;
      if (localzzddp != null)
      {
        localzzddp.zzm().zzb(null);
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzejn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */