package com.google.android.gms.internal.ads;

import android.view.Surface;

final class zzys
{
  public static void zza(Surface paramSurface, float paramFloat)
  {
    int i;
    if (paramFloat == 0.0F) {
      i = 0;
    } else {
      i = 1;
    }
    try
    {
      paramSurface.setFrameRate(paramFloat, i);
      return;
    }
    catch (IllegalStateException paramSurface)
    {
      zzer.zzc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", paramSurface);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */