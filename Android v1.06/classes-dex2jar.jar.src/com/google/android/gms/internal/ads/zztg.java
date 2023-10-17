package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zztg
  extends zzvm
{
  private final boolean zzb;
  private final zzcw zzc;
  private final zzcu zzd;
  private zzte zze;
  private zztd zzf;
  private boolean zzg;
  private boolean zzh;
  private boolean zzi;
  
  public zztg(zztn paramzztn, boolean paramBoolean)
  {
    super(paramzztn);
    if (paramBoolean)
    {
      paramzztn.zzu();
      paramBoolean = true;
    }
    else
    {
      paramBoolean = false;
    }
    this.zzb = paramBoolean;
    this.zzc = new zzcw();
    this.zzd = new zzcu();
    paramzztn.zzL();
    this.zze = zzte.zzq(paramzztn.zzI());
  }
  
  private final Object zzJ(Object paramObject)
  {
    Object localObject = paramObject;
    if (zzte.zzs(this.zze) != null)
    {
      localObject = paramObject;
      if (paramObject.equals(zzte.zzd)) {
        localObject = zzte.zzs(this.zze);
      }
    }
    return localObject;
  }
  
  @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
  private final void zzK(long paramLong)
  {
    zztd localzztd = this.zzf;
    int i = this.zze.zza(localzztd.zza.zza);
    if (i == -1) {
      return;
    }
    zzte localzzte = this.zze;
    zzcu localzzcu = this.zzd;
    localzzte.zzd(i, localzzcu, false);
    long l2 = localzzcu.zze;
    long l1 = paramLong;
    if (l2 != -9223372036854775807L)
    {
      l1 = paramLong;
      if (paramLong >= l2) {
        l1 = Math.max(0L, l2 - 1L);
      }
    }
    localzztd.zzs(l1);
  }
  
  public final zzcx zzB()
  {
    return this.zze;
  }
  
  protected final zztl zzC(zztl paramzztl)
  {
    Object localObject2 = paramzztl.zza;
    Object localObject1 = localObject2;
    if (zzte.zzs(this.zze) != null)
    {
      localObject1 = localObject2;
      if (zzte.zzs(this.zze).equals(localObject2)) {
        localObject1 = zzte.zzd;
      }
    }
    return paramzztl.zzc(localObject1);
  }
  
  protected final void zzD(zzcx paramzzcx)
  {
    boolean bool = this.zzh;
    zztd localzztd = null;
    Object localObject1;
    if (bool)
    {
      this.zze = this.zze.zzp(paramzzcx);
      localObject1 = this.zzf;
      paramzzcx = localzztd;
      if (localObject1 != null)
      {
        zzK(((zztd)localObject1).zzn());
        paramzzcx = localzztd;
      }
    }
    else if (paramzzcx.zzo())
    {
      if (this.zzi) {
        paramzzcx = this.zze.zzp(paramzzcx);
      } else {
        paramzzcx = zzte.zzr(paramzzcx, zzcw.zza, zzte.zzd);
      }
      this.zze = paramzzcx;
      paramzzcx = localzztd;
    }
    else
    {
      paramzzcx.zze(0, this.zzc, 0L);
      localObject1 = this.zzc.zzc;
      Object localObject2 = this.zzf;
      if (localObject2 != null)
      {
        l = ((zztd)localObject2).zzq();
        this.zze.zzn(((zztd)localObject2).zza.zza, this.zzd);
        this.zze.zze(0, this.zzc, 0L);
        if (l != 0L) {}
      }
      else
      {
        l = 0L;
      }
      Pair localPair = paramzzcx.zzl(this.zzc, this.zzd, 0, l);
      localObject2 = localPair.first;
      long l = ((Long)localPair.second).longValue();
      if (this.zzi) {
        paramzzcx = this.zze.zzp(paramzzcx);
      } else {
        paramzzcx = zzte.zzr(paramzzcx, localObject1, localObject2);
      }
      this.zze = paramzzcx;
      localObject1 = this.zzf;
      paramzzcx = localzztd;
      if (localObject1 != null)
      {
        zzK(l);
        paramzzcx = ((zztd)localObject1).zza;
        paramzzcx = paramzzcx.zzc(zzJ(paramzzcx.zza));
      }
    }
    this.zzi = true;
    this.zzh = true;
    zzo(this.zze);
    if (paramzzcx != null)
    {
      localzztd = this.zzf;
      Objects.requireNonNull(localzztd);
      localzztd.zzr(paramzzcx);
    }
  }
  
  public final void zzE()
  {
    if (!this.zzb)
    {
      this.zzg = true;
      zzA(null, this.zza);
    }
  }
  
  public final void zzF(zztj paramzztj)
  {
    ((zztd)paramzztj).zzt();
    if (paramzztj == this.zzf) {
      this.zzf = null;
    }
  }
  
  public final zztd zzG(zztl paramzztl, zzxm paramzzxm, long paramLong)
  {
    paramzzxm = new zztd(paramzztl, paramzzxm, paramLong);
    paramzzxm.zzu(this.zza);
    if (this.zzh)
    {
      paramzzxm.zzr(paramzztl.zzc(zzJ(paramzztl.zza)));
    }
    else
    {
      this.zzf = paramzzxm;
      if (!this.zzg)
      {
        this.zzg = true;
        zzA(null, this.zza);
      }
    }
    return paramzzxm;
  }
  
  public final void zzq()
  {
    this.zzh = false;
    this.zzg = false;
    super.zzq();
  }
  
  public final void zzy() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zztg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */