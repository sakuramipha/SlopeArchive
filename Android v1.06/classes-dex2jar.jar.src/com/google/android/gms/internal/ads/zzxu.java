package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

final class zzxu
  extends Handler
  implements Runnable
{
  final zzxz zza;
  private final zzxv zzb;
  private final long zzc;
  private zzxr zzd;
  private IOException zze;
  private int zzf;
  private Thread zzg;
  private boolean zzh;
  private volatile boolean zzi;
  
  public zzxu(zzxz paramzzxz, Looper paramLooper, zzxv paramzzxv, zzxr paramzzxr, int paramInt, long paramLong)
  {
    super(paramLooper);
    this.zzb = paramzzxv;
    this.zzd = paramzzxr;
    this.zzc = paramLong;
  }
  
  private final void zzd()
  {
    this.zze = null;
    Object localObject = this.zza;
    ExecutorService localExecutorService = zzxz.zzd((zzxz)localObject);
    localObject = zzxz.zzc((zzxz)localObject);
    Objects.requireNonNull(localObject);
    localExecutorService.execute((Runnable)localObject);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (this.zzi) {
      return;
    }
    if (paramMessage.what == 0)
    {
      zzd();
      return;
    }
    if (paramMessage.what != 3)
    {
      zzxz.zze(this.zza, null);
      long l2 = SystemClock.elapsedRealtime();
      long l1 = l2 - this.zzc;
      zzxr localzzxr = this.zzd;
      Objects.requireNonNull(localzzxr);
      if (this.zzh)
      {
        localzzxr.zzI(this.zzb, l2, l1, false);
        return;
      }
      int i = paramMessage.what;
      if (i != 1)
      {
        if (i == 2)
        {
          paramMessage = (IOException)paramMessage.obj;
          this.zze = paramMessage;
          i = this.zzf + 1;
          this.zzf = i;
          paramMessage = localzzxr.zzt(this.zzb, l2, l1, paramMessage, i);
          if (zzxt.zza(paramMessage) == 3)
          {
            zzxz.zzf(this.zza, this.zze);
            return;
          }
          if (zzxt.zza(paramMessage) != 2)
          {
            if (zzxt.zza(paramMessage) == 1) {
              this.zzf = 1;
            }
            if (zzxt.zzb(paramMessage) != -9223372036854775807L) {
              l1 = zzxt.zzb(paramMessage);
            } else {
              l1 = Math.min((this.zzf - 1) * 1000, 5000);
            }
            zzc(l1);
          }
        }
        return;
      }
      try
      {
        localzzxr.zzJ(this.zzb, l2, l1);
        return;
      }
      catch (RuntimeException paramMessage)
      {
        zzer.zzc("LoadTask", "Unexpected exception handling load completed", paramMessage);
        zzxz.zzf(this.zza, new zzxy(paramMessage));
        return;
      }
    }
    throw ((Error)paramMessage.obj);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 84	com/google/android/gms/internal/ads/zzxu:zzh	Z
    //   6: istore_2
    //   7: aload_0
    //   8: invokestatic 155	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   11: putfield 157	com/google/android/gms/internal/ads/zzxu:zzg	Ljava/lang/Thread;
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_2
    //   17: iconst_1
    //   18: ixor
    //   19: ifeq +71 -> 90
    //   22: aload_0
    //   23: getfield 32	com/google/android/gms/internal/ads/zzxu:zzb	Lcom/google/android/gms/internal/ads/zzxv;
    //   26: invokevirtual 163	java/lang/Object:getClass	()Ljava/lang/Class;
    //   29: invokevirtual 169	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   32: astore 4
    //   34: new 171	java/lang/StringBuilder
    //   37: astore_3
    //   38: aload_3
    //   39: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   42: aload_3
    //   43: ldc -81
    //   45: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_3
    //   50: aload 4
    //   52: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_3
    //   57: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: astore_3
    //   61: getstatic 186	com/google/android/gms/internal/ads/zzfn:zza	I
    //   64: istore_1
    //   65: aload_3
    //   66: invokestatic 192	android/os/Trace:beginSection	(Ljava/lang/String;)V
    //   69: aload_0
    //   70: getfield 32	com/google/android/gms/internal/ads/zzxu:zzb	Lcom/google/android/gms/internal/ads/zzxv;
    //   73: invokeinterface 196 1 0
    //   78: invokestatic 199	android/os/Trace:endSection	()V
    //   81: goto +9 -> 90
    //   84: astore_3
    //   85: invokestatic 199	android/os/Trace:endSection	()V
    //   88: aload_3
    //   89: athrow
    //   90: aload_0
    //   91: monitorenter
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield 157	com/google/android/gms/internal/ads/zzxu:zzg	Ljava/lang/Thread;
    //   97: invokestatic 203	java/lang/Thread:interrupted	()Z
    //   100: pop
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_0
    //   104: getfield 66	com/google/android/gms/internal/ads/zzxu:zzi	Z
    //   107: ifne +130 -> 237
    //   110: aload_0
    //   111: iconst_1
    //   112: invokevirtual 207	com/google/android/gms/internal/ads/zzxu:sendEmptyMessage	(I)Z
    //   115: pop
    //   116: return
    //   117: astore_3
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_3
    //   121: athrow
    //   122: astore_3
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_3
    //   126: athrow
    //   127: astore_3
    //   128: aload_0
    //   129: getfield 66	com/google/android/gms/internal/ads/zzxu:zzi	Z
    //   132: ifne +20 -> 152
    //   135: ldc -126
    //   137: ldc -47
    //   139: aload_3
    //   140: invokestatic 137	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   143: aload_0
    //   144: iconst_3
    //   145: aload_3
    //   146: invokevirtual 213	com/google/android/gms/internal/ads/zzxu:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   149: invokevirtual 216	android/os/Message:sendToTarget	()V
    //   152: aload_3
    //   153: athrow
    //   154: astore_3
    //   155: aload_0
    //   156: getfield 66	com/google/android/gms/internal/ads/zzxu:zzi	Z
    //   159: ifne +78 -> 237
    //   162: ldc -126
    //   164: ldc -38
    //   166: aload_3
    //   167: invokestatic 137	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   170: aload_0
    //   171: iconst_2
    //   172: new 139	com/google/android/gms/internal/ads/zzxy
    //   175: dup
    //   176: aload_3
    //   177: invokespecial 142	com/google/android/gms/internal/ads/zzxy:<init>	(Ljava/lang/Throwable;)V
    //   180: invokevirtual 213	com/google/android/gms/internal/ads/zzxu:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   183: invokevirtual 216	android/os/Message:sendToTarget	()V
    //   186: return
    //   187: astore_3
    //   188: aload_0
    //   189: getfield 66	com/google/android/gms/internal/ads/zzxu:zzi	Z
    //   192: ifne +45 -> 237
    //   195: ldc -126
    //   197: ldc -36
    //   199: aload_3
    //   200: invokestatic 137	com/google/android/gms/internal/ads/zzer:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   203: aload_0
    //   204: iconst_2
    //   205: new 139	com/google/android/gms/internal/ads/zzxy
    //   208: dup
    //   209: aload_3
    //   210: invokespecial 142	com/google/android/gms/internal/ads/zzxy:<init>	(Ljava/lang/Throwable;)V
    //   213: invokevirtual 213	com/google/android/gms/internal/ads/zzxu:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   216: invokevirtual 216	android/os/Message:sendToTarget	()V
    //   219: return
    //   220: astore_3
    //   221: aload_0
    //   222: getfield 66	com/google/android/gms/internal/ads/zzxu:zzi	Z
    //   225: ifne +12 -> 237
    //   228: aload_0
    //   229: iconst_2
    //   230: aload_3
    //   231: invokevirtual 213	com/google/android/gms/internal/ads/zzxu:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   234: invokevirtual 216	android/os/Message:sendToTarget	()V
    //   237: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	238	0	this	zzxu
    //   64	1	1	i	int
    //   6	13	2	bool	boolean
    //   37	29	3	localObject1	Object
    //   84	5	3	localObject2	Object
    //   117	4	3	localObject3	Object
    //   122	4	3	localObject4	Object
    //   127	26	3	localError	Error
    //   154	23	3	localOutOfMemoryError	OutOfMemoryError
    //   187	23	3	localException	Exception
    //   220	11	3	localIOException	IOException
    //   32	19	4	str	String
    // Exception table:
    //   from	to	target	type
    //   69	78	84	finally
    //   92	103	117	finally
    //   118	120	117	finally
    //   2	16	122	finally
    //   123	125	122	finally
    //   0	2	127	java/lang/Error
    //   22	69	127	java/lang/Error
    //   78	81	127	java/lang/Error
    //   85	90	127	java/lang/Error
    //   90	92	127	java/lang/Error
    //   103	116	127	java/lang/Error
    //   120	122	127	java/lang/Error
    //   125	127	127	java/lang/Error
    //   0	2	154	java/lang/OutOfMemoryError
    //   22	69	154	java/lang/OutOfMemoryError
    //   78	81	154	java/lang/OutOfMemoryError
    //   85	90	154	java/lang/OutOfMemoryError
    //   90	92	154	java/lang/OutOfMemoryError
    //   103	116	154	java/lang/OutOfMemoryError
    //   120	122	154	java/lang/OutOfMemoryError
    //   125	127	154	java/lang/OutOfMemoryError
    //   0	2	187	java/lang/Exception
    //   22	69	187	java/lang/Exception
    //   78	81	187	java/lang/Exception
    //   85	90	187	java/lang/Exception
    //   90	92	187	java/lang/Exception
    //   103	116	187	java/lang/Exception
    //   120	122	187	java/lang/Exception
    //   125	127	187	java/lang/Exception
    //   0	2	220	java/io/IOException
    //   22	69	220	java/io/IOException
    //   78	81	220	java/io/IOException
    //   85	90	220	java/io/IOException
    //   90	92	220	java/io/IOException
    //   103	116	220	java/io/IOException
    //   120	122	220	java/io/IOException
    //   125	127	220	java/io/IOException
  }
  
  public final void zza(boolean paramBoolean)
  {
    this.zzi = paramBoolean;
    this.zze = null;
    if (hasMessages(0))
    {
      this.zzh = true;
      removeMessages(0);
      if (paramBoolean) {
        break label75;
      }
      sendEmptyMessage(1);
    }
    try
    {
      this.zzh = true;
      this.zzb.zzg();
      Object localObject1 = this.zzg;
      if (localObject1 != null) {
        ((Thread)localObject1).interrupt();
      }
      label75:
      if (paramBoolean)
      {
        zzxz.zze(this.zza, null);
        long l = SystemClock.elapsedRealtime();
        localObject1 = this.zzd;
        Objects.requireNonNull(localObject1);
        ((zzxr)localObject1).zzI(this.zzb, l, l - this.zzc, true);
        this.zzd = null;
      }
      return;
    }
    finally {}
  }
  
  public final void zzb(int paramInt)
    throws IOException
  {
    IOException localIOException = this.zze;
    if ((localIOException != null) && (this.zzf > paramInt)) {
      throw localIOException;
    }
  }
  
  public final void zzc(long paramLong)
  {
    boolean bool;
    if (zzxz.zzc(this.zza) == null) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    zzxz.zze(this.zza, this);
    if (paramLong > 0L)
    {
      sendEmptyMessageDelayed(0, paramLong);
      return;
    }
    zzd();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */