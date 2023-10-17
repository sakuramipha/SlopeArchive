package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

@Deprecated
public final class zzli
{
  private final zzik zza;
  
  @Deprecated
  public zzli(Context paramContext, zzcek paramzzcek)
  {
    this.zza = new zzik(paramContext, paramzzcek);
  }
  
  @Deprecated
  public final zzli zza(zzkg paramzzkg)
  {
    zzik localzzik = this.zza;
    zzdy.zzf(localzzik.zzq ^ true);
    Objects.requireNonNull(paramzzkg);
    localzzik.zzf = new zzic(paramzzkg);
    return this;
  }
  
  @Deprecated
  public final zzli zzb(zzxd paramzzxd)
  {
    zzik localzzik = this.zza;
    zzdy.zzf(localzzik.zzq ^ true);
    Objects.requireNonNull(paramzzxd);
    localzzik.zze = new zzid(paramzzxd);
    return this;
  }
  
  @Deprecated
  public final zzlj zzc()
  {
    zzik localzzik = this.zza;
    zzdy.zzf(localzzik.zzq ^ true);
    localzzik.zzq = true;
    return new zzlj(localzzik);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */