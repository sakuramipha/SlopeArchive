package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

final class zzad
  extends zzy
{
  private final transient zzx zza;
  private final transient zzu zzb;
  
  zzad(zzx paramzzx, zzu paramzzu)
  {
    this.zza = paramzzx;
    this.zzb = paramzzu;
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
    return this.zzb.zza(paramArrayOfObject, 0);
  }
  
  public final zzu zzd()
  {
    return this.zzb;
  }
  
  public final zzah zze()
  {
    return this.zzb.zzm(0);
  }
  
  final boolean zzf()
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */