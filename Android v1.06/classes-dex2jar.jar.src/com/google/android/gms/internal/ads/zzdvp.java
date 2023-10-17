package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;

public final class zzdvp
  extends zzdvn
{
  zzdvp(Context paramContext)
  {
    this.zzf = new zzbtg(paramContext, zzt.zzt().zzb(), this, this);
  }
  
  /* Error */
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/google/android/gms/internal/ads/zzdvp:zzb	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 44	com/google/android/gms/internal/ads/zzdvp:zzd	Z
    //   11: ifne +98 -> 109
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 44	com/google/android/gms/internal/ads/zzdvp:zzd	Z
    //   19: aload_0
    //   20: getfield 30	com/google/android/gms/internal/ads/zzdvp:zzf	Lcom/google/android/gms/internal/ads/zzbtg;
    //   23: invokevirtual 48	com/google/android/gms/internal/ads/zzbtg:zzp	()Lcom/google/android/gms/internal/ads/zzbts;
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 52	com/google/android/gms/internal/ads/zzdvp:zze	Lcom/google/android/gms/internal/ads/zzbug;
    //   31: astore_2
    //   32: new 54	com/google/android/gms/internal/ads/zzdvm
    //   35: astore 4
    //   37: aload 4
    //   39: aload_0
    //   40: invokespecial 57	com/google/android/gms/internal/ads/zzdvm:<init>	(Lcom/google/android/gms/internal/ads/zzdvn;)V
    //   43: aload_3
    //   44: aload_2
    //   45: aload 4
    //   47: invokeinterface 62 3 0
    //   52: goto +57 -> 109
    //   55: astore_2
    //   56: invokestatic 66	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   59: aload_2
    //   60: ldc 68
    //   62: invokevirtual 74	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   65: aload_0
    //   66: getfield 78	com/google/android/gms/internal/ads/zzdvp:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   69: astore_3
    //   70: new 80	com/google/android/gms/internal/ads/zzdwc
    //   73: astore_2
    //   74: aload_2
    //   75: iconst_1
    //   76: invokespecial 83	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   79: aload_3
    //   80: aload_2
    //   81: invokevirtual 88	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   84: pop
    //   85: goto +24 -> 109
    //   88: astore_2
    //   89: aload_0
    //   90: getfield 78	com/google/android/gms/internal/ads/zzdvp:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   93: astore_2
    //   94: new 80	com/google/android/gms/internal/ads/zzdwc
    //   97: astore_3
    //   98: aload_3
    //   99: iconst_1
    //   100: invokespecial 83	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   103: aload_2
    //   104: aload_3
    //   105: invokevirtual 88	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   108: pop
    //   109: aload_1
    //   110: monitorexit
    //   111: return
    //   112: astore_2
    //   113: aload_1
    //   114: monitorexit
    //   115: aload_2
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zzdvp
    //   0	117	1	paramBundle	android.os.Bundle
    //   31	14	2	localzzbug	zzbug
    //   55	5	2	localThrowable	Throwable
    //   73	8	2	localzzdwc	zzdwc
    //   88	1	2	localRemoteException	android.os.RemoteException
    //   93	11	2	localzzcal	zzcal
    //   112	4	2	localObject1	Object
    //   26	79	3	localObject2	Object
    //   35	11	4	localzzdvm	zzdvm
    // Exception table:
    //   from	to	target	type
    //   19	52	55	finally
    //   19	52	88	android/os/RemoteException
    //   19	52	88	java/lang/IllegalArgumentException
    //   7	19	112	finally
    //   56	85	112	finally
    //   89	109	112	finally
    //   109	111	112	finally
    //   113	115	112	finally
  }
  
  public final zzfwb zzb(zzbug paramzzbug)
  {
    synchronized (this.zzb)
    {
      if (this.zzc)
      {
        paramzzbug = this.zza;
        return paramzzbug;
      }
      this.zzc = true;
      this.zze = paramzzbug;
      this.zzf.checkAvailabilityAndConnect();
      paramzzbug = this.zza;
      zzdvo localzzdvo = new com/google/android/gms/internal/ads/zzdvo;
      localzzdvo.<init>(this);
      paramzzbug.zzc(localzzdvo, zzcag.zzf);
      paramzzbug = this.zza;
      return paramzzbug;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */