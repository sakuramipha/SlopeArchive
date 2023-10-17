package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

final class zzfj
  implements zzei
{
  private static final List zza = new ArrayList(50);
  private final Handler zzb;
  
  public zzfj(Handler paramHandler)
  {
    this.zzb = paramHandler;
  }
  
  private static zzfi zzm()
  {
    synchronized (zza)
    {
      zzfi localzzfi;
      if (???.isEmpty())
      {
        localzzfi = new com/google/android/gms/internal/ads/zzfi;
        localzzfi.<init>(null);
      }
      else
      {
        localzzfi = (zzfi)???.remove(???.size() - 1);
      }
      return localzzfi;
    }
  }
  
  public final Looper zza()
  {
    return this.zzb.getLooper();
  }
  
  public final zzeh zzb(int paramInt)
  {
    zzfi localzzfi = zzm();
    localzzfi.zzb(this.zzb.obtainMessage(paramInt), this);
    return localzzfi;
  }
  
  public final zzeh zzc(int paramInt, Object paramObject)
  {
    zzfi localzzfi = zzm();
    localzzfi.zzb(this.zzb.obtainMessage(paramInt, paramObject), this);
    return localzzfi;
  }
  
  public final zzeh zzd(int paramInt1, int paramInt2, int paramInt3)
  {
    zzfi localzzfi = zzm();
    localzzfi.zzb(this.zzb.obtainMessage(1, paramInt2, paramInt3), this);
    return localzzfi;
  }
  
  public final void zze(Object paramObject)
  {
    this.zzb.removeCallbacksAndMessages(null);
  }
  
  public final void zzf(int paramInt)
  {
    this.zzb.removeMessages(paramInt);
  }
  
  public final boolean zzg(int paramInt)
  {
    return this.zzb.hasMessages(0);
  }
  
  public final boolean zzh(Runnable paramRunnable)
  {
    return this.zzb.post(paramRunnable);
  }
  
  public final boolean zzi(int paramInt)
  {
    return this.zzb.sendEmptyMessage(paramInt);
  }
  
  public final boolean zzj(int paramInt, long paramLong)
  {
    return this.zzb.sendEmptyMessageAtTime(2, paramLong);
  }
  
  public final boolean zzk(zzeh paramzzeh)
  {
    Handler localHandler = this.zzb;
    return ((zzfi)paramzzeh).zzc(localHandler);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */