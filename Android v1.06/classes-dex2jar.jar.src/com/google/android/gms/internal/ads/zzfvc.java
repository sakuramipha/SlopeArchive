package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzfvc
  extends zzfvd
{
  final zzfve zza;
  private final Callable zzc;
  
  zzfvc(zzfve paramzzfve, Callable paramCallable, Executor paramExecutor)
  {
    super(paramzzfve, paramExecutor);
    Objects.requireNonNull(paramCallable);
    this.zzc = paramCallable;
  }
  
  final Object zza()
    throws Exception
  {
    return this.zzc.call();
  }
  
  final String zzb()
  {
    return this.zzc.toString();
  }
  
  final void zzc(Object paramObject)
  {
    this.zza.zzd(paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */