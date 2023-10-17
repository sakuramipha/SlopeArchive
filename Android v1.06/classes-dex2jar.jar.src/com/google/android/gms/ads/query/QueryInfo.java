package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbzi;
import java.util.concurrent.ExecutorService;

public class QueryInfo
{
  private final zzem zza;
  
  public QueryInfo(zzem paramzzem)
  {
    this.zza = paramzzem;
  }
  
  public static void generate(Context paramContext, AdFormat paramAdFormat, AdRequest paramAdRequest, QueryInfoGenerationCallback paramQueryInfoGenerationCallback)
  {
    zzbbk.zza(paramContext);
    if (((Boolean)zzbdb.zzk.zze()).booleanValue())
    {
      zzbbc localzzbbc = zzbbk.zzjG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzbzi.zzb.execute(new zza(paramContext, paramAdFormat, paramAdRequest, paramQueryInfoGenerationCallback));
        return;
      }
    }
    if (paramAdRequest == null) {
      paramAdRequest = null;
    } else {
      paramAdRequest = paramAdRequest.zza();
    }
    new zzbsm(paramContext, paramAdFormat, paramAdRequest).zzb(paramQueryInfoGenerationCallback);
  }
  
  public String getQuery()
  {
    return this.zza.zzb();
  }
  
  public Bundle getQueryBundle()
  {
    return this.zza.zza();
  }
  
  public String getRequestId()
  {
    return this.zza.zzc();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\query\QueryInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */