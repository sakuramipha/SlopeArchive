package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcoy
  extends zzavq
{
  private final zzcox zza;
  private final zzbu zzb;
  private final zzevd zzc;
  private boolean zzd = false;
  private final zzdqc zze;
  
  public zzcoy(zzcox paramzzcox, zzbu paramzzbu, zzevd paramzzevd, zzdqc paramzzdqc)
  {
    this.zza = paramzzcox;
    this.zzb = paramzzbu;
    this.zzc = paramzzevd;
    this.zze = paramzzdqc;
  }
  
  public final zzbu zze()
  {
    return this.zzb;
  }
  
  public final zzdn zzf()
  {
    zzbbc localzzbbc = zzbbk.zzgy;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return null;
    }
    return this.zza.zzl();
  }
  
  public final void zzg(boolean paramBoolean)
  {
    this.zzd = paramBoolean;
  }
  
  public final void zzh(zzdg paramzzdg)
  {
    Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
    if (this.zzc != null)
    {
      try
      {
        if (!paramzzdg.zzf()) {
          this.zze.zze();
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzf("Error in making CSI ping for reporting paid event callback", localRemoteException);
      }
      this.zzc.zzo(paramzzdg);
    }
  }
  
  public final void zzi(IObjectWrapper paramIObjectWrapper, zzavy paramzzavy)
  {
    try
    {
      this.zzc.zzq(paramzzavy);
      this.zza.zzd((Activity)ObjectWrapper.unwrap(paramIObjectWrapper), paramzzavy, this.zzd);
      return;
    }
    catch (RemoteException paramIObjectWrapper)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramIObjectWrapper);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcoy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */