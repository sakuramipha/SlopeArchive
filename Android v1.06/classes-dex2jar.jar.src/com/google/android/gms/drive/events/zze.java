package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public final class zze
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zze> CREATOR = new zzf();
  private final int zzbw;
  private final boolean zzbx;
  private final List<DriveSpace> zzby;
  
  zze(int paramInt, boolean paramBoolean, List<DriveSpace> paramList)
  {
    this.zzbw = paramInt;
    this.zzbx = paramBoolean;
    this.zzby = paramList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zze)paramObject;
      if ((Objects.equal(this.zzby, ((zze)paramObject).zzby)) && (this.zzbw == ((zze)paramObject).zzbw) && (this.zzbx == ((zze)paramObject).zzbx)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzby, Integer.valueOf(this.zzbw), Boolean.valueOf(this.zzbx) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzbw);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzbx);
    SafeParcelWriter.writeTypedList(paramParcel, 4, this.zzby, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */