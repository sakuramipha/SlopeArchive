package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public abstract class zzfuf<V>
  extends zzfwu
  implements zzfwb<V>
{
  private static final Logger zzaZ;
  private static final zzfuf.zza zzba;
  private static final Object zzbd = new Object();
  static final boolean zzd;
  @CheckForNull
  private volatile zzfuf.zzd listeners;
  @CheckForNull
  private volatile Object value;
  @CheckForNull
  private volatile zzfuf.zzk waiters;
  
  static
  {
    boolean bool;
    try
    {
      bool = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    }
    catch (SecurityException localSecurityException)
    {
      bool = false;
    }
    zzd = bool;
    zzaZ = Logger.getLogger(zzfuf.class.getName());
    RuntimeException localRuntimeException2;
    try
    {
      zzfuf.zzj localzzj = new com/google/android/gms/internal/ads/zzfuf$zzj;
      localzzj.<init>(null);
      localRuntimeException2 = null;
      localObject3 = null;
    }
    catch (Error localError1) {}catch (RuntimeException localRuntimeException1) {}
    try
    {
      localObject3 = new com/google/android/gms/internal/ads/zzfuf$zze;
      ((zzfuf.zze)localObject3).<init>(AtomicReferenceFieldUpdater.newUpdater(zzfuf.zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.zzk.class, zzfuf.zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, zzfuf.zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, zzfuf.zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, Object.class, "value"));
      localRuntimeException2 = localRuntimeException1;
      localObject1 = localObject3;
      localObject3 = null;
    }
    catch (Error localError2) {}catch (RuntimeException localRuntimeException3) {}
    zzfuf.zzg localzzg = new zzfuf.zzg(null);
    Object localObject3 = localRuntimeException3;
    Object localObject2 = localObject1;
    Object localObject1 = localzzg;
    zzba = (zzfuf.zza)localObject1;
    if (localObject3 != null)
    {
      localObject1 = zzaZ;
      ((Logger)localObject1).logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", (Throwable)localObject2);
      ((Logger)localObject1).logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", (Throwable)localObject3);
    }
  }
  
  private final void zzA(zzfuf.zzk paramzzk)
  {
    paramzzk.thread = null;
    paramzzk = this.waiters;
    if (paramzzk != zzfuf.zzk.zza)
    {
      Object localObject2;
      for (Object localObject1 = null;; localObject1 = localObject2)
      {
        if (paramzzk == null) {
          return;
        }
        zzfuf.zzk localzzk = paramzzk.next;
        if (paramzzk.thread != null)
        {
          localObject2 = paramzzk;
        }
        else
        {
          if (localObject1 != null)
          {
            ((zzfuf.zzk)localObject1).next = localzzk;
            localObject2 = localObject1;
            if (((zzfuf.zzk)localObject1).thread != null) {
              break label81;
            }
            break;
          }
          localObject2 = localObject1;
          if (!zzba.zzg(this, paramzzk, localzzk)) {
            break;
          }
        }
        label81:
        paramzzk = localzzk;
      }
    }
  }
  
  private static final Object zzB(Object paramObject)
    throws ExecutionException
  {
    if (!(paramObject instanceof zzfuf.zzb))
    {
      if (!(paramObject instanceof zzfuf.zzc))
      {
        localObject = paramObject;
        if (paramObject == zzbd) {
          localObject = null;
        }
        return localObject;
      }
      throw new ExecutionException(((zzfuf.zzc)paramObject).zzb);
    }
    Object localObject = ((zzfuf.zzb)paramObject).zzd;
    paramObject = new CancellationException("Task was cancelled.");
    ((CancellationException)paramObject).initCause((Throwable)localObject);
    throw ((Throwable)paramObject);
  }
  
  private static Object zzf(zzfwb paramzzfwb)
  {
    Object localObject1;
    Object localObject2;
    if ((paramzzfwb instanceof zzfuf.zzh))
    {
      localObject1 = ((zzfuf)paramzzfwb).value;
      paramzzfwb = (zzfwb)localObject1;
      if ((localObject1 instanceof zzfuf.zzb))
      {
        localObject2 = (zzfuf.zzb)localObject1;
        paramzzfwb = (zzfwb)localObject1;
        if (((zzfuf.zzb)localObject2).zzc)
        {
          paramzzfwb = ((zzfuf.zzb)localObject2).zzd;
          if (paramzzfwb != null) {
            paramzzfwb = new zzfuf.zzb(false, paramzzfwb);
          } else {
            paramzzfwb = zzfuf.zzb.zzb;
          }
        }
      }
      paramzzfwb.getClass();
      return paramzzfwb;
    }
    if ((paramzzfwb instanceof zzfwu))
    {
      localObject1 = ((zzfwu)paramzzfwb).zzm();
      if (localObject1 != null) {
        return new zzfuf.zzc((Throwable)localObject1);
      }
    }
    boolean bool = paramzzfwb.isCancelled();
    if (((zzd ^ true) & bool))
    {
      paramzzfwb = zzfuf.zzb.zzb;
      paramzzfwb.getClass();
      return paramzzfwb;
    }
    try
    {
      try
      {
        localObject2 = zzg(paramzzfwb);
        if (bool)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          String str = String.valueOf(paramzzfwb);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
          ((StringBuilder)localObject2).append(str);
          ((IllegalArgumentException)localObject1).<init>(((StringBuilder)localObject2).toString());
          return new zzfuf.zzb(false, (Throwable)localObject1);
        }
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = zzbd;
        }
        return localObject1;
      }
      catch (Error paramzzfwb) {}catch (RuntimeException paramzzfwb) {}
      return new zzfuf.zzc(paramzzfwb);
    }
    catch (CancellationException localCancellationException)
    {
      if (!bool) {
        return new zzfuf.zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(paramzzfwb))), localCancellationException));
      }
      return new zzfuf.zzb(false, localCancellationException);
    }
    catch (ExecutionException localExecutionException)
    {
      if (bool) {
        return new zzfuf.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(paramzzfwb))), localExecutionException));
      }
      return new zzfuf.zzc(localExecutionException.getCause());
    }
  }
  
  /* Error */
  private static Object zzg(Future paramFuture)
    throws ExecutionException
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokeinterface 242 1 0
    //   8: astore_2
    //   9: iload_1
    //   10: ifeq +9 -> 19
    //   13: invokestatic 246	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   16: invokevirtual 249	java/lang/Thread:interrupt	()V
    //   19: aload_2
    //   20: areturn
    //   21: astore_0
    //   22: iload_1
    //   23: ifne +6 -> 29
    //   26: goto +9 -> 35
    //   29: invokestatic 246	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   32: invokevirtual 249	java/lang/Thread:interrupt	()V
    //   35: aload_0
    //   36: athrow
    //   37: astore_2
    //   38: iconst_1
    //   39: istore_1
    //   40: goto -38 -> 2
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	paramFuture	Future
    //   1	39	1	i	int
    //   8	12	2	localObject	Object
    //   37	1	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	9	21	finally
    //   2	9	37	java/lang/InterruptedException
  }
  
  private final void zzv(StringBuilder paramStringBuilder)
  {
    try
    {
      Object localObject = zzg(this);
      paramStringBuilder.append("SUCCESS, result=[");
      if (localObject == null)
      {
        paramStringBuilder.append("null");
      }
      else if (localObject == this)
      {
        paramStringBuilder.append("this future");
      }
      else
      {
        paramStringBuilder.append(localObject.getClass().getName());
        paramStringBuilder.append("@");
        paramStringBuilder.append(Integer.toHexString(System.identityHashCode(localObject)));
      }
      paramStringBuilder.append("]");
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(localRuntimeException.getClass());
      paramStringBuilder.append(" thrown from get()]");
      return;
    }
    catch (CancellationException localCancellationException)
    {
      paramStringBuilder.append("CANCELLED");
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      paramStringBuilder.append("FAILURE, cause=[");
      paramStringBuilder.append(localExecutionException.getCause());
      paramStringBuilder.append("]");
    }
  }
  
  private final void zzw(StringBuilder paramStringBuilder)
  {
    int i = paramStringBuilder.length();
    paramStringBuilder.append("PENDING");
    Object localObject = this.value;
    if ((localObject instanceof zzfuf.zzf))
    {
      paramStringBuilder.append(", setFuture=[");
      zzx(paramStringBuilder, ((zzfuf.zzf)localObject).zzb);
      paramStringBuilder.append("]");
    }
    else
    {
      try
      {
        localObject = zzfpo.zza(zza());
      }
      catch (StackOverflowError localStackOverflowError) {}catch (RuntimeException localRuntimeException) {}
      String str = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(localRuntimeException.getClass())));
      if (str != null)
      {
        paramStringBuilder.append(", info=[");
        paramStringBuilder.append(str);
        paramStringBuilder.append("]");
      }
    }
    if (isDone())
    {
      paramStringBuilder.delete(i, paramStringBuilder.length());
      zzv(paramStringBuilder);
    }
  }
  
  private final void zzx(StringBuilder paramStringBuilder, @CheckForNull Object paramObject)
  {
    if (paramObject == this) {}
    try
    {
      paramStringBuilder.append("this future");
      return;
    }
    catch (StackOverflowError paramObject) {}catch (RuntimeException paramObject) {}
    paramStringBuilder.append(paramObject);
    return;
    paramStringBuilder.append("Exception thrown from implementation: ");
    paramStringBuilder.append(paramObject.getClass());
  }
  
  private static void zzy(zzfuf paramzzfuf, boolean paramBoolean)
  {
    Object localObject2 = null;
    Object localObject1 = paramzzfuf;
    paramzzfuf = (zzfuf)localObject2;
    Object localObject3;
    for (localObject2 = zzba.zzb((zzfuf)localObject1, zzfuf.zzk.zza); localObject2 != null; localObject2 = ((zzfuf.zzk)localObject2).next)
    {
      localObject3 = ((zzfuf.zzk)localObject2).thread;
      if (localObject3 != null)
      {
        ((zzfuf.zzk)localObject2).thread = null;
        LockSupport.unpark((Thread)localObject3);
      }
    }
    if (paramBoolean) {
      ((zzfuf)localObject1).zzr();
    }
    ((zzfuf)localObject1).zzb();
    localObject2 = zzba.zza((zzfuf)localObject1, zzfuf.zzd.zza);
    localObject1 = paramzzfuf;
    for (paramzzfuf = (zzfuf)localObject2;; paramzzfuf = (zzfuf)localObject2)
    {
      localObject2 = localObject1;
      if (paramzzfuf == null) {
        break;
      }
      localObject2 = paramzzfuf.next;
      paramzzfuf.next = ((zzfuf.zzd)localObject1);
      localObject1 = paramzzfuf;
    }
    for (;;)
    {
      if (localObject2 == null) {
        return;
      }
      paramzzfuf = ((zzfuf.zzd)localObject2).next;
      localObject1 = ((zzfuf.zzd)localObject2).zzb;
      localObject1.getClass();
      if ((localObject1 instanceof zzfuf.zzf))
      {
        localObject3 = (zzfuf.zzf)localObject1;
        localObject1 = ((zzfuf.zzf)localObject3).zza;
        if (((zzfuf)localObject1).value != localObject3) {
          break label189;
        }
        localObject2 = zzf(((zzfuf.zzf)localObject3).zzb);
        if (!zzba.zzf((zzfuf)localObject1, localObject3, localObject2)) {
          break label189;
        }
        paramBoolean = false;
        break;
      }
      localObject2 = ((zzfuf.zzd)localObject2).zzc;
      localObject2.getClass();
      zzz((Runnable)localObject1, (Executor)localObject2);
      label189:
      localObject2 = paramzzfuf;
    }
  }
  
  private static void zzz(Runnable paramRunnable, Executor paramExecutor)
  {
    try
    {
      paramExecutor.execute(paramRunnable);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = zzaZ;
      Level localLevel = Level.SEVERE;
      paramRunnable = String.valueOf(paramRunnable);
      String str = String.valueOf(paramExecutor);
      paramExecutor = new StringBuilder();
      paramExecutor.append("RuntimeException while executing runnable ");
      paramExecutor.append(paramRunnable);
      paramExecutor.append(" with executor ");
      paramExecutor.append(str);
      localLogger.logp(localLevel, "com.google.common.util.concurrent.AbstractFuture", "executeListener", paramExecutor.toString(), localRuntimeException);
    }
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    Object localObject3 = this.value;
    boolean bool3 = localObject3 instanceof zzfuf.zzf;
    boolean bool2 = false;
    boolean bool1;
    if (localObject3 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if ((bool3 | bool1))
    {
      Object localObject2;
      if (zzd)
      {
        localObject2 = new zzfuf.zzb(paramBoolean, new CancellationException("Future.cancel() was called."));
      }
      else
      {
        if (paramBoolean) {
          localObject1 = zzfuf.zzb.zza;
        } else {
          localObject1 = zzfuf.zzb.zzb;
        }
        localObject1.getClass();
        localObject2 = localObject1;
      }
      bool2 = false;
      zzfuf localzzfuf = this;
      Object localObject1 = localObject3;
      do
      {
        while (zzba.zzf(localzzfuf, localObject1, localObject2))
        {
          zzy(localzzfuf, paramBoolean);
          if ((localObject1 instanceof zzfuf.zzf))
          {
            localObject1 = ((zzfuf.zzf)localObject1).zzb;
            if ((localObject1 instanceof zzfuf.zzh))
            {
              localzzfuf = (zzfuf)localObject1;
              localObject1 = localzzfuf.value;
              if (localObject1 == null) {
                bool1 = true;
              } else {
                bool1 = false;
              }
              if ((bool1 | localObject1 instanceof zzfuf.zzf)) {
                bool2 = true;
              }
            }
            else
            {
              ((zzfwb)localObject1).cancel(paramBoolean);
            }
          }
          return true;
        }
        localObject3 = localzzfuf.value;
        localObject1 = localObject3;
      } while ((localObject3 instanceof zzfuf.zzf));
    }
    return bool2;
  }
  
  public Object get()
    throws InterruptedException, ExecutionException
  {
    if (!Thread.interrupted())
    {
      Object localObject1 = this.value;
      int i;
      if (localObject1 != null) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i & (localObject1 instanceof zzfuf.zzf ^ true)) != 0) {
        return zzB(localObject1);
      }
      localObject1 = this.waiters;
      if (localObject1 != zzfuf.zzk.zza)
      {
        zzfuf.zzk localzzk = new zzfuf.zzk();
        Object localObject2;
        do
        {
          localObject2 = zzba;
          ((zzfuf.zza)localObject2).zzc(localzzk, (zzfuf.zzk)localObject1);
          if (((zzfuf.zza)localObject2).zzg(this, (zzfuf.zzk)localObject1, localzzk))
          {
            do
            {
              LockSupport.park(this);
              if (Thread.interrupted()) {
                break;
              }
              localObject1 = this.value;
              if (localObject1 != null) {
                i = 1;
              } else {
                i = 0;
              }
            } while ((i & (localObject1 instanceof zzfuf.zzf ^ true)) == 0);
            return zzB(localObject1);
            zzA(localzzk);
            throw new InterruptedException();
          }
          localObject2 = this.waiters;
          localObject1 = localObject2;
        } while (localObject2 != zzfuf.zzk.zza);
      }
      localObject1 = this.value;
      localObject1.getClass();
      return zzB(localObject1);
    }
    throw new InterruptedException();
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, TimeoutException, ExecutionException
  {
    long l3 = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted())
    {
      Object localObject1 = this.value;
      int j = 1;
      int i;
      if (localObject1 != null) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i & (localObject1 instanceof zzfuf.zzf ^ true)) != 0) {
        return zzB(localObject1);
      }
      long l2;
      if (l3 > 0L) {
        l2 = System.nanoTime() + l3;
      } else {
        l2 = 0L;
      }
      long l1 = l3;
      if (l3 >= 1000L)
      {
        localObject1 = this.waiters;
        if (localObject1 != zzfuf.zzk.zza)
        {
          localObject3 = new zzfuf.zzk();
          do
          {
            localObject2 = zzba;
            ((zzfuf.zza)localObject2).zzc((zzfuf.zzk)localObject3, (zzfuf.zzk)localObject1);
            if (((zzfuf.zza)localObject2).zzg(this, (zzfuf.zzk)localObject1, (zzfuf.zzk)localObject3))
            {
              do
              {
                LockSupport.parkNanos(this, Math.min(l3, 2147483647999999999L));
                if (Thread.interrupted()) {
                  break;
                }
                localObject1 = this.value;
                if (localObject1 != null) {
                  i = 1;
                } else {
                  i = 0;
                }
                if ((i & (localObject1 instanceof zzfuf.zzf ^ true)) != 0) {
                  return zzB(localObject1);
                }
                l1 = l2 - System.nanoTime();
                l3 = l1;
              } while (l1 >= 1000L);
              zzA((zzfuf.zzk)localObject3);
              break;
              zzA((zzfuf.zzk)localObject3);
              throw new InterruptedException();
            }
            localObject2 = this.waiters;
            localObject1 = localObject2;
          } while (localObject2 != zzfuf.zzk.zza);
        }
        paramTimeUnit = this.value;
        paramTimeUnit.getClass();
        return zzB(paramTimeUnit);
      }
      while (l1 > 0L)
      {
        localObject1 = this.value;
        if (localObject1 != null) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i & (localObject1 instanceof zzfuf.zzf ^ true)) != 0) {
          return zzB(localObject1);
        }
        if (!Thread.interrupted()) {
          l1 = l2 - System.nanoTime();
        } else {
          throw new InterruptedException();
        }
      }
      Object localObject3 = toString();
      String str = paramTimeUnit.toString().toLowerCase(Locale.ROOT);
      localObject1 = paramTimeUnit.toString().toLowerCase(Locale.ROOT);
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Waited ");
      ((StringBuilder)localObject2).append(paramLong);
      ((StringBuilder)localObject2).append(" ");
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = localObject2;
      if (l1 + 1000L < 0L)
      {
        localObject1 = ((String)localObject2).concat(" (plus ");
        l1 = -l1;
        paramLong = paramTimeUnit.convert(l1, TimeUnit.NANOSECONDS);
        l1 -= paramTimeUnit.toNanos(paramLong);
        boolean bool = paramLong < 0L;
        i = j;
        if (bool) {
          if (l1 > 1000L) {
            i = j;
          } else {
            i = 0;
          }
        }
        paramTimeUnit = (TimeUnit)localObject1;
        if (bool)
        {
          paramTimeUnit = new StringBuilder();
          paramTimeUnit.append((String)localObject1);
          paramTimeUnit.append(paramLong);
          paramTimeUnit.append(" ");
          paramTimeUnit.append(str);
          localObject1 = paramTimeUnit.toString();
          paramTimeUnit = (TimeUnit)localObject1;
          if (i != 0) {
            paramTimeUnit = ((String)localObject1).concat(",");
          }
          paramTimeUnit = paramTimeUnit.concat(" ");
        }
        localObject1 = paramTimeUnit;
        if (i != 0)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(paramTimeUnit);
          ((StringBuilder)localObject1).append(l1);
          ((StringBuilder)localObject1).append(" nanoseconds ");
          localObject1 = ((StringBuilder)localObject1).toString();
        }
        localObject1 = ((String)localObject1).concat("delay)");
      }
      if (isDone()) {
        throw new TimeoutException(((String)localObject1).concat(" but future completed as timeout expired"));
      }
      paramTimeUnit = new StringBuilder();
      paramTimeUnit.append((String)localObject1);
      paramTimeUnit.append(" for ");
      paramTimeUnit.append((String)localObject3);
      throw new TimeoutException(paramTimeUnit.toString());
    }
    throw new InterruptedException();
  }
  
  public boolean isCancelled()
  {
    return this.value instanceof zzfuf.zzb;
  }
  
  public boolean isDone()
  {
    Object localObject = this.value;
    boolean bool = localObject instanceof zzfuf.zzf;
    int i = 1;
    if (localObject == null) {
      i = 0;
    }
    return i & (bool ^ true);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
      localStringBuilder.append(getClass().getSimpleName());
    } else {
      localStringBuilder.append(getClass().getName());
    }
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("[status=");
    if (isCancelled()) {
      localStringBuilder.append("CANCELLED");
    } else if (isDone()) {
      zzv(localStringBuilder);
    } else {
      zzw(localStringBuilder);
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  @CheckForNull
  protected String zza()
  {
    if ((this instanceof ScheduledFuture))
    {
      long l = ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("remaining delay=[");
      localStringBuilder.append(l);
      localStringBuilder.append(" ms]");
      return localStringBuilder.toString();
    }
    return null;
  }
  
  protected void zzb() {}
  
  public void zzc(Runnable paramRunnable, Executor paramExecutor)
  {
    zzfoz.zzc(paramRunnable, "Runnable was null.");
    zzfoz.zzc(paramExecutor, "Executor was null.");
    if (!isDone())
    {
      Object localObject = this.listeners;
      if (localObject != zzfuf.zzd.zza)
      {
        zzfuf.zzd localzzd2 = new zzfuf.zzd(paramRunnable, paramExecutor);
        zzfuf.zzd localzzd1;
        do
        {
          localzzd2.next = ((zzfuf.zzd)localObject);
          if (zzba.zze(this, (zzfuf.zzd)localObject, localzzd2)) {
            return;
          }
          localzzd1 = this.listeners;
          localObject = localzzd1;
        } while (localzzd1 != zzfuf.zzd.zza);
      }
    }
    zzz(paramRunnable, paramExecutor);
  }
  
  protected boolean zzd(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = zzbd;
    }
    if (zzba.zzf(this, null, localObject))
    {
      zzy(this, false);
      return true;
    }
    return false;
  }
  
  protected boolean zze(Throwable paramThrowable)
  {
    Objects.requireNonNull(paramThrowable);
    paramThrowable = new zzfuf.zzc(paramThrowable);
    if (zzba.zzf(this, null, paramThrowable))
    {
      zzy(this, false);
      return true;
    }
    return false;
  }
  
  @CheckForNull
  protected final Throwable zzm()
  {
    if ((this instanceof zzfuf.zzh))
    {
      Object localObject = this.value;
      if ((localObject instanceof zzfuf.zzc)) {
        return ((zzfuf.zzc)localObject).zzb;
      }
    }
    return null;
  }
  
  protected void zzr() {}
  
  final void zzs(@CheckForNull Future paramFuture)
  {
    int i;
    if (paramFuture != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i & isCancelled()) != 0) {
      paramFuture.cancel(zzu());
    }
  }
  
  protected final boolean zzt(zzfwb paramzzfwb)
  {
    Objects.requireNonNull(paramzzfwb);
    Object localObject2 = this.value;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      if (paramzzfwb.isDone())
      {
        paramzzfwb = zzf(paramzzfwb);
        if (zzba.zzf(this, null, paramzzfwb))
        {
          zzy(this, false);
          return true;
        }
        return false;
      }
      localObject2 = new zzfuf.zzf(this, paramzzfwb);
      if (zzba.zzf(this, null, localObject2))
      {
        try
        {
          paramzzfwb.zzc((Runnable)localObject2, zzfvf.zza);
        }
        catch (Error paramzzfwb) {}catch (RuntimeException paramzzfwb) {}
        try
        {
          localObject1 = new com/google/android/gms/internal/ads/zzfuf$zzc;
          ((zzfuf.zzc)localObject1).<init>(paramzzfwb);
          paramzzfwb = (zzfwb)localObject1;
        }
        catch (RuntimeException|Error paramzzfwb)
        {
          paramzzfwb = zzfuf.zzc.zza;
        }
        zzba.zzf(this, localObject2, paramzzfwb);
        return true;
      }
      localObject1 = this.value;
    }
    if ((localObject1 instanceof zzfuf.zzb)) {
      paramzzfwb.cancel(((zzfuf.zzb)localObject1).zzc);
    }
    return false;
  }
  
  protected final boolean zzu()
  {
    Object localObject = this.value;
    return ((localObject instanceof zzfuf.zzb)) && (((zzfuf.zzb)localObject).zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */