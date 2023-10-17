package com.unity3d.player;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

public class NetworkConnectivityNougat
  extends NetworkConnectivity
{
  private int b = 0;
  private final ConnectivityManager.NetworkCallback c;
  
  public NetworkConnectivityNougat(Context paramContext)
  {
    super(paramContext);
    paramContext = new a();
    this.c = paramContext;
    if (this.a == null) {
      return;
    }
    this.b = super.b();
    this.a.registerDefaultNetworkCallback(paramContext);
  }
  
  public void a()
  {
    ConnectivityManager localConnectivityManager = this.a;
    if (localConnectivityManager == null) {
      return;
    }
    localConnectivityManager.unregisterNetworkCallback(this.c);
  }
  
  public int b()
  {
    return this.b;
  }
  
  class a
    extends ConnectivityManager.NetworkCallback
  {
    a() {}
    
    public void onAvailable(Network paramNetwork)
    {
      super.onAvailable(paramNetwork);
    }
    
    public void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
    {
      super.onCapabilitiesChanged(paramNetwork, paramNetworkCapabilities);
      int i;
      if (paramNetworkCapabilities.hasTransport(0))
      {
        paramNetwork = NetworkConnectivityNougat.this;
        i = 1;
      }
      else
      {
        paramNetwork = NetworkConnectivityNougat.this;
        i = 2;
      }
      NetworkConnectivityNougat.-$$Nest$fputb(paramNetwork, i);
    }
    
    public void onLost(Network paramNetwork)
    {
      super.onLost(paramNetwork);
      NetworkConnectivityNougat.-$$Nest$fputb(NetworkConnectivityNougat.this, 0);
    }
    
    public void onUnavailable()
    {
      super.onUnavailable();
      NetworkConnectivityNougat.-$$Nest$fputb(NetworkConnectivityNougat.this, 0);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\NetworkConnectivityNougat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */