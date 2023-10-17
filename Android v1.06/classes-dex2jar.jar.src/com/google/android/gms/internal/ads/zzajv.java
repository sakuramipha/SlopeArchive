package com.google.android.gms.internal.ads;

public final class zzajv
{
  public static int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] != 71)) {
      paramInt1++;
    }
    return paramInt1;
  }
  
  public static long zzb(zzfd paramzzfd, int paramInt1, int paramInt2)
  {
    paramzzfd.zzF(paramInt1);
    if (paramzzfd.zza() < 5) {
      return -9223372036854775807L;
    }
    paramInt1 = paramzzfd.zze();
    if ((0x800000 & paramInt1) != 0) {
      return -9223372036854775807L;
    }
    if ((paramInt1 >> 8 & 0x1FFF) != paramInt2) {
      return -9223372036854775807L;
    }
    if (((paramInt1 & 0x20) != 0) && (paramzzfd.zzk() >= 7) && (paramzzfd.zza() >= 7) && ((paramzzfd.zzk() & 0x10) == 16))
    {
      byte[] arrayOfByte = new byte[6];
      paramzzfd.zzB(arrayOfByte, 0, 6);
      long l4 = arrayOfByte[0];
      long l3 = arrayOfByte[1];
      long l1 = arrayOfByte[2];
      long l5 = arrayOfByte[3];
      long l2 = arrayOfByte[4];
      l5 &= 0xFF;
      return (l4 & 0xFF) << 25 | (l3 & 0xFF) << 17 | (l1 & 0xFF) << 9 | l5 + l5 | (l2 & 0xFF) >> 7;
    }
    return -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */