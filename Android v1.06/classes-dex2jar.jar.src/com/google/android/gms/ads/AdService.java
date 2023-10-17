package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbzt;

public class AdService
  extends IntentService
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";
  
  public AdService()
  {
    super("AdService");
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    try
    {
      zzaw localzzaw = zzay.zza();
      zzbnv localzzbnv = new com/google/android/gms/internal/ads/zzbnv;
      localzzbnv.<init>();
      localzzaw.zzm(this, localzzbnv).zze(paramIntent);
      return;
    }
    catch (RemoteException paramIntent)
    {
      zzbzt.zzg("RemoteException calling handleNotificationIntent: ".concat(paramIntent.toString()));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */