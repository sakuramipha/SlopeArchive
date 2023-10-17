package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class zzd
  extends zzab
{
  private BaseGmsClient zza;
  private final int zzb;
  
  public zzd(BaseGmsClient paramBaseGmsClient, int paramInt)
  {
    this.zza = paramBaseGmsClient;
    this.zzb = paramInt;
  }
  
  public final void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
    this.zza.onPostInitHandler(paramInt, paramIBinder, paramBundle, this.zzb);
    this.zza = null;
  }
  
  public final void zzb(int paramInt, Bundle paramBundle)
  {
    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
  }
  
  public final void zzc(int paramInt, IBinder paramIBinder, zzj paramzzj)
  {
    BaseGmsClient localBaseGmsClient = this.zza;
    Preconditions.checkNotNull(localBaseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
    Preconditions.checkNotNull(paramzzj);
    BaseGmsClient.zzj(localBaseGmsClient, paramzzj);
    onPostInitComplete(paramInt, paramIBinder, paramzzj.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */