package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

public final class zzdvl
  extends zzdvn
{
  public zzdvl(Context paramContext)
  {
    this.zzf = new zzbtg(paramContext, zzt.zzt().zzb(), this, this);
  }
  
  /* Error */
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/google/android/gms/internal/ads/zzdvl:zzb	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 44	com/google/android/gms/internal/ads/zzdvl:zzd	Z
    //   11: ifne +97 -> 108
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 44	com/google/android/gms/internal/ads/zzdvl:zzd	Z
    //   19: aload_0
    //   20: getfield 30	com/google/android/gms/internal/ads/zzdvl:zzf	Lcom/google/android/gms/internal/ads/zzbtg;
    //   23: invokevirtual 48	com/google/android/gms/internal/ads/zzbtg:zzp	()Lcom/google/android/gms/internal/ads/zzbts;
    //   26: astore 4
    //   28: aload_0
    //   29: getfield 52	com/google/android/gms/internal/ads/zzdvl:zze	Lcom/google/android/gms/internal/ads/zzbug;
    //   32: astore_2
    //   33: new 54	com/google/android/gms/internal/ads/zzdvm
    //   36: astore_3
    //   37: aload_3
    //   38: aload_0
    //   39: invokespecial 57	com/google/android/gms/internal/ads/zzdvm:<init>	(Lcom/google/android/gms/internal/ads/zzdvn;)V
    //   42: aload 4
    //   44: aload_2
    //   45: aload_3
    //   46: invokeinterface 63 3 0
    //   51: goto +57 -> 108
    //   54: astore_2
    //   55: invokestatic 67	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   58: aload_2
    //   59: ldc 69
    //   61: invokevirtual 75	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   64: aload_0
    //   65: getfield 79	com/google/android/gms/internal/ads/zzdvl:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   68: astore_3
    //   69: new 81	com/google/android/gms/internal/ads/zzdwc
    //   72: astore_2
    //   73: aload_2
    //   74: iconst_1
    //   75: invokespecial 84	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   78: aload_3
    //   79: aload_2
    //   80: invokevirtual 89	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   83: pop
    //   84: goto +24 -> 108
    //   87: astore_2
    //   88: aload_0
    //   89: getfield 79	com/google/android/gms/internal/ads/zzdvl:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   92: astore_3
    //   93: new 81	com/google/android/gms/internal/ads/zzdwc
    //   96: astore_2
    //   97: aload_2
    //   98: iconst_1
    //   99: invokespecial 84	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   102: aload_3
    //   103: aload_2
    //   104: invokevirtual 89	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   107: pop
    //   108: aload_1
    //   109: monitorexit
    //   110: return
    //   111: astore_2
    //   112: aload_1
    //   113: monitorexit
    //   114: aload_2
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	zzdvl
    //   0	116	1	paramBundle	android.os.Bundle
    //   32	13	2	localzzbug	zzbug
    //   54	5	2	localThrowable	Throwable
    //   72	8	2	localzzdwc1	zzdwc
    //   87	1	2	localRemoteException	android.os.RemoteException
    //   96	8	2	localzzdwc2	zzdwc
    //   111	4	2	localObject1	Object
    //   36	67	3	localObject2	Object
    //   26	17	4	localzzbts	zzbts
    // Exception table:
    //   from	to	target	type
    //   19	51	54	finally
    //   19	51	87	android/os/RemoteException
    //   19	51	87	java/lang/IllegalArgumentException
    //   7	19	111	finally
    //   55	84	111	finally
    //   88	108	111	finally
    //   108	110	111	finally
    //   112	114	111	finally
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzbzt.zze("Cannot connect to remote service, fallback to local instance.");
    this.zza.zze(new zzdwc(1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */