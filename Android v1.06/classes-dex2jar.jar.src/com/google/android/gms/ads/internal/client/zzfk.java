package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzfk
  extends zzds
{
  private final VideoController.VideoLifecycleCallbacks zza;
  
  public zzfk(VideoController.VideoLifecycleCallbacks paramVideoLifecycleCallbacks)
  {
    this.zza = paramVideoLifecycleCallbacks;
  }
  
  public final void zze()
  {
    this.zza.onVideoEnd();
  }
  
  public final void zzf(boolean paramBoolean)
  {
    this.zza.onVideoMute(paramBoolean);
  }
  
  public final void zzg()
  {
    this.zza.onVideoPause();
  }
  
  public final void zzh()
  {
    this.zza.onVideoPlay();
  }
  
  public final void zzi()
  {
    this.zza.onVideoStart();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */