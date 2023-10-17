package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class SnapshotMetadataChangeEntity
  extends zzh
  implements SnapshotMetadataChange
{
  public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new zzc();
  private final String zza;
  private final Long zzb;
  private final Uri zzc;
  private BitmapTeleporter zzd;
  private final Long zze;
  
  SnapshotMetadataChangeEntity()
  {
    this(null, null, null, null, null);
  }
  
  SnapshotMetadataChangeEntity(String paramString, Long paramLong1, BitmapTeleporter paramBitmapTeleporter, Uri paramUri, Long paramLong2)
  {
    this.zza = paramString;
    this.zzb = paramLong1;
    this.zzd = paramBitmapTeleporter;
    this.zzc = paramUri;
    this.zze = paramLong2;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramBitmapTeleporter != null) {
      if (paramUri == null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    Preconditions.checkState(bool1, "Cannot set both a URI and an image");
  }
  
  public final Bitmap getCoverImage()
  {
    BitmapTeleporter localBitmapTeleporter = this.zzd;
    if (localBitmapTeleporter == null) {
      return null;
    }
    return localBitmapTeleporter.get();
  }
  
  public final String getDescription()
  {
    return this.zza;
  }
  
  public final Long getPlayedTimeMillis()
  {
    return this.zzb;
  }
  
  public final Long getProgressValue()
  {
    return this.zze;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeLongObject(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzc, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzd, paramInt, false);
    SafeParcelWriter.writeLongObject(paramParcel, 6, this.zze, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final BitmapTeleporter zza()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataChangeEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */