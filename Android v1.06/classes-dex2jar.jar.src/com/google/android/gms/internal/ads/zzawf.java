package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzawf
{
  private ScheduledFuture zza = null;
  private final Runnable zzb = new zzawb(this);
  private final Object zzc = new Object();
  private zzawi zzd;
  private Context zze;
  private zzawl zzf;
  
  private final void zzl()
  {
    synchronized (this.zzc)
    {
      if ((this.zze != null) && (this.zzd == null))
      {
        Object localObject2 = new com/google/android/gms/internal/ads/zzawd;
        ((zzawd)localObject2).<init>(this);
        zzawe localzzawe = new com/google/android/gms/internal/ads/zzawe;
        localzzawe.<init>(this);
        localObject2 = zzd((BaseGmsClient.BaseConnectionCallbacks)localObject2, localzzawe);
        this.zzd = ((zzawi)localObject2);
        ((zzawi)localObject2).checkAvailabilityAndConnect();
        return;
      }
      return;
    }
  }
  
  public final long zza(zzawj paramzzawj)
  {
    synchronized (this.zzc)
    {
      if (this.zzf == null) {
        return -2L;
      }
      boolean bool = this.zzd.zzp();
      if (bool) {
        try
        {
          long l = this.zzf.zze(paramzzawj);
          return l;
        }
        catch (RemoteException paramzzawj)
        {
          zzbzt.zzh("Unable to call into cache service.", paramzzawj);
        }
      }
      return -2L;
    }
  }
  
  public final zzawg zzb(zzawj paramzzawj)
  {
    synchronized (this.zzc)
    {
      if (this.zzf == null)
      {
        paramzzawj = new com/google/android/gms/internal/ads/zzawg;
        paramzzawj.<init>();
        return paramzzawj;
      }
      try
      {
        if (this.zzd.zzp())
        {
          paramzzawj = this.zzf.zzg(paramzzawj);
          return paramzzawj;
        }
        paramzzawj = this.zzf.zzf(paramzzawj);
        return paramzzawj;
      }
      catch (RemoteException paramzzawj)
      {
        zzbzt.zzh("Unable to call into cache service.", paramzzawj);
        paramzzawj = new com/google/android/gms/internal/ads/zzawg;
        paramzzawj.<init>();
        return paramzzawj;
      }
    }
  }
  
  protected final zzawi zzd(BaseGmsClient.BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    try
    {
      paramBaseConnectionCallbacks = new zzawi(this.zze, zzt.zzt().zzb(), paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener);
      return paramBaseConnectionCallbacks;
    }
    finally
    {
      paramBaseConnectionCallbacks = finally;
      throw paramBaseConnectionCallbacks;
    }
  }
  
  public final void zzi(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    synchronized (this.zzc)
    {
      if (this.zze != null) {
        return;
      }
      this.zze = paramContext.getApplicationContext();
      paramContext = zzbbk.zzdU;
      if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
      {
        zzl();
      }
      else
      {
        paramContext = zzbbk.zzdT;
        if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
        {
          paramContext = new com/google/android/gms/internal/ads/zzawc;
          paramContext.<init>(this);
          zzt.zzb().zzc(paramContext);
        }
      }
      return;
    }
  }
  
  public final void zzj()
  {
    ??? = zzbbk.zzdV;
    if (((Boolean)zzba.zzc().zzb((zzbbc)???)).booleanValue()) {
      synchronized (this.zzc)
      {
        zzl();
        Object localObject2 = this.zza;
        if (localObject2 != null) {
          ((ScheduledFuture)localObject2).cancel(false);
        }
        localObject2 = zzcag.zzd;
        Runnable localRunnable = this.zzb;
        zzbbc localzzbbc = zzbbk.zzdW;
        this.zza = ((ScheduledExecutorService)localObject2).schedule(localRunnable, ((Long)zzba.zzc().zzb(localzzbbc)).longValue(), TimeUnit.MILLISECONDS);
        return;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */