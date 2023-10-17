package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzul
  implements zzvc
{
  final zzuo zza;
  private final int zzb;
  
  public zzul(zzuo paramzzuo, int paramInt)
  {
    this.zzb = paramInt;
  }
  
  public final int zza(zzkf paramzzkf, zzhi paramzzhi, int paramInt)
  {
    return this.zza.zzg(this.zzb, paramzzkf, paramzzhi, paramInt);
  }
  
  public final int zzb(long paramLong)
  {
    return this.zza.zzi(this.zzb, paramLong);
  }
  
  public final void zzd()
    throws IOException
  {
    this.zza.zzH(this.zzb);
  }
  
  public final boolean zze()
  {
    return this.zza.zzO(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */