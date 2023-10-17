package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzfja
  implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener
{
  protected final zzfka zza;
  private final String zzb;
  private final String zzc;
  private final LinkedBlockingQueue zzd;
  private final HandlerThread zze;
  
  public zzfja(Context paramContext, String paramString1, String paramString2)
  {
    this.zzb = paramString1;
    this.zzc = paramString2;
    paramString1 = new HandlerThread("GassClient");
    this.zze = paramString1;
    paramString1.start();
    paramContext = new zzfka(paramContext, paramString1.getLooper(), this, this, 9200000);
    this.zza = paramContext;
    this.zzd = new LinkedBlockingQueue();
    paramContext.checkAvailabilityAndConnect();
  }
  
  static zzaol zza()
  {
    zzano localzzano = zzaol.zza();
    localzzano.zzD(32768L);
    return (zzaol)localzzano.zzal();
  }
  
  /* Error */
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 86	com/google/android/gms/internal/ads/zzfja:zzd	()Lcom/google/android/gms/internal/ads/zzfkf;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +78 -> 84
    //   9: new 88	com/google/android/gms/internal/ads/zzfkb
    //   12: astore_2
    //   13: aload_2
    //   14: aload_0
    //   15: getfield 24	com/google/android/gms/internal/ads/zzfja:zzb	Ljava/lang/String;
    //   18: aload_0
    //   19: getfield 26	com/google/android/gms/internal/ads/zzfja:zzc	Ljava/lang/String;
    //   22: invokespecial 91	com/google/android/gms/internal/ads/zzfkb:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_1
    //   26: aload_2
    //   27: invokevirtual 96	com/google/android/gms/internal/ads/zzfkf:zze	(Lcom/google/android/gms/internal/ads/zzfkb;)Lcom/google/android/gms/internal/ads/zzfkd;
    //   30: invokevirtual 100	com/google/android/gms/internal/ads/zzfkd:zza	()Lcom/google/android/gms/internal/ads/zzaol;
    //   33: astore_1
    //   34: aload_0
    //   35: getfield 55	com/google/android/gms/internal/ads/zzfja:zzd	Ljava/util/concurrent/LinkedBlockingQueue;
    //   38: aload_1
    //   39: invokevirtual 104	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   42: aload_0
    //   43: invokevirtual 106	com/google/android/gms/internal/ads/zzfja:zzc	()V
    //   46: aload_0
    //   47: getfield 35	com/google/android/gms/internal/ads/zzfja:zze	Landroid/os/HandlerThread;
    //   50: invokevirtual 110	android/os/HandlerThread:quit	()Z
    //   53: pop
    //   54: return
    //   55: astore_1
    //   56: aload_0
    //   57: getfield 55	com/google/android/gms/internal/ads/zzfja:zzd	Ljava/util/concurrent/LinkedBlockingQueue;
    //   60: invokestatic 111	com/google/android/gms/internal/ads/zzfja:zza	()Lcom/google/android/gms/internal/ads/zzaol;
    //   63: invokevirtual 104	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   66: goto -24 -> 42
    //   69: astore_1
    //   70: aload_0
    //   71: invokevirtual 106	com/google/android/gms/internal/ads/zzfja:zzc	()V
    //   74: aload_0
    //   75: getfield 35	com/google/android/gms/internal/ads/zzfja:zze	Landroid/os/HandlerThread;
    //   78: invokevirtual 110	android/os/HandlerThread:quit	()Z
    //   81: pop
    //   82: aload_1
    //   83: athrow
    //   84: return
    //   85: astore_1
    //   86: goto -44 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	zzfja
    //   0	89	1	paramBundle	android.os.Bundle
    //   12	15	2	localzzfkb	zzfkb
    // Exception table:
    //   from	to	target	type
    //   9	42	55	finally
    //   56	66	69	finally
    //   56	66	85	java/lang/InterruptedException
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    try
    {
      this.zzd.put(zza());
      return;
    }
    catch (InterruptedException paramConnectionResult)
    {
      for (;;) {}
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    try
    {
      this.zzd.put(zza());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final zzaol zzb(int paramInt)
  {
    Object localObject1;
    try
    {
      zzaol localzzaol = (zzaol)this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
    }
    catch (InterruptedException localInterruptedException)
    {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = zza();
    }
    return (zzaol)localObject2;
  }
  
  public final void zzc()
  {
    zzfka localzzfka = this.zza;
    if ((localzzfka != null) && ((localzzfka.isConnected()) || (this.zza.isConnecting()))) {
      this.zza.disconnect();
    }
  }
  
  protected final zzfkf zzd()
  {
    try
    {
      zzfkf localzzfkf = this.zza.zzp();
      return localzzfkf;
    }
    catch (IllegalStateException|DeadObjectException localIllegalStateException) {}
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */