package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import java.lang.reflect.Constructor;
import java.util.Random;

abstract class zzax
{
  private static final zzce zza;
  
  static
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      if (!(localObject2 instanceof IBinder))
      {
        zzbzt.zzj("ClientApi class is not an instance of IBinder.");
      }
      else
      {
        localObject2 = (IBinder)localObject2;
        if (localObject2 != null)
        {
          IInterface localIInterface = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
          if ((localIInterface instanceof zzce)) {
            localObject2 = (zzce)localIInterface;
          }
          for (localObject1 = localObject2;; localObject1 = localObject2)
          {
            break;
            localObject2 = new zzcc((IBinder)localObject2);
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      zzbzt.zzj("Failed to instantiate ClientApi class.");
      zza = (zzce)localObject1;
    }
  }
  
  private final Object zze()
  {
    Object localObject = zza;
    if (localObject != null) {
      try
      {
        localObject = zzb((zzce)localObject);
        return localObject;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzk("Cannot invoke local loader using ClientApi class.", localRemoteException);
        return null;
      }
    }
    zzbzt.zzj("ClientApi class cannot be loaded.");
    return null;
  }
  
  private final Object zzf()
  {
    try
    {
      Object localObject = zzc();
      return localObject;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzk("Cannot invoke remote loader.", localRemoteException);
    }
    return null;
  }
  
  protected abstract Object zza();
  
  protected abstract Object zzb(zzce paramzzce)
    throws RemoteException;
  
  protected abstract Object zzc()
    throws RemoteException;
  
  public final Object zzd(Context paramContext, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (!paramBoolean)
    {
      zzay.zzb();
      bool = paramBoolean;
      if (!zzbzm.zzs(paramContext, 12451000))
      {
        zzbzt.zze("Google Play Services is not available.");
        bool = true;
      }
    }
    int i = DynamiteModule.getLocalVersion(paramContext, "com.google.android.gms.ads.dynamite");
    int k = DynamiteModule.getRemoteVersion(paramContext, "com.google.android.gms.ads.dynamite");
    int j = 0;
    if (i > k) {
      i = 0;
    } else {
      i = 1;
    }
    zzbbk.zza(paramContext);
    if (((Boolean)zzbcy.zza.zze()).booleanValue()) {}
    for (i = j;; i = bool | i ^ 0x1)
    {
      j = 0;
      break;
      if (((Boolean)zzbcy.zzb.zze()).booleanValue())
      {
        j = 1;
        i = 1;
        break;
      }
    }
    if (i != 0)
    {
      localObject = zze();
      paramContext = (Context)localObject;
      if (localObject == null)
      {
        paramContext = (Context)localObject;
        if (j == 0) {
          paramContext = zzf();
        }
      }
    }
    else
    {
      localObject = zzf();
      if (localObject == null)
      {
        i = ((Long)zzbdm.zza.zze()).intValue();
        if (zzay.zze().nextInt(i) == 0)
        {
          Bundle localBundle = new Bundle();
          localBundle.putString("action", "dynamite_load");
          localBundle.putInt("is_missing", 1);
          zzay.zzb().zzn(paramContext, zzay.zzc().zza, "gmob-apps", localBundle, true);
        }
      }
      if (localObject == null) {
        paramContext = zze();
      } else {
        paramContext = (Context)localObject;
      }
    }
    Object localObject = paramContext;
    if (paramContext == null) {
      localObject = zza();
    }
    return localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */