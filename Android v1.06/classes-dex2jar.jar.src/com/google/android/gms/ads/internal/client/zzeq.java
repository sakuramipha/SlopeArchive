package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzeq
  extends RemoteCreator
{
  public zzeq()
  {
    super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
  }
  
  public final zzco zza(Context paramContext)
  {
    IInterface localIInterface = null;
    try
    {
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(paramContext);
      paramContext = ((zzcp)getRemoteCreatorInstance(paramContext)).zze(localIObjectWrapper, 231700000);
      if (paramContext == null)
      {
        paramContext = localIInterface;
      }
      else
      {
        localIInterface = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
        if ((localIInterface instanceof zzco)) {}
        for (paramContext = (zzco)localIInterface;; paramContext = new zzcm(paramContext)) {
          break;
        }
      }
      return paramContext;
    }
    catch (RemoteCreator.RemoteCreatorException paramContext) {}catch (RemoteException paramContext) {}
    zzbzt.zzk("Could not get remote MobileAdsSettingManager.", paramContext);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */