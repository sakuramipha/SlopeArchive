package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.drive.zzh;
import java.util.List;

public final class zzv
  extends AbstractSafeParcelable
  implements DriveEvent
{
  public static final Parcelable.Creator<zzv> CREATOR = new zzw();
  private final List<zzh> zzcu;
  
  public zzv(List<zzh> paramList)
  {
    this.zzcu = paramList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzv)paramObject;
      return Objects.equal(this.zzcu, ((zzv)paramObject).zzcu);
    }
    return false;
  }
  
  public final int getType()
  {
    return 7;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzcu });
  }
  
  public final String toString()
  {
    return String.format("TransferStateEvent[%s]", new Object[] { TextUtils.join("','", this.zzcu) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 3, this.zzcu, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */