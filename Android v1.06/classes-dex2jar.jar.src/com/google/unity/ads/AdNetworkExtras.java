package com.google.unity.ads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;

public abstract interface AdNetworkExtras
{
  public abstract Bundle buildExtras(HashMap<String, String> paramHashMap);
  
  public abstract Class<? extends MediationExtrasReceiver> getAdapterClass();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\AdNetworkExtras.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */