package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzw
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzw> CREATOR = new zzx();
  private final String zzan;
  private final Contents zzdf;
  private final MetadataBundle zzdn;
  private final Integer zzdo;
  private final DriveId zzdp;
  private final boolean zzdq;
  private final int zzdr;
  private final int zzds;
  
  public zzw(DriveId paramDriveId, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2, ExecutionOptions paramExecutionOptions)
  {
    this(paramDriveId, paramMetadataBundle, null, paramInt2, paramExecutionOptions.zzm(), paramExecutionOptions.zzl(), paramExecutionOptions.zzn(), paramInt1);
  }
  
  zzw(DriveId paramDriveId, MetadataBundle paramMetadataBundle, Contents paramContents, int paramInt1, boolean paramBoolean, String paramString, int paramInt2, int paramInt3)
  {
    if ((paramContents != null) && (paramInt3 != 0))
    {
      boolean bool;
      if (paramContents.getRequestId() == paramInt3) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "inconsistent contents reference");
    }
    if ((paramInt1 == 0) && (paramContents == null) && (paramInt3 == 0)) {
      throw new IllegalArgumentException("Need a valid contents");
    }
    this.zzdp = ((DriveId)Preconditions.checkNotNull(paramDriveId));
    this.zzdn = ((MetadataBundle)Preconditions.checkNotNull(paramMetadataBundle));
    this.zzdf = paramContents;
    this.zzdo = Integer.valueOf(paramInt1);
    this.zzan = paramString;
    this.zzdr = paramInt2;
    this.zzdq = paramBoolean;
    this.zzds = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdp, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzdn, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzdf, paramInt, false);
    SafeParcelWriter.writeIntegerObject(paramParcel, 5, this.zzdo, false);
    SafeParcelWriter.writeBoolean(paramParcel, 6, this.zzdq);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzan, false);
    SafeParcelWriter.writeInt(paramParcel, 8, this.zzdr);
    SafeParcelWriter.writeInt(paramParcel, 9, this.zzds);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */