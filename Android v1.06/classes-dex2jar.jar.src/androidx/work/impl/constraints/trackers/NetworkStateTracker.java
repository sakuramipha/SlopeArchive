package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class NetworkStateTracker
  extends ConstraintTracker<NetworkState>
{
  static final String TAG = Logger.tagWithPrefix("NetworkStateTracker");
  private NetworkStateBroadcastReceiver mBroadcastReceiver;
  private final ConnectivityManager mConnectivityManager = (ConnectivityManager)this.mAppContext.getSystemService("connectivity");
  private NetworkStateCallback mNetworkCallback;
  
  public NetworkStateTracker(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
    if (isNetworkCallbackSupported()) {
      this.mNetworkCallback = new NetworkStateCallback();
    } else {
      this.mBroadcastReceiver = new NetworkStateBroadcastReceiver();
    }
  }
  
  private static boolean isNetworkCallbackSupported()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 24) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  NetworkState getActiveNetworkState()
  {
    NetworkInfo localNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
    boolean bool2 = true;
    boolean bool1;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool3 = isActiveNetworkValidated();
    boolean bool4 = ConnectivityManagerCompat.isActiveNetworkMetered(this.mConnectivityManager);
    if ((localNetworkInfo == null) || (localNetworkInfo.isRoaming())) {
      bool2 = false;
    }
    return new NetworkState(bool1, bool3, bool4, bool2);
  }
  
  public NetworkState getInitialState()
  {
    return getActiveNetworkState();
  }
  
  boolean isActiveNetworkValidated()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    if (i < 23) {
      return false;
    }
    try
    {
      Object localObject = this.mConnectivityManager.getActiveNetwork();
      localObject = this.mConnectivityManager.getNetworkCapabilities((Network)localObject);
      boolean bool1 = bool2;
      if (localObject != null)
      {
        boolean bool3 = ((NetworkCapabilities)localObject).hasCapability(16);
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (SecurityException localSecurityException)
    {
      Logger.get().error(TAG, "Unable to validate active network", new Throwable[] { localSecurityException });
    }
    return false;
  }
  
  public void startTracking()
  {
    if (isNetworkCallbackSupported())
    {
      try
      {
        Logger.get().debug(TAG, "Registering network callback", new Throwable[0]);
        this.mConnectivityManager.registerDefaultNetworkCallback(this.mNetworkCallback);
      }
      catch (SecurityException localSecurityException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
      Logger.get().error(TAG, "Received exception while registering network callback", new Throwable[] { localIllegalArgumentException });
    }
    else
    {
      Logger.get().debug(TAG, "Registering broadcast receiver", new Throwable[0]);
      this.mAppContext.registerReceiver(this.mBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
  }
  
  public void stopTracking()
  {
    if (isNetworkCallbackSupported())
    {
      try
      {
        Logger.get().debug(TAG, "Unregistering network callback", new Throwable[0]);
        this.mConnectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
      }
      catch (SecurityException localSecurityException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
      Logger.get().error(TAG, "Received exception while unregistering network callback", new Throwable[] { localIllegalArgumentException });
    }
    else
    {
      Logger.get().debug(TAG, "Unregistering broadcast receiver", new Throwable[0]);
      this.mAppContext.unregisterReceiver(this.mBroadcastReceiver);
    }
  }
  
  private class NetworkStateBroadcastReceiver
    extends BroadcastReceiver
  {
    NetworkStateBroadcastReceiver() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ((paramIntent != null) && (paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")))
      {
        Logger.get().debug(NetworkStateTracker.TAG, "Network broadcast received", new Throwable[0]);
        paramContext = NetworkStateTracker.this;
        paramContext.setState(paramContext.getActiveNetworkState());
      }
    }
  }
  
  private class NetworkStateCallback
    extends ConnectivityManager.NetworkCallback
  {
    NetworkStateCallback() {}
    
    public void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
    {
      Logger.get().debug(NetworkStateTracker.TAG, String.format("Network capabilities changed: %s", new Object[] { paramNetworkCapabilities }), new Throwable[0]);
      paramNetwork = NetworkStateTracker.this;
      paramNetwork.setState(paramNetwork.getActiveNetworkState());
    }
    
    public void onLost(Network paramNetwork)
    {
      Logger.get().debug(NetworkStateTracker.TAG, "Network connection lost", new Throwable[0]);
      paramNetwork = NetworkStateTracker.this;
      paramNetwork.setState(paramNetwork.getActiveNetworkState());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\trackers\NetworkStateTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */