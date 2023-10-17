package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzec
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzec> CREATOR = new zzed();
  final IBinder zzgs;
  
  zzec(IBinder paramIBinder)
  {
    this.zzgs = paramIBinder;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeIBinder(paramParcel, 2, this.zzgs, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */