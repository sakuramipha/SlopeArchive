package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.internal.games_v2.zzah;

public final class LeaderboardVariantEntity
  implements LeaderboardVariant
{
  private final int zza;
  private final int zzb;
  private final boolean zzc;
  private final long zzd;
  private final String zze;
  private final long zzf;
  private final String zzg;
  private final String zzh;
  private final long zzi;
  private final String zzj;
  private final String zzk;
  private final String zzl;
  
  public LeaderboardVariantEntity(LeaderboardVariant paramLeaderboardVariant)
  {
    this.zza = paramLeaderboardVariant.getTimeSpan();
    this.zzb = paramLeaderboardVariant.getCollection();
    this.zzc = paramLeaderboardVariant.hasPlayerInfo();
    this.zzd = paramLeaderboardVariant.getRawPlayerScore();
    this.zze = paramLeaderboardVariant.getDisplayPlayerScore();
    this.zzf = paramLeaderboardVariant.getPlayerRank();
    this.zzg = paramLeaderboardVariant.getDisplayPlayerRank();
    this.zzh = paramLeaderboardVariant.getPlayerScoreTag();
    this.zzi = paramLeaderboardVariant.getNumScores();
    this.zzj = paramLeaderboardVariant.zza();
    this.zzk = paramLeaderboardVariant.zzc();
    this.zzl = paramLeaderboardVariant.zzb();
  }
  
  static int zzd(LeaderboardVariant paramLeaderboardVariant)
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(paramLeaderboardVariant.getTimeSpan()), Integer.valueOf(paramLeaderboardVariant.getCollection()), Boolean.valueOf(paramLeaderboardVariant.hasPlayerInfo()), Long.valueOf(paramLeaderboardVariant.getRawPlayerScore()), paramLeaderboardVariant.getDisplayPlayerScore(), Long.valueOf(paramLeaderboardVariant.getPlayerRank()), paramLeaderboardVariant.getDisplayPlayerRank(), Long.valueOf(paramLeaderboardVariant.getNumScores()), paramLeaderboardVariant.zza(), paramLeaderboardVariant.zzb(), paramLeaderboardVariant.zzc() });
  }
  
  static String zze(LeaderboardVariant paramLeaderboardVariant)
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(paramLeaderboardVariant).add("TimeSpan", zzah.zza(paramLeaderboardVariant.getTimeSpan()));
    int i = paramLeaderboardVariant.getCollection();
    String str = "SOCIAL_1P";
    if (i != -1)
    {
      if (i != 0)
      {
        if (i != 1)
        {
          localObject = str;
          if (i != 2) {
            if (i != 3)
            {
              if (i == 4)
              {
                localObject = str;
              }
              else
              {
                paramLeaderboardVariant = new StringBuilder(43);
                paramLeaderboardVariant.append("Unknown leaderboard collection: ");
                paramLeaderboardVariant.append(i);
                throw new IllegalArgumentException(paramLeaderboardVariant.toString());
              }
            }
            else {
              localObject = "FRIENDS";
            }
          }
        }
        else
        {
          localObject = "SOCIAL";
        }
      }
      else {
        localObject = "PUBLIC";
      }
    }
    else {
      localObject = "UNKNOWN";
    }
    localToStringHelper = localToStringHelper.add("Collection", localObject);
    boolean bool = paramLeaderboardVariant.hasPlayerInfo();
    str = "none";
    if (bool) {
      localObject = Long.valueOf(paramLeaderboardVariant.getRawPlayerScore());
    } else {
      localObject = "none";
    }
    localToStringHelper = localToStringHelper.add("RawPlayerScore", localObject);
    if (paramLeaderboardVariant.hasPlayerInfo()) {
      localObject = paramLeaderboardVariant.getDisplayPlayerScore();
    } else {
      localObject = "none";
    }
    localToStringHelper = localToStringHelper.add("DisplayPlayerScore", localObject);
    if (paramLeaderboardVariant.hasPlayerInfo()) {
      localObject = Long.valueOf(paramLeaderboardVariant.getPlayerRank());
    } else {
      localObject = "none";
    }
    localToStringHelper = localToStringHelper.add("PlayerRank", localObject);
    Object localObject = str;
    if (paramLeaderboardVariant.hasPlayerInfo()) {
      localObject = paramLeaderboardVariant.getDisplayPlayerRank();
    }
    return localToStringHelper.add("DisplayPlayerRank", localObject).add("NumScores", Long.valueOf(paramLeaderboardVariant.getNumScores())).add("TopPageNextToken", paramLeaderboardVariant.zza()).add("WindowPageNextToken", paramLeaderboardVariant.zzb()).add("WindowPagePrevToken", paramLeaderboardVariant.zzc()).toString();
  }
  
  static boolean zzf(LeaderboardVariant paramLeaderboardVariant, Object paramObject)
  {
    if (!(paramObject instanceof LeaderboardVariant)) {
      return false;
    }
    if (paramLeaderboardVariant == paramObject) {
      return true;
    }
    paramObject = (LeaderboardVariant)paramObject;
    return (Objects.equal(Integer.valueOf(((LeaderboardVariant)paramObject).getTimeSpan()), Integer.valueOf(paramLeaderboardVariant.getTimeSpan()))) && (Objects.equal(Integer.valueOf(((LeaderboardVariant)paramObject).getCollection()), Integer.valueOf(paramLeaderboardVariant.getCollection()))) && (Objects.equal(Boolean.valueOf(((LeaderboardVariant)paramObject).hasPlayerInfo()), Boolean.valueOf(paramLeaderboardVariant.hasPlayerInfo()))) && (Objects.equal(Long.valueOf(((LeaderboardVariant)paramObject).getRawPlayerScore()), Long.valueOf(paramLeaderboardVariant.getRawPlayerScore()))) && (Objects.equal(((LeaderboardVariant)paramObject).getDisplayPlayerScore(), paramLeaderboardVariant.getDisplayPlayerScore())) && (Objects.equal(Long.valueOf(((LeaderboardVariant)paramObject).getPlayerRank()), Long.valueOf(paramLeaderboardVariant.getPlayerRank()))) && (Objects.equal(((LeaderboardVariant)paramObject).getDisplayPlayerRank(), paramLeaderboardVariant.getDisplayPlayerRank())) && (Objects.equal(Long.valueOf(((LeaderboardVariant)paramObject).getNumScores()), Long.valueOf(paramLeaderboardVariant.getNumScores()))) && (Objects.equal(((LeaderboardVariant)paramObject).zza(), paramLeaderboardVariant.zza())) && (Objects.equal(((LeaderboardVariant)paramObject).zzb(), paramLeaderboardVariant.zzb())) && (Objects.equal(((LeaderboardVariant)paramObject).zzc(), paramLeaderboardVariant.zzc()));
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzf(this, paramObject);
  }
  
  public final int getCollection()
  {
    return this.zzb;
  }
  
  public final String getDisplayPlayerRank()
  {
    return this.zzg;
  }
  
  public final String getDisplayPlayerScore()
  {
    return this.zze;
  }
  
  public final long getNumScores()
  {
    return this.zzi;
  }
  
  public final long getPlayerRank()
  {
    return this.zzf;
  }
  
  public final String getPlayerScoreTag()
  {
    return this.zzh;
  }
  
  public final long getRawPlayerScore()
  {
    return this.zzd;
  }
  
  public final int getTimeSpan()
  {
    return this.zza;
  }
  
  public final boolean hasPlayerInfo()
  {
    return this.zzc;
  }
  
  public final int hashCode()
  {
    return zzd(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zze(this);
  }
  
  public final String zza()
  {
    return this.zzj;
  }
  
  public final String zzb()
  {
    return this.zzl;
  }
  
  public final String zzc()
  {
    return this.zzk;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardVariantEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */