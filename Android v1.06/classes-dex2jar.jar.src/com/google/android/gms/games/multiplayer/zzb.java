package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class zzb
  implements Parcelable.Creator
{
  public ParticipantEntity zza(Parcel paramParcel)
  {
    int j = SafeParcelReader.validateObjectHeader(paramParcel);
    while (paramParcel.dataPosition() < j)
    {
      int i = SafeParcelReader.readHeader(paramParcel);
      SafeParcelReader.getFieldId(i);
      SafeParcelReader.skipUnknownField(paramParcel, i);
    }
    SafeParcelReader.ensureAtEnd(paramParcel, j);
    return new ParticipantEntity();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */