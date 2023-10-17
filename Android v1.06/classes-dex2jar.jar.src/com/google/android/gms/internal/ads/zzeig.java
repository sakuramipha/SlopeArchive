package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzeig
  extends zzbt
{
  private final Context zza;
  private final zzbh zzb;
  private final zzfaa zzc;
  private final zzcpd zzd;
  private final ViewGroup zze;
  private final zzdqc zzf;
  
  public zzeig(Context paramContext, zzbh paramzzbh, zzfaa paramzzfaa, zzcpd paramzzcpd, zzdqc paramzzdqc)
  {
    this.zza = paramContext;
    this.zzb = paramzzbh;
    this.zzc = paramzzfaa;
    this.zzd = paramzzcpd;
    this.zzf = paramzzdqc;
    paramContext = new FrameLayout(paramContext);
    paramContext.removeAllViews();
    paramzzbh = paramzzcpd.zzc();
    zzt.zzp();
    paramContext.addView(paramzzbh, new ViewGroup.LayoutParams(-1, -1));
    paramContext.setMinimumHeight(zzg().zzc);
    paramContext.setMinimumWidth(zzg().zzf);
    this.zze = paramContext;
  }
  
  public final void zzA()
    throws RemoteException
  {
    this.zzd.zzg();
  }
  
  public final void zzB()
    throws RemoteException
  {
    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
    this.zzd.zzm().zzc(null);
  }
  
  public final void zzC(zzbe paramzzbe)
    throws RemoteException
  {
    zzbzt.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzD(zzbh paramzzbh)
    throws RemoteException
  {
    zzbzt.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzE(zzby paramzzby)
    throws RemoteException
  {
    zzbzt.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzF(zzq paramzzq)
    throws RemoteException
  {
    Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    zzcpd localzzcpd = this.zzd;
    if (localzzcpd != null) {
      localzzcpd.zzh(this.zze, paramzzq);
    }
  }
  
  public final void zzG(zzcb paramzzcb)
    throws RemoteException
  {
    zzejf localzzejf = this.zzc.zzc;
    if (localzzejf != null) {
      localzzejf.zzi(paramzzcb);
    }
  }
  
  public final void zzH(zzavu paramzzavu)
    throws RemoteException
  {}
  
  public final void zzI(zzw paramzzw)
    throws RemoteException
  {}
  
  public final void zzJ(zzci paramzzci) {}
  
  public final void zzK(zzdu paramzzdu)
    throws RemoteException
  {}
  
  public final void zzL(boolean paramBoolean)
    throws RemoteException
  {}
  
  public final void zzM(zzbse paramzzbse)
    throws RemoteException
  {}
  
  public final void zzN(boolean paramBoolean)
    throws RemoteException
  {
    zzbzt.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzO(zzbci paramzzbci)
    throws RemoteException
  {
    zzbzt.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzP(zzdg paramzzdg)
  {
    Object localObject = zzbbk.zzjT;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzc.zzc;
      if (localObject != null)
      {
        try
        {
          if (!paramzzdg.zzf()) {
            this.zzf.zze();
          }
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzf("Error in making CSI ping for reporting paid event callback", localRemoteException);
        }
        ((zzejf)localObject).zzg(paramzzdg);
      }
      return;
    }
    zzbzt.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzQ(zzbsh paramzzbsh, String paramString)
    throws RemoteException
  {}
  
  public final void zzR(String paramString)
    throws RemoteException
  {}
  
  public final void zzS(zzbvc paramzzbvc)
    throws RemoteException
  {}
  
  public final void zzT(String paramString)
    throws RemoteException
  {}
  
  public final void zzU(zzfl paramzzfl)
    throws RemoteException
  {
    zzbzt.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final void zzW(IObjectWrapper paramIObjectWrapper) {}
  
  public final void zzX()
    throws RemoteException
  {}
  
  public final boolean zzY()
    throws RemoteException
  {
    return false;
  }
  
  public final boolean zzZ()
    throws RemoteException
  {
    return false;
  }
  
  public final boolean zzaa(zzl paramzzl)
    throws RemoteException
  {
    zzbzt.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
    return false;
  }
  
  public final void zzab(zzcf paramzzcf)
    throws RemoteException
  {
    zzbzt.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
  }
  
  public final Bundle zzd()
    throws RemoteException
  {
    zzbzt.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
    return new Bundle();
  }
  
  public final zzq zzg()
  {
    Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
    return zzfae.zza(this.zza, Collections.singletonList(this.zzd.zze()));
  }
  
  public final zzbh zzi()
    throws RemoteException
  {
    return this.zzb;
  }
  
  public final zzcb zzj()
    throws RemoteException
  {
    return this.zzc.zzn;
  }
  
  public final zzdn zzk()
  {
    return this.zzd.zzl();
  }
  
  public final zzdq zzl()
    throws RemoteException
  {
    return this.zzd.zzd();
  }
  
  public final IObjectWrapper zzn()
    throws RemoteException
  {
    return ObjectWrapper.wrap(this.zze);
  }
  
  public final String zzr()
    throws RemoteException
  {
    return this.zzc.zzf;
  }
  
  public final String zzs()
    throws RemoteException
  {
    if (this.zzd.zzl() != null) {
      return this.zzd.zzl().zzg();
    }
    return null;
  }
  
  public final String zzt()
    throws RemoteException
  {
    if (this.zzd.zzl() != null) {
      return this.zzd.zzl().zzg();
    }
    return null;
  }
  
  public final void zzx()
    throws RemoteException
  {
    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
    this.zzd.zzb();
  }
  
  public final void zzy(zzl paramzzl, zzbk paramzzbk) {}
  
  public final void zzz()
    throws RemoteException
  {
    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
    this.zzd.zzm().zzb(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */