package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzb
  extends Thread
{
  final CountDownLatch zza;
  boolean zzb;
  private final WeakReference<AdvertisingIdClient> zzc;
  private final long zzd;
  
  public zzb(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
  {
    this.zzc = new WeakReference(paramAdvertisingIdClient);
    this.zzd = paramLong;
    this.zza = new CountDownLatch(1);
    this.zzb = false;
    start();
  }
  
  private final void zza()
  {
    AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.zzc.get();
    if (localAdvertisingIdClient != null)
    {
      localAdvertisingIdClient.zza();
      this.zzb = true;
    }
  }
  
  public final void run()
  {
    try
    {
      if (!this.zza.await(this.zzd, TimeUnit.MILLISECONDS)) {
        zza();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      zza();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\identifier\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */