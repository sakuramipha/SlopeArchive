package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

public final class zzc
  extends DataBufferRef
  implements zza
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
    return MostRecentGameInfoEntity.zzi(this, paramObject);
  }
  
  public final int hashCode()
  {
    return MostRecentGameInfoEntity.zzg(this);
  }
  
  public final String toString()
  {
    return MostRecentGameInfoEntity.zzh(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(new MostRecentGameInfoEntity(this), paramParcel, paramInt);
  }
  
  public final long zza()
  {
    return getLong(this.zza.zzu);
  }
  
  public final Uri zzb()
  {
    return parseUri(this.zza.zzx);
  }
  
  public final Uri zzc()
  {
    return parseUri(this.zza.zzw);
  }
  
  public final Uri zzd()
  {
    return parseUri(this.zza.zzv);
  }
  
  public final String zze()
  {
    return getString(this.zza.zzs);
  }
  
  public final String zzf()
  {
    return getString(this.zza.zzt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\player\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */