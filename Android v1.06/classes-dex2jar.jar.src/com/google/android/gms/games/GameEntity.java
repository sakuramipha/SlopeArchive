package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameEntity
  extends GamesDowngradeableSafeParcel
  implements Game
{
  public static final Parcelable.Creator<GameEntity> CREATOR = new zze();
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private final Uri zzg;
  private final Uri zzh;
  private final Uri zzi;
  private final boolean zzj;
  private final boolean zzk;
  private final String zzl;
  private final int zzm;
  private final int zzn;
  private final int zzo;
  private final boolean zzp;
  private final boolean zzq;
  private final String zzr;
  private final String zzs;
  private final String zzt;
  private final boolean zzu;
  private final boolean zzv;
  private final boolean zzw;
  private final String zzx;
  private final boolean zzy;
  
  public GameEntity(Game paramGame)
  {
    this.zza = paramGame.getApplicationId();
    this.zzc = paramGame.getPrimaryCategory();
    this.zzd = paramGame.getSecondaryCategory();
    this.zze = paramGame.getDescription();
    this.zzf = paramGame.getDeveloperName();
    this.zzb = paramGame.getDisplayName();
    this.zzg = paramGame.getIconImageUri();
    this.zzr = paramGame.getIconImageUrl();
    this.zzh = paramGame.getHiResImageUri();
    this.zzs = paramGame.getHiResImageUrl();
    this.zzi = paramGame.getFeaturedImageUri();
    this.zzt = paramGame.getFeaturedImageUrl();
    this.zzj = paramGame.zze();
    this.zzk = paramGame.zzc();
    this.zzl = paramGame.zza();
    this.zzm = 1;
    this.zzn = paramGame.getAchievementTotalCount();
    this.zzo = paramGame.getLeaderboardCount();
    this.zzp = paramGame.zzf();
    this.zzq = paramGame.zzg();
    this.zzu = paramGame.zzd();
    this.zzv = paramGame.zzb();
    this.zzw = paramGame.areSnapshotsEnabled();
    this.zzx = paramGame.getThemeColor();
    this.zzy = paramGame.hasGamepadSupport();
  }
  
  GameEntity(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean3, boolean paramBoolean4, String paramString8, String paramString9, String paramString10, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString11, boolean paramBoolean8)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramString4;
    this.zze = paramString5;
    this.zzf = paramString6;
    this.zzg = paramUri1;
    this.zzr = paramString8;
    this.zzh = paramUri2;
    this.zzs = paramString9;
    this.zzi = paramUri3;
    this.zzt = paramString10;
    this.zzj = paramBoolean1;
    this.zzk = paramBoolean2;
    this.zzl = paramString7;
    this.zzm = paramInt1;
    this.zzn = paramInt2;
    this.zzo = paramInt3;
    this.zzp = paramBoolean3;
    this.zzq = paramBoolean4;
    this.zzu = paramBoolean5;
    this.zzv = paramBoolean6;
    this.zzw = paramBoolean7;
    this.zzx = paramString11;
    this.zzy = paramBoolean8;
  }
  
  static int zzh(Game paramGame)
  {
    return Objects.hashCode(new Object[] { paramGame.getApplicationId(), paramGame.getDisplayName(), paramGame.getPrimaryCategory(), paramGame.getSecondaryCategory(), paramGame.getDescription(), paramGame.getDeveloperName(), paramGame.getIconImageUri(), paramGame.getHiResImageUri(), paramGame.getFeaturedImageUri(), Boolean.valueOf(paramGame.zze()), Boolean.valueOf(paramGame.zzc()), paramGame.zza(), Integer.valueOf(paramGame.getAchievementTotalCount()), Integer.valueOf(paramGame.getLeaderboardCount()), Boolean.valueOf(paramGame.zzf()), Boolean.valueOf(paramGame.zzg()), Boolean.valueOf(paramGame.zzd()), Boolean.valueOf(paramGame.zzb()), Boolean.valueOf(paramGame.areSnapshotsEnabled()), paramGame.getThemeColor(), Boolean.valueOf(paramGame.hasGamepadSupport()) });
  }
  
  static String zzj(Game paramGame)
  {
    return Objects.toStringHelper(paramGame).add("ApplicationId", paramGame.getApplicationId()).add("DisplayName", paramGame.getDisplayName()).add("PrimaryCategory", paramGame.getPrimaryCategory()).add("SecondaryCategory", paramGame.getSecondaryCategory()).add("Description", paramGame.getDescription()).add("DeveloperName", paramGame.getDeveloperName()).add("IconImageUri", paramGame.getIconImageUri()).add("IconImageUrl", paramGame.getIconImageUrl()).add("HiResImageUri", paramGame.getHiResImageUri()).add("HiResImageUrl", paramGame.getHiResImageUrl()).add("FeaturedImageUri", paramGame.getFeaturedImageUri()).add("FeaturedImageUrl", paramGame.getFeaturedImageUrl()).add("PlayEnabledGame", Boolean.valueOf(paramGame.zze())).add("InstanceInstalled", Boolean.valueOf(paramGame.zzc())).add("InstancePackageName", paramGame.zza()).add("AchievementTotalCount", Integer.valueOf(paramGame.getAchievementTotalCount())).add("LeaderboardCount", Integer.valueOf(paramGame.getLeaderboardCount())).add("AreSnapshotsEnabled", Boolean.valueOf(paramGame.areSnapshotsEnabled())).add("ThemeColor", paramGame.getThemeColor()).add("HasGamepadSupport", Boolean.valueOf(paramGame.hasGamepadSupport())).toString();
  }
  
  static boolean zzm(Game paramGame, Object paramObject)
  {
    if (!(paramObject instanceof Game)) {
      return false;
    }
    if (paramGame == paramObject) {
      return true;
    }
    paramObject = (Game)paramObject;
    return (Objects.equal(((Game)paramObject).getApplicationId(), paramGame.getApplicationId())) && (Objects.equal(((Game)paramObject).getDisplayName(), paramGame.getDisplayName())) && (Objects.equal(((Game)paramObject).getPrimaryCategory(), paramGame.getPrimaryCategory())) && (Objects.equal(((Game)paramObject).getSecondaryCategory(), paramGame.getSecondaryCategory())) && (Objects.equal(((Game)paramObject).getDescription(), paramGame.getDescription())) && (Objects.equal(((Game)paramObject).getDeveloperName(), paramGame.getDeveloperName())) && (Objects.equal(((Game)paramObject).getIconImageUri(), paramGame.getIconImageUri())) && (Objects.equal(((Game)paramObject).getHiResImageUri(), paramGame.getHiResImageUri())) && (Objects.equal(((Game)paramObject).getFeaturedImageUri(), paramGame.getFeaturedImageUri())) && (Objects.equal(Boolean.valueOf(((Game)paramObject).zze()), Boolean.valueOf(paramGame.zze()))) && (Objects.equal(Boolean.valueOf(((Game)paramObject).zzc()), Boolean.valueOf(paramGame.zzc()))) && (Objects.equal(((Game)paramObject).zza(), paramGame.zza())) && (Objects.equal(Integer.valueOf(((Game)paramObject).getAchievementTotalCount()), Integer.valueOf(paramGame.getAchievementTotalCount()))) && (Objects.equal(Integer.valueOf(((Game)paramObject).getLeaderboardCount()), Integer.valueOf(paramGame.getLeaderboardCount()))) && (Objects.equal(Boolean.valueOf(((Game)paramObject).zzf()), Boolean.valueOf(paramGame.zzf()))) && (Objects.equal(Boolean.valueOf(((Game)paramObject).zzg()), Boolean.valueOf(paramGame.zzg()))) && (Objects.equal(Boolean.valueOf(((Game)paramObject).zzd()), Boolean.valueOf(paramGame.zzd()))) && (Objects.equal(Boolean.valueOf(((Game)paramObject).zzb()), Boolean.valueOf(paramGame.zzb()))) && (Objects.equal(Boolean.valueOf(((Game)paramObject).areSnapshotsEnabled()), Boolean.valueOf(paramGame.areSnapshotsEnabled()))) && (Objects.equal(((Game)paramObject).getThemeColor(), paramGame.getThemeColor())) && (Objects.equal(Boolean.valueOf(((Game)paramObject).hasGamepadSupport()), Boolean.valueOf(paramGame.hasGamepadSupport())));
  }
  
  public boolean areSnapshotsEnabled()
  {
    return this.zzw;
  }
  
  public boolean equals(Object paramObject)
  {
    return zzm(this, paramObject);
  }
  
  public Game freeze()
  {
    return this;
  }
  
  public int getAchievementTotalCount()
  {
    return this.zzn;
  }
  
  public String getApplicationId()
  {
    return this.zza;
  }
  
  public String getDescription()
  {
    return this.zze;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zze, paramCharArrayBuffer);
  }
  
  public String getDeveloperName()
  {
    return this.zzf;
  }
  
  public void getDeveloperName(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzf, paramCharArrayBuffer);
  }
  
  public String getDisplayName()
  {
    return this.zzb;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzb, paramCharArrayBuffer);
  }
  
  public Uri getFeaturedImageUri()
  {
    return this.zzi;
  }
  
  public String getFeaturedImageUrl()
  {
    return this.zzt;
  }
  
  public Uri getHiResImageUri()
  {
    return this.zzh;
  }
  
  public String getHiResImageUrl()
  {
    return this.zzs;
  }
  
  public Uri getIconImageUri()
  {
    return this.zzg;
  }
  
  public String getIconImageUrl()
  {
    return this.zzr;
  }
  
  public int getLeaderboardCount()
  {
    return this.zzo;
  }
  
  public String getPrimaryCategory()
  {
    return this.zzc;
  }
  
  public String getSecondaryCategory()
  {
    return this.zzd;
  }
  
  public String getThemeColor()
  {
    return this.zzx;
  }
  
  public boolean hasGamepadSupport()
  {
    return this.zzy;
  }
  
  public int hashCode()
  {
    return zzh(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzj(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!shouldDowngrade())
    {
      int i = SafeParcelWriter.beginObjectHeader(paramParcel);
      SafeParcelWriter.writeString(paramParcel, 1, getApplicationId(), false);
      SafeParcelWriter.writeString(paramParcel, 2, getDisplayName(), false);
      SafeParcelWriter.writeString(paramParcel, 3, getPrimaryCategory(), false);
      SafeParcelWriter.writeString(paramParcel, 4, getSecondaryCategory(), false);
      SafeParcelWriter.writeString(paramParcel, 5, getDescription(), false);
      SafeParcelWriter.writeString(paramParcel, 6, getDeveloperName(), false);
      SafeParcelWriter.writeParcelable(paramParcel, 7, getIconImageUri(), paramInt, false);
      SafeParcelWriter.writeParcelable(paramParcel, 8, getHiResImageUri(), paramInt, false);
      SafeParcelWriter.writeParcelable(paramParcel, 9, getFeaturedImageUri(), paramInt, false);
      SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzj);
      SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzk);
      SafeParcelWriter.writeString(paramParcel, 12, this.zzl, false);
      SafeParcelWriter.writeInt(paramParcel, 13, this.zzm);
      SafeParcelWriter.writeInt(paramParcel, 14, getAchievementTotalCount());
      SafeParcelWriter.writeInt(paramParcel, 15, getLeaderboardCount());
      SafeParcelWriter.writeBoolean(paramParcel, 16, this.zzp);
      SafeParcelWriter.writeBoolean(paramParcel, 17, this.zzq);
      SafeParcelWriter.writeString(paramParcel, 18, getIconImageUrl(), false);
      SafeParcelWriter.writeString(paramParcel, 19, getHiResImageUrl(), false);
      SafeParcelWriter.writeString(paramParcel, 20, getFeaturedImageUrl(), false);
      SafeParcelWriter.writeBoolean(paramParcel, 21, this.zzu);
      SafeParcelWriter.writeBoolean(paramParcel, 22, this.zzv);
      SafeParcelWriter.writeBoolean(paramParcel, 23, areSnapshotsEnabled());
      SafeParcelWriter.writeString(paramParcel, 24, getThemeColor(), false);
      SafeParcelWriter.writeBoolean(paramParcel, 25, hasGamepadSupport());
      SafeParcelWriter.finishObjectHeader(paramParcel, i);
      return;
    }
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeString(this.zzc);
    paramParcel.writeString(this.zzd);
    paramParcel.writeString(this.zze);
    paramParcel.writeString(this.zzf);
    Object localObject1 = this.zzg;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
    localObject1 = this.zzh;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
    localObject1 = this.zzi;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((Uri)localObject1).toString();
    }
    paramParcel.writeString((String)localObject1);
    paramParcel.writeInt(this.zzj);
    paramParcel.writeInt(this.zzk);
    paramParcel.writeString(this.zzl);
    paramParcel.writeInt(this.zzm);
    paramParcel.writeInt(this.zzn);
    paramParcel.writeInt(this.zzo);
  }
  
  public final String zza()
  {
    return this.zzl;
  }
  
  public final boolean zzb()
  {
    return this.zzv;
  }
  
  public final boolean zzc()
  {
    return this.zzk;
  }
  
  public final boolean zzd()
  {
    return this.zzu;
  }
  
  public final boolean zze()
  {
    return this.zzj;
  }
  
  public final boolean zzf()
  {
    return this.zzp;
  }
  
  public final boolean zzg()
  {
    return this.zzq;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GameEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */