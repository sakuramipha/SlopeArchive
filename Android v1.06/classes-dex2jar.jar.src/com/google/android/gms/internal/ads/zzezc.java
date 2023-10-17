package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

public final class zzezc
  extends zzbuy
{
  private final zzeys zza;
  private final zzeyi zzb;
  private final zzezs zzc;
  private zzdmo zzd;
  private boolean zze = false;
  
  public zzezc(zzeys paramzzeys, zzeyi paramzzeyi, zzezs paramzzezs)
  {
    this.zza = paramzzeys;
    this.zzb = paramzzeyi;
    this.zzc = paramzzezs;
  }
  
  /* Error */
  private final boolean zzy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/google/android/gms/internal/ads/zzezc:zzd	Lcom/google/android/gms/internal/ads/zzdmo;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +18 -> 26
    //   11: aload_2
    //   12: invokevirtual 42	com/google/android/gms/internal/ads/zzdmo:zze	()Z
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
    //   0	36	0	this	zzezc
    //   15	13	1	bool	boolean
    //   6	6	2	localzzdmo	zzdmo
    //   31	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	31	finally
    //   11	16	31	finally
  }
  
  public final Bundle zzb()
  {
    Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
    Object localObject = this.zzd;
    if (localObject != null) {
      localObject = ((zzdmo)localObject).zza();
    } else {
      localObject = new Bundle();
    }
    return (Bundle)localObject;
  }
  
  public final zzdn zzc()
    throws RemoteException
  {
    try
    {
      Object localObject1 = zzbbk.zzgy;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
      if (!bool) {
        return null;
      }
      localObject1 = this.zzd;
      if (localObject1 != null)
      {
        localObject1 = ((zzcrf)localObject1).zzl();
        return (zzdn)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final String zzd()
    throws RemoteException
  {
    try
    {
      Object localObject1 = this.zzd;
      if ((localObject1 != null) && (((zzcrf)localObject1).zzl() != null))
      {
        localObject1 = ((zzcrf)localObject1).zzl().zzg();
        return (String)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final void zze()
    throws RemoteException
  {
    zzf(null);
  }
  
  public final void zzf(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      Preconditions.checkMainThread("destroy must be called on the main UI thread.");
      zzeyi localzzeyi = this.zzb;
      Object localObject = null;
      localzzeyi.zzb(null);
      if (this.zzd != null)
      {
        if (paramIObjectWrapper == null) {
          paramIObjectWrapper = (IObjectWrapper)localObject;
        } else {
          paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
        }
        this.zzd.zzm().zza(paramIObjectWrapper);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzg(zzbvd paramzzbvd)
    throws RemoteException
  {
    try
    {
      Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
      String str1 = paramzzbvd.zzb;
      Object localObject2 = zzbbk.zzfd;
      localObject2 = (String)zzba.zzc().zzb((zzbbc)localObject2);
      boolean bool;
      if ((localObject2 != null) && (str1 != null)) {
        try
        {
          bool = Pattern.matches((String)localObject2, str1);
          if (bool) {
            return;
          }
        }
        catch (RuntimeException localRuntimeException)
        {
          zzt.zzo().zzu(localRuntimeException, "NonagonUtil.isPatternMatched");
        }
      }
      if (zzy())
      {
        localObject1 = zzbbk.zzff;
        bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
        if (!bool) {
          return;
        }
      }
      localObject2 = new com/google/android/gms/internal/ads/zzeyk;
      ((zzeyk)localObject2).<init>(null);
      this.zzd = null;
      this.zza.zzj(1);
      Object localObject1 = this.zza;
      zzl localzzl = paramzzbvd.zza;
      String str2 = paramzzbvd.zzb;
      paramzzbvd = new com/google/android/gms/internal/ads/zzeza;
      paramzzbvd.<init>(this);
      ((zzeys)localObject1).zzb(localzzl, str2, (zzejt)localObject2, paramzzbvd);
      return;
    }
    finally {}
  }
  
  public final void zzh()
  {
    zzi(null);
  }
  
  public final void zzi(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      Preconditions.checkMainThread("pause must be called on the main UI thread.");
      if (this.zzd != null)
      {
        if (paramIObjectWrapper == null) {
          paramIObjectWrapper = null;
        } else {
          paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
        }
        this.zzd.zzm().zzb(paramIObjectWrapper);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzj()
  {
    zzk(null);
  }
  
  public final void zzk(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      Preconditions.checkMainThread("resume must be called on the main UI thread.");
      if (this.zzd != null)
      {
        if (paramIObjectWrapper == null) {
          paramIObjectWrapper = null;
        } else {
          paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
        }
        this.zzd.zzm().zzc(paramIObjectWrapper);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzl(zzby paramzzby)
  {
    Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
    if (paramzzby == null)
    {
      this.zzb.zzb(null);
      return;
    }
    this.zzb.zzb(new zzezb(this, paramzzby));
  }
  
  public final void zzm(String paramString)
    throws RemoteException
  {
    try
    {
      Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
      this.zzc.zzb = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzn(boolean paramBoolean)
  {
    try
    {
      Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
      this.zze = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzo(zzbvc paramzzbvc)
    throws RemoteException
  {
    Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
    this.zzb.zzf(paramzzbvc);
  }
  
  public final void zzp(String paramString)
    throws RemoteException
  {
    try
    {
      Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
      this.zzc.zza = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzq()
    throws RemoteException
  {
    try
    {
      zzr(null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzr(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      Preconditions.checkMainThread("showAd must be called on the main UI thread.");
      if (this.zzd != null)
      {
        Object localObject1 = null;
        if (paramIObjectWrapper == null)
        {
          paramIObjectWrapper = (IObjectWrapper)localObject1;
        }
        else
        {
          Object localObject2 = ObjectWrapper.unwrap(paramIObjectWrapper);
          paramIObjectWrapper = (IObjectWrapper)localObject1;
          if ((localObject2 instanceof Activity)) {
            paramIObjectWrapper = (Activity)localObject2;
          }
        }
        this.zzd.zzh(this.zze, paramIObjectWrapper);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final boolean zzs()
    throws RemoteException
  {
    Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
    return zzy();
  }
  
  public final boolean zzt()
  {
    zzdmo localzzdmo = this.zzd;
    return (localzzdmo != null) && (localzzdmo.zzg());
  }
  
  public final void zzu(zzbux paramzzbux)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
    this.zzb.zzg(paramzzbux);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */