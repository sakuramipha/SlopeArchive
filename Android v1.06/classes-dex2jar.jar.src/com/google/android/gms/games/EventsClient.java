package com.google.android.gms.games;

import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.Task;

public abstract interface EventsClient
{
  public abstract void increment(String paramString, int paramInt);
  
  public abstract Task<AnnotatedData<EventBuffer>> load(boolean paramBoolean);
  
  public abstract Task<AnnotatedData<EventBuffer>> loadByIds(boolean paramBoolean, String... paramVarArgs);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\EventsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */