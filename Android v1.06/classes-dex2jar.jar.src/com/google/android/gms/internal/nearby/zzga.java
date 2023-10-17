package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class zzga
  implements Parcelable.Creator<zzfz>
{
  public zzfz zza(Parcel paramParcel)
  {
    int j = SafeParcelReader.validateObjectHeader(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = null;
    while (paramParcel.dataPosition() < j)
    {
      int i = SafeParcelReader.readHeader(paramParcel);
      if (SafeParcelReader.getFieldId(i) != 1) {
        SafeParcelReader.skipUnknownField(paramParcel, i);
      } else {
        localParcelFileDescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(paramParcel, i, ParcelFileDescriptor.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, j);
    return new zzfz(localParcelFileDescriptor);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */