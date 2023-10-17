package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

final class zzfwq
  extends zzfwa
{
  final zzfwr zza;
  private final Callable zzb;
  
  zzfwq(zzfwr paramzzfwr, Callable paramCallable)
  {
    Objects.requireNonNull(paramCallable);
    this.zzb = paramCallable;
  }
  
  final Object zza()
    throws Exception
  {
    return this.zzb.call();
  }
  
  final String zzb()
  {
    return this.zzb.toString();
  }
  
  final void zzd(Throwable paramThrowable)
  {
    this.zza.zze(paramThrowable);
  }
  
  final void zze(Object paramObject)
  {
    this.zza.zzd(paramObject);
  }
  
  final boolean zzg()
  {
    return this.zza.isDone();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */