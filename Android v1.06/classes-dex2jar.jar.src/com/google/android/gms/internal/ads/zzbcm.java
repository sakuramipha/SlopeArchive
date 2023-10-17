package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbcm
{
  private MotionEvent zza = MotionEvent.obtain(0L, 0L, 1, 0.0F, 0.0F, 0);
  private MotionEvent zzb = MotionEvent.obtain(0L, 0L, 0, 0.0F, 0.0F, 0);
  private final Context zzc;
  private final ScheduledExecutorService zzd;
  private final zzffq zze;
  private final zzbco zzf;
  
  public zzbcm(Context paramContext, ScheduledExecutorService paramScheduledExecutorService, zzbco paramzzbco, zzffq paramzzffq)
  {
    this.zzc = paramContext;
    this.zzd = paramScheduledExecutorService;
    this.zzf = paramzzbco;
    this.zze = paramzzffq;
  }
  
  public final zzfwb zza()
  {
    return (zzfvi)zzfvr.zzn(zzfvi.zzv(zzfvr.zzh(null)), ((Long)zzbdc.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
  }
  
  public final void zzb(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 1) && (paramMotionEvent.getEventTime() > this.zza.getEventTime()))
    {
      this.zza = MotionEvent.obtain(paramMotionEvent);
      return;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEventTime() > this.zzb.getEventTime())) {
      this.zzb = MotionEvent.obtain(paramMotionEvent);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */