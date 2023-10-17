package androidx.work;

import android.net.Uri;
import android.os.Build.VERSION;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class Constraints
{
  public static final Constraints NONE = new Builder().build();
  private ContentUriTriggers mContentUriTriggers = new ContentUriTriggers();
  private NetworkType mRequiredNetworkType = NetworkType.NOT_REQUIRED;
  private boolean mRequiresBatteryNotLow;
  private boolean mRequiresCharging;
  private boolean mRequiresDeviceIdle;
  private boolean mRequiresStorageNotLow;
  private long mTriggerContentUpdateDelay = -1L;
  private long mTriggerMaxContentDelay = -1L;
  
  public Constraints() {}
  
  Constraints(Builder paramBuilder)
  {
    this.mRequiresCharging = paramBuilder.mRequiresCharging;
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 23) && (paramBuilder.mRequiresDeviceIdle)) {
      bool = true;
    } else {
      bool = false;
    }
    this.mRequiresDeviceIdle = bool;
    this.mRequiredNetworkType = paramBuilder.mRequiredNetworkType;
    this.mRequiresBatteryNotLow = paramBuilder.mRequiresBatteryNotLow;
    this.mRequiresStorageNotLow = paramBuilder.mRequiresStorageNotLow;
    if (Build.VERSION.SDK_INT >= 24)
    {
      this.mContentUriTriggers = paramBuilder.mContentUriTriggers;
      this.mTriggerContentUpdateDelay = paramBuilder.mTriggerContentUpdateDelay;
      this.mTriggerMaxContentDelay = paramBuilder.mTriggerContentMaxDelay;
    }
  }
  
  public Constraints(Constraints paramConstraints)
  {
    this.mRequiresCharging = paramConstraints.mRequiresCharging;
    this.mRequiresDeviceIdle = paramConstraints.mRequiresDeviceIdle;
    this.mRequiredNetworkType = paramConstraints.mRequiredNetworkType;
    this.mRequiresBatteryNotLow = paramConstraints.mRequiresBatteryNotLow;
    this.mRequiresStorageNotLow = paramConstraints.mRequiresStorageNotLow;
    this.mContentUriTriggers = paramConstraints.mContentUriTriggers;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (Constraints)paramObject;
      if (this.mRequiresCharging != ((Constraints)paramObject).mRequiresCharging) {
        return false;
      }
      if (this.mRequiresDeviceIdle != ((Constraints)paramObject).mRequiresDeviceIdle) {
        return false;
      }
      if (this.mRequiresBatteryNotLow != ((Constraints)paramObject).mRequiresBatteryNotLow) {
        return false;
      }
      if (this.mRequiresStorageNotLow != ((Constraints)paramObject).mRequiresStorageNotLow) {
        return false;
      }
      if (this.mTriggerContentUpdateDelay != ((Constraints)paramObject).mTriggerContentUpdateDelay) {
        return false;
      }
      if (this.mTriggerMaxContentDelay != ((Constraints)paramObject).mTriggerMaxContentDelay) {
        return false;
      }
      if (this.mRequiredNetworkType != ((Constraints)paramObject).mRequiredNetworkType) {
        return false;
      }
      return this.mContentUriTriggers.equals(((Constraints)paramObject).mContentUriTriggers);
    }
    return false;
  }
  
  public ContentUriTriggers getContentUriTriggers()
  {
    return this.mContentUriTriggers;
  }
  
  public NetworkType getRequiredNetworkType()
  {
    return this.mRequiredNetworkType;
  }
  
  public long getTriggerContentUpdateDelay()
  {
    return this.mTriggerContentUpdateDelay;
  }
  
  public long getTriggerMaxContentDelay()
  {
    return this.mTriggerMaxContentDelay;
  }
  
  public boolean hasContentUriTriggers()
  {
    boolean bool;
    if (this.mContentUriTriggers.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i1 = this.mRequiredNetworkType.hashCode();
    int n = this.mRequiresCharging;
    int i = this.mRequiresDeviceIdle;
    int j = this.mRequiresBatteryNotLow;
    int k = this.mRequiresStorageNotLow;
    long l = this.mTriggerContentUpdateDelay;
    int m = (int)(l ^ l >>> 32);
    l = this.mTriggerMaxContentDelay;
    return ((((((i1 * 31 + n) * 31 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + (int)(l ^ l >>> 32)) * 31 + this.mContentUriTriggers.hashCode();
  }
  
  public boolean requiresBatteryNotLow()
  {
    return this.mRequiresBatteryNotLow;
  }
  
  public boolean requiresCharging()
  {
    return this.mRequiresCharging;
  }
  
  public boolean requiresDeviceIdle()
  {
    return this.mRequiresDeviceIdle;
  }
  
  public boolean requiresStorageNotLow()
  {
    return this.mRequiresStorageNotLow;
  }
  
  public void setContentUriTriggers(ContentUriTriggers paramContentUriTriggers)
  {
    this.mContentUriTriggers = paramContentUriTriggers;
  }
  
  public void setRequiredNetworkType(NetworkType paramNetworkType)
  {
    this.mRequiredNetworkType = paramNetworkType;
  }
  
  public void setRequiresBatteryNotLow(boolean paramBoolean)
  {
    this.mRequiresBatteryNotLow = paramBoolean;
  }
  
  public void setRequiresCharging(boolean paramBoolean)
  {
    this.mRequiresCharging = paramBoolean;
  }
  
  public void setRequiresDeviceIdle(boolean paramBoolean)
  {
    this.mRequiresDeviceIdle = paramBoolean;
  }
  
  public void setRequiresStorageNotLow(boolean paramBoolean)
  {
    this.mRequiresStorageNotLow = paramBoolean;
  }
  
  public void setTriggerContentUpdateDelay(long paramLong)
  {
    this.mTriggerContentUpdateDelay = paramLong;
  }
  
  public void setTriggerMaxContentDelay(long paramLong)
  {
    this.mTriggerMaxContentDelay = paramLong;
  }
  
  public static final class Builder
  {
    ContentUriTriggers mContentUriTriggers;
    NetworkType mRequiredNetworkType;
    boolean mRequiresBatteryNotLow;
    boolean mRequiresCharging;
    boolean mRequiresDeviceIdle;
    boolean mRequiresStorageNotLow;
    long mTriggerContentMaxDelay;
    long mTriggerContentUpdateDelay;
    
    public Builder()
    {
      this.mRequiresCharging = false;
      this.mRequiresDeviceIdle = false;
      this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
      this.mRequiresBatteryNotLow = false;
      this.mRequiresStorageNotLow = false;
      this.mTriggerContentUpdateDelay = -1L;
      this.mTriggerContentMaxDelay = -1L;
      this.mContentUriTriggers = new ContentUriTriggers();
    }
    
    public Builder(Constraints paramConstraints)
    {
      boolean bool2 = false;
      this.mRequiresCharging = false;
      this.mRequiresDeviceIdle = false;
      this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
      this.mRequiresBatteryNotLow = false;
      this.mRequiresStorageNotLow = false;
      this.mTriggerContentUpdateDelay = -1L;
      this.mTriggerContentMaxDelay = -1L;
      this.mContentUriTriggers = new ContentUriTriggers();
      this.mRequiresCharging = paramConstraints.requiresCharging();
      boolean bool1 = bool2;
      if (Build.VERSION.SDK_INT >= 23)
      {
        bool1 = bool2;
        if (paramConstraints.requiresDeviceIdle()) {
          bool1 = true;
        }
      }
      this.mRequiresDeviceIdle = bool1;
      this.mRequiredNetworkType = paramConstraints.getRequiredNetworkType();
      this.mRequiresBatteryNotLow = paramConstraints.requiresBatteryNotLow();
      this.mRequiresStorageNotLow = paramConstraints.requiresStorageNotLow();
      if (Build.VERSION.SDK_INT >= 24)
      {
        this.mTriggerContentUpdateDelay = paramConstraints.getTriggerContentUpdateDelay();
        this.mTriggerContentMaxDelay = paramConstraints.getTriggerMaxContentDelay();
        this.mContentUriTriggers = paramConstraints.getContentUriTriggers();
      }
    }
    
    public Builder addContentUriTrigger(Uri paramUri, boolean paramBoolean)
    {
      this.mContentUriTriggers.add(paramUri, paramBoolean);
      return this;
    }
    
    public Constraints build()
    {
      return new Constraints(this);
    }
    
    public Builder setRequiredNetworkType(NetworkType paramNetworkType)
    {
      this.mRequiredNetworkType = paramNetworkType;
      return this;
    }
    
    public Builder setRequiresBatteryNotLow(boolean paramBoolean)
    {
      this.mRequiresBatteryNotLow = paramBoolean;
      return this;
    }
    
    public Builder setRequiresCharging(boolean paramBoolean)
    {
      this.mRequiresCharging = paramBoolean;
      return this;
    }
    
    public Builder setRequiresDeviceIdle(boolean paramBoolean)
    {
      this.mRequiresDeviceIdle = paramBoolean;
      return this;
    }
    
    public Builder setRequiresStorageNotLow(boolean paramBoolean)
    {
      this.mRequiresStorageNotLow = paramBoolean;
      return this;
    }
    
    public Builder setTriggerContentMaxDelay(long paramLong, TimeUnit paramTimeUnit)
    {
      this.mTriggerContentMaxDelay = paramTimeUnit.toMillis(paramLong);
      return this;
    }
    
    public Builder setTriggerContentMaxDelay(Duration paramDuration)
    {
      this.mTriggerContentMaxDelay = paramDuration.toMillis();
      return this;
    }
    
    public Builder setTriggerContentUpdateDelay(long paramLong, TimeUnit paramTimeUnit)
    {
      this.mTriggerContentUpdateDelay = paramTimeUnit.toMillis(paramLong);
      return this;
    }
    
    public Builder setTriggerContentUpdateDelay(Duration paramDuration)
    {
      this.mTriggerContentUpdateDelay = paramDuration.toMillis();
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\Constraints.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */