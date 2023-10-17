package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgcw
{
  private static final Logger zza = Logger.getLogger(zzgcw.class.getName());
  private static final AtomicBoolean zzb = new AtomicBoolean(false);
  
  static Boolean zza()
  {
    try
    {
      Boolean localBoolean = (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
      return localBoolean;
    }
    catch (Exception localException)
    {
      zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
    }
    return Boolean.valueOf(false);
  }
  
  public static boolean zzb()
  {
    return zzb.get();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */