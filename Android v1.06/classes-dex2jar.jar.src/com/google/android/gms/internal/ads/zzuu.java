package com.google.android.gms.internal.ads;

import java.util.Objects;

final class zzuu
  implements zzxg
{
  public long zza;
  public long zzb;
  public zzxf zzc;
  public zzuu zzd;
  
  public zzuu(long paramLong, int paramInt)
  {
    zze(paramLong, 65536);
  }
  
  public final int zza(long paramLong)
  {
    long l = this.zza;
    int i = this.zzc.zzb;
    return (int)(paramLong - l);
  }
  
  public final zzuu zzb()
  {
    this.zzc = null;
    zzuu localzzuu = this.zzd;
    this.zzd = null;
    return localzzuu;
  }
  
  public final zzxf zzc()
  {
    zzxf localzzxf = this.zzc;
    Objects.requireNonNull(localzzxf);
    return localzzxf;
  }
  
  public final zzxg zzd()
  {
    zzuu localzzuu = this.zzd;
    if ((localzzuu != null) && (localzzuu.zzc != null)) {
      return localzzuu;
    }
    return null;
  }
  
  public final void zze(long paramLong, int paramInt)
  {
    boolean bool;
    if (this.zzc == null) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zza = paramLong;
    this.zzb = (paramLong + 65536L);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzuu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */