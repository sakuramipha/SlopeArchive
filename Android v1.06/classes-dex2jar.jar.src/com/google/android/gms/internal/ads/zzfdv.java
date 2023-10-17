package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzfdv
{
  private static final zzfwb zza = zzfvr.zzh(null);
  private final zzfwc zzb;
  private final ScheduledExecutorService zzc;
  private final zzfdw zzd;
  
  public zzfdv(zzfwc paramzzfwc, ScheduledExecutorService paramScheduledExecutorService, zzfdw paramzzfdw)
  {
    this.zzb = paramzzfwc;
    this.zzc = paramScheduledExecutorService;
    this.zzd = paramzzfdw;
  }
  
  public final zzfdl zza(Object paramObject, zzfwb... paramVarArgs)
  {
    return new zzfdl(this, paramObject, Arrays.asList(paramVarArgs), null);
  }
  
  public final zzfdu zzb(Object paramObject, zzfwb paramzzfwb)
  {
    return new zzfdu(this, paramObject, null, paramzzfwb, Collections.singletonList(paramzzfwb), paramzzfwb, null);
  }
  
  protected abstract String zzf(Object paramObject);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */