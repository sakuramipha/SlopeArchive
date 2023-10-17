package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfwi
{
  public static zzfwc zza(ExecutorService paramExecutorService)
  {
    if ((paramExecutorService instanceof zzfwc)) {
      paramExecutorService = (zzfwc)paramExecutorService;
    } else if ((paramExecutorService instanceof ScheduledExecutorService)) {
      paramExecutorService = new zzfwh((ScheduledExecutorService)paramExecutorService);
    } else {
      paramExecutorService = new zzfwe(paramExecutorService);
    }
    return paramExecutorService;
  }
  
  public static Executor zzb()
  {
    return zzfvf.zza;
  }
  
  static Executor zzc(Executor paramExecutor, zzfuf paramzzfuf)
  {
    Objects.requireNonNull(paramExecutor);
    if (paramExecutor == zzfvf.zza) {
      return paramExecutor;
    }
    return new zzfwd(paramExecutor, paramzzfuf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */