package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class zzct
{
  public static final Handler zza = new Handler(Looper.getMainLooper());
  public static final Executor zzb = new zzcs("Google consent worker");
  
  public static void zza()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      return;
    }
    throw new IllegalStateException("Method must be call on main thread.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */