package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AndroidUtilsLight
{
  private static volatile int zza = -1;
  
  @Deprecated
  public static byte[] getPackageCertificateHashBytes(Context paramContext, String paramString)
    throws PackageManager.NameNotFoundException
  {
    paramString = Wrappers.packageManager(paramContext).getPackageInfo(paramString, 64);
    if ((paramString.signatures != null) && (paramString.signatures.length == 1))
    {
      paramContext = zza("SHA1");
      if (paramContext != null) {
        return paramContext.digest(paramString.signatures[0].toByteArray());
      }
    }
    return null;
  }
  
  public static MessageDigest zza(String paramString)
  {
    for (int i = 0; i < 2; i++) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\AndroidUtilsLight.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */