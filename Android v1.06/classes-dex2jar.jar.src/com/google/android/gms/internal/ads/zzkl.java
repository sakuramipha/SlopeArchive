package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

final class zzkl
{
  private final zzcu zza;
  private final zzcw zzb;
  private final zzls zzc;
  private final zzei zzd;
  private long zze;
  private int zzf;
  private boolean zzg;
  private zzki zzh;
  private zzki zzi;
  private zzki zzj;
  private int zzk;
  private Object zzl;
  private long zzm;
  
  public zzkl(zzls paramzzls, zzei paramzzei)
  {
    this.zzc = paramzzls;
    this.zzd = paramzzei;
    this.zza = new zzcu();
    this.zzb = new zzcw();
  }
  
  private final boolean zzA(zzcx paramzzcx, zztl paramzztl)
  {
    if (!zzC(paramzztl)) {
      return false;
    }
    int j = paramzzcx.zzn(paramzztl.zza, this.zza).zzd;
    int i = paramzzcx.zza(paramzztl.zza);
    return paramzzcx.zze(j, this.zzb, 0L).zzp == i;
  }
  
  private final boolean zzB(zzcx paramzzcx)
  {
    Object localObject = this.zzh;
    if (localObject == null) {
      return true;
    }
    int i = paramzzcx.zza(((zzki)localObject).zzb);
    for (;;)
    {
      i = paramzzcx.zzi(i, this.zza, this.zzb, this.zzf, this.zzg);
      while ((((zzki)localObject).zzg() != null) && (!((zzki)localObject).zzf.zzg)) {
        localObject = ((zzki)localObject).zzg();
      }
      zzki localzzki = ((zzki)localObject).zzg();
      if ((i == -1) || (localzzki == null) || (paramzzcx.zza(localzzki.zzb) != i)) {
        break;
      }
      localObject = localzzki;
    }
    boolean bool = zzm((zzki)localObject);
    ((zzki)localObject).zzf = zzg(paramzzcx, ((zzki)localObject).zzf);
    return !bool;
  }
  
  private static final boolean zzC(zztl paramzztl)
  {
    return (!paramzztl.zzb()) && (paramzztl.zze == -1);
  }
  
  private final long zzs(zzcx paramzzcx, Object paramObject, int paramInt)
  {
    paramzzcx.zzn(paramObject, this.zza);
    this.zza.zzi(paramInt);
    this.zza.zzk(paramInt);
    return 0L;
  }
  
  private final zzkj zzt(zzcx paramzzcx, zzki paramzzki, long paramLong)
  {
    zzkj localzzkj = paramzzki.zzf;
    long l1 = paramzzki.zze();
    long l2 = localzzkj.zze;
    boolean bool = localzzkj.zzg;
    long l3 = l1 + l2 - paramLong;
    Object localObject2;
    Object localObject1;
    int j;
    if (bool)
    {
      i = paramzzcx.zza(localzzkj.zza.zza);
      localObject2 = this.zza;
      localObject1 = this.zzb;
      j = this.zzf;
      bool = this.zzg;
      l2 = 0L;
      j = paramzzcx.zzi(i, (zzcu)localObject2, (zzcw)localObject1, j, bool);
      if (j != -1) {}
    }
    label284:
    do
    {
      do
      {
        do
        {
          return null;
          i = paramzzcx.zzd(j, this.zza, true).zzd;
          localObject1 = this.zza.zzc;
          Objects.requireNonNull(localObject1);
          paramLong = localzzkj.zza.zzd;
          if (paramzzcx.zze(i, this.zzb, 0L).zzo != j) {
            break;
          }
          localObject2 = paramzzcx.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, l3));
        } while (localObject2 == null);
        localObject1 = ((Pair)localObject2).first;
        l1 = ((Long)((Pair)localObject2).second).longValue();
        paramzzki = paramzzki.zzg();
        if ((paramzzki != null) && (paramzzki.zzb.equals(localObject1)))
        {
          paramLong = paramzzki.zzf.zza.zzd;
        }
        else
        {
          paramLong = this.zze;
          this.zze = (1L + paramLong);
        }
        l2 = -9223372036854775807L;
        paramzzki = (zzki)localObject1;
        break label284;
        l1 = 0L;
        paramzzki = (zzki)localObject1;
        paramzzki = zzx(paramzzcx, paramzzki, l1, paramLong, this.zzb, this.zza);
        if ((l2 != -9223372036854775807L) && (localzzkj.zzc != -9223372036854775807L))
        {
          paramzzcx.zzn(localzzkj.zza.zza, this.zza).zzb();
          this.zza.zzg();
        }
        return zzu(paramzzcx, paramzzki, l2, l1);
        paramzzki = localzzkj.zza;
        paramzzcx.zzn(paramzzki.zza, this.zza);
        if (!paramzzki.zzb()) {
          break;
        }
        i = paramzzki.zzb;
      } while (this.zza.zza(i) == -1);
      j = this.zza.zzf(i, paramzzki.zzc);
      if (j < 0) {
        return zzv(paramzzcx, paramzzki.zza, i, j, localzzkj.zzc, paramzzki.zzd);
      }
      l1 = localzzkj.zzc;
      paramLong = l1;
      if (l1 != -9223372036854775807L) {
        break;
      }
      localObject1 = this.zzb;
      localObject2 = this.zza;
      localObject1 = paramzzcx.zzm((zzcw)localObject1, (zzcu)localObject2, ((zzcu)localObject2).zzd, -9223372036854775807L, Math.max(0L, l3));
    } while (localObject1 == null);
    paramLong = ((Long)((Pair)localObject1).second).longValue();
    zzs(paramzzcx, paramzzki.zza, paramzzki.zzb);
    return zzw(paramzzcx, paramzzki.zza, Math.max(0L, paramLong), localzzkj.zzc, paramzzki.zzd);
    int i = paramzzki.zze;
    if (i != -1) {
      this.zza.zzm(i);
    }
    i = this.zza.zze(paramzzki.zze);
    this.zza.zzn(paramzzki.zze);
    if (i != this.zza.zza(paramzzki.zze))
    {
      paramzzcx = zzv(paramzzcx, paramzzki.zza, paramzzki.zze, i, localzzkj.zze, paramzzki.zzd);
    }
    else
    {
      zzs(paramzzcx, paramzzki.zza, paramzzki.zze);
      paramzzcx = zzw(paramzzcx, paramzzki.zza, 0L, localzzkj.zze, paramzzki.zzd);
    }
    return paramzzcx;
  }
  
  private final zzkj zzu(zzcx paramzzcx, zztl paramzztl, long paramLong1, long paramLong2)
  {
    paramzzcx.zzn(paramzztl.zza, this.zza);
    if (paramzztl.zzb()) {
      return zzv(paramzzcx, paramzztl.zza, paramzztl.zzb, paramzztl.zzc, paramLong1, paramzztl.zzd);
    }
    return zzw(paramzzcx, paramzztl.zza, paramLong2, paramLong1, paramzztl.zzd);
  }
  
  private final zzkj zzv(zzcx paramzzcx, Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    paramObject = new zztl(paramObject, paramInt1, paramInt2, paramLong2);
    long l2 = paramzzcx.zzn(((zztl)paramObject).zza, this.zza).zzh(((zztl)paramObject).zzb, ((zztl)paramObject).zzc);
    if (paramInt2 == this.zza.zze(paramInt1)) {
      this.zza.zzj();
    }
    this.zza.zzn(((zztl)paramObject).zzb);
    long l1 = 0L;
    paramLong2 = l1;
    if (l2 != -9223372036854775807L)
    {
      paramLong2 = l1;
      if (l2 <= 0L) {
        paramLong2 = Math.max(0L, -1L + l2);
      }
    }
    return new zzkj((zztl)paramObject, paramLong2, paramLong1, -9223372036854775807L, l2, false, false, false, false);
  }
  
  private final zzkj zzw(zzcx paramzzcx, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong1;
    paramzzcx.zzn(paramObject, this.zza);
    int i = this.zza.zzc(l1);
    if (i != -1) {
      this.zza.zzm(i);
    }
    if (i == -1) {
      this.zza.zzb();
    } else {
      this.zza.zzn(i);
    }
    paramObject = new zztl(paramObject, paramLong3, i);
    boolean bool3 = zzC((zztl)paramObject);
    boolean bool1 = zzA(paramzzcx, (zztl)paramObject);
    boolean bool2 = zzz(paramzzcx, (zztl)paramObject, bool3);
    if (i != -1) {
      this.zza.zzn(i);
    }
    if (i != -1)
    {
      this.zza.zzi(i);
      paramLong1 = 0L;
    }
    else
    {
      paramLong1 = -9223372036854775807L;
    }
    if (paramLong1 != -9223372036854775807L)
    {
      paramLong3 = 0L;
      paramLong1 = 0L;
    }
    else
    {
      l2 = this.zza.zze;
      paramLong3 = paramLong1;
      paramLong1 = l2;
    }
    long l2 = l1;
    if (paramLong1 != -9223372036854775807L)
    {
      l2 = l1;
      if (l1 >= paramLong1) {
        l2 = Math.max(0L, paramLong1 - 1L);
      }
    }
    return new zzkj((zztl)paramObject, l2, paramLong2, paramLong3, paramLong1, false, bool3, bool1, bool2);
  }
  
  private static zztl zzx(zzcx paramzzcx, Object paramObject, long paramLong1, long paramLong2, zzcw paramzzcw, zzcu paramzzcu)
  {
    paramzzcx.zzn(paramObject, paramzzcu);
    paramzzcx.zze(paramzzcu.zzd, paramzzcw, 0L);
    paramzzcx.zza(paramObject);
    paramzzcu.zzb();
    paramzzcx.zzn(paramObject, paramzzcu);
    int i = paramzzcu.zzd(paramLong1);
    if (i == -1) {
      return new zztl(paramObject, paramLong2, paramzzcu.zzc(paramLong1));
    }
    return new zztl(paramObject, i, paramzzcu.zze(i), paramLong2);
  }
  
  private final void zzy()
  {
    zzfro localzzfro = new zzfro();
    for (Object localObject = this.zzh; localObject != null; localObject = ((zzki)localObject).zzg()) {
      localzzfro.zzf(((zzki)localObject).zzf.zza);
    }
    localObject = this.zzi;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((zzki)localObject).zzf.zza;
    }
    this.zzd.zzh(new zzkk(this, localzzfro, (zztl)localObject));
  }
  
  private final boolean zzz(zzcx paramzzcx, zztl paramzztl, boolean paramBoolean)
  {
    int i = paramzzcx.zza(paramzztl.zza);
    return (!paramzzcx.zze(paramzzcx.zzd(i, this.zza, false).zzd, this.zzb, 0L).zzi) && (paramzzcx.zzi(i, this.zza, this.zzb, this.zzf, this.zzg) == -1) && (paramBoolean);
  }
  
  public final zzki zza()
  {
    zzki localzzki = this.zzh;
    if (localzzki == null) {
      return null;
    }
    if (localzzki == this.zzi) {
      this.zzi = localzzki.zzg();
    }
    localzzki.zzn();
    int i = this.zzk - 1;
    this.zzk = i;
    if (i == 0)
    {
      this.zzj = null;
      localzzki = this.zzh;
      this.zzl = localzzki.zzb;
      this.zzm = localzzki.zzf.zza.zzd;
    }
    this.zzh = this.zzh.zzg();
    zzy();
    return this.zzh;
  }
  
  public final zzki zzb()
  {
    zzki localzzki = this.zzi;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (localzzki != null)
    {
      bool1 = bool2;
      if (localzzki.zzg() != null) {
        bool1 = true;
      }
    }
    zzdy.zzf(bool1);
    this.zzi = this.zzi.zzg();
    zzy();
    return this.zzi;
  }
  
  public final zzki zzc()
  {
    return this.zzj;
  }
  
  public final zzki zzd()
  {
    return this.zzh;
  }
  
  public final zzki zze()
  {
    return this.zzi;
  }
  
  public final zzkj zzf(long paramLong, zzky paramzzky)
  {
    zzki localzzki = this.zzj;
    if (localzzki == null) {
      paramzzky = zzu(paramzzky.zza, paramzzky.zzb, paramzzky.zzc, paramzzky.zzr);
    } else {
      paramzzky = zzt(paramzzky.zza, localzzki, paramLong);
    }
    return paramzzky;
  }
  
  public final zzkj zzg(zzcx paramzzcx, zzkj paramzzkj)
  {
    zztl localzztl = paramzzkj.zza;
    boolean bool2 = zzC(localzztl);
    boolean bool1 = zzA(paramzzcx, localzztl);
    boolean bool3 = zzz(paramzzcx, localzztl, bool2);
    paramzzcx.zzn(paramzzkj.zza.zza, this.zza);
    int i;
    if (!localzztl.zzb())
    {
      i = localzztl.zze;
      if (i != -1)
      {
        this.zza.zzi(i);
        l1 = 0L;
        break label91;
      }
    }
    long l1 = -9223372036854775807L;
    label91:
    if (localzztl.zzb()) {}
    for (long l2 = this.zza.zzh(localzztl.zzb, localzztl.zzc);; l2 = this.zza.zze)
    {
      break;
      if (l1 != -9223372036854775807L)
      {
        l1 = 0L;
        l2 = 0L;
        break;
      }
    }
    if (localzztl.zzb())
    {
      this.zza.zzn(localzztl.zzb);
    }
    else
    {
      i = localzztl.zze;
      if (i != -1) {
        this.zza.zzn(i);
      }
    }
    return new zzkj(localzztl, paramzzkj.zzb, paramzzkj.zzc, l1, l2, false, bool2, bool1, bool3);
  }
  
  public final zztl zzh(zzcx paramzzcx, Object paramObject, long paramLong)
  {
    int i = paramzzcx.zzn(paramObject, this.zza).zzd;
    Object localObject = this.zzl;
    int j;
    long l1;
    if (localObject != null)
    {
      j = paramzzcx.zza(localObject);
      if ((j != -1) && (paramzzcx.zzd(j, this.zza, false).zzd == i)) {
        l1 = this.zzm;
      }
    }
    for (;;)
    {
      break;
      for (localObject = this.zzh;; localObject = ((zzki)localObject).zzg())
      {
        if (localObject == null) {
          break label116;
        }
        if (((zzki)localObject).zzb.equals(paramObject))
        {
          l1 = ((zzki)localObject).zzf.zza.zzd;
          break;
        }
      }
      label116:
      for (localObject = this.zzh;; localObject = ((zzki)localObject).zzg())
      {
        if (localObject == null) {
          break label189;
        }
        j = paramzzcx.zza(((zzki)localObject).zzb);
        if ((j != -1) && (paramzzcx.zzd(j, this.zza, false).zzd == i))
        {
          l1 = ((zzki)localObject).zzf.zza.zzd;
          break;
        }
      }
      label189:
      long l2 = this.zze;
      this.zze = (1L + l2);
      l1 = l2;
      if (this.zzh == null)
      {
        this.zzl = paramObject;
        this.zzm = l2;
        l1 = l2;
      }
    }
    paramzzcx.zzn(paramObject, this.zza);
    paramzzcx.zze(this.zza.zzd, this.zzb, 0L);
    for (i = paramzzcx.zza(paramObject);; i--)
    {
      localObject = this.zzb;
      if (i < ((zzcw)localObject).zzo) {
        break;
      }
      paramzzcx.zzd(i, this.zza, true);
      this.zza.zzb();
      localObject = this.zza;
      if (((zzcu)localObject).zzd(((zzcu)localObject).zze) != -1)
      {
        paramObject = this.zza.zzc;
        Objects.requireNonNull(paramObject);
      }
    }
    return zzx(paramzzcx, paramObject, paramLong, l1, (zzcw)localObject, this.zza);
  }
  
  public final void zzi()
  {
    if (this.zzk == 0) {
      return;
    }
    zzki localzzki = this.zzh;
    zzdy.zzb(localzzki);
    this.zzl = localzzki.zzb;
    this.zzm = localzzki.zzf.zza.zzd;
    while (localzzki != null)
    {
      localzzki.zzn();
      localzzki = localzzki.zzg();
    }
    this.zzh = null;
    this.zzj = null;
    this.zzi = null;
    this.zzk = 0;
    zzy();
  }
  
  public final void zzk(long paramLong)
  {
    zzki localzzki = this.zzj;
    if (localzzki != null) {
      localzzki.zzm(paramLong);
    }
  }
  
  public final boolean zzl(zztj paramzztj)
  {
    zzki localzzki = this.zzj;
    return (localzzki != null) && (localzzki.zza == paramzztj);
  }
  
  public final boolean zzm(zzki paramzzki)
  {
    boolean bool2 = false;
    if (paramzzki != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzf(bool1);
    if (paramzzki.equals(this.zzj)) {
      return false;
    }
    this.zzj = paramzzki;
    boolean bool1 = bool2;
    while (paramzzki.zzg() != null)
    {
      paramzzki = paramzzki.zzg();
      if (paramzzki == this.zzi)
      {
        this.zzi = this.zzh;
        bool1 = true;
      }
      paramzzki.zzn();
      this.zzk -= 1;
    }
    this.zzj.zzo(null);
    zzy();
    return bool1;
  }
  
  public final boolean zzn()
  {
    zzki localzzki = this.zzj;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (localzzki != null) {
      if ((!localzzki.zzf.zzi) && (localzzki.zzr()) && (this.zzj.zzf.zze != -9223372036854775807L))
      {
        if (this.zzk < 100) {
          bool1 = bool2;
        } else {
          return false;
        }
      }
      else {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public final boolean zzo(zzcx paramzzcx, long paramLong1, long paramLong2)
  {
    Object localObject1 = this.zzh;
    Object localObject2 = null;
    while (localObject1 != null)
    {
      zzkj localzzkj = ((zzki)localObject1).zzf;
      if (localObject2 == null)
      {
        localObject2 = zzg(paramzzcx, localzzkj);
      }
      else
      {
        localObject3 = zzt(paramzzcx, (zzki)localObject2, paramLong1);
        if (localObject3 == null) {
          return !zzm((zzki)localObject2);
        }
        if ((localzzkj.zzb != ((zzkj)localObject3).zzb) || (!localzzkj.zza.equals(((zzkj)localObject3).zza))) {
          break label263;
        }
        localObject2 = localObject3;
      }
      ((zzki)localObject1).zzf = ((zzkj)localObject2).zza(localzzkj.zzc);
      long l2 = localzzkj.zze;
      long l1 = ((zzkj)localObject2).zze;
      if ((l2 != -9223372036854775807L) && (l2 != l1))
      {
        ((zzki)localObject1).zzq();
        paramLong1 = ((zzkj)localObject2).zze;
        if (paramLong1 == -9223372036854775807L) {
          paramLong1 = Long.MAX_VALUE;
        } else {
          paramLong1 += ((zzki)localObject1).zze();
        }
        if (localObject1 == this.zzi)
        {
          boolean bool = ((zzki)localObject1).zzf.zzf;
          if ((paramLong2 == Long.MIN_VALUE) || (paramLong2 >= paramLong1))
          {
            i = 1;
            break label227;
          }
        }
        int i = 0;
        label227:
        return (!zzm((zzki)localObject1)) && (i == 0);
      }
      Object localObject3 = ((zzki)localObject1).zzg();
      localObject2 = localObject1;
      localObject1 = localObject3;
      continue;
      label263:
      return !zzm((zzki)localObject2);
    }
    return true;
  }
  
  public final boolean zzp(zzcx paramzzcx, int paramInt)
  {
    this.zzf = paramInt;
    return zzB(paramzzcx);
  }
  
  public final boolean zzq(zzcx paramzzcx, boolean paramBoolean)
  {
    this.zzg = paramBoolean;
    return zzB(paramzzcx);
  }
  
  public final zzki zzr(zzlf[] paramArrayOfzzlf, zzxd paramzzxd, zzxm paramzzxm, zzkx paramzzkx, zzkj paramzzkj, zzxe paramzzxe)
  {
    zzki localzzki = this.zzj;
    long l;
    if (localzzki == null) {
      l = 1000000000000L;
    } else {
      l = localzzki.zze() + localzzki.zzf.zze - paramzzkj.zzb;
    }
    paramzzxd = new zzki(paramArrayOfzzlf, l, paramzzxd, paramzzxm, paramzzkx, paramzzkj, paramzzxe);
    paramArrayOfzzlf = this.zzj;
    if (paramArrayOfzzlf != null)
    {
      paramArrayOfzzlf.zzo(paramzzxd);
    }
    else
    {
      this.zzh = paramzzxd;
      this.zzi = paramzzxd;
    }
    this.zzl = null;
    this.zzj = paramzzxd;
    this.zzk += 1;
    zzy();
    return paramzzxd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzkl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */