package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent
  extends AbstractSafeParcelable
  implements ResourceEvent
{
  public static final Parcelable.Creator<ChangeEvent> CREATOR = new zza();
  private final int zzbu;
  private final DriveId zzk;
  
  public ChangeEvent(DriveId paramDriveId, int paramInt)
  {
    this.zzk = paramDriveId;
    this.zzbu = paramInt;
  }
  
  public final DriveId getDriveId()
  {
    return this.zzk;
  }
  
  public final int getType()
  {
    return 1;
  }
  
  public final boolean hasBeenDeleted()
  {
    return (this.zzbu & 0x4) != 0;
  }
  
  public final boolean hasContentChanged()
  {
    return (this.zzbu & 0x2) != 0;
  }
  
  public final boolean hasMetadataChanged()
  {
    return (this.zzbu & 0x1) != 0;
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[] { this.zzk, Integer.valueOf(this.zzbu) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzk, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzbu);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\ChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */