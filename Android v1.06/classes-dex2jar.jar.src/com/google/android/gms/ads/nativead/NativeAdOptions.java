package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
import java.lang.annotation.Annotation;

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
  public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
  public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
  public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
  public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
  private final boolean zza;
  private final int zzb;
  private final boolean zzc;
  private final int zzd;
  private final VideoOptions zze;
  private final boolean zzf;
  private final boolean zzg;
  private final int zzh;
  
  public int getAdChoicesPlacement()
  {
    return this.zzd;
  }
  
  public int getMediaAspectRatio()
  {
    return this.zzb;
  }
  
  public VideoOptions getVideoOptions()
  {
    return this.zze;
  }
  
  public boolean shouldRequestMultipleImages()
  {
    return this.zzc;
  }
  
  public boolean shouldReturnUrlsForImageAssets()
  {
    return this.zza;
  }
  
  public final int zza()
  {
    return this.zzh;
  }
  
  public final boolean zzb()
  {
    return this.zzg;
  }
  
  public final boolean zzc()
  {
    return this.zzf;
  }
  
  public static @interface AdChoicesPlacement {}
  
  public static final class Builder
  {
    private boolean zza = false;
    private int zzb = 0;
    private boolean zzc = false;
    private VideoOptions zzd;
    private int zze = 1;
    private boolean zzf = false;
    private boolean zzg = false;
    private int zzh = 0;
    
    public NativeAdOptions build()
    {
      return new NativeAdOptions(this, null);
    }
    
    public Builder enableCustomClickGestureDirection(int paramInt, boolean paramBoolean)
    {
      this.zzg = paramBoolean;
      this.zzh = paramInt;
      return this;
    }
    
    public Builder setAdChoicesPlacement(int paramInt)
    {
      this.zze = paramInt;
      return this;
    }
    
    public Builder setMediaAspectRatio(int paramInt)
    {
      this.zzb = paramInt;
      return this;
    }
    
    public Builder setRequestCustomMuteThisAd(boolean paramBoolean)
    {
      this.zzf = paramBoolean;
      return this;
    }
    
    public Builder setRequestMultipleImages(boolean paramBoolean)
    {
      this.zzc = paramBoolean;
      return this;
    }
    
    public Builder setReturnUrlsForImageAssets(boolean paramBoolean)
    {
      this.zza = paramBoolean;
      return this;
    }
    
    public Builder setVideoOptions(VideoOptions paramVideoOptions)
    {
      this.zzd = paramVideoOptions;
      return this;
    }
  }
  
  public static @interface NativeMediaAspectRatio {}
  
  public static @interface SwipeGestureDirection {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nativead\NativeAdOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */