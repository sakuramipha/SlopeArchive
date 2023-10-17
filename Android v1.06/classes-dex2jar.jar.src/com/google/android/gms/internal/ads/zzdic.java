package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

public final class zzdic
{
  static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
  private final zzg zzb;
  private final zzfaa zzc;
  private final zzdhh zzd;
  private final zzdhc zze;
  private final zzdio zzf;
  private final zzdiw zzg;
  private final Executor zzh;
  private final Executor zzi;
  private final zzbee zzj;
  private final zzdgz zzk;
  
  public zzdic(zzg paramzzg, zzfaa paramzzfaa, zzdhh paramzzdhh, zzdhc paramzzdhc, zzdio paramzzdio, zzdiw paramzzdiw, Executor paramExecutor1, Executor paramExecutor2, zzdgz paramzzdgz)
  {
    this.zzb = paramzzg;
    this.zzc = paramzzfaa;
    this.zzj = paramzzfaa.zzi;
    this.zzd = paramzzdhh;
    this.zze = paramzzdhc;
    this.zzf = paramzzdio;
    this.zzg = paramzzdiw;
    this.zzh = paramExecutor1;
    this.zzi = paramExecutor2;
    this.zzk = paramzzdgz;
  }
  
  private static void zzh(RelativeLayout.LayoutParams paramLayoutParams, int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          paramLayoutParams.addRule(10);
          paramLayoutParams.addRule(11);
          return;
        }
        paramLayoutParams.addRule(12);
        paramLayoutParams.addRule(9);
        return;
      }
      paramLayoutParams.addRule(12);
      paramLayoutParams.addRule(11);
      return;
    }
    paramLayoutParams.addRule(10);
    paramLayoutParams.addRule(9);
  }
  
  private final boolean zzi(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    View localView;
    if (paramBoolean) {
      localView = this.zze.zzf();
    } else {
      localView = this.zze.zzg();
    }
    if (localView == null) {
      return false;
    }
    paramViewGroup.removeAllViews();
    if ((localView.getParent() instanceof ViewGroup)) {
      ((ViewGroup)localView.getParent()).removeView(localView);
    }
    Object localObject = zzbbk.zzdA;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      localObject = new FrameLayout.LayoutParams(-1, -1, 17);
    } else {
      localObject = new FrameLayout.LayoutParams(-2, -2, 17);
    }
    paramViewGroup.addView(localView, (ViewGroup.LayoutParams)localObject);
    return true;
  }
  
  public final void zzc(zzdiy paramzzdiy)
  {
    if ((paramzzdiy != null) && (this.zzf != null) && (paramzzdiy.zzh() != null))
    {
      if (!this.zzd.zzg()) {
        return;
      }
      try
      {
        paramzzdiy.zzh().addView(this.zzf.zza());
        return;
      }
      catch (zzcfm paramzzdiy)
      {
        zze.zzb("web view can not be obtained", paramzzdiy);
      }
    }
  }
  
  public final void zzd(zzdiy paramzzdiy)
  {
    if (paramzzdiy == null) {
      return;
    }
    Object localObject = paramzzdiy.zzf().getContext();
    if (!zzbx.zzh((Context)localObject, this.zzd.zza)) {
      return;
    }
    if (!(localObject instanceof Activity))
    {
      zzbzt.zze("Activity context is needed for policy validator.");
      return;
    }
    if ((this.zzg != null) && (paramzzdiy.zzh() != null)) {
      try
      {
        localObject = (WindowManager)((Context)localObject).getSystemService("window");
        paramzzdiy = paramzzdiy.zzh();
        ((WindowManager)localObject).addView(this.zzg.zza(paramzzdiy, (WindowManager)localObject), zzbx.zzb());
        return;
      }
      catch (zzcfm paramzzdiy)
      {
        zze.zzb("web view can not be obtained", paramzzdiy);
      }
    }
  }
  
  public final void zze(zzdiy paramzzdiy)
  {
    this.zzh.execute(new zzdia(this, paramzzdiy));
  }
  
  public final boolean zzf(ViewGroup paramViewGroup)
  {
    return zzi(paramViewGroup, false);
  }
  
  public final boolean zzg(ViewGroup paramViewGroup)
  {
    return zzi(paramViewGroup, true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */