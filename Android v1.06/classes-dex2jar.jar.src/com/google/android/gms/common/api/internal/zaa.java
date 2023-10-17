package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zaa
  extends LifecycleCallback
{
  private List<Runnable> zaa = new ArrayList();
  
  private zaa(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment);
    this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
  }
  
  private final void zac(Runnable paramRunnable)
  {
    try
    {
      this.zaa.add(paramRunnable);
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public final void onStop()
  {
    try
    {
      Object localObject1 = this.zaa;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.zaa = localArrayList;
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((Runnable)((Iterator)localObject1).next()).run();
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */