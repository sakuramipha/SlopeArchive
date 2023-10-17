package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.Objects;

final class zzyw
  implements Choreographer.FrameCallback, Handler.Callback
{
  private static final zzyw zzb = new zzyw();
  public volatile long zza = -9223372036854775807L;
  private final Handler zzc;
  private final HandlerThread zzd;
  private Choreographer zze;
  private int zzf;
  
  private zzyw()
  {
    Object localObject = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
    this.zzd = ((HandlerThread)localObject);
    ((HandlerThread)localObject).start();
    localObject = new Handler(((HandlerThread)localObject).getLooper(), this);
    this.zzc = ((Handler)localObject);
    ((Handler)localObject).sendEmptyMessage(0);
  }
  
  public static zzyw zza()
  {
    return zzb;
  }
  
  public final void doFrame(long paramLong)
  {
    this.zza = paramLong;
    Choreographer localChoreographer = this.zze;
    Objects.requireNonNull(localChoreographer);
    localChoreographer.postFrameCallbackDelayed(this, 500L);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return false;
        }
        paramMessage = this.zze;
        if (paramMessage != null)
        {
          i = this.zzf - 1;
          this.zzf = i;
          if (i == 0)
          {
            paramMessage.removeFrameCallback(this);
            this.zza = -9223372036854775807L;
          }
        }
        return true;
      }
      paramMessage = this.zze;
      if (paramMessage != null)
      {
        i = this.zzf + 1;
        this.zzf = i;
        if (i == 1) {
          paramMessage.postFrameCallback(this);
        }
      }
      return true;
    }
    try
    {
      this.zze = Choreographer.getInstance();
    }
    catch (RuntimeException paramMessage)
    {
      zzer.zzf("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", paramMessage);
    }
    return true;
  }
  
  public final void zzb()
  {
    this.zzc.sendEmptyMessage(1);
  }
  
  public final void zzc()
  {
    this.zzc.sendEmptyMessage(2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */