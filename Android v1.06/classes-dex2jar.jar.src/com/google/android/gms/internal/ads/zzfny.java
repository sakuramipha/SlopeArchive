package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

final class zzfny
  implements ServiceConnection
{
  final zzfnz zza;
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    zzfnz.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] { paramComponentName });
    paramComponentName = this.zza;
    paramIBinder = new zzfnv(this, paramIBinder);
    paramComponentName.zzc().post(paramIBinder);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzfnz.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] { paramComponentName });
    paramComponentName = this.zza;
    zzfnw localzzfnw = new zzfnw(this);
    paramComponentName.zzc().post(localzzfnw);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */