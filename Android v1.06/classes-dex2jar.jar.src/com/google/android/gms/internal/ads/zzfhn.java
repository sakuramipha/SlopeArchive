package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class zzfhn
  implements zzfhl
{
  private final zzfhl zza;
  
  public zzfhn(zzfhl paramzzfhl)
  {
    this.zza = paramzzfhl;
  }
  
  public final JSONObject zza(View paramView)
  {
    throw null;
  }
  
  public final void zzb(View paramView, JSONObject paramJSONObject, zzfhk paramzzfhk, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList = new ArrayList();
    paramView = zzfhd.zza();
    if (paramView != null)
    {
      paramView = paramView.zzb();
      i = paramView.size();
      IdentityHashMap localIdentityHashMap = new IdentityHashMap(i + i + 3);
      Iterator localIterator = paramView.iterator();
      while (localIterator.hasNext())
      {
        View localView = ((zzfgs)localIterator.next()).zzf();
        if ((localView != null) && (localView.isAttachedToWindow()) && (localView.isShown()))
        {
          paramView = localView;
          for (;;)
          {
            if (paramView == null) {
              break label141;
            }
            if (paramView.getAlpha() == 0.0F) {
              break;
            }
            paramView = paramView.getParent();
            if ((paramView instanceof View)) {
              paramView = (View)paramView;
            } else {
              paramView = null;
            }
          }
          label141:
          paramView = localView.getRootView();
          if ((paramView != null) && (!localIdentityHashMap.containsKey(paramView)))
          {
            localIdentityHashMap.put(paramView, paramView);
            float f = zzfhw.zza(paramView);
            for (i = localArrayList.size(); i > 0; i = j)
            {
              j = i - 1;
              if (zzfhw.zza((View)localArrayList.get(j)) <= f) {
                break;
              }
            }
            localArrayList.add(i, paramView);
          }
        }
      }
    }
    int j = localArrayList.size();
    for (int i = 0; i < j; i++) {
      paramzzfhk.zza((View)localArrayList.get(i), this.zza, paramJSONObject, paramBoolean2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */