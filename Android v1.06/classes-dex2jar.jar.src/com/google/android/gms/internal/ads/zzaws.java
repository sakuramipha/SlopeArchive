package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzaws
  implements BaseGmsClient.BaseOnConnectionFailedListener
{
  final zzawt zzb;
  
  zzaws(zzawt paramzzawt, zzcal paramzzcal) {}
  
  public final void onConnectionFailed(ConnectionResult arg1)
  {
    synchronized (zzawt.zzb(this.zzb))
    {
      zzcal localzzcal = this.zza;
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Connection failed.");
      localzzcal.zze(localRuntimeException);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */