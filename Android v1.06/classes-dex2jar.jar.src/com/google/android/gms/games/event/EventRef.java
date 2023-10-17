package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class EventRef
  extends DataBufferRef
  implements Event
{
  EventRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return EventEntity.zzc(this, paramObject);
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("description", paramCharArrayBuffer);
  }
  
  public final String getEventId()
  {
    return getString("external_event_id");
  }
  
  public final String getFormattedValue()
  {
    return getString("formatted_value");
  }
  
  public final void getFormattedValue(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer("formatted_value", paramCharArrayBuffer);
  }
  
  public final Uri getIconImageUri()
  {
    return parseUri("icon_image_uri");
  }
  
  public String getIconImageUrl()
  {
    return getString("icon_image_url");
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
    return new PlayerRef(this.mDataHolder, this.mDataRow, null);
  }
  
  public final long getValue()
  {
    return getLong("value");
  }
  
  public final int hashCode()
  {
    return EventEntity.zza(this);
  }
  
  public final boolean isVisible()
  {
    return getBoolean("visibility");
  }
  
  public final String toString()
  {
    return EventEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new EventEntity(this).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\event\EventRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */