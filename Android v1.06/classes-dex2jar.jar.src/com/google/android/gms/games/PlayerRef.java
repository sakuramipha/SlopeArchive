package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.zza;
import com.google.android.gms.games.internal.player.zzd;

public final class PlayerRef
  extends zzo
  implements Player
{
  private final zzd zza;
  private final PlayerLevelInfo zzb;
  private final com.google.android.gms.games.internal.player.zzc zzc;
  private final zzv zzd;
  private final zzc zze;
  
  public PlayerRef(DataHolder paramDataHolder, int paramInt, String paramString)
  {
    super(paramDataHolder, paramInt);
    zzd localzzd = new zzd(null);
    this.zza = localzzd;
    this.zzc = new com.google.android.gms.games.internal.player.zzc(paramDataHolder, paramInt, localzzd);
    this.zzd = new zzv(paramDataHolder, paramInt, localzzd);
    this.zze = new zzc(paramDataHolder, paramInt, localzzd);
    if ((!hasNull(localzzd.zzj)) && (getLong(localzzd.zzj) != -1L))
    {
      paramInt = getInteger(localzzd.zzk);
      int i = getInteger(localzzd.zzn);
      paramString = new PlayerLevel(paramInt, getLong(localzzd.zzl), getLong(localzzd.zzm));
      if (paramInt != i) {
        paramDataHolder = new PlayerLevel(i, getLong(localzzd.zzm), getLong(localzzd.zzo));
      } else {
        paramDataHolder = paramString;
      }
      this.zzb = new PlayerLevelInfo(getLong(localzzd.zzj), getLong(localzzd.zzp), paramString, paramDataHolder);
      return;
    }
    this.zzb = null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return PlayerEntity.zzn(this, paramObject);
  }
  
  public final Uri getBannerImageLandscapeUri()
  {
    return parseUri(this.zza.zzB);
  }
  
  public String getBannerImageLandscapeUrl()
  {
    return getString(this.zza.zzC);
  }
  
  public final Uri getBannerImagePortraitUri()
  {
    return parseUri(this.zza.zzD);
  }
  
  public String getBannerImagePortraitUrl()
  {
    return getString(this.zza.zzE);
  }
  
  public final CurrentPlayerInfo getCurrentPlayerInfo()
  {
    if (this.zze.zza()) {
      return this.zze;
    }
    return null;
  }
  
  public final String getDisplayName()
  {
    return getString(this.zza.zzb);
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer(this.zza.zzb, paramCharArrayBuffer);
  }
  
  public final Uri getHiResImageUri()
  {
    return parseUri(this.zza.zze);
  }
  
  public String getHiResImageUrl()
  {
    return getString(this.zza.zzf);
  }
  
  public final Uri getIconImageUri()
  {
    return parseUri(this.zza.zzc);
  }
  
  public String getIconImageUrl()
  {
    return getString(this.zza.zzd);
  }
  
  public final long getLastPlayedWithTimestamp()
  {
    if ((hasColumn(this.zza.zzi)) && (!hasNull(this.zza.zzi))) {
      return getLong(this.zza.zzi);
    }
    return -1L;
  }
  
  public final PlayerLevelInfo getLevelInfo()
  {
    return this.zzb;
  }
  
  public final String getPlayerId()
  {
    return getString(this.zza.zza);
  }
  
  public final PlayerRelationshipInfo getRelationshipInfo()
  {
    zzv localzzv = this.zzd;
    if ((localzzv.getFriendStatus() == -1) && (localzzv.zzb() == null) && (localzzv.zza() == null)) {
      return null;
    }
    return this.zzd;
  }
  
  public final long getRetrievedTimestamp()
  {
    return getLong(this.zza.zzg);
  }
  
  public final String getTitle()
  {
    return getString(this.zza.zzq);
  }
  
  public final void getTitle(CharArrayBuffer paramCharArrayBuffer)
  {
    copyToBuffer(this.zza.zzq, paramCharArrayBuffer);
  }
  
  public final boolean hasHiResImage()
  {
    return getHiResImageUri() != null;
  }
  
  public final boolean hasIconImage()
  {
    return getIconImageUri() != null;
  }
  
  public final int hashCode()
  {
    return PlayerEntity.zzi(this);
  }
  
  public final String toString()
  {
    return PlayerEntity.zzk(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new PlayerEntity(this).writeToParcel(paramParcel, paramInt);
  }
  
  public final int zza()
  {
    return getInteger(this.zza.zzh);
  }
  
  public final long zzb()
  {
    String str = this.zza.zzF;
    if ((hasColumn(str)) && (!hasNull(str))) {
      return getLong(str);
    }
    return -1L;
  }
  
  public final zza zzc()
  {
    if (hasNull(this.zza.zzs)) {
      return null;
    }
    return this.zzc;
  }
  
  public final String zzd()
  {
    return getString(this.zza.zzz);
  }
  
  public final String zze()
  {
    return getString(this.zza.zzA);
  }
  
  public final boolean zzf()
  {
    return getBoolean(this.zza.zzy);
  }
  
  public final boolean zzg()
  {
    return (hasColumn(this.zza.zzL)) && (getBoolean(this.zza.zzL));
  }
  
  public final boolean zzh()
  {
    return getBoolean(this.zza.zzr);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayerRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */