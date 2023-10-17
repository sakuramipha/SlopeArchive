package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public class NetworkConnectivity
  extends Activity
{
  protected ConnectivityManager a;
  
  public NetworkConnectivity(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.a = paramContext;
    if (paramContext == null) {
      u.Log(6, "NetworkConnectivity: ConnectivityManager not found");
    }
  }
  
  public void a() {}
  
  public int b()
  {
    Object localObject = this.a;
    if (localObject == null) {
      return 0;
    }
    boolean bool = PlatformSupport.MARSHMALLOW_SUPPORT;
    int i = 1;
    int j = 1;
    if (bool)
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetwork();
      if (localObject == null) {
        return 0;
      }
      localObject = this.a.getNetworkCapabilities((Network)localObject);
      if (localObject != null)
      {
        if (((NetworkCapabilities)localObject).hasTransport(0)) {
          i = j;
        } else {
          i = 2;
        }
        return i;
      }
    }
    else
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if ((localObject != null) && (((NetworkInfo)localObject).isConnected()))
      {
        if (((NetworkInfo)localObject).getType() != 0) {
          i = 2;
        }
        return i;
      }
    }
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\NetworkConnectivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */