package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;
import java.util.Map;

public abstract class UnifiedNativeAdMapper
{
  private String zza;
  private List zzb;
  private String zzc;
  private NativeAd.Image zzd;
  private String zze;
  private String zzf;
  private Double zzg;
  private String zzh;
  private String zzi;
  private VideoController zzj;
  private boolean zzk;
  private View zzl;
  private View zzm;
  private Object zzn;
  private Bundle zzo = new Bundle();
  private boolean zzp;
  private boolean zzq;
  private float zzr;
  
  public View getAdChoicesContent()
  {
    return this.zzl;
  }
  
  public final String getAdvertiser()
  {
    return this.zzf;
  }
  
  public final String getBody()
  {
    return this.zzc;
  }
  
  public final String getCallToAction()
  {
    return this.zze;
  }
  
  public float getCurrentTime()
  {
    return 0.0F;
  }
  
  public float getDuration()
  {
    return 0.0F;
  }
  
  public final Bundle getExtras()
  {
    return this.zzo;
  }
  
  public final String getHeadline()
  {
    return this.zza;
  }
  
  public final NativeAd.Image getIcon()
  {
    return this.zzd;
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.zzb;
  }
  
  public float getMediaContentAspectRatio()
  {
    return this.zzr;
  }
  
  public final boolean getOverrideClickHandling()
  {
    return this.zzq;
  }
  
  public final boolean getOverrideImpressionRecording()
  {
    return this.zzp;
  }
  
  public final String getPrice()
  {
    return this.zzi;
  }
  
  public final Double getStarRating()
  {
    return this.zzg;
  }
  
  public final String getStore()
  {
    return this.zzh;
  }
  
  public void handleClick(View paramView) {}
  
  public boolean hasVideoContent()
  {
    return this.zzk;
  }
  
  public void recordImpression() {}
  
  public void setAdChoicesContent(View paramView)
  {
    this.zzl = paramView;
  }
  
  public final void setAdvertiser(String paramString)
  {
    this.zzf = paramString;
  }
  
  public final void setBody(String paramString)
  {
    this.zzc = paramString;
  }
  
  public final void setCallToAction(String paramString)
  {
    this.zze = paramString;
  }
  
  public final void setExtras(Bundle paramBundle)
  {
    this.zzo = paramBundle;
  }
  
  public void setHasVideoContent(boolean paramBoolean)
  {
    this.zzk = paramBoolean;
  }
  
  public final void setHeadline(String paramString)
  {
    this.zza = paramString;
  }
  
  public final void setIcon(NativeAd.Image paramImage)
  {
    this.zzd = paramImage;
  }
  
  public final void setImages(List<NativeAd.Image> paramList)
  {
    this.zzb = paramList;
  }
  
  public void setMediaContentAspectRatio(float paramFloat)
  {
    this.zzr = paramFloat;
  }
  
  public void setMediaView(View paramView)
  {
    this.zzm = paramView;
  }
  
  public final void setOverrideClickHandling(boolean paramBoolean)
  {
    this.zzq = paramBoolean;
  }
  
  public final void setOverrideImpressionRecording(boolean paramBoolean)
  {
    this.zzp = paramBoolean;
  }
  
  public final void setPrice(String paramString)
  {
    this.zzi = paramString;
  }
  
  public final void setStarRating(Double paramDouble)
  {
    this.zzg = paramDouble;
  }
  
  public final void setStore(String paramString)
  {
    this.zzh = paramString;
  }
  
  public void trackViews(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2) {}
  
  public void untrackView(View paramView) {}
  
  public final View zza()
  {
    return this.zzm;
  }
  
  public final VideoController zzb()
  {
    return this.zzj;
  }
  
  public final Object zzc()
  {
    return this.zzn;
  }
  
  public final void zzd(Object paramObject)
  {
    this.zzn = paramObject;
  }
  
  public final void zze(VideoController paramVideoController)
  {
    this.zzj = paramVideoController;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\UnifiedNativeAdMapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */