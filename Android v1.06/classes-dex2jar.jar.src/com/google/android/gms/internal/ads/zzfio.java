package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public final class zzfio
{
  protected static final byte[] zza = { 61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74 };
  protected static final byte[] zzb = { -110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83 };
  private final byte[] zzc = zzb;
  private final byte[] zzd = zza;
  
  public final boolean zza(File paramFile)
    throws GeneralSecurityException
  {
    paramFile = paramFile.getAbsolutePath();
    try
    {
      try
      {
        paramFile = zzako.zza(paramFile);
        int i = paramFile.length;
        boolean bool2 = true;
        if (i == 1)
        {
          paramFile = paramFile[0][0];
          paramFile = MessageDigest.getInstance("SHA-256").digest(paramFile.getEncoded());
          boolean bool1 = bool2;
          if (!Arrays.equals(this.zzd, paramFile)) {
            if (!"user".equals(Build.TYPE))
            {
              if (Arrays.equals(this.zzc, paramFile)) {
                bool1 = bool2;
              } else {
                return false;
              }
            }
            else {
              bool1 = false;
            }
          }
          return bool1;
        }
        throw new GeneralSecurityException("APK has more than one signature.");
      }
      catch (RuntimeException paramFile) {}catch (IOException paramFile) {}
      throw new GeneralSecurityException("Failed to verify signatures", paramFile);
    }
    catch (zzakl paramFile)
    {
      throw new GeneralSecurityException("Package is not signed", paramFile);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */