package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzhf
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhf> CREATOR = new zzhg();
  private final DriveId zzdd;
  private final MetadataBundle zzde;
  
  public zzhf(DriveId paramDriveId, MetadataBundle paramMetadataBundle)
  {
    this.zzdd = paramDriveId;
    this.zzde = paramMetadataBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdd, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzde, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */