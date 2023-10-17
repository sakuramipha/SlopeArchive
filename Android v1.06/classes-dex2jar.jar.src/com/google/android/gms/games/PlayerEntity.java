package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public final class PlayerEntity
  extends GamesDowngradeableSafeParcel
  implements Player
{
  public static final Parcelable.Creator<PlayerEntity> CREATOR = new zzp();
  private String zza;
  private String zzb;
  private final Uri zzc;
  private final Uri zzd;
  private final long zze;
  private final int zzf;
  private final long zzg;
  private final String zzh;
  private final String zzi;
  private final String zzj;
  private final MostRecentGameInfoEntity zzk;
  private final PlayerLevelInfo zzl;
  private final boolean zzm;
  private final boolean zzn;
  private final String zzo;
  private final String zzp;
  private final Uri zzq;
  private final String zzr;
  private final Uri zzs;
  private final String zzt;
  private long zzu;
  private final zzt zzv;
  private final zza zzw;
  private boolean zzx;
  
  public PlayerEntity(Player paramPlayer)
  {
    this.zza = paramPlayer.getPlayerId();
    this.zzb = paramPlayer.getDisplayName();
    this.zzc = paramPlayer.getIconImageUri();
    this.zzh = paramPlayer.getIconImageUrl();
    this.zzd = paramPlayer.getHiResImageUri();
    this.zzi = paramPlayer.getHiResImageUrl();
    long l = paramPlayer.getRetrievedTimestamp();
    this.zze = l;
    this.zzf = paramPlayer.zza();
    this.zzg = paramPlayer.getLastPlayedWithTimestamp();
    this.zzj = paramPlayer.getTitle();
    this.zzm = paramPlayer.zzh();
    Object localObject1 = paramPlayer.zzc();
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = new MostRecentGameInfoEntity((com.google.android.gms.games.internal.player.zza)localObject1);
    }
    this.zzk = ((MostRecentGameInfoEntity)localObject1);
    this.zzl = paramPlayer.getLevelInfo();
    this.zzn = paramPlayer.zzf();
    this.zzo = paramPlayer.zzd();
    this.zzp = paramPlayer.zze();
    this.zzq = paramPlayer.getBannerImageLandscapeUri();
    this.zzr = paramPlayer.getBannerImageLandscapeUrl();
    this.zzs = paramPlayer.getBannerImagePortraitUri();
    this.zzt = paramPlayer.getBannerImagePortraitUrl();
    this.zzu = paramPlayer.zzb();
    localObject1 = paramPlayer.getRelationshipInfo();
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = new zzt(((PlayerRelationshipInfo)localObject1).freeze());
    }
    this.zzv = ((zzt)localObject1);
    localObject1 = paramPlayer.getCurrentPlayerInfo();
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((CurrentPlayerInfo)localObject1).freeze();
    }
    this.zzw = ((zza)localObject1);
    this.zzx = paramPlayer.zzg();
    Asserts.checkNotNull(this.zza);
    Asserts.checkNotNull(this.zzb);
    boolean bool;
    if (l > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Asserts.checkState(bool);
  }
  
  PlayerEntity(String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong1, int paramInt, long paramLong2, String paramString3, String paramString4, String paramString5, MostRecentGameInfoEntity paramMostRecentGameInfoEntity, PlayerLevelInfo paramPlayerLevelInfo, boolean paramBoolean1, boolean paramBoolean2, String paramString6, String paramString7, Uri paramUri3, String paramString8, Uri paramUri4, String paramString9, long paramLong3, zzt paramzzt, zza paramzza, boolean paramBoolean3)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramUri1;
    this.zzh = paramString3;
    this.zzd = paramUri2;
    this.zzi = paramString4;
    this.zze = paramLong1;
    this.zzf = paramInt;
    this.zzg = paramLong2;
    this.zzj = paramString5;
    this.zzm = paramBoolean1;
    this.zzk = paramMostRecentGameInfoEntity;
    this.zzl = paramPlayerLevelInfo;
    this.zzn = paramBoolean2;
    this.zzo = paramString6;
    this.zzp = paramString7;
    this.zzq = paramUri3;
    this.zzr = paramString8;
    this.zzs = paramUri4;
    this.zzt = paramString9;
    this.zzu = paramLong3;
    this.zzv = paramzzt;
    this.zzw = paramzza;
    this.zzx = paramBoolean3;
  }
  
  static int zzi(Player paramPlayer)
  {
    return Objects.hashCode(new Object[] { paramPlayer.getPlayerId(), paramPlayer.getDisplayName(), Boolean.valueOf(paramPlayer.zzf()), paramPlayer.getIconImageUri(), paramPlayer.getHiResImageUri(), Long.valueOf(paramPlayer.getRetrievedTimestamp()), paramPlayer.getTitle(), paramPlayer.getLevelInfo(), paramPlayer.zzd(), paramPlayer.zze(), paramPlayer.getBannerImageLandscapeUri(), paramPlayer.getBannerImagePortraitUri(), Long.valueOf(paramPlayer.zzb()), paramPlayer.getRelationshipInfo(), paramPlayer.getCurrentPlayerInfo(), Boolean.valueOf(paramPlayer.zzg()) });
  }
  
  static String zzk(Player paramPlayer)
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(paramPlayer).add("PlayerId", paramPlayer.getPlayerId()).add("DisplayName", paramPlayer.getDisplayName()).add("HasDebugAccess", Boolean.valueOf(paramPlayer.zzf())).add("IconImageUri", paramPlayer.getIconImageUri()).add("IconImageUrl", paramPlayer.getIconImageUrl()).add("HiResImageUri", paramPlayer.getHiResImageUri()).add("HiResImageUrl", paramPlayer.getHiResImageUrl()).add("RetrievedTimestamp", Long.valueOf(paramPlayer.getRetrievedTimestamp())).add("Title", paramPlayer.getTitle()).add("LevelInfo", paramPlayer.getLevelInfo()).add("GamerTag", paramPlayer.zzd()).add("Name", paramPlayer.zze()).add("BannerImageLandscapeUri", paramPlayer.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", paramPlayer.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", paramPlayer.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", paramPlayer.getBannerImagePortraitUrl()).add("CurrentPlayerInfo", paramPlayer.getCurrentPlayerInfo()).add("TotalUnlockedAchievement", Long.valueOf(paramPlayer.zzb()));
    if (paramPlayer.zzg()) {
      localToStringHelper.add("AlwaysAutoSignIn", Boolean.valueOf(paramPlayer.zzg()));
    }
    if (paramPlayer.getRelationshipInfo() != null) {
      localToStringHelper.add("RelationshipInfo", paramPlayer.getRelationshipInfo());
    }
    return localToStringHelper.toString();
  }
  
  static boolean zzn(Player paramPlayer, Object paramObject)
  {
    if (!(paramObject instanceof Player)) {
      return false;
    }
    if (paramPlayer == paramObject) {
      return true;
    }
    paramObject = (Player)paramObject;
    return (Objects.equal(((Player)paramObject).getPlayerId(), paramPlayer.getPlayerId())) && (Objects.equal(((Player)paramObject).getDisplayName(), paramPlayer.getDisplayName())) && (Objects.equal(Boolean.valueOf(((Player)paramObject).zzf()), Boolean.valueOf(paramPlayer.zzf()))) && (Objects.equal(((Player)paramObject).getIconImageUri(), paramPlayer.getIconImageUri())) && (Objects.equal(((Player)paramObject).getHiResImageUri(), paramPlayer.getHiResImageUri())) && (Objects.equal(Long.valueOf(((Player)paramObject).getRetrievedTimestamp()), Long.valueOf(paramPlayer.getRetrievedTimestamp()))) && (Objects.equal(((Player)paramObject).getTitle(), paramPlayer.getTitle())) && (Objects.equal(((Player)paramObject).getLevelInfo(), paramPlayer.getLevelInfo())) && (Objects.equal(((Player)paramObject).zzd(), paramPlayer.zzd())) && (Objects.equal(((Player)paramObject).zze(), paramPlayer.zze())) && (Objects.equal(((Player)paramObject).getBannerImageLandscapeUri(), paramPlayer.getBannerImageLandscapeUri())) && (Objects.equal(((Player)paramObject).getBannerImagePortraitUri(), paramPlayer.getBannerImagePortraitUri())) && (Objects.equal(Long.valueOf(((Player)paramObject).zzb()), Long.valueOf(paramPlayer.zzb()))) && (Objects.equal(((Player)paramObject).getCurrentPlayerInfo(), paramPlayer.getCurrentPlayerInfo())) && (Objects.equal(((Player)paramObject).getRelationshipInfo(), paramPlayer.getRelationshipInfo())) && (Objects.equal(Boolean.valueOf(((Player)paramObject).zzg()), Boolean.valueOf(paramPlayer.zzg())));
  }
  
  public boolean equals(Object paramObject)
  {
    return zzn(this, paramObject);
  }
  
  public Player freeze()
  {
    return this;
  }
  
  public Uri getBannerImageLandscapeUri()
  {
    return this.zzq;
  }
  
  public String getBannerImageLandscapeUrl()
  {
    return this.zzr;
  }
  
  public Uri getBannerImagePortraitUri()
  {
    return this.zzs;
  }
  
  public String getBannerImagePortraitUrl()
  {
    return this.zzt;
  }
  
  public CurrentPlayerInfo getCurrentPlayerInfo()
  {
    return this.zzw;
  }
  
  public String getDisplayName()
  {
    return this.zzb;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzb, paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    return this.zzd;
  }
  
  public String getHiResImageUrl()
  {
    return this.zzi;
  }
  
  public Uri getIconImageUri()
  {
    return this.zzc;
  }
  
  public String getIconImageUrl()
  {
    return this.zzh;
  }
  
  public long getLastPlayedWithTimestamp()
  {
    return this.zzg;
  }
  
  public PlayerLevelInfo getLevelInfo()
  {
    return this.zzl;
  }
  
  public String getPlayerId()
  {
    return this.zza;
  }
  
  public PlayerRelationshipInfo getRelationshipInfo()
  {
    return this.zzv;
  }
  
  public long getRetrievedTimestamp()
  {
    return this.zze;
  }
  
  public String getTitle()
  {
    return this.zzj;
  }
  
  public void getTitle(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzj, paramCharArrayBuffer);
  }
  
  public boolean hasHiResImage()
  {
    return getHiResImageUri() != null;
  }
  
  public boolean hasIconImage()
  {
    return getIconImageUri() != null;
  }
  
  public int hashCode()
  {
    return zzi(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzk(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!shouldDowngrade())
    {
      int i = SafeParcelWriter.beginObjectHeader(paramParcel);
      SafeParcelWriter.writeString(paramParcel, 1, getPlayerId(), false);
      SafeParcelWriter.writeString(paramParcel, 2, getDisplayName(), false);
      SafeParcelWriter.writeParcelable(paramParcel, 3, getIconImageUri(), paramInt, false);
      SafeParcelWriter.writeParcelable(paramParcel, 4, getHiResImageUri(), paramInt, false);
      SafeParcelWriter.writeLong(paramParcel, 5, getRetrievedTimestamp());
      SafeParcelWriter.writeInt(paramParcel, 6, this.zzf);
      SafeParcelWriter.writeLong(paramParcel, 7, getLastPlayedWithTimestamp());
      SafeParcelWriter.writeString(paramParcel, 8, getIconImageUrl(), false);
      SafeParcelWriter.writeString(paramParcel, 9, getHiResImageUrl(), false);
      SafeParcelWriter.writeString(paramParcel, 14, getTitle(), false);
      SafeParcelWriter.writeParcelable(paramParcel, 15, this.zzk, paramInt, false);
      SafeParcelWriter.writeParcelable(paramParcel, 16, getLevelInfo(), paramInt, false);
      SafeParcelWriter.writeBoolean(paramParcel, 18, this.zzm);
      SafeParcelWriter.writeBoolean(paramParcel, 19, this.zzn);
      SafeParcelWriter.writeString(paramParcel, 20, this.zzo, false);
      SafeParcelWriter.writeString(paramParcel, 21, this.zzp, false);
      SafeParcelWriter.writeParcelable(paramParcel, 22, getBannerImageLandscapeUri(), paramInt, false);
      SafeParcelWriter.writeString(paramParcel, 23, getBannerImageLandscapeUrl(), false);
      SafeParcelWriter.writeParcelable(paramParcel, 24, getBannerImagePortraitUri(), paramInt, false);
      SafeParcelWriter.writeString(paramParcel, 25, getBannerImagePortraitUrl(), false);
      SafeParcelWriter.writeLong(paramParcel, 29, this.zzu);
      SafeParcelWriter.writeParcelable(paramParcel, 33, getRelationshipInfo(), paramInt, false);
      SafeParcelWriter.writeParcelable(paramParcel, 35, getCurrentPlayerInfo(), paramInt, false);
      SafeParcelWriter.writeBoolean(paramParcel, 36, this.zzx);
      SafeParcelWriter.finishObjectHeader(paramParcel, i);
      return;
    }
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
    Object localObject1 = this.zzc;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
    localObject1 = this.zzd;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
    paramParcel.writeLong(this.zze);
  }
  
  public final int zza()
  {
    return this.zzf;
  }
  
  public final long zzb()
  {
    return this.zzu;
  }
  
  public final com.google.android.gms.games.internal.player.zza zzc()
  {
    return this.zzk;
  }
  
  public final String zzd()
  {
    return this.zzo;
  }
  
  public final String zze()
  {
    return this.zzp;
  }
  
  public final boolean zzf()
  {
    return this.zzn;
  }
  
  public final boolean zzg()
  {
    return this.zzx;
  }
  
  public final boolean zzh()
  {
    return this.zzm;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayerEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */