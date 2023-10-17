package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;

final class zzg
  extends RelativeLayout
{
  final zzas zza;
  boolean zzb;
  
  public zzg(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    super(paramContext);
    paramContext = new zzas(paramContext, paramString1);
    this.zza = paramContext;
    paramContext.zzo(paramString2);
    paramContext.zzn(paramString3);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.zzb) {
      this.zza.zzm(paramMotionEvent);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */