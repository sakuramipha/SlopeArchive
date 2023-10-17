package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

final class zzub
  implements zztj, zzti
{
  private final zztj[] zza;
  private final IdentityHashMap zzb;
  private final ArrayList zzc;
  private final HashMap zzd;
  private zzti zze;
  private zzvk zzf;
  private zztj[] zzg;
  private zzve zzh;
  private final zzsw zzi;
  
  public zzub(zzsw paramzzsw, long[] paramArrayOfLong, zztj... paramVarArgs)
  {
    this.zzi = paramzzsw;
    this.zza = paramVarArgs;
    this.zzc = new ArrayList();
    this.zzd = new HashMap();
    int i = 0;
    this.zzh = new zzsv(new zzve[0]);
    this.zzb = new IdentityHashMap();
    this.zzg = new zztj[0];
    while (i < paramVarArgs.length)
    {
      long l = paramArrayOfLong[i];
      if (l != 0L) {
        this.zza[i] = new zztz(paramVarArgs[i], l);
      }
      i++;
    }
  }
  
  public final long zza(long paramLong, zzlh paramzzlh)
  {
    Object localObject = this.zzg;
    if (localObject.length > 0) {
      localObject = localObject[0];
    } else {
      localObject = this.zza[0];
    }
    return ((zztj)localObject).zza(paramLong, paramzzlh);
  }
  
  public final long zzb()
  {
    return this.zzh.zzb();
  }
  
  public final long zzc()
  {
    return this.zzh.zzc();
  }
  
  public final long zzd()
  {
    zztj[] arrayOfzztj1 = this.zzg;
    int k = arrayOfzztj1.length;
    long l1 = -9223372036854775807L;
    int i = 0;
    while (i < k)
    {
      zztj localzztj1 = arrayOfzztj1[i];
      long l2 = localzztj1.zzd();
      if (l2 != -9223372036854775807L)
      {
        if (l1 == -9223372036854775807L)
        {
          zztj[] arrayOfzztj2 = this.zzg;
          int m = arrayOfzztj2.length;
          int j = 0;
          while (j < m)
          {
            zztj localzztj2 = arrayOfzztj2[j];
            if (localzztj2 != localzztj1) {
              if (localzztj2.zze(l2) == l2) {
                j++;
              } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
              }
            }
          }
        }
        else if (l2 == l1)
        {
          l2 = l1;
        }
        else
        {
          throw new IllegalStateException("Conflicting discontinuities.");
        }
      }
      else
      {
        l2 = l1;
        if (l1 != -9223372036854775807L) {
          if (localzztj1.zze(l1) == l1) {
            l2 = l1;
          } else {
            throw new IllegalStateException("Unexpected child seekToUs result.");
          }
        }
      }
      i++;
      l1 = l2;
    }
    return l1;
  }
  
  public final long zze(long paramLong)
  {
    paramLong = this.zzg[0].zze(paramLong);
    for (int i = 1;; i++)
    {
      zztj[] arrayOfzztj = this.zzg;
      if (i >= arrayOfzztj.length) {
        return paramLong;
      }
      if (arrayOfzztj[i].zze(paramLong) != paramLong) {
        break;
      }
    }
    throw new IllegalStateException("Unexpected child seekToUs result.");
    return paramLong;
  }
  
  public final long zzf(zzwx[] paramArrayOfzzwx, boolean[] paramArrayOfBoolean1, zzvc[] paramArrayOfzzvc, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int i = paramArrayOfzzwx.length;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    int n;
    int j;
    for (i = 0;; i++)
    {
      n = paramArrayOfzzwx.length;
      localObject1 = null;
      if (i >= n) {
        break;
      }
      localObject2 = paramArrayOfzzvc[i];
      if (localObject2 != null) {
        localObject1 = (Integer)this.zzb.get(localObject2);
      }
      if (localObject1 == null) {
        j = -1;
      } else {
        j = ((Integer)localObject1).intValue();
      }
      arrayOfInt1[i] = j;
      localObject1 = paramArrayOfzzwx[i];
      if (localObject1 != null)
      {
        localObject1 = ((zzwx)localObject1).zze().zzc;
        arrayOfInt2[i] = Integer.parseInt(((String)localObject1).substring(0, ((String)localObject1).indexOf(":")));
      }
      else
      {
        arrayOfInt2[i] = -1;
      }
    }
    this.zzb.clear();
    zzvc[] arrayOfzzvc = new zzvc[n];
    Object localObject2 = new zzvc[n];
    Object localObject1 = new zzwx[n];
    ArrayList localArrayList = new ArrayList(this.zza.length);
    i = 0;
    while (i < this.zza.length)
    {
      Object localObject3;
      for (j = 0; j < paramArrayOfzzwx.length; j++)
      {
        if (arrayOfInt1[j] == i) {
          localObject3 = paramArrayOfzzvc[j];
        } else {
          localObject3 = null;
        }
        localObject2[j] = localObject3;
        if (arrayOfInt2[j] == i)
        {
          localObject3 = paramArrayOfzzwx[j];
          Objects.requireNonNull(localObject3);
          zzcz localzzcz = ((zzwx)localObject3).zze();
          localzzcz = (zzcz)this.zzd.get(localzzcz);
          Objects.requireNonNull(localzzcz);
          localObject1[j] = new zzty((zzwx)localObject3, localzzcz);
        }
        else
        {
          localObject1[j] = null;
        }
      }
      long l = this.zza[i].zzf((zzwx[])localObject1, paramArrayOfBoolean1, (zzvc[])localObject2, paramArrayOfBoolean2, paramLong);
      if (i == 0) {
        paramLong = l;
      } else {
        if (l != paramLong) {
          break label506;
        }
      }
      int k = 0;
      int m;
      for (j = 0; k < paramArrayOfzzwx.length; j = m)
      {
        m = arrayOfInt2[k];
        boolean bool = true;
        if (m == i)
        {
          localObject3 = localObject2[k];
          Objects.requireNonNull(localObject3);
          arrayOfzzvc[k] = localObject3;
          this.zzb.put(localObject3, Integer.valueOf(i));
          m = 1;
        }
        else
        {
          m = j;
          if (arrayOfInt1[k] == i)
          {
            if (localObject2[k] != null) {
              bool = false;
            }
            zzdy.zzf(bool);
            m = j;
          }
        }
        k++;
      }
      if (j != 0) {
        localArrayList.add(this.zza[i]);
      }
      i++;
      continue;
      label506:
      throw new IllegalStateException("Children enabled at different positions.");
    }
    System.arraycopy(arrayOfzzvc, 0, paramArrayOfzzvc, 0, n);
    paramArrayOfzzwx = (zztj[])localArrayList.toArray(new zztj[0]);
    this.zzg = paramArrayOfzzwx;
    this.zzh = new zzsv(paramArrayOfzzwx);
    return paramLong;
  }
  
  public final zzvk zzh()
  {
    zzvk localzzvk = this.zzf;
    Objects.requireNonNull(localzzvk);
    return localzzvk;
  }
  
  public final void zzi(zztj paramzztj)
  {
    this.zzc.remove(paramzztj);
    if (!this.zzc.isEmpty()) {
      return;
    }
    paramzztj = this.zza;
    int k = paramzztj.length;
    int j = 0;
    int i = 0;
    while (j < k)
    {
      i += paramzztj[j].zzh().zzc;
      j++;
    }
    paramzztj = new zzcz[i];
    i = 0;
    j = 0;
    for (;;)
    {
      Object localObject1 = this.zza;
      if (i >= localObject1.length) {
        break;
      }
      localObject1 = localObject1[i].zzh();
      int m = ((zzvk)localObject1).zzc;
      k = 0;
      while (k < m)
      {
        zzcz localzzcz = ((zzvk)localObject1).zzb(k);
        String str = localzzcz.zzc;
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(i);
        ((StringBuilder)localObject2).append(":");
        ((StringBuilder)localObject2).append(str);
        localObject2 = localzzcz.zzc(((StringBuilder)localObject2).toString());
        this.zzd.put(localObject2, localzzcz);
        paramzztj[j] = localObject2;
        k++;
        j++;
      }
      i++;
    }
    this.zzf = new zzvk(paramzztj);
    paramzztj = this.zze;
    Objects.requireNonNull(paramzztj);
    paramzztj.zzi(this);
  }
  
  public final void zzj(long paramLong, boolean paramBoolean)
  {
    zztj[] arrayOfzztj = this.zzg;
    int j = arrayOfzztj.length;
    for (int i = 0; i < j; i++) {
      arrayOfzztj[i].zzj(paramLong, false);
    }
  }
  
  public final void zzk()
    throws IOException
  {
    zztj[] arrayOfzztj = this.zza;
    int j = arrayOfzztj.length;
    for (int i = 0; i < j; i++) {
      arrayOfzztj[i].zzk();
    }
  }
  
  public final void zzl(zzti paramzzti, long paramLong)
  {
    this.zze = paramzzti;
    Collections.addAll(this.zzc, this.zza);
    paramzzti = this.zza;
    int j = paramzzti.length;
    for (int i = 0; i < j; i++) {
      paramzzti[i].zzl(this, paramLong);
    }
  }
  
  public final void zzm(long paramLong)
  {
    this.zzh.zzm(paramLong);
  }
  
  public final zztj zzn(int paramInt)
  {
    zztj localzztj2 = this.zza[paramInt];
    zztj localzztj1 = localzztj2;
    if ((localzztj2 instanceof zztz)) {
      localzztj1 = zztz.zzn((zztz)localzztj2);
    }
    return localzztj1;
  }
  
  public final boolean zzo(long paramLong)
  {
    if (!this.zzc.isEmpty())
    {
      int j = this.zzc.size();
      for (int i = 0; i < j; i++) {
        ((zztj)this.zzc.get(i)).zzo(paramLong);
      }
      return false;
    }
    return this.zzh.zzo(paramLong);
  }
  
  public final boolean zzp()
  {
    return this.zzh.zzp();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */