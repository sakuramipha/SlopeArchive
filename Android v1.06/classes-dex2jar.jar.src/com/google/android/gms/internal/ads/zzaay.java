package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

public final class zzaay
{
  public static zzca zza(zzaap paramzzaap, boolean paramBoolean)
    throws IOException
  {
    zzaec localzzaec;
    if (paramBoolean) {
      localzzaec = null;
    } else {
      localzzaec = zzaee.zza;
    }
    paramzzaap = new zzabf().zza(paramzzaap, localzzaec);
    if ((paramzzaap != null) && (paramzzaap.zza() != 0)) {
      return paramzzaap;
    }
    return null;
  }
  
  public static zzaba zzb(zzfd paramzzfd)
  {
    paramzzfd.zzG(1);
    int i = paramzzfd.zzm();
    long l3 = paramzzfd.zzc();
    long l2 = i;
    int j = i / 18;
    long[] arrayOfLong4 = new long[j];
    long[] arrayOfLong3 = new long[j];
    long[] arrayOfLong1;
    long[] arrayOfLong2;
    for (i = 0;; i++)
    {
      arrayOfLong1 = arrayOfLong4;
      arrayOfLong2 = arrayOfLong3;
      if (i >= j) {
        break;
      }
      long l1 = paramzzfd.zzr();
      if (l1 == -1L)
      {
        arrayOfLong1 = Arrays.copyOf(arrayOfLong4, i);
        arrayOfLong2 = Arrays.copyOf(arrayOfLong3, i);
        break;
      }
      arrayOfLong4[i] = l1;
      arrayOfLong3[i] = paramzzfd.zzr();
      paramzzfd.zzG(2);
    }
    paramzzfd.zzG((int)(l3 + l2 - paramzzfd.zzc()));
    return new zzaba(arrayOfLong1, arrayOfLong2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */