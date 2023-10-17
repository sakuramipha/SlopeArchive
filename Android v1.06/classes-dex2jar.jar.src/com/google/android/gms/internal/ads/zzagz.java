package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzagz
{
  private static final int[] zza = { 1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686 };
  
  public static boolean zza(zzaap paramzzaap)
    throws IOException
  {
    return zzc(paramzzaap, true, false);
  }
  
  public static boolean zzb(zzaap paramzzaap, boolean paramBoolean)
    throws IOException
  {
    return zzc(paramzzaap, false, false);
  }
  
  private static boolean zzc(zzaap paramzzaap, boolean paramBoolean1, boolean paramBoolean2)
    throws IOException
  {
    long l1 = paramzzaap.zzd();
    long l3 = 4096L;
    boolean bool = l1 < -1L;
    long l2 = l3;
    if (bool) {
      if (l1 > 4096L) {
        l2 = l3;
      } else {
        l2 = l1;
      }
    }
    zzfd localzzfd = new zzfd(64);
    int k = (int)l2;
    int j = 0;
    int i = 0;
    if (j < k)
    {
      localzzfd.zzC(8);
      if (paramzzaap.zzm(localzzfd.zzH(), 0, 8, true))
      {
        l3 = localzzfd.zzs();
        int i3 = localzzfd.zze();
        int m = 16;
        if (l3 == 1L)
        {
          paramzzaap.zzh(localzzfd.zzH(), 8, 8);
          localzzfd.zzE(16);
          l2 = localzzfd.zzr();
        }
        else
        {
          l2 = l3;
          if (l3 == 0L)
          {
            long l4 = paramzzaap.zzd();
            l2 = l3;
            if (l4 != -1L) {
              l2 = l4 - paramzzaap.zze() + 8L;
            }
          }
          m = 8;
        }
        l3 = m;
        if (l2 < l3) {
          return false;
        }
        int n = j + m;
        int i1;
        if (i3 == 1836019574)
        {
          i1 = k + (int)l2;
          l2 = l1;
          k = i1;
          j = n;
          m = i;
          if (bool)
          {
            l2 = l1;
            k = i1;
            j = n;
            m = i;
            if (i1 > l1)
            {
              k = (int)l1;
              m = i;
              j = n;
              l2 = l1;
            }
          }
        }
        for (;;)
        {
          l1 = l2;
          i = m;
          break;
          if ((i3 == 1836019558) || (i3 == 1836475768)) {
            break label557;
          }
          if (n + l2 - l3 >= k) {
            break label562;
          }
          int i2 = (int)(l2 - l3);
          i1 = n + i2;
          if (i3 == 1718909296)
          {
            if (i2 < 8) {
              return false;
            }
            localzzfd.zzC(i2);
            paramzzaap.zzh(localzzfd.zzH(), 0, i2);
            label511:
            for (j = 0;; j++)
            {
              m = i;
              if (j >= i2 >> 2) {
                break;
              }
              if (j == 1)
              {
                localzzfd.zzG(4);
              }
              else
              {
                n = localzzfd.zze();
                if (n >>> 8 == 3368816)
                {
                  m = 1;
                  break;
                }
                m = n;
                if (n == 1751476579) {
                  m = 1751476579;
                }
                int[] arrayOfInt = zza;
                for (n = 0;; n++)
                {
                  if (n >= 29) {
                    break label511;
                  }
                  if (arrayOfInt[n] == m) {
                    break;
                  }
                }
              }
            }
            if (m == 0) {
              return false;
            }
          }
          else
          {
            m = i;
            if (i2 != 0)
            {
              paramzzaap.zzg(i2);
              m = i;
            }
          }
          l2 = l1;
          j = i1;
        }
        label557:
        paramBoolean2 = true;
        break label564;
      }
    }
    label562:
    paramBoolean2 = false;
    label564:
    return (i != 0) && (paramBoolean1 == paramBoolean2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */