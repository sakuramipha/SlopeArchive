package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

final class zzyn
  extends HandlerThread
  implements Handler.Callback
{
  private zzee zza;
  private Handler zzb;
  private Error zzc;
  private RuntimeException zzd;
  private zzyp zze;
  
  public zzyn()
  {
    super("ExoPlayer:PlaceholderSurface");
  }
  
  /* Error */
  public final boolean handleMessage(Message paramMessage)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 38	android/os/Message:what	I
    //   4: istore_2
    //   5: iload_2
    //   6: iconst_1
    //   7: if_icmpeq +54 -> 61
    //   10: iload_2
    //   11: iconst_2
    //   12: if_icmpeq +5 -> 17
    //   15: iconst_1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 40	com/google/android/gms/internal/ads/zzyn:zza	Lcom/google/android/gms/internal/ads/zzee;
    //   21: astore_1
    //   22: aload_1
    //   23: invokestatic 46	java/util/Objects:requireNonNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   26: pop
    //   27: aload_1
    //   28: invokevirtual 50	com/google/android/gms/internal/ads/zzee:zzc	()V
    //   31: aload_0
    //   32: invokevirtual 54	com/google/android/gms/internal/ads/zzyn:quit	()Z
    //   35: pop
    //   36: goto +15 -> 51
    //   39: astore_1
    //   40: ldc 56
    //   42: ldc 58
    //   44: aload_1
    //   45: invokestatic 63	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   48: goto -17 -> 31
    //   51: iconst_1
    //   52: ireturn
    //   53: astore_1
    //   54: aload_0
    //   55: invokevirtual 54	com/google/android/gms/internal/ads/zzyn:quit	()Z
    //   58: pop
    //   59: aload_1
    //   60: athrow
    //   61: aload_1
    //   62: getfield 66	android/os/Message:arg1	I
    //   65: istore_2
    //   66: aload_0
    //   67: getfield 40	com/google/android/gms/internal/ads/zzyn:zza	Lcom/google/android/gms/internal/ads/zzee;
    //   70: astore_1
    //   71: aload_1
    //   72: invokestatic 46	java/util/Objects:requireNonNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   75: pop
    //   76: aload_1
    //   77: iload_2
    //   78: invokevirtual 69	com/google/android/gms/internal/ads/zzee:zzb	(I)V
    //   81: new 71	com/google/android/gms/internal/ads/zzyp
    //   84: astore_1
    //   85: aload_0
    //   86: getfield 40	com/google/android/gms/internal/ads/zzyn:zza	Lcom/google/android/gms/internal/ads/zzee;
    //   89: invokevirtual 74	com/google/android/gms/internal/ads/zzee:zza	()Landroid/graphics/SurfaceTexture;
    //   92: astore 4
    //   94: iload_2
    //   95: ifeq +8 -> 103
    //   98: iconst_1
    //   99: istore_3
    //   100: goto +5 -> 105
    //   103: iconst_0
    //   104: istore_3
    //   105: aload_1
    //   106: aload_0
    //   107: aload 4
    //   109: iload_3
    //   110: aconst_null
    //   111: invokespecial 77	com/google/android/gms/internal/ads/zzyp:<init>	(Lcom/google/android/gms/internal/ads/zzyn;Landroid/graphics/SurfaceTexture;ZLcom/google/android/gms/internal/ads/zzyo;)V
    //   114: aload_0
    //   115: aload_1
    //   116: putfield 79	com/google/android/gms/internal/ads/zzyn:zze	Lcom/google/android/gms/internal/ads/zzyp;
    //   119: aload_0
    //   120: monitorenter
    //   121: aload_0
    //   122: invokevirtual 84	java/lang/Object:notify	()V
    //   125: aload_0
    //   126: monitorexit
    //   127: goto +106 -> 233
    //   130: astore_1
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_1
    //   134: athrow
    //   135: astore_1
    //   136: goto +104 -> 240
    //   139: astore_1
    //   140: ldc 56
    //   142: ldc 86
    //   144: aload_1
    //   145: invokestatic 63	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   148: aload_0
    //   149: aload_1
    //   150: putfield 88	com/google/android/gms/internal/ads/zzyn:zzc	Ljava/lang/Error;
    //   153: aload_0
    //   154: monitorenter
    //   155: aload_0
    //   156: invokevirtual 84	java/lang/Object:notify	()V
    //   159: aload_0
    //   160: monitorexit
    //   161: goto +72 -> 233
    //   164: astore_1
    //   165: aload_0
    //   166: monitorexit
    //   167: aload_1
    //   168: athrow
    //   169: astore_1
    //   170: ldc 56
    //   172: ldc 86
    //   174: aload_1
    //   175: invokestatic 63	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   178: new 90	java/lang/IllegalStateException
    //   181: astore 4
    //   183: aload 4
    //   185: aload_1
    //   186: invokespecial 93	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   189: aload_0
    //   190: aload 4
    //   192: putfield 95	com/google/android/gms/internal/ads/zzyn:zzd	Ljava/lang/RuntimeException;
    //   195: aload_0
    //   196: monitorenter
    //   197: aload_0
    //   198: invokevirtual 84	java/lang/Object:notify	()V
    //   201: aload_0
    //   202: monitorexit
    //   203: goto +30 -> 233
    //   206: astore_1
    //   207: aload_0
    //   208: monitorexit
    //   209: aload_1
    //   210: athrow
    //   211: astore_1
    //   212: ldc 56
    //   214: ldc 86
    //   216: aload_1
    //   217: invokestatic 63	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   220: aload_0
    //   221: aload_1
    //   222: putfield 95	com/google/android/gms/internal/ads/zzyn:zzd	Ljava/lang/RuntimeException;
    //   225: aload_0
    //   226: monitorenter
    //   227: aload_0
    //   228: invokevirtual 84	java/lang/Object:notify	()V
    //   231: aload_0
    //   232: monitorexit
    //   233: iconst_1
    //   234: ireturn
    //   235: astore_1
    //   236: aload_0
    //   237: monitorexit
    //   238: aload_1
    //   239: athrow
    //   240: aload_0
    //   241: monitorenter
    //   242: aload_0
    //   243: invokevirtual 84	java/lang/Object:notify	()V
    //   246: aload_0
    //   247: monitorexit
    //   248: aload_1
    //   249: athrow
    //   250: astore_1
    //   251: aload_0
    //   252: monitorexit
    //   253: aload_1
    //   254: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	this	zzyn
    //   0	255	1	paramMessage	Message
    //   4	91	2	i	int
    //   99	11	3	bool	boolean
    //   92	99	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   17	22	39	finally
    //   27	31	39	finally
    //   40	48	53	finally
    //   121	127	130	finally
    //   131	133	130	finally
    //   61	71	135	finally
    //   76	94	135	finally
    //   105	119	135	finally
    //   140	153	135	finally
    //   170	195	135	finally
    //   212	225	135	finally
    //   61	71	139	java/lang/Error
    //   76	94	139	java/lang/Error
    //   105	119	139	java/lang/Error
    //   155	161	164	finally
    //   165	167	164	finally
    //   61	71	169	com/google/android/gms/internal/ads/zzef
    //   76	94	169	com/google/android/gms/internal/ads/zzef
    //   105	119	169	com/google/android/gms/internal/ads/zzef
    //   197	203	206	finally
    //   207	209	206	finally
    //   61	71	211	java/lang/RuntimeException
    //   76	94	211	java/lang/RuntimeException
    //   105	119	211	java/lang/RuntimeException
    //   227	233	235	finally
    //   236	238	235	finally
    //   242	248	250	finally
    //   251	253	250	finally
  }
  
  public final zzyp zza(int paramInt)
  {
    start();
    this.zzb = new Handler(getLooper(), this);
    this.zza = new zzee(this.zzb, null);
    try
    {
      Object localObject1 = this.zzb;
      int i = 0;
      ((Handler)localObject1).obtainMessage(1, paramInt, 0).sendToTarget();
      paramInt = i;
      while ((this.zze == null) && (this.zzd == null))
      {
        localObject1 = this.zzc;
        if (localObject1 != null) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          paramInt = 1;
        }
      }
      if (paramInt != 0) {
        Thread.currentThread().interrupt();
      }
      Object localObject2 = this.zzd;
      if (localObject2 == null)
      {
        localObject2 = this.zzc;
        if (localObject2 == null)
        {
          localObject2 = this.zze;
          Objects.requireNonNull(localObject2);
          return (zzyp)localObject2;
        }
        throw ((Throwable)localObject2);
      }
      throw ((Throwable)localObject2);
    }
    finally {}
  }
  
  public final void zzb()
  {
    Handler localHandler = this.zzb;
    Objects.requireNonNull(localHandler);
    localHandler.sendEmptyMessage(2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */