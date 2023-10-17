package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class zzg
  extends zza
{
  final BaseGmsClient zze;
  
  public zzg(BaseGmsClient paramBaseGmsClient, int paramInt, Bundle paramBundle)
  {
    super(paramBaseGmsClient, paramInt, null);
  }
  
  protected final void zzb(ConnectionResult paramConnectionResult)
  {
    if ((this.zze.enableLocalFallback()) && (BaseGmsClient.zzo(this.zze)))
    {
      BaseGmsClient.zzk(this.zze, 16);
      return;
    }
    this.zze.zzc.onReportServiceBinding(paramConnectionResult);
    this.zze.onConnectionFailed(paramConnectionResult);
  }
  
  protected final boolean zzd()
  {
    this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */