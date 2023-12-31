package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
public abstract interface Messages
{
  @Deprecated
  public abstract PendingResult<Status> getPermissionStatus(GoogleApiClient paramGoogleApiClient);
  
  public abstract void handleIntent(Intent paramIntent, MessageListener paramMessageListener);
  
  public abstract PendingResult<Status> publish(GoogleApiClient paramGoogleApiClient, Message paramMessage);
  
  public abstract PendingResult<Status> publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, PublishOptions paramPublishOptions);
  
  public abstract PendingResult<Status> registerStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback);
  
  public abstract PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions);
  
  public abstract PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener);
  
  public abstract PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions);
  
  public abstract PendingResult<Status> unpublish(GoogleApiClient paramGoogleApiClient, Message paramMessage);
  
  public abstract PendingResult<Status> unregisterStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback);
  
  public abstract PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\Messages.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */