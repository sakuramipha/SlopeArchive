package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import java.io.IOException;

final class zzc
  extends zzb
{
  private final Context zza;
  
  zzc(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final void zza()
  {
    try
    {
      bool = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException) {}catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}catch (IllegalStateException localIllegalStateException) {}catch (IOException localIOException) {}
    zzbzt.zzh("Fail to get isAdIdFakeForDebugLogging", localIOException);
    boolean bool = false;
    zzbzs.zzj(bool);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Update ad debug logging enablement as ");
    localStringBuilder.append(bool);
    zzbzt.zzj(localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */