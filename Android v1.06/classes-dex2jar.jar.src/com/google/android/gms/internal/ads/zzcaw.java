package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzcaw
{
  private final WeakReference zza;
  
  public zzcaw(View paramView)
  {
    this.zza = new WeakReference(paramView);
  }
  
  protected abstract void zza(ViewTreeObserver paramViewTreeObserver);
  
  protected abstract void zzb(ViewTreeObserver paramViewTreeObserver);
  
  protected final ViewTreeObserver zzc()
  {
    Object localObject = (View)this.zza.get();
    if (localObject == null) {
      return null;
    }
    localObject = ((View)localObject).getViewTreeObserver();
    if ((localObject != null) && (((ViewTreeObserver)localObject).isAlive())) {
      return (ViewTreeObserver)localObject;
    }
    return null;
  }
  
  public final void zzd()
  {
    ViewTreeObserver localViewTreeObserver = zzc();
    if (localViewTreeObserver != null) {
      zza(localViewTreeObserver);
    }
  }
  
  public final void zze()
  {
    ViewTreeObserver localViewTreeObserver = zzc();
    if (localViewTreeObserver != null) {
      zzb(localViewTreeObserver);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */