package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.impl.R.drawable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzr
  extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton zza;
  private final zzad zzb;
  
  public zzr(Context paramContext, zzq paramzzq, zzad paramzzad)
  {
    super(paramContext);
    this.zzb = paramzzad;
    setOnClickListener(this);
    paramzzad = new ImageButton(paramContext);
    this.zza = paramzzad;
    zzc();
    paramzzad.setBackgroundColor(0);
    paramzzad.setOnClickListener(this);
    zzay.zzb();
    int i = zzbzm.zzx(paramContext, paramzzq.zza);
    zzay.zzb();
    int j = zzbzm.zzx(paramContext, 0);
    zzay.zzb();
    int k = zzbzm.zzx(paramContext, paramzzq.zzb);
    zzay.zzb();
    paramzzad.setPadding(i, j, k, zzbzm.zzx(paramContext, paramzzq.zzc));
    paramzzad.setContentDescription("Interstitial close button");
    zzay.zzb();
    i = zzbzm.zzx(paramContext, paramzzq.zzd + paramzzq.zza + paramzzq.zzb);
    zzay.zzb();
    addView(paramzzad, new FrameLayout.LayoutParams(i, zzbzm.zzx(paramContext, paramzzq.zzd + paramzzq.zzc), 17));
    paramContext = zzbbk.zzaZ;
    long l = ((Long)zzba.zzc().zzb(paramContext)).longValue();
    if (l <= 0L) {
      return;
    }
    paramContext = zzbbk.zzba;
    if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue()) {
      paramContext = new zzp(this);
    } else {
      paramContext = null;
    }
    paramzzad.setAlpha(0.0F);
    paramzzad.animate().alpha(1.0F).setDuration(l).setListener(paramContext);
  }
  
  private final void zzc()
  {
    Object localObject1 = zzbbk.zzaY;
    String str = (String)zzba.zzc().zzb((zzbbc)localObject1);
    if ((PlatformVersion.isAtLeastLollipop()) && (!TextUtils.isEmpty(str)) && (!"default".equals(str)))
    {
      Resources localResources = zzt.zzo().zzd();
      if (localResources != null)
      {
        Object localObject3 = null;
        Object localObject2;
        try
        {
          if ("white".equals(str))
          {
            localObject1 = localResources.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
          }
          else
          {
            localObject1 = localObject3;
            if ("black".equals(str)) {
              localObject1 = localResources.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
            }
          }
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          zzbzt.zze("Close button resource not found, falling back to default.");
          localObject2 = localObject3;
        }
        if (localObject2 == null)
        {
          this.zza.setImageResource(17301527);
          return;
        }
        this.zza.setImageDrawable((Drawable)localObject2);
        this.zza.setScaleType(ImageView.ScaleType.CENTER);
        return;
      }
      this.zza.setImageResource(17301527);
      return;
    }
    this.zza.setImageResource(17301527);
  }
  
  public final void onClick(View paramView)
  {
    paramView = this.zzb;
    if (paramView != null) {
      paramView.zzi();
    }
  }
  
  public final void zzb(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.zza.setVisibility(8);
      zzbbc localzzbbc = zzbbk.zzaZ;
      if (((Long)zzba.zzc().zzb(localzzbbc)).longValue() > 0L)
      {
        this.zza.animate().cancel();
        this.zza.clearAnimation();
      }
      return;
    }
    this.zza.setVisibility(0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */