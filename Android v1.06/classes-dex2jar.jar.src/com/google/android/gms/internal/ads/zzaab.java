package com.google.android.gms.internal.ads;

public final class zzaab
{
  public static void zza(long paramLong, zzfd paramzzfd, zzabr[] paramArrayOfzzabr)
  {
    for (;;)
    {
      int i = paramzzfd.zza();
      int i1 = 1;
      if (i <= 1) {
        break;
      }
      int k = zzc(paramzzfd);
      int j = zzc(paramzzfd);
      int n = paramzzfd.zzc() + j;
      if ((j != -1) && (j <= paramzzfd.zza()))
      {
        i = n;
        if (k == 4)
        {
          i = n;
          if (j >= 8)
          {
            int m = paramzzfd.zzk();
            i = paramzzfd.zzo();
            if (i == 49)
            {
              j = paramzzfd.zze();
              i = 49;
            }
            else
            {
              j = 0;
            }
            int i2 = paramzzfd.zzk();
            k = i;
            if (i == 47)
            {
              paramzzfd.zzG(1);
              k = 47;
            }
            if ((m == 181) && ((k == 49) || (k == 47)) && (i2 == 3)) {
              i = 1;
            } else {
              i = 0;
            }
            m = i;
            if (k == 49)
            {
              if (j == 1195456820) {
                j = i1;
              } else {
                j = 0;
              }
              m = i & j;
            }
            i = n;
            if (m != 0)
            {
              zzb(paramLong, paramzzfd, paramArrayOfzzabr);
              i = n;
            }
          }
        }
      }
      else
      {
        zzer.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
        i = paramzzfd.zzd();
      }
      paramzzfd.zzF(i);
    }
  }
  
  public static void zzb(long paramLong, zzfd paramzzfd, zzabr[] paramArrayOfzzabr)
  {
    int j = paramzzfd.zzk();
    if ((j & 0x40) != 0)
    {
      paramzzfd.zzG(1);
      int m = paramzzfd.zzc();
      int k = paramArrayOfzzabr.length;
      for (int i = 0; i < k; i++)
      {
        int n = (j & 0x1F) * 3;
        zzabr localzzabr = paramArrayOfzzabr[i];
        paramzzfd.zzF(m);
        localzzabr.zzq(paramzzfd, n);
        if (paramLong != -9223372036854775807L) {
          localzzabr.zzs(paramLong, 1, n, 0, null);
        }
      }
    }
  }
  
  private static int zzc(zzfd paramzzfd)
  {
    int i = 0;
    int k;
    int j;
    do
    {
      if (paramzzfd.zza() == 0) {
        return -1;
      }
      k = paramzzfd.zzk();
      j = i + k;
      i = j;
    } while (k == 255);
    return j;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */