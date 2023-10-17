package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

public final class zab
  extends ActivityLifecycleObserver
{
  private final WeakReference<zaa> zaa;
  
  zab(zaa paramzaa)
  {
    this.zaa = new WeakReference(paramzaa);
  }
  
  public final ActivityLifecycleObserver onStopCallOnce(Runnable paramRunnable)
  {
    zaa localzaa = (zaa)this.zaa.get();
    if (localzaa != null)
    {
      zaa.zab(localzaa, paramRunnable);
      return this;
    }
    throw new IllegalStateException("The target activity has already been GC'd");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */