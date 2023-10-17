package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class SnapshotEntity
  extends zzh
  implements Snapshot
{
  public static final Parcelable.Creator<SnapshotEntity> CREATOR = new zzb();
  private final SnapshotMetadataEntity zza;
  private final SnapshotContentsEntity zzb;
  
  public SnapshotEntity(SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    this.zza = new SnapshotMetadataEntity(paramSnapshotMetadata);
    this.zzb = paramSnapshotContentsEntity;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = paramObject instanceof Snapshot;
    boolean bool1 = true;
    if (!bool2) {}
    do
    {
      bool1 = false;
      break;
      if (this == paramObject) {
        break;
      }
      paramObject = (Snapshot)paramObject;
    } while ((!Objects.equal(((Snapshot)paramObject).getMetadata(), getMetadata())) || (!Objects.equal(((Snapshot)paramObject).getSnapshotContents(), getSnapshotContents())));
    return bool1;
  }
  
  public Snapshot freeze()
  {
    return this;
  }
  
  public SnapshotMetadata getMetadata()
  {
    return this.zza;
  }
  
  public SnapshotContents getSnapshotContents()
  {
    if (this.zzb.isClosed()) {
      return null;
    }
    return this.zzb;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { getMetadata(), getSnapshotContents() });
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(this).add("Metadata", getMetadata());
    boolean bool;
    if (getSnapshotContents() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return localToStringHelper.add("HasContents", Boolean.valueOf(bool)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, getMetadata(), paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, getSnapshotContents(), paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */