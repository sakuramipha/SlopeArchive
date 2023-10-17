package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzm;

public class zzu
  extends zzt
{
  static final boolean zzf(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.abs(paramInt1 - paramInt2) <= paramInt3;
  }
  
  public final boolean zze(Activity paramActivity, Configuration paramConfiguration)
  {
    zzbbc localzzbbc = zzbbk.zzeA;
    boolean bool2 = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
    boolean bool1 = false;
    if (!bool2) {
      return false;
    }
    localzzbbc = zzbbk.zzeC;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return paramActivity.isInMultiWindowMode();
    }
    zzay.zzb();
    int m = zzbzm.zzx(paramActivity, paramConfiguration.screenHeightDp);
    int n = zzbzm.zzx(paramActivity, paramConfiguration.screenWidthDp);
    paramConfiguration = (WindowManager)paramActivity.getApplicationContext().getSystemService("window");
    com.google.android.gms.ads.internal.zzt.zzp();
    paramConfiguration = zzs.zzq(paramConfiguration);
    int j = paramConfiguration.heightPixels;
    int k = paramConfiguration.widthPixels;
    int i = paramActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i > 0) {
      i = paramActivity.getResources().getDimensionPixelSize(i);
    } else {
      i = 0;
    }
    int i1 = (int)Math.round(paramActivity.getResources().getDisplayMetrics().density + 0.5D);
    paramActivity = zzbbk.zzey;
    i1 *= ((Integer)zzba.zzc().zzb(paramActivity)).intValue();
    if (zzf(j, m + i, i1))
    {
      if (!zzf(k, n, i1)) {
        return true;
      }
    }
    else {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */