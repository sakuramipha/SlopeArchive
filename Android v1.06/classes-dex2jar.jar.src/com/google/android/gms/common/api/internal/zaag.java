package com.google.android.gms.common.api.internal;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zaag
  extends GoogleApiClient
{
  private final String zaa = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";
  
  public zaag(String paramString) {}
  
  public final ConnectionResult blockingConnect()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final PendingResult<Status> clearDefaultAccountAndReconnect()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void connect()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void disconnect()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final ConnectionResult getConnectionResult(Api<?> paramApi)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final boolean hasConnectedApi(Api<?> paramApi)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final boolean isConnected()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final boolean isConnecting()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void reconnect()
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void stopAutoManage(FragmentActivity paramFragmentActivity)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
  
  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    throw new UnsupportedOperationException(this.zaa);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */