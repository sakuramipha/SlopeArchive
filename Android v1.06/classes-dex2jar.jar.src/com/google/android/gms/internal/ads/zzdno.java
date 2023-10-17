package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;

public final class zzdno
{
  private Context zza;
  private PopupWindow zzb;
  
  public final void zza(Context paramContext, View paramView)
  {
    Window localWindow;
    if ((PlatformVersion.isAtLeastKitKat()) && (!PlatformVersion.isAtLeastLollipop()))
    {
      if ((paramContext instanceof Activity)) {
        localWindow = ((Activity)paramContext).getWindow();
      } else {
        localWindow = null;
      }
      if ((localWindow != null) && (localWindow.getDecorView() != null) && (!((Activity)paramContext).isDestroyed()))
      {
        FrameLayout localFrameLayout = new FrameLayout(paramContext);
        localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        localFrameLayout.addView(paramView, -1, -1);
        paramView = new PopupWindow(localFrameLayout, 1, 1, false);
        paramView.setOutsideTouchable(true);
        paramView.setClippingEnabled(false);
        zzbzt.zze("Displaying the 1x1 popup off the screen.");
      }
    }
    try
    {
      paramView.showAtLocation(localWindow.getDecorView(), 0, -1, -1);
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
    paramView = null;
    this.zzb = paramView;
    if (paramView == null) {
      paramContext = null;
    }
    this.zza = paramContext;
  }
  
  public final void zzb()
  {
    Context localContext = this.zza;
    if ((localContext != null) && (this.zzb != null))
    {
      if (((localContext instanceof Activity)) && (((Activity)localContext).isDestroyed())) {}
      for (;;)
      {
        this.zza = null;
        this.zzb = null;
        return;
        if (this.zzb.isShowing()) {
          this.zzb.dismiss();
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */