package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

final class zzsp
  implements zzvc
{
  public final zzvc zza;
  final zzsq zzb;
  private boolean zzc;
  
  public zzsp(zzsq paramzzsq, zzvc paramzzvc)
  {
    this.zza = paramzzvc;
  }
  
  public final int zza(zzkf paramzzkf, zzhi paramzzhi, int paramInt)
  {
    if (this.zzb.zzq()) {
      return -3;
    }
    if (this.zzc)
    {
      paramzzhi.zzc(4);
      return -4;
    }
    paramInt = this.zza.zza(paramzzkf, paramzzhi, paramInt);
    if (paramInt == -5)
    {
      paramzzhi = paramzzkf.zza;
      Objects.requireNonNull(paramzzhi);
      int j = paramzzhi.zzC;
      int i = 0;
      paramInt = j;
      if (j == 0)
      {
        if (paramzzhi.zzD != 0) {
          paramInt = 0;
        }
      }
      else
      {
        if (this.zzb.zzb == Long.MIN_VALUE) {
          i = paramzzhi.zzD;
        }
        paramzzhi = paramzzhi.zzb();
        paramzzhi.zzC(paramInt);
        paramzzhi.zzD(i);
        paramzzkf.zza = paramzzhi.zzY();
      }
      return -5;
    }
    paramzzkf = this.zzb;
    long l = paramzzkf.zzb;
    if ((l != Long.MIN_VALUE) && (((paramInt == -4) && (paramzzhi.zzd >= l)) || ((paramInt == -3) && (paramzzkf.zzb() == Long.MIN_VALUE) && (!paramzzhi.zzc))))
    {
      paramzzhi.zzb();
      paramzzhi.zzc(4);
      this.zzc = true;
      return -4;
    }
    return paramInt;
  }
  
  public final int zzb(long paramLong)
  {
    if (this.zzb.zzq()) {
      return -3;
    }
    return this.zza.zzb(paramLong);
  }
  
  public final void zzc()
  {
    this.zzc = false;
  }
  
  public final void zzd()
    throws IOException
  {
    this.zza.zzd();
  }
  
  public final boolean zze()
  {
    return (!this.zzb.zzq()) && (this.zza.zze());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */