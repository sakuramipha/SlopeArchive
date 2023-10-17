package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgne
  extends zzgng
{
  final zzgno zza;
  private int zzb = 0;
  private final int zzc;
  
  zzgne(zzgno paramzzgno)
  {
    this.zzc = paramzzgno.zzd();
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */