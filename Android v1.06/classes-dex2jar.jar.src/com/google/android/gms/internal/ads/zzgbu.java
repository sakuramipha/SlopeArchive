package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgbu
  implements zzfww
{
  private static final byte[] zza = new byte[0];
  private final zzgjz zzb;
  private final zzfww zzc;
  
  public zzgbu(zzgjz paramzzgjz, zzfww paramzzfww)
  {
    this.zzb = paramzzgjz;
    this.zzc = paramzzfww;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    try
    {
      Object localObject1 = ByteBuffer.wrap(paramArrayOfByte1);
      int i = ((ByteBuffer)localObject1).getInt();
      if ((i > 0) && (i <= paramArrayOfByte1.length - 4))
      {
        Object localObject2 = new byte[i];
        ((ByteBuffer)localObject1).get((byte[])localObject2, 0, i);
        paramArrayOfByte1 = new byte[((ByteBuffer)localObject1).remaining()];
        ((ByteBuffer)localObject1).get(paramArrayOfByte1, 0, ((ByteBuffer)localObject1).remaining());
        byte[] arrayOfByte = this.zzc.zza((byte[])localObject2, zza);
        localObject2 = this.zzb.zzg();
        i = zzfyd.zza;
        localObject1 = zzgno.zzb;
        return ((zzfww)zzfyd.zzc((String)localObject2, zzgno.zzv(arrayOfByte, 0, arrayOfByte.length), zzfww.class)).zza(paramArrayOfByte1, paramArrayOfByte2);
      }
      paramArrayOfByte1 = new java/security/GeneralSecurityException;
      paramArrayOfByte1.<init>("invalid ciphertext");
      throw paramArrayOfByte1;
    }
    catch (NegativeArraySizeException paramArrayOfByte1) {}catch (BufferUnderflowException paramArrayOfByte1) {}catch (IndexOutOfBoundsException paramArrayOfByte1) {}
    throw new GeneralSecurityException("invalid ciphertext", paramArrayOfByte1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */