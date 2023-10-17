package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class zzd
  implements Parcelable.Creator
{
  public RoomEntity zza(Parcel paramParcel)
  {
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    while (paramParcel.dataPosition() < i)
    {
      int j = SafeParcelReader.readHeader(paramParcel);
      SafeParcelReader.getFieldId(j);
      SafeParcelReader.skipUnknownField(paramParcel, j);
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    return new RoomEntity();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\realtime\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */