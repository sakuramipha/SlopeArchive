package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack.StreamEventCallback;
import android.os.Handler;
import android.os.Looper;

final class zzpu
{
  final zzpw zza;
  private final Handler zzb = new Handler(Looper.myLooper());
  private final AudioTrack.StreamEventCallback zzc;
  
  public zzpu(zzpw paramzzpw)
  {
    this.zzc = new zzpt(this, paramzzpw);
  }
  
  public final void zza(AudioTrack paramAudioTrack)
  {
    paramAudioTrack.registerStreamEventCallback(new zzps(this.zzb), this.zzc);
  }
  
  public final void zzb(AudioTrack paramAudioTrack)
  {
    paramAudioTrack.unregisterStreamEventCallback(this.zzc);
    this.zzb.removeCallbacksAndMessages(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */