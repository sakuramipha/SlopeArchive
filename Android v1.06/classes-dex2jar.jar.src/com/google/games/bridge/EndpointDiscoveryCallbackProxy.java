package com.google.games.bridge;

import com.google.android.gms.nearby.connection.DiscoveredEndpointInfo;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

public class EndpointDiscoveryCallbackProxy
  extends EndpointDiscoveryCallback
{
  private Callback callback;
  
  public EndpointDiscoveryCallbackProxy(Callback paramCallback)
  {
    this.callback = paramCallback;
  }
  
  public void onEndpointFound(String paramString, DiscoveredEndpointInfo paramDiscoveredEndpointInfo)
  {
    this.callback.onEndpointFound(paramString, paramDiscoveredEndpointInfo);
  }
  
  public void onEndpointLost(String paramString)
  {
    this.callback.onEndpointLost(paramString);
  }
  
  public static abstract interface Callback
  {
    public abstract void onEndpointFound(String paramString, DiscoveredEndpointInfo paramDiscoveredEndpointInfo);
    
    public abstract void onEndpointLost(String paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\EndpointDiscoveryCallbackProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */