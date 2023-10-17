package com.google.android.gms.internal.ads;

final class zzki
{
  public final zztj zza;
  public final Object zzb;
  public final zzvc[] zzc;
  public boolean zzd;
  public boolean zze;
  public zzkj zzf;
  public boolean zzg;
  private final boolean[] zzh;
  private final zzlf[] zzi;
  private final zzxd zzj;
  private final zzkx zzk;
  private zzki zzl;
  private zzvk zzm;
  private zzxe zzn;
  private long zzo;
  
  public zzki(zzlf[] paramArrayOfzzlf, long paramLong, zzxd paramzzxd, zzxm paramzzxm, zzkx paramzzkx, zzkj paramzzkj, zzxe paramzzxe)
  {
    this.zzi = paramArrayOfzzlf;
    this.zzo = paramLong;
    this.zzj = paramzzxd;
    this.zzk = paramzzkx;
    this.zzb = paramzzkj.zza.zza;
    this.zzf = paramzzkj;
    this.zzm = zzvk.zza;
    this.zzn = paramzzxe;
    this.zzc = new zzvc[2];
    this.zzh = new boolean[2];
    paramArrayOfzzlf = paramzzkj.zza;
    paramLong = paramzzkj.zzb;
    long l = paramzzkj.zzd;
    paramzzxd = paramzzkx.zzo(paramArrayOfzzlf, paramzzxm, paramLong);
    paramArrayOfzzlf = paramzzxd;
    if (l != -9223372036854775807L) {
      paramArrayOfzzlf = new zzsq(paramzzxd, true, 0L, l);
    }
    this.zza = paramArrayOfzzlf;
  }
  
  private final void zzs()
  {
    if (zzu()) {
      for (int i = 0;; i++)
      {
        Object localObject = this.zzn;
        if (i >= ((zzxe)localObject).zza) {
          break;
        }
        ((zzxe)localObject).zzb(i);
        localObject = this.zzn.zzc[i];
      }
    }
  }
  
  private final void zzt()
  {
    if (zzu()) {
      for (int i = 0;; i++)
      {
        Object localObject = this.zzn;
        if (i >= ((zzxe)localObject).zza) {
          break;
        }
        ((zzxe)localObject).zzb(i);
        localObject = this.zzn.zzc[i];
      }
    }
  }
  
  private final boolean zzu()
  {
    return this.zzl == null;
  }
  
  public final long zza(zzxe paramzzxe, long paramLong, boolean paramBoolean)
  {
    return zzb(paramzzxe, paramLong, false, new boolean[2]);
  }
  
  public final long zzb(zzxe paramzzxe, long paramLong, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    Object localObject;
    for (int i = 0;; i++)
    {
      int j = paramzzxe.zza;
      int k = 1;
      if (i >= j) {
        break;
      }
      localObject = this.zzh;
      if ((paramBoolean) || (!paramzzxe.zza(this.zzn, i))) {
        k = 0;
      }
      localObject[i] = k;
    }
    for (i = 0;; i++)
    {
      localObject = this.zzi;
      if (i >= 2) {
        break;
      }
      localObject[i].zzb();
    }
    zzs();
    this.zzn = paramzzxe;
    zzt();
    paramLong = this.zza.zzf(paramzzxe.zzc, this.zzh, this.zzc, paramArrayOfBoolean, paramLong);
    for (i = 0;; i++)
    {
      paramArrayOfBoolean = this.zzi;
      if (i >= 2) {
        break;
      }
      paramArrayOfBoolean[i].zzb();
    }
    this.zze = false;
    for (i = 0;; i++)
    {
      paramArrayOfBoolean = this.zzc;
      if (i >= 2) {
        break;
      }
      if (paramArrayOfBoolean[i] != null)
      {
        zzdy.zzf(paramzzxe.zzb(i));
        this.zzi[i].zzb();
        this.zze = true;
      }
      else
      {
        if (paramzzxe.zzc[i] == null) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        zzdy.zzf(paramBoolean);
      }
    }
    return paramLong;
  }
  
  public final long zzc()
  {
    if (!this.zzd) {
      return this.zzf.zzb;
    }
    long l;
    if (this.zze) {
      l = this.zza.zzb();
    } else {
      l = Long.MIN_VALUE;
    }
    if (l == Long.MIN_VALUE) {
      return this.zzf.zze;
    }
    return l;
  }
  
  public final long zzd()
  {
    if (!this.zzd) {
      return 0L;
    }
    return this.zza.zzc();
  }
  
  public final long zze()
  {
    return this.zzo;
  }
  
  public final long zzf()
  {
    return this.zzf.zzb + this.zzo;
  }
  
  public final zzki zzg()
  {
    return this.zzl;
  }
  
  public final zzvk zzh()
  {
    return this.zzm;
  }
  
  public final zzxe zzi()
  {
    return this.zzn;
  }
  
  public final zzxe zzj(float paramFloat, zzcx paramzzcx)
    throws zzia
  {
    zzxe localzzxe = this.zzj.zzn(this.zzi, this.zzm, this.zzf.zza, paramzzcx);
    for (paramzzcx : localzzxe.zzc) {}
    return localzzxe;
  }
  
  public final void zzk(long paramLong)
  {
    zzdy.zzf(zzu());
    long l = this.zzo;
    this.zza.zzo(paramLong - l);
  }
  
  public final void zzl(float paramFloat, zzcx paramzzcx)
    throws zzia
  {
    this.zzd = true;
    this.zzm = this.zza.zzh();
    paramzzcx = zzj(paramFloat, paramzzcx);
    zzkj localzzkj = this.zzf;
    long l2 = localzzkj.zzb;
    long l3 = localzzkj.zze;
    long l1 = l2;
    if (l3 != -9223372036854775807L)
    {
      l1 = l2;
      if (l2 >= l3) {
        l1 = Math.max(0L, l3 - 1L);
      }
    }
    l1 = zza(paramzzcx, l1, false);
    l2 = this.zzo;
    paramzzcx = this.zzf;
    this.zzo = (l2 + (paramzzcx.zzb - l1));
    this.zzf = paramzzcx.zzb(l1);
  }
  
  public final void zzm(long paramLong)
  {
    zzdy.zzf(zzu());
    if (this.zzd) {
      this.zza.zzm(paramLong - this.zzo);
    }
  }
  
  public final void zzn()
  {
    zzs();
    zzkx localzzkx = this.zzk;
    zztj localzztj = this.zza;
    try
    {
      if ((localzztj instanceof zzsq))
      {
        localzzkx.zzh(((zzsq)localzztj).zza);
        return;
      }
      localzzkx.zzh(localzztj);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzer.zzc("MediaPeriodHolder", "Period release failed.", localRuntimeException);
    }
  }
  
  public final void zzo(zzki paramzzki)
  {
    if (paramzzki == this.zzl) {
      return;
    }
    zzs();
    this.zzl = paramzzki;
    zzt();
  }
  
  public final void zzp(long paramLong)
  {
    this.zzo = 1000000000000L;
  }
  
  public final void zzq()
  {
    zztj localzztj = this.zza;
    if ((localzztj instanceof zzsq))
    {
      long l2 = this.zzf.zzd;
      long l1 = l2;
      if (l2 == -9223372036854775807L) {
        l1 = Long.MIN_VALUE;
      }
      ((zzsq)localzztj).zzn(0L, l1);
    }
  }
  
  public final boolean zzr()
  {
    boolean bool2 = this.zzd;
    boolean bool1 = true;
    if (bool2)
    {
      if (!this.zze) {
        return bool1;
      }
      if (this.zza.zzb() == Long.MIN_VALUE) {
        return true;
      }
    }
    bool1 = false;
    return bool1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */