package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public final class zzsq
  implements zztj, zzti
{
  public final zztj zza;
  long zzb;
  private zzti zzc;
  private zzsp[] zzd;
  private long zze;
  
  public zzsq(zztj paramzztj, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    this.zza = paramzztj;
    this.zzd = new zzsp[0];
    this.zze = 0L;
    this.zzb = paramLong2;
  }
  
  public final long zza(long paramLong, zzlh paramzzlh)
  {
    if (paramLong != 0L)
    {
      long l2 = Math.max(0L, Math.min(paramzzlh.zzf, paramLong));
      long l3 = paramzzlh.zzg;
      long l1 = this.zzb;
      if (l1 == Long.MIN_VALUE) {
        l1 = Long.MAX_VALUE;
      } else {
        l1 -= paramLong;
      }
      l1 = Math.max(0L, Math.min(l3, l1));
      zzlh localzzlh;
      if (l2 == paramzzlh.zzf)
      {
        localzzlh = paramzzlh;
        if (l1 == paramzzlh.zzg) {}
      }
      else
      {
        localzzlh = new zzlh(l2, l1);
      }
      return this.zza.zza(paramLong, localzzlh);
    }
    return 0L;
  }
  
  public final long zzb()
  {
    long l1 = this.zza.zzb();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = this.zzb;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public final long zzc()
  {
    long l2 = this.zza.zzc();
    if (l2 != Long.MIN_VALUE)
    {
      long l1 = this.zzb;
      if ((l1 == Long.MIN_VALUE) || (l2 < l1)) {
        return l2;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public final long zzd()
  {
    if (zzq())
    {
      l1 = this.zze;
      this.zze = -9223372036854775807L;
      l2 = zzd();
      if (l2 != -9223372036854775807L) {
        return l2;
      }
      return l1;
    }
    long l1 = this.zza.zzd();
    if (l1 == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    boolean bool2 = false;
    boolean bool1;
    if (l1 >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzf(bool1);
    long l2 = this.zzb;
    if (l2 != Long.MIN_VALUE)
    {
      bool1 = bool2;
      if (l1 > l2) {}
    }
    else
    {
      bool1 = true;
    }
    zzdy.zzf(bool1);
    return l1;
  }
  
  public final long zze(long paramLong)
  {
    this.zze = -9223372036854775807L;
    zzsp[] arrayOfzzsp = this.zzd;
    int j = arrayOfzzsp.length;
    boolean bool2 = false;
    for (int i = 0; i < j; i++)
    {
      zzsp localzzsp = arrayOfzzsp[i];
      if (localzzsp != null) {
        localzzsp.zzc();
      }
    }
    long l = this.zza.zze(paramLong);
    if (l != paramLong)
    {
      bool1 = bool2;
      if (l < 0L) {
        break label108;
      }
      paramLong = this.zzb;
      if (paramLong != Long.MIN_VALUE)
      {
        bool1 = bool2;
        if (l > paramLong) {
          break label108;
        }
      }
    }
    boolean bool1 = true;
    label108:
    zzdy.zzf(bool1);
    return l;
  }
  
  public final long zzf(zzwx[] paramArrayOfzzwx, boolean[] paramArrayOfBoolean1, zzvc[] paramArrayOfzzvc, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int i = paramArrayOfzzvc.length;
    this.zzd = new zzsp[i];
    zzvc[] arrayOfzzvc = new zzvc[i];
    int j = 0;
    for (i = 0;; i++)
    {
      int k = paramArrayOfzzvc.length;
      zzvc localzzvc = null;
      if (i >= k) {
        break;
      }
      zzsp[] arrayOfzzsp = this.zzd;
      zzsp localzzsp = (zzsp)paramArrayOfzzvc[i];
      arrayOfzzsp[i] = localzzsp;
      if (localzzsp != null) {
        localzzvc = localzzsp.zza;
      }
      arrayOfzzvc[i] = localzzvc;
    }
    long l = this.zza.zzf(paramArrayOfzzwx, paramArrayOfBoolean1, arrayOfzzvc, paramArrayOfBoolean2, paramLong);
    if ((zzq()) && (paramLong == 0L)) {
      paramLong = 0L;
    }
    this.zze = -9223372036854775807L;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (l != paramLong)
    {
      if (l >= 0L)
      {
        paramLong = this.zzb;
        bool1 = bool2;
        if (paramLong == Long.MIN_VALUE) {
          break label192;
        }
        if (l <= paramLong)
        {
          bool1 = bool2;
          break label192;
        }
      }
      bool1 = false;
    }
    label192:
    zzdy.zzf(bool1);
    for (i = j; i < paramArrayOfzzvc.length; i++)
    {
      paramArrayOfBoolean2 = arrayOfzzvc[i];
      if (paramArrayOfBoolean2 == null)
      {
        this.zzd[i] = null;
      }
      else
      {
        paramArrayOfBoolean1 = this.zzd;
        paramArrayOfzzwx = paramArrayOfBoolean1[i];
        if ((paramArrayOfzzwx == null) || (paramArrayOfzzwx.zza != paramArrayOfBoolean2)) {
          paramArrayOfBoolean1[i] = new zzsp(this, paramArrayOfBoolean2);
        }
      }
      paramArrayOfzzvc[i] = this.zzd[i];
    }
    return l;
  }
  
  public final zzvk zzh()
  {
    return this.zza.zzh();
  }
  
  public final void zzi(zztj paramzztj)
  {
    paramzztj = this.zzc;
    Objects.requireNonNull(paramzztj);
    paramzztj.zzi(this);
  }
  
  public final void zzj(long paramLong, boolean paramBoolean)
  {
    this.zza.zzj(paramLong, false);
  }
  
  public final void zzk()
    throws IOException
  {
    this.zza.zzk();
  }
  
  public final void zzl(zzti paramzzti, long paramLong)
  {
    this.zzc = paramzzti;
    this.zza.zzl(this, paramLong);
  }
  
  public final void zzm(long paramLong)
  {
    this.zza.zzm(paramLong);
  }
  
  public final void zzn(long paramLong1, long paramLong2)
  {
    this.zzb = paramLong2;
  }
  
  public final boolean zzo(long paramLong)
  {
    return this.zza.zzo(paramLong);
  }
  
  public final boolean zzp()
  {
    return this.zza.zzp();
  }
  
  final boolean zzq()
  {
    return this.zze != -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */