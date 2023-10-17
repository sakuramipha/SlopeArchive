package com.google.android.gms.internal.ads;

public final class zzabi
{
  private static final String[] zza = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  private static final int[] zzb = { 44100, 48000, 32000 };
  private static final int[] zzc = { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
  private static final int[] zzd = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
  private static final int[] zze = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
  private static final int[] zzf = { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
  private static final int[] zzg = { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
  
  public static int zzb(int paramInt)
  {
    if (!zzm(paramInt)) {
      return -1;
    }
    int n = paramInt >>> 19 & 0x3;
    if (n == 1) {
      return -1;
    }
    int k = paramInt >>> 17 & 0x3;
    if (k == 0) {
      return -1;
    }
    int i1 = paramInt >>> 12 & 0xF;
    if ((i1 != 0) && (i1 != 15))
    {
      int i = paramInt >>> 10 & 0x3;
      if (i == 3) {
        return -1;
      }
      int j = zzb[i];
      if (n == 2)
      {
        i = j / 2;
      }
      else
      {
        i = j;
        if (n == 0) {
          i = j / 4;
        }
      }
      int m = paramInt >>> 9 & 0x1;
      if (k == 3)
      {
        if (n == 3) {
          paramInt = zzc[(i1 - 1)];
        } else {
          paramInt = zzd[(i1 - 1)];
        }
        return (paramInt * 12 / i + m) * 4;
      }
      if (n == 3)
      {
        if (k == 2) {
          paramInt = zze[(i1 - 1)];
        } else {
          paramInt = zzf[(i1 - 1)];
        }
      }
      else {
        paramInt = zzg[(i1 - 1)];
      }
      j = 144;
      if (n == 3) {
        return paramInt * 144 / i + m;
      }
      if (k == 1) {
        j = 72;
      }
      return j * paramInt / i + m;
    }
    return -1;
  }
  
  public static int zzc(int paramInt)
  {
    if (!zzm(paramInt)) {
      return -1;
    }
    int i = paramInt >>> 19 & 0x3;
    if (i == 1) {
      return -1;
    }
    int k = paramInt >>> 17 & 0x3;
    if (k == 0) {
      return -1;
    }
    int j = paramInt >>> 12 & 0xF;
    if ((j != 0) && (j != 15) && ((paramInt >>> 10 & 0x3) != 3)) {
      return zzl(i, k);
    }
    return -1;
  }
  
  private static int zzl(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 1)
    {
      if (paramInt2 != 2) {
        return 384;
      }
      return 1152;
    }
    if (paramInt1 == 3) {
      return 1152;
    }
    return 576;
  }
  
  private static boolean zzm(int paramInt)
  {
    return (paramInt & 0xFFE00000) == -2097152;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */