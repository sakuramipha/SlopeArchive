package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzb
  implements Parcelable.Creator
{
  static void zza(MostRecentGameInfoEntity paramMostRecentGameInfoEntity, Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, paramMostRecentGameInfoEntity.zze(), false);
    SafeParcelWriter.writeString(paramParcel, 2, paramMostRecentGameInfoEntity.zzf(), false);
    SafeParcelWriter.writeLong(paramParcel, 3, paramMostRecentGameInfoEntity.zza());
    SafeParcelWriter.writeParcelable(paramParcel, 4, paramMostRecentGameInfoEntity.zzd(), paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, paramMostRecentGameInfoEntity.zzc(), paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, paramMostRecentGameInfoEntity.zzb(), paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\player\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */