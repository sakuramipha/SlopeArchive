package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Preconditions;

public final class SubscribeOptions
{
  public static final SubscribeOptions DEFAULT = new Builder().build();
  public final boolean zza;
  public final int zzb;
  private final Strategy zzc;
  private final MessageFilter zzd;
  private final SubscribeCallback zze;
  
  public SubscribeCallback getCallback()
  {
    return this.zze;
  }
  
  public MessageFilter getFilter()
  {
    return this.zzd;
  }
  
  public Strategy getStrategy()
  {
    return this.zzc;
  }
  
  public String toString()
  {
    String str1 = String.valueOf(this.zzc);
    String str2 = String.valueOf(this.zzd);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 36 + String.valueOf(str2).length());
    localStringBuilder.append("SubscribeOptions{strategy=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", filter=");
    localStringBuilder.append(str2);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class Builder
  {
    private Strategy zza = Strategy.DEFAULT;
    private MessageFilter zzb = MessageFilter.INCLUDE_ALL_MY_TYPES;
    private SubscribeCallback zzc;
    
    public SubscribeOptions build()
    {
      return new SubscribeOptions(this.zza, this.zzb, this.zzc, false, 0, null);
    }
    
    public Builder setCallback(SubscribeCallback paramSubscribeCallback)
    {
      this.zzc = ((SubscribeCallback)Preconditions.checkNotNull(paramSubscribeCallback));
      return this;
    }
    
    public Builder setFilter(MessageFilter paramMessageFilter)
    {
      this.zzb = paramMessageFilter;
      return this;
    }
    
    public Builder setStrategy(Strategy paramStrategy)
    {
      this.zza = paramStrategy;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\SubscribeOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */