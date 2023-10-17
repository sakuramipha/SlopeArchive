package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.zzd;

public final class zzc
  extends zzo
  implements CurrentPlayerInfo
{
  private final zzd zza;
  
  public zzc(DataHolder paramDataHolder, int paramInt, zzd paramzzd)
  {
    super(paramDataHolder, paramInt);
    this.zza = paramzzd;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza.zzc(this, paramObject);
  }
  
  public final int getFriendsListVisibilityStatus()
  {
    return zzp(this.zza.zzK, 0);
  }
  
  public final int hashCode()
  {
    return zza.zza(this);
  }
  
  public final String toString()
  {
    return zza.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(new zza(this), paramParcel, paramInt);
  }
  
  public final boolean zza()
  {
    return (hasColumn(this.zza.zzK)) && (!hasNull(this.zza.zzK));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */