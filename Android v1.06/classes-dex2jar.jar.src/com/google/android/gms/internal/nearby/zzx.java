package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzx
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzx> CREATOR = new zzy();
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    return (paramObject instanceof zzx);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */