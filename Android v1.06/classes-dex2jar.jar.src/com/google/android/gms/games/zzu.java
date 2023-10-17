package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzu
  implements Parcelable.Creator
{
  static void zza(zzt paramzzt, Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, paramzzt.getFriendStatus());
    SafeParcelWriter.writeString(paramParcel, 2, paramzzt.zzb(), false);
    SafeParcelWriter.writeString(paramParcel, 3, paramzzt.zza(), false);
    SafeParcelWriter.writeString(paramParcel, 4, paramzzt.zzc(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */