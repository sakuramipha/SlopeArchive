package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

@Deprecated
public final class RoomEntity
  extends GamesDowngradeableSafeParcel
{
  public static final Parcelable.Creator<RoomEntity> CREATOR = new zzc();
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!shouldDowngrade())
    {
      SafeParcelWriter.finishObjectHeader(paramParcel, SafeParcelWriter.beginObjectHeader(paramParcel));
      return;
    }
    paramParcel.writeString("unsupported");
    paramParcel.writeString("unsupported");
    paramParcel.writeLong(0L);
    paramParcel.writeInt(0);
    paramParcel.writeString("unsupported");
    paramParcel.writeInt(-1);
    paramParcel.writeBundle(null);
    paramParcel.writeInt(0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\multiplayer\realtime\RoomEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */