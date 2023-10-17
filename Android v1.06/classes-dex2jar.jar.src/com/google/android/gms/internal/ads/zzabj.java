package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class zzabj
{
  public static int zza(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get(26) + 27;
    byte b2 = paramByteBuffer.get(i);
    byte b1;
    if (paramByteBuffer.limit() > 1) {
      b1 = paramByteBuffer.get(i + 1);
    } else {
      b1 = 0;
    }
    return (int)(zze(b2, b1) * 48000L / 1000000L);
  }
  
  public static int zzb(ByteBuffer paramByteBuffer)
  {
    byte b1 = 0;
    byte b2 = paramByteBuffer.get(0);
    if (paramByteBuffer.limit() > 1) {
      b1 = paramByteBuffer.get(1);
    }
    return (int)(zze(b2, b1) * 48000L / 1000000L);
  }
  
  public static long zzc(byte[] paramArrayOfByte)
  {
    byte b1 = 0;
    byte b2 = paramArrayOfByte[0];
    if (paramArrayOfByte.length > 1) {
      b1 = paramArrayOfByte[1];
    }
    return zze(b2, b1);
  }
  
  public static List zzd(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte[11];
    int i = paramArrayOfByte[10];
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramArrayOfByte);
    localArrayList.add(zzg(zzf((j & 0xFF) << 8 | i & 0xFF)));
    localArrayList.add(zzg(zzf(3840L)));
    return localArrayList;
  }
  
  private static long zze(byte paramByte1, byte paramByte2)
  {
    int j = paramByte1 & 0xFF;
    int k = j & 0x3;
    paramByte1 = 2;
    int i;
    if (k != 0)
    {
      i = paramByte1;
      if (k != 1)
      {
        i = paramByte1;
        if (k != 2) {
          i = paramByte2 & 0x3F;
        }
      }
    }
    else
    {
      i = 1;
    }
    paramByte2 = j >> 3;
    paramByte1 = paramByte2 & 0x3;
    if (paramByte2 >= 16) {
      paramByte1 = 2500 << paramByte1;
    } else if (paramByte2 >= 12) {
      paramByte1 = 10000 << (paramByte1 & 0x1);
    } else if (paramByte1 == 3) {
      paramByte1 = 60000;
    } else {
      paramByte1 = 10000 << paramByte1;
    }
    return i * paramByte1;
  }
  
  private static long zzf(long paramLong)
  {
    return paramLong * 1000000000L / 48000L;
  }
  
  private static byte[] zzg(long paramLong)
  {
    return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(paramLong).array();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */