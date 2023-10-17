package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R.styleable;

public final class zzy
{
  private final AdSize[] zza;
  private final String zzb;
  
  public zzy(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.AdsAttrs);
    paramAttributeSet = paramContext.getString(R.styleable.AdsAttrs_adSize);
    String str = paramContext.getString(R.styleable.AdsAttrs_adSizes);
    boolean bool2 = TextUtils.isEmpty(paramAttributeSet) ^ true;
    boolean bool1 = TextUtils.isEmpty(str) ^ true;
    if ((bool2) && (!bool1))
    {
      this.zza = zzc(paramAttributeSet);
    }
    else
    {
      if ((bool2) || (!bool1)) {
        break label122;
      }
      this.zza = zzc(str);
    }
    paramAttributeSet = paramContext.getString(R.styleable.AdsAttrs_adUnitId);
    this.zzb = paramAttributeSet;
    paramContext.recycle();
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      return;
    }
    throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
    label122:
    if (bool2)
    {
      paramContext.recycle();
      throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
    }
    paramContext.recycle();
    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
  }
  
  private static AdSize[] zzc(String paramString)
  {
    String[] arrayOfString2 = paramString.split("\\s*,\\s*");
    int m = arrayOfString2.length;
    AdSize[] arrayOfAdSize = new AdSize[m];
    int i = 0;
    while (i < arrayOfString2.length)
    {
      String str = arrayOfString2[i].trim();
      if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
      {
        String[] arrayOfString1 = str.split("[xX]");
        arrayOfString1[0] = arrayOfString1[0].trim();
        arrayOfString1[1] = arrayOfString1[1].trim();
        try
        {
          int j;
          if ("FULL_WIDTH".equals(arrayOfString1[0])) {
            j = -1;
          } else {
            j = Integer.parseInt(arrayOfString1[0]);
          }
          int k;
          if ("AUTO_HEIGHT".equals(arrayOfString1[1])) {
            k = -2;
          } else {
            k = Integer.parseInt(arrayOfString1[1]);
          }
          arrayOfAdSize[i] = new AdSize(j, k);
        }
        catch (NumberFormatException paramString)
        {
          throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(String.valueOf(str)));
        }
      }
      if ("BANNER".equals(str))
      {
        arrayOfAdSize[i] = AdSize.BANNER;
      }
      else if ("LARGE_BANNER".equals(str))
      {
        arrayOfAdSize[i] = AdSize.LARGE_BANNER;
      }
      else if ("FULL_BANNER".equals(str))
      {
        arrayOfAdSize[i] = AdSize.FULL_BANNER;
      }
      else if ("LEADERBOARD".equals(str))
      {
        arrayOfAdSize[i] = AdSize.LEADERBOARD;
      }
      else if ("MEDIUM_RECTANGLE".equals(str))
      {
        arrayOfAdSize[i] = AdSize.MEDIUM_RECTANGLE;
      }
      else if ("SMART_BANNER".equals(str))
      {
        arrayOfAdSize[i] = AdSize.SMART_BANNER;
      }
      else if ("WIDE_SKYSCRAPER".equals(str))
      {
        arrayOfAdSize[i] = AdSize.WIDE_SKYSCRAPER;
      }
      else if ("FLUID".equals(str))
      {
        arrayOfAdSize[i] = AdSize.FLUID;
      }
      else
      {
        if (!"ICON".equals(str)) {
          break label348;
        }
        arrayOfAdSize[i] = AdSize.zza;
      }
      i++;
      continue;
      label348:
      throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(String.valueOf(str)));
    }
    if (m != 0) {
      return arrayOfAdSize;
    }
    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(String.valueOf(paramString)));
  }
  
  public final String zza()
  {
    return this.zzb;
  }
  
  public final AdSize[] zzb(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.zza.length != 1)) {
      throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */