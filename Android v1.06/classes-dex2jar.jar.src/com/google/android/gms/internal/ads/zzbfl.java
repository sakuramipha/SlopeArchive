package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzbfl
  implements NativeCustomTemplateAd
{
  private final zzbfk zza;
  private final MediaView zzb;
  private final VideoController zzc = new VideoController();
  private NativeCustomTemplateAd.DisplayOpenMeasurement zzd;
  
  public zzbfl(zzbfk paramzzbfk)
  {
    this.zza = paramzzbfk;
    Object localObject = null;
    try
    {
      localContext = (Context)ObjectWrapper.unwrap(paramzzbfk.zzh());
    }
    catch (RemoteException paramzzbfk) {}catch (NullPointerException paramzzbfk) {}
    zzbzt.zzh("", paramzzbfk);
    Context localContext = null;
    paramzzbfk = (zzbfk)localObject;
    if (localContext != null)
    {
      paramzzbfk = new MediaView(localContext);
      try
      {
        boolean bool = this.zza.zzs(ObjectWrapper.wrap(paramzzbfk));
        if (true != bool) {
          paramzzbfk = (zzbfk)localObject;
        }
      }
      catch (RemoteException paramzzbfk)
      {
        zzbzt.zzh("", paramzzbfk);
        paramzzbfk = (zzbfk)localObject;
      }
    }
    this.zzb = paramzzbfk;
  }
  
  public final void destroy()
  {
    try
    {
      this.zza.zzl();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
  }
  
  public final List<String> getAvailableAssetNames()
  {
    try
    {
      List localList = this.zza.zzk();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final String getCustomTemplateId()
  {
    try
    {
      String str = this.zza.zzi();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement()
  {
    try
    {
      if ((this.zzd == null) && (this.zza.zzq()))
      {
        zzbek localzzbek = new com/google/android/gms/internal/ads/zzbek;
        localzzbek.<init>(this.zza);
        this.zzd = localzzbek;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return this.zzd;
  }
  
  public final NativeAd.Image getImage(String paramString)
  {
    try
    {
      paramString = this.zza.zzg(paramString);
      if (paramString != null)
      {
        paramString = new zzber(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("", paramString);
    }
    return null;
  }
  
  public final CharSequence getText(String paramString)
  {
    try
    {
      paramString = this.zza.zzj(paramString);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("", paramString);
    }
    return null;
  }
  
  public final VideoController getVideoController()
  {
    try
    {
      zzdq localzzdq = this.zza.zze();
      if (localzzdq != null) {
        this.zzc.zzb(localzzdq);
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Exception occurred while getting video controller", localRemoteException);
    }
    return this.zzc;
  }
  
  public final MediaView getVideoMediaView()
  {
    return this.zzb;
  }
  
  public final void performClick(String paramString)
  {
    try
    {
      this.zza.zzn(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("", paramString);
    }
  }
  
  public final void recordImpression()
  {
    try
    {
      this.zza.zzo();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
  }
  
  public final zzbfk zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */