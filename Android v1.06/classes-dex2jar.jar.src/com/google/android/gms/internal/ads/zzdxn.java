package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdxn
  extends zzdxt
{
  private zzbto zzh;
  
  zzdxn(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.zze = paramContext;
    this.zzf = zzt.zzt().zzb();
    this.zzg = paramScheduledExecutorService;
  }
  
  /* Error */
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/google/android/gms/internal/ads/zzdxn:zzc	Z
    //   6: ifne +87 -> 93
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 44	com/google/android/gms/internal/ads/zzdxn:zzc	Z
    //   14: aload_0
    //   15: getfield 48	com/google/android/gms/internal/ads/zzdxn:zzd	Lcom/google/android/gms/internal/ads/zzbtj;
    //   18: invokevirtual 54	com/google/android/gms/internal/ads/zzbtj:zzp	()Lcom/google/android/gms/internal/ads/zzbtw;
    //   21: astore_3
    //   22: aload_0
    //   23: getfield 56	com/google/android/gms/internal/ads/zzdxn:zzh	Lcom/google/android/gms/internal/ads/zzbto;
    //   26: astore_2
    //   27: new 58	com/google/android/gms/internal/ads/zzdxs
    //   30: astore_1
    //   31: aload_1
    //   32: aload_0
    //   33: invokespecial 61	com/google/android/gms/internal/ads/zzdxs:<init>	(Lcom/google/android/gms/internal/ads/zzdxt;)V
    //   36: aload_3
    //   37: aload_2
    //   38: aload_1
    //   39: invokeinterface 66 3 0
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: astore_1
    //   48: invokestatic 70	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   51: aload_1
    //   52: ldc 72
    //   54: invokevirtual 78	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   57: aload_0
    //   58: getfield 82	com/google/android/gms/internal/ads/zzdxn:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   61: aload_1
    //   62: invokevirtual 87	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   65: pop
    //   66: aload_0
    //   67: monitorexit
    //   68: return
    //   69: astore_1
    //   70: aload_0
    //   71: getfield 82	com/google/android/gms/internal/ads/zzdxn:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   74: astore_1
    //   75: new 89	com/google/android/gms/internal/ads/zzdwc
    //   78: astore_2
    //   79: aload_2
    //   80: iconst_1
    //   81: invokespecial 92	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   84: aload_1
    //   85: aload_2
    //   86: invokevirtual 87	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   89: pop
    //   90: aload_0
    //   91: monitorexit
    //   92: return
    //   93: aload_0
    //   94: monitorexit
    //   95: return
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	zzdxn
    //   0	101	1	paramBundle	android.os.Bundle
    //   26	60	2	localObject	Object
    //   21	16	3	localzzbtw	zzbtw
    // Exception table:
    //   from	to	target	type
    //   14	44	47	finally
    //   14	44	69	android/os/RemoteException
    //   2	14	96	finally
    //   48	66	96	finally
    //   70	90	96	finally
  }
  
  public final zzfwb zza(zzbto paramzzbto, long paramLong)
  {
    try
    {
      if (this.zzb)
      {
        paramzzbto = zzfvr.zzn(this.zza, paramLong, TimeUnit.MILLISECONDS, this.zzg);
        return paramzzbto;
      }
      this.zzb = true;
      this.zzh = paramzzbto;
      zzb();
      paramzzbto = zzfvr.zzn(this.zza, paramLong, TimeUnit.MILLISECONDS, this.zzg);
      zzdxm localzzdxm = new com/google/android/gms/internal/ads/zzdxm;
      localzzdxm.<init>(this);
      paramzzbto.zzc(localzzdxm, zzcag.zzf);
      return paramzzbto;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdxn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */