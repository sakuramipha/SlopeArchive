package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbpb
  extends zzbod
{
  private final Adapter zza;
  private final zzbvh zzb;
  
  zzbpb(Adapter paramAdapter, zzbvh paramzzbvh)
  {
    this.zza = paramAdapter;
    this.zzb = paramzzbvh;
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zze(ObjectWrapper.wrap(this.zza));
    }
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzf(ObjectWrapper.wrap(this.zza));
    }
  }
  
  public final void zzg(int paramInt)
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzg(ObjectWrapper.wrap(this.zza), paramInt);
    }
  }
  
  public final void zzh(zze paramzze)
    throws RemoteException
  {}
  
  public final void zzi(int paramInt, String paramString)
    throws RemoteException
  {}
  
  public final void zzj(int paramInt)
    throws RemoteException
  {}
  
  public final void zzk(zze paramzze) {}
  
  public final void zzl(String paramString) {}
  
  public final void zzm()
    throws RemoteException
  {}
  
  public final void zzn()
    throws RemoteException
  {}
  
  public final void zzo()
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzi(ObjectWrapper.wrap(this.zza));
    }
  }
  
  public final void zzp()
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzj(ObjectWrapper.wrap(this.zza));
    }
  }
  
  public final void zzq(String paramString1, String paramString2)
    throws RemoteException
  {}
  
  public final void zzr(zzbfk paramzzbfk, String paramString)
    throws RemoteException
  {}
  
  public final void zzs(zzbvi paramzzbvi)
    throws RemoteException
  {}
  
  public final void zzt(zzbvm paramzzbvm)
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzm(ObjectWrapper.wrap(this.zza), new zzbvi(paramzzbvm.zzf(), paramzzbvm.zze()));
    }
  }
  
  public final void zzu()
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzn(ObjectWrapper.wrap(this.zza));
    }
  }
  
  public final void zzv()
    throws RemoteException
  {}
  
  public final void zzw()
    throws RemoteException
  {}
  
  public final void zzx()
    throws RemoteException
  {}
  
  public final void zzy()
    throws RemoteException
  {
    zzbvh localzzbvh = this.zzb;
    if (localzzbvh != null) {
      localzzbvh.zzo(ObjectWrapper.wrap(this.zza));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */