package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzbkb
  implements BaseGmsClient.BaseConnectionCallbacks
{
  final zzbkd zzb;
  
  zzbkb(zzbkd paramzzbkd, zzcal paramzzcal) {}
  
  public final void onConnected(Bundle paramBundle)
  {
    try
    {
      this.zza.zzd(zzbkd.zzb(this.zzb).zzp());
      return;
    }
    catch (DeadObjectException paramBundle)
    {
      this.zza.zze(paramBundle);
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    zzcal localzzcal = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("onConnectionSuspended: ");
    localStringBuilder.append(paramInt);
    localzzcal.zze(new RuntimeException(localStringBuilder.toString()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */