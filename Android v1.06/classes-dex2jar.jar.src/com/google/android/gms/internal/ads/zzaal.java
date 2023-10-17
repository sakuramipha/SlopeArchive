package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaal
{
  public static final int zza = 0;
  private static final int[] zzb = { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8 };
  private static final int[] zzc = { -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1 };
  private static final int[] zzd = { 64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };
  
  public static zzam zza(byte[] paramArrayOfByte, String paramString1, String paramString2, zzad paramzzad)
  {
    int k = 0;
    int j = paramArrayOfByte[0];
    int m = -1;
    if (j == 127)
    {
      paramArrayOfByte = new zzfc(paramArrayOfByte, paramArrayOfByte.length);
    }
    else
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      j = arrayOfByte[0];
      if ((j == -2) || (j == -1)) {
        for (j = 0; j < arrayOfByte.length - 1; j += 2)
        {
          int i = arrayOfByte[j];
          n = j + 1;
          arrayOfByte[j] = arrayOfByte[n];
          arrayOfByte[n] = i;
        }
      }
      j = arrayOfByte.length;
      paramArrayOfByte = new zzfc(arrayOfByte, j);
      if (arrayOfByte[0] == 31)
      {
        paramzzad = new zzfc(arrayOfByte, j);
        while (paramzzad.zza() >= 16)
        {
          paramzzad.zzl(2);
          paramArrayOfByte.zzf(paramzzad.zzd(14), 14);
        }
      }
      paramArrayOfByte.zzi(arrayOfByte, arrayOfByte.length);
    }
    paramArrayOfByte.zzl(60);
    j = paramArrayOfByte.zzd(6);
    int n = zzb[j];
    j = paramArrayOfByte.zzd(4);
    int i1 = zzc[j];
    j = paramArrayOfByte.zzd(5);
    if (j >= 29) {
      j = m;
    } else {
      j = zzd[j] * 1000 / 2;
    }
    paramArrayOfByte.zzl(10);
    if (paramArrayOfByte.zzd(2) > 0) {
      k = 1;
    }
    paramArrayOfByte = new zzak();
    paramArrayOfByte.zzH(paramString1);
    paramArrayOfByte.zzS("audio/vnd.dts");
    paramArrayOfByte.zzv(j);
    paramArrayOfByte.zzw(n + k);
    paramArrayOfByte.zzT(i1);
    paramArrayOfByte.zzB(null);
    paramArrayOfByte.zzK(paramString2);
    return paramArrayOfByte.zzY();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */