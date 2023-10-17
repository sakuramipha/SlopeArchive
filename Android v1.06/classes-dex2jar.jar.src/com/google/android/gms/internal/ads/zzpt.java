package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack.StreamEventCallback;

final class zzpt
  extends AudioTrack.StreamEventCallback
{
  final zzpu zzb;
  
  zzpt(zzpu paramzzpu, zzpw paramzzpw) {}
  
  public final void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
  {
    if (!paramAudioTrack.equals(zzpw.zzB(this.zzb.zza))) {
      return;
    }
    paramAudioTrack = this.zzb.zza;
    if ((zzpw.zzC(paramAudioTrack) != null) && (zzpw.zzE(paramAudioTrack))) {
      zzpw.zzC(paramAudioTrack).zzb();
    }
  }
  
  public final void onTearDown(AudioTrack paramAudioTrack)
  {
    if (!paramAudioTrack.equals(zzpw.zzB(this.zzb.zza))) {
      return;
    }
    paramAudioTrack = this.zzb.zza;
    if ((zzpw.zzC(paramAudioTrack) != null) && (zzpw.zzE(paramAudioTrack))) {
      zzpw.zzC(paramAudioTrack).zzb();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */