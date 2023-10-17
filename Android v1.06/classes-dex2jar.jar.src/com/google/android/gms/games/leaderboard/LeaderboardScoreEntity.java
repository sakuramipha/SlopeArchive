package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class LeaderboardScoreEntity
  implements LeaderboardScore
{
  private final long zza;
  private final String zzb;
  private final String zzc;
  private final long zzd;
  private final long zze;
  private final String zzf;
  private final Uri zzg;
  private final Uri zzh;
  private final PlayerEntity zzi;
  private final String zzj;
  private final String zzk;
  private final String zzl;
  
  public LeaderboardScoreEntity(LeaderboardScore paramLeaderboardScore)
  {
    this.zza = paramLeaderboardScore.getRank();
    this.zzb = ((String)Preconditions.checkNotNull(paramLeaderboardScore.getDisplayRank()));
    this.zzc = ((String)Preconditions.checkNotNull(paramLeaderboardScore.getDisplayScore()));
    this.zzd = paramLeaderboardScore.getRawScore();
    this.zze = paramLeaderboardScore.getTimestampMillis();
    this.zzf = paramLeaderboardScore.getScoreHolderDisplayName();
    this.zzg = paramLeaderboardScore.getScoreHolderIconImageUri();
    this.zzh = paramLeaderboardScore.getScoreHolderHiResImageUri();
    Object localObject = paramLeaderboardScore.getScoreHolder();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new PlayerEntity((Player)localObject);
    }
    this.zzi = ((PlayerEntity)localObject);
    this.zzj = paramLeaderboardScore.getScoreTag();
    this.zzk = paramLeaderboardScore.getScoreHolderIconImageUrl();
    this.zzl = paramLeaderboardScore.getScoreHolderHiResImageUrl();
  }
  
  static int zza(LeaderboardScore paramLeaderboardScore)
  {
    return Objects.hashCode(new Object[] { Long.valueOf(paramLeaderboardScore.getRank()), paramLeaderboardScore.getDisplayRank(), Long.valueOf(paramLeaderboardScore.getRawScore()), paramLeaderboardScore.getDisplayScore(), Long.valueOf(paramLeaderboardScore.getTimestampMillis()), paramLeaderboardScore.getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolder() });
  }
  
  static String zzb(LeaderboardScore paramLeaderboardScore)
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(paramLeaderboardScore).add("Rank", Long.valueOf(paramLeaderboardScore.getRank())).add("DisplayRank", paramLeaderboardScore.getDisplayRank()).add("Score", Long.valueOf(paramLeaderboardScore.getRawScore())).add("DisplayScore", paramLeaderboardScore.getDisplayScore()).add("Timestamp", Long.valueOf(paramLeaderboardScore.getTimestampMillis())).add("DisplayName", paramLeaderboardScore.getScoreHolderDisplayName()).add("IconImageUri", paramLeaderboardScore.getScoreHolderIconImageUri()).add("IconImageUrl", paramLeaderboardScore.getScoreHolderIconImageUrl()).add("HiResImageUri", paramLeaderboardScore.getScoreHolderHiResImageUri()).add("HiResImageUrl", paramLeaderboardScore.getScoreHolderHiResImageUrl());
    Player localPlayer;
    if (paramLeaderboardScore.getScoreHolder() == null) {
      localPlayer = null;
    } else {
      localPlayer = paramLeaderboardScore.getScoreHolder();
    }
    return localToStringHelper.add("Player", localPlayer).add("ScoreTag", paramLeaderboardScore.getScoreTag()).toString();
  }
  
  static boolean zzc(LeaderboardScore paramLeaderboardScore, Object paramObject)
  {
    if (!(paramObject instanceof LeaderboardScore)) {
      return false;
    }
    if (paramLeaderboardScore == paramObject) {
      return true;
    }
    paramObject = (LeaderboardScore)paramObject;
    return (Objects.equal(Long.valueOf(((LeaderboardScore)paramObject).getRank()), Long.valueOf(paramLeaderboardScore.getRank()))) && (Objects.equal(((LeaderboardScore)paramObject).getDisplayRank(), paramLeaderboardScore.getDisplayRank())) && (Objects.equal(Long.valueOf(((LeaderboardScore)paramObject).getRawScore()), Long.valueOf(paramLeaderboardScore.getRawScore()))) && (Objects.equal(((LeaderboardScore)paramObject).getDisplayScore(), paramLeaderboardScore.getDisplayScore())) && (Objects.equal(Long.valueOf(((LeaderboardScore)paramObject).getTimestampMillis()), Long.valueOf(paramLeaderboardScore.getTimestampMillis()))) && (Objects.equal(((LeaderboardScore)paramObject).getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderDisplayName())) && (Objects.equal(((LeaderboardScore)paramObject).getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderIconImageUri())) && (Objects.equal(((LeaderboardScore)paramObject).getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri())) && (Objects.equal(((LeaderboardScore)paramObject).getScoreHolder(), paramLeaderboardScore.getScoreHolder())) && (Objects.equal(((LeaderboardScore)paramObject).getScoreTag(), paramLeaderboardScore.getScoreTag()));
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzc(this, paramObject);
  }
  
  public final String getDisplayRank()
  {
    return this.zzb;
  }
  
  public final void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzb, paramCharArrayBuffer);
  }
  
  public final String getDisplayScore()
  {
    return this.zzc;
  }
  
  public final void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzc, paramCharArrayBuffer);
  }
  
  public final long getRank()
  {
    return this.zza;
  }
  
  public final long getRawScore()
  {
    return this.zzd;
  }
  
  public final Player getScoreHolder()
  {
    return this.zzi;
  }
  
  public final String getScoreHolderDisplayName()
  {
    PlayerEntity localPlayerEntity = this.zzi;
    if (localPlayerEntity == null) {
      return this.zzf;
    }
    return localPlayerEntity.getDisplayName();
  }
  
  public final void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    PlayerEntity localPlayerEntity = this.zzi;
    if (localPlayerEntity == null)
    {
      DataUtils.copyStringToBuffer(this.zzf, paramCharArrayBuffer);
      return;
    }
    localPlayerEntity.getDisplayName(paramCharArrayBuffer);
  }
  
  public final Uri getScoreHolderHiResImageUri()
  {
    PlayerEntity localPlayerEntity = this.zzi;
    if (localPlayerEntity == null) {
      return this.zzh;
    }
    return localPlayerEntity.getHiResImageUri();
  }
  
  public String getScoreHolderHiResImageUrl()
  {
    PlayerEntity localPlayerEntity = this.zzi;
    if (localPlayerEntity == null) {
      return this.zzl;
    }
    return localPlayerEntity.getHiResImageUrl();
  }
  
  public final Uri getScoreHolderIconImageUri()
  {
    PlayerEntity localPlayerEntity = this.zzi;
    if (localPlayerEntity == null) {
      return this.zzg;
    }
    return localPlayerEntity.getIconImageUri();
  }
  
  public String getScoreHolderIconImageUrl()
  {
    PlayerEntity localPlayerEntity = this.zzi;
    if (localPlayerEntity == null) {
      return this.zzk;
    }
    return localPlayerEntity.getIconImageUrl();
  }
  
  public final String getScoreTag()
  {
    return this.zzj;
  }
  
  public final long getTimestampMillis()
  {
    return this.zze;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */