package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

public final class zzh
  extends zzbj
{
  private final AdLoadCallback zza;
  private final Object zzb;
  
  public zzh(AdLoadCallback paramAdLoadCallback, Object paramObject)
  {
    this.zza = paramAdLoadCallback;
    this.zzb = paramObject;
  }
  
  public final void zzb(zze paramzze)
  {
    AdLoadCallback localAdLoadCallback = this.zza;
    if (localAdLoadCallback != null) {
      localAdLoadCallback.onAdFailedToLoad(paramzze.zzb());
    }
  }
  
  public final void zzc()
  {
    AdLoadCallback localAdLoadCallback = this.zza;
    if (localAdLoadCallback != null)
    {
      Object localObject = this.zzb;
      if (localObject != null) {
        localAdLoadCallback.onAdLoaded(localObject);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */