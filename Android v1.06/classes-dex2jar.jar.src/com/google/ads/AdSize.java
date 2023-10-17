package com.google.ads;

import android.content.Context;

@Deprecated
public final class AdSize
{
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER;
  public static final int FULL_WIDTH = -1;
  public static final AdSize IAB_BANNER = new AdSize(468, 60);
  public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90);
  public static final AdSize IAB_MRECT;
  public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600);
  public static final int LANDSCAPE_AD_HEIGHT = 32;
  public static final int LARGE_AD_HEIGHT = 90;
  public static final int PORTRAIT_AD_HEIGHT = 50;
  public static final AdSize SMART_BANNER = new AdSize(-1, -2);
  private final com.google.android.gms.ads.AdSize zza;
  
  static
  {
    BANNER = new AdSize(320, 50);
    IAB_MRECT = new AdSize(300, 250);
  }
  
  public AdSize(int paramInt1, int paramInt2)
  {
    this(new com.google.android.gms.ads.AdSize(paramInt1, paramInt2));
  }
  
  public AdSize(com.google.android.gms.ads.AdSize paramAdSize)
  {
    this.zza = paramAdSize;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AdSize)) {
      return false;
    }
    paramObject = (AdSize)paramObject;
    return this.zza.equals(((AdSize)paramObject).zza);
  }
  
  public AdSize findBestSize(AdSize... paramVarArgs)
  {
    Object localObject2 = null;
    if (paramVarArgs == null) {
      return null;
    }
    int k = getWidth();
    int j = getHeight();
    int i = 0;
    float f3;
    for (float f2 = 0.0F; i < paramVarArgs.length; f2 = f3)
    {
      AdSize localAdSize = paramVarArgs[i];
      int m = localAdSize.getWidth();
      int n = localAdSize.getHeight();
      Object localObject1 = localObject2;
      f3 = f2;
      if (isSizeAppropriate(m, n))
      {
        f3 = m * n / (k * j);
        float f1 = f3;
        if (f3 > 1.0F) {
          f1 = 1.0F / f3;
        }
        localObject1 = localObject2;
        f3 = f2;
        if (f1 > f2)
        {
          localObject1 = localAdSize;
          f3 = f1;
        }
      }
      i++;
      localObject2 = localObject1;
    }
    return (AdSize)localObject2;
  }
  
  public int getHeight()
  {
    return this.zza.getHeight();
  }
  
  public int getHeightInPixels(Context paramContext)
  {
    return this.zza.getHeightInPixels(paramContext);
  }
  
  public int getWidth()
  {
    return this.zza.getWidth();
  }
  
  public int getWidthInPixels(Context paramContext)
  {
    return this.zza.getWidthInPixels(paramContext);
  }
  
  public int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public boolean isAutoHeight()
  {
    return this.zza.isAutoHeight();
  }
  
  public boolean isCustomAdSize()
  {
    return false;
  }
  
  public boolean isFullWidth()
  {
    return this.zza.isFullWidth();
  }
  
  public boolean isSizeAppropriate(int paramInt1, int paramInt2)
  {
    float f2 = getWidth();
    float f1 = paramInt1;
    paramInt1 = getHeight();
    if ((f1 <= f2 * 1.25F) && (f1 >= f2 * 0.8F))
    {
      f1 = paramInt2;
      f2 = paramInt1;
      if ((f1 <= 1.25F * f2) && (f1 >= f2 * 0.8F)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    return this.zza.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\AdSize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */