package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RegistrationMethods.Builder;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.zza;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final class zzcn
  extends GoogleApi<ConnectionsOptions>
  implements ConnectionsClient
{
  public static final int zza = 0;
  private static final Api.ClientKey<zzbf> zzb;
  private static final Api.AbstractClientBuilder<zzbf, ConnectionsOptions> zzc;
  private static final Api<ConnectionsOptions> zzd;
  private final zzo zze = zzo.zza(this, null);
  private final zzet zzf;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    zzb = localClientKey;
    zzce localzzce = new zzce();
    zzc = localzzce;
    zzd = new Api("Nearby.CONNECTIONS_API", localzzce, localClientKey);
  }
  
  public zzcn(Activity paramActivity, ConnectionsOptions paramConnectionsOptions)
  {
    super(paramActivity, zzd, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    if (Build.VERSION.SDK_INT >= 19)
    {
      this.zzf = zzet.zza(paramActivity);
      return;
    }
    this.zzf = null;
  }
  
  public zzcn(Context paramContext, ConnectionsOptions paramConnectionsOptions)
  {
    super(paramContext, zzd, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    this.zzf = null;
  }
  
  private final void zzf(String paramString)
  {
    paramString = this.zze.zzc(this, paramString, "connection");
    this.zze.zze(this, RegistrationMethods.builder().withHolder(paramString).register(zzbt.zza).unregister(zzbu.zza).setMethodKey(1268).build());
  }
  
  private final void zzg(String paramString)
  {
    zzo localzzo = this.zze;
    localzzo.zzf(this, localzzo.zzd(paramString, "connection"));
  }
  
  private final Task<Void> zzh(zzcj paramzzcj)
  {
    return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new zzbv(this, paramzzcj)).build());
  }
  
  private final Task<Void> zzi(zzcm paramzzcm)
  {
    return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new zzbw(paramzzcm)).build());
  }
  
  public final Task<Void> acceptConnection(String paramString, PayloadCallback paramPayloadCallback)
  {
    paramPayloadCallback = registerListener(paramPayloadCallback, PayloadCallback.class.getName());
    return doWrite(TaskApiCall.builder().run(new zzbk(this, paramString, paramPayloadCallback)).setMethodKey(1227).build());
  }
  
  public final Task<Void> cancelPayload(long paramLong)
  {
    return zzh(new zzbo(paramLong));
  }
  
  public final void disconnectFromEndpoint(String paramString)
  {
    zzi(new zzbp(paramString));
    zzg(paramString);
  }
  
  public final Task<Void> rejectConnection(String paramString)
  {
    return zzh(new zzbl(paramString));
  }
  
  public final Task<Void> requestConnection(String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback)
  {
    paramConnectionLifecycleCallback = registerListener(new zzck(this, paramConnectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
    zzf(paramString2);
    return doWrite(TaskApiCall.builder().run(new zzbj(this, paramString1, paramString2, paramConnectionLifecycleCallback)).setMethodKey(1226).build()).addOnFailureListener(new zzci(this, paramString2));
  }
  
  public final Task<Void> requestConnection(String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback, ConnectionOptions paramConnectionOptions)
  {
    paramConnectionLifecycleCallback = registerListener(new zzck(this, paramConnectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
    zzf(paramString2);
    return doWrite(TaskApiCall.builder().setFeatures(new Feature[] { zza.zze }).run(new zzbq(this, paramString1, paramString2, paramConnectionLifecycleCallback, paramConnectionOptions)).setMethodKey(1226).build()).addOnFailureListener(new zzcf(this, paramString2));
  }
  
  public final Task<Void> requestConnection(byte[] paramArrayOfByte, String paramString, ConnectionLifecycleCallback paramConnectionLifecycleCallback)
  {
    paramConnectionLifecycleCallback = registerListener(new zzck(this, paramConnectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
    zzf(paramString);
    return doWrite(TaskApiCall.builder().setFeatures(new Feature[] { zza.zze }).run(new zzca(this, paramArrayOfByte, paramString, paramConnectionLifecycleCallback)).setMethodKey(1226).build()).addOnFailureListener(new zzch(this, paramString));
  }
  
  public final Task<Void> requestConnection(byte[] paramArrayOfByte, String paramString, ConnectionLifecycleCallback paramConnectionLifecycleCallback, ConnectionOptions paramConnectionOptions)
  {
    paramConnectionLifecycleCallback = registerListener(new zzck(this, paramConnectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
    zzf(paramString);
    return doWrite(TaskApiCall.builder().setFeatures(new Feature[] { zza.zze }).run(new zzbx(this, paramArrayOfByte, paramString, paramConnectionLifecycleCallback, paramConnectionOptions)).setMethodKey(1226).build()).addOnFailureListener(new zzcg(this, paramString));
  }
  
  public final Task<Void> sendPayload(String paramString, Payload paramPayload)
  {
    return doWrite(TaskApiCall.builder().run(new zzbm(this, paramString, paramPayload)).setMethodKey(1228).build());
  }
  
  public final Task<Void> sendPayload(List<String> paramList, Payload paramPayload)
  {
    return doWrite(TaskApiCall.builder().run(new zzbn(this, paramList, paramPayload)).setMethodKey(1228).build());
  }
  
  public final Task<Void> startAdvertising(String paramString1, String paramString2, ConnectionLifecycleCallback paramConnectionLifecycleCallback, AdvertisingOptions paramAdvertisingOptions)
  {
    paramConnectionLifecycleCallback = registerListener(new zzck(this, paramConnectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
    ListenerHolder localListenerHolder = this.zze.zzb(this, new Object(), "advertising");
    return this.zze.zze(this, RegistrationMethods.builder().withHolder(localListenerHolder).register(new zzcb(this, paramString1, paramString2, paramConnectionLifecycleCallback, paramAdvertisingOptions)).unregister(zzcc.zza).setMethodKey(1266).build());
  }
  
  public final Task<Void> startAdvertising(byte[] paramArrayOfByte, String paramString, ConnectionLifecycleCallback paramConnectionLifecycleCallback, AdvertisingOptions paramAdvertisingOptions)
  {
    ListenerHolder localListenerHolder = registerListener(new zzck(this, paramConnectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
    paramConnectionLifecycleCallback = this.zze.zzb(this, new Object(), "advertising");
    return this.zze.zze(this, RegistrationMethods.builder().withHolder(paramConnectionLifecycleCallback).setFeatures(new Feature[] { zza.zze }).register(new zzby(this, paramArrayOfByte, paramString, localListenerHolder, paramAdvertisingOptions)).unregister(zzbz.zza).setMethodKey(1266).build());
  }
  
  public final Task<Void> startDiscovery(String paramString, EndpointDiscoveryCallback paramEndpointDiscoveryCallback, DiscoveryOptions paramDiscoveryOptions)
  {
    paramEndpointDiscoveryCallback = this.zze.zzb(this, paramEndpointDiscoveryCallback, "discovery");
    return this.zze.zze(this, RegistrationMethods.builder().withHolder(paramEndpointDiscoveryCallback).register(new zzcd(this, paramString, paramEndpointDiscoveryCallback, paramDiscoveryOptions)).unregister(zzbg.zza).setMethodKey(1267).build()).addOnSuccessListener(new zzbh(this, paramDiscoveryOptions));
  }
  
  public final void stopAdvertising()
  {
    this.zze.zzg(this, "advertising");
  }
  
  public final void stopAllEndpoints()
  {
    this.zze.zzg(this, "advertising");
    this.zze.zzg(this, "discovery").addOnSuccessListener(new zzbi(this));
    zzi(zzbr.zza).addOnCompleteListener(new zzbs(this));
  }
  
  public final void stopDiscovery()
  {
    this.zze.zzg(this, "discovery").addOnSuccessListener(new zzbi(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */