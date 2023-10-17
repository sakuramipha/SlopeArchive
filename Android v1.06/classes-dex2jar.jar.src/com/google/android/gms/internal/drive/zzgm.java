package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public final class zzgm
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgm> CREATOR = new zzgn();
  private final String zzba;
  private final String[] zzbb;
  private final DriveId zzbd;
  private final FilterHolder zzbe;
  
  public zzgm(String paramString, String[] paramArrayOfString, DriveId paramDriveId, FilterHolder paramFilterHolder)
  {
    this.zzba = paramString;
    this.zzbb = paramArrayOfString;
    this.zzbd = paramDriveId;
    this.zzbe = paramFilterHolder;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzba, false);
    SafeParcelWriter.writeStringArray(paramParcel, 3, this.zzbb, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzbd, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzbe, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */