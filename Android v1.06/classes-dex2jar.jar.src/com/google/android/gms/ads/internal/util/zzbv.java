package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzflv;

public final class zzbv
{
  private HandlerThread zza = null;
  private Handler zzb = null;
  private int zzc = 0;
  private final Object zzd = new Object();
  
  public final Handler zza()
  {
    return this.zzb;
  }
  
  public final Looper zzb()
  {
    synchronized (this.zzd)
    {
      if (this.zzc == 0)
      {
        if (this.zza == null)
        {
          zze.zza("Starting the looper thread.");
          localObject2 = new android/os/HandlerThread;
          ((HandlerThread)localObject2).<init>("LooperProvider");
          this.zza = ((HandlerThread)localObject2);
          ((HandlerThread)localObject2).start();
          localObject2 = new com/google/android/gms/internal/ads/zzflv;
          ((zzflv)localObject2).<init>(this.zza.getLooper());
          this.zzb = ((Handler)localObject2);
          zze.zza("Looper thread started.");
        }
        else
        {
          zze.zza("Resuming the looper thread");
          this.zzd.notifyAll();
        }
      }
      else {
        Preconditions.checkNotNull(this.zza, "Invalid state: handlerThread should already been initialized.");
      }
      this.zzc += 1;
      Object localObject2 = this.zza.getLooper();
      return (Looper)localObject2;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */