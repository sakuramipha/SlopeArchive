package com.google.android.gms.common.util;

public class Hex
{
  private static final char[] zza = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private static final char[] zzb = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  public static String bytesToStringLowercase(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar1 = new char[i + i];
    i = 0;
    int j = 0;
    while (i < paramArrayOfByte.length)
    {
      int m = paramArrayOfByte[i] & 0xFF;
      int k = j + 1;
      char[] arrayOfChar2 = zzb;
      arrayOfChar1[j] = arrayOfChar2[(m >>> 4)];
      j = k + 1;
      arrayOfChar1[k] = arrayOfChar2[(m & 0xF)];
      i++;
    }
    return new String(arrayOfChar1);
  }
  
  public static String bytesToStringUppercase(byte[] paramArrayOfByte)
  {
    return bytesToStringUppercase(paramArrayOfByte, false);
  }
  
  public static String bytesToStringUppercase(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int j = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(j + j);
    for (int i = 0; (i < j) && ((!paramBoolean) || (i != j - 1) || ((paramArrayOfByte[i] & 0xFF) != 0)); i++)
    {
      char[] arrayOfChar = zza;
      localStringBuilder.append(arrayOfChar[((paramArrayOfByte[i] & 0xF0) >>> 4)]);
      localStringBuilder.append(arrayOfChar[(paramArrayOfByte[i] & 0xF)]);
    }
    return localStringBuilder.toString();
  }
  
  public static byte[] stringToBytes(String paramString)
    throws IllegalArgumentException
  {
    int k = paramString.length();
    if (k % 2 == 0)
    {
      byte[] arrayOfByte = new byte[k / 2];
      int j;
      for (int i = 0; i < k; i = j)
      {
        j = i + 2;
        arrayOfByte[(i / 2)] = ((byte)Integer.parseInt(paramString.substring(i, j), 16));
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("Hex string has odd number of characters");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\Hex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */