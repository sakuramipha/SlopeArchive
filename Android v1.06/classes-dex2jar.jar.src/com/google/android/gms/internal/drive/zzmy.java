package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.Arrays;

public final class zzmy
{
  private static final zzmy zzvr = new zzmy(0, new int[0], new Object[0], false);
  private int count;
  private boolean zznh;
  private int zzrr = -1;
  private Object[] zzue;
  private int[] zzvs;
  
  private zzmy()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzmy(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.count = paramInt;
    this.zzvs = paramArrayOfInt;
    this.zzue = paramArrayOfObject;
    this.zznh = paramBoolean;
  }
  
  static zzmy zza(zzmy paramzzmy1, zzmy paramzzmy2)
  {
    int i = paramzzmy1.count + paramzzmy2.count;
    int[] arrayOfInt = Arrays.copyOf(paramzzmy1.zzvs, i);
    System.arraycopy(paramzzmy2.zzvs, 0, arrayOfInt, paramzzmy1.count, paramzzmy2.count);
    Object[] arrayOfObject = Arrays.copyOf(paramzzmy1.zzue, i);
    System.arraycopy(paramzzmy2.zzue, 0, arrayOfObject, paramzzmy1.count, paramzzmy2.count);
    return new zzmy(i, arrayOfInt, arrayOfObject, true);
  }
  
  private static void zzb(int paramInt, Object paramObject, zzns paramzzns)
    throws IOException
  {
    int i = paramInt >>> 3;
    paramInt &= 0x7;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 5)
            {
              paramzzns.zzf(i, ((Integer)paramObject).intValue());
              return;
            }
            throw new RuntimeException(zzkq.zzdl());
          }
          if (paramzzns.zzcd() == zzkk.zze.zzsi)
          {
            paramzzns.zzak(i);
            ((zzmy)paramObject).zzb(paramzzns);
            paramzzns.zzal(i);
            return;
          }
          paramzzns.zzal(i);
          ((zzmy)paramObject).zzb(paramzzns);
          paramzzns.zzak(i);
          return;
        }
        paramzzns.zza(i, (zzjc)paramObject);
        return;
      }
      paramzzns.zzc(i, ((Long)paramObject).longValue());
      return;
    }
    paramzzns.zzi(i, ((Long)paramObject).longValue());
  }
  
  public static zzmy zzfa()
  {
    return zzvr;
  }
  
  static zzmy zzfb()
  {
    return new zzmy();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof zzmy)) {
      return false;
    }
    paramObject = (zzmy)paramObject;
    int j = this.count;
    if (j == ((zzmy)paramObject).count)
    {
      Object localObject = this.zzvs;
      int[] arrayOfInt = ((zzmy)paramObject).zzvs;
      for (int i = 0; i < j; i++) {
        if (localObject[i] != arrayOfInt[i])
        {
          i = 0;
          break label83;
        }
      }
      i = 1;
      label83:
      if (i != 0)
      {
        localObject = this.zzue;
        paramObject = ((zzmy)paramObject).zzue;
        j = this.count;
        for (i = 0; i < j; i++) {
          if (!localObject[i].equals(paramObject[i]))
          {
            i = 0;
            break label136;
          }
        }
        i = 1;
        label136:
        if (i != 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int n = this.count;
    Object localObject = this.zzvs;
    int m = 0;
    int k = 17;
    int j = 0;
    int i = 17;
    while (j < n)
    {
      i = i * 31 + localObject[j];
      j++;
    }
    localObject = this.zzue;
    int i1 = this.count;
    for (j = m; j < i1; j++) {
      k = k * 31 + localObject[j].hashCode();
    }
    return ((n + 527) * 31 + i) * 31 + k;
  }
  
  final void zza(zzns paramzzns)
    throws IOException
  {
    if (paramzzns.zzcd() == zzkk.zze.zzsj)
    {
      for (i = this.count - 1; i >= 0; i--) {
        paramzzns.zza(this.zzvs[i] >>> 3, this.zzue[i]);
      }
      return;
    }
    for (int i = 0; i < this.count; i++) {
      paramzzns.zza(this.zzvs[i] >>> 3, this.zzue[i]);
    }
  }
  
  final void zza(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < this.count; i++) {
      zzlt.zza(paramStringBuilder, paramInt, String.valueOf(this.zzvs[i] >>> 3), this.zzue[i]);
    }
  }
  
  final void zzb(int paramInt, Object paramObject)
  {
    if (this.zznh)
    {
      int j = this.count;
      int[] arrayOfInt = this.zzvs;
      if (j == arrayOfInt.length)
      {
        if (j < 4) {
          i = 8;
        } else {
          i = j >> 1;
        }
        i = j + i;
        this.zzvs = Arrays.copyOf(arrayOfInt, i);
        this.zzue = Arrays.copyOf(this.zzue, i);
      }
      arrayOfInt = this.zzvs;
      int i = this.count;
      arrayOfInt[i] = paramInt;
      this.zzue[i] = paramObject;
      this.count = (i + 1);
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void zzb(zzns paramzzns)
    throws IOException
  {
    if (this.count == 0) {
      return;
    }
    if (paramzzns.zzcd() == zzkk.zze.zzsi)
    {
      for (i = 0; i < this.count; i++) {
        zzb(this.zzvs[i], this.zzue[i], paramzzns);
      }
      return;
    }
    for (int i = this.count - 1; i >= 0; i--) {
      zzb(this.zzvs[i], this.zzue[i], paramzzns);
    }
  }
  
  public final void zzbp()
  {
    this.zznh = false;
  }
  
  public final int zzcx()
  {
    int i = this.zzrr;
    if (i != -1) {
      return i;
    }
    int j = 0;
    int k = 0;
    while (j < this.count)
    {
      int m = this.zzvs[j];
      i = m >>> 3;
      m &= 0x7;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m != 2)
          {
            if (m != 3)
            {
              if (m == 5) {
                i = zzjr.zzj(i, ((Integer)this.zzue[j]).intValue());
              } else {
                throw new IllegalStateException(zzkq.zzdl());
              }
            }
            else {
              i = (zzjr.zzab(i) << 1) + ((zzmy)this.zzue[j]).zzcx();
            }
          }
          else {
            i = zzjr.zzc(i, (zzjc)this.zzue[j]);
          }
        }
        else {
          i = zzjr.zzg(i, ((Long)this.zzue[j]).longValue());
        }
      }
      else {
        i = zzjr.zze(i, ((Long)this.zzue[j]).longValue());
      }
      k += i;
      j++;
    }
    this.zzrr = k;
    return k;
  }
  
  public final int zzfc()
  {
    int i = this.zzrr;
    if (i != -1) {
      return i;
    }
    i = 0;
    int j = 0;
    while (i < this.count)
    {
      j += zzjr.zzd(this.zzvs[i] >>> 3, (zzjc)this.zzue[i]);
      i++;
    }
    this.zzrr = j;
    return j;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */