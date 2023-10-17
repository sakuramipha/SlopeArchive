package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public final class zztd
  implements zztj, zzti
{
  public final zztl zza;
  private final long zzb;
  private zztn zzc;
  private zztj zzd;
  private zzti zze;
  private long zzf;
  private final zzxm zzg;
  
  public zztd(zztl paramzztl, zzxm paramzzxm, long paramLong)
  {
    this.zza = paramzztl;
    this.zzg = paramzzxm;
    this.zzb = paramLong;
    this.zzf = -9223372036854775807L;
  }
  
  private final long zzv(long paramLong)
  {
    long l = this.zzf;
    if (l != -9223372036854775807L) {
      return l;
    }
    return paramLong;
  }
  
  public final long zza(long paramLong, zzlh paramzzlh)
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zza(paramLong, paramzzlh);
  }
  
  public final long zzb()
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zzb();
  }
  
  public final long zzc()
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zzc();
  }
  
  public final long zzd()
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zzd();
  }
  
  public final long zze(long paramLong)
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zze(paramLong);
  }
  
  public final long zzf(zzwx[] paramArrayOfzzwx, boolean[] paramArrayOfBoolean1, zzvc[] paramArrayOfzzvc, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    long l = this.zzf;
    if ((l != -9223372036854775807L) && (paramLong == this.zzb))
    {
      this.zzf = -9223372036854775807L;
      paramLong = l;
    }
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zzf(paramArrayOfzzwx, paramArrayOfBoolean1, paramArrayOfzzvc, paramArrayOfBoolean2, paramLong);
  }
  
  public final zzvk zzh()
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    return localzztj.zzh();
  }
  
  public final void zzi(zztj paramzztj)
  {
    paramzztj = this.zze;
    int i = zzfn.zza;
    paramzztj.zzi(this);
  }
  
  public final void zzj(long paramLong, boolean paramBoolean)
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    localzztj.zzj(paramLong, false);
  }
  
  public final void zzk()
    throws IOException
  {
    try
    {
      Object localObject = this.zzd;
      if (localObject != null)
      {
        ((zztj)localObject).zzk();
        return;
      }
      localObject = this.zzc;
      if (localObject != null) {
        ((zztn)localObject).zzy();
      }
      return;
    }
    catch (IOException localIOException)
    {
      throw localIOException;
    }
  }
  
  public final void zzl(zzti paramzzti, long paramLong)
  {
    this.zze = paramzzti;
    paramzzti = this.zzd;
    if (paramzzti != null) {
      paramzzti.zzl(this, zzv(this.zzb));
    }
  }
  
  public final void zzm(long paramLong)
  {
    zztj localzztj = this.zzd;
    int i = zzfn.zza;
    localzztj.zzm(paramLong);
  }
  
  public final long zzn()
  {
    return this.zzf;
  }
  
  public final boolean zzo(long paramLong)
  {
    zztj localzztj = this.zzd;
    return (localzztj != null) && (localzztj.zzo(paramLong));
  }
  
  public final boolean zzp()
  {
    zztj localzztj = this.zzd;
    return (localzztj != null) && (localzztj.zzp());
  }
  
  public final long zzq()
  {
    return this.zzb;
  }
  
  public final void zzr(zztl paramzztl)
  {
    long l = zzv(this.zzb);
    zztn localzztn = this.zzc;
    Objects.requireNonNull(localzztn);
    paramzztl = localzztn.zzH(paramzztl, this.zzg, l);
    this.zzd = paramzztl;
    if (this.zze != null) {
      paramzztl.zzl(this, l);
    }
  }
  
  public final void zzs(long paramLong)
  {
    this.zzf = paramLong;
  }
  
  public final void zzt()
  {
    zztj localzztj = this.zzd;
    if (localzztj != null)
    {
      zztn localzztn = this.zzc;
      Objects.requireNonNull(localzztn);
      localzztn.zzF(localzztj);
    }
  }
  
  public final void zzu(zztn paramzztn)
  {
    boolean bool;
    if (this.zzc == null) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zzc = paramzztn;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zztd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */