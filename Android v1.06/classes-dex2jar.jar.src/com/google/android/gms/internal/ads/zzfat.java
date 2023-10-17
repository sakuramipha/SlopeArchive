package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfat
{
  private static zzfat zza;
  private final Context zzb;
  private final zzcl zzc;
  private final AtomicReference zzd = new AtomicReference();
  
  zzfat(Context paramContext, zzcl paramzzcl)
  {
    this.zzb = paramContext;
    this.zzc = paramzzcl;
  }
  
  static zzcl zza(Context paramContext)
  {
    try
    {
      paramContext = zzck.asInterface((IBinder)paramContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[] { Context.class }).newInstance(new Object[] { paramContext }));
      return paramContext;
    }
    catch (InvocationTargetException paramContext) {}catch (InstantiationException paramContext) {}catch (IllegalAccessException paramContext) {}catch (NoSuchMethodException paramContext) {}catch (ClassNotFoundException paramContext) {}catch (ClassCastException paramContext) {}
    zzbzt.zzh("Failed to retrieve lite SDK info.", paramContext);
    return null;
  }
  
  public static zzfat zzd(Context paramContext)
  {
    try
    {
      zzfat localzzfat = zza;
      if (localzzfat != null) {
        return localzzfat;
      }
      Context localContext = paramContext.getApplicationContext();
      long l = ((Long)zzbdg.zzb.zze()).longValue();
      localzzfat = null;
      paramContext = localzzfat;
      if (l > 0L)
      {
        paramContext = localzzfat;
        if (l <= 231710100L) {
          paramContext = zza(localContext);
        }
      }
      localzzfat = new com/google/android/gms/internal/ads/zzfat;
      localzzfat.<init>(localContext, paramContext);
      zza = localzzfat;
      return localzzfat;
    }
    finally {}
  }
  
  public final zzbny zzb()
  {
    return (zzbny)this.zzd.get();
  }
  
  public final zzbzz zzc(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    zzt.zzp();
    paramBoolean = zzs.zzA(this.zzb);
    zzbzz localzzbzz = new zzbzz(231700000, paramInt2, true, paramBoolean);
    Object localObject1 = localzzbzz;
    if (((Boolean)zzbdg.zzc.zze()).booleanValue())
    {
      Object localObject2 = this.zzc;
      localObject1 = null;
      if (localObject2 != null) {
        try
        {
          localObject2 = ((zzcl)localObject2).getLiteSdkVersion();
          localObject1 = localObject2;
        }
        catch (RemoteException localRemoteException) {}
      }
      if (localObject1 == null) {
        return localzzbzz;
      }
      localObject1 = new zzbzz(231700000, ((zzen)localObject1).zza(), true, paramBoolean);
    }
    return (zzbzz)localObject1;
  }
  
  public final void zze(zzbny paramzzbny)
  {
    Object localObject;
    if (((Boolean)zzbdg.zza.zze()).booleanValue())
    {
      localObject = this.zzc;
      if (localObject != null) {}
    }
    for (;;)
    {
      localObject = null;
      try
      {
        localObject = ((zzcl)localObject).getAdapterCreator();
        AtomicReference localAtomicReference = this.zzd;
        if (localObject != null) {
          paramzzbny = (zzbny)localObject;
        }
        zzfas.zza(localAtomicReference, null, paramzzbny);
        return;
      }
      catch (RemoteException localRemoteException) {}
      zzfas.zza(this.zzd, null, paramzzbny);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */