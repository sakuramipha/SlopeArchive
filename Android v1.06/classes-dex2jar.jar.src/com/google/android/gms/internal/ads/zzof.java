package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

public final class zzof
{
  public static final zzof zza;
  private final zzoe zzb;
  
  static
  {
    zzof localzzof;
    if (zzfn.zza < 31) {
      localzzof = new zzof();
    } else {
      localzzof = new zzof(zzoe.zza);
    }
    zza = localzzof;
  }
  
  public zzof()
  {
    this.zzb = null;
    boolean bool;
    if (zzfn.zza < 31) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
  }
  
  public zzof(LogSessionId paramLogSessionId)
  {
    this.zzb = paramLogSessionId;
  }
  
  private zzof(zzoe paramzzoe)
  {
    this.zzb = paramzzoe;
  }
  
  public final LogSessionId zza()
  {
    zzoe localzzoe = this.zzb;
    Objects.requireNonNull(localzzoe);
    return localzzoe.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */