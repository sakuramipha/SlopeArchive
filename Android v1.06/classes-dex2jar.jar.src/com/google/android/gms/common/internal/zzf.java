package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzf
  extends zza
{
  public final IBinder zze;
  final BaseGmsClient zzf;
  
  public zzf(BaseGmsClient paramBaseGmsClient, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramBaseGmsClient, paramInt, paramBundle);
    this.zze = paramIBinder;
  }
  
  protected final void zzb(ConnectionResult paramConnectionResult)
  {
    if (BaseGmsClient.zzc(this.zzf) != null) {
      BaseGmsClient.zzc(this.zzf).onConnectionFailed(paramConnectionResult);
    }
    this.zzf.onConnectionFailed(paramConnectionResult);
  }
  
  protected final boolean zzd()
  {
    try
    {
      Object localObject1 = this.zze;
      Preconditions.checkNotNull(localObject1);
      localObject1 = ((IBinder)localObject1).getInterfaceDescriptor();
      Object localObject2;
      if (!this.zzf.getServiceDescriptor().equals(localObject1))
      {
        String str = this.zzf.getServiceDescriptor();
        localObject2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(localObject1).length());
        ((StringBuilder)localObject2).append("service descriptor mismatch: ");
        ((StringBuilder)localObject2).append(str);
        ((StringBuilder)localObject2).append(" vs. ");
        ((StringBuilder)localObject2).append((String)localObject1);
        Log.w("GmsClient", ((StringBuilder)localObject2).toString());
        return false;
      }
      localObject1 = this.zzf.createServiceInterface(this.zze);
      if ((localObject1 != null) && ((BaseGmsClient.zzn(this.zzf, 2, 4, (IInterface)localObject1)) || (BaseGmsClient.zzn(this.zzf, 3, 4, (IInterface)localObject1))))
      {
        BaseGmsClient.zzg(this.zzf, null);
        localObject1 = this.zzf.getConnectionHint();
        localObject2 = this.zzf;
        if (BaseGmsClient.zzb((BaseGmsClient)localObject2) != null) {
          BaseGmsClient.zzb((BaseGmsClient)localObject2).onConnected((Bundle)localObject1);
        }
        return true;
      }
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("GmsClient", "service probably died");
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */