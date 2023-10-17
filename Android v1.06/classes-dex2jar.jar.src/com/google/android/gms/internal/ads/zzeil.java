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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzeil
  extends zzbt
  implements zzcxy
{
  private final Context zza;
  private final zzevr zzb;
  private final String zzc;
  private final zzejf zzd;
  private zzq zze;
  private final zzezy zzf;
  private final zzbzz zzg;
  private final zzdqc zzh;
  private zzcpd zzi;
  
  public zzeil(Context paramContext, zzq paramzzq, String paramString, zzevr paramzzevr, zzejf paramzzejf, zzbzz paramzzbzz, zzdqc paramzzdqc)
  {
    this.zza = paramContext;
    this.zzb = paramzzevr;
    this.zze = paramzzq;
    this.zzc = paramString;
    this.zzd = paramzzejf;
    this.zzf = paramzzevr.zzi();
    this.zzg = paramzzbzz;
    this.zzh = paramzzdqc;
    paramzzevr.zzp(this);
  }
  
  private final void zze(zzq paramzzq)
  {
    try
    {
      this.zzf.zzr(paramzzq);
      this.zzf.zzw(this.zze.zzn);
      return;
    }
    finally
    {
      paramzzq = finally;
      throw paramzzq;
    }
  }
  
  private final boolean zzf(zzl paramzzl)
    throws RemoteException
  {
    try
    {
      if (zzh()) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
      }
      zzt.zzp();
      if ((zzs.zzD(this.zza)) && (paramzzl.zzs == null))
      {
        zzbzt.zzg("Failed to load the ad because app ID is missing.");
        paramzzl = this.zzd;
        if (paramzzl != null) {
          paramzzl.zza(zzfba.zzd(4, null, null));
        }
        return false;
      }
      zzfau.zza(this.zza, paramzzl.zzf);
      zzevr localzzevr = this.zzb;
      String str = this.zzc;
      zzeik localzzeik = new com/google/android/gms/internal/ads/zzeik;
      localzzeik.<init>(this);
      boolean bool = localzzevr.zzb(paramzzl, str, null, localzzeik);
      return bool;
    }
    finally {}
  }
  
  private final boolean zzh()
  {
    if (((Boolean)zzbdb.zzf.zze()).booleanValue())
    {
      localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        i = 1;
        break label42;
      }
    }
    int i = 0;
    label42:
    int j = this.zzg.zzc;
    zzbbc localzzbbc = zzbbk.zzjH;
    return (j < ((Integer)zzba.zzc().zzb(localzzbbc)).intValue()) || (i == 0);
  }
  
  public final void zzA()
  {
    try
    {
      Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
      zzcpd localzzcpd = this.zzi;
      if (localzzcpd != null)
      {
        localzzcpd.zzg();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzB()
  {
    try
    {
      if (((Boolean)zzbdb.zzh.zze()).booleanValue())
      {
        localObject1 = zzbbk.zzjC;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          int i = this.zzg.zzc;
          localObject1 = zzbbk.zzjI;
          if (i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue()) {
            break label71;
          }
        }
      }
      Preconditions.checkMainThread("resume must be called on the main UI thread.");
      label71:
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        ((zzcrf)localObject1).zzm().zzc(null);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzC(zzbe paramzzbe)
  {
    if (zzh()) {
      Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
    }
    this.zzb.zzo(paramzzbe);
  }
  
  public final void zzD(zzbh paramzzbh)
  {
    if (zzh()) {
      Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
    }
    this.zzd.zze(paramzzbh);
  }
  
  public final void zzE(zzby paramzzby)
  {
    Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
  }
  
  public final void zzF(zzq paramzzq)
  {
    try
    {
      Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
      this.zzf.zzr(paramzzq);
      this.zze = paramzzq;
      zzcpd localzzcpd = this.zzi;
      if (localzzcpd != null)
      {
        localzzcpd.zzh(this.zzb.zzd(), paramzzq);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzG(zzcb paramzzcb)
  {
    if (zzh()) {
      Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
    }
    this.zzd.zzi(paramzzcb);
  }
  
  public final void zzH(zzavu paramzzavu) {}
  
  public final void zzI(zzw paramzzw) {}
  
  public final void zzJ(zzci paramzzci) {}
  
  public final void zzK(zzdu paramzzdu) {}
  
  public final void zzL(boolean paramBoolean) {}
  
  public final void zzM(zzbse paramzzbse) {}
  
  public final void zzN(boolean paramBoolean)
  {
    try
    {
      if (zzh()) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
      }
      this.zzf.zzy(paramBoolean);
      return;
    }
    finally {}
  }
  
  public final void zzO(zzbci paramzzbci)
  {
    try
    {
      Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
      this.zzb.zzq(paramzzbci);
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
    if (zzh()) {
      Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
    }
    try
    {
      if (!paramzzdg.zzf()) {
        this.zzh.zze();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzf("Error in making CSI ping for reporting paid event callback", localRemoteException);
    }
    this.zzd.zzg(paramzzdg);
  }
  
  public final void zzQ(zzbsh paramzzbsh, String paramString) {}
  
  public final void zzR(String paramString) {}
  
  public final void zzS(zzbvc paramzzbvc) {}
  
  public final void zzT(String paramString) {}
  
  public final void zzU(zzfl paramzzfl)
  {
    try
    {
      if (zzh()) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
      }
      this.zzf.zzF(paramzzfl);
      return;
    }
    finally {}
  }
  
  public final void zzW(IObjectWrapper paramIObjectWrapper) {}
  
  public final void zzX() {}
  
  public final boolean zzY()
  {
    try
    {
      boolean bool = this.zzb.zza();
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
    try
    {
      if (this.zzb.zzr())
      {
        zzq localzzq2 = this.zzf.zzg();
        zzcpd localzzcpd = this.zzi;
        zzq localzzq1 = localzzq2;
        if (localzzcpd != null)
        {
          localzzq1 = localzzq2;
          if (localzzcpd.zzf() != null)
          {
            localzzq1 = localzzq2;
            if (this.zzf.zzO()) {
              localzzq1 = zzfae.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
          }
        }
        zze(localzzq1);
        try
        {
          zzf(this.zzf.zze());
          return;
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzj("Failed to refresh the banner ad.");
          return;
        }
      }
      this.zzb.zzn();
      return;
    }
    finally {}
  }
  
  public final boolean zzaa(zzl paramzzl)
    throws RemoteException
  {
    try
    {
      zze(this.zze);
      boolean bool = zzf(paramzzl);
      return bool;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  public final void zzab(zzcf paramzzcf)
  {
    try
    {
      Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
      this.zzf.zzQ(paramzzcf);
      return;
    }
    finally
    {
      paramzzcf = finally;
      throw paramzzcf;
    }
  }
  
  public final Bundle zzd()
  {
    Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
    return new Bundle();
  }
  
  public final zzq zzg()
  {
    try
    {
      Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        localObject1 = zzfae.zza(this.zza, Collections.singletonList(((zzcpd)localObject1).zze()));
        return (zzq)localObject1;
      }
      localObject1 = this.zzf.zzg();
      return (zzq)localObject1;
    }
    finally {}
  }
  
  public final zzbh zzi()
  {
    return this.zzd.zzc();
  }
  
  public final zzcb zzj()
  {
    return this.zzd.zzd();
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
      localObject1 = this.zzi;
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
    try
    {
      Preconditions.checkMainThread("getVideoController must be called from the main thread.");
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        localObject1 = ((zzcpd)localObject1).zzd();
        return (zzdq)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final IObjectWrapper zzn()
  {
    if (zzh()) {
      Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
    }
    return ObjectWrapper.wrap(this.zzb.zzd());
  }
  
  public final String zzr()
  {
    try
    {
      String str = this.zzc;
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
      Object localObject1 = this.zzi;
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
      Object localObject1 = this.zzi;
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
      if (((Boolean)zzbdb.zze.zze()).booleanValue())
      {
        localObject1 = zzbbk.zzjD;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          int i = this.zzg.zzc;
          localObject1 = zzbbk.zzjI;
          if (i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue()) {
            break label72;
          }
        }
      }
      Preconditions.checkMainThread("destroy must be called on the main UI thread.");
      label72:
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        ((zzcrf)localObject1).zzb();
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
      if (((Boolean)zzbdb.zzg.zze()).booleanValue())
      {
        localObject1 = zzbbk.zzjE;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          int i = this.zzg.zzc;
          localObject1 = zzbbk.zzjI;
          if (i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue()) {
            break label72;
          }
        }
      }
      Preconditions.checkMainThread("pause must be called on the main UI thread.");
      label72:
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        ((zzcrf)localObject1).zzm().zzb(null);
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */