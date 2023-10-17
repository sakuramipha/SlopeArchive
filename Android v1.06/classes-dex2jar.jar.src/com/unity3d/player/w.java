package com.unity3d.player;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

class w
  implements Application.ActivityLifecycleCallbacks
{
  Activity a;
  v b;
  
  w(Context paramContext)
  {
    new WeakReference(null);
    this.b = null;
    if ((paramContext instanceof Activity))
    {
      paramContext = (Activity)paramContext;
      this.a = paramContext;
      paramContext.getApplication().registerActivityLifecycleCallbacks(this);
    }
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    new WeakReference(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */