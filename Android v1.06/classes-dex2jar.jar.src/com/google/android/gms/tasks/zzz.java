package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class zzz
  implements Runnable
{
  final zzw zza;
  
  zzz(zzw paramzzw, Callable paramCallable) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	com/google/android/gms/tasks/zzz:zza	Lcom/google/android/gms/tasks/zzw;
    //   4: aload_0
    //   5: getfield 16	com/google/android/gms/tasks/zzz:zzb	Ljava/util/concurrent/Callable;
    //   8: invokeinterface 29 1 0
    //   13: invokevirtual 34	com/google/android/gms/tasks/zzw:zzb	(Ljava/lang/Object;)V
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: getfield 14	com/google/android/gms/tasks/zzz:zza	Lcom/google/android/gms/tasks/zzw;
    //   22: new 36	java/lang/RuntimeException
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 39	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   30: invokevirtual 42	com/google/android/gms/tasks/zzw:zza	(Ljava/lang/Exception;)V
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 14	com/google/android/gms/tasks/zzz:zza	Lcom/google/android/gms/tasks/zzw;
    //   39: aload_1
    //   40: invokevirtual 42	com/google/android/gms/tasks/zzw:zza	(Ljava/lang/Exception;)V
    //   43: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	zzz
    //   17	10	1	localThrowable	Throwable
    //   34	6	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	16	17	finally
    //   0	16	34	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */