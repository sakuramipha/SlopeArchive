package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class zzfte
  extends zzfrw
{
  private final transient zzfru zza;
  private final transient zzfrr zzb;
  
  zzfte(zzfru paramzzfru, zzfrr paramzzfrr)
  {
    this.zza = paramzzfru;
    this.zzb = paramzzfrr;
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return this.zza.get(paramObject) != null;
  }
  
  public final int size()
  {
    return this.zza.size();
  }
  
  final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    return this.zzb.zza(paramArrayOfObject, paramInt);
  }
  
  public final zzfrr zzd()
  {
    return this.zzb;
  }
  
  public final zzftr zze()
  {
    return this.zzb.zzr(0);
  }
  
  final boolean zzf()
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */