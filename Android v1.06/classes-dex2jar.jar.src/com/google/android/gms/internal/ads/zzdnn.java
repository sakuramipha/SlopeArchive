package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.ArrayList;
import java.util.List;

public final class zzdnn
  extends FrameLayout
{
  private final zzas zza;
  
  public zzdnn(Context paramContext, View paramView, zzas paramzzas)
  {
    super(paramContext);
    setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(paramView);
    this.zza = paramzzas;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.zza.zzm(paramMotionEvent);
    return false;
  }
  
  public final void removeAllViews()
  {
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if ((localView != null) && ((localView instanceof zzcfb))) {
        localArrayList.add((zzcfb)localView);
      }
    }
    super.removeAllViews();
    int k = localArrayList.size();
    for (i = j; i < k; i++) {
      ((zzcfb)localArrayList.get(i)).destroy();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */