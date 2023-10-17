package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzfae
{
  public static zzq zza(Context paramContext, List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      zzezg localzzezg = (zzezg)paramList.next();
      if (localzzezg.zzc) {
        localArrayList.add(AdSize.FLUID);
      } else {
        localArrayList.add(new AdSize(localzzezg.zza, localzzezg.zzb));
      }
    }
    return new zzq(paramContext, (AdSize[])localArrayList.toArray(new AdSize[localArrayList.size()]));
  }
  
  public static zzezg zzb(zzq paramzzq)
  {
    if (paramzzq.zzi) {
      return new zzezg(-3, 0, true);
    }
    return new zzezg(paramzzq.zze, paramzzq.zzb, false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */