package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdle
  extends zzbfg
{
  private final String zza;
  private final zzdgx zzb;
  private final zzdhc zzc;
  
  public zzdle(String paramString, zzdgx paramzzdgx, zzdhc paramzzdhc)
  {
    this.zza = paramString;
    this.zzb = paramzzdgx;
    this.zzc = paramzzdhc;
  }
  
  public final Bundle zzb()
    throws RemoteException
  {
    return this.zzc.zzd();
  }
  
  public final zzdq zzc()
    throws RemoteException
  {
    return this.zzc.zzj();
  }
  
  public final zzbei zzd()
    throws RemoteException
  {
    return this.zzc.zzl();
  }
  
  public final zzbeq zze()
    throws RemoteException
  {
    return this.zzc.zzo();
  }
  
  public final IObjectWrapper zzf()
    throws RemoteException
  {
    return this.zzc.zzu();
  }
  
  public final IObjectWrapper zzg()
    throws RemoteException
  {
    return ObjectWrapper.wrap(this.zzb);
  }
  
  public final String zzh()
    throws RemoteException
  {
    return this.zzc.zzw();
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
  
  public final List zzm()
    throws RemoteException
  {
    return this.zzc.zzF();
  }
  
  public final void zzn()
    throws RemoteException
  {
    this.zzb.zzb();
  }
  
  public final void zzo(Bundle paramBundle)
    throws RemoteException
  {
    this.zzb.zzF(paramBundle);
  }
  
  public final void zzp(Bundle paramBundle)
    throws RemoteException
  {
    this.zzb.zzK(paramBundle);
  }
  
  public final boolean zzq(Bundle paramBundle)
    throws RemoteException
  {
    return this.zzb.zzX(paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */