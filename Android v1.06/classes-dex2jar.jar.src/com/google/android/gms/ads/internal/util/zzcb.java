package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.concurrent.Callable;

public final class zzcb
{
  @Deprecated
  public static Object zza(Context paramContext, Callable paramCallable)
  {
    try
    {
      StrictMode.ThreadPolicy localThreadPolicy = StrictMode.getThreadPolicy();
      try
      {
        StrictMode.ThreadPolicy.Builder localBuilder = new android/os/StrictMode$ThreadPolicy$Builder;
        localBuilder.<init>(localThreadPolicy);
        StrictMode.setThreadPolicy(localBuilder.permitDiskReads().permitDiskWrites().build());
        paramCallable = paramCallable.call();
        return paramCallable;
      }
      finally
      {
        StrictMode.setThreadPolicy(localThreadPolicy);
      }
      return null;
    }
    finally
    {
      zzbzt.zzh("Unexpected exception.", paramCallable);
      zzbsy.zza(paramContext).zzf(paramCallable, "StrictModeUtil.runWithLaxStrictMode");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */