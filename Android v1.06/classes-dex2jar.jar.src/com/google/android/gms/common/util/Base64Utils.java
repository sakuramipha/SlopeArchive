package com.google.android.gms.common.util;

import android.util.Base64;

public final class Base64Utils
{
  public static byte[] decode(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Base64.decode(paramString, 0);
  }
  
  public static byte[] decodeUrlSafe(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Base64.decode(paramString, 10);
  }
  
  public static byte[] decodeUrlSafeNoPadding(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Base64.decode(paramString, 11);
  }
  
  public static String encode(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return Base64.encodeToString(paramArrayOfByte, 0);
  }
  
  public static String encodeUrlSafe(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return Base64.encodeToString(paramArrayOfByte, 10);
  }
  
  public static String encodeUrlSafeNoPadding(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\Base64Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */