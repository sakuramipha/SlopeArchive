package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class zzfho
  implements zzfhl
{
  private final int[] zza = new int[2];
  
  public final JSONObject zza(View paramView)
  {
    if (paramView == null) {
      return zzfht.zza(0, 0, 0, 0);
    }
    int j = paramView.getWidth();
    int i = paramView.getHeight();
    paramView.getLocationOnScreen(this.zza);
    paramView = this.zza;
    return zzfht.zza(paramView[0], paramView[1], j, i);
  }
  
  public final void zzb(View paramView, JSONObject paramJSONObject, zzfhk paramzzfhk, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!(paramView instanceof ViewGroup)) {
      return;
    }
    ViewGroup localViewGroup = (ViewGroup)paramView;
    int j = 0;
    int i = j;
    if (paramBoolean1) {
      if (Build.VERSION.SDK_INT < 21)
      {
        i = j;
      }
      else
      {
        HashMap localHashMap = new HashMap();
        for (i = 0; i < localViewGroup.getChildCount(); i++)
        {
          View localView = localViewGroup.getChildAt(i);
          localArrayList = (ArrayList)localHashMap.get(Float.valueOf(localView.getZ()));
          paramView = localArrayList;
          if (localArrayList == null)
          {
            paramView = new ArrayList();
            localHashMap.put(Float.valueOf(localView.getZ()), paramView);
          }
          paramView.add(localView);
        }
        ArrayList localArrayList = new ArrayList(localHashMap.keySet());
        Collections.sort(localArrayList);
        int k = localArrayList.size();
        for (i = 0; i < k; i++)
        {
          paramView = (ArrayList)localHashMap.get((Float)localArrayList.get(i));
          int m = paramView.size();
          for (j = 0; j < m; j++) {
            paramzzfhk.zza((View)paramView.get(j), this, paramJSONObject, paramBoolean2);
          }
        }
      }
    }
    while (i < localViewGroup.getChildCount())
    {
      paramzzfhk.zza(localViewGroup.getChildAt(i), this, paramJSONObject, paramBoolean2);
      i++;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */