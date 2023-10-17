package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzi
  extends RemoteCreator
{
  public zzi()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public final zzbq zza(Context paramContext, String paramString, zzbny paramzzbny)
  {
    Object localObject = null;
    try
    {
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(paramContext);
      paramContext = ((zzbr)getRemoteCreatorInstance(paramContext)).zze(localIObjectWrapper, paramString, paramzzbny, 231700000);
      if (paramContext == null)
      {
        paramContext = (Context)localObject;
      }
      else
      {
        paramString = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if ((paramString instanceof zzbq)) {}
        for (paramContext = (zzbq)paramString;; paramContext = new zzbo(paramContext)) {
          break;
        }
      }
      return paramContext;
    }
    catch (RemoteCreator.RemoteCreatorException paramContext) {}catch (RemoteException paramContext) {}
    zzbzt.zzk("Could not create remote builder for AdLoader.", paramContext);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */