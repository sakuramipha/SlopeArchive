package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.tasks.Task;

class CompareProfileUiRequest
  extends SimpleUiRequest
{
  private static final String TAG = "CompareProfileUiRequest";
  private String currentPlayerInGameName;
  private String otherPlayerInGameName;
  private String playerId;
  
  CompareProfileUiRequest(String paramString1, String paramString2, String paramString3)
  {
    this.playerId = paramString1;
    this.otherPlayerInGameName = paramString2;
    this.currentPlayerInGameName = paramString3;
  }
  
  protected Task<Intent> getIntent(Activity paramActivity)
  {
    return PlayGames.getPlayersClient(paramActivity).getCompareProfileIntentWithAlternativeNameHints(this.playerId, this.otherPlayerInGameName, this.currentPlayerInGameName);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\CompareProfileUiRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */