package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.Task;

public abstract interface AchievementsClient
{
  public abstract Task<Intent> getAchievementsIntent();
  
  public abstract void increment(String paramString, int paramInt);
  
  public abstract Task<Boolean> incrementImmediate(String paramString, int paramInt);
  
  public abstract Task<AnnotatedData<AchievementBuffer>> load(boolean paramBoolean);
  
  public abstract void reveal(String paramString);
  
  public abstract Task<Void> revealImmediate(String paramString);
  
  public abstract void setSteps(String paramString, int paramInt);
  
  public abstract Task<Boolean> setStepsImmediate(String paramString, int paramInt);
  
  public abstract void unlock(String paramString);
  
  public abstract Task<Void> unlockImmediate(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\AchievementsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */