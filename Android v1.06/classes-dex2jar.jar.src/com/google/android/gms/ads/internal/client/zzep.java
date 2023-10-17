package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzep
  implements MediaContent
{
  private final zzben zza;
  private final VideoController zzb = new VideoController();
  private final zzbfk zzc;
  
  public zzep(zzben paramzzben, zzbfk paramzzbfk)
  {
    this.zza = paramzzben;
    this.zzc = paramzzbfk;
  }
  
  public final float getAspectRatio()
  {
    try
    {
      float f = this.zza.zze();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return 0.0F;
  }
  
  public final float getCurrentTime()
  {
    try
    {
      float f = this.zza.zzf();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return 0.0F;
  }
  
  public final float getDuration()
  {
    try
    {
      float f = this.zza.zzg();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return 0.0F;
  }
  
  public final Drawable getMainImage()
  {
    try
    {
      Object localObject = this.zza.zzi();
      if (localObject != null)
      {
        localObject = (Drawable)ObjectWrapper.unwrap((IObjectWrapper)localObject);
        return (Drawable)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final VideoController getVideoController()
  {
    try
    {
      if (this.zza.zzh() != null) {
        this.zzb.zzb(this.zza.zzh());
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Exception occurred while getting video controller", localRemoteException);
    }
    return this.zzb;
  }
  
  public final boolean hasVideoContent()
  {
    try
    {
      boolean bool = this.zza.zzl();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return false;
  }
  
  public final void setMainImage(Drawable paramDrawable)
  {
    try
    {
      this.zza.zzj(ObjectWrapper.wrap(paramDrawable));
      return;
    }
    catch (RemoteException paramDrawable)
    {
      zzbzt.zzh("", paramDrawable);
    }
  }
  
  public final zzbfk zza()
  {
    return this.zzc;
  }
  
  public final boolean zzb()
  {
    try
    {
      boolean bool = this.zza.zzk();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return false;
  }
  
  public final zzben zzc()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */