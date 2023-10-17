package com.google.android.gms.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.Task;

public abstract interface GamesClient
{
  public abstract Task<Bundle> getActivationHint();
  
  public abstract Task<String> getAppId();
  
  public abstract Task<String> getCurrentAccountName();
  
  public abstract Task<Intent> getSettingsIntent();
  
  public abstract Task<Void> setGravityForPopups(int paramInt);
  
  public abstract Task<Void> setViewForPopups(View paramView);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GamesClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */