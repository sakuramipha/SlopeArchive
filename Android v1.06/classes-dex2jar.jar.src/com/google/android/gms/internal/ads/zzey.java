package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;

final class zzey
  extends TelephonyCallback
  implements TelephonyCallback.DisplayInfoListener
{
  private final zzfb zza;
  
  public zzey(zzfb paramzzfb)
  {
    this.zza = paramzzfb;
  }
  
  public final void onDisplayInfoChanged(TelephonyDisplayInfo paramTelephonyDisplayInfo)
  {
    int i = paramTelephonyDisplayInfo.getOverrideNetworkType();
    int j = 5;
    if ((i != 3) && (i != 4) && (i != 5)) {
      i = 0;
    } else {
      i = 1;
    }
    paramTelephonyDisplayInfo = this.zza;
    if (1 != i) {
      i = j;
    } else {
      i = 10;
    }
    zzfb.zzc(paramTelephonyDisplayInfo, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */