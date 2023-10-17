package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.internal.ads.zzbzt;

public final class VideoController
{
  public static final int PLAYBACK_STATE_ENDED = 3;
  public static final int PLAYBACK_STATE_PAUSED = 2;
  public static final int PLAYBACK_STATE_PLAYING = 1;
  public static final int PLAYBACK_STATE_READY = 5;
  public static final int PLAYBACK_STATE_UNKNOWN = 0;
  private final Object zza = new Object();
  private zzdq zzb;
  private VideoLifecycleCallbacks zzc;
  
  public int getPlaybackState()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq == null) {
        return 0;
      }
      try
      {
        int i = localzzdq.zzh();
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to call getPlaybackState on video controller.", localRemoteException);
        return 0;
      }
    }
  }
  
  public VideoLifecycleCallbacks getVideoLifecycleCallbacks()
  {
    synchronized (this.zza)
    {
      VideoLifecycleCallbacks localVideoLifecycleCallbacks = this.zzc;
      return localVideoLifecycleCallbacks;
    }
  }
  
  public boolean hasVideoContent()
  {
    synchronized (this.zza)
    {
      boolean bool;
      if (this.zzb != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public boolean isClickToExpandEnabled()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq == null) {
        return false;
      }
      try
      {
        boolean bool = localzzdq.zzo();
        return bool;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to call isClickToExpandEnabled.", localRemoteException);
        return false;
      }
    }
  }
  
  public boolean isCustomControlsEnabled()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq == null) {
        return false;
      }
      try
      {
        boolean bool = localzzdq.zzp();
        return bool;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to call isUsingCustomPlayerControls.", localRemoteException);
        return false;
      }
    }
  }
  
  public boolean isMuted()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq == null) {
        return true;
      }
      try
      {
        boolean bool = localzzdq.zzq();
        return bool;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to call isMuted on video controller.", localRemoteException);
        return true;
      }
    }
  }
  
  public void mute(boolean paramBoolean)
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq != null)
      {
        try
        {
          localzzdq.zzj(paramBoolean);
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzh("Unable to call mute on video controller.", localRemoteException);
        }
        return;
      }
      return;
    }
  }
  
  public void pause()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq != null)
      {
        try
        {
          localzzdq.zzk();
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzh("Unable to call pause on video controller.", localRemoteException);
        }
        return;
      }
      return;
    }
  }
  
  public void play()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq != null)
      {
        try
        {
          localzzdq.zzl();
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzh("Unable to call play on video controller.", localRemoteException);
        }
        return;
      }
      return;
    }
  }
  
  public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks paramVideoLifecycleCallbacks)
  {
    synchronized (this.zza)
    {
      this.zzc = paramVideoLifecycleCallbacks;
      zzdq localzzdq = this.zzb;
      if (localzzdq != null)
      {
        if (paramVideoLifecycleCallbacks == null) {
          paramVideoLifecycleCallbacks = null;
        }
        try
        {
          paramVideoLifecycleCallbacks = new zzfk(paramVideoLifecycleCallbacks);
          localzzdq.zzm(paramVideoLifecycleCallbacks);
        }
        catch (RemoteException paramVideoLifecycleCallbacks)
        {
          zzbzt.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", paramVideoLifecycleCallbacks);
        }
        return;
      }
      return;
    }
  }
  
  public void stop()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq != null)
      {
        try
        {
          localzzdq.zzn();
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzh("Unable to call stop on video controller.", localRemoteException);
        }
        return;
      }
      return;
    }
  }
  
  public final zzdq zza()
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      return localzzdq;
    }
  }
  
  public final void zzb(zzdq paramzzdq)
  {
    synchronized (this.zza)
    {
      this.zzb = paramzzdq;
      paramzzdq = this.zzc;
      if (paramzzdq != null) {
        setVideoLifecycleCallbacks(paramzzdq);
      }
      return;
    }
  }
  
  public static abstract class VideoLifecycleCallbacks
  {
    public void onVideoEnd() {}
    
    public void onVideoMute(boolean paramBoolean) {}
    
    public void onVideoPause() {}
    
    public void onVideoPlay() {}
    
    public void onVideoStart() {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\VideoController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */