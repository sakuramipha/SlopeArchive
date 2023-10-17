package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.games_v2.zzam;
import com.google.android.gms.internal.games_v2.zzez;
import java.lang.ref.WeakReference;

public final class zzaq
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, zzd
{
  private final zzak zza;
  private final zzam zzb;
  private WeakReference zzc;
  private boolean zzd = false;
  
  private zzaq(zzak paramzzak, int paramInt)
  {
    this.zza = paramzzak;
    this.zzb = new zzam(paramInt, null);
  }
  
  public static zzaq zzd(zzak paramzzak, int paramInt)
  {
    return new zzaq(paramzzak, paramInt);
  }
  
  private final void zzh(View paramView)
  {
    boolean bool = PlatformVersion.isAtLeastJellyBeanMR1();
    int j = -1;
    int i = j;
    if (bool)
    {
      localObject = paramView.getDisplay();
      i = j;
      if (localObject != null) {
        i = ((Display)localObject).getDisplayId();
      }
    }
    IBinder localIBinder = paramView.getWindowToken();
    Object localObject = new int[2];
    paramView.getLocationInWindow((int[])localObject);
    j = paramView.getWidth();
    int k = paramView.getHeight();
    paramView = this.zzb;
    paramView.zzc = i;
    paramView.zza = localIBinder;
    i = localObject[0];
    paramView.zzd = i;
    int m = localObject[1];
    paramView.zze = m;
    paramView.zzf = (i + j);
    paramView.zzg = (m + k);
    if (this.zzd) {
      zzg();
    }
  }
  
  public final void onGlobalLayout()
  {
    Object localObject = this.zzc;
    if (localObject == null) {
      return;
    }
    localObject = (View)((WeakReference)localObject).get();
    if (localObject == null) {
      return;
    }
    zzh((View)localObject);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    zzh(paramView);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.zza.zzs();
    paramView.removeOnAttachStateChangeListener(this);
  }
  
  public final void zza(Activity paramActivity)
  {
    View localView2;
    try
    {
      View localView1 = paramActivity.findViewById(16908290);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      localView2 = null;
    }
    View localView3 = localView2;
    if (localView2 == null)
    {
      localView2 = paramActivity.getWindow().getDecorView();
      localView3 = localView2;
      if (localView2 == null)
      {
        paramActivity = String.valueOf(paramActivity);
        String.valueOf(paramActivity).length();
        zzez.zzg("PopupManager", "Failed to bind to: ".concat(String.valueOf(paramActivity)));
        return;
      }
    }
    paramActivity = String.valueOf(paramActivity);
    String.valueOf(paramActivity).length();
    zzez.zzf("PopupManager", "Binding to: ".concat(String.valueOf(paramActivity)));
    zzf(localView3);
  }
  
  public final Bundle zzb()
  {
    return this.zzb.zza();
  }
  
  public final IBinder zzc()
  {
    return this.zzb.zza;
  }
  
  public final zzam zze()
  {
    return this.zzb;
  }
  
  public final void zzf(View paramView)
  {
    this.zza.zzs();
    Object localObject1 = this.zzc;
    if (localObject1 != null)
    {
      localObject2 = (View)((WeakReference)localObject1).get();
      Context localContext = this.zza.getContext();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if ((localContext instanceof Activity)) {
          localObject1 = ((Activity)localContext).getWindow().getDecorView();
        }
      }
      if (localObject1 != null)
      {
        ((View)localObject1).removeOnAttachStateChangeListener(this);
        localObject1 = ((View)localObject1).getViewTreeObserver();
        if (PlatformVersion.isAtLeastJellyBean()) {
          ((ViewTreeObserver)localObject1).removeOnGlobalLayoutListener(this);
        } else {
          ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener(this);
        }
      }
    }
    this.zzc = null;
    Object localObject2 = this.zza.getContext();
    localObject1 = paramView;
    View localView;
    if (paramView == null)
    {
      localObject1 = paramView;
      if ((localObject2 instanceof Activity))
      {
        localObject2 = (Activity)localObject2;
        try
        {
          localObject1 = ((Activity)localObject2).findViewById(16908290);
        }
        catch (IllegalStateException localIllegalStateException)
        {
          localView = paramView;
        }
        paramView = localView;
        if (localView == null) {
          paramView = ((Activity)localObject2).getWindow().getDecorView();
        }
        zzez.zzg("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        localView = paramView;
      }
    }
    if (localView != null)
    {
      zzh(localView);
      this.zzc = new WeakReference(localView);
      localView.addOnAttachStateChangeListener(this);
      localView.getViewTreeObserver().addOnGlobalLayoutListener(this);
      return;
    }
    zzez.zzc("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
  }
  
  public final void zzg()
  {
    zzam localzzam = this.zzb;
    IBinder localIBinder = localzzam.zza;
    if (localIBinder != null) {
      this.zza.zzQ(localIBinder, localzzam.zza());
    }
    for (boolean bool = false;; bool = true)
    {
      this.zzd = bool;
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */