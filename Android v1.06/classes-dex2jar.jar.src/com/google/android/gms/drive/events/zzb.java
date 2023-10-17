package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public final class zzb
  extends AbstractSafeParcelable
  implements DriveEvent
{
  public static final Parcelable.Creator<zzb> CREATOR = new zzc();
  private final zze zzbv;
  
  public zzb(zze paramzze)
  {
    this.zzbv = paramzze;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzb)paramObject;
      return Objects.equal(this.zzbv, ((zzb)paramObject).zzbv);
    }
    return false;
  }
  
  public final int getType()
  {
    return 4;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzbv });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[] { this.zzbv });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzbv, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */