package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.lang.ref.WeakReference;

public final class zzary
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks
{
  private static final Handler zza = new Handler(Looper.getMainLooper());
  private final Context zzb;
  private Application zzc;
  private final PowerManager zzd;
  private final KeyguardManager zze;
  private BroadcastReceiver zzf;
  private final zzark zzg;
  private WeakReference zzh;
  private WeakReference zzi;
  private zzarg zzj;
  private byte zzk = -1;
  private int zzl = -1;
  private long zzm = -3L;
  
  public zzary(Context paramContext, zzark paramzzark)
  {
    paramContext = paramContext.getApplicationContext();
    this.zzb = paramContext;
    this.zzg = paramzzark;
    this.zzd = ((PowerManager)paramContext.getSystemService("power"));
    this.zze = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    if ((paramContext instanceof Application))
    {
      paramContext = (Application)paramContext;
      this.zzc = paramContext;
      this.zzj = new zzarg(paramContext, this);
    }
    zzd(null);
  }
  
  private final void zze(Activity paramActivity, int paramInt)
  {
    if (this.zzi == null) {
      return;
    }
    paramActivity = paramActivity.getWindow();
    if (paramActivity == null) {
      return;
    }
    paramActivity = paramActivity.peekDecorView();
    View localView = zzb();
    if ((localView != null) && (paramActivity != null) && (localView.getRootView() == paramActivity.getRootView())) {
      this.zzl = paramInt;
    }
  }
  
  private final void zzf()
  {
    if (this.zzi == null) {
      return;
    }
    View localView1 = zzb();
    if (localView1 == null)
    {
      this.zzm = -3L;
      this.zzk = -1;
      return;
    }
    int i = localView1.getVisibility();
    int k = 0;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j = i;
    if (!localView1.isShown()) {
      j = i | 0x2;
    }
    Object localObject = this.zzd;
    i = j;
    if (localObject != null)
    {
      i = j;
      if (!((PowerManager)localObject).isScreenOn()) {
        i = j | 0x4;
      }
    }
    j = i;
    if (!this.zzg.zza())
    {
      localObject = this.zze;
      if ((localObject != null) && (((KeyguardManager)localObject).inKeyguardRestrictedInputMode()))
      {
        j = zzaru.zza;
        View localView2 = localView1.getRootView();
        localObject = localView2;
        if (localView2 == null) {
          localObject = localView1;
        }
        localObject = ((View)localObject).getContext();
        for (j = k;; j++)
        {
          boolean bool = localObject instanceof ContextWrapper;
          localView2 = null;
          if ((!bool) || (j >= 10)) {
            break;
          }
          if ((localObject instanceof Activity))
          {
            localObject = (Activity)localObject;
            break label214;
          }
          localObject = ((ContextWrapper)localObject).getBaseContext();
        }
        localObject = null;
        label214:
        if (localObject != null)
        {
          localObject = ((Activity)localObject).getWindow();
          if (localObject == null) {
            localObject = localView2;
          } else {
            localObject = ((Window)localObject).getAttributes();
          }
          if (localObject != null)
          {
            j = i;
            if ((((WindowManager.LayoutParams)localObject).flags & 0x80000) != 0) {
              break label271;
            }
          }
        }
      }
      j = i | 0x8;
    }
    label271:
    k = j;
    if (!localView1.getGlobalVisibleRect(new Rect())) {
      k = j | 0x10;
    }
    i = k;
    if (!localView1.getLocalVisibleRect(new Rect())) {
      i = k | 0x20;
    }
    j = localView1.getWindowVisibility();
    k = this.zzl;
    if (k != -1) {
      j = k;
    }
    k = i;
    if (j != 0) {
      k = i | 0x40;
    }
    if (this.zzk != k)
    {
      this.zzk = ((byte)k);
      long l;
      if (k == 0) {
        l = SystemClock.elapsedRealtime();
      } else {
        l = -3L - k;
      }
      this.zzm = l;
    }
  }
  
  private final void zzg()
  {
    zza.post(new zzarw(this));
  }
  
  private final void zzh(View paramView)
  {
    paramView = paramView.getViewTreeObserver();
    if (paramView.isAlive())
    {
      this.zzh = new WeakReference(paramView);
      paramView.addOnScrollChangedListener(this);
      paramView.addOnGlobalLayoutListener(this);
    }
    if (this.zzf == null)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      localIntentFilter.addAction("android.intent.action.USER_PRESENT");
      paramView = new zzarx(this);
      this.zzf = paramView;
      this.zzb.registerReceiver(paramView, localIntentFilter);
    }
    paramView = this.zzc;
    if (paramView != null) {}
    try
    {
      paramView.registerActivityLifecycleCallbacks(this.zzj);
      return;
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
  }
  
  private final void zzi(View paramView)
  {
    for (;;)
    {
      try
      {
        Object localObject = this.zzh;
        if (localObject != null)
        {
          localObject = (ViewTreeObserver)((WeakReference)localObject).get();
          if ((localObject != null) && (((ViewTreeObserver)localObject).isAlive()))
          {
            ((ViewTreeObserver)localObject).removeOnScrollChangedListener(this);
            ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(this);
          }
          this.zzh = null;
        }
      }
      catch (Exception paramView)
      {
        try
        {
          this.zzb.unregisterReceiver(paramView);
          this.zzf = null;
          paramView = this.zzc;
          if (paramView == null) {
            continue;
          }
        }
        catch (Exception paramView)
        {
          try
          {
            paramView.unregisterActivityLifecycleCallbacks(this.zzj);
            return;
            localException = localException;
            continue;
            paramView = paramView;
          }
          catch (Exception paramView)
          {
            continue;
          }
        }
      }
      try
      {
        paramView = paramView.getViewTreeObserver();
        if (paramView.isAlive())
        {
          paramView.removeOnScrollChangedListener(this);
          paramView.removeGlobalOnLayoutListener(this);
        }
      }
      catch (Exception paramView) {}
    }
    paramView = this.zzf;
    if (paramView == null) {}
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    zze(paramActivity, 0);
    zzf();
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    zzf();
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    zze(paramActivity, 4);
    zzf();
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    zze(paramActivity, 0);
    zzf();
    zzg();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    zzf();
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zze(paramActivity, 0);
    zzf();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    zzf();
  }
  
  public final void onGlobalLayout()
  {
    zzf();
  }
  
  public final void onScrollChanged()
  {
    zzf();
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    this.zzl = -1;
    zzh(paramView);
    zzf();
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.zzl = -1;
    zzf();
    zzg();
    zzi(paramView);
  }
  
  public final long zza()
  {
    if ((this.zzm <= -2L) && (zzb() == null)) {
      this.zzm = -3L;
    }
    return this.zzm;
  }
  
  final View zzb()
  {
    WeakReference localWeakReference = this.zzi;
    if (localWeakReference != null) {
      return (View)localWeakReference.get();
    }
    return null;
  }
  
  final void zzd(View paramView)
  {
    View localView = zzb();
    if (localView != null)
    {
      localView.removeOnAttachStateChangeListener(this);
      zzi(localView);
    }
    this.zzi = new WeakReference(paramView);
    if (paramView != null)
    {
      if ((paramView.getWindowToken() != null) || (paramView.getWindowVisibility() != 8)) {
        zzh(paramView);
      }
      paramView.addOnAttachStateChangeListener(this);
    }
    for (long l = -2L;; l = -3L)
    {
      this.zzm = l;
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */