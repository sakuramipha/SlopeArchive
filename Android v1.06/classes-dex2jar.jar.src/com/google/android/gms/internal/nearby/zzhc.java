package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzhc
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhc> CREATOR = new zzhd();
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    return (paramObject instanceof zzhc);
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SafeParcelWriter.finishObjectHeader(paramParcel, SafeParcelWriter.beginObjectHeader(paramParcel));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */