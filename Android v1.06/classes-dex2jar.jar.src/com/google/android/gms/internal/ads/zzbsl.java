package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

final class zzbsl
  extends zzbyg
{
  zzbsl(zzbsm paramzzbsm, QueryInfoGenerationCallback paramQueryInfoGenerationCallback) {}
  
  public final void zzb(String paramString)
  {
    this.zza.onFailure(paramString);
  }
  
  public final void zzc(String paramString1, String paramString2, Bundle paramBundle)
  {
    paramString1 = new QueryInfo(new zzem(paramString1, paramBundle, paramString2));
    this.zza.onSuccess(paramString1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */