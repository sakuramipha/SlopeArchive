package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedList;

public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate>
{
  private T zaa;
  private Bundle zab;
  private LinkedList<zah> zac;
  private final OnDelegateCreatedListener<T> zad = new zaa(this);
  
  public static void showGooglePlayUnavailableMessage(FrameLayout paramFrameLayout)
  {
    Object localObject = GoogleApiAvailability.getInstance();
    Context localContext = paramFrameLayout.getContext();
    int i = ((GoogleApiAvailability)localObject).isGooglePlayServicesAvailable(localContext);
    String str2 = com.google.android.gms.common.internal.zac.zad(localContext, i);
    String str1 = com.google.android.gms.common.internal.zac.zac(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    paramFrameLayout = new TextView(paramFrameLayout.getContext());
    paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.setText(str2);
    localLinearLayout.addView(paramFrameLayout);
    localObject = ((GoogleApiAvailability)localObject).getErrorResolutionIntent(localContext, i, null);
    if (localObject != null)
    {
      paramFrameLayout = new Button(localContext);
      paramFrameLayout.setId(16908313);
      paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      paramFrameLayout.setText(str1);
      localLinearLayout.addView(paramFrameLayout);
      paramFrameLayout.setOnClickListener(new zae(localContext, (Intent)localObject));
    }
  }
  
  private final void zae(int paramInt)
  {
    while ((!this.zac.isEmpty()) && (((zah)this.zac.getLast()).zaa() >= paramInt)) {
      this.zac.removeLast();
    }
  }
  
  private final void zaf(Bundle paramBundle, zah paramzah)
  {
    LifecycleDelegate localLifecycleDelegate = this.zaa;
    if (localLifecycleDelegate != null)
    {
      paramzah.zab(localLifecycleDelegate);
      return;
    }
    if (this.zac == null) {
      this.zac = new LinkedList();
    }
    this.zac.add(paramzah);
    if (paramBundle != null)
    {
      paramzah = this.zab;
      if (paramzah == null) {
        this.zab = ((Bundle)paramBundle.clone());
      } else {
        paramzah.putAll(paramBundle);
      }
    }
    createDelegate(this.zad);
  }
  
  protected abstract void createDelegate(OnDelegateCreatedListener<T> paramOnDelegateCreatedListener);
  
  public T getDelegate()
  {
    return this.zaa;
  }
  
  protected void handleGooglePlayUnavailable(FrameLayout paramFrameLayout)
  {
    showGooglePlayUnavailableMessage(paramFrameLayout);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    zaf(paramBundle, new zac(this, paramBundle));
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    zaf(paramBundle, new zad(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (this.zaa == null) {
      handleGooglePlayUnavailable(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public void onDestroy()
  {
    LifecycleDelegate localLifecycleDelegate = this.zaa;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate.onDestroy();
      return;
    }
    zae(1);
  }
  
  public void onDestroyView()
  {
    LifecycleDelegate localLifecycleDelegate = this.zaa;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate.onDestroyView();
      return;
    }
    zae(2);
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    zaf(paramBundle2, new zab(this, paramActivity, paramBundle1, paramBundle2));
  }
  
  public void onLowMemory()
  {
    LifecycleDelegate localLifecycleDelegate = this.zaa;
    if (localLifecycleDelegate != null) {
      localLifecycleDelegate.onLowMemory();
    }
  }
  
  public void onPause()
  {
    LifecycleDelegate localLifecycleDelegate = this.zaa;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate.onPause();
      return;
    }
    zae(5);
  }
  
  public void onResume()
  {
    zaf(null, new zag(this));
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Object localObject = this.zaa;
    if (localObject != null)
    {
      ((LifecycleDelegate)localObject).onSaveInstanceState(paramBundle);
      return;
    }
    localObject = this.zab;
    if (localObject != null) {
      paramBundle.putAll((Bundle)localObject);
    }
  }
  
  public void onStart()
  {
    zaf(null, new zaf(this));
  }
  
  public void onStop()
  {
    LifecycleDelegate localLifecycleDelegate = this.zaa;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate.onStop();
      return;
    }
    zae(4);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\DeferredLifecycleHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */