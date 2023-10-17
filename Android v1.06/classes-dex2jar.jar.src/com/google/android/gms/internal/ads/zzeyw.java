package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzeyw
  extends zzbvo
{
  private final zzeys zza;
  private final zzeyi zzb;
  private final String zzc;
  private final zzezs zzd;
  private final Context zze;
  private final zzbzz zzf;
  private final zzaqq zzg;
  private final zzdqc zzh;
  private zzdmo zzi;
  private boolean zzj;
  
  public zzeyw(String paramString, zzeys paramzzeys, Context paramContext, zzeyi paramzzeyi, zzezs paramzzezs, zzbzz paramzzbzz, zzaqq paramzzaqq, zzdqc paramzzdqc)
  {
    this.zzc = paramString;
    this.zza = paramzzeys;
    this.zzb = paramzzeyi;
    this.zzd = paramzzezs;
    this.zze = paramContext;
    this.zzf = paramzzbzz;
    paramString = zzbbk.zzaD;
    this.zzj = ((Boolean)zzba.zzc().zzb(paramString)).booleanValue();
    this.zzg = paramzzaqq;
    this.zzh = paramzzdqc;
  }
  
  private final void zzu(zzl paramzzl, zzbvw paramzzbvw, int paramInt)
    throws RemoteException
  {
    try
    {
      boolean bool = ((Boolean)zzbdb.zzl.zze()).booleanValue();
      int j = 0;
      int i = j;
      if (bool)
      {
        localObject = zzbbk.zzjG;
        i = j;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
          i = 1;
        }
      }
      j = this.zzf.zzc;
      Object localObject = zzbbk.zzjH;
      if ((j < ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue()) || (i == 0)) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
      }
      this.zzb.zze(paramzzbvw);
      zzt.zzp();
      if ((zzs.zzD(this.zze)) && (paramzzl.zzs == null))
      {
        zzbzt.zzg("Failed to load the ad because app ID is missing.");
        this.zzb.zza(zzfba.zzd(4, null, null));
        return;
      }
      paramzzbvw = this.zzi;
      if (paramzzbvw != null) {
        return;
      }
      paramzzbvw = new com/google/android/gms/internal/ads/zzeyk;
      paramzzbvw.<init>(null);
      this.zza.zzj(paramInt);
      zzeys localzzeys = this.zza;
      localObject = this.zzc;
      zzeyv localzzeyv = new com/google/android/gms/internal/ads/zzeyv;
      localzzeyv.<init>(this);
      localzzeys.zzb(paramzzl, (String)localObject, paramzzbvw, localzzeyv);
      return;
    }
    finally {}
  }
  
  public final Bundle zzb()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    Object localObject = this.zzi;
    if (localObject != null) {
      localObject = ((zzdmo)localObject).zza();
    } else {
      localObject = new Bundle();
    }
    return (Bundle)localObject;
  }
  
  public final zzdn zzc()
  {
    Object localObject = zzbbk.zzgy;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return null;
    }
    localObject = this.zzi;
    if (localObject != null) {
      return ((zzcrf)localObject).zzl();
    }
    return null;
  }
  
  public final zzbvm zzd()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzdmo localzzdmo = this.zzi;
    if (localzzdmo != null) {
      return localzzdmo.zzc();
    }
    return null;
  }
  
  public final String zze()
    throws RemoteException
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
  
  public final void zzf(zzl paramzzl, zzbvw paramzzbvw)
    throws RemoteException
  {
    try
    {
      zzu(paramzzl, paramzzbvw, 2);
      return;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  public final void zzg(zzl paramzzl, zzbvw paramzzbvw)
    throws RemoteException
  {
    try
    {
      zzu(paramzzl, paramzzbvw, 3);
      return;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  public final void zzh(boolean paramBoolean)
  {
    try
    {
      Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
      this.zzj = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzi(zzdd paramzzdd)
  {
    if (paramzzdd == null)
    {
      this.zzb.zzb(null);
      return;
    }
    this.zzb.zzb(new zzeyu(this, paramzzdd));
  }
  
  public final void zzj(zzdg paramzzdg)
  {
    Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
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
    this.zzb.zzc(paramzzdg);
  }
  
  public final void zzk(zzbvs paramzzbvs)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    this.zzb.zzd(paramzzbvs);
  }
  
  public final void zzl(zzbwd paramzzbwd)
  {
    try
    {
      Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
      zzezs localzzezs = this.zzd;
      localzzezs.zza = paramzzbwd.zza;
      localzzezs.zzb = paramzzbwd.zzb;
      return;
    }
    finally
    {
      paramzzbwd = finally;
      throw paramzzbwd;
    }
  }
  
  public final void zzm(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      zzn(paramIObjectWrapper, this.zzj);
      return;
    }
    finally
    {
      paramIObjectWrapper = finally;
      throw paramIObjectWrapper;
    }
  }
  
  public final void zzn(IObjectWrapper paramIObjectWrapper, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
      if (this.zzi == null)
      {
        zzbzt.zzj("Rewarded can not be shown before loaded");
        this.zzb.zzk(zzfba.zzd(9, null, null));
        return;
      }
      Object localObject = zzbbk.zzcr;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        zzaqm localzzaqm = this.zzg.zzc();
        localObject = new java/lang/Throwable;
        ((Throwable)localObject).<init>();
        localzzaqm.zzn(((Throwable)localObject).getStackTrace());
      }
      paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
      this.zzi.zzh(paramBoolean, paramIObjectWrapper);
      return;
    }
    finally {}
  }
  
  public final boolean zzo()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzdmo localzzdmo = this.zzi;
    return (localzzdmo != null) && (!localzzdmo.zzf());
  }
  
  public final void zzp(zzbvx paramzzbvx)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    this.zzb.zzi(paramzzbvx);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeyw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */