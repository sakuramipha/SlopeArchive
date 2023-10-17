package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.tasks.Task;

public abstract interface PlayersClient
{
  public static final String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";
  
  public abstract Task<Intent> getCompareProfileIntent(Player paramPlayer);
  
  public abstract Task<Intent> getCompareProfileIntent(String paramString);
  
  public abstract Task<Intent> getCompareProfileIntentWithAlternativeNameHints(String paramString1, String paramString2, String paramString3);
  
  public abstract Task<Player> getCurrentPlayer();
  
  public abstract Task<AnnotatedData<Player>> getCurrentPlayer(boolean paramBoolean);
  
  public abstract Task<String> getCurrentPlayerId();
  
  public abstract Task<Intent> getPlayerSearchIntent();
  
  public abstract Task<AnnotatedData<PlayerBuffer>> loadFriends(int paramInt, boolean paramBoolean);
  
  public abstract Task<AnnotatedData<PlayerBuffer>> loadMoreFriends(int paramInt);
  
  @Deprecated
  public abstract Task<AnnotatedData<PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int paramInt);
  
  public abstract Task<AnnotatedData<Player>> loadPlayer(String paramString);
  
  public abstract Task<AnnotatedData<Player>> loadPlayer(String paramString, boolean paramBoolean);
  
  @Deprecated
  public abstract Task<AnnotatedData<PlayerBuffer>> loadRecentlyPlayedWithPlayers(int paramInt, boolean paramBoolean);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayersClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */