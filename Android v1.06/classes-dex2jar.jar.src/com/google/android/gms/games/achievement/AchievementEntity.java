package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzh;

public final class AchievementEntity
  extends zzh
  implements Achievement
{
  public static final Parcelable.Creator<AchievementEntity> CREATOR = new zza();
  private final String zza;
  private final int zzb;
  private final String zzc;
  private final String zzd;
  private final Uri zze;
  private final String zzf;
  private final Uri zzg;
  private final String zzh;
  private final int zzi;
  private final String zzj;
  private final PlayerEntity zzk;
  private final int zzl;
  private final int zzm;
  private final String zzn;
  private final long zzo;
  private final long zzp;
  private final float zzq;
  private final String zzr;
  
  public AchievementEntity(Achievement paramAchievement)
  {
    String str1 = paramAchievement.getAchievementId();
    this.zza = str1;
    this.zzb = paramAchievement.getType();
    this.zzc = paramAchievement.getName();
    String str2 = paramAchievement.getDescription();
    this.zzd = str2;
    this.zze = paramAchievement.getUnlockedImageUri();
    this.zzf = paramAchievement.getUnlockedImageUrl();
    this.zzg = paramAchievement.getRevealedImageUri();
    this.zzh = paramAchievement.getRevealedImageUrl();
    Player localPlayer = paramAchievement.zzb();
    if (localPlayer != null) {
      this.zzk = new PlayerEntity(localPlayer);
    } else {
      this.zzk = null;
    }
    this.zzl = paramAchievement.getState();
    this.zzo = paramAchievement.getLastUpdatedTimestamp();
    this.zzp = paramAchievement.getXpValue();
    this.zzq = paramAchievement.zza();
    this.zzr = paramAchievement.zzc();
    if (paramAchievement.getType() == 1)
    {
      this.zzi = paramAchievement.getTotalSteps();
      this.zzj = paramAchievement.getFormattedTotalSteps();
      this.zzm = paramAchievement.getCurrentSteps();
      this.zzn = paramAchievement.getFormattedCurrentSteps();
    }
    else
    {
      this.zzi = 0;
      this.zzj = null;
      this.zzm = 0;
      this.zzn = null;
    }
    Asserts.checkNotNull(str1);
    Asserts.checkNotNull(str2);
  }
  
  AchievementEntity(String paramString1, int paramInt1, String paramString2, String paramString3, Uri paramUri1, String paramString4, Uri paramUri2, String paramString5, int paramInt2, String paramString6, PlayerEntity paramPlayerEntity, int paramInt3, int paramInt4, String paramString7, long paramLong1, long paramLong2, float paramFloat, String paramString8)
  {
    this.zza = paramString1;
    this.zzb = paramInt1;
    this.zzc = paramString2;
    this.zzd = paramString3;
    this.zze = paramUri1;
    this.zzf = paramString4;
    this.zzg = paramUri2;
    this.zzh = paramString5;
    this.zzi = paramInt2;
    this.zzj = paramString6;
    this.zzk = paramPlayerEntity;
    this.zzl = paramInt3;
    this.zzm = paramInt4;
    this.zzn = paramString7;
    this.zzo = paramLong1;
    this.zzp = paramLong2;
    this.zzq = paramFloat;
    this.zzr = paramString8;
  }
  
  static int zzd(Achievement paramAchievement)
  {
    int i;
    int j;
    if (paramAchievement.getType() == 1)
    {
      i = paramAchievement.getCurrentSteps();
      j = paramAchievement.getTotalSteps();
    }
    else
    {
      i = 0;
      j = 0;
    }
    return Objects.hashCode(new Object[] { paramAchievement.getAchievementId(), paramAchievement.zzc(), paramAchievement.getName(), Integer.valueOf(paramAchievement.getType()), paramAchievement.getDescription(), Long.valueOf(paramAchievement.getXpValue()), Integer.valueOf(paramAchievement.getState()), Long.valueOf(paramAchievement.getLastUpdatedTimestamp()), paramAchievement.zzb(), Integer.valueOf(i), Integer.valueOf(j) });
  }
  
  static String zze(Achievement paramAchievement)
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(paramAchievement).add("Id", paramAchievement.getAchievementId()).add("Game Id", paramAchievement.zzc()).add("Type", Integer.valueOf(paramAchievement.getType())).add("Name", paramAchievement.getName()).add("Description", paramAchievement.getDescription()).add("Player", paramAchievement.zzb()).add("State", Integer.valueOf(paramAchievement.getState())).add("Rarity Percent", Float.valueOf(paramAchievement.zza()));
    if (paramAchievement.getType() == 1)
    {
      localToStringHelper.add("CurrentSteps", Integer.valueOf(paramAchievement.getCurrentSteps()));
      localToStringHelper.add("TotalSteps", Integer.valueOf(paramAchievement.getTotalSteps()));
    }
    return localToStringHelper.toString();
  }
  
  static boolean zzf(Achievement paramAchievement, Object paramObject)
  {
    if (!(paramObject instanceof Achievement)) {
      return false;
    }
    if (paramAchievement == paramObject) {
      return true;
    }
    paramObject = (Achievement)paramObject;
    if (((Achievement)paramObject).getType() != paramAchievement.getType()) {
      return false;
    }
    if (paramAchievement.getType() == 1)
    {
      if (((Achievement)paramObject).getCurrentSteps() != paramAchievement.getCurrentSteps()) {
        return false;
      }
      if (((Achievement)paramObject).getTotalSteps() != paramAchievement.getTotalSteps()) {
        return false;
      }
    }
    return (((Achievement)paramObject).getXpValue() == paramAchievement.getXpValue()) && (((Achievement)paramObject).getState() == paramAchievement.getState()) && (((Achievement)paramObject).getLastUpdatedTimestamp() == paramAchievement.getLastUpdatedTimestamp()) && (Objects.equal(((Achievement)paramObject).getAchievementId(), paramAchievement.getAchievementId())) && (Objects.equal(((Achievement)paramObject).zzc(), paramAchievement.zzc())) && (Objects.equal(((Achievement)paramObject).getName(), paramAchievement.getName())) && (Objects.equal(((Achievement)paramObject).getDescription(), paramAchievement.getDescription())) && (Objects.equal(((Achievement)paramObject).zzb(), paramAchievement.zzb())) && (((Achievement)paramObject).zza() == paramAchievement.zza());
  }
  
  public boolean equals(Object paramObject)
  {
    return zzf(this, paramObject);
  }
  
  public Achievement freeze()
  {
    return this;
  }
  
  public String getAchievementId()
  {
    return this.zza;
  }
  
  public int getCurrentSteps()
  {
    int i = getType();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return this.zzm;
  }
  
  public String getDescription()
  {
    return this.zzd;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzd, paramCharArrayBuffer);
  }
  
  public String getFormattedCurrentSteps()
  {
    int i = getType();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return this.zzn;
  }
  
  public void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = getType();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    DataUtils.copyStringToBuffer(this.zzn, paramCharArrayBuffer);
  }
  
  public String getFormattedTotalSteps()
  {
    int i = getType();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return this.zzj;
  }
  
  public void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = getType();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    DataUtils.copyStringToBuffer(this.zzj, paramCharArrayBuffer);
  }
  
  public long getLastUpdatedTimestamp()
  {
    return this.zzo;
  }
  
  public String getName()
  {
    return this.zzc;
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzc, paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    return (Player)Preconditions.checkNotNull(this.zzk);
  }
  
  public Uri getRevealedImageUri()
  {
    return this.zzg;
  }
  
  public String getRevealedImageUrl()
  {
    return this.zzh;
  }
  
  public int getState()
  {
    return this.zzl;
  }
  
  public int getTotalSteps()
  {
    int i = getType();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Asserts.checkState(bool);
    return this.zzi;
  }
  
  public int getType()
  {
    return this.zzb;
  }
  
  public Uri getUnlockedImageUri()
  {
    return this.zze;
  }
  
  public String getUnlockedImageUrl()
  {
    return this.zzf;
  }
  
  public long getXpValue()
  {
    return this.zzp;
  }
  
  public int hashCode()
  {
    return zzd(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zze(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, getAchievementId(), false);
    SafeParcelWriter.writeInt(paramParcel, 2, getType());
    SafeParcelWriter.writeString(paramParcel, 3, getName(), false);
    SafeParcelWriter.writeString(paramParcel, 4, getDescription(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, getUnlockedImageUri(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 6, getUnlockedImageUrl(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 7, getRevealedImageUri(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 8, getRevealedImageUrl(), false);
    SafeParcelWriter.writeInt(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeString(paramParcel, 10, this.zzj, false);
    SafeParcelWriter.writeParcelable(paramParcel, 11, this.zzk, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 12, getState());
    SafeParcelWriter.writeInt(paramParcel, 13, this.zzm);
    SafeParcelWriter.writeString(paramParcel, 14, this.zzn, false);
    SafeParcelWriter.writeLong(paramParcel, 15, getLastUpdatedTimestamp());
    SafeParcelWriter.writeLong(paramParcel, 16, getXpValue());
    SafeParcelWriter.writeFloat(paramParcel, 17, this.zzq);
    SafeParcelWriter.writeString(paramParcel, 18, this.zzr, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final float zza()
  {
    return this.zzq;
  }
  
  public final Player zzb()
  {
    return this.zzk;
  }
  
  public final String zzc()
  {
    return this.zzr;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\achievement\AchievementEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */