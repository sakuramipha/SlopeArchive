package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.Freezable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface LeaderboardVariant
  extends Freezable<LeaderboardVariant>
{
  public static final int COLLECTION_FRIENDS = 3;
  public static final int COLLECTION_PUBLIC = 0;
  public static final int NUM_SCORES_UNKNOWN = -1;
  public static final int NUM_TIME_SPANS = 3;
  public static final int PLAYER_RANK_UNKNOWN = -1;
  public static final int PLAYER_SCORE_UNKNOWN = -1;
  public static final int TIME_SPAN_ALL_TIME = 2;
  public static final int TIME_SPAN_DAILY = 0;
  public static final int TIME_SPAN_WEEKLY = 1;
  
  public abstract int getCollection();
  
  public abstract String getDisplayPlayerRank();
  
  public abstract String getDisplayPlayerScore();
  
  public abstract long getNumScores();
  
  public abstract long getPlayerRank();
  
  public abstract String getPlayerScoreTag();
  
  public abstract long getRawPlayerScore();
  
  public abstract int getTimeSpan();
  
  public abstract boolean hasPlayerInfo();
  
  public abstract String zza();
  
  public abstract String zzb();
  
  public abstract String zzc();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Collection {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface TimeSpan {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardVariant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */