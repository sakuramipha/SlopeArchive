package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzatz
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks
{
  private static final long zzc;
  BroadcastReceiver zza;
  final WeakReference zzb;
  private final Context zzd;
  private Application zze;
  private final WindowManager zzf;
  private final PowerManager zzg;
  private final KeyguardManager zzh;
  private WeakReference zzi;
  private zzaul zzj;
  private final zzbz zzk = new zzbz(zzc);
  private boolean zzl = false;
  private int zzm = -1;
  private final HashSet zzn = new HashSet();
  private final DisplayMetrics zzo;
  private final Rect zzp;
  
  static
  {
    zzbbc localzzbbc = zzbbk.zzbi;
    zzc = ((Long)zzba.zzc().zzb(localzzbbc)).longValue();
  }
  
  public zzatz(Context paramContext, View paramView)
  {
    Object localObject = paramContext.getApplicationContext();
    this.zzd = ((Context)localObject);
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    this.zzf = localWindowManager;
    this.zzg = ((PowerManager)((Context)localObject).getSystemService("power"));
    this.zzh = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    if ((localObject instanceof Application))
    {
      localObject = (Application)localObject;
      this.zze = ((Application)localObject);
      this.zzj = new zzaul((Application)localObject, this);
    }
    this.zzo = paramContext.getResources().getDisplayMetrics();
    paramContext = new Rect();
    this.zzp = paramContext;
    paramContext.right = localWindowManager.getDefaultDisplay().getWidth();
    paramContext.bottom = localWindowManager.getDefaultDisplay().getHeight();
    paramContext = this.zzb;
    if (paramContext != null) {
      paramContext = (View)paramContext.get();
    } else {
      paramContext = null;
    }
    if (paramContext != null)
    {
      paramContext.removeOnAttachStateChangeListener(this);
      zzm(paramContext);
    }
    this.zzb = new WeakReference(paramView);
    if (paramView != null)
    {
      if (paramView.isAttachedToWindow()) {
        zzl(paramView);
      }
      paramView.addOnAttachStateChangeListener(this);
    }
  }
  
  private final int zzh(int paramInt)
  {
    float f = this.zzo.density;
    return (int)(paramInt / f);
  }
  
  private final void zzi(Activity paramActivity, int paramInt)
  {
    if (this.zzb == null) {
      return;
    }
    paramActivity = paramActivity.getWindow();
    if (paramActivity == null) {
      return;
    }
    paramActivity = paramActivity.peekDecorView();
    View localView = (View)this.zzb.get();
    if ((localView != null) && (paramActivity != null) && (localView.getRootView() == paramActivity.getRootView())) {
      this.zzm = paramInt;
    }
  }
  
  private final void zzj(int paramInt)
  {
    if (this.zzn.isEmpty()) {
      return;
    }
    Object localObject1 = this.zzb;
    if (localObject1 == null) {
      return;
    }
    View localView1 = (View)((WeakReference)localObject1).get();
    Rect localRect4 = new Rect();
    Rect localRect3 = new Rect();
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localObject1 = new int[2];
    int[] arrayOfInt = new int[2];
    boolean bool2;
    boolean bool1;
    if (localView1 != null)
    {
      bool2 = localView1.getGlobalVisibleRect(localRect3);
      bool1 = localView1.getLocalVisibleRect(localRect1);
      localView1.getHitRect(localRect2);
      try
      {
        localView1.getLocationOnScreen((int[])localObject1);
        localView1.getLocationInWindow(arrayOfInt);
      }
      catch (Exception localException2)
      {
        zzbzt.zzh("Failure getting view location.", localException2);
      }
      localRect4.left = localObject1[0];
      localRect4.top = localObject1[1];
      localRect4.right = (localRect4.left + localView1.getWidth());
      localRect4.bottom = (localRect4.top + localView1.getHeight());
      localObject3 = localView1;
    }
    else
    {
      localObject3 = null;
      bool2 = false;
      bool1 = false;
    }
    localObject1 = zzbbk.zzbl;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (localObject3 != null)) {
      try
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        for (localObject4 = ((View)localObject3).getParent();; localObject4 = ((ViewParent)localObject4).getParent())
        {
          localObject1 = localArrayList;
          if (!(localObject4 instanceof View)) {
            break;
          }
          View localView2 = (View)localObject4;
          localObject1 = new android/graphics/Rect;
          ((Rect)localObject1).<init>();
          if ((localView2.isScrollContainer()) && (localView2.getGlobalVisibleRect((Rect)localObject1))) {
            localArrayList.add(zza((Rect)localObject1));
          }
        }
        localObject2 = Collections.emptyList();
      }
      catch (Exception localException1)
      {
        zzt.zzo().zzu(localException1, "PositionWatcher.getParentScrollViewRects");
        localObject2 = Collections.emptyList();
      }
    }
    int i;
    if (localObject3 != null) {
      i = ((View)localObject3).getWindowVisibility();
    } else {
      i = 8;
    }
    int j = this.zzm;
    if (j != -1) {
      i = j;
    }
    zzt.zzp();
    long l1 = zzs.zzs((View)localObject3);
    Object localObject4 = zzbbk.zzjf;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue())
    {
      if (localView1 == null) {
        break label522;
      }
      zzt.zzp();
      if ((!zzs.zzO((View)localObject3, this.zzg, this.zzh)) || (!bool2) || (!bool1)) {
        break label522;
      }
      localObject4 = zzbbk.zzji;
      if ((l1 < ((Integer)zzba.zzc().zzb((zzbbc)localObject4)).intValue()) || (i != 0)) {
        break label522;
      }
    }
    else
    {
      if (localView1 == null) {
        break label522;
      }
      zzt.zzp();
      if ((!zzs.zzO((View)localObject3, this.zzg, this.zzh)) || (!bool2) || (!bool1) || (i != 0)) {
        break label522;
      }
    }
    boolean bool3 = true;
    int k = 0;
    break label528;
    label522:
    bool3 = false;
    k = i;
    label528:
    localObject4 = zzbbk.zzjk;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue())
    {
      zzt.zzp();
      if (true != zzs.zzO((View)localObject3, this.zzg, this.zzh)) {
        i = 0;
      } else {
        i = 64;
      }
      if (true != bool2) {
        j = 0;
      } else {
        j = 8;
      }
      int m;
      if (true != bool1) {
        m = 0;
      } else {
        m = 16;
      }
      if (k == 0) {
        k = 128;
      } else {
        k = 0;
      }
      localObject4 = zzbbk.zzji;
      int n;
      if (l1 >= ((Integer)zzba.zzc().zzb((zzbbc)localObject4)).intValue()) {
        n = 32;
      } else {
        n = 0;
      }
      zzt.zzp();
      zzs.zzF((View)localObject3, n | i | j | m | k | bool3, null);
    }
    if ((paramInt == 1) && (!this.zzk.zzb()) && (bool3 == this.zzl)) {
      return;
    }
    if ((!bool3) && (!this.zzl) && (paramInt == 1)) {
      return;
    }
    boolean bool4 = true;
    long l2 = zzt.zzB().elapsedRealtime();
    boolean bool5 = this.zzg.isScreenOn();
    if ((localObject3 == null) || (!((View)localObject3).isAttachedToWindow())) {
      bool4 = false;
    }
    if (localObject3 != null) {
      paramInt = ((View)localObject3).getWindowVisibility();
    } else {
      paramInt = 8;
    }
    Object localObject3 = new zzatx(l2, bool5, bool4, paramInt, zza(this.zzp), zza(localRect4), zza(localRect3), bool2, zza(localRect1), bool1, l1, zza(localRect2), this.zzo.density, bool3, (List)localObject2);
    Object localObject2 = this.zzn.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((zzaty)((Iterator)localObject2).next()).zzc((zzatx)localObject3);
    }
    this.zzl = bool3;
  }
  
  private final void zzk()
  {
    zzs.zza.post(new zzatv(this));
  }
  
  private final void zzl(View paramView)
  {
    paramView = paramView.getViewTreeObserver();
    if (paramView.isAlive())
    {
      this.zzi = new WeakReference(paramView);
      paramView.addOnScrollChangedListener(this);
      paramView.addOnGlobalLayoutListener(this);
    }
    if (this.zza == null)
    {
      paramView = new IntentFilter();
      paramView.addAction("android.intent.action.SCREEN_ON");
      paramView.addAction("android.intent.action.SCREEN_OFF");
      paramView.addAction("android.intent.action.USER_PRESENT");
      this.zza = new zzatw(this);
      zzt.zzv().zzc(this.zzd, this.zza, paramView);
    }
    paramView = this.zze;
    if (paramView != null) {
      try
      {
        paramView.registerActivityLifecycleCallbacks(this.zzj);
        return;
      }
      catch (Exception paramView)
      {
        zzbzt.zzh("Error registering activity lifecycle callbacks.", paramView);
      }
    }
  }
  
  private final void zzm(View paramView)
  {
    try
    {
      Object localObject = this.zzi;
      if (localObject != null)
      {
        localObject = (ViewTreeObserver)((WeakReference)localObject).get();
        if ((localObject != null) && (((ViewTreeObserver)localObject).isAlive()))
        {
          ((ViewTreeObserver)localObject).removeOnScrollChangedListener(this);
          ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(this);
        }
        this.zzi = null;
      }
    }
    catch (Exception localException)
    {
      zzbzt.zzh("Error while unregistering listeners from the last ViewTreeObserver.", localException);
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
    catch (Exception paramView)
    {
      zzbzt.zzh("Error while unregistering listeners from the ViewTreeObserver.", paramView);
    }
    if (this.zza != null)
    {
      try
      {
        zzt.zzv().zzd(this.zzd, this.zza);
      }
      catch (Exception paramView)
      {
        zzt.zzo().zzu(paramView, "ActiveViewUnit.stopScreenStatusMonitoring");
      }
      catch (IllegalStateException paramView)
      {
        zzbzt.zzh("Failed trying to unregister the receiver", paramView);
      }
      this.zza = null;
    }
    paramView = this.zze;
    if (paramView != null) {
      try
      {
        paramView.unregisterActivityLifecycleCallbacks(this.zzj);
        return;
      }
      catch (Exception paramView)
      {
        zzbzt.zzh("Error registering activity lifecycle callbacks.", paramView);
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    zzi(paramActivity, 0);
    zzj(3);
    zzk();
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    zzj(3);
    zzk();
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    zzi(paramActivity, 4);
    zzj(3);
    zzk();
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    zzi(paramActivity, 0);
    zzj(3);
    zzk();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    zzj(3);
    zzk();
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zzi(paramActivity, 0);
    zzj(3);
    zzk();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    zzj(3);
    zzk();
  }
  
  public final void onGlobalLayout()
  {
    zzj(2);
    zzk();
  }
  
  public final void onScrollChanged()
  {
    zzj(1);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    this.zzm = -1;
    zzl(paramView);
    zzj(3);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.zzm = -1;
    zzj(3);
    zzk();
    zzm(paramView);
  }
  
  final Rect zza(Rect paramRect)
  {
    return new Rect(zzh(paramRect.left), zzh(paramRect.top), zzh(paramRect.right), zzh(paramRect.bottom));
  }
  
  public final void zzc(zzaty paramzzaty)
  {
    this.zzn.add(paramzzaty);
    zzj(3);
  }
  
  public final void zze(zzaty paramzzaty)
  {
    this.zzn.remove(paramzzaty);
  }
  
  public final void zzf()
  {
    this.zzk.zza(zzc);
  }
  
  public final void zzg(long paramLong)
  {
    this.zzk.zza(paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzatz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */