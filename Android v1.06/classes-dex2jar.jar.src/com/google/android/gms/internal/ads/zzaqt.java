package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

final class zzaqt
  extends ConnectivityManager.NetworkCallback
{
  final zzaqu zza;
  
  zzaqt(zzaqu paramzzaqu) {}
  
  public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
  {
    try
    {
      zzaqu.zzd(this.zza, paramNetworkCapabilities);
      return;
    }
    finally {}
  }
  
  public final void onLost(Network paramNetwork)
  {
    try
    {
      zzaqu.zzd(this.zza, null);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */