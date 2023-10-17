package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings.Secure;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzcn
{
  private static String zza;
  
  public static String zza(Context paramContext)
  {
    try
    {
      if (zza == null)
      {
        paramContext = paramContext.getContentResolver();
        if (paramContext == null) {
          paramContext = null;
        } else {
          paramContext = Settings.Secure.getString(paramContext, "android_id");
        }
        if ((paramContext == null) || (zzb())) {
          paramContext = "emulator";
        }
        zza = zzc(paramContext);
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  public static boolean zzb()
  {
    return (Build.FINGERPRINT.startsWith("generic")) || (Build.FINGERPRINT.startsWith("unknown")) || (Build.MODEL.contains("google_sdk")) || (Build.MODEL.contains("sdk_goog3")) || (Build.MODEL.contains("Emulator")) || (Build.MODEL.contains("Android SDK built for x86")) || (Build.MANUFACTURER.contains("Genymotion")) || ((Build.BRAND.startsWith("generic")) && (Build.DEVICE.startsWith("generic"))) || ("google_sdk".equals(Build.PRODUCT));
  }
  
  private static String zzc(String paramString)
  {
    int i = 0;
    while (i < 3) {
      try
      {
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString.getBytes());
        BigInteger localBigInteger = new java/math/BigInteger;
        localBigInteger.<init>(1, ((MessageDigest)localObject).digest());
        localObject = String.format("%032X", new Object[] { localBigInteger });
        return (String)localObject;
      }
      catch (ArithmeticException paramString)
      {
        return "";
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
    }
    return "";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */