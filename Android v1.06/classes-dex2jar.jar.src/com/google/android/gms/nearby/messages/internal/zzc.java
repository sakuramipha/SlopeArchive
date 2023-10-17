package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

public class zzc
{
  private static final char[] zza = "0123456789abcdef".toCharArray();
  private final byte[] zzb;
  
  protected zzc(byte[] paramArrayOfByte)
  {
    this.zzb = paramArrayOfByte;
  }
  
  public static String zza(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(j + j);
    for (int i = 0; i < j; i++)
    {
      int k = paramArrayOfByte[i];
      char[] arrayOfChar = zza;
      localStringBuilder.append(arrayOfChar[(k >> 4 & 0xF)]);
      localStringBuilder.append(arrayOfChar[(k & 0xF)]);
    }
    return localStringBuilder.toString();
  }
  
  public static byte[] zzb(String paramString)
  {
    int j = paramString.length() / 2;
    byte[] arrayOfByte = new byte[j];
    for (int i = 0; i < j; i++)
    {
      int k = i + i;
      arrayOfByte[i] = ((byte)((Character.digit(paramString.charAt(k), 16) << 4) + Character.digit(paramString.charAt(k + 1), 16)));
    }
    return arrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if (!paramObject.getClass().isAssignableFrom(getClass())) {
      return false;
    }
    paramObject = (zzc)paramObject;
    return Arrays.equals(this.zzb, ((zzc)paramObject).zzb);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zzb);
  }
  
  public String toString()
  {
    return zza(this.zzb);
  }
  
  public final byte[] zzc()
  {
    return this.zzb;
  }
  
  public final String zzd()
  {
    return zza(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */