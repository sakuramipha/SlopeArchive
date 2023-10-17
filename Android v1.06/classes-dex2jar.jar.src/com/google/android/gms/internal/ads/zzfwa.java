package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class zzfwa
  extends AtomicReference
  implements Runnable
{
  private static final Runnable zza = new zzfvz(null);
  private static final Runnable zzb = new zzfvz(null);
  
  private final void zzc(Thread paramThread)
  {
    Runnable localRunnable1 = (Runnable)get();
    zzfvx localzzfvx = null;
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      if (!(localRunnable1 instanceof zzfvx))
      {
        if (localRunnable1 != zzb) {
          if (i != 0) {
            paramThread.interrupt();
          }
        }
      }
      else {
        localzzfvx = (zzfvx)localRunnable1;
      }
      k = j + 1;
      if (k > 1000)
      {
        Runnable localRunnable2 = zzb;
        if (localRunnable1 != localRunnable2)
        {
          j = i;
          if (!compareAndSet(localRunnable1, localRunnable2)) {}
        }
        else
        {
          if ((!Thread.interrupted()) && (i == 0)) {
            i = 0;
          } else {
            i = 1;
          }
          LockSupport.park(localzzfvx);
          j = i;
        }
      }
      else
      {
        Thread.yield();
        j = i;
      }
      localRunnable1 = (Runnable)get();
      i = j;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 59	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   3: astore_3
    //   4: aconst_null
    //   5: astore_2
    //   6: aload_0
    //   7: aconst_null
    //   8: aload_3
    //   9: invokevirtual 41	com/google/android/gms/internal/ads/zzfwa:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   12: ifne +4 -> 16
    //   15: return
    //   16: aload_0
    //   17: invokevirtual 62	com/google/android/gms/internal/ads/zzfwa:zzg	()Z
    //   20: iconst_1
    //   21: ixor
    //   22: istore_1
    //   23: iload_1
    //   24: ifeq +65 -> 89
    //   27: aload_0
    //   28: invokevirtual 64	com/google/android/gms/internal/ads/zzfwa:zza	()Ljava/lang/Object;
    //   31: astore_2
    //   32: goto +57 -> 89
    //   35: astore_2
    //   36: aload_2
    //   37: invokestatic 69	com/google/android/gms/internal/ads/zzfwj:zza	(Ljava/lang/Throwable;)V
    //   40: aload_0
    //   41: aload_3
    //   42: getstatic 19	com/google/android/gms/internal/ads/zzfwa:zza	Ljava/lang/Runnable;
    //   45: invokevirtual 41	com/google/android/gms/internal/ads/zzfwa:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   48: ifne +8 -> 56
    //   51: aload_0
    //   52: aload_3
    //   53: invokespecial 71	com/google/android/gms/internal/ads/zzfwa:zzc	(Ljava/lang/Thread;)V
    //   56: aload_0
    //   57: aload_2
    //   58: invokevirtual 74	com/google/android/gms/internal/ads/zzfwa:zzd	(Ljava/lang/Throwable;)V
    //   61: return
    //   62: astore_2
    //   63: aload_0
    //   64: aload_3
    //   65: getstatic 19	com/google/android/gms/internal/ads/zzfwa:zza	Ljava/lang/Runnable;
    //   68: invokevirtual 41	com/google/android/gms/internal/ads/zzfwa:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   71: ifeq +6 -> 77
    //   74: goto +8 -> 82
    //   77: aload_0
    //   78: aload_3
    //   79: invokespecial 71	com/google/android/gms/internal/ads/zzfwa:zzc	(Ljava/lang/Thread;)V
    //   82: aload_0
    //   83: aconst_null
    //   84: invokevirtual 77	com/google/android/gms/internal/ads/zzfwa:zze	(Ljava/lang/Object;)V
    //   87: aload_2
    //   88: athrow
    //   89: aload_0
    //   90: aload_3
    //   91: getstatic 19	com/google/android/gms/internal/ads/zzfwa:zza	Ljava/lang/Runnable;
    //   94: invokevirtual 41	com/google/android/gms/internal/ads/zzfwa:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   97: ifne +8 -> 105
    //   100: aload_0
    //   101: aload_3
    //   102: invokespecial 71	com/google/android/gms/internal/ads/zzfwa:zzc	(Ljava/lang/Thread;)V
    //   105: iload_1
    //   106: ifeq +8 -> 114
    //   109: aload_0
    //   110: aload_2
    //   111: invokevirtual 77	com/google/android/gms/internal/ads/zzfwa:zze	(Ljava/lang/Object;)V
    //   114: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zzfwa
    //   22	84	1	bool	boolean
    //   5	27	2	localObject1	Object
    //   35	23	2	localThrowable	Throwable
    //   62	49	2	localObject2	Object
    //   3	99	3	localThread	Thread
    // Exception table:
    //   from	to	target	type
    //   27	32	35	finally
    //   36	40	62	finally
  }
  
  public final String toString()
  {
    Object localObject = (Runnable)get();
    if (localObject == zza)
    {
      localObject = "running=[DONE]";
    }
    else if ((localObject instanceof zzfvx))
    {
      localObject = "running=[INTERRUPTED]";
    }
    else if ((localObject instanceof Thread))
    {
      str = ((Thread)localObject).getName();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("running=[RUNNING ON ");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("]");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "running=[NOT STARTED YET]";
    }
    String str = zzb();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", ");
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  abstract Object zza()
    throws Exception;
  
  abstract String zzb();
  
  abstract void zzd(Throwable paramThrowable);
  
  abstract void zze(Object paramObject);
  
  abstract boolean zzg();
  
  final void zzh()
  {
    Runnable localRunnable = (Runnable)get();
    if ((localRunnable instanceof Thread))
    {
      Object localObject1 = new zzfvx(this, null);
      zzfvx.zza((zzfvx)localObject1, Thread.currentThread());
      if (compareAndSet(localRunnable, localObject1)) {
        try
        {
          localObject1 = (Thread)localRunnable;
          ((Thread)localObject1).interrupt();
          if ((Runnable)getAndSet(zza) == zzb)
          {
            LockSupport.unpark((Thread)localObject1);
            return;
          }
        }
        finally
        {
          if ((Runnable)getAndSet(zza) == zzb) {
            LockSupport.unpark((Thread)localRunnable);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */