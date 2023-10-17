package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbz
  extends zzce
{
  private final AtomicReference zza = new AtomicReference();
  private boolean zzb;
  
  public static final Object zze(Bundle paramBundle, Class paramClass)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.get("r");
      localObject1 = localObject2;
      if (paramBundle != null) {
        try
        {
          localObject1 = paramClass.cast(paramBundle);
        }
        catch (ClassCastException localClassCastException)
        {
          Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[] { paramClass.getCanonicalName(), paramBundle.getClass().getCanonicalName() }), localClassCastException);
          throw localClassCastException;
        }
      }
    }
    return localClassCastException;
  }
  
  public final Bundle zzb(long paramLong)
  {
    synchronized (this.zza)
    {
      boolean bool = this.zzb;
      if (!bool) {
        try
        {
          this.zza.wait(paramLong);
        }
        catch (InterruptedException localInterruptedException)
        {
          return null;
        }
      }
      Bundle localBundle = (Bundle)this.zza.get();
      return localBundle;
    }
  }
  
  public final String zzc(long paramLong)
  {
    return (String)zze(zzb(paramLong), String.class);
  }
  
  /* Error */
  public final void zzd(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 17	com/google/android/gms/internal/measurement/zzbz:zza	Ljava/util/concurrent/atomic/AtomicReference;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 17	com/google/android/gms/internal/measurement/zzbz:zza	Ljava/util/concurrent/atomic/AtomicReference;
    //   11: aload_1
    //   12: invokevirtual 86	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield 67	com/google/android/gms/internal/measurement/zzbz:zzb	Z
    //   20: aload_0
    //   21: getfield 17	com/google/android/gms/internal/measurement/zzbz:zza	Ljava/util/concurrent/atomic/AtomicReference;
    //   24: invokevirtual 89	java/lang/Object:notify	()V
    //   27: aload_2
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: getfield 17	com/google/android/gms/internal/measurement/zzbz:zza	Ljava/util/concurrent/atomic/AtomicReference;
    //   35: invokevirtual 89	java/lang/Object:notify	()V
    //   38: aload_1
    //   39: athrow
    //   40: astore_1
    //   41: aload_2
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	zzbz
    //   0	45	1	paramBundle	Bundle
    //   4	38	2	localAtomicReference	AtomicReference
    // Exception table:
    //   from	to	target	type
    //   7	20	30	finally
    //   20	29	40	finally
    //   31	40	40	finally
    //   41	43	40	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */