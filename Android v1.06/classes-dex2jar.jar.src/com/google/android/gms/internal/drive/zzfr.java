package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfr
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfr> CREATOR = new zzfs();
  private final ParcelFileDescriptor zzih;
  
  public zzfr(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zzih = paramParcelFileDescriptor;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzih, paramInt | 0x1, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */