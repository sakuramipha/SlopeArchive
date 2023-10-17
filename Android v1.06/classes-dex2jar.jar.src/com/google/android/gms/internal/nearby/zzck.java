package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;
import com.google.android.gms.nearby.connection.zzg;

final class zzck
  extends ConnectionLifecycleCallback
{
  final zzcn zza;
  private final ConnectionLifecycleCallback zzb;
  
  zzck(zzcn paramzzcn, ConnectionLifecycleCallback paramConnectionLifecycleCallback)
  {
    this.zzb = paramConnectionLifecycleCallback;
  }
  
  public final void onConnectionInitiated(String paramString, ConnectionInfo paramConnectionInfo)
  {
    if (paramConnectionInfo.isIncomingConnection()) {
      zzcn.zze(this.zza, paramString);
    }
    this.zzb.onConnectionInitiated(paramString, paramConnectionInfo);
  }
  
  public final void onConnectionResult(String paramString, ConnectionResolution paramConnectionResolution)
  {
    if (!paramConnectionResolution.getStatus().isSuccess()) {
      zzcn.zzd(this.zza, paramString);
    }
    this.zzb.onConnectionResult(paramString, paramConnectionResolution);
  }
  
  public final void onDisconnected(String paramString)
  {
    zzcn.zzd(this.zza, paramString);
    this.zzb.onDisconnected(paramString);
  }
  
  public final void zza(String paramString, zzg paramzzg)
  {
    this.zzb.zza(paramString, paramzzg);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */