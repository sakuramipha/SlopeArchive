package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public abstract interface MessagesClient
  extends HasApiKey<MessagesOptions>
{
  public abstract void handleIntent(Intent paramIntent, MessageListener paramMessageListener);
  
  public abstract Task<Void> publish(Message paramMessage);
  
  public abstract Task<Void> publish(Message paramMessage, PublishOptions paramPublishOptions);
  
  public abstract Task<Void> registerStatusCallback(StatusCallback paramStatusCallback);
  
  public abstract Task<Void> subscribe(PendingIntent paramPendingIntent);
  
  public abstract Task<Void> subscribe(PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions);
  
  public abstract Task<Void> subscribe(MessageListener paramMessageListener);
  
  public abstract Task<Void> subscribe(MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions);
  
  public abstract Task<Void> unpublish(Message paramMessage);
  
  public abstract Task<Void> unregisterStatusCallback(StatusCallback paramStatusCallback);
  
  public abstract Task<Void> unsubscribe(PendingIntent paramPendingIntent);
  
  public abstract Task<Void> unsubscribe(MessageListener paramMessageListener);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\MessagesClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */