package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import java.util.Iterator;
import java.util.List;

public class MediationUtils
{
  protected static final double MIN_HEIGHT_RATIO = 0.7D;
  protected static final double MIN_WIDTH_RATIO = 0.5D;
  
  public static AdSize findClosestSize(Context paramContext, AdSize paramAdSize, List<AdSize> paramList)
  {
    AdSize localAdSize = null;
    Object localObject2 = null;
    Object localObject1 = localAdSize;
    if (paramList != null) {
      if (paramAdSize == null)
      {
        localObject1 = localAdSize;
      }
      else
      {
        localAdSize = paramAdSize;
        if (!paramAdSize.zzh())
        {
          localAdSize = paramAdSize;
          if (!paramAdSize.zzi())
          {
            float f = paramContext.getResources().getDisplayMetrics().density;
            localAdSize = new AdSize(Math.round(paramAdSize.getWidthInPixels(paramContext) / f), Math.round(paramAdSize.getHeightInPixels(paramContext) / f));
          }
        }
        paramList = paramList.iterator();
        paramContext = (Context)localObject2;
        for (;;)
        {
          localObject1 = paramContext;
          if (!paramList.hasNext()) {
            break;
          }
          paramAdSize = (AdSize)paramList.next();
          if (paramAdSize != null)
          {
            int k = localAdSize.getWidth();
            int j = paramAdSize.getWidth();
            int m = localAdSize.getHeight();
            double d1 = k;
            double d2 = j;
            int i = paramAdSize.getHeight();
            if ((d1 * 0.5D <= d2) && (k >= j))
            {
              if (localAdSize.zzi())
              {
                k = localAdSize.zza();
                localObject1 = zzbbk.zzhs;
                if (((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue() > j) {
                  continue;
                }
                localObject1 = zzbbk.zzht;
                if ((((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue() > i) || (k < i)) {
                  continue;
                }
                break label297;
              }
              label297:
              if ((localAdSize.zzh() ? localAdSize.zzb() >= i : (m * 0.7D <= i) && (m >= i)) && ((paramContext == null) || (paramContext.getWidth() * paramContext.getHeight() <= paramAdSize.getWidth() * paramAdSize.getHeight()))) {
                paramContext = paramAdSize;
              }
            }
          }
        }
      }
    }
    return (AdSize)localObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\MediationUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */