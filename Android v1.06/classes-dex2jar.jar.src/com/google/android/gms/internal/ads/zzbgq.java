package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import java.util.HashMap;

public final class zzbgq
  extends RemoteCreator
{
  public zzbgq()
  {
    super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
  }
  
  public final zzbfa zza(View paramView, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    Object localObject = null;
    try
    {
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(paramView);
      paramHashMap1 = ObjectWrapper.wrap(paramHashMap1);
      paramHashMap2 = ObjectWrapper.wrap(paramHashMap2);
      paramView = ((zzbfd)getRemoteCreatorInstance(paramView.getContext())).zze(localIObjectWrapper, paramHashMap1, paramHashMap2);
      if (paramView == null)
      {
        paramView = (View)localObject;
      }
      else
      {
        paramHashMap1 = paramView.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if ((paramHashMap1 instanceof zzbfa)) {}
        for (paramView = (zzbfa)paramHashMap1;; paramView = new zzbey(paramView)) {
          break;
        }
      }
      return paramView;
    }
    catch (RemoteCreator.RemoteCreatorException paramView) {}catch (RemoteException paramView) {}
    zzbzt.zzk("Could not create remote NativeAdViewHolderDelegate.", paramView);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */