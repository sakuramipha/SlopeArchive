package com.google.unity.ads;

import android.app.Activity;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Banner
{
  protected BaseAdView adView;
  protected boolean hidden;
  private int mHorizontalOffset;
  private View.OnLayoutChangeListener mLayoutChangeListener;
  private int mPositionCode;
  private int mVerticalOffset;
  protected UnityAdListener unityListener;
  protected Activity unityPlayerActivity;
  
  protected Banner() {}
  
  public Banner(Activity paramActivity, UnityAdListener paramUnityAdListener)
  {
    this.unityPlayerActivity = paramActivity;
    this.unityListener = paramUnityAdListener;
  }
  
  private Insets getSafeInsets()
  {
    Insets localInsets = new Insets();
    if (Build.VERSION.SDK_INT < 28) {
      return localInsets;
    }
    Object localObject = this.unityPlayerActivity.getWindow();
    if (localObject == null) {
      return localInsets;
    }
    localObject = ((Window)localObject).getDecorView().getRootWindowInsets();
    if (localObject == null) {
      return localInsets;
    }
    localObject = ((WindowInsets)localObject).getDisplayCutout();
    if (localObject == null) {
      return localInsets;
    }
    localInsets.top = ((DisplayCutout)localObject).getSafeInsetTop();
    localInsets.left = ((DisplayCutout)localObject).getSafeInsetLeft();
    localInsets.bottom = ((DisplayCutout)localObject).getSafeInsetBottom();
    localInsets.right = ((DisplayCutout)localObject).getSafeInsetRight();
    return localInsets;
  }
  
  private void updatePosition()
  {
    if ((this.adView != null) && (!this.hidden)) {
      this.unityPlayerActivity.runOnUiThread(new Runnable()
      {
        public void run()
        {
          FrameLayout.LayoutParams localLayoutParams = Banner.this.getLayoutParams();
          Banner.this.adView.setLayoutParams(localLayoutParams);
        }
      });
    }
  }
  
  public void create(final String paramString, final AdSize paramAdSize, final int paramInt)
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      final Banner this$0;
      
      public void run()
      {
        this.this$0.createAdView(paramString, paramAdSize);
        Banner.-$$Nest$fputmHorizontalOffset(this.this$0, 0);
        Banner.-$$Nest$fputmVerticalOffset(this.this$0, 0);
        Banner.-$$Nest$fputmPositionCode(this.this$0, paramInt);
        this.this$0.hidden = false;
      }
    });
  }
  
  public void create(final String paramString, final AdSize paramAdSize, final int paramInt1, final int paramInt2)
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      final Banner this$0;
      
      public void run()
      {
        this.this$0.createAdView(paramString, paramAdSize);
        Banner.-$$Nest$fputmPositionCode(this.this$0, -1);
        Banner.-$$Nest$fputmHorizontalOffset(this.this$0, paramInt1);
        Banner.-$$Nest$fputmVerticalOffset(this.this$0, paramInt2);
        this.this$0.hidden = false;
      }
    });
  }
  
  protected void createAdView(String paramString, AdSize paramAdSize)
  {
    AdView localAdView = new AdView(this.unityPlayerActivity);
    this.adView = localAdView;
    localAdView.setBackgroundColor(0);
    this.adView.setAdUnitId(paramString);
    this.adView.setAdSize(paramAdSize);
    this.adView.setVisibility(8);
    this.adView.setDescendantFocusability(393216);
    this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
    this.adView.setAdListener(new AdListener()
    {
      public void onAdClicked()
      {
        if (Banner.this.unityListener != null) {
          new Thread(new Runnable()
          {
            public void run()
            {
              if (Banner.this.unityListener != null) {
                Banner.this.unityListener.onAdClicked();
              }
            }
          }).start();
        }
      }
      
      public void onAdClosed()
      {
        if (Banner.this.unityListener != null) {
          new Thread(new Runnable()
          {
            public void run()
            {
              if (Banner.this.unityListener != null) {
                Banner.this.unityListener.onAdClosed();
              }
            }
          }).start();
        }
      }
      
      public void onAdFailedToLoad(final LoadAdError paramAnonymousLoadAdError)
      {
        if (Banner.this.unityListener != null) {
          new Thread(new Runnable()
          {
            final Banner.3 this$1;
            
            public void run()
            {
              if (this.this$1.this$0.unityListener != null) {
                this.this$1.this$0.unityListener.onAdFailedToLoad(paramAnonymousLoadAdError);
              }
            }
          }).start();
        }
      }
      
      public void onAdImpression()
      {
        if (Banner.this.unityListener != null) {
          new Thread(new Runnable()
          {
            public void run()
            {
              if (Banner.this.unityListener != null) {
                Banner.this.unityListener.onAdImpression();
              }
            }
          }).start();
        }
      }
      
      public void onAdLoaded()
      {
        if (Banner.this.unityListener != null)
        {
          if (!Banner.this.hidden) {
            Banner.this.show();
          }
          new Thread(new Runnable()
          {
            public void run()
            {
              if (Banner.this.unityListener != null) {
                Banner.this.unityListener.onAdLoaded();
              }
            }
          }).start();
        }
      }
      
      public void onAdOpened()
      {
        if (Banner.this.unityListener != null) {
          new Thread(new Runnable()
          {
            public void run()
            {
              if (Banner.this.unityListener != null) {
                Banner.this.unityListener.onAdOpened();
              }
            }
          }).start();
        }
      }
    });
    this.adView.setOnPaidEventListener(new OnPaidEventListener()
    {
      public void onPaidEvent(final AdValue paramAnonymousAdValue)
      {
        if (Banner.this.unityListener != null) {
          new Thread(new Runnable()
          {
            final Banner.4 this$1;
            
            public void run()
            {
              if (this.this$1.this$0.unityListener != null) {
                this.this$1.this$0.unityListener.onPaidEvent(paramAnonymousAdValue.getPrecisionType(), paramAnonymousAdValue.getValueMicros(), paramAnonymousAdValue.getCurrencyCode());
              }
            }
          }).start();
        }
      }
    });
    setLayoutChangeListener();
  }
  
  public void destroy()
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        Log.d("AdsUnity", "Calling destroy() on Android");
        if (Banner.this.adView != null)
        {
          Banner.this.adView.destroy();
          ViewParent localViewParent = Banner.this.adView.getParent();
          if ((localViewParent instanceof ViewGroup)) {
            ((ViewGroup)localViewParent).removeView(Banner.this.adView);
          }
        }
      }
    });
    this.unityPlayerActivity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.mLayoutChangeListener);
  }
  
  public float getHeightInPixels()
  {
    FutureTask localFutureTask = new FutureTask(new Callable()
    {
      public Integer call()
        throws Exception
      {
        return Integer.valueOf(Banner.this.adView.getAdSize().getHeightInPixels(Banner.this.unityPlayerActivity));
      }
    });
    this.unityPlayerActivity.runOnUiThread(localFutureTask);
    try
    {
      int i = ((Integer)localFutureTask.get()).intValue();
      f = i;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("AdsUnity", String.format("Failed to get ad view height: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("AdsUnity", String.format("Failed to get ad view height: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    }
    float f = -1.0F;
    return f;
  }
  
  protected FrameLayout.LayoutParams getLayoutParams()
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.mPositionCode);
    Insets localInsets = getSafeInsets();
    int i = localInsets.left;
    int j = localInsets.top;
    localLayoutParams.bottomMargin = localInsets.bottom;
    localLayoutParams.rightMargin = localInsets.right;
    if (this.mPositionCode == -1)
    {
      int k = (int)PluginUtils.convertDpToPixel(this.mHorizontalOffset);
      if (k >= i) {
        i = k;
      }
      k = (int)PluginUtils.convertDpToPixel(this.mVerticalOffset);
      if (k >= j) {
        j = k;
      }
      localLayoutParams.leftMargin = i;
      localLayoutParams.topMargin = j;
    }
    else
    {
      localLayoutParams.leftMargin = i;
      i = this.mPositionCode;
      if ((i == 0) || (i == 2) || (i == 3)) {
        localLayoutParams.topMargin = j;
      }
    }
    return localLayoutParams;
  }
  
  public ResponseInfo getResponseInfo()
  {
    Object localObject = new FutureTask(new Banner..ExternalSyntheticLambda0(this));
    this.unityPlayerActivity.runOnUiThread((Runnable)localObject);
    try
    {
      localObject = (ResponseInfo)((FutureTask)localObject).get();
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    Log.e("AdsUnity", String.format("Unable to check banner response info: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    ResponseInfo localResponseInfo = null;
    return localResponseInfo;
  }
  
  public float getWidthInPixels()
  {
    FutureTask localFutureTask = new FutureTask(new Callable()
    {
      public Integer call()
        throws Exception
      {
        return Integer.valueOf(Banner.this.adView.getAdSize().getWidthInPixels(Banner.this.unityPlayerActivity));
      }
    });
    this.unityPlayerActivity.runOnUiThread(localFutureTask);
    try
    {
      int i = ((Integer)localFutureTask.get()).intValue();
      f = i;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("AdsUnity", String.format("Failed to get ad view width: %s", new Object[] { localExecutionException.getLocalizedMessage() }));
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("AdsUnity", String.format("Failed to get ad view width: %s", new Object[] { localInterruptedException.getLocalizedMessage() }));
    }
    float f = -1.0F;
    return f;
  }
  
  public void hide()
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        Log.d("AdsUnity", "Calling hide() on Android");
        Banner.this.hidden = true;
        Banner.this.adView.setVisibility(8);
        Banner.this.adView.pause();
      }
    });
  }
  
  public void loadAd(final AdRequest paramAdRequest)
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      final Banner this$0;
      
      public void run()
      {
        Log.d("AdsUnity", "Calling loadAd() on Android");
        this.this$0.adView.loadAd(paramAdRequest);
      }
    });
  }
  
  protected void setLayoutChangeListener()
  {
    this.mLayoutChangeListener = new View.OnLayoutChangeListener()
    {
      public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        if ((paramAnonymousInt1 == paramAnonymousInt5) && (paramAnonymousInt3 == paramAnonymousInt7) && (paramAnonymousInt4 == paramAnonymousInt8) && (paramAnonymousInt2 == paramAnonymousInt6)) {
          paramAnonymousInt1 = 0;
        } else {
          paramAnonymousInt1 = 1;
        }
        if (paramAnonymousInt1 == 0) {
          return;
        }
        if (!Banner.this.hidden) {
          Banner.-$$Nest$mupdatePosition(Banner.this);
        }
      }
    };
    this.unityPlayerActivity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.mLayoutChangeListener);
  }
  
  public void setPosition(final int paramInt)
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      final Banner this$0;
      
      public void run()
      {
        Banner.-$$Nest$fputmPositionCode(this.this$0, paramInt);
        Banner.-$$Nest$mupdatePosition(this.this$0);
      }
    });
  }
  
  public void setPosition(final int paramInt1, final int paramInt2)
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      final Banner this$0;
      
      public void run()
      {
        Banner.-$$Nest$fputmPositionCode(this.this$0, -1);
        Banner.-$$Nest$fputmHorizontalOffset(this.this$0, paramInt1);
        Banner.-$$Nest$fputmVerticalOffset(this.this$0, paramInt2);
        Banner.-$$Nest$mupdatePosition(this.this$0);
      }
    });
  }
  
  public void show()
  {
    this.unityPlayerActivity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        Log.d("AdsUnity", "Calling show() on Android");
        Banner.this.hidden = false;
        Banner.this.adView.setVisibility(0);
        Banner.-$$Nest$mupdatePosition(Banner.this);
        Banner.this.adView.resume();
      }
    });
  }
  
  protected static class Insets
  {
    int bottom = 0;
    int left = 0;
    int right = 0;
    int top = 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\Banner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */