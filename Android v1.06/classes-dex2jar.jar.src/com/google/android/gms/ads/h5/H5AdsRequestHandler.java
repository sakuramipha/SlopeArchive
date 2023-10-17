package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbjm;

public final class H5AdsRequestHandler
{
  private final zzbjm zza;
  
  public H5AdsRequestHandler(Context paramContext, OnH5AdsEventListener paramOnH5AdsEventListener)
  {
    this.zza = new zzbjm(paramContext, paramOnH5AdsEventListener);
  }
  
  public void clearAdObjects()
  {
    this.zza.zza();
  }
  
  public boolean handleH5AdsRequest(String paramString)
  {
    return this.zza.zzb(paramString);
  }
  
  public boolean shouldInterceptRequest(String paramString)
  {
    return zzbjm.zzc(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\h5\H5AdsRequestHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */