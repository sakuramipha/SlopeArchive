package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

public final class zzvf
{
  private final Random zza;
  private final int[] zzb;
  private final int[] zzc;
  
  public zzvf(int paramInt)
  {
    this(0, new Random());
  }
  
  private zzvf(int paramInt, Random paramRandom)
  {
    this(new int[0], paramRandom);
  }
  
  private zzvf(int[] paramArrayOfInt, Random paramRandom)
  {
    this.zzb = paramArrayOfInt;
    this.zza = paramRandom;
    this.zzc = new int[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      this.zzc[paramArrayOfInt[i]] = i;
    }
  }
  
  public final int zza()
  {
    int[] arrayOfInt = this.zzb;
    if (arrayOfInt.length > 0) {
      return arrayOfInt[0];
    }
    return -1;
  }
  
  public final int zzb()
  {
    int[] arrayOfInt = this.zzb;
    int i = arrayOfInt.length;
    if (i > 0) {
      return arrayOfInt[(i - 1)];
    }
    return -1;
  }
  
  public final int zzc()
  {
    return this.zzb.length;
  }
  
  public final int zzd(int paramInt)
  {
    paramInt = this.zzc[paramInt] + 1;
    int[] arrayOfInt = this.zzb;
    if (paramInt < arrayOfInt.length) {
      return arrayOfInt[paramInt];
    }
    return -1;
  }
  
  public final int zze(int paramInt)
  {
    paramInt = this.zzc[paramInt] - 1;
    if (paramInt >= 0) {
      return this.zzb[paramInt];
    }
    return -1;
  }
  
  public final zzvf zzf()
  {
    return new zzvf(0, new Random(this.zza.nextLong()));
  }
  
  public final zzvf zzg(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt2 = new int[paramInt2];
    int[] arrayOfInt1 = new int[paramInt2];
    int k = 0;
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1 = i)
    {
      arrayOfInt2[paramInt1] = this.zza.nextInt(this.zzb.length + 1);
      localObject = this.zza;
      i = paramInt1 + 1;
      j = ((Random)localObject).nextInt(i);
      arrayOfInt1[paramInt1] = arrayOfInt1[j];
      arrayOfInt1[j] = paramInt1;
    }
    Arrays.sort(arrayOfInt2);
    Object localObject = new int[this.zzb.length + paramInt2];
    int j = 0;
    int i = 0;
    for (paramInt1 = k;; paramInt1++)
    {
      int[] arrayOfInt3 = this.zzb;
      if (paramInt1 >= arrayOfInt3.length + paramInt2) {
        break;
      }
      if ((j < paramInt2) && (i == arrayOfInt2[j]))
      {
        localObject[paramInt1] = arrayOfInt1[j];
        j++;
      }
      else
      {
        k = arrayOfInt3[i];
        localObject[paramInt1] = k;
        if (k >= 0) {
          localObject[paramInt1] = (k + paramInt2);
        }
        i++;
      }
    }
    return new zzvf((int[])localObject, new Random(this.zza.nextLong()));
  }
  
  public final zzvf zzh(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt2 = new int[this.zzb.length - paramInt2];
    paramInt1 = 0;
    int i = 0;
    for (;;)
    {
      int[] arrayOfInt1 = this.zzb;
      if (paramInt1 >= arrayOfInt1.length) {
        break;
      }
      int k = arrayOfInt1[paramInt1];
      if ((k >= 0) && (k < paramInt2))
      {
        i++;
      }
      else
      {
        int j = k;
        if (k >= 0) {
          j = k - paramInt2;
        }
        arrayOfInt2[(paramInt1 - i)] = j;
      }
      paramInt1++;
    }
    return new zzvf(arrayOfInt2, new Random(this.zza.nextLong()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */