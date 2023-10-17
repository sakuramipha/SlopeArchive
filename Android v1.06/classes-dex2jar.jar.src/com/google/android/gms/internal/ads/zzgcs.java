package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgcs
{
  public static byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    long l10 = zzb(paramArrayOfByte1, 0, 0);
    long l8 = zzb(paramArrayOfByte1, 3, 2) & 0x3FFFF03;
    long l9 = zzb(paramArrayOfByte1, 6, 4) & 0x3FFC0FF;
    long l11 = zzb(paramArrayOfByte1, 9, 6) & 0x3F03FFF;
    long l7 = zzb(paramArrayOfByte1, 12, 8) & 0xFFFFF;
    byte[] arrayOfByte = new byte[17];
    long l5 = 0L;
    long l6 = 0L;
    long l4 = 0L;
    long l1 = l4;
    long l3 = l1;
    int i = 0;
    long l2 = l1;
    l1 = l6;
    for (;;)
    {
      int j = paramArrayOfByte2.length;
      if (i >= j) {
        break;
      }
      j = Math.min(16, j - i);
      System.arraycopy(paramArrayOfByte2, i, arrayOfByte, 0, j);
      arrayOfByte[j] = 1;
      if (j != 16) {
        Arrays.fill(arrayOfByte, j + 1, 17, (byte)0);
      }
      l6 = l7 * 5L;
      l12 = l11 * 5L;
      long l13 = l9 * 5L;
      l3 += zzb(arrayOfByte, 0, 0);
      l1 += zzb(arrayOfByte, 3, 2);
      l5 += zzb(arrayOfByte, 6, 4);
      long l15 = l4 + zzb(arrayOfByte, 9, 6);
      long l16 = l2 + (zzb(arrayOfByte, 12, 8) | arrayOfByte[16] << 24);
      long l14 = l3 * l10 + l1 * l6 + l5 * l12 + l15 * l13 + l8 * 5L * l16;
      l2 = l3 * l8 + l1 * l10 + l5 * l6 + l15 * l12 + l13 * l16 + (l14 >> 26);
      l12 = l3 * l9 + l1 * l8 + l5 * l10 + l15 * l6 + l12 * l16 + (l2 >> 26);
      l4 = l3 * l11 + l1 * l9 + l5 * l8 + l15 * l10 + l16 * l6 + (l12 >> 26);
      l6 = l3 * l7 + l1 * l11 + l5 * l9 + l15 * l8 + l16 * l10 + (l4 >> 26);
      l3 = (l14 & 0x3FFFFFF) + (l6 >> 26) * 5L;
      l1 = (l2 & 0x3FFFFFF) + (l3 >> 26);
      i += 16;
      l5 = l12 & 0x3FFFFFF;
      l4 &= 0x3FFFFFF;
      l2 = l6 & 0x3FFFFFF;
      l3 &= 0x3FFFFFF;
    }
    l6 = l5 + (l1 >> 26);
    l5 = l6 & 0x3FFFFFF;
    l4 += (l6 >> 26);
    l6 = l4 & 0x3FFFFFF;
    l4 = l2 + (l4 >> 26);
    l2 = l4 & 0x3FFFFFF;
    l3 += (l4 >> 26) * 5L;
    l9 = l3 & 0x3FFFFFF;
    l8 = l9 + 5L;
    long l12 = (l1 & 0x3FFFFFF) + (l3 >> 26);
    l7 = l12 + (l8 >> 26);
    l11 = (l7 >> 26) + l5;
    l10 = l6 + (l11 >> 26);
    l3 = l2 + (l10 >> 26) - 67108864L;
    l1 = l3 >> 63;
    l4 = l1 ^ 0xFFFFFFFFFFFFFFFF;
    l7 = l12 & l1 | l7 & 0x3FFFFFF & l4;
    l5 = l5 & l1 | l11 & 0x3FFFFFF & l4;
    l6 = l6 & l1 | l10 & 0x3FFFFFF & l4;
    l11 = ((l1 & l9 | l8 & 0x3FFFFFF & l4 | l7 << 26) & 0xFFFFFFFF) + zzc(paramArrayOfByte1, 16);
    l10 = zzc(paramArrayOfByte1, 20);
    l9 = zzc(paramArrayOfByte1, 24);
    l8 = zzc(paramArrayOfByte1, 28);
    paramArrayOfByte1 = new byte[16];
    zzd(paramArrayOfByte1, l11 & 0xFFFFFFFF, 0);
    l7 = ((l7 >> 6 | l5 << 20) & 0xFFFFFFFF) + l10 + (l11 >> 32);
    zzd(paramArrayOfByte1, l7 & 0xFFFFFFFF, 4);
    l5 = ((l5 >> 12 | l6 << 14) & 0xFFFFFFFF) + l9 + (l7 >> 32);
    zzd(paramArrayOfByte1, l5 & 0xFFFFFFFF, 8);
    zzd(paramArrayOfByte1, ((l6 >> 18 | (l2 & l1 | l3 & l4) << 8) & 0xFFFFFFFF) + l8 + (l5 >> 32) & 0xFFFFFFFF, 12);
    return paramArrayOfByte1;
  }
  
  private static long zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zzc(paramArrayOfByte, paramInt1) >> paramInt2 & 0x3FFFFFF;
  }
  
  private static long zzc(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int k = paramArrayOfByte[(paramInt + 1)];
    int j = paramArrayOfByte[(paramInt + 2)];
    return ((paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (k & 0xFF) << 8 | i & 0xFF | (j & 0xFF) << 16) & 0xFFFFFFFF;
  }
  
  private static void zzd(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    for (int i = 0; i < 4; i++)
    {
      paramArrayOfByte[(paramInt + i)] = ((byte)(int)(0xFF & paramLong));
      paramLong >>= 8;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */