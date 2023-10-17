package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbzi;
import java.util.concurrent.ExecutorService;

public final class AdManagerAdView
  extends BaseAdView
{
  public AdManagerAdView(Context paramContext)
  {
    super(paramContext, 0);
    Preconditions.checkNotNull(paramContext, "Context cannot be null");
  }
  
  public AdManagerAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, true);
    Preconditions.checkNotNull(paramContext, "Context cannot be null");
  }
  
  public AdManagerAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0, true);
    Preconditions.checkNotNull(paramContext, "Context cannot be null");
  }
  
  public AdSize[] getAdSizes()
  {
    return this.zza.zzB();
  }
  
  public AppEventListener getAppEventListener()
  {
    return this.zza.zzh();
  }
  
  public VideoController getVideoController()
  {
    return this.zza.zzf();
  }
  
  public VideoOptions getVideoOptions()
  {
    return this.zza.zzg();
  }
  
  public void loadAd(AdManagerAdRequest paramAdManagerAdRequest)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(getContext());
    if (((Boolean)zzbdb.zzf.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzb(this, paramAdManagerAdRequest));
        return;
      }
    }
    this.zza.zzm(paramAdManagerAdRequest.zza());
  }
  
  public void recordManualImpression()
  {
    this.zza.zzo();
  }
  
  public void setAdSizes(AdSize... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length > 0))
    {
      this.zza.zzt(paramVarArgs);
      return;
    }
    throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
  }
  
  public void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.zza.zzv(paramAppEventListener);
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.zza.zzw(paramBoolean);
  }
  
  public void setVideoOptions(VideoOptions paramVideoOptions)
  {
    this.zza.zzy(paramVideoOptions);
  }
  
  public final boolean zzb(zzbu paramzzbu)
  {
    return this.zza.zzz(paramzzbu);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\admanager\AdManagerAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */