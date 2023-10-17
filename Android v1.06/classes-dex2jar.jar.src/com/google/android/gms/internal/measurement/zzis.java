package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzis
  extends zziu
{
  final zzjb zza;
  private int zzb = 0;
  private final int zzc;
  
  zzis(zzjb paramzzjb)
  {
    this.zzc = paramzzjb.zzd();
  }
  
  public final boolean hasNext()
  {
    return this.zzb < this.zzc;
  }
  
  public final byte zza()
  {
    int i = this.zzb;
    if (i < this.zzc)
    {
      this.zzb = (i + 1);
      return this.zza.zzb(i);
    }
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */