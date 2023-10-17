package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.internal.player.zza;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface Player
  extends Freezable<Player>, Parcelable
{
  public static final long CURRENT_XP_UNKNOWN = -1L;
  public static final long TIMESTAMP_UNKNOWN = -1L;
  
  public abstract Uri getBannerImageLandscapeUri();
  
  @Deprecated
  public abstract String getBannerImageLandscapeUrl();
  
  public abstract Uri getBannerImagePortraitUri();
  
  @Deprecated
  public abstract String getBannerImagePortraitUrl();
  
  public abstract CurrentPlayerInfo getCurrentPlayerInfo();
  
  public abstract String getDisplayName();
  
  public abstract void getDisplayName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract Uri getHiResImageUri();
  
  @Deprecated
  public abstract String getHiResImageUrl();
  
  public abstract Uri getIconImageUri();
  
  @Deprecated
  public abstract String getIconImageUrl();
  
  @Deprecated
  public abstract long getLastPlayedWithTimestamp();
  
  public abstract PlayerLevelInfo getLevelInfo();
  
  public abstract String getPlayerId();
  
  public abstract PlayerRelationshipInfo getRelationshipInfo();
  
  public abstract long getRetrievedTimestamp();
  
  public abstract String getTitle();
  
  public abstract void getTitle(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract boolean hasHiResImage();
  
  public abstract boolean hasIconImage();
  
  @Deprecated
  public abstract int zza();
  
  public abstract long zzb();
  
  public abstract zza zzc();
  
  public abstract String zzd();
  
  public abstract String zze();
  
  public abstract boolean zzf();
  
  public abstract boolean zzg();
  
  public abstract boolean zzh();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface FriendsListVisibilityStatus
  {
    public static final int FEATURE_UNAVAILABLE = 3;
    public static final int REQUEST_REQUIRED = 2;
    public static final int UNKNOWN = 0;
    public static final int VISIBLE = 1;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface PlayerFriendStatus
  {
    public static final int FRIEND = 4;
    public static final int NO_RELATIONSHIP = 0;
    public static final int UNKNOWN = -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\Player.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */