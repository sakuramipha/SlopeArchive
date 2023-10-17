package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.zzd;

public final class zzv
  extends zzo
  implements PlayerRelationshipInfo
{
  private final zzd zza;
  
  public zzv(DataHolder paramDataHolder, int paramInt, zzd paramzzd)
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
    return zzt.zzf(this, paramObject);
  }
  
  public final int getFriendStatus()
  {
    return zzp(this.zza.zzG, -1);
  }
  
  public final int hashCode()
  {
    return zzt.zzd(this);
  }
  
  public final String toString()
  {
    return zzt.zze(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(new zzt(this), paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return zzq(this.zza.zzI, null);
  }
  
  public final String zzb()
  {
    return zzq(this.zza.zzH, null);
  }
  
  public final String zzc()
  {
    return zzq(this.zza.zzJ, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */