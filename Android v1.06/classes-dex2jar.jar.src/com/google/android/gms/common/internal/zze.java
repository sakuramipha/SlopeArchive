package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class zze
  implements ServiceConnection
{
  final BaseGmsClient zza;
  private final int zzb;
  
  public zze(BaseGmsClient paramBaseGmsClient, int paramInt)
  {
    this.zzb = paramInt;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.zza;
    if (paramIBinder == null)
    {
      BaseGmsClient.zzk(paramComponentName, 16);
      return;
    }
    synchronized (BaseGmsClient.zzd(paramComponentName))
    {
      BaseGmsClient localBaseGmsClient = this.zza;
      paramComponentName = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if ((paramComponentName != null) && ((paramComponentName instanceof IGmsServiceBroker))) {
        paramComponentName = (IGmsServiceBroker)paramComponentName;
      } else {
        paramComponentName = new zzac(paramIBinder);
      }
      BaseGmsClient.zzh(localBaseGmsClient, paramComponentName);
      this.zza.zzl(0, null, this.zzb);
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName arg1)
  {
    synchronized (BaseGmsClient.zzd(this.zza))
    {
      BaseGmsClient.zzh(this.zza, null);
      ??? = this.zza.zzb;
      ???.sendMessage(???.obtainMessage(6, this.zzb, 1));
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */