package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class PlayerLevel
  extends zzh
{
  public static final Parcelable.Creator<PlayerLevel> CREATOR = new zzr();
  private final int zza;
  private final long zzb;
  private final long zzc;
  
  public PlayerLevel(int paramInt, long paramLong1, long paramLong2)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramLong1 >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Min XP must be positive!");
    if (paramLong2 > paramLong1) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Max XP must be more than min XP!");
    this.zza = paramInt;
    this.zzb = paramLong1;
    this.zzc = paramLong2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlayerLevel)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (PlayerLevel)paramObject;
    return (Objects.equal(Integer.valueOf(((PlayerLevel)paramObject).getLevelNumber()), Integer.valueOf(getLevelNumber()))) && (Objects.equal(Long.valueOf(((PlayerLevel)paramObject).getMinXp()), Long.valueOf(getMinXp()))) && (Objects.equal(Long.valueOf(((PlayerLevel)paramObject).getMaxXp()), Long.valueOf(getMaxXp())));
  }
  
  public int getLevelNumber()
  {
    return this.zza;
  }
  
  public long getMaxXp()
  {
    return this.zzc;
  }
  
  public long getMinXp()
  {
    return this.zzb;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc) });
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("LevelNumber", Integer.valueOf(getLevelNumber())).add("MinXp", Long.valueOf(getMinXp())).add("MaxXp", Long.valueOf(getMaxXp())).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, getLevelNumber());
    SafeParcelWriter.writeLong(paramParcel, 2, getMinXp());
    SafeParcelWriter.writeLong(paramParcel, 3, getMaxXp());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayerLevel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */