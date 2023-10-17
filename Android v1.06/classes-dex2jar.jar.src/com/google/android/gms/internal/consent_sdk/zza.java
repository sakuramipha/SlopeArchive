package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zza
{
  private final Application zza;
  
  public zza(Application paramApplication)
  {
    this.zza = paramApplication;
  }
  
  public final String zza()
  {
    try
    {
      String str = AdvertisingIdClient.getAdvertisingIdInfo(this.zza).getId();
      return str;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException) {}catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}catch (IOException localIOException) {}
    Log.d("UserMessagingPlatform", "Failed to get ad id.", localIOException);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */