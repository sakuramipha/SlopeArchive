package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdgl
  extends zzbem
{
  private final zzdhc zza;
  private IObjectWrapper zzb;
  
  public zzdgl(zzdhc paramzzdhc)
  {
    this.zza = paramzzdhc;
  }
  
  private static float zzb(IObjectWrapper paramIObjectWrapper)
  {
    float f2 = 0.0F;
    if (paramIObjectWrapper == null) {
      return 0.0F;
    }
    paramIObjectWrapper = (Drawable)ObjectWrapper.unwrap(paramIObjectWrapper);
    float f1 = f2;
    if (paramIObjectWrapper != null)
    {
      f1 = f2;
      if (paramIObjectWrapper.getIntrinsicWidth() != -1)
      {
        f1 = f2;
        if (paramIObjectWrapper.getIntrinsicHeight() != -1) {
          f1 = paramIObjectWrapper.getIntrinsicWidth() / paramIObjectWrapper.getIntrinsicHeight();
        }
      }
    }
    return f1;
  }
  
  public final float zze()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzfX;
    boolean bool = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
    float f2 = 0.0F;
    float f1 = 0.0F;
    if (!bool) {
      return 0.0F;
    }
    if (this.zza.zzb() != 0.0F) {
      return this.zza.zzb();
    }
    if (this.zza.zzj() != null)
    {
      try
      {
        f2 = this.zza.zzj().zze();
        f1 = f2;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Remote exception getting video controller aspect ratio.", localRemoteException);
      }
      return f1;
    }
    Object localObject = this.zzb;
    if (localObject != null)
    {
      f1 = zzb((IObjectWrapper)localObject);
    }
    else
    {
      localObject = this.zza.zzm();
      if (localObject == null)
      {
        f1 = f2;
      }
      else
      {
        if ((((zzbeq)localObject).zzd() != -1) && (((zzbeq)localObject).zzc() != -1)) {
          f1 = ((zzbeq)localObject).zzd() / ((zzbeq)localObject).zzc();
        } else {
          f1 = 0.0F;
        }
        if (f1 == 0.0F) {
          return zzb(((zzbeq)localObject).zzf());
        }
      }
    }
    return f1;
  }
  
  public final float zzf()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzfY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return 0.0F;
    }
    if (this.zza.zzj() != null) {
      return this.zza.zzj().zzf();
    }
    return 0.0F;
  }
  
  public final float zzg()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzfY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return 0.0F;
    }
    if (this.zza.zzj() != null) {
      return this.zza.zzj().zzg();
    }
    return 0.0F;
  }
  
  public final zzdq zzh()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzfY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return null;
    }
    return this.zza.zzj();
  }
  
  public final IObjectWrapper zzi()
    throws RemoteException
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      return (IObjectWrapper)localObject;
    }
    localObject = this.zza.zzm();
    if (localObject == null) {
      return null;
    }
    return ((zzbeq)localObject).zzf();
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
  {
    this.zzb = paramIObjectWrapper;
  }
  
  public final boolean zzk()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzfY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return false;
    }
    return this.zza.zzad();
  }
  
  public final boolean zzl()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzfY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return false;
    }
    return this.zza.zzj() != null;
  }
  
  public final void zzm(zzbfy paramzzbfy)
  {
    zzbbc localzzbbc = zzbbk.zzfY;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return;
    }
    if ((this.zza.zzj() instanceof zzcfx)) {
      ((zzcfx)this.zza.zzj()).zzv(paramzzbfy);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */