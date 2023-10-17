package com.google.android.gms.internal.ads;

public final class zzgmj
{
  public static String zza(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(j + j);
    for (int i = 0; i < j; i++)
    {
      int k = paramArrayOfByte[i] & 0xFF;
      localStringBuilder.append("0123456789abcdef".charAt(k >> 4));
      localStringBuilder.append("0123456789abcdef".charAt(k & 0xF));
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */