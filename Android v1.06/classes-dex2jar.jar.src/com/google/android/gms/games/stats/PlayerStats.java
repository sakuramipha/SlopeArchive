package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface PlayerStats
  extends Freezable<PlayerStats>, Parcelable
{
  public static final float UNSET_VALUE = -1.0F;
  
  public abstract float getAverageSessionLength();
  
  @Deprecated
  public abstract float getChurnProbability();
  
  public abstract int getDaysSinceLastPlayed();
  
  @Deprecated
  public abstract float getHighSpenderProbability();
  
  public abstract int getNumberOfPurchases();
  
  public abstract int getNumberOfSessions();
  
  public abstract float getSessionPercentile();
  
  public abstract float getSpendPercentile();
  
  @Deprecated
  public abstract float getSpendProbability();
  
  @Deprecated
  public abstract float getTotalSpendNext28Days();
  
  public abstract Bundle zza();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\stats\PlayerStats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */