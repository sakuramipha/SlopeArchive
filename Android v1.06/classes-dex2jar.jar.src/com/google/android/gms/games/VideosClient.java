package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
public abstract interface VideosClient
{
  public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
  public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
  public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
  public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;
  
  @Deprecated
  public abstract Task<VideoCapabilities> getCaptureCapabilities();
  
  @Deprecated
  public abstract Task<Intent> getCaptureOverlayIntent();
  
  @Deprecated
  public abstract Task<CaptureState> getCaptureState();
  
  @Deprecated
  public abstract Task<Boolean> isCaptureAvailable(int paramInt);
  
  @Deprecated
  public abstract Task<Boolean> isCaptureSupported();
  
  @Deprecated
  public abstract Task<Void> registerOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener paramOnCaptureOverlayStateListener);
  
  @Deprecated
  public abstract Task<Boolean> unregisterOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener paramOnCaptureOverlayStateListener);
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface CaptureOverlayState {}
  
  @Deprecated
  public static abstract interface OnCaptureOverlayStateListener
  {
    @Deprecated
    public abstract void onCaptureOverlayStateChanged(int paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\VideosClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */