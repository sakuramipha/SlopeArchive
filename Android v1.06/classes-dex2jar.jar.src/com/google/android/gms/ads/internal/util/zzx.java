package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.media.AudioManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzc;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class zzx
  extends zzv
{
  private static final void zzp(boolean paramBoolean, Activity paramActivity)
  {
    paramActivity = paramActivity.getWindow();
    WindowManager.LayoutParams localLayoutParams = paramActivity.getAttributes();
    int j = localLayoutParams.layoutInDisplayCutoutMode;
    int i = 1;
    if (true != paramBoolean) {
      i = 2;
    }
    if (i != j)
    {
      localLayoutParams.layoutInDisplayCutoutMode = i;
      paramActivity.setAttributes(localLayoutParams);
    }
  }
  
  public final int zzk(AudioManager paramAudioManager)
  {
    return paramAudioManager.getStreamMinVolume(3);
  }
  
  public final void zzl(Activity paramActivity)
  {
    zzbbc localzzbbc = zzbbk.zzbc;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (zzt.zzo().zzh().zzm() == null) && (!paramActivity.isInMultiWindowMode()))
    {
      zzp(true, paramActivity);
      paramActivity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzw(this, paramActivity));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */