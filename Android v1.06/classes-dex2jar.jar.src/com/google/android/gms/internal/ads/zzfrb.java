package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class zzfrb
{
  static int zza(int paramInt)
  {
    int i;
    if (paramInt < 32) {
      i = 4;
    } else {
      i = 2;
    }
    return i * (paramInt + 1);
  }
  
  static int zzb(@CheckForNull Object paramObject1, @CheckForNull Object paramObject2, int paramInt, Object paramObject3, int[] paramArrayOfInt, Object[] paramArrayOfObject1, @CheckForNull Object[] paramArrayOfObject2)
  {
    int i1 = zzfrj.zzb(paramObject1);
    int m = i1 & paramInt;
    int j = zzc(paramObject3, m);
    if (j != 0)
    {
      int n = paramInt ^ 0xFFFFFFFF;
      int i = -1;
      for (;;)
      {
        j--;
        int k = paramArrayOfInt[j];
        if (((k & n) == (i1 & n)) && (zzfou.zza(paramObject1, paramArrayOfObject1[j])) && ((paramArrayOfObject2 == null) || (zzfou.zza(paramObject2, paramArrayOfObject2[j]))))
        {
          k &= paramInt;
          if (i == -1) {
            zze(paramObject3, m, k);
          } else {
            paramArrayOfInt[i] = (k & paramInt | paramArrayOfInt[i] & n);
          }
          return j;
        }
        k &= paramInt;
        if (k == 0) {
          break;
        }
        i = j;
        j = k;
      }
    }
    return -1;
  }
  
  static int zzc(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof byte[])) {
      return ((byte[])paramObject)[paramInt] & 0xFF;
    }
    if ((paramObject instanceof short[])) {
      return (char)((short[])paramObject)[paramInt];
    }
    return ((int[])paramObject)[paramInt];
  }
  
  static Object zzd(int paramInt)
  {
    if ((paramInt >= 2) && (paramInt <= 1073741824) && (Integer.highestOneBit(paramInt) == paramInt))
    {
      if (paramInt <= 256) {
        return new byte[paramInt];
      }
      if (paramInt <= 65536) {
        return new short[paramInt];
      }
      return new int[paramInt];
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("must be power of 2 between 2^1 and 2^30: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static void zze(Object paramObject, int paramInt1, int paramInt2)
  {
    if ((paramObject instanceof byte[]))
    {
      ((byte[])paramObject)[paramInt1] = ((byte)paramInt2);
      return;
    }
    if ((paramObject instanceof short[]))
    {
      ((short[])paramObject)[paramInt1] = ((short)paramInt2);
      return;
    }
    ((int[])paramObject)[paramInt1] = paramInt2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */