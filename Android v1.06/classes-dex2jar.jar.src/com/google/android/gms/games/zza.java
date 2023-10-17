package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.games.internal.zzh;

public final class zza
  extends zzh
  implements CurrentPlayerInfo
{
  public static final Parcelable.Creator<zza> CREATOR = new zzb();
  private final int zza;
  
  public zza(int paramInt)
  {
    this.zza = paramInt;
  }
  
  public zza(CurrentPlayerInfo paramCurrentPlayerInfo)
  {
    this.zza = paramCurrentPlayerInfo.getFriendsListVisibilityStatus();
  }
  
  static int zza(CurrentPlayerInfo paramCurrentPlayerInfo)
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(paramCurrentPlayerInfo.getFriendsListVisibilityStatus()) });
  }
  
  static String zzb(CurrentPlayerInfo paramCurrentPlayerInfo)
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(paramCurrentPlayerInfo);
    localToStringHelper.add("FriendsListVisibilityStatus", Integer.valueOf(paramCurrentPlayerInfo.getFriendsListVisibilityStatus()));
    return localToStringHelper.toString();
  }
  
  static boolean zzc(CurrentPlayerInfo paramCurrentPlayerInfo, Object paramObject)
  {
    if (!(paramObject instanceof CurrentPlayerInfo)) {
      return false;
    }
    if (paramObject == paramCurrentPlayerInfo) {
      return true;
    }
    return ((CurrentPlayerInfo)paramObject).getFriendsListVisibilityStatus() == paramCurrentPlayerInfo.getFriendsListVisibilityStatus();
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzc(this, paramObject);
  }
  
  public final int getFriendsListVisibilityStatus()
  {
    return this.zza;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */