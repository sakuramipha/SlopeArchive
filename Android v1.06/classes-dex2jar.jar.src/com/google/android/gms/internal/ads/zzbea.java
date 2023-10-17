package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbea
  extends RelativeLayout
{
  private static final float[] zza = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  private AnimationDrawable zzb;
  
  public zzbea(Context paramContext, zzbdz paramzzbdz, RelativeLayout.LayoutParams paramLayoutParams)
  {
    super(paramContext);
    Preconditions.checkNotNull(paramzzbdz);
    Object localObject = new ShapeDrawable(new RoundRectShape(zza, null, null));
    ((ShapeDrawable)localObject).getPaint().setColor(paramzzbdz.zzd());
    setLayoutParams(paramLayoutParams);
    setBackground((Drawable)localObject);
    paramLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    if (!TextUtils.isEmpty(paramzzbdz.zzg()))
    {
      localObject = new RelativeLayout.LayoutParams(-2, -2);
      TextView localTextView = new TextView(paramContext);
      localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localTextView.setId(1195835393);
      localTextView.setTypeface(Typeface.DEFAULT);
      localTextView.setText(paramzzbdz.zzg());
      localTextView.setTextColor(paramzzbdz.zze());
      localTextView.setTextSize(paramzzbdz.zzf());
      zzay.zzb();
      int i = zzbzm.zzx(paramContext, 4);
      zzay.zzb();
      localTextView.setPadding(i, 0, zzbzm.zzx(paramContext, 4), 0);
      addView(localTextView);
      paramLayoutParams.addRule(1, localTextView.getId());
    }
    paramContext = new ImageView(paramContext);
    paramContext.setLayoutParams(paramLayoutParams);
    paramContext.setId(1195835394);
    paramLayoutParams = paramzzbdz.zzi();
    if ((paramLayoutParams != null) && (paramLayoutParams.size() > 1))
    {
      this.zzb = new AnimationDrawable();
      paramLayoutParams = paramLayoutParams.iterator();
      while (paramLayoutParams.hasNext())
      {
        localObject = (zzbec)paramLayoutParams.next();
        try
        {
          localObject = (Drawable)ObjectWrapper.unwrap(((zzbec)localObject).zzf());
          this.zzb.addFrame((Drawable)localObject, paramzzbdz.zzb());
        }
        catch (Exception localException)
        {
          zzbzt.zzh("Error while getting drawable.", localException);
        }
      }
      paramContext.setBackground(this.zzb);
    }
    else if (paramLayoutParams.size() == 1)
    {
      try
      {
        paramContext.setImageDrawable((Drawable)ObjectWrapper.unwrap(((zzbec)paramLayoutParams.get(0)).zzf()));
      }
      catch (Exception paramzzbdz)
      {
        zzbzt.zzh("Error while getting drawable.", paramzzbdz);
      }
    }
    addView(paramContext);
  }
  
  public final void onAttachedToWindow()
  {
    AnimationDrawable localAnimationDrawable = this.zzb;
    if (localAnimationDrawable != null) {
      localAnimationDrawable.start();
    }
    super.onAttachedToWindow();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */