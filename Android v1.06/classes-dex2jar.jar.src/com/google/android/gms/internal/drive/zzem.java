package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.zzr;
import java.util.List;

public final class zzem
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzem> CREATOR = new zzen();
  private final int responseCode;
  private final List<zzr> zzhb;
  
  public zzem(List<zzr> paramList, int paramInt)
  {
    this.zzhb = paramList;
    this.responseCode = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzhb, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.responseCode);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */