package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zzho;
import com.google.android.gms.internal.nearby.zzhq;
import com.google.android.gms.internal.nearby.zzht;
import com.google.android.gms.internal.nearby.zzhu;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;

public final class zzai
  extends GmsClient<zzs>
{
  private final zzhu<ListenerHolder.ListenerKey, IBinder> zze = new zzhu();
  private final ClientAppContext zzf;
  private final int zzg;
  
  zzai(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, ClientSettings paramClientSettings, MessagesOptions paramMessagesOptions)
  {
    super(paramContext, paramLooper, 62, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    paramLooper = paramClientSettings.getRealClientPackageName();
    int i = zzp(paramContext);
    if (paramMessagesOptions != null)
    {
      this.zzf = new ClientAppContext(1, paramLooper, null, false, i, null);
      this.zzg = paramMessagesOptions.zzc;
    }
    else
    {
      this.zzf = new ClientAppContext(1, paramLooper, null, false, i, null);
      this.zzg = -1;
    }
    if ((i == 1) && (PlatformVersion.isAtLeastIceCreamSandwich()))
    {
      paramContext = (Activity)paramContext;
      if (Log.isLoggable("NearbyMessagesClient", 2)) {
        Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[] { paramContext.getPackageName() }));
      }
      paramContext.getApplication().registerActivityLifecycleCallbacks(new zzah(paramContext, this, null));
    }
  }
  
  static int zzp(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      return 1;
    }
    if ((paramContext instanceof Application)) {
      return 2;
    }
    if ((paramContext instanceof Service)) {
      return 3;
    }
    return 0;
  }
  
  public final void disconnect()
  {
    try
    {
      zzB(2);
    }
    catch (RemoteException localRemoteException)
    {
      if (Log.isLoggable("NearbyMessagesClient", 2)) {
        Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[] { localRemoteException }));
      }
    }
    this.zze.zze();
    super.disconnect();
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    Bundle localBundle = super.getGetServiceRequestExtraArgs();
    localBundle.putInt("NearbyPermissions", this.zzg);
    localBundle.putParcelable("ClientAppContext", this.zzf);
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
  }
  
  public final boolean requiresGooglePlayServices()
  {
    return Nearby.zza(getContext());
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
  
  final void zzA(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, ListenerHolder<StatusCallback> paramListenerHolder1)
    throws RemoteException
  {
    paramListenerHolder1 = paramListenerHolder1.getListenerKey();
    if (paramListenerHolder1 == null) {
      return;
    }
    paramListenerHolder = new zzhq(paramListenerHolder);
    if (!this.zze.zza(paramListenerHolder1))
    {
      paramListenerHolder.zzd(new Status(0));
      return;
    }
    paramListenerHolder = new zzca(paramListenerHolder, (IBinder)this.zze.zzc(paramListenerHolder1));
    paramListenerHolder.zzd = false;
    ((zzs)getService()).zzi(paramListenerHolder);
    this.zze.zzd(paramListenerHolder1);
  }
  
  final void zzB(int paramInt)
    throws RemoteException
  {
    String str;
    if (paramInt != 1) {
      str = "CLIENT_DISCONNECTED";
    } else {
      str = "ACTIVITY_STOPPED";
    }
    if (isConnected())
    {
      zzj localzzj = new zzj(1, null, paramInt);
      if (Log.isLoggable("NearbyMessagesClient", 3)) {
        Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", new Object[] { str }));
      }
      ((zzs)getService()).zzj(localzzj);
      return;
    }
    if (Log.isLoggable("NearbyMessagesClient", 3)) {
      Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[] { str }));
    }
  }
  
  final void zzq(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, zzae paramzzae, zzu paramzzu, PublishOptions paramPublishOptions, int paramInt)
    throws RemoteException
  {
    paramListenerHolder = new zzby(2, paramzzae, paramPublishOptions.getStrategy(), new zzhq(paramListenerHolder), null, null, false, paramzzu, false, null, paramInt);
    ((zzs)getService()).zzd(paramListenerHolder);
  }
  
  @Deprecated
  final void zzr(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, zzae paramzzae, zzu paramzzu, PublishOptions paramPublishOptions)
    throws RemoteException
  {
    zzq(paramListenerHolder, paramzzae, paramzzu, paramPublishOptions, this.zzf.zze);
  }
  
  final void zzs(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, zzae paramzzae)
    throws RemoteException
  {
    paramListenerHolder = new zzcd(1, paramzzae, new zzhq(paramListenerHolder), null, null, false, null);
    ((zzs)getService()).zze(paramListenerHolder);
  }
  
  final void zzt(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, ListenerHolder<MessageListener> paramListenerHolder1, zzaa paramzzaa, SubscribeOptions paramSubscribeOptions, byte[] paramArrayOfByte, int paramInt)
    throws RemoteException
  {
    paramArrayOfByte = paramListenerHolder1.getListenerKey();
    if (paramArrayOfByte == null) {
      return;
    }
    if (!this.zze.zza(paramArrayOfByte)) {
      this.zze.zzb(paramArrayOfByte, new zzho(paramListenerHolder1));
    }
    paramArrayOfByte = (IBinder)this.zze.zzc(paramArrayOfByte);
    paramListenerHolder1 = paramSubscribeOptions.getStrategy();
    paramListenerHolder = new zzhq(paramListenerHolder);
    MessageFilter localMessageFilter = paramSubscribeOptions.getFilter();
    boolean bool = paramSubscribeOptions.zza;
    paramListenerHolder = new SubscribeRequest(paramArrayOfByte, paramListenerHolder1, paramListenerHolder, localMessageFilter, null, null, paramzzaa, false, 0, paramInt);
    ((zzs)getService()).zzf(paramListenerHolder);
  }
  
  @Deprecated
  final void zzu(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, ListenerHolder<MessageListener> paramListenerHolder1, zzaa paramzzaa, SubscribeOptions paramSubscribeOptions, byte[] paramArrayOfByte)
    throws RemoteException
  {
    zzt(paramListenerHolder, paramListenerHolder1, paramzzaa, paramSubscribeOptions, null, this.zzf.zze);
  }
  
  final void zzv(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, PendingIntent paramPendingIntent, zzaa paramzzaa, SubscribeOptions paramSubscribeOptions, int paramInt)
    throws RemoteException
  {
    Strategy localStrategy = paramSubscribeOptions.getStrategy();
    zzhq localzzhq = new zzhq(paramListenerHolder);
    paramListenerHolder = paramSubscribeOptions.getFilter();
    boolean bool = paramSubscribeOptions.zza;
    paramInt = paramSubscribeOptions.zzb;
    paramListenerHolder = new SubscribeRequest(null, localStrategy, localzzhq, paramListenerHolder, paramPendingIntent, null, paramzzaa, false, 0, this.zzf.zze);
    ((zzs)getService()).zzf(paramListenerHolder);
  }
  
  @Deprecated
  final void zzw(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, PendingIntent paramPendingIntent, zzaa paramzzaa, SubscribeOptions paramSubscribeOptions)
    throws RemoteException
  {
    zzv(paramListenerHolder, paramPendingIntent, paramzzaa, paramSubscribeOptions, this.zzf.zze);
  }
  
  final void zzx(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, ListenerHolder<MessageListener> paramListenerHolder1)
    throws RemoteException
  {
    paramListenerHolder1 = paramListenerHolder1.getListenerKey();
    if (paramListenerHolder1 == null) {
      return;
    }
    paramListenerHolder = new zzhq(paramListenerHolder);
    if (!this.zze.zza(paramListenerHolder1))
    {
      paramListenerHolder.zzd(new Status(0));
      return;
    }
    paramListenerHolder = new zzcf((IBinder)this.zze.zzc(paramListenerHolder1), paramListenerHolder, null);
    ((zzs)getService()).zzg(paramListenerHolder);
    this.zze.zzd(paramListenerHolder1);
  }
  
  final void zzy(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, PendingIntent paramPendingIntent)
    throws RemoteException
  {
    paramListenerHolder = new zzcf(null, new zzhq(paramListenerHolder), paramPendingIntent);
    ((zzs)getService()).zzg(paramListenerHolder);
  }
  
  final void zzz(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder, ListenerHolder<StatusCallback> paramListenerHolder1)
    throws RemoteException
  {
    ListenerHolder.ListenerKey localListenerKey = paramListenerHolder1.getListenerKey();
    if (localListenerKey == null) {
      return;
    }
    if (!this.zze.zza(localListenerKey)) {
      this.zze.zzb(localListenerKey, new zzht(paramListenerHolder1));
    }
    paramListenerHolder = new zzca(new zzhq(paramListenerHolder), (IBinder)this.zze.zzc(localListenerKey));
    paramListenerHolder.zzd = true;
    ((zzs)getService()).zzi(paramListenerHolder);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */