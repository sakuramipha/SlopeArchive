package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RegistrationMethods.Builder;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.common.internal.ClientSettings.Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzho;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzbg
  extends GoogleApi<MessagesOptions>
  implements MessagesClient
{
  public static final int zza = 0;
  private static final Api.ClientKey<zzai> zzb;
  private static final Api.AbstractClientBuilder<zzai, MessagesOptions> zzc;
  private static final Api<MessagesOptions> zzd;
  private final int zze;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    zzb = localClientKey;
    zzav localzzav = new zzav();
    zzc = localzzav;
    zzd = new Api("Nearby.MESSAGES_API", localzzav, localClientKey);
  }
  
  public zzbg(Activity paramActivity, MessagesOptions paramMessagesOptions)
  {
    super(paramActivity, zzd, paramMessagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    this.zze = 1;
    paramActivity.getApplication().registerActivityLifecycleCallbacks(new zzba(paramActivity, this, null));
  }
  
  public zzbg(Context paramContext, MessagesOptions paramMessagesOptions)
  {
    super(paramContext, zzd, paramMessagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    this.zze = zzai.zzp(paramContext);
  }
  
  private final <T> ListenerHolder<BaseImplementation.ResultHolder<Status>> zzh(TaskCompletionSource<T> paramTaskCompletionSource)
  {
    return registerListener(new zzay(this, paramTaskCompletionSource), Status.class.getName());
  }
  
  private final <T> Task<Void> zzi(T paramT, int paramInt)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    doUnregisterEventListener(ListenerHolders.createListenerKey(paramT, paramT.getClass().getName()), paramInt).addOnCompleteListener(new zzaz(this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private final <T> ListenerHolder<T> zzj(T paramT)
  {
    if (paramT == null) {
      return null;
    }
    return registerListener(paramT, paramT.getClass().getName());
  }
  
  private final <T> Task<Void> zzk(ListenerHolder<T> paramListenerHolder, zzbb paramzzbb1, zzbb paramzzbb2, int paramInt)
  {
    return doRegisterEventListener(RegistrationMethods.builder().withHolder(paramListenerHolder).register(new zzau(this, paramzzbb1)).unregister(new zzak(this, paramzzbb2)).setMethodKey(paramInt).build());
  }
  
  private final Task<Void> zzl(zzbb paramzzbb, int paramInt)
  {
    return doWrite(TaskApiCall.builder().setMethodKey(paramInt).run(new zzal(this, paramzzbb)).build());
  }
  
  protected final ClientSettings.Builder createClientSettingsBuilder()
  {
    ClientSettings.Builder localBuilder = super.createClientSettingsBuilder();
    if (getApiOptions() != null) {
      String str = ((MessagesOptions)getApiOptions()).zze;
    }
    return localBuilder;
  }
  
  public final void handleIntent(Intent paramIntent, MessageListener paramMessageListener)
  {
    zzho.zzc(paramIntent, paramMessageListener);
  }
  
  public final Task<Void> publish(Message paramMessage)
  {
    PublishOptions localPublishOptions = PublishOptions.DEFAULT;
    Preconditions.checkNotNull(paramMessage);
    Preconditions.checkNotNull(localPublishOptions);
    ListenerHolder localListenerHolder = zzj(paramMessage);
    return zzk(localListenerHolder, new zzaj(this, paramMessage, new zzaw(this, zzj(localPublishOptions.getCallback()), localListenerHolder), localPublishOptions), new zzam(paramMessage), 1291);
  }
  
  public final Task<Void> publish(Message paramMessage, PublishOptions paramPublishOptions)
  {
    Preconditions.checkNotNull(paramMessage);
    Preconditions.checkNotNull(paramPublishOptions);
    ListenerHolder localListenerHolder = zzj(paramMessage);
    return zzk(localListenerHolder, new zzaj(this, paramMessage, new zzaw(this, zzj(paramPublishOptions.getCallback()), localListenerHolder), paramPublishOptions), new zzam(paramMessage), 1291);
  }
  
  public final Task<Void> registerStatusCallback(StatusCallback paramStatusCallback)
  {
    Preconditions.checkNotNull(paramStatusCallback);
    paramStatusCallback = zzj(paramStatusCallback);
    return zzk(paramStatusCallback, new zzar(paramStatusCallback), new zzas(paramStatusCallback), 1270);
  }
  
  public final Task<Void> subscribe(PendingIntent paramPendingIntent)
  {
    SubscribeOptions localSubscribeOptions = SubscribeOptions.DEFAULT;
    Preconditions.checkNotNull(paramPendingIntent);
    Preconditions.checkNotNull(localSubscribeOptions);
    Object localObject = zzj(localSubscribeOptions.getCallback());
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new zzbf((ListenerHolder)localObject);
    }
    return zzl(new zzap(this, paramPendingIntent, (zzbf)localObject, localSubscribeOptions), 1288);
  }
  
  public final Task<Void> subscribe(PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    Preconditions.checkNotNull(paramPendingIntent);
    Preconditions.checkNotNull(paramSubscribeOptions);
    Object localObject = zzj(paramSubscribeOptions.getCallback());
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new zzbf((ListenerHolder)localObject);
    }
    return zzl(new zzap(this, paramPendingIntent, (zzbf)localObject, paramSubscribeOptions), 1288);
  }
  
  public final Task<Void> subscribe(MessageListener paramMessageListener)
  {
    SubscribeOptions localSubscribeOptions = SubscribeOptions.DEFAULT;
    Preconditions.checkNotNull(paramMessageListener);
    Preconditions.checkNotNull(localSubscribeOptions);
    boolean bool;
    if (localSubscribeOptions.getStrategy().zza() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
    paramMessageListener = zzj(paramMessageListener);
    ListenerHolder localListenerHolder = zzj(localSubscribeOptions.getCallback());
    return zzk(paramMessageListener, new zzan(this, paramMessageListener, new zzax(this, localListenerHolder, localListenerHolder), localSubscribeOptions), new zzao(paramMessageListener), 1289);
  }
  
  public final Task<Void> subscribe(MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions)
  {
    Preconditions.checkNotNull(paramMessageListener);
    Preconditions.checkNotNull(paramSubscribeOptions);
    boolean bool;
    if (paramSubscribeOptions.getStrategy().zza() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
    ListenerHolder localListenerHolder = zzj(paramMessageListener);
    paramMessageListener = zzj(paramSubscribeOptions.getCallback());
    return zzk(localListenerHolder, new zzan(this, localListenerHolder, new zzax(this, paramMessageListener, paramMessageListener), paramSubscribeOptions), new zzao(localListenerHolder), 1289);
  }
  
  public final Task<Void> unpublish(Message paramMessage)
  {
    Preconditions.checkNotNull(paramMessage);
    return zzi(paramMessage, 1290);
  }
  
  public final Task<Void> unregisterStatusCallback(StatusCallback paramStatusCallback)
  {
    Preconditions.checkNotNull(paramStatusCallback);
    return zzi(paramStatusCallback, 1271);
  }
  
  public final Task<Void> unsubscribe(PendingIntent paramPendingIntent)
  {
    Preconditions.checkNotNull(paramPendingIntent);
    return zzl(new zzaq(paramPendingIntent), 1287);
  }
  
  public final Task<Void> unsubscribe(MessageListener paramMessageListener)
  {
    Preconditions.checkNotNull(paramMessageListener);
    return zzi(paramMessageListener, 1286);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */