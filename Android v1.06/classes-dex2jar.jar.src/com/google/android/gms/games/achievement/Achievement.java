package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface Achievement
  extends Freezable<Achievement>, Parcelable
{
  public static final int STATE_HIDDEN = 2;
  public static final int STATE_REVEALED = 1;
  public static final int STATE_UNLOCKED = 0;
  public static final int TYPE_INCREMENTAL = 1;
  public static final int TYPE_STANDARD = 0;
  
  public abstract String getAchievementId();
  
  public abstract int getCurrentSteps();
  
  public abstract String getDescription();
  
  public abstract void getDescription(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getFormattedCurrentSteps();
  
  public abstract void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getFormattedTotalSteps();
  
  public abstract void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract long getLastUpdatedTimestamp();
  
  public abstract String getName();
  
  public abstract void getName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract Player getPlayer();
  
  public abstract Uri getRevealedImageUri();
  
  @Deprecated
  public abstract String getRevealedImageUrl();
  
  public abstract int getState();
  
  public abstract int getTotalSteps();
  
  public abstract int getType();
  
  public abstract Uri getUnlockedImageUri();
  
  @Deprecated
  public abstract String getUnlockedImageUrl();
  
  public abstract long getXpValue();
  
  public abstract float zza();
  
  public abstract Player zzb();
  
  public abstract String zzc();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AchievementState {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AchievementType {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\achievement\Achievement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */