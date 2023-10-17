package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Objects;

public final class zzoh
{
  public static final zzoh zza = new zzoh(new int[] { 2 }, 8);
  private static final zzoh zzb = new zzoh(new int[] { 2, 5, 6 }, 8);
  private static final zzfru zzc;
  private final int[] zzd;
  private final int zze;
  
  static
  {
    zzfrt localzzfrt = new zzfrt();
    Integer localInteger1 = Integer.valueOf(6);
    localzzfrt.zza(Integer.valueOf(5), localInteger1);
    localzzfrt.zza(Integer.valueOf(17), localInteger1);
    localzzfrt.zza(Integer.valueOf(7), localInteger1);
    localzzfrt.zza(Integer.valueOf(18), localInteger1);
    Integer localInteger2 = Integer.valueOf(8);
    localzzfrt.zza(localInteger1, localInteger2);
    localzzfrt.zza(localInteger2, localInteger2);
    localzzfrt.zza(Integer.valueOf(14), localInteger2);
    zzc = localzzfrt.zzc();
  }
  
  public zzoh(int[] paramArrayOfInt, int paramInt)
  {
    paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
    this.zzd = paramArrayOfInt;
    Arrays.sort(paramArrayOfInt);
    this.zze = 8;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzoh)) {
      return false;
    }
    paramObject = (zzoh)paramObject;
    if (Arrays.equals(this.zzd, ((zzoh)paramObject).zzd))
    {
      int i = ((zzoh)paramObject).zze;
      return true;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zzd) * 31 + 8;
  }
  
  public final String toString()
  {
    String str = Arrays.toString(this.zzd);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioCapabilities[maxChannelCount=8, supportedEncodings=");
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final Pair zza(zzam paramzzam)
  {
    Object localObject = paramzzam.zzm;
    Objects.requireNonNull(localObject);
    int j = zzcd.zza((String)localObject, paramzzam.zzj);
    localObject = zzc;
    if (!((zzfru)localObject).containsKey(Integer.valueOf(j))) {
      return null;
    }
    int m = 6;
    int i = j;
    int k;
    if (j == 18)
    {
      if (!zzc(18)) {
        k = 6;
      } else {
        i = 18;
      }
    }
    else
    {
      k = i;
      if (i == 8)
      {
        k = i;
        if (!zzc(8)) {
          k = 7;
        }
      }
    }
    if (!zzc(k)) {
      return null;
    }
    i = paramzzam.zzz;
    if ((i != -1) && (k != 18))
    {
      j = i;
      if (i > 8) {
        return null;
      }
    }
    else
    {
      j = paramzzam.zzA;
      i = j;
      if (j == -1) {
        i = 48000;
      }
      if (zzfn.zza >= 29)
      {
        j = zzog.zza(k, i);
      }
      else
      {
        paramzzam = (Integer)((zzfru)localObject).getOrDefault(Integer.valueOf(k), Integer.valueOf(0));
        Objects.requireNonNull(paramzzam);
        j = paramzzam.intValue();
      }
    }
    if (zzfn.zza <= 28)
    {
      if (j == 7)
      {
        i = 8;
        break label248;
      }
      i = m;
      if (j == 3) {
        break label248;
      }
      i = m;
      if (j == 4) {
        break label248;
      }
      if (j == 5)
      {
        i = m;
        break label248;
      }
    }
    i = j;
    label248:
    j = i;
    if (zzfn.zza <= 26)
    {
      j = i;
      if ("fugu".equals(zzfn.zzb))
      {
        j = i;
        if (i == 1) {
          j = 2;
        }
      }
    }
    i = zzfn.zzf(j);
    if (i == 0) {
      return null;
    }
    return Pair.create(Integer.valueOf(k), Integer.valueOf(i));
  }
  
  public final boolean zzc(int paramInt)
  {
    return Arrays.binarySearch(this.zzd, paramInt) >= 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzoh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */