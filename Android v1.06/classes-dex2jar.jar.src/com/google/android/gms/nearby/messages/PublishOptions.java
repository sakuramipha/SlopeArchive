package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Preconditions;

public final class PublishOptions
{
  public static final PublishOptions DEFAULT = new Builder().build();
  private final Strategy zza;
  private final PublishCallback zzb;
  
  public PublishCallback getCallback()
  {
    return this.zzb;
  }
  
  public Strategy getStrategy()
  {
    return this.zza;
  }
  
  public static class Builder
  {
    private Strategy zza = Strategy.DEFAULT;
    private PublishCallback zzb;
    
    public PublishOptions build()
    {
      return new PublishOptions(this.zza, this.zzb, null);
    }
    
    public Builder setCallback(PublishCallback paramPublishCallback)
    {
      this.zzb = ((PublishCallback)Preconditions.checkNotNull(paramPublishCallback));
      return this;
    }
    
    public Builder setStrategy(Strategy paramStrategy)
    {
      this.zza = ((Strategy)Preconditions.checkNotNull(paramStrategy));
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\PublishOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */