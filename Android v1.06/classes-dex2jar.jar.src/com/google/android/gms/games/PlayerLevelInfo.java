package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class PlayerLevelInfo
  extends zzh
{
  public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new zzs();
  private final long zza;
  private final long zzb;
  private final PlayerLevel zzc;
  private final PlayerLevel zzd;
  
  public PlayerLevelInfo(long paramLong1, long paramLong2, PlayerLevel paramPlayerLevel1, PlayerLevel paramPlayerLevel2)
  {
    boolean bool;
    if (paramLong1 != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    Preconditions.checkNotNull(paramPlayerLevel1);
    Preconditions.checkNotNull(paramPlayerLevel2);
    this.zza = paramLong1;
    this.zzb = paramLong2;
    this.zzc = paramPlayerLevel1;
    this.zzd = paramPlayerLevel2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlayerLevelInfo)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (PlayerLevelInfo)paramObject;
    return (Objects.equal(Long.valueOf(this.zza), Long.valueOf(((PlayerLevelInfo)paramObject).zza))) && (Objects.equal(Long.valueOf(this.zzb), Long.valueOf(((PlayerLevelInfo)paramObject).zzb))) && (Objects.equal(this.zzc, ((PlayerLevelInfo)paramObject).zzc)) && (Objects.equal(this.zzd, ((PlayerLevelInfo)paramObject).zzd));
  }
  
  public PlayerLevel getCurrentLevel()
  {
    return this.zzc;
  }
  
  public long getCurrentXpTotal()
  {
    return this.zza;
  }
  
  public long getLastLevelUpTimestamp()
  {
    return this.zzb;
  }
  
  public PlayerLevel getNextLevel()
  {
    return this.zzd;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Long.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, this.zzd });
  }
  
  public boolean isMaxLevel()
  {
    return this.zzc.equals(this.zzd);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 1, getCurrentXpTotal());
    SafeParcelWriter.writeLong(paramParcel, 2, getLastLevelUpTimestamp());
    SafeParcelWriter.writeParcelable(paramParcel, 3, getCurrentLevel(), paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, getNextLevel(), paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayerLevelInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */