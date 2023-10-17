package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

public final class zzeds
  extends zzbvg
  implements zzcws
{
  private zzbvh zza;
  private zzcwr zzb;
  private zzddh zzc;
  
  public final void zza(zzcwr paramzzcwr)
  {
    try
    {
      this.zzb = paramzzcwr;
      return;
    }
    finally
    {
      paramzzcwr = finally;
      throw paramzzcwr;
    }
  }
  
  public final void zzc(zzbvh paramzzbvh)
  {
    try
    {
      this.zza = paramzzbvh;
      return;
    }
    finally
    {
      paramzzbvh = finally;
      throw paramzzbvh;
    }
  }
  
  public final void zzd(zzddh paramzzddh)
  {
    try
    {
      this.zzc = paramzzddh;
      return;
    }
    finally
    {
      paramzzddh = finally;
      throw paramzzddh;
    }
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zza;
      if (paramIObjectWrapper != null)
      {
        ((zzegq)paramIObjectWrapper).zzb.onAdClicked();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzf(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      zzbvh localzzbvh = this.zza;
      if (localzzbvh != null)
      {
        localzzbvh.zzf(paramIObjectWrapper);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzg(IObjectWrapper paramIObjectWrapper, int paramInt)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zzb;
      if (paramIObjectWrapper != null)
      {
        paramIObjectWrapper.zza(paramInt);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzh(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zza;
      if (paramIObjectWrapper != null)
      {
        ((zzegq)paramIObjectWrapper).zzc.zzb();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzi(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zzb;
      if (paramIObjectWrapper != null)
      {
        paramIObjectWrapper.zzd();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zza;
      if (paramIObjectWrapper != null)
      {
        ((zzegq)paramIObjectWrapper).zza.zzb();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzk(IObjectWrapper paramIObjectWrapper, int paramInt)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zzc;
      if (paramIObjectWrapper != null)
      {
        zzbzt.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzegp)paramIObjectWrapper).zzc.zza)));
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzl(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      zzddh localzzddh = this.zzc;
      if (localzzddh != null)
      {
        paramIObjectWrapper = zzegr.zzc(((zzegp)localzzddh).zzd);
        zzezr localzzezr = ((zzegp)localzzddh).zza;
        zzezf localzzezf = ((zzegp)localzzddh).zzb;
        zzeby localzzeby = ((zzegp)localzzddh).zzc;
        zzego localzzego = new com/google/android/gms/internal/ads/zzego;
        localzzego.<init>((zzegp)localzzddh, localzzezr, localzzezf, localzzeby);
        paramIObjectWrapper.execute(localzzego);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzm(IObjectWrapper paramIObjectWrapper, zzbvi paramzzbvi)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zza;
      if (paramIObjectWrapper != null)
      {
        ((zzegq)paramIObjectWrapper).zzd.zza(paramzzbvi);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzn(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zza;
      if (paramIObjectWrapper != null)
      {
        ((zzegq)paramIObjectWrapper).zzc.zze();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzo(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    try
    {
      paramIObjectWrapper = this.zza;
      if (paramIObjectWrapper != null)
      {
        ((zzegq)paramIObjectWrapper).zzd.zzc();
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */