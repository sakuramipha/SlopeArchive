package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbss;
import java.util.List;
import java.util.Map;

public final class ReportingInfo
{
  private final zzbss zza;
  
  public void recordClick(List<Uri> paramList)
  {
    this.zza.zza(paramList);
  }
  
  public void recordImpression(List<Uri> paramList)
  {
    this.zza.zzb(paramList);
  }
  
  public void reportTouchEvent(MotionEvent paramMotionEvent)
  {
    this.zza.zzc(paramMotionEvent);
  }
  
  public void updateClickUrl(Uri paramUri, UpdateClickUrlCallback paramUpdateClickUrlCallback)
  {
    this.zza.zzd(paramUri, paramUpdateClickUrlCallback);
  }
  
  public void updateImpressionUrls(List<Uri> paramList, UpdateImpressionUrlsCallback paramUpdateImpressionUrlsCallback)
  {
    this.zza.zze(paramList, paramUpdateImpressionUrlsCallback);
  }
  
  public static final class Builder
  {
    private final zzbsr zza;
    
    public Builder(View paramView)
    {
      zzbsr localzzbsr = new zzbsr();
      this.zza = localzzbsr;
      localzzbsr.zzb(paramView);
    }
    
    public ReportingInfo build()
    {
      return new ReportingInfo(this, null);
    }
    
    public Builder setAssetViews(Map<String, View> paramMap)
    {
      this.zza.zzc(paramMap);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\query\ReportingInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */