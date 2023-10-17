package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class LeaderboardRef
  extends DataBufferRef
  implements Leaderboard
{
  private final int zza;
  private final Game zzb;
  
  LeaderboardRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zza = paramInt2;
    this.zzb = new GameRef(paramDataHolder, paramInt1);
  }
  
  public final boolean equals(Object paramObject)
  {
    return LeaderboardEntity.zzd(this, paramObject);
  }
  
  public final String getDisplayName()
  {
    return getString("name");
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("name", paramCharArrayBuffer);
  }
  
  public final Uri getIconImageUri()
  {
    return parseUri("board_icon_image_uri");
  }
  
  public String getIconImageUrl()
  {
    return getString("board_icon_image_url");
  }
  
  public final String getLeaderboardId()
  {
    return getString("external_leaderboard_id");
  }
  
  public final int getScoreOrder()
  {
    return getInteger("score_order");
  }
  
  public final ArrayList<LeaderboardVariant> getVariants()
  {
    ArrayList localArrayList = new ArrayList(this.zza);
    for (int i = 0; i < this.zza; i++) {
      localArrayList.add(new zzb(this.mDataHolder, this.mDataRow + i));
    }
    return localArrayList;
  }
  
  public final int hashCode()
  {
    return LeaderboardEntity.zzb(this);
  }
  
  public final String toString()
  {
    return LeaderboardEntity.zzc(this);
  }
  
  public final Game zza()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\LeaderboardRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */