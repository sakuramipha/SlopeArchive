package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zzea
{
  final zzaz zza = new zzdz(this);
  private final zzbnv zzb = new zzbnv();
  private final zzp zzc;
  private final AtomicBoolean zzd;
  private final VideoController zze = new VideoController();
  private zza zzf;
  private AdListener zzg;
  private AdSize[] zzh;
  private AppEventListener zzi;
  private zzbu zzj;
  private VideoOptions zzk;
  private String zzl;
  @NotOnlyInitialized
  private final ViewGroup zzm;
  private int zzn;
  private boolean zzo;
  private OnPaidEventListener zzp;
  
  public zzea(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, zzp.zza, null, 0);
  }
  
  public zzea(ViewGroup paramViewGroup, int paramInt)
  {
    this(paramViewGroup, null, false, zzp.zza, null, paramInt);
  }
  
  public zzea(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, zzp.zza, null, 0);
  }
  
  public zzea(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, int paramInt)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, zzp.zza, null, paramInt);
  }
  
  zzea(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, zzp paramzzp, zzbu paramzzbu, int paramInt)
  {
    this.zzm = paramViewGroup;
    this.zzc = paramzzp;
    this.zzj = null;
    this.zzd = new AtomicBoolean(false);
    this.zzn = paramInt;
    if (paramAttributeSet != null)
    {
      paramzzbu = paramViewGroup.getContext();
      try
      {
        paramzzp = new com/google/android/gms/ads/internal/client/zzy;
        paramzzp.<init>(paramzzbu, paramAttributeSet);
        this.zzh = paramzzp.zzb(paramBoolean);
        this.zzl = paramzzp.zza();
        if (paramViewGroup.isInEditMode())
        {
          paramzzp = zzay.zzb();
          paramAttributeSet = this.zzh[0];
          paramInt = this.zzn;
          if (paramAttributeSet.equals(AdSize.INVALID))
          {
            paramAttributeSet = zzq.zze();
          }
          else
          {
            paramAttributeSet = new zzq(paramzzbu, paramAttributeSet);
            paramAttributeSet.zzj = zzD(paramInt);
          }
          paramzzp.zzm(paramViewGroup, paramAttributeSet, "Ads by Google");
          return;
        }
      }
      catch (IllegalArgumentException paramAttributeSet)
      {
        zzay.zzb().zzl(paramViewGroup, new zzq(paramzzbu, AdSize.BANNER), paramAttributeSet.getMessage(), paramAttributeSet.getMessage());
      }
    }
  }
  
  private static zzq zzC(Context paramContext, AdSize[] paramArrayOfAdSize, int paramInt)
  {
    int j = paramArrayOfAdSize.length;
    for (int i = 0; i < j; i++) {
      if (paramArrayOfAdSize[i].equals(AdSize.INVALID)) {
        return zzq.zze();
      }
    }
    paramContext = new zzq(paramContext, paramArrayOfAdSize);
    paramContext.zzj = zzD(paramInt);
    return paramContext;
  }
  
  private static boolean zzD(int paramInt)
  {
    return paramInt == 1;
  }
  
  public final boolean zzA()
  {
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null)
      {
        boolean bool = localzzbu.zzY();
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
    return false;
  }
  
  public final AdSize[] zzB()
  {
    return this.zzh;
  }
  
  public final AdListener zza()
  {
    return this.zzg;
  }
  
  public final AdSize zzb()
  {
    try
    {
      Object localObject = this.zzj;
      if (localObject != null)
      {
        localObject = ((zzbu)localObject).zzg();
        if (localObject != null)
        {
          localObject = com.google.android.gms.ads.zzb.zzc(((zzq)localObject).zze, ((zzq)localObject).zzb, ((zzq)localObject).zza);
          return (AdSize)localObject;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      AdSize[] arrayOfAdSize = this.zzh;
      if (arrayOfAdSize != null) {
        return arrayOfAdSize[0];
      }
    }
    return null;
  }
  
  public final OnPaidEventListener zzc()
  {
    return this.zzp;
  }
  
  public final ResponseInfo zzd()
  {
    Object localObject3 = null;
    Object localObject2;
    try
    {
      zzbu localzzbu = this.zzj;
      Object localObject1 = localObject3;
      if (localzzbu != null) {
        localObject1 = localzzbu.zzk();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      localObject2 = localObject3;
    }
    return ResponseInfo.zza((zzdn)localObject2);
  }
  
  public final VideoController zzf()
  {
    return this.zze;
  }
  
  public final VideoOptions zzg()
  {
    return this.zzk;
  }
  
  public final AppEventListener zzh()
  {
    return this.zzi;
  }
  
  public final zzdq zzi()
  {
    Object localObject = this.zzj;
    if (localObject != null) {
      try
      {
        localObject = ((zzbu)localObject).zzl();
        return (zzdq)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      }
    }
    return null;
  }
  
  public final String zzj()
  {
    if (this.zzl == null)
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null) {
        try
        {
          this.zzl = localzzbu.zzr();
        }
        catch (RemoteException localRemoteException)
        {
          zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
        }
      }
    }
    return this.zzl;
  }
  
  public final void zzk()
  {
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null) {
        localzzbu.zzx();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzm(zzdx paramzzdx)
  {
    try
    {
      if (this.zzj == null) {
        if ((this.zzh != null) && (this.zzl != null))
        {
          Object localObject2 = this.zzm.getContext();
          Object localObject1 = zzC((Context)localObject2, this.zzh, this.zzn);
          Object localObject4;
          String str;
          if ("search_v2".equals(((zzq)localObject1).zza))
          {
            localObject4 = zzay.zza();
            str = this.zzl;
            localObject3 = new com/google/android/gms/ads/internal/client/zzal;
            ((zzal)localObject3).<init>((zzaw)localObject4, (Context)localObject2, (zzq)localObject1, str);
            localObject1 = (zzbu)((zzax)localObject3).zzd((Context)localObject2, false);
          }
          else
          {
            zzaw localzzaw = zzay.zza();
            str = this.zzl;
            localObject3 = this.zzb;
            localObject4 = new com/google/android/gms/ads/internal/client/zzaj;
            ((zzaj)localObject4).<init>(localzzaw, (Context)localObject2, (zzq)localObject1, str, (zzbny)localObject3);
            localObject1 = (zzbu)((zzax)localObject4).zzd((Context)localObject2, false);
          }
          this.zzj = ((zzbu)localObject1);
          localObject2 = new com/google/android/gms/ads/internal/client/zzg;
          ((zzg)localObject2).<init>(this.zza);
          ((zzbu)localObject1).zzD((zzbh)localObject2);
          Object localObject3 = this.zzf;
          if (localObject3 != null)
          {
            localObject1 = this.zzj;
            localObject2 = new com/google/android/gms/ads/internal/client/zzb;
            ((zzb)localObject2).<init>((zza)localObject3);
            ((zzbu)localObject1).zzC((zzbe)localObject2);
          }
          localObject3 = this.zzi;
          if (localObject3 != null)
          {
            localObject2 = this.zzj;
            localObject1 = new com/google/android/gms/internal/ads/zzaum;
            ((zzaum)localObject1).<init>((AppEventListener)localObject3);
            ((zzbu)localObject2).zzG((zzcb)localObject1);
          }
          if (this.zzk != null)
          {
            localObject1 = this.zzj;
            localObject2 = new com/google/android/gms/ads/internal/client/zzfl;
            ((zzfl)localObject2).<init>(this.zzk);
            ((zzbu)localObject1).zzU((zzfl)localObject2);
          }
          localObject1 = this.zzj;
          localObject2 = new com/google/android/gms/ads/internal/client/zzfe;
          ((zzfe)localObject2).<init>(this.zzp);
          ((zzbu)localObject1).zzP((zzdg)localObject2);
          this.zzj.zzN(this.zzo);
          localObject1 = this.zzj;
          if (localObject1 != null) {
            try
            {
              localObject1 = ((zzbu)localObject1).zzn();
              if (localObject1 == null) {
                break label422;
              }
              if (((Boolean)zzbdb.zzf.zze()).booleanValue())
              {
                localObject2 = zzbbk.zzjG;
                if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
                {
                  localObject3 = zzbzm.zza;
                  localObject2 = new com/google/android/gms/ads/internal/client/zzdy;
                  ((zzdy)localObject2).<init>(this, (IObjectWrapper)localObject1);
                  ((Handler)localObject3).post((Runnable)localObject2);
                  break label422;
                }
              }
              this.zzm.addView((View)ObjectWrapper.unwrap((IObjectWrapper)localObject1));
            }
            catch (RemoteException localRemoteException)
            {
              zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
            }
          }
        }
        else
        {
          paramzzdx = new java/lang/IllegalStateException;
          paramzzdx.<init>("The ad size and ad unit ID must be set before loadAd is called.");
          throw paramzzdx;
        }
      }
      label422:
      zzbu localzzbu = this.zzj;
      Objects.requireNonNull(localzzbu);
      localzzbu.zzaa(this.zzc.zza(this.zzm.getContext(), paramzzdx));
      return;
    }
    catch (RemoteException paramzzdx)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzdx);
    }
  }
  
  public final void zzn()
  {
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null) {
        localzzbu.zzz();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzo()
  {
    if (this.zzd.getAndSet(true)) {
      return;
    }
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null) {
        localzzbu.zzA();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzp()
  {
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null) {
        localzzbu.zzB();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzq(zza paramzza)
  {
    try
    {
      this.zzf = paramzza;
      zzbu localzzbu = this.zzj;
      if (localzzbu != null)
      {
        if (paramzza != null)
        {
          zzb localzzb = new com/google/android/gms/ads/internal/client/zzb;
          localzzb.<init>(paramzza);
          paramzza = localzzb;
        }
        else
        {
          paramzza = null;
        }
        localzzbu.zzC(paramzza);
      }
      return;
    }
    catch (RemoteException paramzza)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzza);
    }
  }
  
  public final void zzr(AdListener paramAdListener)
  {
    this.zzg = paramAdListener;
    this.zza.zza(paramAdListener);
  }
  
  public final void zzs(AdSize... paramVarArgs)
  {
    if (this.zzh == null)
    {
      zzt(paramVarArgs);
      return;
    }
    throw new IllegalStateException("The ad size can only be set once on AdView.");
  }
  
  public final void zzt(AdSize... paramVarArgs)
  {
    this.zzh = paramVarArgs;
    try
    {
      paramVarArgs = this.zzj;
      if (paramVarArgs != null) {
        paramVarArgs.zzF(zzC(this.zzm.getContext(), this.zzh, this.zzn));
      }
    }
    catch (RemoteException paramVarArgs)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramVarArgs);
    }
    this.zzm.requestLayout();
  }
  
  public final void zzu(String paramString)
  {
    if (this.zzl == null)
    {
      this.zzl = paramString;
      return;
    }
    throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
  }
  
  public final void zzv(AppEventListener paramAppEventListener)
  {
    try
    {
      this.zzi = paramAppEventListener;
      zzbu localzzbu = this.zzj;
      if (localzzbu != null)
      {
        if (paramAppEventListener != null)
        {
          zzaum localzzaum = new com/google/android/gms/internal/ads/zzaum;
          localzzaum.<init>(paramAppEventListener);
          paramAppEventListener = localzzaum;
        }
        else
        {
          paramAppEventListener = null;
        }
        localzzbu.zzG(paramAppEventListener);
      }
      return;
    }
    catch (RemoteException paramAppEventListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramAppEventListener);
    }
  }
  
  public final void zzw(boolean paramBoolean)
  {
    this.zzo = paramBoolean;
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null) {
        localzzbu.zzN(paramBoolean);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzx(OnPaidEventListener paramOnPaidEventListener)
  {
    try
    {
      this.zzp = paramOnPaidEventListener;
      zzbu localzzbu = this.zzj;
      if (localzzbu != null)
      {
        zzfe localzzfe = new com/google/android/gms/ads/internal/client/zzfe;
        localzzfe.<init>(paramOnPaidEventListener);
        localzzbu.zzP(localzzfe);
      }
      return;
    }
    catch (RemoteException paramOnPaidEventListener)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramOnPaidEventListener);
    }
  }
  
  public final void zzy(VideoOptions paramVideoOptions)
  {
    this.zzk = paramVideoOptions;
    try
    {
      zzbu localzzbu = this.zzj;
      if (localzzbu != null)
      {
        if (paramVideoOptions == null) {
          paramVideoOptions = null;
        } else {
          paramVideoOptions = new zzfl(paramVideoOptions);
        }
        localzzbu.zzU(paramVideoOptions);
      }
      return;
    }
    catch (RemoteException paramVideoOptions)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramVideoOptions);
    }
  }
  
  public final boolean zzz(zzbu paramzzbu)
  {
    try
    {
      IObjectWrapper localIObjectWrapper = paramzzbu.zzn();
      if (localIObjectWrapper == null) {
        return false;
      }
      if (((View)ObjectWrapper.unwrap(localIObjectWrapper)).getParent() != null) {
        return false;
      }
      this.zzm.addView((View)ObjectWrapper.unwrap(localIObjectWrapper));
      this.zzj = paramzzbu;
      return true;
    }
    catch (RemoteException paramzzbu)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzbu);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */