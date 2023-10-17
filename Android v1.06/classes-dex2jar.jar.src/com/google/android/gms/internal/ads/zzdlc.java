package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdlc
  extends zzbfe
{
  private final String zza;
  private final zzdgx zzb;
  private final zzdhc zzc;
  
  public zzdlc(String paramString, zzdgx paramzzdgx, zzdhc paramzzdhc)
  {
    this.zza = paramString;
    this.zzb = paramzzdgx;
    this.zzc = paramzzdhc;
  }
  
  public final double zzb()
    throws RemoteException
  {
    return this.zzc.zza();
  }
  
  public final Bundle zzc()
    throws RemoteException
  {
    return this.zzc.zzd();
  }
  
  public final zzdq zzd()
    throws RemoteException
  {
    return this.zzc.zzj();
  }
  
  public final zzbei zze()
    throws RemoteException
  {
    return this.zzc.zzl();
  }
  
  public final zzbeq zzf()
    throws RemoteException
  {
    return this.zzc.zzn();
  }
  
  public final IObjectWrapper zzg()
    throws RemoteException
  {
    return this.zzc.zzu();
  }
  
  public final IObjectWrapper zzh()
    throws RemoteException
  {
    return ObjectWrapper.wrap(this.zzb);
  }
  
  public final String zzi()
    throws RemoteException
  {
    return this.zzc.zzx();
  }
  
  public final String zzj()
    throws RemoteException
  {
    return this.zzc.zzy();
  }
  
  public final String zzk()
    throws RemoteException
  {
    return this.zzc.zzA();
  }
  
  public final String zzl()
    throws RemoteException
  {
    return this.zza;
  }
  
  public final String zzm()
    throws RemoteException
  {
    return this.zzc.zzC();
  }
  
  public final String zzn()
    throws RemoteException
  {
    return this.zzc.zzD();
  }
  
  public final List zzo()
    throws RemoteException
  {
    return this.zzc.zzF();
  }
  
  public final void zzp()
    throws RemoteException
  {
    this.zzb.zzb();
  }
  
  public final void zzq(Bundle paramBundle)
    throws RemoteException
  {
    this.zzb.zzF(paramBundle);
  }
  
  public final void zzr(Bundle paramBundle)
    throws RemoteException
  {
    this.zzb.zzK(paramBundle);
  }
  
  public final boolean zzs(Bundle paramBundle)
    throws RemoteException
  {
    return this.zzb.zzX(paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdlc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */