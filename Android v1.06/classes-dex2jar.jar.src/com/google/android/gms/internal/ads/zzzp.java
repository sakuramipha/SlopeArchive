package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzzp
{
  public static final int zza = 0;
  private static final int[] zzb = { 1, 2, 3, 6 };
  private static final int[] zzc = { 48000, 44100, 32000 };
  private static final int[] zzd = { 24000, 22050, 16000 };
  private static final int[] zze = { 2, 1, 2, 3, 3, 4, 4, 5 };
  private static final int[] zzf = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  private static final int[] zzg = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  
  public static int zza(ByteBuffer paramByteBuffer)
  {
    int j = paramByteBuffer.get(paramByteBuffer.position() + 5);
    int i = 3;
    if ((j & 0xF8) >> 3 > 10)
    {
      if ((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0xC0) >> 6 != 3) {
        i = (paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4;
      }
      return zzb[i] * 256;
    }
    return 1536;
  }
  
  public static int zzb(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 6) {
      return -1;
    }
    if ((paramArrayOfByte[5] & 0xF8) >> 3 > 10)
    {
      i = paramArrayOfByte[2];
      i = (paramArrayOfByte[3] & 0xFF | (i & 0x7) << 8) + 1;
      return i + i;
    }
    int i = paramArrayOfByte[4];
    return zzf((i & 0xC0) >> 6, i & 0x3F);
  }
  
  public static zzam zzc(zzfd paramzzfd, String paramString1, String paramString2, zzad paramzzad)
  {
    zzfc localzzfc = new zzfc();
    localzzfc.zzh(paramzzfd);
    int i = localzzfc.zzd(2);
    int k = zzc[i];
    localzzfc.zzl(8);
    int j = zze[localzzfc.zzd(3)];
    i = j;
    if (localzzfc.zzd(1) != 0) {
      i = j + 1;
    }
    j = localzzfc.zzd(5);
    j = zzf[j] * 1000;
    localzzfc.zze();
    paramzzfd.zzF(localzzfc.zzb());
    paramzzfd = new zzak();
    paramzzfd.zzH(paramString1);
    paramzzfd.zzS("audio/ac3");
    paramzzfd.zzw(i);
    paramzzfd.zzT(k);
    paramzzfd.zzB(paramzzad);
    paramzzfd.zzK(paramString2);
    paramzzfd.zzv(j);
    paramzzfd.zzO(j);
    return paramzzfd.zzY();
  }
  
  public static zzam zzd(zzfd paramzzfd, String paramString1, String paramString2, zzad paramzzad)
  {
    zzfc localzzfc = new zzfc();
    localzzfc.zzh(paramzzfd);
    int k = localzzfc.zzd(13);
    localzzfc.zzl(3);
    int i = localzzfc.zzd(2);
    int m = zzc[i];
    localzzfc.zzl(10);
    int j = zze[localzzfc.zzd(3)];
    i = j;
    if (localzzfc.zzd(1) != 0) {
      i = j + 1;
    }
    localzzfc.zzl(3);
    int n = localzzfc.zzd(4);
    localzzfc.zzl(1);
    j = i;
    if (n > 0)
    {
      localzzfc.zzm(6);
      j = i;
      if (localzzfc.zzd(1) != 0) {
        j = i + 2;
      }
      localzzfc.zzl(1);
    }
    if (localzzfc.zza() > 7)
    {
      localzzfc.zzl(7);
      if (localzzfc.zzd(1) != 0)
      {
        str = "audio/eac3-joc";
        break label182;
      }
    }
    String str = "audio/eac3";
    label182:
    localzzfc.zze();
    paramzzfd.zzF(localzzfc.zzb());
    paramzzfd = new zzak();
    paramzzfd.zzH(paramString1);
    paramzzfd.zzS(str);
    paramzzfd.zzw(j);
    paramzzfd.zzT(m);
    paramzzfd.zzB(paramzzad);
    paramzzfd.zzK(paramString2);
    paramzzfd.zzO(k * 1000);
    return paramzzfd.zzY();
  }
  
  public static zzzo zze(zzfc paramzzfc)
  {
    int i = paramzzfc.zzc();
    paramzzfc.zzl(40);
    int j = paramzzfc.zzd(5);
    paramzzfc.zzj(i);
    i = -1;
    int m;
    int k;
    int i4;
    int i3;
    Object localObject;
    int i2;
    if (j > 10)
    {
      paramzzfc.zzl(16);
      j = paramzzfc.zzd(2);
      if (j != 0)
      {
        if (j != 1)
        {
          if (j == 2) {
            i = 2;
          }
        }
        else {
          i = 1;
        }
      }
      else {
        i = 0;
      }
      paramzzfc.zzl(3);
      m = paramzzfc.zzd(11) + 1;
      int i9 = paramzzfc.zzd(2);
      if (i9 == 3)
      {
        j = zzd[paramzzfc.zzd(2)];
        k = 3;
        i4 = 6;
      }
      else
      {
        k = paramzzfc.zzd(2);
        i4 = zzb[k];
        j = zzc[i9];
      }
      int i8 = m + m;
      int i7 = i8 * j / (i4 * 32);
      int i5 = paramzzfc.zzd(3);
      int i11 = paramzzfc.zzn();
      int i10 = zze[i5];
      paramzzfc.zzl(10);
      if (paramzzfc.zzn()) {
        paramzzfc.zzl(8);
      }
      if (i5 == 0)
      {
        paramzzfc.zzl(5);
        if (paramzzfc.zzn()) {
          paramzzfc.zzl(8);
        }
        m = 0;
        i5 = 0;
      }
      else
      {
        m = i5;
      }
      if (i == 1)
      {
        if (paramzzfc.zzn()) {
          paramzzfc.zzl(16);
        }
        i3 = 1;
      }
      else
      {
        i3 = i;
      }
      int n = i3;
      int i6 = k;
      if (paramzzfc.zzn())
      {
        if (m > 2) {
          paramzzfc.zzl(2);
        }
        if (((m & 0x1) != 0) && (m > 2)) {
          paramzzfc.zzl(6);
        }
        if ((m & 0x4) != 0) {
          paramzzfc.zzl(6);
        }
        if ((i11 != 0) && (paramzzfc.zzn())) {
          paramzzfc.zzl(5);
        }
        n = i3;
        i6 = k;
        if (i3 == 0)
        {
          if (paramzzfc.zzn()) {
            paramzzfc.zzl(6);
          }
          if ((m == 0) && (paramzzfc.zzn())) {
            paramzzfc.zzl(6);
          }
          if (paramzzfc.zzn()) {
            paramzzfc.zzl(6);
          }
          n = paramzzfc.zzd(2);
          if (n == 1)
          {
            paramzzfc.zzl(5);
          }
          else if (n == 2)
          {
            paramzzfc.zzl(12);
          }
          else if (n == 3)
          {
            n = paramzzfc.zzd(5);
            if (paramzzfc.zzn())
            {
              paramzzfc.zzl(5);
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn()) {
                paramzzfc.zzl(4);
              }
              if (paramzzfc.zzn())
              {
                if (paramzzfc.zzn()) {
                  paramzzfc.zzl(4);
                }
                if (paramzzfc.zzn()) {
                  paramzzfc.zzl(4);
                }
              }
            }
            if (paramzzfc.zzn())
            {
              paramzzfc.zzl(5);
              if (paramzzfc.zzn())
              {
                paramzzfc.zzl(7);
                if (paramzzfc.zzn()) {
                  paramzzfc.zzl(8);
                }
              }
            }
            paramzzfc.zzl((n + 2) * 8);
            paramzzfc.zze();
          }
          if (m < 2)
          {
            if (paramzzfc.zzn()) {
              paramzzfc.zzl(14);
            }
            if ((i5 == 0) && (paramzzfc.zzn())) {
              paramzzfc.zzl(14);
            }
          }
          if (paramzzfc.zzn())
          {
            if (k == 0)
            {
              paramzzfc.zzl(5);
              n = 0;
              i6 = 0;
            }
            else
            {
              for (n = 0; n < i4; n++) {
                if (paramzzfc.zzn()) {
                  paramzzfc.zzl(5);
                }
              }
            }
          }
          else
          {
            n = 0;
            i6 = k;
          }
        }
      }
      if (paramzzfc.zzn())
      {
        paramzzfc.zzl(5);
        k = m;
        if (m == 2)
        {
          paramzzfc.zzl(4);
          k = 2;
        }
        if (k >= 6) {
          paramzzfc.zzl(2);
        }
        if (paramzzfc.zzn()) {
          paramzzfc.zzl(8);
        }
        if ((k == 0) && (paramzzfc.zzn())) {
          paramzzfc.zzl(8);
        }
        if (i9 < 3) {
          paramzzfc.zzk();
        }
      }
      if ((n == 0) && (i6 != 3)) {
        paramzzfc.zzk();
      }
      if ((n == 2) && ((i6 == 3) || (paramzzfc.zzn()))) {
        paramzzfc.zzl(6);
      }
      if ((paramzzfc.zzn()) && (paramzzfc.zzd(6) == 1) && (paramzzfc.zzd(8) == 1)) {
        paramzzfc = "audio/eac3-joc";
      } else {
        paramzzfc = "audio/eac3";
      }
      m = i;
      i = i8;
      k = j;
      i3 = i4 * 256;
      j = i7;
      n = i10 + i11;
      localObject = paramzzfc;
    }
    else
    {
      paramzzfc.zzl(32);
      i = paramzzfc.zzd(2);
      if (i == 3) {
        localObject = null;
      } else {
        localObject = "audio/ac3";
      }
      k = paramzzfc.zzd(6);
      j = k / 2;
      j = zzf[j];
      m = zzf(i, k);
      paramzzfc.zzl(8);
      k = paramzzfc.zzd(3);
      if (((k & 0x1) != 0) && (k != 1)) {
        paramzzfc.zzl(2);
      }
      if ((k & 0x4) != 0) {
        paramzzfc.zzl(2);
      }
      if (k == 2) {
        paramzzfc.zzl(2);
      }
      if (i < 3) {
        i = zzc[i];
      } else {
        i = -1;
      }
      int i1 = paramzzfc.zzn();
      i3 = zze[k];
      j *= 1000;
      k = i;
      i2 = i3 + i1;
      i4 = -1;
      i3 = 1536;
      i = m;
      m = i4;
    }
    return new zzzo((String)localObject, m, i2, k, i, i3, j, null);
  }
  
  private static int zzf(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < 3) && (paramInt2 >= 0))
    {
      int i = paramInt2 >> 1;
      if (i < 19)
      {
        paramInt1 = zzc[paramInt1];
        if (paramInt1 == 44100)
        {
          paramInt1 = zzg[i] + (paramInt2 & 0x1);
          return paramInt1 + paramInt1;
        }
        paramInt2 = zzf[i];
        if (paramInt1 == 32000) {
          return paramInt2 * 6;
        }
        return paramInt2 * 4;
      }
    }
    return -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */