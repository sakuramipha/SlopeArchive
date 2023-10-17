package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

public final class zzlu
{
  private final zzah zza;
  private final SparseArray zzb;
  
  public zzlu(zzah paramzzah, SparseArray paramSparseArray)
  {
    this.zza = paramzzah;
    SparseArray localSparseArray = new SparseArray(paramzzah.zzb());
    for (int i = 0; i < paramzzah.zzb(); i++)
    {
      int j = paramzzah.zza(i);
      zzlt localzzlt = (zzlt)paramSparseArray.get(j);
      Objects.requireNonNull(localzzlt);
      localSparseArray.append(j, localzzlt);
    }
    this.zzb = localSparseArray;
  }
  
  public final int zza(int paramInt)
  {
    return this.zza.zza(paramInt);
  }
  
  public final int zzb()
  {
    return this.zza.zzb();
  }
  
  public final zzlt zzc(int paramInt)
  {
    zzlt localzzlt = (zzlt)this.zzb.get(paramInt);
    Objects.requireNonNull(localzzlt);
    return localzzlt;
  }
  
  public final boolean zzd(int paramInt)
  {
    return this.zza.zzc(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */