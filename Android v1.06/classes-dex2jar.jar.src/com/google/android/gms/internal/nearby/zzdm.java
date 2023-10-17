package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import java.util.List;

public final class zzdm
  implements Connections
{
  public static final Api.ClientKey<zzbf> zza = new Api.ClientKey();
  public static final Api.AbstractClientBuilder<zzbf, ConnectionsOptions> zzb = new zzcy();
  
  public final PendingResult<Status> acceptConnection(GoogleApiClient paramGoogleApiClient, String paramString, PayloadCallback paramPayloadCallback)
  {
    return paramGoogleApiClient.execute(new zzdg(this, paramGoogleApiClient, paramString, paramGoogleApiClient.registerListener(paramPayloadCallback)));
  }
  
  @Deprecated
  public final PendingResult<Status> acceptConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, Connections.MessageListener paramMessageListener)
  {
    return paramGoogleApiClient.execute(new zzcw(this, paramGoogleApiClient, paramString, paramArrayOfByte, paramGoogleApiClient.registerListener(paramMessageListener)));
  }
  
  public final PendingResult<Status> cancelPayload(GoogleApiClient paramGoogleApiClient, long paramLong)
  {
    return paramGoogleApiClient.execute(new zzcq(this, paramGoogleApiClient, paramLong));
  }
  
  public final void disconnectFromEndpoint(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient.execute(new zzcr(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult<Status> rejectConnection(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.execute(new zzdh(this, paramGoogleApiClient, paramString));
  }
  
  @Deprecated
  public final PendingResult<Status> rejectConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.execute(new zzcx(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult<Status> requestConnection(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback)
  {
    return paramGoogleApiClient.execute(new zzdf(this, paramGoogleApiClient, paramString1, paramString2, paramGoogleApiClient.registerListener(paramConnectionLifecycleCallback)));
  }
  
  @Deprecated
  public final PendingResult<Status> sendConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte, Connections.ConnectionResponseCallback paramConnectionResponseCallback, Connections.MessageListener paramMessageListener)
  {
    return paramGoogleApiClient.execute(new zzcv(this, paramGoogleApiClient, paramString1, paramString2, paramArrayOfByte, paramGoogleApiClient.registerListener(paramConnectionResponseCallback), paramGoogleApiClient.registerListener(paramMessageListener)));
  }
  
  public final PendingResult<Status> sendPayload(GoogleApiClient paramGoogleApiClient, String paramString, Payload paramPayload)
  {
    return paramGoogleApiClient.execute(new zzco(this, paramGoogleApiClient, paramString, paramPayload));
  }
  
  public final PendingResult<Status> sendPayload(GoogleApiClient paramGoogleApiClient, List<String> paramList, Payload paramPayload)
  {
    return paramGoogleApiClient.execute(new zzcp(this, paramGoogleApiClient, paramList, paramPayload));
  }
  
  @Deprecated
  public final void sendReliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.execute(new zzcz(this, paramGoogleApiClient, paramString, paramArrayOfByte));
  }
  
  @Deprecated
  public final void sendReliableMessage(GoogleApiClient paramGoogleApiClient, List<String> paramList, byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.execute(new zzda(this, paramGoogleApiClient, paramList, paramArrayOfByte));
  }
  
  @Deprecated
  public final void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.execute(new zzco(this, paramGoogleApiClient, paramString, Payload.fromBytes(paramArrayOfByte)));
  }
  
  @Deprecated
  public final void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, List<String> paramList, byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.execute(new zzcp(this, paramGoogleApiClient, paramList, Payload.fromBytes(paramArrayOfByte)));
  }
  
  @Deprecated
  public final PendingResult<Connections.StartAdvertisingResult> startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString, AppMetadata paramAppMetadata, long paramLong, Connections.ConnectionRequestListener paramConnectionRequestListener)
  {
    return paramGoogleApiClient.execute(new zzct(this, paramGoogleApiClient, paramString, paramLong, paramGoogleApiClient.registerListener(paramConnectionRequestListener)));
  }
  
  public final PendingResult<Connections.StartAdvertisingResult> startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback, AdvertisingOptions paramAdvertisingOptions)
  {
    return paramGoogleApiClient.execute(new zzdb(this, paramGoogleApiClient, paramString1, paramString2, paramGoogleApiClient.registerListener(paramConnectionLifecycleCallback), paramAdvertisingOptions));
  }
  
  @Deprecated
  public final PendingResult<Status> startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong, Connections.EndpointDiscoveryListener paramEndpointDiscoveryListener)
  {
    return paramGoogleApiClient.execute(new zzcu(this, paramGoogleApiClient, paramString, paramLong, paramGoogleApiClient.registerListener(paramEndpointDiscoveryListener)));
  }
  
  public final PendingResult<Status> startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, EndpointDiscoveryCallback paramEndpointDiscoveryCallback, DiscoveryOptions paramDiscoveryOptions)
  {
    return paramGoogleApiClient.execute(new zzdd(this, paramGoogleApiClient, paramString, paramGoogleApiClient.registerListener(paramEndpointDiscoveryCallback), paramDiscoveryOptions));
  }
  
  public final void stopAdvertising(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient.execute(new zzdc(this, paramGoogleApiClient));
  }
  
  public final void stopAllEndpoints(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient.execute(new zzcs(this, paramGoogleApiClient));
  }
  
  public final void stopDiscovery(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient.execute(new zzde(this, paramGoogleApiClient));
  }
  
  @Deprecated
  public final void stopDiscovery(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient.execute(new zzde(this, paramGoogleApiClient));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */