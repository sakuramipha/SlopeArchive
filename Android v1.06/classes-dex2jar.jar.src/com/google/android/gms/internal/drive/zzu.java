package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzu
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzu> CREATOR = new zzv();
  private final String zzba;
  private final DriveId zzbd;
  private final MetadataBundle zzdn;
  private final Integer zzdo;
  private final int zzj;
  
  public zzu(MetadataBundle paramMetadataBundle, int paramInt, String paramString, DriveId paramDriveId, Integer paramInteger)
  {
    this.zzdn = paramMetadataBundle;
    this.zzj = paramInt;
    this.zzba = paramString;
    this.zzbd = paramDriveId;
    this.zzdo = paramInteger;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdn, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzj);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzba, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzbd, paramInt, false);
    SafeParcelWriter.writeIntegerObject(paramParcel, 6, this.zzdo, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */