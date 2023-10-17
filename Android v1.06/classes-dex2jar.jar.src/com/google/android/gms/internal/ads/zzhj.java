package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

public abstract class zzhj
  extends zzcx
{
  private final int zzc;
  private final zzvf zzd;
  
  public zzhj(boolean paramBoolean, zzvf paramzzvf)
  {
    this.zzd = paramzzvf;
    this.zzc = paramzzvf.zzc();
  }
  
  private final int zzw(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    if (paramBoolean)
    {
      paramInt = this.zzd.zzd(paramInt);
    }
    else
    {
      if (paramInt < this.zzc - 1) {
        break label32;
      }
      paramInt = i;
    }
    return paramInt;
    label32:
    return paramInt + 1;
  }
  
  private final int zzx(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    if (paramBoolean)
    {
      paramInt = this.zzd.zze(paramInt);
    }
    else
    {
      if (paramInt > 0) {
        break label26;
      }
      paramInt = i;
    }
    return paramInt;
    label26:
    return paramInt - 1;
  }
  
  public final int zza(Object paramObject)
  {
    if ((paramObject instanceof Pair))
    {
      Object localObject = (Pair)paramObject;
      paramObject = ((Pair)localObject).first;
      localObject = ((Pair)localObject).second;
      int i = zzp(paramObject);
      if (i == -1) {
        return -1;
      }
      int j = zzu(i).zza(localObject);
      if (j == -1) {
        return -1;
      }
      return zzs(i) + j;
    }
    return -1;
  }
  
  public final zzcu zzd(int paramInt, zzcu paramzzcu, boolean paramBoolean)
  {
    int i = zzq(paramInt);
    int k = zzt(i);
    int j = zzs(i);
    zzu(i).zzd(paramInt - j, paramzzcu, paramBoolean);
    paramzzcu.zzd += k;
    if (paramBoolean)
    {
      Object localObject1 = zzv(i);
      Object localObject2 = paramzzcu.zzc;
      Objects.requireNonNull(localObject2);
      paramzzcu.zzc = Pair.create(localObject1, localObject2);
    }
    return paramzzcu;
  }
  
  public final zzcw zze(int paramInt, zzcw paramzzcw, long paramLong)
  {
    int i = zzr(paramInt);
    int j = zzt(i);
    int k = zzs(i);
    zzu(i).zze(paramInt - j, paramzzcw, paramLong);
    Object localObject2 = zzv(i);
    Object localObject1 = localObject2;
    if (!zzcw.zza.equals(paramzzcw.zzc)) {
      localObject1 = Pair.create(localObject2, paramzzcw.zzc);
    }
    paramzzcw.zzc = localObject1;
    paramzzcw.zzo += k;
    paramzzcw.zzp += k;
    return paramzzcw;
  }
  
  public final Object zzf(int paramInt)
  {
    int i = zzq(paramInt);
    int j = zzs(i);
    Object localObject = zzu(i).zzf(paramInt - j);
    return Pair.create(zzv(i), localObject);
  }
  
  public final int zzg(boolean paramBoolean)
  {
    if (this.zzc == 0) {
      return -1;
    }
    int i;
    if (paramBoolean) {
      i = this.zzd.zza();
    } else {
      i = 0;
    }
    while (zzu(i).zzo())
    {
      int j = zzw(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    return zzt(i) + zzu(i).zzg(paramBoolean);
  }
  
  public final int zzh(boolean paramBoolean)
  {
    int i = this.zzc;
    if (i == 0) {
      return -1;
    }
    if (paramBoolean) {
      i = this.zzd.zzb();
    } else {
      i--;
    }
    while (zzu(i).zzo())
    {
      int j = zzx(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    return zzt(i) + zzu(i).zzh(paramBoolean);
  }
  
  public final int zzj(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int k = zzr(paramInt1);
    int j = zzt(k);
    zzcx localzzcx = zzu(k);
    int i;
    if (paramInt2 == 2) {
      i = 0;
    } else {
      i = paramInt2;
    }
    paramInt1 = localzzcx.zzj(paramInt1 - j, i, paramBoolean);
    if (paramInt1 != -1) {
      return j + paramInt1;
    }
    for (paramInt1 = zzw(k, paramBoolean); (paramInt1 != -1) && (zzu(paramInt1).zzo()); paramInt1 = zzw(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1) {
      return zzt(paramInt1) + zzu(paramInt1).zzg(paramBoolean);
    }
    if (paramInt2 == 2) {
      return zzg(paramBoolean);
    }
    return -1;
  }
  
  public final int zzk(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = zzr(paramInt1);
    paramInt2 = zzt(i);
    paramInt1 = zzu(i).zzk(paramInt1 - paramInt2, 0, false);
    if (paramInt1 != -1) {
      return paramInt2 + paramInt1;
    }
    for (paramInt1 = zzx(i, false); (paramInt1 != -1) && (zzu(paramInt1).zzo()); paramInt1 = zzx(paramInt1, false)) {}
    if (paramInt1 != -1) {
      return zzt(paramInt1) + zzu(paramInt1).zzh(false);
    }
    return -1;
  }
  
  public final zzcu zzn(Object paramObject, zzcu paramzzcu)
  {
    Object localObject2 = (Pair)paramObject;
    Object localObject1 = ((Pair)localObject2).first;
    localObject2 = ((Pair)localObject2).second;
    int j = zzp(localObject1);
    int i = zzt(j);
    zzu(j).zzn(localObject2, paramzzcu);
    paramzzcu.zzd += i;
    paramzzcu.zzc = paramObject;
    return paramzzcu;
  }
  
  protected abstract int zzp(Object paramObject);
  
  protected abstract int zzq(int paramInt);
  
  protected abstract int zzr(int paramInt);
  
  protected abstract int zzs(int paramInt);
  
  protected abstract int zzt(int paramInt);
  
  protected abstract zzcx zzu(int paramInt);
  
  protected abstract Object zzv(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */