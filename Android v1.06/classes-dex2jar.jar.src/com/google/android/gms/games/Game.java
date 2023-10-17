package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Game
  extends Freezable<Game>, Parcelable
{
  public abstract boolean areSnapshotsEnabled();
  
  public abstract int getAchievementTotalCount();
  
  public abstract String getApplicationId();
  
  public abstract String getDescription();
  
  public abstract void getDescription(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getDeveloperName();
  
  public abstract void getDeveloperName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getDisplayName();
  
  public abstract void getDisplayName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract Uri getFeaturedImageUri();
  
  @Deprecated
  public abstract String getFeaturedImageUrl();
  
  public abstract Uri getHiResImageUri();
  
  @Deprecated
  public abstract String getHiResImageUrl();
  
  public abstract Uri getIconImageUri();
  
  @Deprecated
  public abstract String getIconImageUrl();
  
  public abstract int getLeaderboardCount();
  
  public abstract String getPrimaryCategory();
  
  public abstract String getSecondaryCategory();
  
  public abstract String getThemeColor();
  
  public abstract boolean hasGamepadSupport();
  
  public abstract String zza();
  
  public abstract boolean zzb();
  
  public abstract boolean zzc();
  
  public abstract boolean zzd();
  
  public abstract boolean zze();
  
  @Deprecated
  public abstract boolean zzf();
  
  @Deprecated
  public abstract boolean zzg();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\Game.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */