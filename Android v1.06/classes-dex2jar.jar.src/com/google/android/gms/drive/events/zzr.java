package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.drive.zzh;

public final class zzr
  extends AbstractSafeParcelable
  implements DriveEvent
{
  public static final Parcelable.Creator<zzr> CREATOR = new zzs();
  private final zzh zzcs;
  
  public zzr(zzh paramzzh)
  {
    this.zzcs = paramzzh;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzr)paramObject;
      return Objects.equal(this.zzcs, ((zzr)paramObject).zzcs);
    }
    return false;
  }
  
  public final int getType()
  {
    return 8;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzcs });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzcs, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final zzh zzac()
  {
    return this.zzcs;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */