package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcat;

public final class zzci
{
  private final View zza;
  private Activity zzb;
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private final ViewTreeObserver.OnGlobalLayoutListener zzf;
  
  public zzci(Activity paramActivity, View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    this.zzb = paramActivity;
    this.zza = paramView;
    this.zzf = paramOnGlobalLayoutListener;
  }
  
  private static ViewTreeObserver zzf(Activity paramActivity)
  {
    paramActivity = paramActivity.getWindow();
    if (paramActivity == null) {
      return null;
    }
    paramActivity = paramActivity.getDecorView();
    if (paramActivity == null) {
      return null;
    }
    return paramActivity.getViewTreeObserver();
  }
  
  private final void zzg()
  {
    if (!this.zzc)
    {
      Object localObject = this.zzb;
      if (localObject != null)
      {
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.zzf;
        localObject = zzf((Activity)localObject);
        if (localObject != null) {
          ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(localOnGlobalLayoutListener);
        }
      }
      zzt.zzx();
      zzcat.zza(this.zza, this.zzf);
      this.zzc = true;
    }
  }
  
  private final void zzh()
  {
    Object localObject = this.zzb;
    if (localObject == null) {
      return;
    }
    if (this.zzc)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.zzf;
      localObject = zzf((Activity)localObject);
      if (localObject != null) {
        ((ViewTreeObserver)localObject).removeOnGlobalLayoutListener(localOnGlobalLayoutListener);
      }
      this.zzc = false;
    }
  }
  
  public final void zza()
  {
    this.zze = false;
    zzh();
  }
  
  public final void zzb()
  {
    this.zze = true;
    if (this.zzd) {
      zzg();
    }
  }
  
  public final void zzc()
  {
    this.zzd = true;
    if (this.zze) {
      zzg();
    }
  }
  
  public final void zzd()
  {
    this.zzd = false;
    zzh();
  }
  
  public final void zze(Activity paramActivity)
  {
    this.zzb = paramActivity;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */