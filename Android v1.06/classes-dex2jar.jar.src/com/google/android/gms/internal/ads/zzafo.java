package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzafo
{
  private final zzfd zza = new zzfd(8);
  private int zzb;
  
  private final long zzb(zzaap paramzzaap)
    throws IOException
  {
    byte[] arrayOfByte = this.zza.zzH();
    paramzzaap = (zzaae)paramzzaap;
    int k = 0;
    paramzzaap.zzm(arrayOfByte, 0, 1, false);
    int m = this.zza.zzH()[0] & 0xFF;
    if (m != 0)
    {
      int j = 128;
      for (int i = 0; (m & j) == 0; i++) {
        j >>= 1;
      }
      m &= (j ^ 0xFFFFFFFF);
      paramzzaap.zzm(this.zza.zzH(), 1, i, false);
      j = k;
      for (k = m; j < i; k = (paramzzaap[j] & 0xFF) + (k << 8))
      {
        paramzzaap = this.zza.zzH();
        j++;
      }
      this.zzb += i + 1;
      return k;
    }
    return Long.MIN_VALUE;
  }
  
  public final boolean zza(zzaap paramzzaap)
    throws IOException
  {
    long l3 = paramzzaap.zzd();
    long l2 = 1024L;
    boolean bool2 = l3 < -1L;
    long l1 = l2;
    if (bool2) {
      if (l3 > 1024L) {
        l1 = l2;
      } else {
        l1 = l3;
      }
    }
    byte[] arrayOfByte = this.zza.zzH();
    zzaae localzzaae = (zzaae)paramzzaap;
    localzzaae.zzm(arrayOfByte, 0, 4, false);
    l2 = this.zza.zzs();
    this.zzb = 4;
    while (l2 != 440786851L)
    {
      int k = (int)l1;
      int i = this.zzb + 1;
      this.zzb = i;
      if (i == k) {
        return false;
      }
      localzzaae.zzm(this.zza.zzH(), 0, 1, false);
      l2 = l2 << 8 & 0xFFFFFFFFFFFFFF00 | this.zza.zzH()[0] & 0xFF;
    }
    l1 = zzb(paramzzaap);
    l2 = this.zzb;
    if ((l1 != Long.MIN_VALUE) && ((!bool2) || (l2 + l1 < l3)))
    {
      int j;
      for (;;)
      {
        boolean bool1 = this.zzb < l2 + l1;
        if (!bool1) {
          break label289;
        }
        if (zzb(paramzzaap) == Long.MIN_VALUE) {
          return false;
        }
        l3 = zzb(paramzzaap);
        bool1 = l3 < 0L;
        if (bool1) {
          break;
        }
        if (bool1)
        {
          j = (int)l3;
          localzzaae.zzl(j, false);
          this.zzb += j;
        }
      }
      return false;
      label289:
      if (j == 0) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */