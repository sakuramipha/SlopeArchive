package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbwb
{
  public static final zzbvp zza(Context paramContext, String paramString, zzbny paramzzbny)
  {
    IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(paramContext);
    Object localObject = null;
    try
    {
      paramContext = ((zzbvt)zzbzx.zzb(paramContext, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzbwa.zza)).zze(localIObjectWrapper, paramString, paramzzbny, 231700000);
      if (paramContext == null)
      {
        paramContext = (Context)localObject;
      }
      else
      {
        paramString = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if ((paramString instanceof zzbvp)) {}
        for (paramContext = (zzbvp)paramString;; paramContext = new zzbvn(paramContext)) {
          break;
        }
      }
      return paramContext;
    }
    catch (RemoteException paramContext) {}catch (zzbzw paramContext) {}
    zzbzt.zzl("#007 Could not call remote method.", paramContext);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */