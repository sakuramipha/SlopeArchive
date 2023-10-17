package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzvr
  extends zzvt
{
  private final zzxl zzd;
  private final zzfrr zze;
  private final zzdz zzf;
  
  protected zzvr(zzcz paramzzcz, int[] paramArrayOfInt, int paramInt1, zzxl paramzzxl, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, List paramList, zzdz paramzzdz)
  {
    super(paramzzcz, paramArrayOfInt, 0);
    this.zzd = paramzzxl;
    this.zze = zzfrr.zzj(paramList);
    this.zzf = paramzzdz;
  }
  
  private static void zzg(List paramList, long[] paramArrayOfLong)
  {
    int k = 0;
    long l = 0L;
    int j;
    for (int i = 0;; i++)
    {
      j = k;
      if (i >= 2) {
        break;
      }
      l += paramArrayOfLong[i];
    }
    while (j < paramList.size())
    {
      zzfro localzzfro = (zzfro)paramList.get(j);
      if (localzzfro != null) {
        localzzfro.zzf(new zzvp(l, paramArrayOfLong[j]));
      }
      j++;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */