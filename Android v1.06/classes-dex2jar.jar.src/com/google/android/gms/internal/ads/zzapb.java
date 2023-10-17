package com.google.android.gms.internal.ads;

import android.util.Base64;

public final class zzapb
{
  public static String zza(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i;
    if (true != paramBoolean) {
      i = 2;
    } else {
      i = 11;
    }
    return Base64.encodeToString(paramArrayOfByte, i);
  }
  
  public static byte[] zzb(String paramString, boolean paramBoolean)
    throws IllegalArgumentException
  {
    byte[] arrayOfByte = Base64.decode(paramString, 2);
    if ((arrayOfByte.length == 0) && (paramString.length() > 0)) {
      throw new IllegalArgumentException("Unable to decode ".concat(paramString));
    }
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzapb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */