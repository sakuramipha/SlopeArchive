package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement;
import java.util.List;

public final class zzbrj
  implements NativeCustomFormatAd
{
  private final zzbfk zza;
  private NativeCustomFormatAd.DisplayOpenMeasurement zzb;
  
  public zzbrj(zzbfk paramzzbfk)
  {
    this.zza = paramzzbfk;
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
  
  public final String getCustomFormatId()
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
  
  public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement()
  {
    try
    {
      if ((this.zzb == null) && (this.zza.zzq()))
      {
        zzbrb localzzbrb = new com/google/android/gms/internal/ads/zzbrb;
        localzzbrb.<init>(this.zza);
        this.zzb = localzzbrb;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return this.zzb;
  }
  
  public final NativeAd.Image getImage(String paramString)
  {
    try
    {
      paramString = this.zza.zzg(paramString);
      if (paramString != null)
      {
        paramString = new zzbrc(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("", paramString);
    }
    return null;
  }
  
  public final MediaContent getMediaContent()
  {
    try
    {
      if (this.zza.zzf() != null)
      {
        zzep localzzep = new zzep(this.zza.zzf(), this.zza);
        return localzzep;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
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
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */