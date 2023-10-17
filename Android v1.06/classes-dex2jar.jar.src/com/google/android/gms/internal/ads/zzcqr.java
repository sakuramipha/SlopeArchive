package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONObject;

public final class zzcqr
  extends FrameLayout
  implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener
{
  private final Context zza;
  private View zzb;
  
  private zzcqr(Context paramContext)
  {
    super(paramContext);
    this.zza = paramContext;
  }
  
  public static zzcqr zza(Context paramContext, View paramView, zzezf paramzzezf)
  {
    paramContext = new zzcqr(paramContext);
    if (!paramzzezf.zzv.isEmpty())
    {
      localObject = paramContext.zza.getResources();
      if (localObject != null)
      {
        localObject = ((Resources)localObject).getDisplayMetrics();
        if (localObject != null)
        {
          zzezg localzzezg = (zzezg)paramzzezf.zzv.get(0);
          float f1 = localzzezg.zza;
          float f3 = ((DisplayMetrics)localObject).density;
          float f2 = localzzezg.zzb;
          float f4 = ((DisplayMetrics)localObject).density;
          paramContext.setLayoutParams(new FrameLayout.LayoutParams((int)(f1 * f3), (int)(f2 * f4)));
        }
      }
    }
    paramContext.zzb = paramView;
    paramContext.addView(paramView);
    zzt.zzx();
    zzcat.zzb(paramContext, paramContext);
    zzt.zzx();
    zzcat.zza(paramContext, paramContext);
    paramzzezf = paramzzezf.zzai;
    paramView = new RelativeLayout(paramContext.zza);
    Object localObject = paramzzezf.optJSONObject("header");
    if (localObject != null) {
      paramContext.zzc((JSONObject)localObject, paramView, 10);
    }
    paramzzezf = paramzzezf.optJSONObject("footer");
    if (paramzzezf != null) {
      paramContext.zzc(paramzzezf, paramView, 12);
    }
    paramContext.addView(paramView);
    return paramContext;
  }
  
  private final int zzb(double paramDouble)
  {
    zzay.zzb();
    return zzbzm.zzx(this.zza, (int)paramDouble);
  }
  
  private final void zzc(JSONObject paramJSONObject, RelativeLayout paramRelativeLayout, int paramInt)
  {
    TextView localTextView = new TextView(this.zza);
    localTextView.setTextColor(-1);
    localTextView.setBackgroundColor(-16777216);
    localTextView.setGravity(17);
    localTextView.setText(paramJSONObject.optString("text", ""));
    localTextView.setTextSize((float)paramJSONObject.optDouble("text_size", 11.0D));
    int i = zzb(paramJSONObject.optDouble("padding", 0.0D));
    localTextView.setPadding(0, i, 0, i);
    paramJSONObject = new RelativeLayout.LayoutParams(-1, zzb(paramJSONObject.optDouble("height", 15.0D)));
    paramJSONObject.addRule(paramInt);
    paramRelativeLayout.addView(localTextView, paramJSONObject);
  }
  
  public final void onGlobalLayout()
  {
    int[] arrayOfInt = new int[2];
    getLocationInWindow(arrayOfInt);
    this.zzb.setY(-arrayOfInt[1]);
  }
  
  public final void onScrollChanged()
  {
    int[] arrayOfInt = new int[2];
    getLocationInWindow(arrayOfInt);
    this.zzb.setY(-arrayOfInt[1]);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */