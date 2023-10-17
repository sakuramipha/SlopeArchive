package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.view.View;

public final class zzfhw
{
  public static float zza(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.getZ();
    }
    return 0.0F;
  }
  
  public static String zzb(View paramView)
  {
    if (paramView.isAttachedToWindow())
    {
      int i = paramView.getVisibility();
      if (i == 8) {
        return "viewGone";
      }
      if (i == 4) {
        return "viewInvisible";
      }
      if (i != 0) {
        return "viewNotVisible";
      }
      if (paramView.getAlpha() == 0.0F) {
        return "viewAlphaZero";
      }
      return null;
    }
    return "notAttached";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */