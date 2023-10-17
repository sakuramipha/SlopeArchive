package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzakp
{
  public static long zza(ByteBuffer paramByteBuffer)
  {
    zzg(paramByteBuffer);
    return zze(paramByteBuffer, paramByteBuffer.position() + 16);
  }
  
  public static long zzb(ByteBuffer paramByteBuffer)
  {
    zzg(paramByteBuffer);
    return zze(paramByteBuffer, paramByteBuffer.position() + 12);
  }
  
  static Pair zzc(RandomAccessFile paramRandomAccessFile)
    throws IOException
  {
    if (paramRandomAccessFile.length() < 22L) {
      return null;
    }
    Pair localPair = zzf(paramRandomAccessFile, 0);
    if (localPair != null) {
      return localPair;
    }
    return zzf(paramRandomAccessFile, 65535);
  }
  
  public static void zzd(ByteBuffer paramByteBuffer, long paramLong)
  {
    zzg(paramByteBuffer);
    int i = paramByteBuffer.position();
    if ((paramLong >= 0L) && (paramLong <= 4294967295L))
    {
      paramByteBuffer.putInt(paramByteBuffer.position() + (i + 16), (int)paramLong);
      return;
    }
    paramByteBuffer = new StringBuilder();
    paramByteBuffer.append("uint32 value of out range: ");
    paramByteBuffer.append(paramLong);
    throw new IllegalArgumentException(paramByteBuffer.toString());
  }
  
  private static long zze(ByteBuffer paramByteBuffer, int paramInt)
  {
    return paramByteBuffer.getInt(paramInt) & 0xFFFFFFFF;
  }
  
  private static Pair zzf(RandomAccessFile paramRandomAccessFile, int paramInt)
    throws IOException
  {
    long l = paramRandomAccessFile.length();
    if (l < 22L) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate((int)Math.min(paramInt, -22L + l) + 22);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    l -= localByteBuffer.capacity();
    paramRandomAccessFile.seek(l);
    paramRandomAccessFile.readFully(localByteBuffer.array(), localByteBuffer.arrayOffset(), localByteBuffer.capacity());
    zzg(localByteBuffer);
    paramInt = localByteBuffer.capacity();
    if (paramInt < 22) {}
    for (;;)
    {
      paramInt = -1;
      break;
      int k = paramInt - 22;
      int j = Math.min(k, 65535);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        int i = k - paramInt;
        if ((localByteBuffer.getInt(i) == 101010256) && ((char)localByteBuffer.getShort(i + 20) == paramInt))
        {
          paramInt = i;
          break label166;
        }
      }
    }
    label166:
    if (paramInt == -1) {
      return null;
    }
    localByteBuffer.position(paramInt);
    paramRandomAccessFile = localByteBuffer.slice();
    paramRandomAccessFile.order(ByteOrder.LITTLE_ENDIAN);
    return Pair.create(paramRandomAccessFile, Long.valueOf(l + paramInt));
  }
  
  private static void zzg(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
      return;
    }
    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */