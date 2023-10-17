package com.google.android.gms.common.internal;

import java.util.ArrayList;

public abstract class zzc<TListener>
{
  private TListener zza;
  private boolean zzb;
  final BaseGmsClient zzd;
  
  public zzc(TListener paramTListener)
  {
    Object localObject;
    this.zza = localObject;
    this.zzb = false;
  }
  
  protected abstract void zza(TListener paramTListener);
  
  protected abstract void zzc();
  
  /* Error */
  public final void zze()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 22	com/google/android/gms/common/internal/zzc:zza	Ljava/lang/Object;
    //   6: astore 4
    //   8: aload_0
    //   9: getfield 24	com/google/android/gms/common/internal/zzc:zzb	Z
    //   12: ifeq +55 -> 67
    //   15: aload_0
    //   16: invokevirtual 35	java/lang/Object:toString	()Ljava/lang/String;
    //   19: astore_2
    //   20: aload_2
    //   21: invokevirtual 41	java/lang/String:length	()I
    //   24: istore_1
    //   25: new 43	java/lang/StringBuilder
    //   28: astore_3
    //   29: aload_3
    //   30: iload_1
    //   31: bipush 47
    //   33: iadd
    //   34: invokespecial 46	java/lang/StringBuilder:<init>	(I)V
    //   37: aload_3
    //   38: ldc 48
    //   40: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: aload_3
    //   51: ldc 54
    //   53: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: ldc 56
    //   59: aload_3
    //   60: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 63	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   66: pop
    //   67: aload_0
    //   68: monitorexit
    //   69: aload 4
    //   71: ifnull +15 -> 86
    //   74: aload_0
    //   75: aload 4
    //   77: invokevirtual 65	com/google/android/gms/common/internal/zzc:zza	(Ljava/lang/Object;)V
    //   80: goto +6 -> 86
    //   83: astore_2
    //   84: aload_2
    //   85: athrow
    //   86: aload_0
    //   87: monitorenter
    //   88: aload_0
    //   89: iconst_1
    //   90: putfield 24	com/google/android/gms/common/internal/zzc:zzb	Z
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_0
    //   96: invokevirtual 68	com/google/android/gms/common/internal/zzc:zzg	()V
    //   99: return
    //   100: astore_2
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_2
    //   104: athrow
    //   105: astore_2
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	zzc
    //   24	10	1	i	int
    //   19	27	2	str	String
    //   83	2	2	localRuntimeException	RuntimeException
    //   100	4	2	localObject1	Object
    //   105	4	2	localObject2	Object
    //   28	32	3	localStringBuilder	StringBuilder
    //   6	70	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   74	80	83	java/lang/RuntimeException
    //   88	95	100	finally
    //   101	103	100	finally
    //   2	67	105	finally
    //   67	69	105	finally
    //   106	108	105	finally
  }
  
  public final void zzf()
  {
    try
    {
      this.zza = null;
      return;
    }
    finally {}
  }
  
  public final void zzg()
  {
    zzf();
    synchronized (BaseGmsClient.zzf(this.zzd))
    {
      BaseGmsClient.zzf(this.zzd).remove(this);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */