package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

public final class zzbgp
  extends RemoteCreator
{
  public zzbgp()
  {
    super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
  }
  
  public final zzbeu zza(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    Object localObject = null;
    try
    {
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(paramContext);
      paramFrameLayout1 = ObjectWrapper.wrap(paramFrameLayout1);
      paramFrameLayout2 = ObjectWrapper.wrap(paramFrameLayout2);
      paramContext = ((zzbex)getRemoteCreatorInstance(paramContext)).zze(localIObjectWrapper, paramFrameLayout1, paramFrameLayout2, 231700000);
      if (paramContext == null)
      {
        paramContext = (Context)localObject;
      }
      else
      {
        paramFrameLayout1 = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if ((paramFrameLayout1 instanceof zzbeu)) {}
        for (paramContext = (zzbeu)paramFrameLayout1;; paramContext = new zzbes(paramContext)) {
          break;
        }
      }
      return paramContext;
    }
    catch (RemoteCreator.RemoteCreatorException paramContext) {}catch (RemoteException paramContext) {}
    zzbzt.zzk("Could not create remote NativeAdViewDelegate.", paramContext);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */