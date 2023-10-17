package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzfvr
  extends zzfvt
{
  public static zzfvq zza(Iterable paramIterable)
  {
    return new zzfvq(false, zzfrr.zzj(paramIterable), null);
  }
  
  public static zzfvq zzb(Iterable paramIterable)
  {
    int i = zzfrr.zzd;
    Objects.requireNonNull(paramIterable);
    return new zzfvq(true, zzfrr.zzj(paramIterable), null);
  }
  
  @SafeVarargs
  public static zzfvq zzc(zzfwb... paramVarArgs)
  {
    return new zzfvq(true, zzfrr.zzk(paramVarArgs), null);
  }
  
  public static zzfwb zzd(Iterable paramIterable)
  {
    return new zzfuz(zzfrr.zzj(paramIterable), true);
  }
  
  public static zzfwb zze(zzfwb paramzzfwb, Class paramClass, zzfon paramzzfon, Executor paramExecutor)
  {
    paramClass = new zzfuc(paramzzfwb, paramClass, paramzzfon);
    paramzzfwb.zzc(paramClass, zzfwi.zzc(paramExecutor, paramClass));
    return paramClass;
  }
  
  public static zzfwb zzf(zzfwb paramzzfwb, Class paramClass, zzfuy paramzzfuy, Executor paramExecutor)
  {
    paramClass = new zzfub(paramzzfwb, paramClass, paramzzfuy);
    paramzzfwb.zzc(paramClass, zzfwi.zzc(paramExecutor, paramClass));
    return paramClass;
  }
  
  public static zzfwb zzg(Throwable paramThrowable)
  {
    Objects.requireNonNull(paramThrowable);
    return new zzfvu(paramThrowable);
  }
  
  public static zzfwb zzh(Object paramObject)
  {
    if (paramObject == null) {
      return zzfvv.zza;
    }
    return new zzfvv(paramObject);
  }
  
  public static zzfwb zzi()
  {
    return zzfvv.zza;
  }
  
  public static zzfwb zzj(Callable paramCallable, Executor paramExecutor)
  {
    paramCallable = new zzfwr(paramCallable);
    paramExecutor.execute(paramCallable);
    return paramCallable;
  }
  
  public static zzfwb zzk(zzfux paramzzfux, Executor paramExecutor)
  {
    paramzzfux = new zzfwr(paramzzfux);
    paramExecutor.execute(paramzzfux);
    return paramzzfux;
  }
  
  public static zzfwb zzl(zzfwb paramzzfwb, zzfon paramzzfon, Executor paramExecutor)
  {
    int i = zzfun.zzc;
    Objects.requireNonNull(paramzzfon);
    paramzzfon = new zzfum(paramzzfwb, paramzzfon);
    paramzzfwb.zzc(paramzzfon, zzfwi.zzc(paramExecutor, paramzzfon));
    return paramzzfon;
  }
  
  public static zzfwb zzm(zzfwb paramzzfwb, zzfuy paramzzfuy, Executor paramExecutor)
  {
    int i = zzfun.zzc;
    Objects.requireNonNull(paramExecutor);
    paramzzfuy = new zzful(paramzzfwb, paramzzfuy);
    paramzzfwb.zzc(paramzzfuy, zzfwi.zzc(paramExecutor, paramzzfuy));
    return paramzzfuy;
  }
  
  public static zzfwb zzn(zzfwb paramzzfwb, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService)
  {
    if (paramzzfwb.isDone()) {
      return paramzzfwb;
    }
    return zzfwo.zzg(paramzzfwb, paramLong, paramTimeUnit, paramScheduledExecutorService);
  }
  
  public static Object zzo(Future paramFuture)
    throws ExecutionException
  {
    if (paramFuture.isDone()) {
      return zzfwt.zza(paramFuture);
    }
    throw new IllegalStateException(zzfpo.zzb("Future was expected to be done: %s", new Object[] { paramFuture }));
  }
  
  public static Object zzp(Future paramFuture)
  {
    try
    {
      paramFuture = zzfwt.zza(paramFuture);
      return paramFuture;
    }
    catch (ExecutionException paramFuture)
    {
      paramFuture = paramFuture.getCause();
      if ((paramFuture instanceof Error)) {
        throw new zzfvg((Error)paramFuture);
      }
      throw new zzfws(paramFuture);
    }
  }
  
  public static void zzq(zzfwb paramzzfwb, zzfvn paramzzfvn, Executor paramExecutor)
  {
    Objects.requireNonNull(paramzzfvn);
    paramzzfwb.zzc(new zzfvo(paramzzfwb, paramzzfvn), paramExecutor);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */