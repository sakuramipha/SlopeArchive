package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.AdapterStatus.State;

final class zzee
  implements AdapterStatus
{
  zzee(zzej paramzzej) {}
  
  public final String getDescription()
  {
    return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
  }
  
  public final AdapterStatus.State getInitializationState()
  {
    return AdapterStatus.State.READY;
  }
  
  public final int getLatency()
  {
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */