package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;

public final class zzb
  extends DataBufferRef
  implements PlayerStats
{
  private Bundle zza;
  
  zzb(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return PlayerStatsEntity.zzd(this, paramObject);
  }
  
  public final float getAverageSessionLength()
  {
    return getFloat("ave_session_length_minutes");
  }
  
  public final float getChurnProbability()
  {
    return getFloat("churn_probability");
  }
  
  public final int getDaysSinceLastPlayed()
  {
    return getInteger("days_since_last_played");
  }
  
  public final float getHighSpenderProbability()
  {
    if (!hasColumn("high_spender_probability")) {
      return -1.0F;
    }
    return getFloat("high_spender_probability");
  }
  
  public final int getNumberOfPurchases()
  {
    return getInteger("num_purchases");
  }
  
  public final int getNumberOfSessions()
  {
    return getInteger("num_sessions");
  }
  
  public final float getSessionPercentile()
  {
    return getFloat("num_sessions_percentile");
  }
  
  public final float getSpendPercentile()
  {
    return getFloat("spend_percentile");
  }
  
  public final float getSpendProbability()
  {
    if (!hasColumn("spend_probability")) {
      return -1.0F;
    }
    return getFloat("spend_probability");
  }
  
  public final float getTotalSpendNext28Days()
  {
    if (!hasColumn("total_spend_next_28_days")) {
      return -1.0F;
    }
    return getFloat("total_spend_next_28_days");
  }
  
  public final int hashCode()
  {
    return PlayerStatsEntity.zzb(this);
  }
  
  public final String toString()
  {
    return PlayerStatsEntity.zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(new PlayerStatsEntity(this), paramParcel, paramInt);
  }
  
  public final Bundle zza()
  {
    Object localObject1 = this.zza;
    if (localObject1 != null) {
      return (Bundle)localObject1;
    }
    this.zza = new Bundle();
    Object localObject2 = getString("unknown_raw_keys");
    localObject1 = getString("unknown_raw_values");
    if ((localObject2 != null) && (localObject1 != null))
    {
      localObject2 = ((String)localObject2).split(",");
      localObject1 = ((String)localObject1).split(",");
      int k = localObject2.length;
      int j = localObject1.length;
      int i = 0;
      boolean bool;
      if (k <= j) {
        bool = true;
      } else {
        bool = false;
      }
      Asserts.checkState(bool, "Invalid raw arguments!");
      while (i < localObject2.length)
      {
        this.zza.putString(localObject2[i], localObject1[i]);
        i++;
      }
    }
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\stats\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */