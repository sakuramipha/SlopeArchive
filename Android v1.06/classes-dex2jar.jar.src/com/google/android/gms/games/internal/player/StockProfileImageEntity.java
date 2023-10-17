package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class StockProfileImageEntity
  extends zzh
  implements StockProfileImage
{
  public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new zzf();
  private final String zza;
  private final Uri zzb;
  
  public StockProfileImageEntity(String paramString, Uri paramUri)
  {
    this.zza = paramString;
    this.zzb = paramUri;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof StockProfileImage)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (StockProfileImage)paramObject;
    return (Objects.equal(this.zza, ((StockProfileImage)paramObject).getImageUrl())) && (Objects.equal(this.zzb, ((StockProfileImage)paramObject).zza()));
  }
  
  public String getImageUrl()
  {
    return this.zza;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb });
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("ImageId", this.zza).add("ImageUri", this.zzb).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, getImageUrl(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final Uri zza()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\player\StockProfileImageEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */