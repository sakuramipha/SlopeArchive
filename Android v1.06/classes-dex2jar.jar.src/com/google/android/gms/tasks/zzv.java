package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzv
  extends LifecycleCallback
{
  private final List<WeakReference<zzq<?>>> zza = new ArrayList();
  
  private zzv(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment);
    this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
  }
  
  public static zzv zza(Activity paramActivity)
  {
    LifecycleFragment localLifecycleFragment = getFragment(paramActivity);
    zzv localzzv = (zzv)localLifecycleFragment.getCallbackOrNull("TaskOnStopCallback", zzv.class);
    paramActivity = localzzv;
    if (localzzv == null) {
      paramActivity = new zzv(localLifecycleFragment);
    }
    return paramActivity;
  }
  
  public final void onStop()
  {
    synchronized (this.zza)
    {
      Iterator localIterator = this.zza.iterator();
      while (localIterator.hasNext())
      {
        zzq localzzq = (zzq)((WeakReference)localIterator.next()).get();
        if (localzzq != null) {
          localzzq.zzc();
        }
      }
      this.zza.clear();
      return;
    }
  }
  
  public final <T> void zzb(zzq<T> paramzzq)
  {
    synchronized (this.zza)
    {
      List localList2 = this.zza;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(paramzzq);
      localList2.add(localWeakReference);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */