package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzho;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;

public final class zzbw
  implements Messages
{
  public static final zzbw zza = new zzbw();
  public static final Api.ClientKey<zzai> zzb = new Api.ClientKey();
  public static final Api.AbstractClientBuilder<zzai, MessagesOptions> zzc = new zzbi();
  
  public final PendingResult<Status> getPermissionStatus(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.execute(new zzbp(this, paramGoogleApiClient));
  }
  
  public final void handleIntent(Intent paramIntent, MessageListener paramMessageListener)
  {
    zzho.zzc(paramIntent, paramMessageListener);
  }
  
  public final PendingResult<Status> publish(GoogleApiClient paramGoogleApiClient, Message paramMessage)
  {
    PublishOptions localPublishOptions = PublishOptions.DEFAULT;
    Preconditions.checkNotNull(paramMessage);
    Preconditions.checkNotNull(localPublishOptions);
    Object localObject1 = localPublishOptions.getCallback();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = paramGoogleApiClient.registerListener(localPublishOptions.getCallback());
    }
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = new zzbs((ListenerHolder)localObject1);
    }
    return paramGoogleApiClient.execute(new zzbj(this, paramGoogleApiClient, paramMessage, (zzbs)localObject1, localPublishOptions));
  }
  
  public final PendingResult<Status> publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, PublishOptions paramPublishOptions)
  {
    Preconditions.checkNotNull(paramMessage);
    Preconditions.checkNotNull(paramPublishOptions);
    Object localObject1 = paramPublishOptions.getCallback();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = paramGoogleApiClient.registerListener(paramPublishOptions.getCallback());
    }
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = new zzbs((ListenerHolder)localObject1);
    }
    return paramGoogleApiClient.execute(new zzbj(this, paramGoogleApiClient, paramMessage, (zzbs)localObject1, paramPublishOptions));
  }
  
  public final PendingResult<Status> registerStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    Preconditions.checkNotNull(paramStatusCallback);
    return paramGoogleApiClient.execute(new zzbq(this, paramGoogleApiClient, paramGoogleApiClient.registerListener(paramStatusCallback)));
  }
  
  public final PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    SubscribeOptions localSubscribeOptions = SubscribeOptions.DEFAULT;
    Preconditions.checkNotNull(paramPendingIntent);
    Preconditions.checkNotNull(localSubscribeOptions);
    Object localObject1 = localSubscribeOptions.getCallback();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = paramGoogleApiClient.registerListener(localSubscribeOptions.getCallback());
    }
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = new zzbv((ListenerHolder)localObject1);
    }
    return paramGoogleApiClient.execute(new zzbm(this, paramGoogleApiClient, paramPendingIntent, (zzbv)localObject1, localSubscribeOptions));
  }
  
  public final PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    Preconditions.checkNotNull(paramPendingIntent);
    Preconditions.checkNotNull(paramSubscribeOptions);
    Object localObject1 = paramSubscribeOptions.getCallback();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = paramGoogleApiClient.registerListener(paramSubscribeOptions.getCallback());
    }
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = new zzbv((ListenerHolder)localObject1);
    }
    return paramGoogleApiClient.execute(new zzbm(this, paramGoogleApiClient, paramPendingIntent, (zzbv)localObject1, paramSubscribeOptions));
  }
  
  public final PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
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
    ListenerHolder localListenerHolder = paramGoogleApiClient.registerListener(paramMessageListener);
    paramMessageListener = localSubscribeOptions.getCallback();
    Object localObject = null;
    if (paramMessageListener == null) {
      paramMessageListener = null;
    } else {
      paramMessageListener = paramGoogleApiClient.registerListener(localSubscribeOptions.getCallback());
    }
    if (paramMessageListener == null) {
      paramMessageListener = (MessageListener)localObject;
    } else {
      paramMessageListener = new zzbv(paramMessageListener);
    }
    return paramGoogleApiClient.execute(new zzbl(this, paramGoogleApiClient, localListenerHolder, paramMessageListener, localSubscribeOptions));
  }
  
  public final PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions)
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
    ListenerHolder localListenerHolder = paramGoogleApiClient.registerListener(paramMessageListener);
    paramMessageListener = paramSubscribeOptions.getCallback();
    Object localObject = null;
    if (paramMessageListener == null) {
      paramMessageListener = null;
    } else {
      paramMessageListener = paramGoogleApiClient.registerListener(paramSubscribeOptions.getCallback());
    }
    if (paramMessageListener == null) {
      paramMessageListener = (MessageListener)localObject;
    } else {
      paramMessageListener = new zzbv(paramMessageListener);
    }
    return paramGoogleApiClient.execute(new zzbl(this, paramGoogleApiClient, localListenerHolder, paramMessageListener, paramSubscribeOptions));
  }
  
  public final PendingResult<Status> unpublish(GoogleApiClient paramGoogleApiClient, Message paramMessage)
  {
    Preconditions.checkNotNull(paramMessage);
    return paramGoogleApiClient.execute(new zzbk(this, paramGoogleApiClient, paramMessage));
  }
  
  public final PendingResult<Status> unregisterStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    Preconditions.checkNotNull(paramStatusCallback);
    return paramGoogleApiClient.execute(new zzbh(this, paramGoogleApiClient, paramGoogleApiClient.registerListener(paramStatusCallback)));
  }
  
  public final PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    Preconditions.checkNotNull(paramPendingIntent);
    return paramGoogleApiClient.execute(new zzbo(this, paramGoogleApiClient, paramPendingIntent));
  }
  
  public final PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    Preconditions.checkNotNull(paramMessageListener);
    return paramGoogleApiClient.execute(new zzbn(this, paramGoogleApiClient, paramGoogleApiClient.registerListener(paramMessageListener)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */