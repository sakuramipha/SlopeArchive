package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzdlj
  extends zzbgm
{
  private final String zza;
  private final zzdgx zzb;
  private final zzdhc zzc;
  private final zzdqc zzd;
  
  public zzdlj(String paramString, zzdgx paramzzdgx, zzdhc paramzzdhc, zzdqc paramzzdqc)
  {
    this.zza = paramString;
    this.zzb = paramzzdgx;
    this.zzc = paramzzdhc;
    this.zzd = paramzzdqc;
  }
  
  public final void zzA()
  {
    this.zzb.zzG();
  }
  
  public final void zzB(Bundle paramBundle)
    throws RemoteException
  {
    this.zzb.zzK(paramBundle);
  }
  
  public final void zzC()
  {
    this.zzb.zzM();
  }
  
  public final void zzD(zzcs paramzzcs)
    throws RemoteException
  {
    this.zzb.zzN(paramzzcs);
  }
  
  public final void zzE(zzdg paramzzdg)
    throws RemoteException
  {
    try
    {
      if (!paramzzdg.zzf()) {
        this.zzd.zze();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzf("Error in making CSI ping for reporting paid event callback", localRemoteException);
    }
    this.zzb.zzO(paramzzdg);
  }
  
  public final void zzF(zzbgk paramzzbgk)
    throws RemoteException
  {
    this.zzb.zzP(paramzzbgk);
  }
  
  public final boolean zzG()
  {
    return this.zzb.zzU();
  }
  
  public final boolean zzH()
    throws RemoteException
  {
    return (!this.zzc.zzG().isEmpty()) && (this.zzc.zzk() != null);
  }
  
  public final boolean zzI(Bundle paramBundle)
    throws RemoteException
  {
    return this.zzb.zzX(paramBundle);
  }
  
  public final double zze()
    throws RemoteException
  {
    return this.zzc.zza();
  }
  
  public final Bundle zzf()
    throws RemoteException
  {
    return this.zzc.zzd();
  }
  
  public final zzdn zzg()
    throws RemoteException
  {
    zzbbc localzzbbc = zzbbk.zzgy;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return null;
    }
    return this.zzb.zzl();
  }
  
  public final zzdq zzh()
    throws RemoteException
  {
    return this.zzc.zzj();
  }
  
  public final zzbei zzi()
    throws RemoteException
  {
    return this.zzc.zzl();
  }
  
  public final zzben zzj()
    throws RemoteException
  {
    return this.zzb.zzc().zza();
  }
  
  public final zzbeq zzk()
    throws RemoteException
  {
    return this.zzc.zzn();
  }
  
  public final IObjectWrapper zzl()
    throws RemoteException
  {
    return this.zzc.zzu();
  }
  
  public final IObjectWrapper zzm()
    throws RemoteException
  {
    return ObjectWrapper.wrap(this.zzb);
  }
  
  public final String zzn()
    throws RemoteException
  {
    return this.zzc.zzw();
  }
  
  public final String zzo()
    throws RemoteException
  {
    return this.zzc.zzx();
  }
  
  public final String zzp()
    throws RemoteException
  {
    return this.zzc.zzy();
  }
  
  public final String zzq()
    throws RemoteException
  {
    return this.zzc.zzA();
  }
  
  public final String zzr()
    throws RemoteException
  {
    return this.zza;
  }
  
  public final String zzs()
    throws RemoteException
  {
    return this.zzc.zzC();
  }
  
  public final String zzt()
    throws RemoteException
  {
    return this.zzc.zzD();
  }
  
  public final List zzu()
    throws RemoteException
  {
    return this.zzc.zzF();
  }
  
  public final List zzv()
    throws RemoteException
  {
    List localList;
    if (zzH()) {
      localList = this.zzc.zzG();
    } else {
      localList = Collections.emptyList();
    }
    return localList;
  }
  
  public final void zzw()
    throws RemoteException
  {
    this.zzb.zzs();
  }
  
  public final void zzx()
    throws RemoteException
  {
    this.zzb.zzb();
  }
  
  public final void zzy(zzcw paramzzcw)
    throws RemoteException
  {
    this.zzb.zzB(paramzzcw);
  }
  
  public final void zzz(Bundle paramBundle)
    throws RemoteException
  {
    this.zzb.zzF(paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdlj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */