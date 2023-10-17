package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

final class zzph
{
  public static void zza(AudioTrack paramAudioTrack, zzof paramzzof)
  {
    paramzzof = paramzzof.zza();
    if (!paramzzof.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
      paramAudioTrack.setLogSessionId(paramzzof);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */