package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

final class zztz
  implements zztj, zzti
{
  private final zztj zza;
  private final long zzb;
  private zzti zzc;
  
  public zztz(zztj paramzztj, long paramLong)
  {
    this.zza = paramzztj;
    this.zzb = paramLong;
  }
  
  public final long zza(long paramLong, zzlh paramzzlh)
  {
    return this.zza.zza(paramLong - this.zzb, paramzzlh) + this.zzb;
  }
  
  public final long zzb()
  {
    long l = this.zza.zzb();
    if (l == Long.MIN_VALUE) {
      return Long.MIN_VALUE;
    }
    return l + this.zzb;
  }
  
  public final long zzc()
  {
    long l = this.zza.zzc();
    if (l == Long.MIN_VALUE) {
      return Long.MIN_VALUE;
    }
    return l + this.zzb;
  }
  
  public final long zzd()
  {
    long l = this.zza.zzd();
    if (l == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    return l + this.zzb;
  }
  
  public final long zze(long paramLong)
  {
    return this.zza.zze(paramLong - this.zzb) + this.zzb;
  }
  
  public final long zzf(zzwx[] paramArrayOfzzwx, boolean[] paramArrayOfBoolean1, zzvc[] paramArrayOfzzvc, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    zzvc[] arrayOfzzvc = new zzvc[paramArrayOfzzvc.length];
    int j = 0;
    for (int i = 0;; i++)
    {
      int k = paramArrayOfzzvc.length;
      zzvc localzzvc = null;
      if (i >= k) {
        break;
      }
      zzua localzzua = (zzua)paramArrayOfzzvc[i];
      if (localzzua != null) {
        localzzvc = localzzua.zzc();
      }
      arrayOfzzvc[i] = localzzvc;
    }
    paramLong = this.zza.zzf(paramArrayOfzzwx, paramArrayOfBoolean1, arrayOfzzvc, paramArrayOfBoolean2, paramLong - this.zzb);
    for (i = j; i < paramArrayOfzzvc.length; i++)
    {
      paramArrayOfBoolean1 = arrayOfzzvc[i];
      if (paramArrayOfBoolean1 == null)
      {
        paramArrayOfzzvc[i] = null;
      }
      else
      {
        paramArrayOfzzwx = paramArrayOfzzvc[i];
        if ((paramArrayOfzzwx == null) || (((zzua)paramArrayOfzzwx).zzc() != paramArrayOfBoolean1)) {
          paramArrayOfzzvc[i] = new zzua(paramArrayOfBoolean1, this.zzb);
        }
      }
    }
    return paramLong + this.zzb;
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
    this.zza.zzj(paramLong - this.zzb, false);
  }
  
  public final void zzk()
    throws IOException
  {
    this.zza.zzk();
  }
  
  public final void zzl(zzti paramzzti, long paramLong)
  {
    this.zzc = paramzzti;
    this.zza.zzl(this, paramLong - this.zzb);
  }
  
  public final void zzm(long paramLong)
  {
    this.zza.zzm(paramLong - this.zzb);
  }
  
  public final boolean zzo(long paramLong)
  {
    return this.zza.zzo(paramLong - this.zzb);
  }
  
  public final boolean zzp()
  {
    return this.zza.zzp();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zztz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */