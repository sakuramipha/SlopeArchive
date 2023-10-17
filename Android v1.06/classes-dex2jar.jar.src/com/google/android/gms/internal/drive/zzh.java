package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

public final class zzh
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzh> CREATOR = new zzi();
  final int status;
  final int zzct;
  final long zzcw;
  final long zzcx;
  final DriveId zzk;
  
  public zzh(int paramInt1, DriveId paramDriveId, int paramInt2, long paramLong1, long paramLong2)
  {
    this.zzct = paramInt1;
    this.zzk = paramDriveId;
    this.status = paramInt2;
    this.zzcw = paramLong1;
    this.zzcx = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzh)paramObject;
      if ((this.zzct == ((zzh)paramObject).zzct) && (Objects.equal(this.zzk, ((zzh)paramObject).zzk)) && (this.status == ((zzh)paramObject).status) && (this.zzcw == ((zzh)paramObject).zzcw) && (this.zzcx == ((zzh)paramObject).zzcx)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzct);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzk, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 4, this.status);
    SafeParcelWriter.writeLong(paramParcel, 5, this.zzcw);
    SafeParcelWriter.writeLong(paramParcel, 6, this.zzcx);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */