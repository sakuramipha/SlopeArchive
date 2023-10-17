package com.google.android.gms.internal.ads;

public final class zzzs
{
  public static final int zza = 0;
  private static final int[] zzb = { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
  
  public static zzzr zza(zzfc paramzzfc)
  {
    int k = paramzzfc.zzd(16);
    int i = paramzzfc.zzd(16);
    if (i == 65535)
    {
      i = paramzzfc.zzd(24);
      j = 7;
    }
    else
    {
      j = 4;
    }
    i += j;
    int j = i;
    if (k == 44097) {
      j = i + 2;
    }
    i = paramzzfc.zzd(2);
    k = i;
    if (i == 3) {
      for (i = 0;; i = i + 1 << 2)
      {
        i += paramzzfc.zzd(2);
        if (!paramzzfc.zzn())
        {
          k = i + 3;
          break;
        }
      }
    }
    i = paramzzfc.zzd(10);
    if ((paramzzfc.zzn()) && (paramzzfc.zzd(3) > 0)) {
      paramzzfc.zzl(2);
    }
    int m;
    if (true != paramzzfc.zzn()) {
      m = 44100;
    } else {
      m = 48000;
    }
    int i1 = paramzzfc.zzd(4);
    if ((m == 44100) && (i1 == 13))
    {
      i = zzb[13];
    }
    else
    {
      int n;
      if ((m == 48000) && (i1 < 14))
      {
        n = zzb[i1];
        i %= 5;
        if (i != 1) {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                i = n;
                break label291;
              }
              if ((i1 == 3) || (i1 == 8)) {
                break label294;
              }
              i = n;
              if (i1 != 11) {
                break label291;
              }
              break label294;
            }
          }
          else
          {
            if (i1 == 8) {
              break label294;
            }
            i = n;
            if (i1 != 11) {
              break label291;
            }
            break label294;
          }
        }
        if (i1 != 3)
        {
          i = n;
          if (i1 == 8) {}
        }
      }
      for (;;)
      {
        label291:
        break;
        label294:
        i = n + 1;
        continue;
        i = 0;
      }
    }
    return new zzzr(k, 2, m, j, i, null);
  }
  
  public static void zzb(int paramInt, zzfd paramzzfd)
  {
    paramzzfd.zzC(7);
    paramzzfd = paramzzfd.zzH();
    paramzzfd[0] = -84;
    paramzzfd[1] = 64;
    paramzzfd[2] = -1;
    paramzzfd[3] = -1;
    paramzzfd[4] = ((byte)(paramInt >> 16 & 0xFF));
    paramzzfd[5] = ((byte)(paramInt >> 8 & 0xFF));
    paramzzfd[6] = ((byte)(paramInt & 0xFF));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */