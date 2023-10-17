package androidx.core.location;

import android.content.Context;
import android.location.GnssStatus;
import android.location.GnssStatus.Callback;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class LocationManagerCompat
{
  private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000L;
  private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000L;
  private static final long PRE_N_LOOPER_TIMEOUT_S = 5L;
  private static Field sContextField;
  private static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap();
  
  public static void getCurrentLocation(LocationManager paramLocationManager, String paramString, androidx.core.os.CancellationSignal paramCancellationSignal, Executor paramExecutor, androidx.core.util.Consumer<Location> paramConsumer)
  {
    if (Build.VERSION.SDK_INT >= 30)
    {
      Api30Impl.getCurrentLocation(paramLocationManager, paramString, paramCancellationSignal, paramExecutor, paramConsumer);
    }
    else
    {
      if (paramCancellationSignal != null) {
        paramCancellationSignal.throwIfCanceled();
      }
      final Location localLocation = paramLocationManager.getLastKnownLocation(paramString);
      if ((localLocation != null) && (SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(localLocation) < 10000L))
      {
        paramExecutor.execute(new Runnable()
        {
          public void run()
          {
            LocationManagerCompat.this.accept(localLocation);
          }
        });
        return;
      }
      paramExecutor = new CancellableLocationListener(paramLocationManager, paramExecutor, paramConsumer);
      paramLocationManager.requestLocationUpdates(paramString, 0L, 0.0F, paramExecutor, Looper.getMainLooper());
      if (paramCancellationSignal != null) {
        paramCancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener()
        {
          public void onCancel()
          {
            LocationManagerCompat.this.cancel();
          }
        });
      }
      paramExecutor.startTimeout(30000L);
    }
  }
  
  public static String getGnssHardwareModelName(LocationManager paramLocationManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getGnssHardwareModelName(paramLocationManager);
    }
    return null;
  }
  
  public static int getGnssYearOfHardware(LocationManager paramLocationManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getGnssYearOfHardware(paramLocationManager);
    }
    return 0;
  }
  
  public static boolean isLocationEnabled(LocationManager paramLocationManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.isLocationEnabled(paramLocationManager);
    }
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = false;
    if (i <= 19) {
      try
      {
        if (sContextField == null)
        {
          localObject = LocationManager.class.getDeclaredField("mContext");
          sContextField = (Field)localObject;
          ((Field)localObject).setAccessible(true);
        }
        Object localObject = (Context)sContextField.get(paramLocationManager);
        if (localObject != null)
        {
          if (Build.VERSION.SDK_INT == 19)
          {
            if (Settings.Secure.getInt(((Context)localObject).getContentResolver(), "location_mode", 0) != 0) {
              bool1 = true;
            }
            return bool1;
          }
          bool1 = TextUtils.isEmpty(Settings.Secure.getString(((Context)localObject).getContentResolver(), "location_providers_allowed"));
          return bool1 ^ true;
        }
      }
      catch (ClassCastException|SecurityException|NoSuchFieldException|IllegalAccessException localClassCastException) {}
    }
    if (!paramLocationManager.isProviderEnabled("network"))
    {
      bool1 = bool2;
      if (!paramLocationManager.isProviderEnabled("gps")) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  /* Error */
  private static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    // Byte code:
    //   0: getstatic 88	android/os/Build$VERSION:SDK_INT	I
    //   3: istore 4
    //   5: iconst_1
    //   6: istore 6
    //   8: iconst_1
    //   9: istore 5
    //   11: iconst_1
    //   12: istore 7
    //   14: iload 4
    //   16: bipush 30
    //   18: if_icmplt +72 -> 90
    //   21: getstatic 77	androidx/core/location/LocationManagerCompat:sGnssStatusListeners	Landroidx/collection/SimpleArrayMap;
    //   24: astore 16
    //   26: aload 16
    //   28: monitorenter
    //   29: aload 16
    //   31: aload_3
    //   32: invokevirtual 230	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   35: checkcast 27	androidx/core/location/LocationManagerCompat$GnssStatusTransport
    //   38: astore 15
    //   40: aload 15
    //   42: astore_1
    //   43: aload 15
    //   45: ifnonnull +12 -> 57
    //   48: new 27	androidx/core/location/LocationManagerCompat$GnssStatusTransport
    //   51: astore_1
    //   52: aload_1
    //   53: aload_3
    //   54: invokespecial 233	androidx/core/location/LocationManagerCompat$GnssStatusTransport:<init>	(Landroidx/core/location/GnssStatusCompat$Callback;)V
    //   57: aload_0
    //   58: aload_2
    //   59: aload_1
    //   60: invokevirtual 236	android/location/LocationManager:registerGnssStatusCallback	(Ljava/util/concurrent/Executor;Landroid/location/GnssStatus$Callback;)Z
    //   63: ifeq +16 -> 79
    //   66: aload 16
    //   68: aload_3
    //   69: aload_1
    //   70: invokevirtual 240	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: aload 16
    //   76: monitorexit
    //   77: iconst_1
    //   78: ireturn
    //   79: aload 16
    //   81: monitorexit
    //   82: iconst_0
    //   83: ireturn
    //   84: astore_0
    //   85: aload 16
    //   87: monitorexit
    //   88: aload_0
    //   89: athrow
    //   90: getstatic 88	android/os/Build$VERSION:SDK_INT	I
    //   93: bipush 24
    //   95: if_icmplt +105 -> 200
    //   98: aload_1
    //   99: ifnull +9 -> 108
    //   102: iconst_1
    //   103: istore 14
    //   105: goto +6 -> 111
    //   108: iconst_0
    //   109: istore 14
    //   111: iload 14
    //   113: invokestatic 245	androidx/core/util/Preconditions:checkArgument	(Z)V
    //   116: getstatic 77	androidx/core/location/LocationManagerCompat:sGnssStatusListeners	Landroidx/collection/SimpleArrayMap;
    //   119: astore 16
    //   121: aload 16
    //   123: monitorenter
    //   124: aload 16
    //   126: aload_3
    //   127: invokevirtual 230	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   130: checkcast 44	androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport
    //   133: astore 15
    //   135: aload 15
    //   137: ifnonnull +17 -> 154
    //   140: new 44	androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport
    //   143: astore 15
    //   145: aload 15
    //   147: aload_3
    //   148: invokespecial 246	androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport:<init>	(Landroidx/core/location/GnssStatusCompat$Callback;)V
    //   151: goto +8 -> 159
    //   154: aload 15
    //   156: invokevirtual 249	androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport:unregister	()V
    //   159: aload 15
    //   161: aload_2
    //   162: invokevirtual 253	androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport:register	(Ljava/util/concurrent/Executor;)V
    //   165: aload_0
    //   166: aload 15
    //   168: aload_1
    //   169: invokevirtual 256	android/location/LocationManager:registerGnssStatusCallback	(Landroid/location/GnssStatus$Callback;Landroid/os/Handler;)Z
    //   172: ifeq +17 -> 189
    //   175: aload 16
    //   177: aload_3
    //   178: aload 15
    //   180: invokevirtual 240	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   183: pop
    //   184: aload 16
    //   186: monitorexit
    //   187: iconst_1
    //   188: ireturn
    //   189: aload 16
    //   191: monitorexit
    //   192: iconst_0
    //   193: ireturn
    //   194: astore_0
    //   195: aload 16
    //   197: monitorexit
    //   198: aload_0
    //   199: athrow
    //   200: aload_1
    //   201: ifnull +9 -> 210
    //   204: iconst_1
    //   205: istore 14
    //   207: goto +6 -> 213
    //   210: iconst_0
    //   211: istore 14
    //   213: iload 14
    //   215: invokestatic 245	androidx/core/util/Preconditions:checkArgument	(Z)V
    //   218: getstatic 77	androidx/core/location/LocationManagerCompat:sGnssStatusListeners	Landroidx/collection/SimpleArrayMap;
    //   221: astore 16
    //   223: aload 16
    //   225: monitorenter
    //   226: aload 16
    //   228: aload_3
    //   229: invokevirtual 230	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   232: checkcast 30	androidx/core/location/LocationManagerCompat$GpsStatusTransport
    //   235: astore 15
    //   237: aload 15
    //   239: ifnonnull +18 -> 257
    //   242: new 30	androidx/core/location/LocationManagerCompat$GpsStatusTransport
    //   245: astore 15
    //   247: aload 15
    //   249: aload_0
    //   250: aload_3
    //   251: invokespecial 259	androidx/core/location/LocationManagerCompat$GpsStatusTransport:<init>	(Landroid/location/LocationManager;Landroidx/core/location/GnssStatusCompat$Callback;)V
    //   254: goto +8 -> 262
    //   257: aload 15
    //   259: invokevirtual 260	androidx/core/location/LocationManagerCompat$GpsStatusTransport:unregister	()V
    //   262: aload 15
    //   264: aload_2
    //   265: invokevirtual 261	androidx/core/location/LocationManagerCompat$GpsStatusTransport:register	(Ljava/util/concurrent/Executor;)V
    //   268: new 263	java/util/concurrent/FutureTask
    //   271: astore_2
    //   272: new 10	androidx/core/location/LocationManagerCompat$3
    //   275: astore 17
    //   277: aload 17
    //   279: aload_0
    //   280: aload 15
    //   282: invokespecial 266	androidx/core/location/LocationManagerCompat$3:<init>	(Landroid/location/LocationManager;Landroidx/core/location/LocationManagerCompat$GpsStatusTransport;)V
    //   285: aload_2
    //   286: aload 17
    //   288: invokespecial 269	java/util/concurrent/FutureTask:<init>	(Ljava/util/concurrent/Callable;)V
    //   291: invokestatic 272	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   294: aload_1
    //   295: invokevirtual 277	android/os/Handler:getLooper	()Landroid/os/Looper;
    //   298: if_acmpne +10 -> 308
    //   301: aload_2
    //   302: invokevirtual 280	java/util/concurrent/FutureTask:run	()V
    //   305: goto +15 -> 320
    //   308: aload_1
    //   309: aload_2
    //   310: invokevirtual 284	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   313: istore 14
    //   315: iload 14
    //   317: ifeq +317 -> 634
    //   320: getstatic 290	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   323: ldc2_w 62
    //   326: invokevirtual 294	java/util/concurrent/TimeUnit:toNanos	(J)J
    //   329: lstore 10
    //   331: invokestatic 299	java/lang/System:nanoTime	()J
    //   334: lstore 12
    //   336: iconst_0
    //   337: istore 4
    //   339: lload 10
    //   341: lstore 8
    //   343: aload_2
    //   344: lload 8
    //   346: getstatic 302	java/util/concurrent/TimeUnit:NANOSECONDS	Ljava/util/concurrent/TimeUnit;
    //   349: invokevirtual 305	java/util/concurrent/FutureTask:get	(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   352: checkcast 307	java/lang/Boolean
    //   355: invokevirtual 311	java/lang/Boolean:booleanValue	()Z
    //   358: ifeq +29 -> 387
    //   361: getstatic 77	androidx/core/location/LocationManagerCompat:sGnssStatusListeners	Landroidx/collection/SimpleArrayMap;
    //   364: aload_3
    //   365: aload 15
    //   367: invokevirtual 240	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   370: pop
    //   371: iload 4
    //   373: ifeq +9 -> 382
    //   376: invokestatic 317	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   379: invokevirtual 320	java/lang/Thread:interrupt	()V
    //   382: aload 16
    //   384: monitorexit
    //   385: iconst_1
    //   386: ireturn
    //   387: iload 4
    //   389: ifeq +9 -> 398
    //   392: invokestatic 317	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   395: invokevirtual 320	java/lang/Thread:interrupt	()V
    //   398: aload 16
    //   400: monitorexit
    //   401: iconst_0
    //   402: ireturn
    //   403: astore_0
    //   404: goto +217 -> 621
    //   407: astore_0
    //   408: iload 4
    //   410: istore 5
    //   412: goto +64 -> 476
    //   415: astore_0
    //   416: iload 4
    //   418: istore 5
    //   420: goto +125 -> 545
    //   423: astore_0
    //   424: iload 5
    //   426: istore 4
    //   428: invokestatic 299	java/lang/System:nanoTime	()J
    //   431: lstore 8
    //   433: lload 12
    //   435: lload 10
    //   437: ladd
    //   438: lload 8
    //   440: lsub
    //   441: lstore 8
    //   443: iconst_1
    //   444: istore 4
    //   446: goto -103 -> 343
    //   449: astore_0
    //   450: iload 7
    //   452: istore 5
    //   454: goto +22 -> 476
    //   457: astore_0
    //   458: iload 6
    //   460: istore 5
    //   462: goto +83 -> 545
    //   465: astore_0
    //   466: iconst_0
    //   467: istore 4
    //   469: goto +152 -> 621
    //   472: astore_0
    //   473: iconst_0
    //   474: istore 5
    //   476: iload 5
    //   478: istore 4
    //   480: new 322	java/lang/IllegalStateException
    //   483: astore_3
    //   484: iload 5
    //   486: istore 4
    //   488: new 324	java/lang/StringBuilder
    //   491: astore_2
    //   492: iload 5
    //   494: istore 4
    //   496: aload_2
    //   497: invokespecial 325	java/lang/StringBuilder:<init>	()V
    //   500: iload 5
    //   502: istore 4
    //   504: aload_2
    //   505: aload_1
    //   506: invokevirtual 329	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   509: pop
    //   510: iload 5
    //   512: istore 4
    //   514: aload_2
    //   515: ldc_w 331
    //   518: invokevirtual 334	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: pop
    //   522: iload 5
    //   524: istore 4
    //   526: aload_3
    //   527: aload_2
    //   528: invokevirtual 338	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   531: aload_0
    //   532: invokespecial 341	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   535: iload 5
    //   537: istore 4
    //   539: aload_3
    //   540: athrow
    //   541: astore_0
    //   542: iconst_0
    //   543: istore 5
    //   545: iload 5
    //   547: istore 4
    //   549: aload_0
    //   550: invokevirtual 345	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   553: instanceof 347
    //   556: ifne +52 -> 608
    //   559: iload 5
    //   561: istore 4
    //   563: aload_0
    //   564: invokevirtual 345	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   567: instanceof 349
    //   570: ifeq +15 -> 585
    //   573: iload 5
    //   575: istore 4
    //   577: aload_0
    //   578: invokevirtual 345	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   581: checkcast 349	java/lang/Error
    //   584: athrow
    //   585: iload 5
    //   587: istore 4
    //   589: new 322	java/lang/IllegalStateException
    //   592: astore_1
    //   593: iload 5
    //   595: istore 4
    //   597: aload_1
    //   598: aload_0
    //   599: invokespecial 352	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   602: iload 5
    //   604: istore 4
    //   606: aload_1
    //   607: athrow
    //   608: iload 5
    //   610: istore 4
    //   612: aload_0
    //   613: invokevirtual 345	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   616: checkcast 347	java/lang/RuntimeException
    //   619: athrow
    //   620: astore_0
    //   621: iload 4
    //   623: ifeq +9 -> 632
    //   626: invokestatic 317	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   629: invokevirtual 320	java/lang/Thread:interrupt	()V
    //   632: aload_0
    //   633: athrow
    //   634: new 322	java/lang/IllegalStateException
    //   637: astore_2
    //   638: new 324	java/lang/StringBuilder
    //   641: astore_0
    //   642: aload_0
    //   643: invokespecial 325	java/lang/StringBuilder:<init>	()V
    //   646: aload_0
    //   647: aload_1
    //   648: invokevirtual 329	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   651: pop
    //   652: aload_0
    //   653: ldc_w 354
    //   656: invokevirtual 334	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   659: pop
    //   660: aload_2
    //   661: aload_0
    //   662: invokevirtual 338	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   665: invokespecial 357	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   668: aload_2
    //   669: athrow
    //   670: astore_0
    //   671: aload 16
    //   673: monitorexit
    //   674: aload_0
    //   675: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	676	0	paramLocationManager	LocationManager
    //   0	676	1	paramHandler	Handler
    //   0	676	2	paramExecutor	Executor
    //   0	676	3	paramCallback	GnssStatusCompat.Callback
    //   3	619	4	i	int
    //   9	600	5	j	int
    //   6	453	6	k	int
    //   12	439	7	m	int
    //   341	101	8	l1	long
    //   329	107	10	l2	long
    //   334	100	12	l3	long
    //   103	213	14	bool	boolean
    //   38	328	15	localObject	Object
    //   24	648	16	localSimpleArrayMap	SimpleArrayMap
    //   275	12	17	local3	3
    // Exception table:
    //   from	to	target	type
    //   29	40	84	finally
    //   48	57	84	finally
    //   57	77	84	finally
    //   79	82	84	finally
    //   85	88	84	finally
    //   124	135	194	finally
    //   140	151	194	finally
    //   154	159	194	finally
    //   159	187	194	finally
    //   189	192	194	finally
    //   195	198	194	finally
    //   343	371	403	finally
    //   343	371	407	java/util/concurrent/TimeoutException
    //   343	371	415	java/util/concurrent/ExecutionException
    //   343	371	423	java/lang/InterruptedException
    //   428	433	449	java/util/concurrent/TimeoutException
    //   428	433	457	java/util/concurrent/ExecutionException
    //   320	336	465	finally
    //   320	336	472	java/util/concurrent/TimeoutException
    //   320	336	541	java/util/concurrent/ExecutionException
    //   428	433	620	finally
    //   480	484	620	finally
    //   488	492	620	finally
    //   496	500	620	finally
    //   504	510	620	finally
    //   514	522	620	finally
    //   526	535	620	finally
    //   539	541	620	finally
    //   549	559	620	finally
    //   563	573	620	finally
    //   577	585	620	finally
    //   589	593	620	finally
    //   597	602	620	finally
    //   606	608	620	finally
    //   612	620	620	finally
    //   226	237	670	finally
    //   242	254	670	finally
    //   257	262	670	finally
    //   262	305	670	finally
    //   308	315	670	finally
    //   376	382	670	finally
    //   382	385	670	finally
    //   392	398	670	finally
    //   398	401	670	finally
    //   626	632	670	finally
    //   632	634	670	finally
    //   634	670	670	finally
    //   671	674	670	finally
  }
  
  public static boolean registerGnssStatusCallback(LocationManager paramLocationManager, GnssStatusCompat.Callback paramCallback, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return registerGnssStatusCallback(paramLocationManager, ExecutorCompat.create(paramHandler), paramCallback);
    }
    return registerGnssStatusCallback(paramLocationManager, new InlineHandlerExecutor(paramHandler), paramCallback);
  }
  
  public static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return registerGnssStatusCallback(paramLocationManager, null, paramExecutor, paramCallback);
    }
    Looper localLooper2 = Looper.myLooper();
    Looper localLooper1 = localLooper2;
    if (localLooper2 == null) {
      localLooper1 = Looper.getMainLooper();
    }
    return registerGnssStatusCallback(paramLocationManager, new Handler(localLooper1), paramExecutor, paramCallback);
  }
  
  public static void unregisterGnssStatusCallback(LocationManager paramLocationManager, GnssStatusCompat.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      synchronized (sGnssStatusListeners)
      {
        paramCallback = (GnssStatusTransport)???.remove(paramCallback);
        if (paramCallback != null) {
          paramLocationManager.unregisterGnssStatusCallback(paramCallback);
        }
      }
    }
    if (Build.VERSION.SDK_INT >= 24) {
      synchronized (sGnssStatusListeners)
      {
        paramCallback = (PreRGnssStatusTransport)???.remove(paramCallback);
        if (paramCallback != null)
        {
          paramCallback.unregister();
          paramLocationManager.unregisterGnssStatusCallback(paramCallback);
        }
      }
    }
    synchronized (sGnssStatusListeners)
    {
      paramCallback = (GpsStatusTransport)???.remove(paramCallback);
      if (paramCallback != null)
      {
        paramCallback.unregister();
        paramLocationManager.removeGpsStatusListener(paramCallback);
      }
      return;
    }
  }
  
  private static class Api28Impl
  {
    static String getGnssHardwareModelName(LocationManager paramLocationManager)
    {
      return paramLocationManager.getGnssHardwareModelName();
    }
    
    static int getGnssYearOfHardware(LocationManager paramLocationManager)
    {
      return paramLocationManager.getGnssYearOfHardware();
    }
    
    static boolean isLocationEnabled(LocationManager paramLocationManager)
    {
      return paramLocationManager.isLocationEnabled();
    }
  }
  
  private static class Api30Impl
  {
    static void getCurrentLocation(LocationManager paramLocationManager, String paramString, androidx.core.os.CancellationSignal paramCancellationSignal, Executor paramExecutor, androidx.core.util.Consumer<Location> paramConsumer)
    {
      if (paramCancellationSignal != null) {
        paramCancellationSignal = (android.os.CancellationSignal)paramCancellationSignal.getCancellationSignalObject();
      } else {
        paramCancellationSignal = null;
      }
      paramLocationManager.getCurrentLocation(paramString, paramCancellationSignal, paramExecutor, new java.util.function.Consumer()
      {
        public void accept(Location paramAnonymousLocation)
        {
          LocationManagerCompat.Api30Impl.this.accept(paramAnonymousLocation);
        }
      });
    }
  }
  
  private static final class CancellableLocationListener
    implements LocationListener
  {
    private androidx.core.util.Consumer<Location> mConsumer;
    private final Executor mExecutor;
    private final LocationManager mLocationManager;
    private final Handler mTimeoutHandler;
    Runnable mTimeoutRunnable;
    private boolean mTriggered;
    
    CancellableLocationListener(LocationManager paramLocationManager, Executor paramExecutor, androidx.core.util.Consumer<Location> paramConsumer)
    {
      this.mLocationManager = paramLocationManager;
      this.mExecutor = paramExecutor;
      this.mTimeoutHandler = new Handler(Looper.getMainLooper());
      this.mConsumer = paramConsumer;
    }
    
    private void cleanup()
    {
      this.mConsumer = null;
      this.mLocationManager.removeUpdates(this);
      Runnable localRunnable = this.mTimeoutRunnable;
      if (localRunnable != null)
      {
        this.mTimeoutHandler.removeCallbacks(localRunnable);
        this.mTimeoutRunnable = null;
      }
    }
    
    public void cancel()
    {
      try
      {
        if (this.mTriggered) {
          return;
        }
        this.mTriggered = true;
        cleanup();
        return;
      }
      finally {}
    }
    
    public void onLocationChanged(final Location paramLocation)
    {
      try
      {
        if (this.mTriggered) {
          return;
        }
        this.mTriggered = true;
        final androidx.core.util.Consumer localConsumer = this.mConsumer;
        this.mExecutor.execute(new Runnable()
        {
          public void run()
          {
            localConsumer.accept(paramLocation);
          }
        });
        cleanup();
        return;
      }
      finally {}
    }
    
    public void onProviderDisabled(String paramString)
    {
      paramString = (Location)null;
      onLocationChanged(null);
    }
    
    public void onProviderEnabled(String paramString) {}
    
    public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
    
    public void startTimeout(long paramLong)
    {
      try
      {
        if (this.mTriggered) {
          return;
        }
        Runnable local1 = new androidx/core/location/LocationManagerCompat$CancellableLocationListener$1;
        local1.<init>(this);
        this.mTimeoutRunnable = local1;
        this.mTimeoutHandler.postDelayed(local1, paramLong);
        return;
      }
      finally {}
    }
  }
  
  private static class GnssStatusTransport
    extends GnssStatus.Callback
  {
    final GnssStatusCompat.Callback mCallback;
    
    GnssStatusTransport(GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramCallback != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "invalid null callback");
      this.mCallback = paramCallback;
    }
    
    public void onFirstFix(int paramInt)
    {
      this.mCallback.onFirstFix(paramInt);
    }
    
    public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
    {
      this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(paramGnssStatus));
    }
    
    public void onStarted()
    {
      this.mCallback.onStarted();
    }
    
    public void onStopped()
    {
      this.mCallback.onStopped();
    }
  }
  
  private static class GpsStatusTransport
    implements GpsStatus.Listener
  {
    final GnssStatusCompat.Callback mCallback;
    volatile Executor mExecutor;
    private final LocationManager mLocationManager;
    
    GpsStatusTransport(LocationManager paramLocationManager, GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramCallback != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "invalid null callback");
      this.mLocationManager = paramLocationManager;
      this.mCallback = paramCallback;
    }
    
    public void onGpsStatusChanged(int paramInt)
    {
      final Executor localExecutor = this.mExecutor;
      if (localExecutor == null) {
        return;
      }
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          GpsStatus localGpsStatus;
          if (paramInt != 3)
          {
            if (paramInt == 4)
            {
              localGpsStatus = this.mLocationManager.getGpsStatus(null);
              if (localGpsStatus != null) {
                localExecutor.execute(new Runnable()
                {
                  public void run()
                  {
                    if (LocationManagerCompat.GpsStatusTransport.this.mExecutor != localExecutor) {
                      return;
                    }
                    LocationManagerCompat.GpsStatusTransport.this.mCallback.onSatelliteStatusChanged(this.val$gnssStatus);
                  }
                });
              }
            }
          }
          else
          {
            localGpsStatus = this.mLocationManager.getGpsStatus(null);
            if (localGpsStatus != null) {
              localExecutor.execute(new Runnable()
              {
                public void run()
                {
                  if (LocationManagerCompat.GpsStatusTransport.this.mExecutor != localExecutor) {
                    return;
                  }
                  LocationManagerCompat.GpsStatusTransport.this.mCallback.onFirstFix(this.val$ttff);
                }
              });
            }
          }
        }
        else
        {
          localExecutor.execute(new Runnable()
          {
            public void run()
            {
              if (LocationManagerCompat.GpsStatusTransport.this.mExecutor != localExecutor) {
                return;
              }
              LocationManagerCompat.GpsStatusTransport.this.mCallback.onStopped();
            }
          });
        }
      }
      else {
        localExecutor.execute(new Runnable()
        {
          public void run()
          {
            if (LocationManagerCompat.GpsStatusTransport.this.mExecutor != localExecutor) {
              return;
            }
            LocationManagerCompat.GpsStatusTransport.this.mCallback.onStarted();
          }
        });
      }
    }
    
    public void register(Executor paramExecutor)
    {
      boolean bool;
      if (this.mExecutor == null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      this.mExecutor = paramExecutor;
    }
    
    public void unregister()
    {
      this.mExecutor = null;
    }
  }
  
  private static final class InlineHandlerExecutor
    implements Executor
  {
    private final Handler mHandler;
    
    InlineHandlerExecutor(Handler paramHandler)
    {
      this.mHandler = ((Handler)Preconditions.checkNotNull(paramHandler));
    }
    
    public void execute(Runnable paramRunnable)
    {
      if (Looper.myLooper() == this.mHandler.getLooper()) {
        paramRunnable.run();
      } else {
        if (!this.mHandler.post((Runnable)Preconditions.checkNotNull(paramRunnable))) {
          break label40;
        }
      }
      return;
      label40:
      paramRunnable = new StringBuilder();
      paramRunnable.append(this.mHandler);
      paramRunnable.append(" is shutting down");
      throw new RejectedExecutionException(paramRunnable.toString());
    }
  }
  
  private static class PreRGnssStatusTransport
    extends GnssStatus.Callback
  {
    final GnssStatusCompat.Callback mCallback;
    volatile Executor mExecutor;
    
    PreRGnssStatusTransport(GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramCallback != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "invalid null callback");
      this.mCallback = paramCallback;
    }
    
    public void onFirstFix(final int paramInt)
    {
      final Executor localExecutor = this.mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new Runnable()
      {
        public void run()
        {
          if (LocationManagerCompat.PreRGnssStatusTransport.this.mExecutor != localExecutor) {
            return;
          }
          LocationManagerCompat.PreRGnssStatusTransport.this.mCallback.onFirstFix(paramInt);
        }
      });
    }
    
    public void onSatelliteStatusChanged(final GnssStatus paramGnssStatus)
    {
      final Executor localExecutor = this.mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new Runnable()
      {
        public void run()
        {
          if (LocationManagerCompat.PreRGnssStatusTransport.this.mExecutor != localExecutor) {
            return;
          }
          LocationManagerCompat.PreRGnssStatusTransport.this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(paramGnssStatus));
        }
      });
    }
    
    public void onStarted()
    {
      final Executor localExecutor = this.mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new Runnable()
      {
        public void run()
        {
          if (LocationManagerCompat.PreRGnssStatusTransport.this.mExecutor != localExecutor) {
            return;
          }
          LocationManagerCompat.PreRGnssStatusTransport.this.mCallback.onStarted();
        }
      });
    }
    
    public void onStopped()
    {
      final Executor localExecutor = this.mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new Runnable()
      {
        public void run()
        {
          if (LocationManagerCompat.PreRGnssStatusTransport.this.mExecutor != localExecutor) {
            return;
          }
          LocationManagerCompat.PreRGnssStatusTransport.this.mCallback.onStopped();
        }
      });
    }
    
    public void register(Executor paramExecutor)
    {
      boolean bool2 = true;
      boolean bool1;
      if (paramExecutor != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "invalid null executor");
      if (this.mExecutor == null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1);
      this.mExecutor = paramExecutor;
    }
    
    public void unregister()
    {
      this.mExecutor = null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\location\LocationManagerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */