package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzh;

public final class SnapshotMetadataEntity
  extends zzh
  implements SnapshotMetadata
{
  public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new zzd();
  private final GameEntity zza;
  private final PlayerEntity zzb;
  private final String zzc;
  private final Uri zzd;
  private final String zze;
  private final String zzf;
  private final String zzg;
  private final long zzh;
  private final long zzi;
  private final float zzj;
  private final String zzk;
  private final boolean zzl;
  private final long zzm;
  private final String zzn;
  
  SnapshotMetadataEntity(GameEntity paramGameEntity, PlayerEntity paramPlayerEntity, String paramString1, Uri paramUri, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, float paramFloat, String paramString5, boolean paramBoolean, long paramLong3, String paramString6)
  {
    this.zza = paramGameEntity;
    this.zzb = paramPlayerEntity;
    this.zzc = paramString1;
    this.zzd = paramUri;
    this.zze = paramString2;
    this.zzj = paramFloat;
    this.zzf = paramString3;
    this.zzg = paramString4;
    this.zzh = paramLong1;
    this.zzi = paramLong2;
    this.zzk = paramString5;
    this.zzl = paramBoolean;
    this.zzm = paramLong3;
    this.zzn = paramString6;
  }
  
  public SnapshotMetadataEntity(SnapshotMetadata paramSnapshotMetadata)
  {
    this.zza = new GameEntity(paramSnapshotMetadata.getGame());
    this.zzb = localPlayerEntity;
    this.zzc = paramSnapshotMetadata.getSnapshotId();
    this.zzd = paramSnapshotMetadata.getCoverImageUri();
    this.zze = paramSnapshotMetadata.getCoverImageUrl();
    this.zzj = paramSnapshotMetadata.getCoverImageAspectRatio();
    this.zzf = paramSnapshotMetadata.zza();
    this.zzg = paramSnapshotMetadata.getDescription();
    this.zzh = paramSnapshotMetadata.getLastModifiedTimestamp();
    this.zzi = paramSnapshotMetadata.getPlayedTime();
    this.zzk = paramSnapshotMetadata.getUniqueName();
    this.zzl = paramSnapshotMetadata.hasChangePending();
    this.zzm = paramSnapshotMetadata.getProgressValue();
    this.zzn = paramSnapshotMetadata.getDeviceName();
  }
  
  static int zzb(SnapshotMetadata paramSnapshotMetadata)
  {
    return Objects.hashCode(new Object[] { paramSnapshotMetadata.getGame(), paramSnapshotMetadata.getOwner(), paramSnapshotMetadata.getSnapshotId(), paramSnapshotMetadata.getCoverImageUri(), Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio()), paramSnapshotMetadata.zza(), paramSnapshotMetadata.getDescription(), Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp()), Long.valueOf(paramSnapshotMetadata.getPlayedTime()), paramSnapshotMetadata.getUniqueName(), Boolean.valueOf(paramSnapshotMetadata.hasChangePending()), Long.valueOf(paramSnapshotMetadata.getProgressValue()), paramSnapshotMetadata.getDeviceName() });
  }
  
  static String zzc(SnapshotMetadata paramSnapshotMetadata)
  {
    return Objects.toStringHelper(paramSnapshotMetadata).add("Game", paramSnapshotMetadata.getGame()).add("Owner", paramSnapshotMetadata.getOwner()).add("SnapshotId", paramSnapshotMetadata.getSnapshotId()).add("CoverImageUri", paramSnapshotMetadata.getCoverImageUri()).add("CoverImageUrl", paramSnapshotMetadata.getCoverImageUrl()).add("CoverImageAspectRatio", Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio())).add("Description", paramSnapshotMetadata.getDescription()).add("LastModifiedTimestamp", Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp())).add("PlayedTime", Long.valueOf(paramSnapshotMetadata.getPlayedTime())).add("UniqueName", paramSnapshotMetadata.getUniqueName()).add("ChangePending", Boolean.valueOf(paramSnapshotMetadata.hasChangePending())).add("ProgressValue", Long.valueOf(paramSnapshotMetadata.getProgressValue())).add("DeviceName", paramSnapshotMetadata.getDeviceName()).toString();
  }
  
  static boolean zzd(SnapshotMetadata paramSnapshotMetadata, Object paramObject)
  {
    if (!(paramObject instanceof SnapshotMetadata)) {
      return false;
    }
    if (paramSnapshotMetadata == paramObject) {
      return true;
    }
    paramObject = (SnapshotMetadata)paramObject;
    return (Objects.equal(((SnapshotMetadata)paramObject).getGame(), paramSnapshotMetadata.getGame())) && (Objects.equal(((SnapshotMetadata)paramObject).getOwner(), paramSnapshotMetadata.getOwner())) && (Objects.equal(((SnapshotMetadata)paramObject).getSnapshotId(), paramSnapshotMetadata.getSnapshotId())) && (Objects.equal(((SnapshotMetadata)paramObject).getCoverImageUri(), paramSnapshotMetadata.getCoverImageUri())) && (Objects.equal(Float.valueOf(((SnapshotMetadata)paramObject).getCoverImageAspectRatio()), Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio()))) && (Objects.equal(((SnapshotMetadata)paramObject).zza(), paramSnapshotMetadata.zza())) && (Objects.equal(((SnapshotMetadata)paramObject).getDescription(), paramSnapshotMetadata.getDescription())) && (Objects.equal(Long.valueOf(((SnapshotMetadata)paramObject).getLastModifiedTimestamp()), Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp()))) && (Objects.equal(Long.valueOf(((SnapshotMetadata)paramObject).getPlayedTime()), Long.valueOf(paramSnapshotMetadata.getPlayedTime()))) && (Objects.equal(((SnapshotMetadata)paramObject).getUniqueName(), paramSnapshotMetadata.getUniqueName())) && (Objects.equal(Boolean.valueOf(((SnapshotMetadata)paramObject).hasChangePending()), Boolean.valueOf(paramSnapshotMetadata.hasChangePending()))) && (Objects.equal(Long.valueOf(((SnapshotMetadata)paramObject).getProgressValue()), Long.valueOf(paramSnapshotMetadata.getProgressValue()))) && (Objects.equal(((SnapshotMetadata)paramObject).getDeviceName(), paramSnapshotMetadata.getDeviceName()));
  }
  
  public boolean equals(Object paramObject)
  {
    return zzd(this, paramObject);
  }
  
  public SnapshotMetadata freeze()
  {
    return this;
  }
  
  public float getCoverImageAspectRatio()
  {
    return this.zzj;
  }
  
  public Uri getCoverImageUri()
  {
    return this.zzd;
  }
  
  public String getCoverImageUrl()
  {
    return this.zze;
  }
  
  public String getDescription()
  {
    return this.zzg;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    DataUtils.copyStringToBuffer(this.zzg, paramCharArrayBuffer);
  }
  
  public String getDeviceName()
  {
    return this.zzn;
  }
  
  public Game getGame()
  {
    return this.zza;
  }
  
  public long getLastModifiedTimestamp()
  {
    return this.zzh;
  }
  
  public Player getOwner()
  {
    return this.zzb;
  }
  
  public long getPlayedTime()
  {
    return this.zzi;
  }
  
  public long getProgressValue()
  {
    return this.zzm;
  }
  
  public String getSnapshotId()
  {
    return this.zzc;
  }
  
  public String getUniqueName()
  {
    return this.zzk;
  }
  
  public boolean hasChangePending()
  {
    return this.zzl;
  }
  
  public int hashCode()
  {
    return zzb(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzc(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, getGame(), paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, getOwner(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 3, getSnapshotId(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, getCoverImageUri(), paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 6, getCoverImageUrl(), false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzf, false);
    SafeParcelWriter.writeString(paramParcel, 8, getDescription(), false);
    SafeParcelWriter.writeLong(paramParcel, 9, getLastModifiedTimestamp());
    SafeParcelWriter.writeLong(paramParcel, 10, getPlayedTime());
    SafeParcelWriter.writeFloat(paramParcel, 11, getCoverImageAspectRatio());
    SafeParcelWriter.writeString(paramParcel, 12, getUniqueName(), false);
    SafeParcelWriter.writeBoolean(paramParcel, 13, hasChangePending());
    SafeParcelWriter.writeLong(paramParcel, 14, getProgressValue());
    SafeParcelWriter.writeString(paramParcel, 15, getDeviceName(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zza()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */