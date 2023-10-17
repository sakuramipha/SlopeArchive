package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;

public final class AdSize
{
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
  public static final AdSize FLUID;
  public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
  public static final int FULL_WIDTH = -1;
  public static final AdSize INVALID;
  public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
  public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
  public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
  public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
  @Deprecated
  public static final AdSize SMART_BANNER;
  public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
  public static final AdSize zza;
  private final int zzb;
  private final int zzc;
  private final String zzd;
  private boolean zze;
  private boolean zzf;
  private int zzg;
  private boolean zzh;
  private int zzi;
  
  static
  {
    SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    FLUID = new AdSize(-3, -4, "fluid");
    INVALID = new AdSize(0, 0, "invalid");
    zza = new AdSize(50, 50, "50x50_mb");
  }
  
  public AdSize(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, localStringBuilder.toString());
  }
  
  AdSize(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1) && (paramInt1 != -3))
    {
      paramString = new StringBuilder();
      paramString.append("Invalid width for AdSize: ");
      paramString.append(paramInt1);
      throw new IllegalArgumentException(paramString.toString());
    }
    if ((paramInt2 < 0) && (paramInt2 != -2) && (paramInt2 != -4))
    {
      paramString = new StringBuilder();
      paramString.append("Invalid height for AdSize: ");
      paramString.append(paramInt2);
      throw new IllegalArgumentException(paramString.toString());
    }
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramString;
  }
  
  public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context paramContext, int paramInt)
  {
    paramContext = zzbzm.zzc(paramContext, paramInt, 50, 0);
    paramContext.zze = true;
    return paramContext;
  }
  
  public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context paramContext, int paramInt)
  {
    int i = zzbzm.zza(paramContext, 0);
    if (i == -1) {
      return INVALID;
    }
    paramContext = new AdSize(paramInt, 0);
    paramContext.zzg = i;
    paramContext.zzf = true;
    return paramContext;
  }
  
  public static AdSize getCurrentOrientationInterscrollerAdSize(Context paramContext, int paramInt)
  {
    return zzj(paramInt, zzbzm.zza(paramContext, 0));
  }
  
  public static AdSize getInlineAdaptiveBannerAdSize(int paramInt1, int paramInt2)
  {
    AdSize localAdSize = new AdSize(paramInt1, 0);
    localAdSize.zzg = paramInt2;
    localAdSize.zzf = true;
    if (paramInt2 < 32)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("The maximum height set for the inline adaptive ad size was ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" dp, which is below the minimum recommended value of 32 dp.");
      zzbzt.zzj(localStringBuilder.toString());
    }
    return localAdSize;
  }
  
  public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context paramContext, int paramInt)
  {
    paramContext = zzbzm.zzc(paramContext, paramInt, 50, 2);
    paramContext.zze = true;
    return paramContext;
  }
  
  public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context paramContext, int paramInt)
  {
    int i = zzbzm.zza(paramContext, 2);
    paramContext = new AdSize(paramInt, 0);
    if (i == -1) {
      return INVALID;
    }
    paramContext.zzg = i;
    paramContext.zzf = true;
    return paramContext;
  }
  
  public static AdSize getLandscapeInterscrollerAdSize(Context paramContext, int paramInt)
  {
    return zzj(paramInt, zzbzm.zza(paramContext, 2));
  }
  
  public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context paramContext, int paramInt)
  {
    paramContext = zzbzm.zzc(paramContext, paramInt, 50, 1);
    paramContext.zze = true;
    return paramContext;
  }
  
  public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context paramContext, int paramInt)
  {
    int i = zzbzm.zza(paramContext, 1);
    paramContext = new AdSize(paramInt, 0);
    if (i == -1) {
      return INVALID;
    }
    paramContext.zzg = i;
    paramContext.zzf = true;
    return paramContext;
  }
  
  public static AdSize getPortraitInterscrollerAdSize(Context paramContext, int paramInt)
  {
    return zzj(paramInt, zzbzm.zza(paramContext, 1));
  }
  
  private static AdSize zzj(int paramInt1, int paramInt2)
  {
    if (paramInt2 == -1) {
      return INVALID;
    }
    AdSize localAdSize = new AdSize(paramInt1, 0);
    localAdSize.zzi = paramInt2;
    localAdSize.zzh = true;
    return localAdSize;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof AdSize)) {
      return false;
    }
    paramObject = (AdSize)paramObject;
    return (this.zzb == ((AdSize)paramObject).zzb) && (this.zzc == ((AdSize)paramObject).zzc) && (this.zzd.equals(((AdSize)paramObject).zzd));
  }
  
  public int getHeight()
  {
    return this.zzc;
  }
  
  public int getHeightInPixels(Context paramContext)
  {
    int i = this.zzc;
    if ((i != -4) && (i != -3))
    {
      if (i != -2)
      {
        zzay.zzb();
        return zzbzm.zzx(paramContext, this.zzc);
      }
      return zzq.zza(paramContext.getResources().getDisplayMetrics());
    }
    return -1;
  }
  
  public int getWidth()
  {
    return this.zzb;
  }
  
  public int getWidthInPixels(Context paramContext)
  {
    int i = this.zzb;
    if (i != -3)
    {
      if (i != -1)
      {
        zzay.zzb();
        return zzbzm.zzx(paramContext, this.zzb);
      }
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      paramContext = zzq.CREATOR;
      return localDisplayMetrics.widthPixels;
    }
    return -1;
  }
  
  public int hashCode()
  {
    return this.zzd.hashCode();
  }
  
  public boolean isAutoHeight()
  {
    return this.zzc == -2;
  }
  
  public boolean isFluid()
  {
    return (this.zzb == -3) && (this.zzc == -4);
  }
  
  public boolean isFullWidth()
  {
    return this.zzb == -1;
  }
  
  public String toString()
  {
    return this.zzd;
  }
  
  final int zza()
  {
    return this.zzi;
  }
  
  final int zzb()
  {
    return this.zzg;
  }
  
  final void zzc(int paramInt)
  {
    this.zzg = paramInt;
  }
  
  final void zzd(int paramInt)
  {
    this.zzi = paramInt;
  }
  
  final void zze(boolean paramBoolean)
  {
    this.zzf = true;
  }
  
  final void zzf(boolean paramBoolean)
  {
    this.zzh = true;
  }
  
  final boolean zzg()
  {
    return this.zze;
  }
  
  final boolean zzh()
  {
    return this.zzf;
  }
  
  final boolean zzi()
  {
    return this.zzh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdSize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */