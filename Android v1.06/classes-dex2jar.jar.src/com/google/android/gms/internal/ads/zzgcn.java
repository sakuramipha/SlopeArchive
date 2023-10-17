package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class zzgcn
{
  int[] zza;
  private final int zzb;
  
  public zzgcn(byte[] paramArrayOfByte, int paramInt)
    throws InvalidKeyException
  {
    if (paramArrayOfByte.length == 32)
    {
      this.zza = zzgcj.zzd(paramArrayOfByte);
      this.zzb = paramInt;
      return;
    }
    throw new InvalidKeyException("The key length in bytes must be 32.");
  }
  
  abstract int zza();
  
  abstract int[] zzb(int[] paramArrayOfInt, int paramInt);
  
  final ByteBuffer zzc(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = zzb(zzgcj.zzd(paramArrayOfByte), paramInt);
    Object localObject = (int[])paramArrayOfByte.clone();
    zzgcj.zzc((int[])localObject);
    for (paramInt = 0; paramInt < 16; paramInt++) {
      paramArrayOfByte[paramInt] += localObject[paramInt];
    }
    localObject = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
    ((ByteBuffer)localObject).asIntBuffer().put(paramArrayOfByte, 0, 16);
    return (ByteBuffer)localObject;
  }
  
  public final byte[] zzd(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer)
    throws GeneralSecurityException
  {
    ByteBuffer localByteBuffer2 = ByteBuffer.allocate(paramByteBuffer.remaining());
    if (paramArrayOfByte.length == zza())
    {
      int j = paramByteBuffer.remaining();
      int k = j / 64;
      for (i = 0;; i++)
      {
        int m = k + 1;
        if (i >= m) {
          break;
        }
        ByteBuffer localByteBuffer1 = zzc(paramArrayOfByte, this.zzb + i);
        if (i == m - 1) {
          zzglq.zza(localByteBuffer2, paramByteBuffer, localByteBuffer1, j % 64);
        } else {
          zzglq.zza(localByteBuffer2, paramByteBuffer, localByteBuffer1, 64);
        }
      }
      return localByteBuffer2.array();
    }
    int i = zza();
    paramArrayOfByte = new StringBuilder();
    paramArrayOfByte.append("The nonce length (in bytes) must be ");
    paramArrayOfByte.append(i);
    throw new GeneralSecurityException(paramArrayOfByte.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */