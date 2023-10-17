package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

public final class zzdtu
{
  public static final void zza(Context paramContext, ViewGroup paramViewGroup, AdView paramAdView)
  {
    paramContext = new LinearLayout(paramContext);
    paramContext.setTag("layout");
    zzf(paramContext, -1, -1);
    paramContext.setGravity(17);
    paramContext.addView(paramAdView);
    paramAdView.setTag("ad_view");
    paramViewGroup.addView(paramContext);
  }
  
  public static final void zzb(Context paramContext, ViewGroup paramViewGroup, NativeAd paramNativeAd)
  {
    NativeAdView localNativeAdView = new NativeAdView(paramContext);
    localNativeAdView.setTag("ad_view_tag");
    zzf(localNativeAdView, -1, -1);
    paramViewGroup.addView(localNativeAdView);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setTag("layout_tag");
    localLinearLayout.setOrientation(1);
    zzf(localLinearLayout, -1, -1);
    localLinearLayout.setBackgroundColor(-1);
    localNativeAdView.addView(localLinearLayout);
    Resources localResources = zzt.zzo().zzd();
    if (localResources == null) {
      paramViewGroup = "Headline";
    } else {
      paramViewGroup = localResources.getString(R.string.native_headline);
    }
    localLinearLayout.addView(zzc(paramContext, paramViewGroup, "headline_header_tag"));
    paramViewGroup = zzd(paramContext, zzfpo.zzc(paramNativeAd.getHeadline()), "headline_tag");
    localNativeAdView.setHeadlineView(paramViewGroup);
    localLinearLayout.addView(paramViewGroup);
    if (localResources == null) {
      paramViewGroup = "Body";
    } else {
      paramViewGroup = localResources.getString(R.string.native_body);
    }
    localLinearLayout.addView(zzc(paramContext, paramViewGroup, "body_header_tag"));
    paramViewGroup = zzd(paramContext, zzfpo.zzc(paramNativeAd.getBody()), "body_tag");
    localNativeAdView.setBodyView(paramViewGroup);
    localLinearLayout.addView(paramViewGroup);
    if (localResources == null) {
      paramViewGroup = "Media View";
    } else {
      paramViewGroup = localResources.getString(R.string.native_media_view);
    }
    localLinearLayout.addView(zzc(paramContext, paramViewGroup, "media_view_header_tag"));
    paramContext = new MediaView(paramContext);
    paramContext.setTag("media_view_tag");
    localNativeAdView.setMediaView(paramContext);
    localLinearLayout.addView(paramContext);
    localNativeAdView.setNativeAd(paramNativeAd);
  }
  
  private static TextView zzc(Context paramContext, String paramString1, String paramString2)
  {
    return zze(paramContext, paramString1, 16973894, -9210245, 0.0F, paramString2);
  }
  
  private static TextView zzd(Context paramContext, String paramString1, String paramString2)
  {
    return zze(paramContext, paramString1, 16973892, -16777216, 12.0F, paramString2);
  }
  
  private static TextView zze(Context paramContext, String paramString1, int paramInt1, int paramInt2, float paramFloat, String paramString2)
  {
    TextView localTextView = new TextView(paramContext);
    localTextView.setTag(paramString2);
    zzf(localTextView, -2, -2);
    ViewGroup.LayoutParams localLayoutParams = localTextView.getLayoutParams();
    paramString2 = localLayoutParams;
    if (localLayoutParams == null) {
      paramString2 = new TableRow.LayoutParams();
    }
    paramString2 = new ViewGroup.MarginLayoutParams(paramString2);
    paramString2.bottomMargin = ((int)TypedValue.applyDimension(1, paramFloat, localTextView.getResources().getDisplayMetrics()));
    localTextView.setLayoutParams(paramString2);
    localTextView.setTextAppearance(paramContext, paramInt1);
    localTextView.setTextColor(paramInt2);
    localTextView.setText(paramString1);
    return localTextView;
  }
  
  private static void zzf(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    Object localObject = localLayoutParams;
    if (localLayoutParams == null) {
      localObject = new TableRow.LayoutParams();
    }
    localObject = new LinearLayout.LayoutParams((ViewGroup.LayoutParams)localObject);
    ((LinearLayout.LayoutParams)localObject).height = paramInt1;
    ((LinearLayout.LayoutParams)localObject).width = paramInt2;
    paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdtu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */