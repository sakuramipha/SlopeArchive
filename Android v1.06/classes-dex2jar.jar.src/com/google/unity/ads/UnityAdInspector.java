package com.google.unity.ads;

import android.app.Activity;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

public final class UnityAdInspector
{
  public static void openAdInspector(Activity paramActivity, final UnityAdInspectorListener paramUnityAdInspectorListener)
  {
    paramActivity.runOnUiThread(new Runnable()
    {
      final Activity val$activity;
      
      public void run()
      {
        MobileAds.openAdInspector(this.val$activity, new OnAdInspectorClosedListener()
        {
          public void onAdInspectorClosed(AdInspectorError paramAnonymous2AdInspectorError)
          {
            if (UnityAdInspector.1.this.val$adInspectorListener != null) {
              UnityAdInspector.1.this.val$adInspectorListener.onAdInspectorClosed(paramAnonymous2AdInspectorError);
            }
          }
        });
      }
    });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityAdInspector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */