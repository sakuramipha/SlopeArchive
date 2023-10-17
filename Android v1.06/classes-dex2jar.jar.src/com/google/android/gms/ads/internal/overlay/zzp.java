package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

final class zzp
  extends AnimatorListenerAdapter
{
  final zzr zza;
  
  zzp(zzr paramzzr) {}
  
  private final void zza(boolean paramBoolean)
  {
    this.zza.setEnabled(paramBoolean);
    zzr.zza(this.zza).setEnabled(paramBoolean);
  }
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    zza(true);
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    zza(true);
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    zza(false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */