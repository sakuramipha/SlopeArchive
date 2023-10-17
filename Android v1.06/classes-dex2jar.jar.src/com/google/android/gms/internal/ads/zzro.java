package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import java.util.List;

final class zzro
{
  public static int zza(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    paramVideoCapabilities = paramVideoCapabilities.getSupportedPerformancePoints();
    int i = 0;
    if ((paramVideoCapabilities != null) && (!paramVideoCapabilities.isEmpty()) && (!zzfn.zzb.equals("sabrina")) && (!zzfn.zzb.equals("boreal")) && (!zzfn.zzd.startsWith("Lenovo TB-X605")) && (!zzfn.zzd.startsWith("Lenovo TB-X606")) && (!zzfn.zzd.startsWith("Lenovo TB-X616")))
    {
      MediaCodecInfo.VideoCapabilities.PerformancePoint localPerformancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(paramInt1, paramInt2, (int)paramDouble);
      for (paramInt1 = i; paramInt1 < paramVideoCapabilities.size(); paramInt1++) {
        if (((MediaCodecInfo.VideoCapabilities.PerformancePoint)paramVideoCapabilities.get(paramInt1)).covers(localPerformancePoint)) {
          return 2;
        }
      }
      return 1;
    }
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */