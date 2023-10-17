package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

public final class zzgrr
{
  private static final zzgrr zza = new zzgrr(0, new int[0], new Object[0], false);
  private int zzb;
  private int[] zzc;
  private Object[] zzd;
  private int zze = -1;
  private boolean zzf;
  
  private zzgrr()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzgrr(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.zzb = paramInt;
    this.zzc = paramArrayOfInt;
    this.zzd = paramArrayOfObject;
    this.zzf = paramBoolean;
  }
  
  public static zzgrr zzc()
  {
    return zza;
  }
  
  static zzgrr zze(zzgrr paramzzgrr1, zzgrr paramzzgrr2)
  {
    int i = paramzzgrr1.zzb + paramzzgrr2.zzb;
    int[] arrayOfInt = Arrays.copyOf(paramzzgrr1.zzc, i);
    System.arraycopy(paramzzgrr2.zzc, 0, arrayOfInt, paramzzgrr1.zzb, paramzzgrr2.zzb);
    Object[] arrayOfObject = Arrays.copyOf(paramzzgrr1.zzd, i);
    System.arraycopy(paramzzgrr2.zzd, 0, arrayOfObject, paramzzgrr1.zzb, paramzzgrr2.zzb);
    return new zzgrr(i, arrayOfInt, arrayOfObject, true);
  }
  
  static zzgrr zzf()
  {
    return new zzgrr(0, new int[8], new Object[8], true);
  }
  
  private final void zzl(int paramInt)
  {
    int[] arrayOfInt = this.zzc;
    if (paramInt > arrayOfInt.length)
    {
      int i = this.zzb;
      int j = i + i / 2;
      i = paramInt;
      if (j >= paramInt) {
        i = j;
      }
      paramInt = i;
      if (i < 8) {
        paramInt = 8;
      }
      this.zzc = Arrays.copyOf(arrayOfInt, paramInt);
      this.zzd = Arrays.copyOf(this.zzd, paramInt);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof zzgrr)) {
      return false;
    }
    paramObject = (zzgrr)paramObject;
    int j = this.zzb;
    if (j == ((zzgrr)paramObject).zzb)
    {
      int[] arrayOfInt = this.zzc;
      Object localObject = ((zzgrr)paramObject).zzc;
      for (int i = 0; i < j; i++) {
        if (arrayOfInt[i] != localObject[i]) {
          break label123;
        }
      }
      localObject = this.zzd;
      paramObject = ((zzgrr)paramObject).zzd;
      j = this.zzb;
      for (i = 0; i < j; i++) {
        if (!localObject[i].equals(paramObject[i])) {
          break label123;
        }
      }
      return true;
    }
    label123:
    return false;
  }
  
  public final int hashCode()
  {
    int n = this.zzb;
    Object localObject = this.zzc;
    int k = 17;
    int m = 0;
    int j = 0;
    int i = 17;
    while (j < n)
    {
      i = i * 31 + localObject[j];
      j++;
    }
    localObject = this.zzd;
    int i1 = this.zzb;
    for (j = m; j < i1; j++) {
      k = k * 31 + localObject[j].hashCode();
    }
    return ((n + 527) * 31 + i) * 31 + k;
  }
  
  public final int zza()
  {
    int i = this.zze;
    if (i == -1)
    {
      int k = 0;
      int j = 0;
      while (k < this.zzb)
      {
        i = this.zzc[k];
        int m = i >>> 3;
        i &= 0x7;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                if (i == 5)
                {
                  ((Integer)this.zzd[k]).intValue();
                  i = zzgod.zzA(m << 3) + 4;
                  break label237;
                }
                throw new IllegalStateException(zzgpi.zza());
              }
              i = zzgod.zzf;
              i = ((zzgrr)this.zzd[k]).zza();
              m = zzgod.zzA(m << 3);
              m += m;
            }
            else
            {
              zzgno localzzgno = (zzgno)this.zzd[k];
              i = zzgod.zzf;
              int n = localzzgno.zzd();
              i = zzgod.zzA(n);
              i = zzgod.zzA(m << 3) + (i + n);
              break label237;
            }
          }
          else
          {
            ((Long)this.zzd[k]).longValue();
            i = zzgod.zzA(m << 3) + 8;
            break label237;
          }
        }
        else
        {
          i = zzgod.zzB(((Long)this.zzd[k]).longValue());
          m = zzgod.zzA(m << 3);
        }
        i = m + i;
        label237:
        j += i;
        k++;
      }
      this.zze = j;
      return j;
    }
    return i;
  }
  
  public final int zzb()
  {
    int i = this.zze;
    if (i == -1)
    {
      int j = 0;
      i = 0;
      while (j < this.zzb)
      {
        int i1 = this.zzc[j];
        zzgno localzzgno = (zzgno)this.zzd[j];
        int k = zzgod.zzf;
        k = localzzgno.zzd();
        int m = zzgod.zzA(k);
        int n = zzgod.zzA(16);
        i1 = zzgod.zzA(i1 >>> 3);
        int i2 = zzgod.zzA(8);
        i += i2 + i2 + (n + i1) + (zzgod.zzA(24) + (m + k));
        j++;
      }
      this.zze = i;
      return i;
    }
    return i;
  }
  
  final zzgrr zzd(zzgrr paramzzgrr)
  {
    if (paramzzgrr.equals(zza)) {
      return this;
    }
    zzg();
    int i = this.zzb + paramzzgrr.zzb;
    zzl(i);
    System.arraycopy(paramzzgrr.zzc, 0, this.zzc, this.zzb, paramzzgrr.zzb);
    System.arraycopy(paramzzgrr.zzd, 0, this.zzd, this.zzb, paramzzgrr.zzb);
    this.zzb = i;
    return this;
  }
  
  final void zzg()
  {
    if (this.zzf) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void zzh()
  {
    if (this.zzf) {
      this.zzf = false;
    }
  }
  
  final void zzi(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < this.zzb; i++) {
      zzgqi.zzb(paramStringBuilder, paramInt, String.valueOf(this.zzc[i] >>> 3), this.zzd[i]);
    }
  }
  
  final void zzj(int paramInt, Object paramObject)
  {
    zzg();
    zzl(this.zzb + 1);
    int[] arrayOfInt = this.zzc;
    int i = this.zzb;
    arrayOfInt[i] = paramInt;
    this.zzd[i] = paramObject;
    this.zzb = (i + 1);
  }
  
  public final void zzk(zzgoe paramzzgoe)
    throws IOException
  {
    if (this.zzb != 0) {
      for (int i = 0; i < this.zzb; i++)
      {
        int k = this.zzc[i];
        Object localObject = this.zzd[i];
        int j = k & 0x7;
        k >>>= 3;
        if (j != 0)
        {
          if (j != 1)
          {
            if (j != 2)
            {
              if (j != 3)
              {
                if (j == 5) {
                  paramzzgoe.zzk(k, ((Integer)localObject).intValue());
                } else {
                  throw new RuntimeException(zzgpi.zza());
                }
              }
              else
              {
                paramzzgoe.zzE(k);
                ((zzgrr)localObject).zzk(paramzzgoe);
                paramzzgoe.zzh(k);
              }
            }
            else {
              paramzzgoe.zzd(k, (zzgno)localObject);
            }
          }
          else {
            paramzzgoe.zzm(k, ((Long)localObject).longValue());
          }
        }
        else {
          paramzzgoe.zzt(k, ((Long)localObject).longValue());
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */