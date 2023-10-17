package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import java.lang.annotation.Annotation;

@Deprecated
public final class NativeAdOptions
{
  public static final int ADCHOICES_BOTTOM_LEFT = 3;
  public static final int ADCHOICES_BOTTOM_RIGHT = 2;
  public static final int ADCHOICES_TOP_LEFT = 0;
  public static final int ADCHOICES_TOP_RIGHT = 1;
  public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
  public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
  public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
  public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
  public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
  @Deprecated
  public static final int ORIENTATION_ANY = 0;
  @Deprecated
  public static final int ORIENTATION_LANDSCAPE = 2;
  @Deprecated
  public static final int ORIENTATION_PORTRAIT = 1;
  private final boolean zza;
  private final int zzb;
  private final int zzc;
  private final boolean zzd;
  private final int zze;
  private final VideoOptions zzf;
  private final boolean zzg;
  
  public int getAdChoicesPlacement()
  {
    return this.zze;
  }
  
  @Deprecated
  public int getImageOrientation()
  {
    return this.zzb;
  }
  
  public int getMediaAspectRatio()
  {
    return this.zzc;
  }
  
  public VideoOptions getVideoOptions()
  {
    return this.zzf;
  }
  
  public boolean shouldRequestMultipleImages()
  {
    return this.zzd;
  }
  
  public boolean shouldReturnUrlsForImageAssets()
  {
    return this.zza;
  }
  
  public final boolean zza()
  {
    return this.zzg;
  }
  
  public static @interface AdChoicesPlacement {}
  
  public static final class Builder
  {
    private boolean zza = false;
    private int zzb = -1;
    private int zzc = 0;
    private boolean zzd = false;
    private VideoOptions zze;
    private int zzf = 1;
    private boolean zzg = false;
    
    public NativeAdOptions build()
    {
      return new NativeAdOptions(this, null);
    }
    
    public Builder setAdChoicesPlacement(int paramInt)
    {
      this.zzf = paramInt;
      return this;
    }
    
    @Deprecated
    public Builder setImageOrientation(int paramInt)
    {
      this.zzb = paramInt;
      return this;
    }
    
    public Builder setMediaAspectRatio(int paramInt)
    {
      this.zzc = paramInt;
      return this;
    }
    
    public Builder setRequestCustomMuteThisAd(boolean paramBoolean)
    {
      this.zzg = paramBoolean;
      return this;
    }
    
    public Builder setRequestMultipleImages(boolean paramBoolean)
    {
      this.zzd = paramBoolean;
      return this;
    }
    
    public Builder setReturnUrlsForImageAssets(boolean paramBoolean)
    {
      this.zza = paramBoolean;
      return this;
    }
    
    public Builder setVideoOptions(VideoOptions paramVideoOptions)
    {
      this.zze = paramVideoOptions;
      return this;
    }
  }
  
  public static @interface NativeMediaAspectRatio {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\NativeAdOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */