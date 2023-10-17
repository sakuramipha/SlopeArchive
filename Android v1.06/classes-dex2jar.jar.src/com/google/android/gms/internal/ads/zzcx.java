package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

public abstract class zzcx
{
  public static final zzcx zza = new zzcs();
  public static final zzn zzb = zzcr.zza;
  private static final String zzc = Integer.toString(0, 36);
  private static final String zzd = Integer.toString(1, 36);
  private static final String zze = Integer.toString(2, 36);
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzcx)) {
      return false;
    }
    zzcx localzzcx = (zzcx)paramObject;
    if ((localzzcx.zzc() == zzc()) && (localzzcx.zzb() == zzb()))
    {
      zzcw localzzcw = new zzcw();
      zzcu localzzcu1 = new zzcu();
      paramObject = new zzcw();
      zzcu localzzcu2 = new zzcu();
      for (int i = 0; i < zzc(); i++) {
        if (!zze(i, localzzcw, 0L).equals(localzzcx.zze(i, (zzcw)paramObject, 0L))) {
          return false;
        }
      }
      for (i = 0; i < zzb(); i++) {
        if (!zzd(i, localzzcu1, true).equals(localzzcx.zzd(i, localzzcu2, true))) {
          return false;
        }
      }
      i = zzg(true);
      if (i != localzzcx.zzg(true)) {
        return false;
      }
      int k = zzh(true);
      if (k == localzzcx.zzh(true))
      {
        while (i != k)
        {
          int j = zzj(i, 0, true);
          if (j == localzzcx.zzj(i, 0, true)) {
            i = j;
          } else {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    zzcw localzzcw = new zzcw();
    zzcu localzzcu = new zzcu();
    int j = zzc() + 217;
    for (int i = 0; i < zzc(); i++) {
      j = j * 31 + zze(i, localzzcw, 0L).hashCode();
    }
    i = j * 31 + zzb();
    for (j = 0; j < zzb(); j++) {
      i = i * 31 + zzd(j, localzzcu, true).hashCode();
    }
    int k;
    for (j = zzg(true); j != -1; j = k)
    {
      k = zzj(j, 0, true);
      i = i * 31 + j;
    }
    return i;
  }
  
  public abstract int zza(Object paramObject);
  
  public abstract int zzb();
  
  public abstract int zzc();
  
  public abstract zzcu zzd(int paramInt, zzcu paramzzcu, boolean paramBoolean);
  
  public abstract zzcw zze(int paramInt, zzcw paramzzcw, long paramLong);
  
  public abstract Object zzf(int paramInt);
  
  public int zzg(boolean paramBoolean)
  {
    if (zzo()) {
      return -1;
    }
    return 0;
  }
  
  public int zzh(boolean paramBoolean)
  {
    if (zzo()) {
      return -1;
    }
    return zzc() - 1;
  }
  
  public final int zzi(int paramInt1, zzcu paramzzcu, zzcw paramzzcw, int paramInt2, boolean paramBoolean)
  {
    int i = zzd(paramInt1, paramzzcu, false).zzd;
    if (zze(i, paramzzcw, 0L).zzp == paramInt1)
    {
      paramInt1 = zzj(i, paramInt2, paramBoolean);
      if (paramInt1 == -1) {
        return -1;
      }
      return zze(paramInt1, paramzzcw, 0L).zzo;
    }
    return paramInt1 + 1;
  }
  
  public int zzj(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          if (paramInt1 == zzh(paramBoolean)) {
            paramInt1 = zzg(paramBoolean);
          } else {
            paramInt1++;
          }
          return paramInt1;
        }
        throw new IllegalStateException();
      }
      return paramInt1;
    }
    if (paramInt1 == zzh(paramBoolean)) {
      return -1;
    }
    return paramInt1 + 1;
  }
  
  public int zzk(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 == zzg(false)) {
      return -1;
    }
    return paramInt1 - 1;
  }
  
  public final Pair zzl(zzcw paramzzcw, zzcu paramzzcu, int paramInt, long paramLong)
  {
    paramzzcw = zzm(paramzzcw, paramzzcu, paramInt, paramLong, 0L);
    Objects.requireNonNull(paramzzcw);
    return paramzzcw;
  }
  
  public final Pair zzm(zzcw paramzzcw, zzcu paramzzcu, int paramInt, long paramLong1, long paramLong2)
  {
    zzdy.zza(paramInt, 0, zzc());
    zze(paramInt, paramzzcw, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L)
    {
      paramLong1 = paramzzcw.zzm;
      paramLong2 = 0L;
    }
    paramInt = paramzzcw.zzo;
    zzd(paramInt, paramzzcu, false);
    while (paramInt < paramzzcw.zzp)
    {
      paramLong1 = paramzzcu.zzf;
      boolean bool = paramLong2 < 0L;
      if (!bool) {
        break;
      }
      int i = paramInt + 1;
      paramLong1 = zzd(i, paramzzcu, false).zzf;
      if (bool) {
        break;
      }
      paramInt = i;
    }
    zzd(paramInt, paramzzcu, true);
    paramLong1 = paramzzcu.zzf;
    long l = paramzzcu.zze;
    paramLong1 = paramLong2;
    if (l != -9223372036854775807L) {
      paramLong1 = Math.min(paramLong2, l - 1L);
    }
    paramLong1 = Math.max(0L, paramLong1);
    paramzzcw = paramzzcu.zzc;
    Objects.requireNonNull(paramzzcw);
    return Pair.create(paramzzcw, Long.valueOf(paramLong1));
  }
  
  public zzcu zzn(Object paramObject, zzcu paramzzcu)
  {
    return zzd(zza(paramObject), paramzzcu, true);
  }
  
  public final boolean zzo()
  {
    return zzc() == 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */