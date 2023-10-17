package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArraySet;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.Payload.File;
import com.google.android.gms.nearby.connection.Payload.Stream;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.zza;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public final class zzbf
  extends GmsClient<zzeh>
{
  private final long zze = hashCode();
  private final Set<zzap> zzf = new ArraySet();
  private final Set<zzbb> zzg = new ArraySet();
  private final Set<zzag> zzh = new ArraySet();
  private zzfx zzi;
  
  public zzbf(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, ConnectionsOptions paramConnectionsOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 54, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzgf.zzb(paramContext.getCacheDir());
  }
  
  private final void zzF()
  {
    Object localObject = this.zzf.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((zzap)((Iterator)localObject).next()).zze();
    }
    localObject = this.zzg.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((zzbb)((Iterator)localObject).next()).zzd();
    }
    localObject = this.zzh.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((zzag)((Iterator)localObject).next()).zzf();
    }
    this.zzf.clear();
    this.zzg.clear();
    this.zzh.clear();
    localObject = this.zzi;
    if (localObject != null)
    {
      ((zzfx)localObject).zzc();
      this.zzi = null;
    }
  }
  
  private static Status zzG(int paramInt)
  {
    return new Status(paramInt, ConnectionsStatusCodes.getStatusCodeString(paramInt));
  }
  
  public final void disconnect()
  {
    if (isConnected()) {
      try
      {
        zzeh localzzeh = (zzeh)getService();
        zzx localzzx = new com/google/android/gms/internal/nearby/zzx;
        localzzx.<init>();
        localzzeh.zzn(localzzx);
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", localRemoteException);
      }
    }
    zzF();
    super.disconnect();
  }
  
  public final Feature[] getApiFeatures()
  {
    return new Feature[] { zza.zze, zza.zzr };
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("clientId", this.zze);
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.nearby.connection.service.START";
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 1)
    {
      zzF();
      i = 1;
    }
    super.onConnectionSuspended(i);
  }
  
  public final boolean requiresGooglePlayServices()
  {
    return Nearby.zza(getContext());
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
  
  public final void zzA(BaseImplementation.ResultHolder<Status> paramResultHolder, String[] paramArrayOfString, Payload paramPayload, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      int i = paramPayload.getType();
      Object localObject1;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            try
            {
              localObject1 = ParcelFileDescriptor.createPipe();
              localObject3 = ParcelFileDescriptor.createPipe();
              localObject2 = new com/google/android/gms/internal/nearby/zzgc;
              ((zzgc)localObject2).<init>();
              ((zzgc)localObject2).zza(paramPayload.getId());
              ((zzgc)localObject2).zzb(paramPayload.getType());
              ((zzgc)localObject2).zzd(localObject1[0]);
              ((zzgc)localObject2).zzg(localObject3[0]);
              ((zzgc)localObject2).zzh(paramPayload.getOffset());
              localObject1 = Pair.create(((zzgc)localObject2).zzj(), zzhy.zzd(Pair.create(localObject1[1], localObject3[1])));
            }
            catch (IOException paramArrayOfString)
            {
              Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", new Object[] { Long.valueOf(paramPayload.getId()) }), paramArrayOfString);
              throw paramArrayOfString;
            }
          }
          else
          {
            paramArrayOfString = new java/lang/IllegalArgumentException;
            paramArrayOfString.<init>(String.format("Outgoing Payload %d has unknown type %d", new Object[] { Long.valueOf(paramPayload.getId()), Integer.valueOf(paramPayload.getType()) }));
            Log.wtf("NearbyConnections", "Unknown payload type!", paramArrayOfString);
            throw paramArrayOfString;
          }
        }
        else
        {
          localObject2 = paramPayload.asFile();
          zzhz.zza(localObject2, "File cannot be null for Payload.Type.FILE");
          localObject1 = ((Payload.File)localObject2).asJavaFile();
          if (localObject1 == null) {
            localObject1 = null;
          } else {
            localObject1 = ((File)localObject1).getAbsolutePath();
          }
          localObject3 = new com/google/android/gms/internal/nearby/zzgc;
          ((zzgc)localObject3).<init>();
          ((zzgc)localObject3).zza(paramPayload.getId());
          ((zzgc)localObject3).zzb(paramPayload.getType());
          ((zzgc)localObject3).zzd(((Payload.File)localObject2).asParcelFileDescriptor());
          ((zzgc)localObject3).zze((String)localObject1);
          ((zzgc)localObject3).zzf(((Payload.File)localObject2).getSize());
          ((zzgc)localObject3).zzh(paramPayload.getOffset());
          ((zzgc)localObject3).zzi(paramPayload.zzd());
          localObject1 = Pair.create(((zzgc)localObject3).zzj(), zzhy.zzc());
        }
      }
      else
      {
        localObject1 = new com/google/android/gms/internal/nearby/zzgc;
        ((zzgc)localObject1).<init>();
        ((zzgc)localObject1).zza(paramPayload.getId());
        ((zzgc)localObject1).zzb(paramPayload.getType());
        ((zzgc)localObject1).zzc(paramPayload.asBytes());
        localObject1 = Pair.create(((zzgc)localObject1).zzj(), zzhy.zzc());
      }
      Object localObject3 = (zzeh)getService();
      Object localObject2 = new zzgp();
      ((zzgp)localObject2).zza(new zzbc(paramResultHolder));
      ((zzgp)localObject2).zzb(paramArrayOfString);
      ((zzgp)localObject2).zzc((zzgd)((Pair)localObject1).first);
      ((zzeh)localObject3).zzk(((zzgp)localObject2).zzd());
      if (((zzhy)((Pair)localObject1).second).zza())
      {
        localObject2 = ((zzhy)((Pair)localObject1).second).zzb();
        paramResultHolder = this.zzi;
        paramArrayOfString = paramPayload.asStream().asInputStream();
        localObject2 = (Pair)localObject2;
        paramResultHolder.zza(paramArrayOfString, new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor)((Pair)localObject2).first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor)((Pair)localObject2).second), (zzgd)((Pair)localObject1).first, paramPayload.getId());
      }
      return;
    }
    catch (IOException paramArrayOfString)
    {
      Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", paramArrayOfString);
      paramResultHolder.setResult(zzG(8013));
    }
  }
  
  public final void zzB(BaseImplementation.ResultHolder<Status> paramResultHolder, long paramLong)
    throws RemoteException
  {
    zzeh localzzeh = (zzeh)getService();
    zzu localzzu = new zzu();
    localzzu.zza(new zzbc(paramResultHolder));
    localzzu.zzb(paramLong);
    localzzeh.zzo(localzzu.zzc());
  }
  
  public final void zzC(String paramString)
    throws RemoteException
  {
    zzeh localzzeh = (zzeh)getService();
    zzdo localzzdo = new zzdo();
    localzzdo.zza(paramString);
    localzzeh.zzl(localzzdo.zzb());
  }
  
  public final void zzD()
    throws RemoteException
  {
    ((zzeh)getService()).zzm(new zzhc());
  }
  
  public final void zzp(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString1, String paramString2, ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder, ConnectionOptions paramConnectionOptions)
    throws RemoteException
  {
    zzag localzzag = new zzag(paramListenerHolder);
    this.zzh.add(localzzag);
    paramListenerHolder = (zzeh)getService();
    zzgl localzzgl = new zzgl();
    localzzgl.zza(new zzbc(paramResultHolder));
    localzzgl.zzd(paramString1);
    localzzgl.zze(paramString2);
    localzzgl.zzg(localzzag);
    localzzgl.zzi(paramConnectionOptions);
    paramListenerHolder.zzh(localzzgl.zzj());
  }
  
  public final void zzq(BaseImplementation.ResultHolder<Status> paramResultHolder, byte[] paramArrayOfByte, String paramString, ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder, ConnectionOptions paramConnectionOptions)
    throws RemoteException
  {
    zzag localzzag = new zzag(paramListenerHolder);
    this.zzh.add(localzzag);
    paramListenerHolder = (zzeh)getService();
    zzgl localzzgl = new zzgl();
    localzzgl.zza(new zzbc(paramResultHolder));
    localzzgl.zzh(paramArrayOfByte);
    localzzgl.zze(paramString);
    localzzgl.zzg(localzzag);
    localzzgl.zzi(paramConnectionOptions);
    paramListenerHolder.zzh(localzzgl.zzj());
  }
  
  public final void zzr(BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> paramResultHolder, byte[] paramArrayOfByte, String paramString, ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder, AdvertisingOptions paramAdvertisingOptions)
    throws RemoteException
  {
    zzag localzzag = new zzag(paramListenerHolder);
    this.zzh.add(localzzag);
    paramListenerHolder = (zzeh)getService();
    zzgt localzzgt = new zzgt();
    localzzgt.zza(new zzbe(paramResultHolder));
    localzzgt.zzh(paramArrayOfByte);
    localzzgt.zzd(paramString);
    localzzgt.zzf(paramAdvertisingOptions);
    localzzgt.zzg(localzzag);
    paramListenerHolder.zzd(localzzgt.zzi());
  }
  
  public final void zzs(BaseImplementation.ResultHolder<Status> paramResultHolder, byte[] paramArrayOfByte, String paramString, ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder)
    throws RemoteException
  {
    zzag localzzag = new zzag(paramListenerHolder);
    this.zzh.add(localzzag);
    zzeh localzzeh = (zzeh)getService();
    paramListenerHolder = new zzgl();
    paramListenerHolder.zza(new zzbc(paramResultHolder));
    paramListenerHolder.zzh(paramArrayOfByte);
    paramListenerHolder.zze(paramString);
    paramListenerHolder.zzg(localzzag);
    localzzeh.zzh(paramListenerHolder.zzj());
  }
  
  public final void zzt(BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> paramResultHolder, String paramString1, String paramString2, ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder, AdvertisingOptions paramAdvertisingOptions)
    throws RemoteException
  {
    zzag localzzag = new zzag(paramListenerHolder);
    this.zzh.add(localzzag);
    paramListenerHolder = (zzeh)getService();
    zzgt localzzgt = new zzgt();
    localzzgt.zza(new zzbe(paramResultHolder));
    localzzgt.zzc(paramString1);
    localzzgt.zzd(paramString2);
    localzzgt.zzf(paramAdvertisingOptions);
    localzzgt.zzg(localzzag);
    paramListenerHolder.zzd(localzzgt.zzi());
  }
  
  public final void zzu()
    throws RemoteException
  {
    ((zzeh)getService()).zze(new zzha());
  }
  
  public final void zzv(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString, ListenerHolder<EndpointDiscoveryCallback> paramListenerHolder, DiscoveryOptions paramDiscoveryOptions)
    throws RemoteException
  {
    paramListenerHolder = new zzap(paramListenerHolder);
    this.zzf.add(paramListenerHolder);
    zzeh localzzeh = (zzeh)getService();
    zzgx localzzgx = new zzgx();
    localzzgx.zza(new zzbc(paramResultHolder));
    localzzgx.zzb(paramString);
    localzzgx.zzd(paramDiscoveryOptions);
    localzzgx.zze(paramListenerHolder);
    localzzeh.zzf(localzzgx.zzf());
  }
  
  public final void zzw()
    throws RemoteException
  {
    ((zzeh)getService()).zzg(new zzhe());
  }
  
  public final void zzx(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString1, String paramString2, ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder)
    throws RemoteException
  {
    zzag localzzag = new zzag(paramListenerHolder);
    this.zzh.add(localzzag);
    zzeh localzzeh = (zzeh)getService();
    paramListenerHolder = new zzgl();
    paramListenerHolder.zza(new zzbc(paramResultHolder));
    paramListenerHolder.zzd(paramString1);
    paramListenerHolder.zze(paramString2);
    paramListenerHolder.zzg(localzzag);
    localzzeh.zzh(paramListenerHolder.zzj());
  }
  
  public final void zzy(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString, ListenerHolder<PayloadCallback> paramListenerHolder)
    throws RemoteException
  {
    zzbb localzzbb = new zzbb(getContext(), paramListenerHolder, this.zzi);
    this.zzg.add(localzzbb);
    zzeh localzzeh = (zzeh)getService();
    paramListenerHolder = new zzq();
    paramListenerHolder.zza(new zzbc(paramResultHolder));
    paramListenerHolder.zzc(paramString);
    paramListenerHolder.zze(localzzbb);
    localzzeh.zzi(paramListenerHolder.zzf());
  }
  
  public final void zzz(BaseImplementation.ResultHolder<Status> paramResultHolder, String paramString)
    throws RemoteException
  {
    zzeh localzzeh = (zzeh)getService();
    zzgh localzzgh = new zzgh();
    localzzgh.zza(new zzbc(paramResultHolder));
    localzzgh.zzb(paramString);
    localzzeh.zzj(localzzgh.zzc());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */