package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.games.internal.zzh;

public final class zzt
  extends zzh
  implements PlayerRelationshipInfo
{
  public static final Parcelable.Creator<zzt> CREATOR = new zzu();
  private final int zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  
  public zzt(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.zza = paramInt;
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramString3;
  }
  
  public zzt(PlayerRelationshipInfo paramPlayerRelationshipInfo)
  {
    this.zza = paramPlayerRelationshipInfo.getFriendStatus();
    this.zzb = paramPlayerRelationshipInfo.zzb();
    this.zzc = paramPlayerRelationshipInfo.zza();
    this.zzd = paramPlayerRelationshipInfo.zzc();
  }
  
  static int zzd(PlayerRelationshipInfo paramPlayerRelationshipInfo)
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(paramPlayerRelationshipInfo.getFriendStatus()), paramPlayerRelationshipInfo.zzb(), paramPlayerRelationshipInfo.zza(), paramPlayerRelationshipInfo.zzc() });
  }
  
  static String zze(PlayerRelationshipInfo paramPlayerRelationshipInfo)
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(paramPlayerRelationshipInfo);
    localToStringHelper.add("FriendStatus", Integer.valueOf(paramPlayerRelationshipInfo.getFriendStatus()));
    if (paramPlayerRelationshipInfo.zzb() != null) {
      localToStringHelper.add("Nickname", paramPlayerRelationshipInfo.zzb());
    }
    if (paramPlayerRelationshipInfo.zza() != null) {
      localToStringHelper.add("InvitationNickname", paramPlayerRelationshipInfo.zza());
    }
    if (paramPlayerRelationshipInfo.zzc() != null) {
      localToStringHelper.add("NicknameAbuseReportToken", paramPlayerRelationshipInfo.zza());
    }
    return localToStringHelper.toString();
  }
  
  static boolean zzf(PlayerRelationshipInfo paramPlayerRelationshipInfo, Object paramObject)
  {
    if (!(paramObject instanceof PlayerRelationshipInfo)) {
      return false;
    }
    if (paramObject == paramPlayerRelationshipInfo) {
      return true;
    }
    paramObject = (PlayerRelationshipInfo)paramObject;
    return (((PlayerRelationshipInfo)paramObject).getFriendStatus() == paramPlayerRelationshipInfo.getFriendStatus()) && (Objects.equal(((PlayerRelationshipInfo)paramObject).zzb(), paramPlayerRelationshipInfo.zzb())) && (Objects.equal(((PlayerRelationshipInfo)paramObject).zza(), paramPlayerRelationshipInfo.zza())) && (Objects.equal(((PlayerRelationshipInfo)paramObject).zzc(), paramPlayerRelationshipInfo.zzc()));
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzf(this, paramObject);
  }
  
  public final int getFriendStatus()
  {
    return this.zza;
  }
  
  public final int hashCode()
  {
    return zzd(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zze(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zzc;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */