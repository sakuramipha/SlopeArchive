package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzm
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzm> CREATOR = new zzn();
  private final String zzan;
  private final boolean zzao;
  private final boolean zzat;
  private final DriveId zzdd;
  private final MetadataBundle zzde;
  private final Contents zzdf;
  private final int zzdg;
  private final int zzdh;
  private final boolean zzdi;
  
  public zzm(DriveId paramDriveId, MetadataBundle paramMetadataBundle, int paramInt, boolean paramBoolean, com.google.android.gms.drive.zzn paramzzn)
  {
    this(paramDriveId, paramMetadataBundle, null, paramzzn.zzm(), paramzzn.zzl(), paramzzn.zzn(), paramInt, paramBoolean, paramzzn.zzp());
  }
  
  zzm(DriveId paramDriveId, MetadataBundle paramMetadataBundle, Contents paramContents, boolean paramBoolean1, String paramString, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.zzdd = paramDriveId;
    this.zzde = paramMetadataBundle;
    this.zzdf = paramContents;
    this.zzao = paramBoolean1;
    this.zzan = paramString;
    this.zzdg = paramInt1;
    this.zzdh = paramInt2;
    this.zzdi = paramBoolean2;
    this.zzat = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdd, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzde, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzdf, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzao);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzan, false);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzdg);
    SafeParcelWriter.writeInt(paramParcel, 8, this.zzdh);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzdi);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzat);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */