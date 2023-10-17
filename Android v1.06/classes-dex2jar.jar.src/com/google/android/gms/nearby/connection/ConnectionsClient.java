package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.List;

public abstract interface ConnectionsClient
  extends HasApiKey<ConnectionsOptions>
{
  public static final int MAX_BYTES_DATA_SIZE = 32768;
  
  public abstract Task<Void> acceptConnection(String paramString, PayloadCallback paramPayloadCallback);
  
  public abstract Task<Void> cancelPayload(long paramLong);
  
  public abstract void disconnectFromEndpoint(String paramString);
  
  public abstract Task<Void> rejectConnection(String paramString);
  
  public abstract Task<Void> requestConnection(String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback);
  
  public abstract Task<Void> requestConnection(String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback, ConnectionOptions paramConnectionOptions);
  
  public abstract Task<Void> requestConnection(byte[] paramArrayOfByte, String paramString, ConnectionLifecycleCallback paramConnectionLifecycleCallback);
  
  public abstract Task<Void> requestConnection(byte[] paramArrayOfByte, String paramString, ConnectionLifecycleCallback paramConnectionLifecycleCallback, ConnectionOptions paramConnectionOptions);
  
  public abstract Task<Void> sendPayload(String paramString, Payload paramPayload);
  
  public abstract Task<Void> sendPayload(List<String> paramList, Payload paramPayload);
  
  public abstract Task<Void> startAdvertising(String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback, AdvertisingOptions paramAdvertisingOptions);
  
  public abstract Task<Void> startAdvertising(byte[] paramArrayOfByte, String paramString, ConnectionLifecycleCallback paramConnectionLifecycleCallback, AdvertisingOptions paramAdvertisingOptions);
  
  public abstract Task<Void> startDiscovery(String paramString, EndpointDiscoveryCallback paramEndpointDiscoveryCallback, DiscoveryOptions paramDiscoveryOptions);
  
  public abstract void stopAdvertising();
  
  public abstract void stopAllEndpoints();
  
  public abstract void stopDiscovery();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\ConnectionsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */