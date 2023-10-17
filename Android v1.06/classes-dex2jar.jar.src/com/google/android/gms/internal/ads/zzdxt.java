package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzdxt
  implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener
{
  protected final zzcal zza = new zzcal();
  protected boolean zzb = false;
  protected boolean zzc = false;
  protected zzbtj zzd;
  protected Context zze;
  protected Looper zzf;
  protected ScheduledExecutorService zzg;
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    paramConnectionResult = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", new Object[] { Integer.valueOf(paramConnectionResult.getErrorCode()) });
    zzbzt.zze(paramConnectionResult);
    this.zza.zze(new zzdwc(1, paramConnectionResult));
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", new Object[] { Integer.valueOf(paramInt) });
    zzbzt.zze(str);
    this.zza.zze(new zzdwc(1, str));
  }
  
  protected final void zzb()
  {
    try
    {
      if (this.zzd == null)
      {
        zzbtj localzzbtj = new com/google/android/gms/internal/ads/zzbtj;
        localzzbtj.<init>(this.zze, this.zzf, this, this);
        this.zzd = localzzbtj;
      }
      this.zzd.checkAvailabilityAndConnect();
      return;
    }
    finally {}
  }
  
  protected final void zzc()
  {
    try
    {
      this.zzc = true;
      zzbtj localzzbtj = this.zzd;
      if (localzzbtj == null) {
        return;
      }
      if ((localzzbtj.isConnected()) || (this.zzd.isConnecting())) {
        this.zzd.disconnect();
      }
      Binder.flushPendingCommands();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */