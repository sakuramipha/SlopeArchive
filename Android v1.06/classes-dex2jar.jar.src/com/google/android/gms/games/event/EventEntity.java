package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzh;

public final class EventEntity
  extends zzh
  implements Event
{
  public static final Parcelable.Creator<EventEntity> CREATOR = new zza();
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final Uri zzd;
  private final String zze;
  private final PlayerEntity zzf;
  private final long zzg;
  private final String zzh;
  private final boolean zzi;
  
  public EventEntity(Event paramEvent)
  {
    this.zza = paramEvent.getEventId();
    this.zzb = paramEvent.getName();
    this.zzc = paramEvent.getDescription();
    this.zzd = paramEvent.getIconImageUri();
    this.zze = paramEvent.getIconImageUrl();
    this.zzf = ((PlayerEntity)paramEvent.getPlayer().freeze());
    this.zzg = paramEvent.getValue();
    this.zzh = paramEvent.getFormattedValue();
    this.zzi = paramEvent.isVisible();
  }
  
  EventEntity(String paramString1, String paramString2, String paramString3, Uri paramUri, String paramString4, Player paramPlayer, long paramLong, String paramString5, boolean paramBoolean)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramUri;
    this.zze = paramString4;
    this.zzf = new PlayerEntity(paramPlayer);
    this.zzg = paramLong;
    this.zzh = paramString5;
    this.zzi = paramBoolean;
  }
  
  static int zza(Event paramEvent)
  {
    return Objects.hashCode(new Object[] { paramEvent.getEventId(), paramEvent.getName(), paramEvent.getDescription(), paramEvent.getIconImageUri(), paramEvent.getIconImageUrl(), paramEvent.getPlayer(), Long.valueOf(paramEvent.getValue()), paramEvent.getFormattedValue(), Boolean.valueOf(paramEvent.isVisible()) });
  }
  
  static String zzb(Event paramEvent)
  {
    return Objects.toStringHelper(paramEvent).add("Id", paramEvent.getEventId()).add("Name", paramEvent.getName()).add("Description", paramEvent.getDescription()).add("IconImageUri", paramEvent.getIconImageUri()).add("IconImageUrl", paramEvent.getIconImageUrl()).add("Player", paramEvent.getPlayer()).add("Value", Long.valueOf(paramEvent.getValue())).add("FormattedValue", paramEvent.getFormattedValue()).add("isVisible", Boolean.valueOf(paramEvent.isVisible())).toString();
  }
  
  static boolean zzc(Event paramEvent, Object paramObject)
  {
    if (!(paramObject instanceof Event)) {
      return false;
    }
    if (paramEvent == paramObject) {
      return true;
    }
    paramObject = (Event)paramObject;
    return (Objects.equal(((Event)paramObject).getEventId(), paramEvent.getEventId())) && (Objects.equal(((Event)paramObject).getName(), paramEvent.getName())) && (Objects.equal(((Event)paramObject).getDescription(), paramEvent.getDescription())) && (Objects.equal(((Event)paramObject).getIconImageUri(), paramEvent.getIconImageUri())) && (Objects.equal(((Event)paramObject).getIconImageUrl(), paramEvent.getIconImageUrl())) && (Objects.equal(((Event)paramObject).getPlayer(), paramEvent.getPlayer())) && (Objects.equal(Long.valueOf(((Event)paramObject).getValue()), Long.valueOf(paramEvent.getValue()))) && (Objects.equal(((Event)paramObject).getFormattedValue(), paramEvent.getFormattedValue())) && (Objects.equal(Boolean.valueOf(((Event)paramObject).isVisible()), Boolean.valueOf(paramEvent.isVisible())));
  }
  
  public boolean equals(Object paramObject)
  {
    return zzc(this, paramObject);
  }
  
  public Event freeze()
  {
    return this;
  }
  
  public String getDescription()
  {
    return this.zzc;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzc, paramCharArrayBuffer);
  }
  
  public String getEventId()
  {
    return this.zza;
  }
  
  public String getFormattedValue()
  {
    return this.zzh;
  }
  
  public void getFormattedValue(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzh, paramCharArrayBuffer);
  }
  
  public Uri getIconImageUri()
  {
    return this.zzd;
  }
  
  public String getIconImageUrl()
  {
    return this.zze;
  }
  
  public String getName()
  {
    return this.zzb;
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzb, paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    return this.zzf;
  }
  
  public long getValue()
  {
    return this.zzg;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isVisible()
  {
    return this.zzi;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, getEventId(), false);
    SafeParcelWriter.writeString(paramParcel, 2, getName(), false);
    SafeParcelWriter.writeString(paramParcel, 3, getDescription(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, getIconImageUri(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 5, getIconImageUrl(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, getPlayer(), paramInt, false);
    SafeParcelWriter.writeLong(paramParcel, 7, getValue());
    SafeParcelWriter.writeString(paramParcel, 8, getFormattedValue(), false);
    SafeParcelWriter.writeBoolean(paramParcel, 9, isVisible());
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\event\EventEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */