package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

public final class zzaru
{
  public static final int zza = 0;
  private static final char[] zzb = "0123456789abcdef".toCharArray();
  
  public static long zza(double paramDouble, int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    return Math.round(paramDouble / paramDisplayMetrics.density);
  }
  
  public static String zzb(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte.length;
    char[] arrayOfChar1 = new char[j + j];
    for (j = 0; j < paramArrayOfByte.length; j++)
    {
      int k = paramArrayOfByte[j] & 0xFF;
      char[] arrayOfChar2 = zzb;
      int i = arrayOfChar2[(k >>> 4)];
      int m = j + j;
      arrayOfChar1[m] = i;
      arrayOfChar1[(m + 1)] = arrayOfChar2[(k & 0xF)];
    }
    return new String(arrayOfChar1);
  }
  
  public static boolean zzc()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static boolean zzd(String paramString)
  {
    return (paramString == null) || (paramString.isEmpty());
  }
  
  public static boolean zze(DisplayMetrics paramDisplayMetrics)
  {
    return (paramDisplayMetrics != null) && (paramDisplayMetrics.density != 0.0F);
  }
  
  public static byte[] zzf(String paramString)
  {
    int j = paramString.length();
    if (j % 2 == 0)
    {
      byte[] arrayOfByte = new byte[j / 2];
      for (int i = 0; i < j; i += 2) {
        arrayOfByte[(i / 2)] = ((byte)((Character.digit(paramString.charAt(i), 16) << 4) + Character.digit(paramString.charAt(i + 1), 16)));
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("String must be of even-length");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */