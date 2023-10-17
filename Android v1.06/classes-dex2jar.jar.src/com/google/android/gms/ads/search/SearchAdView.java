package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.internal.ads.zzbzt;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class SearchAdView
  extends ViewGroup
{
  @NotOnlyInitialized
  private final zzea zza;
  
  public SearchAdView(Context paramContext)
  {
    super(paramContext);
    this.zza = new zzea(this);
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.zza = new zzea(this, paramAttributeSet, false);
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.zza = new zzea(this, paramAttributeSet, false);
  }
  
  public void destroy()
  {
    this.zza.zzk();
  }
  
  public AdListener getAdListener()
  {
    return this.zza.zza();
  }
  
  public AdSize getAdSize()
  {
    return this.zza.zzb();
  }
  
  public String getAdUnitId()
  {
    return this.zza.zzj();
  }
  
  public void loadAd(DynamicHeightSearchAdRequest paramDynamicHeightSearchAdRequest)
  {
    if (AdSize.SEARCH.equals(getAdSize()))
    {
      this.zza.zzm(paramDynamicHeightSearchAdRequest.zza());
      return;
    }
    throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
  }
  
  public void loadAd(SearchAdRequest paramSearchAdRequest)
  {
    this.zza.zzm(paramSearchAdRequest.zza());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    Object localObject1 = getChildAt(0);
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
    {
      measureChild((View)localObject1, paramInt1, paramInt2);
      j = ((View)localObject1).getMeasuredWidth();
      i = ((View)localObject1).getMeasuredHeight();
    }
    else
    {
      Object localObject2;
      try
      {
        localObject1 = getAdSize();
      }
      catch (NullPointerException localNullPointerException)
      {
        zzbzt.zzh("Unable to retrieve ad size.", localNullPointerException);
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        Context localContext = getContext();
        j = ((AdSize)localObject2).getWidthInPixels(localContext);
        i = ((AdSize)localObject2).getHeightInPixels(localContext);
      }
      else
      {
        i = 0;
      }
    }
    j = Math.max(j, getSuggestedMinimumWidth());
    int i = Math.max(i, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSize(j, paramInt1), View.resolveSize(i, paramInt2));
  }
  
  public void pause()
  {
    this.zza.zzn();
  }
  
  public void resume()
  {
    this.zza.zzp();
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.zza.zzr(paramAdListener);
  }
  
  public void setAdSize(AdSize paramAdSize)
  {
    this.zza.zzs(new AdSize[] { paramAdSize });
  }
  
  public void setAdUnitId(String paramString)
  {
    this.zza.zzu(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\search\SearchAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */