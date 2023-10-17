package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzfob
{
  public static String zza(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
      localMessageDigest.update(paramArrayOfByte);
      return Base64.encodeToString(localMessageDigest.digest(), 11);
    }
    catch (NoSuchAlgorithmException paramArrayOfByte) {}
    return "";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */