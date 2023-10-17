package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

final class zzrq
{
  public static void zza(zzrk paramzzrk, zzof paramzzof)
  {
    paramzzof = paramzzof.zza();
    if (!paramzzof.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
      paramzzrk.zzb.setString("log-session-id", paramzzof.getStringId());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */