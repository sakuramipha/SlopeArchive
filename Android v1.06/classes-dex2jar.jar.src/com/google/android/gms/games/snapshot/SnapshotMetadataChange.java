package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public abstract interface SnapshotMetadataChange
{
  public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();
  
  public abstract Bitmap getCoverImage();
  
  public abstract String getDescription();
  
  public abstract Long getPlayedTimeMillis();
  
  public abstract Long getProgressValue();
  
  public abstract BitmapTeleporter zza();
  
  public static final class Builder
  {
    private String zza;
    private Long zzb;
    private Long zzc;
    private BitmapTeleporter zzd;
    private Uri zze;
    
    public SnapshotMetadataChange build()
    {
      return new SnapshotMetadataChangeEntity(this.zza, this.zzb, this.zzd, this.zze, this.zzc);
    }
    
    public Builder fromMetadata(SnapshotMetadata paramSnapshotMetadata)
    {
      this.zza = paramSnapshotMetadata.getDescription();
      this.zzb = Long.valueOf(paramSnapshotMetadata.getPlayedTime());
      this.zzc = Long.valueOf(paramSnapshotMetadata.getProgressValue());
      if (this.zzb.longValue() == -1L) {
        this.zzb = null;
      }
      paramSnapshotMetadata = paramSnapshotMetadata.getCoverImageUri();
      this.zze = paramSnapshotMetadata;
      if (paramSnapshotMetadata != null) {
        this.zzd = null;
      }
      return this;
    }
    
    public Builder setCoverImage(Bitmap paramBitmap)
    {
      this.zzd = new BitmapTeleporter(paramBitmap);
      this.zze = null;
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      this.zza = paramString;
      return this;
    }
    
    public Builder setPlayedTimeMillis(long paramLong)
    {
      this.zzb = Long.valueOf(paramLong);
      return this;
    }
    
    public Builder setProgressValue(long paramLong)
    {
      this.zzc = Long.valueOf(paramLong);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataChange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */