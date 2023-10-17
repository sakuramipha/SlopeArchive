package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzboz
  extends zzbog
{
  private final MediationInterscrollerAd zza;
  
  public zzboz(MediationInterscrollerAd paramMediationInterscrollerAd)
  {
    this.zza = paramMediationInterscrollerAd;
  }
  
  public final IObjectWrapper zze()
  {
    return ObjectWrapper.wrap(this.zza.getView());
  }
  
  public final boolean zzf()
  {
    return this.zza.shouldDelegateInterscrollerEffect();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzboz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */