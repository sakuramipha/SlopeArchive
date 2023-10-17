package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgls
  implements zzfww
{
  private final zzgmk zza;
  private final zzfxs zzb;
  private final int zzc;
  
  public zzgls(zzgmk paramzzgmk, zzfxs paramzzfxs, int paramInt)
  {
    this.zza = paramzzgmk;
    this.zzb = paramzzfxs;
    this.zzc = paramInt;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    int i = paramArrayOfByte1.length;
    int j = this.zzc;
    if (i >= j)
    {
      byte[] arrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte1, 0, i - j);
      byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte1, i - this.zzc, i);
      paramArrayOfByte1 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        paramArrayOfByte1 = new byte[0];
      }
      paramArrayOfByte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(paramArrayOfByte1.length * 8L).array(), 8);
      this.zzb.zza(arrayOfByte2, zzglq.zzb(new byte[][] { paramArrayOfByte1, arrayOfByte1, paramArrayOfByte2 }));
      return this.zza.zza(arrayOfByte1);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */