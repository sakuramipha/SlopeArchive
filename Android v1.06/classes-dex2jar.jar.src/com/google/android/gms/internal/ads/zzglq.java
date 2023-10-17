package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzglq
{
  public static final void zza(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, ByteBuffer paramByteBuffer3, int paramInt)
  {
    if ((paramInt >= 0) && (paramByteBuffer2.remaining() >= paramInt) && (paramByteBuffer3.remaining() >= paramInt) && (paramByteBuffer1.remaining() >= paramInt))
    {
      for (int i = 0; i < paramInt; i++) {
        paramByteBuffer1.put((byte)(paramByteBuffer2.get() ^ paramByteBuffer3.get()));
      }
      return;
    }
    throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
  }
  
  public static byte[] zzb(byte[]... paramVarArgs)
    throws GeneralSecurityException
  {
    int i = 0;
    int j = 0;
    int k;
    for (;;)
    {
      k = paramVarArgs.length;
      if (i >= k) {
        break label45;
      }
      k = paramVarArgs[i].length;
      if (j > Integer.MAX_VALUE - k) {
        break;
      }
      j += k;
      i++;
    }
    throw new GeneralSecurityException("exceeded size limit");
    label45:
    byte[] arrayOfByte2 = new byte[j];
    j = 0;
    i = 0;
    while (j < k)
    {
      byte[] arrayOfByte1 = paramVarArgs[j];
      int m = arrayOfByte1.length;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, i, m);
      i += m;
      j++;
    }
    return arrayOfByte2;
  }
  
  public static final byte[] zzc(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    if (i == paramArrayOfByte2.length) {
      return zzd(paramArrayOfByte1, 0, paramArrayOfByte2, 0, i);
    }
    throw new IllegalArgumentException("The lengths of x and y should match.");
  }
  
  public static final byte[] zzd(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    if ((paramArrayOfByte1.length - paramInt3 >= paramInt1) && (paramArrayOfByte2.length - paramInt3 >= paramInt2))
    {
      byte[] arrayOfByte = new byte[paramInt3];
      for (int i = 0; i < paramInt3; i++) {
        arrayOfByte[i] = ((byte)(paramArrayOfByte1[(i + paramInt1)] ^ paramArrayOfByte2[(i + paramInt2)]));
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzglq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */