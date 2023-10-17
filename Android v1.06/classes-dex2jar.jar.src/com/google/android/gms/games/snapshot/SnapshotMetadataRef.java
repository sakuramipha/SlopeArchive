package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SnapshotMetadataRef
  extends DataBufferRef
  implements SnapshotMetadata
{
  private final Game zza;
  private final Player zzb;
  
  public SnapshotMetadataRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    this.zza = new GameRef(paramDataHolder, paramInt);
    this.zzb = new PlayerRef(paramDataHolder, paramInt, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return SnapshotMetadataEntity.zzd(this, paramObject);
  }
  
  public final float getCoverImageAspectRatio()
  {
    float f2 = getFloat("cover_icon_image_height");
    float f1 = getFloat("cover_icon_image_width");
    if (f2 == 0.0F) {
      return 0.0F;
    }
    return f1 / f2;
  }
  
  public final Uri getCoverImageUri()
  {
    return parseUri("cover_icon_image_uri");
  }
  
  public String getCoverImageUrl()
  {
    return getString("cover_icon_image_url");
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("description", paramCharArrayBuffer);
  }
  
  public final String getDeviceName()
  {
    return getString("device_name");
  }
  
  public final Game getGame()
  {
    return this.zza;
  }
  
  public final long getLastModifiedTimestamp()
  {
    return getLong("last_modified_timestamp");
  }
  
  public final Player getOwner()
  {
    return this.zzb;
  }
  
  public final long getPlayedTime()
  {
    return getLong("duration");
  }
  
  public final long getProgressValue()
  {
    return getLong("progress_value");
  }
  
  public final String getSnapshotId()
  {
    return getString("external_snapshot_id");
  }
  
  public final String getUniqueName()
  {
    return getString("unique_name");
  }
  
  public final boolean hasChangePending()
  {
    return getInteger("pending_change_count") > 0;
  }
  
  public final int hashCode()
  {
    return SnapshotMetadataEntity.zzb(this);
  }
  
  public final String toString()
  {
    return SnapshotMetadataEntity.zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new SnapshotMetadataEntity(this).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return getString("title");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */