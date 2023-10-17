package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzfjc
  implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener
{
  protected final zzfka zza;
  private final String zzb;
  private final String zzc;
  private final LinkedBlockingQueue zzd;
  private final HandlerThread zze;
  private final zzfit zzf;
  private final long zzg;
  private final int zzh;
  
  public zzfjc(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, zzfit paramzzfit)
  {
    this.zzb = paramString1;
    this.zzh = paramInt2;
    this.zzc = paramString2;
    this.zzf = paramzzfit;
    paramString1 = new HandlerThread("GassDGClient");
    this.zze = paramString1;
    paramString1.start();
    this.zzg = System.currentTimeMillis();
    paramContext = new zzfka(paramContext, paramString1.getLooper(), this, this, 19621000);
    this.zza = paramContext;
    this.zzd = new LinkedBlockingQueue();
    paramContext.checkAvailabilityAndConnect();
  }
  
  static zzfkm zza()
  {
    return new zzfkm(null, 1);
  }
  
  private final void zze(int paramInt, long paramLong, Exception paramException)
  {
    this.zzf.zzc(paramInt, System.currentTimeMillis() - paramLong, paramException);
  }
  
  public final void onConnected(Bundle paramBundle)
  {
    paramBundle = zzd();
    if (paramBundle != null) {
      try
      {
        localObject = new com/google/android/gms/internal/ads/zzfkk;
        ((zzfkk)localObject).<init>(1, this.zzh, this.zzb, this.zzc);
        paramBundle = paramBundle.zzf((zzfkk)localObject);
        zze(5011, this.zzg, null);
        this.zzd.put(paramBundle);
        zzc();
        this.zze.quit();
        return;
      }
      finally
      {
        try
        {
          Object localObject = new java/lang/Exception;
          ((Exception)localObject).<init>(paramBundle);
          zze(2010, this.zzg, (Exception)localObject);
        }
        finally
        {
          zzc();
          this.zze.quit();
        }
      }
    }
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    try
    {
      zze(4012, this.zzg, null);
      this.zzd.put(zza());
      return;
    }
    catch (InterruptedException paramConnectionResult)
    {
      for (;;) {}
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    try
    {
      zze(4011, this.zzg, null);
      this.zzd.put(zza());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final zzfkm zzb(int paramInt)
  {
    zzfkm localzzfkm2;
    try
    {
      zzfkm localzzfkm1 = (zzfkm)this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
    }
    catch (InterruptedException localInterruptedException)
    {
      zze(2009, this.zzg, localInterruptedException);
      localzzfkm2 = null;
    }
    zze(3004, this.zzg, null);
    if (localzzfkm2 != null) {
      if (localzzfkm2.zzc == 7) {
        zzfit.zzg(3);
      } else {
        zzfit.zzg(2);
      }
    }
    if (localzzfkm2 == null) {
      return zza();
    }
    return localzzfkm2;
  }
  
  public final void zzc()
  {
    zzfka localzzfka = this.zza;
    if ((localzzfka != null) && ((localzzfka.isConnected()) || (this.zza.isConnecting()))) {
      this.zza.disconnect();
    }
  }
  
  protected final zzfkf zzd()
  {
    try
    {
      zzfkf localzzfkf = this.zza.zzp();
      return localzzfkf;
    }
    catch (IllegalStateException|DeadObjectException localIllegalStateException) {}
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */