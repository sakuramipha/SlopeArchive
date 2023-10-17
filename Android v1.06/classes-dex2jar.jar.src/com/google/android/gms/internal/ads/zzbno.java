package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

public final class zzbno
  extends zzcgr
{
  private final AppMeasurementSdk zza;
  
  zzbno(AppMeasurementSdk paramAppMeasurementSdk)
  {
    this.zza = paramAppMeasurementSdk;
  }
  
  public final int zzb(String paramString)
    throws RemoteException
  {
    return this.zza.getMaxUserProperties(paramString);
  }
  
  public final long zzc()
    throws RemoteException
  {
    return this.zza.generateEventId();
  }
  
  public final Bundle zzd(Bundle paramBundle)
    throws RemoteException
  {
    return this.zza.performActionWithResponse(paramBundle);
  }
  
  public final String zze()
    throws RemoteException
  {
    return this.zza.getAppIdOrigin();
  }
  
  public final String zzf()
    throws RemoteException
  {
    return this.zza.getAppInstanceId();
  }
  
  public final String zzg()
    throws RemoteException
  {
    return this.zza.getCurrentScreenClass();
  }
  
  public final String zzh()
    throws RemoteException
  {
    return this.zza.getCurrentScreenName();
  }
  
  public final String zzi()
    throws RemoteException
  {
    return this.zza.getGmpAppId();
  }
  
  public final List zzj(String paramString1, String paramString2)
    throws RemoteException
  {
    return this.zza.getConditionalUserProperties(paramString1, paramString2);
  }
  
  public final Map zzk(String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException
  {
    return this.zza.getUserProperties(paramString1, paramString2, paramBoolean);
  }
  
  public final void zzl(String paramString)
    throws RemoteException
  {
    this.zza.beginAdUnitExposure(paramString);
  }
  
  public final void zzm(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    this.zza.clearConditionalUserProperty(paramString1, paramString2, paramBundle);
  }
  
  public final void zzn(String paramString)
    throws RemoteException
  {
    this.zza.endAdUnitExposure(paramString);
  }
  
  public final void zzo(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    this.zza.logEvent(paramString1, paramString2, paramBundle);
  }
  
  public final void zzp(Bundle paramBundle)
    throws RemoteException
  {
    this.zza.performAction(paramBundle);
  }
  
  public final void zzq(Bundle paramBundle)
    throws RemoteException
  {
    this.zza.setConditionalUserProperty(paramBundle);
  }
  
  public final void zzr(Bundle paramBundle)
    throws RemoteException
  {
    this.zza.setConsent(paramBundle);
  }
  
  public final void zzs(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2)
    throws RemoteException
  {
    AppMeasurementSdk localAppMeasurementSdk = this.zza;
    if (paramIObjectWrapper != null) {
      paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    } else {
      paramIObjectWrapper = null;
    }
    localAppMeasurementSdk.setCurrentScreen(paramIObjectWrapper, paramString1, paramString2);
  }
  
  public final void zzt(String paramString1, String paramString2, IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    AppMeasurementSdk localAppMeasurementSdk = this.zza;
    if (paramIObjectWrapper != null) {
      paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
    } else {
      paramIObjectWrapper = null;
    }
    localAppMeasurementSdk.setUserProperty(paramString1, paramString2, paramIObjectWrapper);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */