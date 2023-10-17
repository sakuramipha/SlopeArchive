package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class AchievementRef
  extends DataBufferRef
  implements Achievement
{
  AchievementRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AchievementEntity.zzf(this, paramObject);
  }
  
  public final String getAchievementId()
  {
    return getString("external_achievement_id");
  }
  
  public final int getCurrentSteps()
  {
    int i = getInteger("type");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return getInteger("current_steps");
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("description", paramCharArrayBuffer);
  }
  
  public final String getFormattedCurrentSteps()
  {
    int i = getInteger("type");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return getString("formatted_current_steps");
  }
  
  public final void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = getInteger("type");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    copyToBuffer("formatted_current_steps", paramCharArrayBuffer);
  }
  
  public final String getFormattedTotalSteps()
  {
    int i = getInteger("type");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return getString("formatted_total_steps");
  }
  
  public final void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = getInteger("type");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    copyToBuffer("formatted_total_steps", paramCharArrayBuffer);
  }
  
  public final long getLastUpdatedTimestamp()
  {
    return getLong("last_updated_timestamp");
  }
  
  public final String getName()
  {
    return getString("name");
  }
  
  public final void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("name", paramCharArrayBuffer);
  }
  
  public final Player getPlayer()
  {
    return (Player)Preconditions.checkNotNull(zzb());
  }
  
  public final Uri getRevealedImageUri()
  {
    return parseUri("revealed_icon_image_uri");
  }
  
  public String getRevealedImageUrl()
  {
    return getString("revealed_icon_image_url");
  }
  
  public final int getState()
  {
    return getInteger("state");
  }
  
  public final int getTotalSteps()
  {
    int i = getInteger("type");
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return getInteger("total_steps");
  }
  
  public final int getType()
  {
    return getInteger("type");
  }
  
  public final Uri getUnlockedImageUri()
  {
    return parseUri("unlocked_icon_image_uri");
  }
  
  public String getUnlockedImageUrl()
  {
    return getString("unlocked_icon_image_url");
  }
  
  public final long getXpValue()
  {
    if ((hasColumn("instance_xp_value")) && (!hasNull("instance_xp_value"))) {
      return getLong("instance_xp_value");
    }
    return getLong("definition_xp_value");
  }
  
  public final int hashCode()
  {
    return AchievementEntity.zzd(this);
  }
  
  public final String toString()
  {
    return AchievementEntity.zze(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new AchievementEntity(this).writeToParcel(paramParcel, paramInt);
  }
  
  public final float zza()
  {
    if ((hasColumn("rarity_percent")) && (!hasNull("rarity_percent"))) {
      return getFloat("rarity_percent");
    }
    return -1.0F;
  }
  
  public final Player zzb()
  {
    if (hasNull("external_player_id")) {
      return null;
    }
    return new PlayerRef(this.mDataHolder, this.mDataRow, null);
  }
  
  public final String zzc()
  {
    return getString("external_game_id");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\achievement\AchievementRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */