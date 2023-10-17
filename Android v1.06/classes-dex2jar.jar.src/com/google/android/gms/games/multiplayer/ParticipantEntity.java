package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

@Deprecated
public final class ParticipantEntity
  extends GamesDowngradeableSafeParcel
{
  public static final Parcelable.Creator<ParticipantEntity> CREATOR = new zza();
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!shouldDowngrade())
    {
      SafeParcelWriter.finishObjectHeader(paramParcel, SafeParcelWriter.beginObjectHeader(paramParcel));
      return;
    }
    paramParcel.writeString("unsupported");
    paramParcel.writeString("unsupported");
    paramParcel.writeString(null);
    paramParcel.writeString(null);
    paramParcel.writeInt(0);
    paramParcel.writeString("unsupported");
    paramParcel.writeInt(0);
    paramParcel.writeInt(0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\ParticipantEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */