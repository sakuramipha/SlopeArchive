package com.google.games.bridge;

import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

public class ConnectionLifecycleCallbackProxy
  extends ConnectionLifecycleCallback
{
  private Callback callback;
  
  public ConnectionLifecycleCallbackProxy(Callback paramCallback)
  {
    this.callback = paramCallback;
  }
  
  public void onConnectionInitiated(String paramString, ConnectionInfo paramConnectionInfo)
  {
    this.callback.onConnectionInitiated(paramString, paramConnectionInfo);
  }
  
  public void onConnectionResult(String paramString, ConnectionResolution paramConnectionResolution)
  {
    this.callback.onConnectionResult(paramString, paramConnectionResolution);
  }
  
  public void onDisconnected(String paramString)
  {
    this.callback.onDisconnected(paramString);
  }
  
  public static abstract interface Callback
  {
    public abstract void onConnectionInitiated(String paramString, ConnectionInfo paramConnectionInfo);
    
    public abstract void onConnectionResult(String paramString, ConnectionResolution paramConnectionResolution);
    
    public abstract void onDisconnected(String paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\ConnectionLifecycleCallbackProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */