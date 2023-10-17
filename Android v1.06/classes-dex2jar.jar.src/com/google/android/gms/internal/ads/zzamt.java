package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzamt
{
  public static double zza(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    return (arrayOfByte[0] << 24 & 0xFF000000 | arrayOfByte[1] << 16 & 0xFF0000 | 0xFF00 & arrayOfByte[2] << 8 | arrayOfByte[3] & 0xFF) / 1.073741824E9D;
  }
  
  public static double zzb(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    return (arrayOfByte[0] << 24 & 0xFF000000 | arrayOfByte[1] << 16 & 0xFF0000 | 0xFF00 & arrayOfByte[2] << 8 | arrayOfByte[3] & 0xFF) / 65536.0D;
  }
  
  public static int zzc(byte paramByte)
  {
    int i = paramByte;
    if (paramByte < 0) {
      i = paramByte + 256;
    }
    return i;
  }
  
  public static int zzd(ByteBuffer paramByteBuffer)
  {
    return (zzc(paramByteBuffer.get()) << 8) + zzc(paramByteBuffer.get());
  }
  
  public static long zze(ByteBuffer paramByteBuffer)
  {
    long l2 = paramByteBuffer.getInt();
    long l1 = l2;
    if (l2 < 0L) {
      l1 = l2 + 4294967296L;
    }
    return l1;
  }
  
  public static long zzf(ByteBuffer paramByteBuffer)
  {
    long l = zze(paramByteBuffer) << 32;
    if (l >= 0L) {
      return l + zze(paramByteBuffer);
    }
    throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */