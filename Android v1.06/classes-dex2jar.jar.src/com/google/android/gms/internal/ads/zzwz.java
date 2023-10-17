package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzwz
{
  private final String[] zza;
  private final int[] zzb;
  private final zzvk[] zzc;
  private final int[] zzd;
  private final int[][][] zze;
  private final zzvk zzf;
  
  zzwz(String[] paramArrayOfString, int[] paramArrayOfInt1, zzvk[] paramArrayOfzzvk, int[] paramArrayOfInt2, int[][][] paramArrayOfInt, zzvk paramzzvk)
  {
    this.zza = paramArrayOfString;
    this.zzb = paramArrayOfInt1;
    this.zzc = paramArrayOfzzvk;
    this.zze = paramArrayOfInt;
    this.zzd = paramArrayOfInt2;
    this.zzf = paramzzvk;
  }
  
  public final int zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = this.zzc[paramInt1].zzb(paramInt2).zzb;
    Object localObject = new int[1];
    int m = 0;
    int k = 0;
    for (int j = 0; k <= 0; j = i)
    {
      i = j;
      if ((this.zze[paramInt1][paramInt2][k] & 0x7) == 4)
      {
        localObject[j] = k;
        i = j + 1;
      }
      k++;
    }
    int[] arrayOfInt = Arrays.copyOf((int[])localObject, j);
    localObject = null;
    boolean bool = false;
    i = 0;
    j = 16;
    k = m;
    while (k < arrayOfInt.length)
    {
      m = arrayOfInt[k];
      String str = this.zzc[paramInt1].zzb(paramInt2).zzb(m).zzm;
      if (i == 0) {
        localObject = str;
      } else {
        bool |= zzfn.zzB(localObject, str) ^ true;
      }
      j = Math.min(j, this.zze[paramInt1][paramInt2][k] & 0x18);
      k++;
      i++;
    }
    if (bool) {
      return Math.min(j, this.zzd[paramInt1]);
    }
    return j;
  }
  
  public final int zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.zze[paramInt1][paramInt2][paramInt3];
  }
  
  public final int zzc(int paramInt)
  {
    return this.zzb[paramInt];
  }
  
  public final zzvk zzd(int paramInt)
  {
    return this.zzc[paramInt];
  }
  
  public final zzvk zze()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */