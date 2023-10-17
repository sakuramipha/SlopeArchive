package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbzt;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class NativeAdView
  extends FrameLayout
{
  @NotOnlyInitialized
  private final FrameLayout zza = zzd(paramContext);
  @NotOnlyInitialized
  private final zzbeu zzb = zze();
  
  public NativeAdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private final FrameLayout zzd(Context paramContext)
  {
    paramContext = new FrameLayout(paramContext);
    paramContext.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(paramContext);
    return paramContext;
  }
  
  @RequiresNonNull({"overlayFrame"})
  private final zzbeu zze()
  {
    if (isInEditMode()) {
      return null;
    }
    return zzay.zza().zzh(this.zza.getContext(), this, this.zza);
  }
  
  private final void zzf(String paramString, View paramView)
  {
    zzbeu localzzbeu = this.zzb;
    if (localzzbeu != null) {
      try
      {
        localzzbeu.zzbs(paramString, ObjectWrapper.wrap(paramView));
        return;
      }
      catch (RemoteException paramString)
      {
        zzbzt.zzh("Unable to call setAssetView on delegate", paramString);
      }
    }
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(this.zza);
  }
  
  public final void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    FrameLayout localFrameLayout = this.zza;
    if (localFrameLayout != paramView) {
      super.bringChildToFront(localFrameLayout);
    }
  }
  
  public void destroy()
  {
    zzbeu localzzbeu = this.zzb;
    if (localzzbeu != null) {
      try
      {
        localzzbeu.zzc();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to destroy native ad view", localRemoteException);
      }
    }
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.zzb != null)
    {
      zzbbc localzzbbc = zzbbk.zzjP;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        try
        {
          this.zzb.zzd(ObjectWrapper.wrap(paramMotionEvent));
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzh("Unable to call handleTouchEvent on delegate", localRemoteException);
        }
      }
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public AdChoicesView getAdChoicesView()
  {
    View localView = zza("3011");
    if ((localView instanceof AdChoicesView)) {
      return (AdChoicesView)localView;
    }
    return null;
  }
  
  public final View getAdvertiserView()
  {
    return zza("3005");
  }
  
  public final View getBodyView()
  {
    return zza("3004");
  }
  
  public final View getCallToActionView()
  {
    return zza("3002");
  }
  
  public final View getHeadlineView()
  {
    return zza("3001");
  }
  
  public final View getIconView()
  {
    return zza("3003");
  }
  
  public final View getImageView()
  {
    return zza("3008");
  }
  
  public final MediaView getMediaView()
  {
    View localView = zza("3010");
    if ((localView instanceof MediaView)) {
      return (MediaView)localView;
    }
    if (localView != null) {
      zzbzt.zze("View is not an instance of MediaView");
    }
    return null;
  }
  
  public final View getPriceView()
  {
    return zza("3007");
  }
  
  public final View getStarRatingView()
  {
    return zza("3009");
  }
  
  public final View getStoreView()
  {
    return zza("3006");
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    zzbeu localzzbeu = this.zzb;
    if (localzzbeu != null) {
      try
      {
        localzzbeu.zze(ObjectWrapper.wrap(paramView), paramInt);
        return;
      }
      catch (RemoteException paramView)
      {
        zzbzt.zzh("Unable to call onVisibilityChanged on delegate", paramView);
      }
    }
  }
  
  public final void removeAllViews()
  {
    super.removeAllViews();
    super.addView(this.zza);
  }
  
  public final void removeView(View paramView)
  {
    if (this.zza == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdChoicesView(AdChoicesView paramAdChoicesView)
  {
    zzf("3011", paramAdChoicesView);
  }
  
  public final void setAdvertiserView(View paramView)
  {
    zzf("3005", paramView);
  }
  
  public final void setBodyView(View paramView)
  {
    zzf("3004", paramView);
  }
  
  public final void setCallToActionView(View paramView)
  {
    zzf("3002", paramView);
  }
  
  public final void setClickConfirmingView(View paramView)
  {
    zzbeu localzzbeu = this.zzb;
    if (localzzbeu != null) {
      try
      {
        localzzbeu.zzbt(ObjectWrapper.wrap(paramView));
        return;
      }
      catch (RemoteException paramView)
      {
        zzbzt.zzh("Unable to call setClickConfirmingView on delegate", paramView);
      }
    }
  }
  
  public final void setHeadlineView(View paramView)
  {
    zzf("3001", paramView);
  }
  
  public final void setIconView(View paramView)
  {
    zzf("3003", paramView);
  }
  
  public final void setImageView(View paramView)
  {
    zzf("3008", paramView);
  }
  
  public final void setMediaView(MediaView paramMediaView)
  {
    zzf("3010", paramMediaView);
    if (paramMediaView == null) {
      return;
    }
    paramMediaView.zza(new zzb(this));
    paramMediaView.zzb(new zzc(this));
  }
  
  public void setNativeAd(NativeAd paramNativeAd)
  {
    zzbeu localzzbeu = this.zzb;
    if (localzzbeu != null) {
      try
      {
        localzzbeu.zzbw(paramNativeAd.zza());
        return;
      }
      catch (RemoteException paramNativeAd)
      {
        zzbzt.zzh("Unable to call setNativeAd on delegate", paramNativeAd);
      }
    }
  }
  
  public final void setPriceView(View paramView)
  {
    zzf("3007", paramView);
  }
  
  public final void setStarRatingView(View paramView)
  {
    zzf("3009", paramView);
  }
  
  public final void setStoreView(View paramView)
  {
    zzf("3006", paramView);
  }
  
  protected final View zza(String paramString)
  {
    zzbeu localzzbeu = this.zzb;
    if (localzzbeu != null) {
      try
      {
        paramString = localzzbeu.zzb(paramString);
        if (paramString != null)
        {
          paramString = (View)ObjectWrapper.unwrap(paramString);
          return paramString;
        }
      }
      catch (RemoteException paramString)
      {
        zzbzt.zzh("Unable to call getAssetView on delegate", paramString);
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nativead\NativeAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */