package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfl;

public final class VideoOptions
{
  private final boolean zza;
  private final boolean zzb;
  private final boolean zzc;
  
  public VideoOptions(zzfl paramzzfl)
  {
    this.zza = paramzzfl.zza;
    this.zzb = paramzzfl.zzb;
    this.zzc = paramzzfl.zzc;
  }
  
  public boolean getClickToExpandRequested()
  {
    return this.zzc;
  }
  
  public boolean getCustomControlsRequested()
  {
    return this.zzb;
  }
  
  public boolean getStartMuted()
  {
    return this.zza;
  }
  
  public static final class Builder
  {
    private boolean zza = true;
    private boolean zzb = false;
    private boolean zzc = false;
    
    public VideoOptions build()
    {
      return new VideoOptions(this, null);
    }
    
    public Builder setClickToExpandRequested(boolean paramBoolean)
    {
      this.zzc = paramBoolean;
      return this;
    }
    
    public Builder setCustomControlsRequested(boolean paramBoolean)
    {
      this.zzb = paramBoolean;
      return this;
    }
    
    public Builder setStartMuted(boolean paramBoolean)
    {
      this.zza = paramBoolean;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\VideoOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */