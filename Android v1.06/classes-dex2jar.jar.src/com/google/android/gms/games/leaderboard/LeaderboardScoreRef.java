package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class LeaderboardScoreRef
  extends DataBufferRef
  implements LeaderboardScore
{
  private final PlayerRef zza;
  
  public LeaderboardScoreRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    this.zza = new PlayerRef(paramDataHolder, paramInt, null);
  }
  
  public final boolean equals(Object paramObject)
  {
    return LeaderboardScoreEntity.zzc(this, paramObject);
  }
  
  public final String getDisplayRank()
  {
    return getString("display_rank");
  }
  
  public final void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("display_rank", paramCharArrayBuffer);
  }
  
  public final String getDisplayScore()
  {
    return getString("display_score");
  }
  
  public final void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("display_score", paramCharArrayBuffer);
  }
  
  public final long getRank()
  {
    return getLong("rank");
  }
  
  public final long getRawScore()
  {
    return getLong("raw_score");
  }
  
  public final Player getScoreHolder()
  {
    if (hasNull("external_player_id")) {
      return null;
    }
    return this.zza;
  }
  
  public final String getScoreHolderDisplayName()
  {
    if (hasNull("external_player_id")) {
      return getString("default_display_name");
    }
    return this.zza.getDisplayName();
  }
  
  public final void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (hasNull("external_player_id"))
    {
      copyToBuffer("default_display_name", paramCharArrayBuffer);
      return;
    }
    this.zza.getDisplayName(paramCharArrayBuffer);
  }
  
  public final Uri getScoreHolderHiResImageUri()
  {
    if (hasNull("external_player_id")) {
      return null;
    }
    return this.zza.getHiResImageUri();
  }
  
  public String getScoreHolderHiResImageUrl()
  {
    if (hasNull("external_player_id")) {
      return null;
    }
    return this.zza.getHiResImageUrl();
  }
  
  public final Uri getScoreHolderIconImageUri()
  {
    if (hasNull("external_player_id")) {
      return parseUri("default_display_image_uri");
    }
    return this.zza.getIconImageUri();
  }
  
  public String getScoreHolderIconImageUrl()
  {
    if (hasNull("external_player_id")) {
      return getString("default_display_image_url");
    }
    return this.zza.getIconImageUrl();
  }
  
  public final String getScoreTag()
  {
    return getString("score_tag");
  }
  
  public final long getTimestampMillis()
  {
    return getLong("achieved_timestamp");
  }
  
  public final int hashCode()
  {
    return LeaderboardScoreEntity.zza(this);
  }
  
  public final String toString()
  {
    return LeaderboardScoreEntity.zzb(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */