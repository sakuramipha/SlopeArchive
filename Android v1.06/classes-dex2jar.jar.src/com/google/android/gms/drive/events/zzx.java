package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;
import java.util.Locale;

public final class zzx
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzx> CREATOR = new zzy();
  private final List<DriveSpace> zzby;
  
  zzx(List<DriveSpace> paramList)
  {
    this.zzby = paramList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzx)paramObject;
      return Objects.equal(this.zzby, ((zzx)paramObject).zzby);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzby });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", new Object[] { this.zzby });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzby, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */