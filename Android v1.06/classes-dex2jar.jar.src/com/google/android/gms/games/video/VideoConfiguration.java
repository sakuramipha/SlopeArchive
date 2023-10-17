package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class VideoConfiguration
  extends AbstractSafeParcelable
{
  public static final int CAPTURE_MODE_FILE = 0;
  public static final int CAPTURE_MODE_STREAM = 1;
  public static final int CAPTURE_MODE_UNKNOWN = -1;
  public static final Parcelable.Creator<VideoConfiguration> CREATOR = new zzb();
  public static final int NUM_CAPTURE_MODE = 2;
  public static final int NUM_QUALITY_LEVEL = 4;
  public static final int QUALITY_LEVEL_FULLHD = 3;
  public static final int QUALITY_LEVEL_HD = 1;
  public static final int QUALITY_LEVEL_SD = 0;
  public static final int QUALITY_LEVEL_UNKNOWN = -1;
  public static final int QUALITY_LEVEL_XHD = 2;
  private final int zza;
  private final int zzb;
  private final boolean zzc;
  private final boolean zzd;
  private final boolean zze;
  
  public VideoConfiguration(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Preconditions.checkArgument(isValidQualityLevel(paramInt1, false));
    Preconditions.checkArgument(isValidCaptureMode(paramInt2, false));
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramBoolean1;
    this.zzd = paramBoolean2;
    this.zze = paramBoolean3;
  }
  
  public static boolean isValidCaptureMode(int paramInt, boolean paramBoolean)
  {
    if (paramInt != -1)
    {
      boolean bool = true;
      paramBoolean = bool;
      if (paramInt != 0)
      {
        paramBoolean = bool;
        if (paramInt != 1) {
          return false;
        }
      }
    }
    return paramBoolean;
  }
  
  public static boolean isValidQualityLevel(int paramInt, boolean paramBoolean)
  {
    if (paramInt != -1)
    {
      boolean bool = true;
      paramBoolean = bool;
      if (paramInt != 0)
      {
        paramBoolean = bool;
        if (paramInt != 1)
        {
          paramBoolean = bool;
          if (paramInt != 2)
          {
            paramBoolean = bool;
            if (paramInt != 3) {
              return false;
            }
          }
        }
      }
    }
    return paramBoolean;
  }
  
  public boolean getCameraEnabled()
  {
    return this.zzd;
  }
  
  public int getCaptureMode()
  {
    return this.zzb;
  }
  
  public boolean getMicEnabled()
  {
    return this.zze;
  }
  
  public int getQualityLevel()
  {
    return this.zza;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, getQualityLevel());
    SafeParcelWriter.writeInt(paramParcel, 2, getCaptureMode());
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 8, getCameraEnabled());
    SafeParcelWriter.writeBoolean(paramParcel, 9, getMicEnabled());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public static final class Builder
  {
    private int zza;
    private int zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    
    public Builder(int paramInt1, int paramInt2)
    {
      this.zza = paramInt1;
      this.zzb = paramInt2;
      this.zzd = true;
      this.zze = true;
      this.zzc = true;
    }
    
    public VideoConfiguration build()
    {
      return new VideoConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
    
    public Builder setCameraEnabled(boolean paramBoolean)
    {
      this.zzd = paramBoolean;
      return this;
    }
    
    public Builder setCaptureMode(int paramInt)
    {
      this.zzb = paramInt;
      return this;
    }
    
    public Builder setMicEnabled(boolean paramBoolean)
    {
      this.zze = paramBoolean;
      return this;
    }
    
    public Builder setQualityLevel(int paramInt)
    {
      this.zza = paramInt;
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ValidCaptureModes {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\video\VideoConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */