package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

final class zaa
  implements OnDelegateCreatedListener
{
  final DeferredLifecycleHelper zaa;
  
  zaa(DeferredLifecycleHelper paramDeferredLifecycleHelper) {}
  
  public final void onDelegateCreated(LifecycleDelegate paramLifecycleDelegate)
  {
    DeferredLifecycleHelper.zac(this.zaa, paramLifecycleDelegate);
    paramLifecycleDelegate = DeferredLifecycleHelper.zab(this.zaa).iterator();
    while (paramLifecycleDelegate.hasNext()) {
      ((zah)paramLifecycleDelegate.next()).zab(DeferredLifecycleHelper.zaa(this.zaa));
    }
    DeferredLifecycleHelper.zab(this.zaa).clear();
    DeferredLifecycleHelper.zad(this.zaa, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */