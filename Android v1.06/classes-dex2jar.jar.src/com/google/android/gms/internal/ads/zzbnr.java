package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbnr
{
  private static zzbnr zza;
  private final AtomicBoolean zzb = new AtomicBoolean(false);
  
  public static zzbnr zza()
  {
    if (zza == null) {
      zza = new zzbnr();
    }
    return zza;
  }
  
  public final Thread zzb(Context paramContext, String paramString)
  {
    if (!this.zzb.compareAndSet(false, true)) {
      return null;
    }
    paramContext = new Thread(new zzbnq(this, paramContext, paramString));
    paramContext.start();
    return paramContext;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */