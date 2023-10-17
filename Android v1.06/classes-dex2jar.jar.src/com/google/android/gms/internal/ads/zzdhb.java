package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import javax.annotation.Nullable;

public final class zzdhb
  extends zzdp
{
  private final Object zza = new Object();
  @Nullable
  private final zzdq zzb;
  @Nullable
  private final zzbon zzc;
  
  public zzdhb(@Nullable zzdq paramzzdq, @Nullable zzbon paramzzbon)
  {
    this.zzb = paramzzdq;
    this.zzc = paramzzbon;
  }
  
  public final float zze()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final float zzf()
    throws RemoteException
  {
    zzbon localzzbon = this.zzc;
    if (localzzbon != null) {
      return localzzbon.zzg();
    }
    return 0.0F;
  }
  
  public final float zzg()
    throws RemoteException
  {
    zzbon localzzbon = this.zzc;
    if (localzzbon != null) {
      return localzzbon.zzh();
    }
    return 0.0F;
  }
  
  public final int zzh()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  @Nullable
  public final zzdt zzi()
    throws RemoteException
  {
    synchronized (this.zza)
    {
      Object localObject2 = this.zzb;
      if (localObject2 != null)
      {
        localObject2 = ((zzdq)localObject2).zzi();
        return (zzdt)localObject2;
      }
      return null;
    }
  }
  
  public final void zzj(boolean paramBoolean)
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final void zzk()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final void zzl()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final void zzm(@Nullable zzdt paramzzdt)
    throws RemoteException
  {
    synchronized (this.zza)
    {
      zzdq localzzdq = this.zzb;
      if (localzzdq != null) {
        localzzdq.zzm(paramzzdt);
      }
      return;
    }
  }
  
  public final void zzn()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final boolean zzo()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final boolean zzp()
    throws RemoteException
  {
    throw new RemoteException();
  }
  
  public final boolean zzq()
    throws RemoteException
  {
    throw new RemoteException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */