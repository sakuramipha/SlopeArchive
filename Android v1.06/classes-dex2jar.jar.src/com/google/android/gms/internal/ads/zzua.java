package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzua
  implements zzvc
{
  private final zzvc zza;
  private final long zzb;
  
  public zzua(zzvc paramzzvc, long paramLong)
  {
    this.zza = paramzzvc;
    this.zzb = paramLong;
  }
  
  public final int zza(zzkf paramzzkf, zzhi paramzzhi, int paramInt)
  {
    paramInt = this.zza.zza(paramzzkf, paramzzhi, paramInt);
    if (paramInt == -4)
    {
      paramzzhi.zzd = Math.max(0L, paramzzhi.zzd + this.zzb);
      return -4;
    }
    return paramInt;
  }
  
  public final int zzb(long paramLong)
  {
    return this.zza.zzb(paramLong - this.zzb);
  }
  
  public final zzvc zzc()
  {
    return this.zza;
  }
  
  public final void zzd()
    throws IOException
  {
    this.zza.zzd();
  }
  
  public final boolean zze()
  {
    return this.zza.zze();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */