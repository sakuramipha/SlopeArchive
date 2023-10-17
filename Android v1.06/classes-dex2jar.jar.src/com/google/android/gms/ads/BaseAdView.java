package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.concurrent.ExecutorService;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public abstract class BaseAdView
  extends ViewGroup
{
  @NotOnlyInitialized
  protected final zzea zza;
  
  protected BaseAdView(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.zza = new zzea(this, paramInt);
  }
  
  protected BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.zza = new zzea(this, paramAttributeSet, false, paramInt);
  }
  
  protected BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    this.zza = new zzea(this, paramAttributeSet, false, paramInt2);
  }
  
  protected BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    this.zza = new zzea(this, paramAttributeSet, paramBoolean, paramInt2);
  }
  
  protected BaseAdView(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet);
    this.zza = new zzea(this, paramAttributeSet, paramBoolean);
  }
  
  public void destroy()
  {
    zzbbk.zza(getContext());
    if (((Boolean)zzbdb.zze.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjD;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zze(this));
        return;
      }
    }
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
  
  public OnPaidEventListener getOnPaidEventListener()
  {
    return this.zza.zzc();
  }
  
  public ResponseInfo getResponseInfo()
  {
    return this.zza.zzd();
  }
  
  public boolean isLoading()
  {
    return this.zza.zzA();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzbbk.zza(getContext());
    if (((Boolean)zzbdb.zzf.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzc(this, paramAdRequest));
        return;
      }
    }
    this.zza.zzm(paramAdRequest.zza);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int j = localView.getMeasuredWidth();
      int i = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - j) / 2;
      paramInt2 = (paramInt4 - paramInt2 - i) / 2;
      localView.layout(paramInt1, paramInt2, j + paramInt1, i + paramInt2);
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
    zzbbk.zza(getContext());
    if (((Boolean)zzbdb.zzg.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjE;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzd(this));
        return;
      }
    }
    this.zza.zzn();
  }
  
  public void resume()
  {
    zzbbk.zza(getContext());
    if (((Boolean)zzbdb.zzh.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjC;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zzf(this));
        return;
      }
    }
    this.zza.zzp();
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.zza.zzr(paramAdListener);
    if (paramAdListener == null)
    {
      this.zza.zzq(null);
      return;
    }
    if ((paramAdListener instanceof zza)) {
      this.zza.zzq((zza)paramAdListener);
    }
    if ((paramAdListener instanceof AppEventListener)) {
      this.zza.zzv((AppEventListener)paramAdListener);
    }
  }
  
  public void setAdSize(AdSize paramAdSize)
  {
    this.zza.zzs(new AdSize[] { paramAdSize });
  }
  
  public void setAdUnitId(String paramString)
  {
    this.zza.zzu(paramString);
  }
  
  public void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener)
  {
    this.zza.zzx(paramOnPaidEventListener);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\BaseAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */