package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzapf
{
  static boolean zza = false;
  static final CountDownLatch zzb = new CountDownLatch(1);
  public static final int zzc = 0;
  private static MessageDigest zzd;
  private static final Object zze = new Object();
  private static final Object zzf = new Object();
  
  static String zza(byte[] paramArrayOfByte, String paramString)
    throws GeneralSecurityException, UnsupportedEncodingException
  {
    Vector localVector = zzb(paramArrayOfByte, 255);
    if ((localVector != null) && (localVector.size() != 0))
    {
      zzaox localzzaox = zzaoy.zza();
      int j = localVector.size();
      for (int i = 0; i < j; i++) {
        localzzaox.zza(zzgno.zzv(zzg((byte[])localVector.get(i), paramString, false), 0, 256));
      }
      paramArrayOfByte = zze(paramArrayOfByte);
      paramString = zzgno.zzb;
      localzzaox.zzb(zzgno.zzv(paramArrayOfByte, 0, paramArrayOfByte.length));
      paramArrayOfByte = ((zzaoy)localzzaox.zzal()).zzax();
    }
    else
    {
      paramArrayOfByte = zzg(zzf(4096).zzax(), paramString, true);
    }
    return zzapb.zza(paramArrayOfByte, true);
  }
  
  static Vector zzb(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte != null)
    {
      int k = paramArrayOfByte.length;
      if (k > 0)
      {
        Vector localVector = new Vector();
        paramInt = 0;
        while (paramInt < (k + 254) / 255)
        {
          int m = paramInt * 255;
          try
          {
            int j = paramArrayOfByte.length;
            int i = j;
            if (j - m > 255) {
              i = m + 255;
            }
            localVector.add(Arrays.copyOfRange(paramArrayOfByte, m, i));
            paramInt++;
          }
          catch (IndexOutOfBoundsException paramArrayOfByte)
          {
            return null;
          }
        }
        return localVector;
      }
    }
    return null;
  }
  
  static void zzd()
  {
    synchronized (zzf)
    {
      if (!zza)
      {
        zza = true;
        Thread localThread = new java/lang/Thread;
        zzape localzzape = new com/google/android/gms/internal/ads/zzape;
        localzzape.<init>(null);
        localThread.<init>(localzzape);
        localThread.start();
      }
      return;
    }
  }
  
  public static byte[] zze(byte[] paramArrayOfByte)
    throws NoSuchAlgorithmException
  {
    synchronized (zze)
    {
      zzd();
      Object localObject1 = null;
      try
      {
        boolean bool = zzb.await(2L, TimeUnit.SECONDS);
        if (bool)
        {
          MessageDigest localMessageDigest = zzd;
          if (localMessageDigest != null) {
            localObject1 = localMessageDigest;
          }
        }
      }
      catch (InterruptedException localInterruptedException) {}
      if (localObject1 != null)
      {
        ((MessageDigest)localObject1).reset();
        ((MessageDigest)localObject1).update(paramArrayOfByte);
        paramArrayOfByte = zzd.digest();
        return paramArrayOfByte;
      }
      paramArrayOfByte = new java/security/NoSuchAlgorithmException;
      paramArrayOfByte.<init>("Cannot compute hash");
      throw paramArrayOfByte;
    }
  }
  
  static zzaol zzf(int paramInt)
  {
    zzano localzzano = zzaol.zza();
    localzzano.zzD(4096L);
    return (zzaol)localzzano.zzal();
  }
  
  private static byte[] zzg(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
    throws NoSuchAlgorithmException, UnsupportedEncodingException
  {
    int j = paramArrayOfByte.length;
    if (true != paramBoolean) {
      i = 255;
    } else {
      i = 239;
    }
    if (j > i) {
      paramArrayOfByte = zzf(4096).zzax();
    }
    j = paramArrayOfByte.length;
    byte b;
    if (j < i)
    {
      arrayOfByte1 = new byte[i - j];
      new SecureRandom().nextBytes(arrayOfByte1);
      b = (byte)j;
      paramArrayOfByte = ByteBuffer.allocate(i + 1).put(b).put(paramArrayOfByte).put(arrayOfByte1).array();
    }
    else
    {
      b = (byte)j;
      paramArrayOfByte = ByteBuffer.allocate(i + 1).put(b).put(paramArrayOfByte).array();
    }
    byte[] arrayOfByte1 = paramArrayOfByte;
    if (paramBoolean)
    {
      arrayOfByte1 = zze(paramArrayOfByte);
      arrayOfByte1 = ByteBuffer.allocate(256).put(arrayOfByte1).put(paramArrayOfByte).array();
    }
    byte[] arrayOfByte2 = new byte['Ā'];
    paramArrayOfByte = new zzaqf().zzcG;
    int i = paramArrayOfByte.length;
    for (i = 0; i < 12; i++) {
      paramArrayOfByte[i].zza(arrayOfByte1, arrayOfByte2);
    }
    if ((paramString != null) && (paramString.length() > 0))
    {
      paramArrayOfByte = paramString;
      if (paramString.length() > 32) {
        paramArrayOfByte = paramString.substring(0, 32);
      }
      new zzaoz(paramArrayOfByte.getBytes("UTF-8")).zza(arrayOfByte2);
    }
    return arrayOfByte2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzapf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */