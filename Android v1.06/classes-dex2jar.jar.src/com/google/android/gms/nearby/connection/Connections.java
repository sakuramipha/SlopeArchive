package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;

@Deprecated
public abstract interface Connections
{
  @Deprecated
  public static final long DURATION_INDEFINITE = 0L;
  public static final int MAX_BYTES_DATA_SIZE = 32768;
  @Deprecated
  public static final int MAX_RELIABLE_MESSAGE_LEN = 4096;
  @Deprecated
  public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
  
  public abstract PendingResult<Status> acceptConnection(GoogleApiClient paramGoogleApiClient, String paramString, PayloadCallback paramPayloadCallback);
  
  @Deprecated
  public abstract PendingResult<Status> acceptConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, MessageListener paramMessageListener);
  
  public abstract PendingResult<Status> cancelPayload(GoogleApiClient paramGoogleApiClient, long paramLong);
  
  public abstract void disconnectFromEndpoint(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult<Status> rejectConnection(GoogleApiClient paramGoogleApiClient, String paramString);
  
  @Deprecated
  public abstract PendingResult<Status> rejectConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult<Status> requestConnection(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback);
  
  @Deprecated
  public abstract PendingResult<Status> sendConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte, ConnectionResponseCallback paramConnectionResponseCallback, MessageListener paramMessageListener);
  
  public abstract PendingResult<Status> sendPayload(GoogleApiClient paramGoogleApiClient, String paramString, Payload paramPayload);
  
  public abstract PendingResult<Status> sendPayload(GoogleApiClient paramGoogleApiClient, List<String> paramList, Payload paramPayload);
  
  @Deprecated
  public abstract void sendReliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte);
  
  @Deprecated
  public abstract void sendReliableMessage(GoogleApiClient paramGoogleApiClient, List<String> paramList, byte[] paramArrayOfByte);
  
  @Deprecated
  public abstract void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte);
  
  @Deprecated
  public abstract void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, List<String> paramList, byte[] paramArrayOfByte);
  
  @Deprecated
  public abstract PendingResult<StartAdvertisingResult> startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString, AppMetadata paramAppMetadata, long paramLong, ConnectionRequestListener paramConnectionRequestListener);
  
  public abstract PendingResult<StartAdvertisingResult> startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback, AdvertisingOptions paramAdvertisingOptions);
  
  @Deprecated
  public abstract PendingResult<Status> startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong, EndpointDiscoveryListener paramEndpointDiscoveryListener);
  
  public abstract PendingResult<Status> startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, EndpointDiscoveryCallback paramEndpointDiscoveryCallback, DiscoveryOptions paramDiscoveryOptions);
  
  public abstract void stopAdvertising(GoogleApiClient paramGoogleApiClient);
  
  public abstract void stopAllEndpoints(GoogleApiClient paramGoogleApiClient);
  
  public abstract void stopDiscovery(GoogleApiClient paramGoogleApiClient);
  
  @Deprecated
  public abstract void stopDiscovery(GoogleApiClient paramGoogleApiClient, String paramString);
  
  @Deprecated
  public static abstract class ConnectionRequestListener
  {
    public void onConnectionRequest(String paramString1, String paramString2, byte[] paramArrayOfByte) {}
  }
  
  @Deprecated
  public static abstract interface ConnectionResponseCallback
  {
    public abstract void onConnectionResponse(String paramString, Status paramStatus, byte[] paramArrayOfByte);
  }
  
  @Deprecated
  public static abstract class EndpointDiscoveryListener
  {
    public void onEndpointFound(String paramString1, String paramString2, String paramString3) {}
    
    public abstract void onEndpointLost(String paramString);
  }
  
  @Deprecated
  public static abstract interface MessageListener
  {
    @Deprecated
    public abstract void onDisconnected(String paramString);
    
    @Deprecated
    public abstract void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);
  }
  
  public static abstract interface StartAdvertisingResult
    extends Result
  {
    public abstract String getLocalEndpointName();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\Connections.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */