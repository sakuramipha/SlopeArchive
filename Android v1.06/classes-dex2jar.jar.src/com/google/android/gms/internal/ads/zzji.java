package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

final class zzji
{
  public static zzof zza(Context paramContext, zzjt paramzzjt, boolean paramBoolean)
  {
    paramContext = zzob.zzb(paramContext);
    if (paramContext == null)
    {
      zzer.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
      return new zzof(LogSessionId.LOG_SESSION_ID_NONE);
    }
    if (paramBoolean) {
      paramzzjt.zzz(paramContext);
    }
    return new zzof(paramContext.zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */