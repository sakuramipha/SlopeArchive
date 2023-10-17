package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.internal.ads.zzaqq;

final class zzn
  implements View.OnTouchListener
{
  final zzs zza;
  
  zzn(zzs paramzzs) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    paramView = this.zza;
    if (zzs.zzf(paramView) != null) {
      zzs.zzf(paramView).zzd(paramMotionEvent);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */