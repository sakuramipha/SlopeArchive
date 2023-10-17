package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzfjf
  implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener
{
  private final zzfka zza;
  private final zzfju zzb;
  private final Object zzc = new Object();
  private boolean zzd = false;
  private boolean zze = false;
  
  zzfjf(Context paramContext, Looper paramLooper, zzfju paramzzfju)
  {
    this.zzb = paramzzfju;
    this.zza = new zzfka(paramContext, paramLooper, this, this, 12800000);
  }
  
  private final void zzb()
  {
    synchronized (this.zzc)
    {
      if ((this.zza.isConnected()) || (this.zza.isConnecting())) {
        this.zza.disconnect();
      }
      Binder.flushPendingCommands();
      return;
    }
  }
  
  /* Error */
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/google/android/gms/internal/ads/zzfjf:zzc	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 28	com/google/android/gms/internal/ads/zzfjf:zze	Z
    //   11: ifeq +6 -> 17
    //   14: aload_1
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 28	com/google/android/gms/internal/ads/zzfjf:zze	Z
    //   22: aload_0
    //   23: getfield 38	com/google/android/gms/internal/ads/zzfjf:zza	Lcom/google/android/gms/internal/ads/zzfka;
    //   26: invokevirtual 62	com/google/android/gms/internal/ads/zzfka:zzp	()Lcom/google/android/gms/internal/ads/zzfkf;
    //   29: astore_2
    //   30: new 64	com/google/android/gms/internal/ads/zzfjy
    //   33: astore_3
    //   34: aload_3
    //   35: aload_0
    //   36: getfield 30	com/google/android/gms/internal/ads/zzfjf:zzb	Lcom/google/android/gms/internal/ads/zzfju;
    //   39: invokevirtual 70	com/google/android/gms/internal/ads/zzgmx:zzax	()[B
    //   42: invokespecial 73	com/google/android/gms/internal/ads/zzfjy:<init>	([B)V
    //   45: aload_2
    //   46: aload_3
    //   47: invokevirtual 79	com/google/android/gms/internal/ads/zzfkf:zzg	(Lcom/google/android/gms/internal/ads/zzfjy;)V
    //   50: aload_0
    //   51: invokespecial 81	com/google/android/gms/internal/ads/zzfjf:zzb	()V
    //   54: goto +10 -> 64
    //   57: astore_2
    //   58: aload_0
    //   59: invokespecial 81	com/google/android/gms/internal/ads/zzfjf:zzb	()V
    //   62: aload_2
    //   63: athrow
    //   64: aload_1
    //   65: monitorexit
    //   66: return
    //   67: astore_2
    //   68: aload_1
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    //   72: astore_2
    //   73: goto -23 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	zzfjf
    //   0	76	1	paramBundle	android.os.Bundle
    //   29	17	2	localzzfkf	zzfkf
    //   57	6	2	localObject1	Object
    //   67	4	2	localObject2	Object
    //   72	1	2	localException	Exception
    //   33	14	3	localzzfjy	zzfjy
    // Exception table:
    //   from	to	target	type
    //   22	50	57	finally
    //   7	16	67	finally
    //   17	22	67	finally
    //   50	54	67	finally
    //   58	64	67	finally
    //   64	66	67	finally
    //   68	70	67	finally
    //   22	50	72	java/lang/Exception
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult) {}
  
  public final void onConnectionSuspended(int paramInt) {}
  
  final void zza()
  {
    synchronized (this.zzc)
    {
      if (!this.zzd)
      {
        this.zzd = true;
        this.zza.checkAvailabilityAndConnect();
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */