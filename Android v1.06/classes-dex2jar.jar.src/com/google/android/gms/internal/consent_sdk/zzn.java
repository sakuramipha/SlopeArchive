package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentDebugSettings.Builder;
import com.google.android.ump.ConsentRequestParameters;

final class zzn
{
  private final Application zza;
  private final zza zzb;
  private final zzas zzc;
  
  zzn(Application paramApplication, zza paramzza, zzas paramzzas)
  {
    this.zza = paramApplication;
    this.zzb = paramzza;
    this.zzc = paramzzas;
  }
  
  final zzck zzd(Activity paramActivity, ConsentRequestParameters paramConsentRequestParameters)
    throws zzi
  {
    ConsentDebugSettings localConsentDebugSettings2 = paramConsentRequestParameters.getConsentDebugSettings();
    ConsentDebugSettings localConsentDebugSettings1 = localConsentDebugSettings2;
    if (localConsentDebugSettings2 == null) {
      localConsentDebugSettings1 = new ConsentDebugSettings.Builder(this.zza).build();
    }
    return zzp.zza(new zzp(this, paramActivity, localConsentDebugSettings1, paramConsentRequestParameters, null));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */