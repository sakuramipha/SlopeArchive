package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class zzc
  implements Parcelable.Creator
{
  public GameBadgeEntity zza(Parcel paramParcel)
  {
    int j = SafeParcelReader.validateObjectHeader(paramParcel);
    String str2 = null;
    String str1 = null;
    Uri localUri = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = SafeParcelReader.readHeader(paramParcel);
      int k = SafeParcelReader.getFieldId(m);
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4) {
              SafeParcelReader.skipUnknownField(paramParcel, m);
            } else {
              localUri = (Uri)SafeParcelReader.createParcelable(paramParcel, m, Uri.CREATOR);
            }
          }
          else {
            str1 = SafeParcelReader.createString(paramParcel, m);
          }
        }
        else {
          str2 = SafeParcelReader.createString(paramParcel, m);
        }
      }
      else {
        i = SafeParcelReader.readInt(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, j);
    return new GameBadgeEntity(i, str2, str1, localUri);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\game\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */