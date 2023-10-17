package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

public final class zzmm
{
  private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
  private int zzb;
  private int[] zzc;
  private Object[] zzd;
  private int zze = -1;
  private boolean zzf;
  
  private zzmm()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzmm(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.zzb = paramInt;
    this.zzc = paramArrayOfInt;
    this.zzd = paramArrayOfObject;
    this.zzf = paramBoolean;
  }
  
  public static zzmm zzc()
  {
    return zza;
  }
  
  static zzmm zzd(zzmm paramzzmm1, zzmm paramzzmm2)
  {
    int i = paramzzmm1.zzb + paramzzmm2.zzb;
    int[] arrayOfInt = Arrays.copyOf(paramzzmm1.zzc, i);
    System.arraycopy(paramzzmm2.zzc, 0, arrayOfInt, paramzzmm1.zzb, paramzzmm2.zzb);
    Object[] arrayOfObject = Arrays.copyOf(paramzzmm1.zzd, i);
    System.arraycopy(paramzzmm2.zzd, 0, arrayOfObject, paramzzmm1.zzb, paramzzmm2.zzb);
    return new zzmm(i, arrayOfInt, arrayOfObject, true);
  }
  
  static zzmm zze()
  {
    return new zzmm(0, new int[8], new Object[8], true);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof zzmm)) {
      return false;
    }
    paramObject = (zzmm)paramObject;
    int j = this.zzb;
    if (j == ((zzmm)paramObject).zzb)
    {
      Object localObject = this.zzc;
      int[] arrayOfInt = ((zzmm)paramObject).zzc;
      for (int i = 0; i < j; i++) {
        if (localObject[i] != arrayOfInt[i]) {
          break label123;
        }
      }
      localObject = this.zzd;
      paramObject = ((zzmm)paramObject).zzd;
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
    int k = 0;
    int m = 17;
    int j = 0;
    int i = 17;
    while (j < n)
    {
      i = i * 31 + localObject[j];
      j++;
    }
    localObject = this.zzd;
    int i1 = this.zzb;
    j = m;
    while (k < i1)
    {
      j = j * 31 + localObject[k].hashCode();
      k++;
    }
    return ((n + 527) * 31 + i) * 31 + j;
  }
  
  public final int zza()
  {
    int i = this.zze;
    if (i == -1)
    {
      int j = 0;
      for (int k = 0; j < this.zzb; k = i)
      {
        int m = this.zzc[j];
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
                if (m == 5)
                {
                  ((Integer)this.zzd[j]).intValue();
                  i = zzjj.zzA(i << 3) + 4;
                  break label232;
                }
                throw new IllegalStateException(zzkm.zza());
              }
              i = zzjj.zzz(i);
              m = i + i;
              i = ((zzmm)this.zzd[j]).zza();
            }
            else
            {
              zzjb localzzjb = (zzjb)this.zzd[j];
              m = zzjj.zzA(i << 3);
              i = localzzjb.zzd();
              i = k + (m + (zzjj.zzA(i) + i));
              break label236;
            }
          }
          else
          {
            ((Long)this.zzd[j]).longValue();
            i = zzjj.zzA(i << 3) + 8;
            break label232;
          }
        }
        else
        {
          long l = ((Long)this.zzd[j]).longValue();
          m = zzjj.zzA(i << 3);
          i = zzjj.zzB(l);
        }
        i = m + i;
        label232:
        i = k + i;
        label236:
        j++;
      }
      this.zze = k;
      return k;
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
        int n = this.zzc[j];
        zzjb localzzjb = (zzjb)this.zzd[j];
        int m = zzjj.zzA(8);
        int k = localzzjb.zzd();
        i += m + m + (zzjj.zzA(16) + zzjj.zzA(n >>> 3)) + (zzjj.zzA(24) + (zzjj.zzA(k) + k));
        j++;
      }
      this.zze = i;
      return i;
    }
    return i;
  }
  
  public final void zzf()
  {
    this.zzf = false;
  }
  
  final void zzg(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < this.zzb; i++) {
      zzll.zzb(paramStringBuilder, paramInt, String.valueOf(this.zzc[i] >>> 3), this.zzd[i]);
    }
  }
  
  final void zzh(int paramInt, Object paramObject)
  {
    if (this.zzf)
    {
      int j = this.zzb;
      int[] arrayOfInt = this.zzc;
      if (j == arrayOfInt.length)
      {
        if (j < 4) {
          i = 8;
        } else {
          i = j >> 1;
        }
        i = j + i;
        this.zzc = Arrays.copyOf(arrayOfInt, i);
        this.zzd = Arrays.copyOf(this.zzd, i);
      }
      arrayOfInt = this.zzc;
      int i = this.zzb;
      arrayOfInt[i] = paramInt;
      this.zzd[i] = paramObject;
      this.zzb = (i + 1);
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void zzi(zznd paramzznd)
    throws IOException
  {
    if (this.zzb != 0) {
      for (int i = 0; i < this.zzb; i++)
      {
        int k = this.zzc[i];
        Object localObject = this.zzd[i];
        int j = k >>> 3;
        k &= 0x7;
        if (k != 0)
        {
          if (k != 1)
          {
            if (k != 2)
            {
              if (k != 3)
              {
                if (k == 5) {
                  paramzznd.zzk(j, ((Integer)localObject).intValue());
                } else {
                  throw new RuntimeException(zzkm.zza());
                }
              }
              else
              {
                paramzznd.zzE(j);
                ((zzmm)localObject).zzi(paramzznd);
                paramzznd.zzh(j);
              }
            }
            else {
              paramzznd.zzd(j, (zzjb)localObject);
            }
          }
          else {
            paramzznd.zzm(j, ((Long)localObject).longValue());
          }
        }
        else {
          paramzznd.zzt(j, ((Long)localObject).longValue());
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */