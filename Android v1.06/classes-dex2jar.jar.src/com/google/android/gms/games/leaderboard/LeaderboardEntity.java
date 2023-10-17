package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public final class LeaderboardEntity
  implements Leaderboard
{
  private final String zza;
  private final String zzb;
  private final Uri zzc;
  private final int zzd;
  private final ArrayList zze;
  private final Game zzf;
  private final String zzg;
  
  public LeaderboardEntity(Leaderboard paramLeaderboard)
  {
    this.zza = paramLeaderboard.getLeaderboardId();
    this.zzb = paramLeaderboard.getDisplayName();
    this.zzc = paramLeaderboard.getIconImageUri();
    this.zzg = paramLeaderboard.getIconImageUrl();
    this.zzd = paramLeaderboard.getScoreOrder();
    Object localObject = paramLeaderboard.zza();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new GameEntity((Game)localObject);
    }
    this.zzf = ((Game)localObject);
    paramLeaderboard = paramLeaderboard.getVariants();
    int j = paramLeaderboard.size();
    this.zze = new ArrayList(j);
    for (int i = 0; i < j; i++) {
      this.zze.add(((LeaderboardVariant)paramLeaderboard.get(i)).freeze());
    }
  }
  
  static int zzb(Leaderboard paramLeaderboard)
  {
    return Objects.hashCode(new Object[] { paramLeaderboard.getLeaderboardId(), paramLeaderboard.getDisplayName(), paramLeaderboard.getIconImageUri(), Integer.valueOf(paramLeaderboard.getScoreOrder()), paramLeaderboard.getVariants() });
  }
  
  static String zzc(Leaderboard paramLeaderboard)
  {
    return Objects.toStringHelper(paramLeaderboard).add("LeaderboardId", paramLeaderboard.getLeaderboardId()).add("DisplayName", paramLeaderboard.getDisplayName()).add("IconImageUri", paramLeaderboard.getIconImageUri()).add("IconImageUrl", paramLeaderboard.getIconImageUrl()).add("ScoreOrder", Integer.valueOf(paramLeaderboard.getScoreOrder())).add("Variants", paramLeaderboard.getVariants()).toString();
  }
  
  static boolean zzd(Leaderboard paramLeaderboard, Object paramObject)
  {
    if (!(paramObject instanceof Leaderboard)) {
      return false;
    }
    if (paramLeaderboard == paramObject) {
      return true;
    }
    paramObject = (Leaderboard)paramObject;
    return (Objects.equal(((Leaderboard)paramObject).getLeaderboardId(), paramLeaderboard.getLeaderboardId())) && (Objects.equal(((Leaderboard)paramObject).getDisplayName(), paramLeaderboard.getDisplayName())) && (Objects.equal(((Leaderboard)paramObject).getIconImageUri(), paramLeaderboard.getIconImageUri())) && (Objects.equal(Integer.valueOf(((Leaderboard)paramObject).getScoreOrder()), Integer.valueOf(paramLeaderboard.getScoreOrder()))) && (Objects.equal(((Leaderboard)paramObject).getVariants(), paramLeaderboard.getVariants()));
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzd(this, paramObject);
  }
  
  public final String getDisplayName()
  {
    return this.zzb;
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzb, paramCharArrayBuffer);
  }
  
  public final Uri getIconImageUri()
  {
    return this.zzc;
  }
  
  public String getIconImageUrl()
  {
    return this.zzg;
  }
  
  public final String getLeaderboardId()
  {
    return this.zza;
  }
  
  public final int getScoreOrder()
  {
    return this.zzd;
  }
  
  public final ArrayList<LeaderboardVariant> getVariants()
  {
    return new ArrayList(this.zze);
  }
  
  public final int hashCode()
  {
    return zzb(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzc(this);
  }
  
  public final Game zza()
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */