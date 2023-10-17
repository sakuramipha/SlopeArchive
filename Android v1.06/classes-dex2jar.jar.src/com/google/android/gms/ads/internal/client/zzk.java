package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

public final class zzk
  extends RemoteCreator
{
  private zzbta zza;
  
  public zzk()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public final zzbu zza(Context paramContext, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
  {
    zzbbk.zza(paramContext);
    Object localObject = zzbbk.zzjl;
    boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    IObjectWrapper localIObjectWrapper = null;
    localObject = null;
    if (bool)
    {
      try
      {
        localIObjectWrapper = ObjectWrapper.wrap(paramContext);
        paramzzq = ((zzbv)zzbzx.zzb(paramContext, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(localIObjectWrapper, paramzzq, paramString, paramzzbny, 231700000, paramInt);
        if (paramzzq == null)
        {
          paramContext = (Context)localObject;
          break label155;
        }
        paramString = paramzzq.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if ((paramString instanceof zzbu)) {
          paramzzq = (zzbu)paramString;
        }
        for (paramContext = paramzzq;; paramContext = paramzzq)
        {
          break;
          paramzzq = new zzbs(paramzzq);
        }
        paramContext = zzbsy.zza(paramContext);
      }
      catch (NullPointerException paramzzq) {}catch (RemoteException paramzzq) {}catch (zzbzw paramzzq) {}
      this.zza = paramContext;
      paramContext.zzf(paramzzq, "AdManagerCreator.newAdManagerByDynamiteLoader");
      zzbzt.zzl("#007 Could not call remote method.", paramzzq);
      paramContext = (Context)localObject;
      label155:
      return paramContext;
    }
    try
    {
      localObject = ObjectWrapper.wrap(paramContext);
      paramContext = ((zzbv)getRemoteCreatorInstance(paramContext)).zze((IObjectWrapper)localObject, paramzzq, paramString, paramzzbny, 231700000, paramInt);
      if (paramContext == null)
      {
        paramContext = localIObjectWrapper;
      }
      else
      {
        paramzzq = paramContext.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if ((paramzzq instanceof zzbu)) {}
        for (paramContext = (zzbu)paramzzq;; paramContext = new zzbs(paramContext)) {
          break;
        }
      }
      return paramContext;
    }
    catch (RemoteCreator.RemoteCreatorException paramContext) {}catch (RemoteException paramContext) {}
    zzbzt.zzf("Could not create remote AdManager.", paramContext);
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */