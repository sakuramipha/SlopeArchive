package com.google.android.gms.games;

import com.google.android.gms.tasks.Task;

public abstract interface GamesMetadataClient
{
  public abstract Task<Game> getCurrentGame();
  
  public abstract Task<AnnotatedData<Game>> loadGame();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GamesMetadataClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */