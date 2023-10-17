package com.google.android.gms.games.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzg
{
  private static final AtomicReference zza = new AtomicReference();
  private final Application zzb;
  private final Application.ActivityLifecycleCallbacks zzc = new zzf(this, null);
  private final Object zzd = new Object();
  private final Set zze = Collections.newSetFromMap(new WeakHashMap());
  private WeakReference zzf;
  private boolean zzg = false;
  
  public zzg(Application paramApplication)
  {
    this.zzb = paramApplication;
  }
  
  public static zzg zzb(Application paramApplication)
  {
    Preconditions.checkNotNull(paramApplication);
    AtomicReference localAtomicReference = zza;
    zzg localzzg = (zzg)localAtomicReference.get();
    if (localzzg != null) {
      return localzzg;
    }
    paramApplication = new zzg(paramApplication);
    while ((!localAtomicReference.compareAndSet(null, paramApplication)) && (localAtomicReference.get() == null)) {}
    return (zzg)zza.get();
  }
  
  public static zzg zzc(Context paramContext)
  {
    return zzb((Application)paramContext.getApplicationContext());
  }
  
  private final void zzi(zzd paramzzd)
  {
    Activity localActivity = zza();
    if (localActivity == null) {
      return;
    }
    paramzzd.zza(localActivity);
  }
  
  public final Activity zza()
  {
    synchronized (this.zzd)
    {
      Object localObject1 = this.zzf;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = (Activity)((WeakReference)localObject1).get();
      }
      return (Activity)localObject1;
    }
  }
  
  public final void zzf(zzd paramzzd)
  {
    Preconditions.checkNotNull(paramzzd);
    synchronized (this.zzd)
    {
      this.zze.add(paramzzd);
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        zzi(paramzzd);
        return;
      }
      TaskExecutors.MAIN_THREAD.execute(new zzc(this, paramzzd));
      return;
    }
  }
  
  public final void zzh()
  {
    synchronized (this.zzd)
    {
      if (!this.zzg)
      {
        this.zzb.registerActivityLifecycleCallbacks(this.zzc);
        this.zzg = true;
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */