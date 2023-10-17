package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzlw<T>
  implements zzmf<T>
{
  private final zzlq zzuh;
  private final boolean zzui;
  private final zzmx<?, ?> zzur;
  private final zzjy<?> zzus;
  
  private zzlw(zzmx<?, ?> paramzzmx, zzjy<?> paramzzjy, zzlq paramzzlq)
  {
    this.zzur = paramzzmx;
    this.zzui = paramzzjy.zze(paramzzlq);
    this.zzus = paramzzjy;
    this.zzuh = paramzzlq;
  }
  
  static <T> zzlw<T> zza(zzmx<?, ?> paramzzmx, zzjy<?> paramzzjy, zzlq paramzzlq)
  {
    return new zzlw(paramzzmx, paramzzjy, paramzzlq);
  }
  
  public final boolean equals(T paramT1, T paramT2)
  {
    if (!this.zzur.zzr(paramT1).equals(this.zzur.zzr(paramT2))) {
      return false;
    }
    if (this.zzui) {
      return this.zzus.zzb(paramT1).equals(this.zzus.zzb(paramT2));
    }
    return true;
  }
  
  public final int hashCode(T paramT)
  {
    int j = this.zzur.zzr(paramT).hashCode();
    int i = j;
    if (this.zzui) {
      i = j * 53 + this.zzus.zzb(paramT).hashCode();
    }
    return i;
  }
  
  public final T newInstance()
  {
    return this.zzuh.zzcz().zzde();
  }
  
  public final void zza(T paramT, zzns paramzzns)
    throws IOException
  {
    Iterator localIterator = this.zzus.zzb(paramT).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      zzkd localzzkd = (zzkd)((Map.Entry)localObject).getKey();
      if ((localzzkd.zzcr() == zznr.zzxx) && (!localzzkd.zzcs()) && (!localzzkd.zzct()))
      {
        if ((localObject instanceof zzkv)) {
          paramzzns.zza(localzzkd.zzcp(), ((zzkv)localObject).zzdq().zzbl());
        } else {
          paramzzns.zza(localzzkd.zzcp(), ((Map.Entry)localObject).getValue());
        }
      }
      else {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = this.zzur;
    ((zzmx)localObject).zzc(((zzmx)localObject).zzr(paramT), paramzzns);
  }
  
  public final void zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zziz paramzziz)
    throws IOException
  {
    zzkk localzzkk = (zzkk)paramT;
    Object localObject2 = localzzkk.zzrq;
    Object localObject1 = localObject2;
    if (localObject2 == zzmy.zzfa())
    {
      localObject1 = zzmy.zzfb();
      localzzkk.zzrq = ((zzmy)localObject1);
    }
    ((zzkk.zzc)paramT).zzdg();
    paramT = null;
    while (paramInt1 < paramInt2)
    {
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      int i = paramzziz.zznk;
      if (i != 11)
      {
        if ((i & 0x7) == 2)
        {
          paramT = (zzkk.zzd)this.zzus.zza(paramzziz.zznn, this.zzuh, i >>> 3);
          if (paramT == null)
          {
            paramInt1 = zziy.zza(i, paramArrayOfByte, paramInt1, paramInt2, (zzmy)localObject1, paramzziz);
          }
          else
          {
            zzmd.zzej();
            throw new NoSuchMethodError();
          }
        }
        else
        {
          paramInt1 = zziy.zza(i, paramArrayOfByte, paramInt1, paramInt2, paramzziz);
        }
      }
      else
      {
        int j = 0;
        localObject2 = null;
        for (;;)
        {
          i = paramInt1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
          int k = paramzziz.zznk;
          int m = k >>> 3;
          i = k & 0x7;
          if (m != 2)
          {
            if (m == 3) {
              if (paramT == null)
              {
                if (i == 2)
                {
                  paramInt1 = zziy.zze(paramArrayOfByte, paramInt1, paramzziz);
                  localObject2 = (zzjc)paramzziz.zznm;
                }
              }
              else
              {
                zzmd.zzej();
                throw new NoSuchMethodError();
              }
            }
          }
          else if (i == 0)
          {
            paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
            j = paramzziz.zznk;
            paramT = (zzkk.zzd)this.zzus.zza(paramzziz.zznn, this.zzuh, j);
            continue;
          }
          i = paramInt1;
          if (k == 12) {
            break;
          }
          paramInt1 = zziy.zza(k, paramArrayOfByte, paramInt1, paramInt2, paramzziz);
        }
        if (localObject2 != null) {
          ((zzmy)localObject1).zzb(j << 3 | 0x2, localObject2);
        }
        paramInt1 = i;
      }
    }
    if (paramInt1 == paramInt2) {
      return;
    }
    throw zzkq.zzdm();
  }
  
  public final void zzc(T paramT1, T paramT2)
  {
    zzmh.zza(this.zzur, paramT1, paramT2);
    if (this.zzui) {
      zzmh.zza(this.zzus, paramT1, paramT2);
    }
  }
  
  public final void zzd(T paramT)
  {
    this.zzur.zzd(paramT);
    this.zzus.zzd(paramT);
  }
  
  public final int zzn(T paramT)
  {
    zzmx localzzmx = this.zzur;
    int j = localzzmx.zzs(localzzmx.zzr(paramT)) + 0;
    int i = j;
    if (this.zzui) {
      i = j + this.zzus.zzb(paramT).zzco();
    }
    return i;
  }
  
  public final boolean zzp(T paramT)
  {
    return this.zzus.zzb(paramT).isInitialized();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */