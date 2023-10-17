package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

final class zzbov
  implements MediationAdLoadCallback
{
  final zzboy zzb;
  
  zzbov(zzboy paramzzboy, zzboe paramzzboe) {}
  
  public final void onFailure(AdError paramAdError)
  {
    try
    {
      String str2 = zzboy.zzb(this.zzb).getClass().getCanonicalName();
      int i = paramAdError.getCode();
      String str1 = paramAdError.getMessage();
      String str3 = paramAdError.getDomain();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str2);
      localStringBuilder.append("failed to load mediation ad: ErrorCode = ");
      localStringBuilder.append(i);
      localStringBuilder.append(". ErrorMessage = ");
      localStringBuilder.append(str1);
      localStringBuilder.append(". ErrorDomain = ");
      localStringBuilder.append(str3);
      zzbzt.zze(localStringBuilder.toString());
      this.zza.zzh(paramAdError.zza());
      this.zza.zzi(paramAdError.getCode(), paramAdError.getMessage());
      this.zza.zzg(paramAdError.getCode());
      return;
    }
    catch (RemoteException paramAdError)
    {
      zzbzt.zzh("", paramAdError);
    }
  }
  
  public final void onFailure(String paramString)
  {
    onFailure(new AdError(0, paramString, "undefined"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */