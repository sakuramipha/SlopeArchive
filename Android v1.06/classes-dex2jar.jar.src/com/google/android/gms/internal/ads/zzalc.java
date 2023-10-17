package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class zzalc
  extends Thread
{
  private final BlockingQueue zza;
  private final zzalb zzb;
  private final zzaks zzc;
  private volatile boolean zzd = false;
  private final zzakz zze;
  
  public zzalc(BlockingQueue paramBlockingQueue, zzalb paramzzalb, zzaks paramzzaks, zzakz paramzzakz)
  {
    this.zza = paramBlockingQueue;
    this.zzb = paramzzalb;
    this.zzc = paramzzaks;
    this.zze = paramzzakz;
  }
  
  /* Error */
  private void zzb()
    throws InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/google/android/gms/internal/ads/zzalc:zza	Ljava/util/concurrent/BlockingQueue;
    //   4: invokeinterface 42 1 0
    //   9: checkcast 44	com/google/android/gms/internal/ads/zzali
    //   12: astore_1
    //   13: invokestatic 50	android/os/SystemClock:elapsedRealtime	()J
    //   16: pop2
    //   17: aload_1
    //   18: iconst_3
    //   19: invokevirtual 54	com/google/android/gms/internal/ads/zzali:zzt	(I)V
    //   22: aload_1
    //   23: ldc 56
    //   25: invokevirtual 60	com/google/android/gms/internal/ads/zzali:zzm	(Ljava/lang/String;)V
    //   28: aload_1
    //   29: invokevirtual 64	com/google/android/gms/internal/ads/zzali:zzw	()Z
    //   32: pop
    //   33: aload_1
    //   34: invokevirtual 67	com/google/android/gms/internal/ads/zzali:zzc	()I
    //   37: invokestatic 72	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   40: aload_0
    //   41: getfield 25	com/google/android/gms/internal/ads/zzalc:zzb	Lcom/google/android/gms/internal/ads/zzalb;
    //   44: aload_1
    //   45: invokeinterface 77 2 0
    //   50: astore_2
    //   51: aload_1
    //   52: ldc 79
    //   54: invokevirtual 60	com/google/android/gms/internal/ads/zzali:zzm	(Ljava/lang/String;)V
    //   57: aload_2
    //   58: getfield 83	com/google/android/gms/internal/ads/zzale:zze	Z
    //   61: ifeq +26 -> 87
    //   64: aload_1
    //   65: invokevirtual 86	com/google/android/gms/internal/ads/zzali:zzv	()Z
    //   68: ifeq +19 -> 87
    //   71: aload_1
    //   72: ldc 88
    //   74: invokevirtual 91	com/google/android/gms/internal/ads/zzali:zzp	(Ljava/lang/String;)V
    //   77: aload_1
    //   78: invokevirtual 94	com/google/android/gms/internal/ads/zzali:zzr	()V
    //   81: aload_1
    //   82: iconst_4
    //   83: invokevirtual 54	com/google/android/gms/internal/ads/zzali:zzt	(I)V
    //   86: return
    //   87: aload_1
    //   88: aload_2
    //   89: invokevirtual 98	com/google/android/gms/internal/ads/zzali:zzh	(Lcom/google/android/gms/internal/ads/zzale;)Lcom/google/android/gms/internal/ads/zzalo;
    //   92: astore_2
    //   93: aload_1
    //   94: ldc 100
    //   96: invokevirtual 60	com/google/android/gms/internal/ads/zzali:zzm	(Ljava/lang/String;)V
    //   99: aload_2
    //   100: getfield 105	com/google/android/gms/internal/ads/zzalo:zzb	Lcom/google/android/gms/internal/ads/zzakr;
    //   103: ifnull +26 -> 129
    //   106: aload_0
    //   107: getfield 27	com/google/android/gms/internal/ads/zzalc:zzc	Lcom/google/android/gms/internal/ads/zzaks;
    //   110: aload_1
    //   111: invokevirtual 109	com/google/android/gms/internal/ads/zzali:zzj	()Ljava/lang/String;
    //   114: aload_2
    //   115: getfield 105	com/google/android/gms/internal/ads/zzalo:zzb	Lcom/google/android/gms/internal/ads/zzakr;
    //   118: invokeinterface 114 3 0
    //   123: aload_1
    //   124: ldc 116
    //   126: invokevirtual 60	com/google/android/gms/internal/ads/zzali:zzm	(Ljava/lang/String;)V
    //   129: aload_1
    //   130: invokevirtual 119	com/google/android/gms/internal/ads/zzali:zzq	()V
    //   133: aload_0
    //   134: getfield 29	com/google/android/gms/internal/ads/zzalc:zze	Lcom/google/android/gms/internal/ads/zzakz;
    //   137: aload_1
    //   138: aload_2
    //   139: aconst_null
    //   140: invokevirtual 124	com/google/android/gms/internal/ads/zzakz:zzb	(Lcom/google/android/gms/internal/ads/zzali;Lcom/google/android/gms/internal/ads/zzalo;Ljava/lang/Runnable;)V
    //   143: aload_1
    //   144: aload_2
    //   145: invokevirtual 128	com/google/android/gms/internal/ads/zzali:zzs	(Lcom/google/android/gms/internal/ads/zzalo;)V
    //   148: aload_1
    //   149: iconst_4
    //   150: invokevirtual 54	com/google/android/gms/internal/ads/zzali:zzt	(I)V
    //   153: return
    //   154: astore_2
    //   155: goto +77 -> 232
    //   158: astore_2
    //   159: aload_2
    //   160: ldc -126
    //   162: iconst_1
    //   163: anewarray 132	java/lang/Object
    //   166: dup
    //   167: iconst_0
    //   168: aload_2
    //   169: invokevirtual 135	java/lang/Exception:toString	()Ljava/lang/String;
    //   172: aastore
    //   173: invokestatic 140	com/google/android/gms/internal/ads/zzalu:zzc	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: new 34	com/google/android/gms/internal/ads/zzalr
    //   179: astore_3
    //   180: aload_3
    //   181: aload_2
    //   182: invokespecial 143	com/google/android/gms/internal/ads/zzalr:<init>	(Ljava/lang/Throwable;)V
    //   185: invokestatic 50	android/os/SystemClock:elapsedRealtime	()J
    //   188: pop2
    //   189: aload_0
    //   190: getfield 29	com/google/android/gms/internal/ads/zzalc:zze	Lcom/google/android/gms/internal/ads/zzakz;
    //   193: aload_1
    //   194: aload_3
    //   195: invokevirtual 146	com/google/android/gms/internal/ads/zzakz:zza	(Lcom/google/android/gms/internal/ads/zzali;Lcom/google/android/gms/internal/ads/zzalr;)V
    //   198: aload_1
    //   199: invokevirtual 94	com/google/android/gms/internal/ads/zzali:zzr	()V
    //   202: aload_1
    //   203: iconst_4
    //   204: invokevirtual 54	com/google/android/gms/internal/ads/zzali:zzt	(I)V
    //   207: return
    //   208: astore_2
    //   209: invokestatic 50	android/os/SystemClock:elapsedRealtime	()J
    //   212: pop2
    //   213: aload_0
    //   214: getfield 29	com/google/android/gms/internal/ads/zzalc:zze	Lcom/google/android/gms/internal/ads/zzakz;
    //   217: aload_1
    //   218: aload_2
    //   219: invokevirtual 146	com/google/android/gms/internal/ads/zzakz:zza	(Lcom/google/android/gms/internal/ads/zzali;Lcom/google/android/gms/internal/ads/zzalr;)V
    //   222: aload_1
    //   223: invokevirtual 94	com/google/android/gms/internal/ads/zzali:zzr	()V
    //   226: aload_1
    //   227: iconst_4
    //   228: invokevirtual 54	com/google/android/gms/internal/ads/zzali:zzt	(I)V
    //   231: return
    //   232: aload_1
    //   233: iconst_4
    //   234: invokevirtual 54	com/google/android/gms/internal/ads/zzali:zzt	(I)V
    //   237: aload_2
    //   238: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	zzalc
    //   12	221	1	localzzali	zzali
    //   50	95	2	localObject1	Object
    //   154	1	2	localObject2	Object
    //   158	24	2	localException	Exception
    //   208	30	2	localzzalr1	zzalr
    //   179	16	3	localzzalr2	zzalr
    // Exception table:
    //   from	to	target	type
    //   22	81	154	finally
    //   87	129	154	finally
    //   129	148	154	finally
    //   159	202	154	finally
    //   209	226	154	finally
    //   22	81	158	java/lang/Exception
    //   87	129	158	java/lang/Exception
    //   129	148	158	java/lang/Exception
    //   22	81	208	com/google/android/gms/internal/ads/zzalr
    //   87	129	208	com/google/android/gms/internal/ads/zzalr
    //   129	148	208	com/google/android/gms/internal/ads/zzalr
  }
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      for (;;)
      {
        zzb();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      if (this.zzd)
      {
        Thread.currentThread().interrupt();
        return;
      }
      zzalu.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
    }
  }
  
  public final void zza()
  {
    this.zzd = true;
    interrupt();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzalc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */