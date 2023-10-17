package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class AdvertisingIdClient
{
  BlockingServiceConnection zza;
  zzf zzb;
  boolean zzc;
  final Object zzd = new Object();
  zzb zze;
  final long zzf;
  private final Context zzg;
  
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L, false, false);
  }
  
  public AdvertisingIdClient(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    Preconditions.checkNotNull(paramContext);
    Object localObject = paramContext;
    if (paramBoolean1)
    {
      Context localContext = paramContext.getApplicationContext();
      localObject = paramContext;
      if (localContext != null) {
        localObject = localContext;
      }
    }
    this.zzg = ((Context)localObject);
    this.zzc = false;
    this.zzf = paramLong;
  }
  
  public static Info getAdvertisingIdInfo(Context paramContext)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    paramContext = new AdvertisingIdClient(paramContext, -1L, true, false);
    try
    {
      long l = SystemClock.elapsedRealtime();
      paramContext.zzb(false);
      Info localInfo = paramContext.zzd(-1);
      paramContext.zzc(localInfo, true, 0.0F, SystemClock.elapsedRealtime() - l, "", null);
      paramContext.zza();
      return localInfo;
    }
    finally
    {
      try
      {
        paramContext.zzc(null, true, 0.0F, -1L, "", localThrowable);
        throw localThrowable;
      }
      finally
      {
        paramContext.zza();
      }
    }
  }
  
  /* Error */
  public static boolean getIsAdIdFakeForDebugLogging(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    // Byte code:
    //   0: new 2	com/google/android/gms/ads/identifier/AdvertisingIdClient
    //   3: dup
    //   4: aload_0
    //   5: ldc2_w 64
    //   8: iconst_0
    //   9: iconst_0
    //   10: invokespecial 29	com/google/android/gms/ads/identifier/AdvertisingIdClient:<init>	(Landroid/content/Context;JZZ)V
    //   13: astore_0
    //   14: aload_0
    //   15: iconst_0
    //   16: invokevirtual 74	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	(Z)V
    //   19: ldc 93
    //   21: invokestatic 97	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   30: ifne +86 -> 116
    //   33: aload_0
    //   34: getfield 35	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzd	Ljava/lang/Object;
    //   37: astore_2
    //   38: aload_2
    //   39: monitorenter
    //   40: aload_0
    //   41: getfield 99	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/ads/identifier/zzb;
    //   44: astore_3
    //   45: aload_3
    //   46: ifnull +53 -> 99
    //   49: aload_3
    //   50: getfield 103	com/google/android/gms/ads/identifier/zzb:zzb	Z
    //   53: ifeq +46 -> 99
    //   56: aload_2
    //   57: monitorexit
    //   58: aload_0
    //   59: iconst_0
    //   60: invokevirtual 74	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	(Z)V
    //   63: aload_0
    //   64: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   67: ifeq +6 -> 73
    //   70: goto +46 -> 116
    //   73: new 57	java/io/IOException
    //   76: astore_2
    //   77: aload_2
    //   78: ldc 105
    //   80: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   83: aload_2
    //   84: athrow
    //   85: astore_3
    //   86: new 57	java/io/IOException
    //   89: astore_2
    //   90: aload_2
    //   91: ldc 105
    //   93: aload_3
    //   94: invokespecial 110	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: aload_2
    //   98: athrow
    //   99: new 57	java/io/IOException
    //   102: astore_3
    //   103: aload_3
    //   104: ldc 112
    //   106: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   109: aload_3
    //   110: athrow
    //   111: astore_3
    //   112: aload_2
    //   113: monitorexit
    //   114: aload_3
    //   115: athrow
    //   116: aload_0
    //   117: getfield 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   120: invokestatic 41	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload_0
    //   125: getfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   128: invokestatic 41	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: getfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   136: invokeinterface 121 1 0
    //   141: istore_1
    //   142: aload_0
    //   143: monitorexit
    //   144: aload_0
    //   145: invokespecial 123	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	()V
    //   148: aload_0
    //   149: invokevirtual 84	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	()V
    //   152: iload_1
    //   153: ireturn
    //   154: astore_2
    //   155: ldc 125
    //   157: ldc 127
    //   159: aload_2
    //   160: invokestatic 133	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   163: pop
    //   164: new 57	java/io/IOException
    //   167: astore_2
    //   168: aload_2
    //   169: ldc -121
    //   171: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   174: aload_2
    //   175: athrow
    //   176: astore_2
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_2
    //   180: athrow
    //   181: astore_2
    //   182: aload_0
    //   183: invokevirtual 84	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	()V
    //   186: aload_2
    //   187: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	paramContext	Context
    //   141	12	1	bool	boolean
    //   154	6	2	localRemoteException	android.os.RemoteException
    //   167	8	2	localIOException1	IOException
    //   176	4	2	localObject2	Object
    //   181	6	2	localObject3	Object
    //   44	6	3	localzzb	zzb
    //   85	9	3	localException	Exception
    //   102	8	3	localIOException2	IOException
    //   111	4	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   58	63	85	java/lang/Exception
    //   40	45	111	finally
    //   49	58	111	finally
    //   99	111	111	finally
    //   112	114	111	finally
    //   132	142	154	android/os/RemoteException
    //   26	40	176	finally
    //   58	63	176	finally
    //   63	70	176	finally
    //   73	85	176	finally
    //   86	99	176	finally
    //   114	116	176	finally
    //   116	132	176	finally
    //   132	142	176	finally
    //   142	144	176	finally
    //   155	176	176	finally
    //   177	179	176	finally
    //   14	26	181	finally
    //   144	148	181	finally
    //   179	181	181	finally
  }
  
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean) {}
  
  /* Error */
  private final Info zzd(int paramInt)
    throws IOException
  {
    // Byte code:
    //   0: ldc 93
    //   2: invokestatic 97	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   11: ifne +86 -> 97
    //   14: aload_0
    //   15: getfield 35	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzd	Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_2
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 99	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/ads/identifier/zzb;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnull +53 -> 80
    //   30: aload_3
    //   31: getfield 103	com/google/android/gms/ads/identifier/zzb:zzb	Z
    //   34: ifeq +46 -> 80
    //   37: aload_2
    //   38: monitorexit
    //   39: aload_0
    //   40: iconst_0
    //   41: invokevirtual 74	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	(Z)V
    //   44: aload_0
    //   45: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   48: ifeq +6 -> 54
    //   51: goto +46 -> 97
    //   54: new 57	java/io/IOException
    //   57: astore_2
    //   58: aload_2
    //   59: ldc 105
    //   61: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   64: aload_2
    //   65: athrow
    //   66: astore_3
    //   67: new 57	java/io/IOException
    //   70: astore_2
    //   71: aload_2
    //   72: ldc 105
    //   74: aload_3
    //   75: invokespecial 110	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   78: aload_2
    //   79: athrow
    //   80: new 57	java/io/IOException
    //   83: astore_3
    //   84: aload_3
    //   85: ldc 112
    //   87: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   90: aload_3
    //   91: athrow
    //   92: astore_3
    //   93: aload_2
    //   94: monitorexit
    //   95: aload_3
    //   96: athrow
    //   97: aload_0
    //   98: getfield 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   101: invokestatic 41	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: aload_0
    //   106: getfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   109: invokestatic 41	com/google/android/gms/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   112: pop
    //   113: new 6	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   116: astore_2
    //   117: aload_2
    //   118: aload_0
    //   119: getfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   122: invokeinterface 139 1 0
    //   127: aload_0
    //   128: getfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   131: iconst_1
    //   132: invokeinterface 142 2 0
    //   137: invokespecial 145	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_0
    //   143: invokespecial 123	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	()V
    //   146: aload_2
    //   147: areturn
    //   148: astore_2
    //   149: ldc 125
    //   151: ldc 127
    //   153: aload_2
    //   154: invokestatic 133	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   157: pop
    //   158: new 57	java/io/IOException
    //   161: astore_2
    //   162: aload_2
    //   163: ldc -121
    //   165: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   168: aload_2
    //   169: athrow
    //   170: astore_2
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_2
    //   174: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	AdvertisingIdClient
    //   0	175	1	paramInt	int
    //   148	6	2	localRemoteException	android.os.RemoteException
    //   161	8	2	localIOException1	IOException
    //   170	4	2	localObject2	Object
    //   25	6	3	localzzb	zzb
    //   66	9	3	localException	Exception
    //   83	8	3	localIOException2	IOException
    //   92	4	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   39	44	66	java/lang/Exception
    //   21	26	92	finally
    //   30	39	92	finally
    //   80	92	92	finally
    //   93	95	92	finally
    //   113	140	148	android/os/RemoteException
    //   7	21	170	finally
    //   39	44	170	finally
    //   44	51	170	finally
    //   54	66	170	finally
    //   67	80	170	finally
    //   95	97	170	finally
    //   97	113	170	finally
    //   113	140	170	finally
    //   140	142	170	finally
    //   149	170	170	finally
    //   171	173	170	finally
  }
  
  private final void zze()
  {
    zzb localzzb;
    synchronized (this.zzd)
    {
      localzzb = this.zze;
      if (localzzb != null) {
        localzzb.zza.countDown();
      }
    }
    try
    {
      this.zze.join();
      long l = this.zzf;
      if (l > 0L)
      {
        localzzb = new com/google/android/gms/ads/identifier/zzb;
        localzzb.<init>(this, l);
        this.zze = localzzb;
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  protected final void finalize()
    throws Throwable
  {
    zza();
    super.finalize();
  }
  
  public Info getInfo()
    throws IOException
  {
    return zzd(-1);
  }
  
  public void start()
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    zzb(true);
  }
  
  /* Error */
  public final void zza()
  {
    // Byte code:
    //   0: ldc 93
    //   2: invokestatic 97	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 49	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Landroid/content/Context;
    //   11: ifnull +67 -> 78
    //   14: aload_0
    //   15: getfield 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull +6 -> 26
    //   23: goto +55 -> 78
    //   26: aload_0
    //   27: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   30: ifeq +30 -> 60
    //   33: invokestatic 175	com/google/android/gms/common/stats/ConnectionTracker:getInstance	()Lcom/google/android/gms/common/stats/ConnectionTracker;
    //   36: aload_0
    //   37: getfield 49	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Landroid/content/Context;
    //   40: aload_0
    //   41: getfield 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   44: invokevirtual 179	com/google/android/gms/common/stats/ConnectionTracker:unbindService	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   47: goto +13 -> 60
    //   50: astore_1
    //   51: ldc 125
    //   53: ldc -75
    //   55: aload_1
    //   56: invokestatic 133	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	AdvertisingIdClient
    //   18	2	1	localBlockingServiceConnection	BlockingServiceConnection
    //   50	6	1	localThrowable	Throwable
    //   81	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	47	50	finally
    //   7	19	81	finally
    //   51	60	81	finally
    //   60	77	81	finally
    //   78	80	81	finally
    //   82	84	81	finally
  }
  
  /* Error */
  protected final void zzb(boolean paramBoolean)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    // Byte code:
    //   0: ldc 93
    //   2: invokestatic 97	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   11: ifeq +7 -> 18
    //   14: aload_0
    //   15: invokevirtual 84	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	()V
    //   18: aload_0
    //   19: getfield 49	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Landroid/content/Context;
    //   22: astore 5
    //   24: aload 5
    //   26: invokevirtual 187	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   29: ldc -67
    //   31: iconst_0
    //   32: invokevirtual 195	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   35: pop
    //   36: invokestatic 200	com/google/android/gms/common/GoogleApiAvailabilityLight:getInstance	()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;
    //   39: aload 5
    //   41: ldc -55
    //   43: invokevirtual 205	com/google/android/gms/common/GoogleApiAvailabilityLight:isGooglePlayServicesAvailable	(Landroid/content/Context;I)I
    //   46: istore_2
    //   47: iload_2
    //   48: ifeq +26 -> 74
    //   51: iload_2
    //   52: iconst_2
    //   53: if_icmpne +6 -> 59
    //   56: goto +18 -> 74
    //   59: new 57	java/io/IOException
    //   62: astore 4
    //   64: aload 4
    //   66: ldc -49
    //   68: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   71: aload 4
    //   73: athrow
    //   74: new 209	com/google/android/gms/common/BlockingServiceConnection
    //   77: astore 4
    //   79: aload 4
    //   81: invokespecial 210	com/google/android/gms/common/BlockingServiceConnection:<init>	()V
    //   84: new 212	android/content/Intent
    //   87: astore 6
    //   89: aload 6
    //   91: ldc -42
    //   93: invokespecial 215	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   96: aload 6
    //   98: ldc -39
    //   100: invokevirtual 221	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   103: pop
    //   104: invokestatic 175	com/google/android/gms/common/stats/ConnectionTracker:getInstance	()Lcom/google/android/gms/common/stats/ConnectionTracker;
    //   107: aload 5
    //   109: aload 6
    //   111: aload 4
    //   113: iconst_1
    //   114: invokevirtual 225	com/google/android/gms/common/stats/ConnectionTracker:bindService	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   117: istore_3
    //   118: iload_3
    //   119: ifeq +81 -> 200
    //   122: aload_0
    //   123: aload 4
    //   125: putfield 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   128: aload 4
    //   130: ldc2_w 226
    //   133: getstatic 233	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   136: invokevirtual 237	com/google/android/gms/common/BlockingServiceConnection:getServiceWithTimeout	(JLjava/util/concurrent/TimeUnit;)Landroid/os/IBinder;
    //   139: invokestatic 242	com/google/android/gms/internal/ads_identifier/zze:zza	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   142: astore 4
    //   144: aload_0
    //   145: aload 4
    //   147: putfield 116	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzb	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   150: aload_0
    //   151: iconst_1
    //   152: putfield 51	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzc	Z
    //   155: iload_1
    //   156: ifeq +7 -> 163
    //   159: aload_0
    //   160: invokespecial 123	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	()V
    //   163: aload_0
    //   164: monitorexit
    //   165: return
    //   166: astore 5
    //   168: new 57	java/io/IOException
    //   171: astore 4
    //   173: aload 4
    //   175: aload 5
    //   177: invokespecial 245	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   180: aload 4
    //   182: athrow
    //   183: astore 4
    //   185: new 57	java/io/IOException
    //   188: astore 4
    //   190: aload 4
    //   192: ldc -9
    //   194: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   197: aload 4
    //   199: athrow
    //   200: new 57	java/io/IOException
    //   203: astore 4
    //   205: aload 4
    //   207: ldc -7
    //   209: invokespecial 107	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   212: aload 4
    //   214: athrow
    //   215: astore 4
    //   217: new 57	java/io/IOException
    //   220: astore 5
    //   222: aload 5
    //   224: aload 4
    //   226: invokespecial 245	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   229: aload 5
    //   231: athrow
    //   232: astore 4
    //   234: new 61	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   237: astore 4
    //   239: aload 4
    //   241: bipush 9
    //   243: invokespecial 252	com/google/android/gms/common/GooglePlayServicesNotAvailableException:<init>	(I)V
    //   246: aload 4
    //   248: athrow
    //   249: astore 4
    //   251: aload_0
    //   252: monitorexit
    //   253: aload 4
    //   255: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	256	0	this	AdvertisingIdClient
    //   0	256	1	paramBoolean	boolean
    //   46	8	2	i	int
    //   117	2	3	bool	boolean
    //   62	119	4	localObject1	Object
    //   183	1	4	localInterruptedException	InterruptedException
    //   188	25	4	localIOException1	IOException
    //   215	10	4	localThrowable1	Throwable
    //   232	1	4	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   237	10	4	localGooglePlayServicesNotAvailableException	GooglePlayServicesNotAvailableException
    //   249	5	4	localObject2	Object
    //   22	86	5	localContext	Context
    //   166	10	5	localThrowable2	Throwable
    //   220	10	5	localIOException2	IOException
    //   87	23	6	localIntent	android.content.Intent
    // Exception table:
    //   from	to	target	type
    //   128	144	166	finally
    //   128	144	183	java/lang/InterruptedException
    //   104	118	215	finally
    //   24	36	232	android/content/pm/PackageManager$NameNotFoundException
    //   7	18	249	finally
    //   18	24	249	finally
    //   24	36	249	finally
    //   36	47	249	finally
    //   59	74	249	finally
    //   74	104	249	finally
    //   122	128	249	finally
    //   144	155	249	finally
    //   159	163	249	finally
    //   163	165	249	finally
    //   168	183	249	finally
    //   185	200	249	finally
    //   200	215	249	finally
    //   217	232	249	finally
    //   234	249	249	finally
    //   251	253	249	finally
  }
  
  final boolean zzc(Info paramInfo, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable)
  {
    if (Math.random() <= 0.0D)
    {
      HashMap localHashMap = new HashMap();
      paramString = "1";
      localHashMap.put("app_context", "1");
      if (paramInfo != null)
      {
        if (true != paramInfo.isLimitAdTrackingEnabled()) {
          paramString = "0";
        }
        localHashMap.put("limit_ad_tracking", paramString);
        paramInfo = paramInfo.getId();
        if (paramInfo != null) {
          localHashMap.put("ad_id_size", Integer.toString(paramInfo.length()));
        }
      }
      if (paramThrowable != null) {
        localHashMap.put("error", paramThrowable.getClass().getName());
      }
      localHashMap.put("tag", "AdvertisingIdClient");
      localHashMap.put("time_spent", Long.toString(paramLong));
      new zza(this, localHashMap).start();
      return true;
    }
    return false;
  }
  
  public static final class Info
  {
    private final String zza;
    private final boolean zzb;
    
    @Deprecated
    public Info(String paramString, boolean paramBoolean)
    {
      this.zza = paramString;
      this.zzb = paramBoolean;
    }
    
    public String getId()
    {
      return this.zza;
    }
    
    public boolean isLimitAdTrackingEnabled()
    {
      return this.zzb;
    }
    
    public String toString()
    {
      String str = this.zza;
      boolean bool = this.zzb;
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
      localStringBuilder.append("{");
      localStringBuilder.append(str);
      localStringBuilder.append("}");
      localStringBuilder.append(bool);
      return localStringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\identifier\AdvertisingIdClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */