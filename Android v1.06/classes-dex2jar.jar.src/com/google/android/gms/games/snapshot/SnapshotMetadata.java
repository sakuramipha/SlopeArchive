package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

public abstract interface SnapshotMetadata
  extends Freezable<SnapshotMetadata>, Parcelable
{
  public static final long PLAYED_TIME_UNKNOWN = -1L;
  public static final long PROGRESS_VALUE_UNKNOWN = -1L;
  
  public abstract float getCoverImageAspectRatio();
  
  public abstract Uri getCoverImageUri();
  
  @Deprecated
  public abstract String getCoverImageUrl();
  
  public abstract String getDescription();
  
  public abstract void getDescription(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getDeviceName();
  
  public abstract Game getGame();
  
  public abstract long getLastModifiedTimestamp();
  
  public abstract Player getOwner();
  
  public abstract long getPlayedTime();
  
  public abstract long getProgressValue();
  
  public abstract String getSnapshotId();
  
  public abstract String getUniqueName();
  
  public abstract boolean hasChangePending();
  
  public abstract String zza();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */