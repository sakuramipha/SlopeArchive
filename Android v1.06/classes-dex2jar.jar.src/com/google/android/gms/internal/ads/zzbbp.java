package com.google.android.gms.internal.ads;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;

public final class zzbbp
{
  public static Object zza(zzfpp paramzzfpp)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      StrictMode.ThreadPolicy.Builder localBuilder = new android/os/StrictMode$ThreadPolicy$Builder;
      localBuilder.<init>(localThreadPolicy);
      StrictMode.setThreadPolicy(localBuilder.permitDiskReads().permitDiskWrites().build());
      paramzzfpp = paramzzfpp.zza();
      return paramzzfpp;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */