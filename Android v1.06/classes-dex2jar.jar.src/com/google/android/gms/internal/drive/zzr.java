package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzr
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzr> CREATOR = new zzs();
  private final int mode;
  
  public zzr(int paramInt)
  {
    boolean bool;
    if ((paramInt != 536870912) && (paramInt != 805306368)) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkArgument(bool, "Cannot create a new read-only contents!");
    this.mode = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.mode);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */