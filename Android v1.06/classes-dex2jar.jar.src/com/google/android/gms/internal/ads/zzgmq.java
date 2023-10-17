package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class zzgmq
{
  private static final ThreadLocal zza = new zzgmp();
  
  public static byte[] zza(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    ((SecureRandom)zza.get()).nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */