package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class zzcnb
  implements zzcml
{
  private final CookieManager zza;
  
  public zzcnb(Context paramContext)
  {
    this.zza = zzt.zzq().zzb(paramContext);
  }
  
  public final void zza(Map paramMap)
  {
    if (this.zza == null) {
      return;
    }
    if ((String)paramMap.get("clear") != null)
    {
      paramMap = zzbbk.zzaK;
      paramMap = (String)zzba.zzc().zzb(paramMap);
      localObject1 = this.zza.getCookie(paramMap);
      if (localObject1 != null)
      {
        localObject2 = zzfpm.zzc(zzfok.zzc(';')).zzf((CharSequence)localObject1);
        int i = 0;
        while (i < ((List)localObject2).size())
        {
          localObject1 = this.zza;
          Object localObject3 = (String)((List)localObject2).get(i);
          localObject3 = zzfpm.zzc(zzfok.zzc('=')).zzd((CharSequence)localObject3).iterator();
          Objects.requireNonNull(localObject3);
          if (((Iterator)localObject3).hasNext())
          {
            localObject3 = (String)((Iterator)localObject3).next();
            Object localObject4 = zzbbk.zzax;
            localObject4 = (String)zzba.zzc().zzb((zzbbc)localObject4);
            ((CookieManager)localObject1).setCookie(paramMap, String.valueOf(localObject3).concat(String.valueOf(localObject4)));
            i++;
          }
          else
          {
            paramMap = new StringBuilder();
            paramMap.append("position (0) must be less than the number of elements that remained (");
            paramMap.append(0);
            paramMap.append(")");
            throw new IndexOutOfBoundsException(paramMap.toString());
          }
        }
      }
      return;
    }
    Object localObject2 = (String)paramMap.get("cookie");
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      return;
    }
    paramMap = this.zza;
    Object localObject1 = zzbbk.zzaK;
    paramMap.setCookie((String)zzba.zzc().zzb((zzbbc)localObject1), (String)localObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */