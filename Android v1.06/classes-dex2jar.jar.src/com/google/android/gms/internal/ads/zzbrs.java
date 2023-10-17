package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

public final class zzbrs
  extends RemoteCreator
{
  public zzbrs()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public final zzbrv zza(Activity paramActivity)
  {
    IInterface localIInterface = null;
    try
    {
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(paramActivity);
      paramActivity = ((zzbry)getRemoteCreatorInstance(paramActivity)).zze(localIObjectWrapper);
      if (paramActivity == null)
      {
        paramActivity = localIInterface;
      }
      else
      {
        localIInterface = paramActivity.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if ((localIInterface instanceof zzbrv)) {}
        for (paramActivity = (zzbrv)localIInterface;; paramActivity = new zzbrt(paramActivity)) {
          break;
        }
      }
      return paramActivity;
    }
    catch (RemoteCreator.RemoteCreatorException paramActivity)
    {
      zzbzt.zzk("Could not create remote AdOverlay.", paramActivity);
      return null;
    }
    catch (RemoteException paramActivity)
    {
      zzbzt.zzk("Could not create remote AdOverlay.", paramActivity);
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */