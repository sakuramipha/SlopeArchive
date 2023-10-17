package com.google.unity.ads;

import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

public class UnityAppStateEventNotifier
  implements DefaultLifecycleObserver
{
  private final Activity activity;
  private final UnityAppStateEventCallback callback;
  
  public UnityAppStateEventNotifier(Activity paramActivity, UnityAppStateEventCallback paramUnityAppStateEventCallback)
  {
    this.activity = paramActivity;
    this.callback = paramUnityAppStateEventCallback;
  }
  
  public void onCreate(LifecycleOwner paramLifecycleOwner) {}
  
  public void onDestroy(LifecycleOwner paramLifecycleOwner) {}
  
  public void onPause(LifecycleOwner paramLifecycleOwner) {}
  
  public void onResume(LifecycleOwner paramLifecycleOwner) {}
  
  public void onStart(LifecycleOwner paramLifecycleOwner)
  {
    this.callback.onAppStateChanged(false);
  }
  
  public void onStop(LifecycleOwner paramLifecycleOwner)
  {
    this.callback.onAppStateChanged(true);
  }
  
  public void startListening()
  {
    this.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(UnityAppStateEventNotifier.this);
      }
    });
  }
  
  public void stopListening()
  {
    this.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(UnityAppStateEventNotifier.this);
      }
    });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\googl\\unity\ads\UnityAppStateEventNotifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */