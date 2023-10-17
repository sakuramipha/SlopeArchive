package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzbys
  implements Runnable
{
  zzbys(zzbyt paramzzbyt, Context paramContext, zzcal paramzzcal) {}
  
  public final void run()
  {
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
      this.zzb.zzd(localInfo);
      return;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException) {}catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}catch (IllegalStateException localIllegalStateException) {}catch (IOException localIOException) {}
    this.zzb.zze(localIOException);
    zzbzt.zzh("Exception while getting advertising Id info", localIOException);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */