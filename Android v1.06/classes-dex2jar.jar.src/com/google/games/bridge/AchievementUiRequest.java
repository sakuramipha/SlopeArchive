package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.tasks.Task;

class AchievementUiRequest
  extends SimpleUiRequest
{
  private static final String TAG = "AchievementUiRequest";
  
  protected Task<Intent> getIntent(Activity paramActivity)
  {
    return PlayGames.getAchievementsClient(paramActivity).getAchievementsIntent();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\AchievementUiRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */