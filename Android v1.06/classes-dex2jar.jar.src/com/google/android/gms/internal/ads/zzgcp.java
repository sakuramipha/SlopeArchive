package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

abstract class zzgcp
{
  private final zzgcn zza;
  private final zzgcn zzb;
  
  public zzgcp(byte[] paramArrayOfByte)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(1))
    {
      this.zza = zza(paramArrayOfByte, 1);
      this.zzb = zza(paramArrayOfByte, 0);
      return;
    }
    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
  }
  
  abstract zzgcn zza(byte[] paramArrayOfByte, int paramInt)
    throws InvalidKeyException;
  
  public final byte[] zzb(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    if (paramByteBuffer.remaining() >= 16)
    {
      int n = paramByteBuffer.position();
      byte[] arrayOfByte2 = new byte[16];
      paramByteBuffer.position(paramByteBuffer.limit() - 16);
      paramByteBuffer.get(arrayOfByte2);
      paramByteBuffer.position(n);
      paramByteBuffer.limit(paramByteBuffer.limit() - 16);
      byte[] arrayOfByte1 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        arrayOfByte1 = new byte[0];
      }
      try
      {
        ByteBuffer localByteBuffer = this.zzb.zzc(paramArrayOfByte1, 0);
        paramArrayOfByte2 = new byte[32];
        localByteBuffer.get(paramArrayOfByte2);
        int k = arrayOfByte1.length;
        int i = k & 0xF;
        if (i == 0) {
          i = k;
        } else {
          i = k + 16 - i;
        }
        int m = paramByteBuffer.remaining();
        int j = m % 16;
        if (j == 0) {
          j = m;
        } else {
          j = m + 16 - j;
        }
        j += i;
        localByteBuffer = ByteBuffer.allocate(j + 16).order(ByteOrder.LITTLE_ENDIAN);
        localByteBuffer.put(arrayOfByte1);
        localByteBuffer.position(i);
        localByteBuffer.put(paramByteBuffer);
        localByteBuffer.position(j);
        localByteBuffer.putLong(k);
        localByteBuffer.putLong(m);
        boolean bool = MessageDigest.isEqual(zzgcs.zza(paramArrayOfByte2, localByteBuffer.array()), arrayOfByte2);
        if (bool)
        {
          paramByteBuffer.position(n);
          return this.zza.zzd(paramArrayOfByte1, paramByteBuffer);
        }
        paramByteBuffer = new java/security/GeneralSecurityException;
        paramByteBuffer.<init>("invalid MAC");
        throw paramByteBuffer;
      }
      catch (GeneralSecurityException paramByteBuffer)
      {
        throw new AEADBadTagException(paramByteBuffer.toString());
      }
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */