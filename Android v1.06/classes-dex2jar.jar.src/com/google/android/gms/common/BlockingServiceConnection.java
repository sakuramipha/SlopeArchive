package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BlockingServiceConnection
  implements ServiceConnection
{
  boolean zza = false;
  private final BlockingQueue<IBinder> zzb = new LinkedBlockingQueue();
  
  public IBinder getService()
    throws InterruptedException
  {
    Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
    if (!this.zza)
    {
      this.zza = true;
      return (IBinder)this.zzb.take();
    }
    throw new IllegalStateException("Cannot call get on this connection more than once");
  }
  
  public IBinder getServiceWithTimeout(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, TimeoutException
  {
    Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
    if (!this.zza)
    {
      this.zza = true;
      paramTimeUnit = (IBinder)this.zzb.poll(paramLong, paramTimeUnit);
      if (paramTimeUnit != null) {
        return paramTimeUnit;
      }
      throw new TimeoutException("Timed out waiting for the service connection");
    }
    throw new IllegalStateException("Cannot call get on this connection more than once");
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.zzb.add(paramIBinder);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\BlockingServiceConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */