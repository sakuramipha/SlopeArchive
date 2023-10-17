package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

public final class zzdmj
  extends VideoController.VideoLifecycleCallbacks
{
  private final zzdhc zza;
  
  public zzdmj(zzdhc paramzzdhc)
  {
    this.zza = paramzzdhc;
  }
  
  private static zzdt zza(zzdhc paramzzdhc)
  {
    paramzzdhc = paramzzdhc.zzj();
    if (paramzzdhc == null) {
      return null;
    }
    try
    {
      paramzzdhc = paramzzdhc.zzi();
      return paramzzdhc;
    }
    catch (RemoteException paramzzdhc) {}
    return null;
  }
  
  public final void onVideoEnd()
  {
    zzdt localzzdt = zza(this.zza);
    if (localzzdt == null) {
      return;
    }
    try
    {
      localzzdt.zze();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzk("Unable to call onVideoEnd()", localRemoteException);
    }
  }
  
  public final void onVideoPause()
  {
    zzdt localzzdt = zza(this.zza);
    if (localzzdt == null) {
      return;
    }
    try
    {
      localzzdt.zzg();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzk("Unable to call onVideoEnd()", localRemoteException);
    }
  }
  
  public final void onVideoStart()
  {
    zzdt localzzdt = zza(this.zza);
    if (localzzdt == null) {
      return;
    }
    try
    {
      localzzdt.zzi();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzk("Unable to call onVideoEnd()", localRemoteException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */