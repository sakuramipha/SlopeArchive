package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class zad
  implements zah
{
  final DeferredLifecycleHelper zae;
  
  zad(DeferredLifecycleHelper paramDeferredLifecycleHelper, FrameLayout paramFrameLayout, LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {}
  
  public final int zaa()
  {
    return 2;
  }
  
  public final void zab(LifecycleDelegate paramLifecycleDelegate)
  {
    this.zaa.removeAllViews();
    this.zaa.addView(DeferredLifecycleHelper.zaa(this.zae).onCreateView(this.zab, this.zac, this.zad));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */