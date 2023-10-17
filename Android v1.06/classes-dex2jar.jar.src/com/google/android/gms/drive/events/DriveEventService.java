package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.drive.zzet;
import com.google.android.gms.internal.drive.zzfp;
import com.google.android.gms.internal.drive.zzir;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DriveEventService
  extends Service
  implements ChangeListener, CompletionListener, zzd, zzi
{
  public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
  private static final GmsLogger zzbz = new GmsLogger("DriveEventService", "");
  private final String name;
  private CountDownLatch zzcj;
  zza zzck;
  boolean zzcl = false;
  private int zzcm = -1;
  
  protected DriveEventService()
  {
    this("DriveEventService");
  }
  
  protected DriveEventService(String paramString)
  {
    this.name = paramString;
  }
  
  private final void zza(zzfp paramzzfp)
  {
    paramzzfp = paramzzfp.zzat();
    try
    {
      int i = paramzzfp.getType();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 4)
          {
            if (i != 7)
            {
              zzbz.wfmt("DriveEventService", "Unhandled event: %s", new Object[] { paramzzfp });
              return;
            }
            paramzzfp = (zzv)paramzzfp;
            zzbz.wfmt("DriveEventService", "Unhandled transfer state event in %s: %s", new Object[] { this.name, paramzzfp });
            return;
          }
          zza((zzb)paramzzfp);
          return;
        }
        onCompletion((CompletionEvent)paramzzfp);
        return;
      }
      onChange((ChangeEvent)paramzzfp);
      return;
    }
    catch (Exception paramzzfp)
    {
      zzbz.e("DriveEventService", String.format("Error handling event in %s", new Object[] { this.name }), paramzzfp);
    }
  }
  
  private final void zzw()
    throws SecurityException
  {
    int i = getCallingUid();
    if (i == this.zzcm) {
      return;
    }
    if (UidVerifier.isGooglePlayServicesUid(this, i))
    {
      this.zzcm = i;
      return;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  protected int getCallingUid()
  {
    return Binder.getCallingUid();
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    try
    {
      if ("com.google.android.gms.drive.events.HANDLE_EVENT".equals(paramIntent.getAction()))
      {
        if ((this.zzck == null) && (!this.zzcl))
        {
          this.zzcl = true;
          paramIntent = new java/util/concurrent/CountDownLatch;
          paramIntent.<init>(1);
          Object localObject = new java/util/concurrent/CountDownLatch;
          ((CountDownLatch)localObject).<init>(1);
          this.zzcj = ((CountDownLatch)localObject);
          localObject = new com/google/android/gms/drive/events/zzh;
          ((zzh)localObject).<init>(this, paramIntent);
          ((zzh)localObject).start();
          try
          {
            if (!paramIntent.await(5000L, TimeUnit.MILLISECONDS)) {
              zzbz.e("DriveEventService", "Failed to synchronously initialize event handler.");
            }
          }
          catch (InterruptedException paramIntent)
          {
            localObject = new java/lang/RuntimeException;
            ((RuntimeException)localObject).<init>("Unable to start event handler", paramIntent);
            throw ((Throwable)localObject);
          }
        }
        paramIntent = new com/google/android/gms/drive/events/DriveEventService$zzb;
        paramIntent.<init>(this, null);
        paramIntent = paramIntent.asBinder();
        return paramIntent;
      }
      return null;
    }
    finally {}
  }
  
  public void onChange(ChangeEvent paramChangeEvent)
  {
    zzbz.wfmt("DriveEventService", "Unhandled change event in %s: %s", new Object[] { this.name, paramChangeEvent });
  }
  
  public void onCompletion(CompletionEvent paramCompletionEvent)
  {
    zzbz.wfmt("DriveEventService", "Unhandled completion event in %s: %s", new Object[] { this.name, paramCompletionEvent });
  }
  
  /* Error */
  public void onDestroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 161	com/google/android/gms/drive/events/DriveEventService:zzck	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +53 -> 61
    //   11: aload_1
    //   12: invokestatic 214	com/google/android/gms/drive/events/DriveEventService$zza:zza	(Lcom/google/android/gms/drive/events/DriveEventService$zza;)Landroid/os/Message;
    //   15: astore_1
    //   16: aload_0
    //   17: getfield 161	com/google/android/gms/drive/events/DriveEventService:zzck	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   20: aload_1
    //   21: invokevirtual 218	com/google/android/gms/drive/events/DriveEventService$zza:sendMessage	(Landroid/os/Message;)Z
    //   24: pop
    //   25: aload_0
    //   26: aconst_null
    //   27: putfield 161	com/google/android/gms/drive/events/DriveEventService:zzck	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   30: aload_0
    //   31: getfield 128	com/google/android/gms/drive/events/DriveEventService:zzcj	Ljava/util/concurrent/CountDownLatch;
    //   34: ldc2_w 175
    //   37: getstatic 182	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   40: invokevirtual 186	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   43: ifne +13 -> 56
    //   46: getstatic 47	com/google/android/gms/drive/events/DriveEventService:zzbz	Lcom/google/android/gms/common/internal/GmsLogger;
    //   49: ldc 39
    //   51: ldc -36
    //   53: invokevirtual 223	com/google/android/gms/common/internal/GmsLogger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 128	com/google/android/gms/drive/events/DriveEventService:zzcj	Ljava/util/concurrent/CountDownLatch;
    //   61: aload_0
    //   62: invokespecial 225	android/app/Service:onDestroy	()V
    //   65: aload_0
    //   66: monitorexit
    //   67: return
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: goto -18 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	DriveEventService
    //   6	15	1	localObject1	Object
    //   68	4	1	localObject2	Object
    //   73	1	1	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	7	68	finally
    //   11	30	68	finally
    //   30	56	68	finally
    //   56	61	68	finally
    //   61	65	68	finally
    //   30	56	73	java/lang/InterruptedException
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    return true;
  }
  
  public final void zza(zzb paramzzb)
  {
    zzbz.wfmt("DriveEventService", "Unhandled changes available event in %s: %s", new Object[] { this.name, paramzzb });
  }
  
  static final class zza
    extends zzir
  {
    private final WeakReference<DriveEventService> zzcp;
    
    private zza(DriveEventService paramDriveEventService)
    {
      this.zzcp = new WeakReference(paramDriveEventService);
    }
    
    private final Message zzb(zzfp paramzzfp)
    {
      return obtainMessage(1, paramzzfp);
    }
    
    private final Message zzy()
    {
      return obtainMessage(2);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if (i != 1)
      {
        if (i != 2)
        {
          DriveEventService.zzx().wfmt("DriveEventService", "Unexpected message type: %s", new Object[] { Integer.valueOf(paramMessage.what) });
          return;
        }
        getLooper().quit();
        return;
      }
      DriveEventService localDriveEventService = (DriveEventService)this.zzcp.get();
      if (localDriveEventService != null)
      {
        DriveEventService.zza(localDriveEventService, (zzfp)paramMessage.obj);
        return;
      }
      getLooper().quit();
    }
  }
  
  final class zzb
    extends zzet
  {
    private zzb() {}
    
    public final void zzc(zzfp paramzzfp)
      throws RemoteException
    {
      synchronized (DriveEventService.this)
      {
        DriveEventService.zza(DriveEventService.this);
        if (DriveEventService.this.zzck != null)
        {
          paramzzfp = DriveEventService.zza.zza(DriveEventService.this.zzck, paramzzfp);
          DriveEventService.this.zzck.sendMessage(paramzzfp);
        }
        else
        {
          DriveEventService.zzx().e("DriveEventService", "Receiving event before initialize is completed.");
        }
        return;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\DriveEventService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */