package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzad
  implements zzae
{
  private final CountDownLatch zza = new CountDownLatch(1);
  
  public final void onCanceled()
  {
    this.zza.countDown();
  }
  
  public final void onFailure(Exception paramException)
  {
    this.zza.countDown();
  }
  
  public final void onSuccess(Object paramObject)
  {
    this.zza.countDown();
  }
  
  public final void zza()
    throws InterruptedException
  {
    this.zza.await();
  }
  
  public final boolean zzb(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException
  {
    return this.zza.await(paramLong, paramTimeUnit);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */