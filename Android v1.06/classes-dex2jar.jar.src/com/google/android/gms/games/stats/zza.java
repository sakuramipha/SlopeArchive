package com.google.android.gms.games.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zza
  implements Parcelable.Creator
{
  static void zza(PlayerStatsEntity paramPlayerStatsEntity, Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeFloat(paramParcel, 1, paramPlayerStatsEntity.getAverageSessionLength());
    SafeParcelWriter.writeFloat(paramParcel, 2, paramPlayerStatsEntity.getChurnProbability());
    SafeParcelWriter.writeInt(paramParcel, 3, paramPlayerStatsEntity.getDaysSinceLastPlayed());
    SafeParcelWriter.writeInt(paramParcel, 4, paramPlayerStatsEntity.getNumberOfPurchases());
    SafeParcelWriter.writeInt(paramParcel, 5, paramPlayerStatsEntity.getNumberOfSessions());
    SafeParcelWriter.writeFloat(paramParcel, 6, paramPlayerStatsEntity.getSessionPercentile());
    SafeParcelWriter.writeFloat(paramParcel, 7, paramPlayerStatsEntity.getSpendPercentile());
    SafeParcelWriter.writeBundle(paramParcel, 8, paramPlayerStatsEntity.zza(), false);
    SafeParcelWriter.writeFloat(paramParcel, 9, paramPlayerStatsEntity.getSpendProbability());
    SafeParcelWriter.writeFloat(paramParcel, 10, paramPlayerStatsEntity.getHighSpenderProbability());
    SafeParcelWriter.writeFloat(paramParcel, 11, paramPlayerStatsEntity.getTotalSpendNext28Days());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\stats\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */