package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public abstract class zzdvn
  implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener
{
  protected final zzcal zza = new zzcal();
  protected final Object zzb = new Object();
  protected boolean zzc = false;
  protected boolean zzd = false;
  protected zzbug zze;
  protected zzbtg zzf;
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzbzt.zze("Disconnected from remote ad request service.");
    this.zza.zze(new zzdwc(1));
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    zzbzt.zze("Cannot connect to remote service, fallback to local instance.");
  }
  
  protected final void zza()
  {
    synchronized (this.zzb)
    {
      this.zzd = true;
      if ((this.zzf.isConnected()) || (this.zzf.isConnecting())) {
        this.zzf.disconnect();
      }
      Binder.flushPendingCommands();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */