package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzdla
  extends zzbks
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbeb
{
  private View zza;
  private zzdq zzb;
  private zzdgx zzc;
  private boolean zzd;
  private boolean zze;
  
  public zzdla(zzdgx paramzzdgx, zzdhc paramzzdhc)
  {
    this.zza = paramzzdhc.zzf();
    this.zzb = paramzzdhc.zzj();
    this.zzc = paramzzdgx;
    this.zzd = false;
    this.zze = false;
    if (paramzzdhc.zzr() != null) {
      paramzzdhc.zzr().zzam(this);
    }
  }
  
  private final void zzg()
  {
    zzdgx localzzdgx = this.zzc;
    if (localzzdgx != null)
    {
      View localView = this.zza;
      if (localView != null) {
        localzzdgx.zzA(localView, Collections.emptyMap(), Collections.emptyMap(), zzdgx.zzW(this.zza));
      }
    }
  }
  
  private final void zzh()
  {
    Object localObject = this.zza;
    if (localObject == null) {
      return;
    }
    localObject = ((View)localObject).getParent();
    if ((localObject instanceof ViewGroup)) {
      ((ViewGroup)localObject).removeView(this.zza);
    }
  }
  
  private static final void zzi(zzbkw paramzzbkw, int paramInt)
  {
    try
    {
      paramzzbkw.zze(paramInt);
      return;
    }
    catch (RemoteException paramzzbkw)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzbkw);
    }
  }
  
  public final void onGlobalLayout()
  {
    zzg();
  }
  
  public final void onScrollChanged()
  {
    zzg();
  }
  
  public final zzdq zzb()
    throws RemoteException
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    if (this.zzd)
    {
      zzbzt.zzg("getVideoController: Instream ad should not be used after destroyed");
      return null;
    }
    return this.zzb;
  }
  
  public final zzben zzc()
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    if (this.zzd)
    {
      zzbzt.zzg("getVideoController: Instream ad should not be used after destroyed");
      return null;
    }
    zzdgx localzzdgx = this.zzc;
    if ((localzzdgx != null) && (localzzdgx.zzc() != null)) {
      return localzzdgx.zzc().zza();
    }
    return null;
  }
  
  public final void zzd()
    throws RemoteException
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzh();
    zzdgx localzzdgx = this.zzc;
    if (localzzdgx != null) {
      localzzdgx.zzb();
    }
    this.zzc = null;
    this.zza = null;
    this.zzb = null;
    this.zzd = true;
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    zzf(paramIObjectWrapper, new zzdkz(this));
  }
  
  public final void zzf(IObjectWrapper paramIObjectWrapper, zzbkw paramzzbkw)
    throws RemoteException
  {
    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
    if (this.zzd)
    {
      zzbzt.zzg("Instream ad can not be shown after destroy().");
      zzi(paramzzbkw, 2);
      return;
    }
    View localView = this.zza;
    if ((localView != null) && (this.zzb != null))
    {
      if (this.zze)
      {
        zzbzt.zzg("Instream ad should not be used again.");
        zzi(paramzzbkw, 1);
        return;
      }
      this.zze = true;
      zzh();
      ((ViewGroup)ObjectWrapper.unwrap(paramIObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
      zzt.zzx();
      zzcat.zza(this.zza, this);
      zzt.zzx();
      zzcat.zzb(this.zza, this);
      zzg();
      try
      {
        paramzzbkw.zzf();
        return;
      }
      catch (RemoteException paramIObjectWrapper)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramIObjectWrapper);
        return;
      }
    }
    if (localView == null) {
      paramIObjectWrapper = "can not get video view.";
    } else {
      paramIObjectWrapper = "can not get video controller.";
    }
    zzbzt.zzg("Instream internal error: ".concat(paramIObjectWrapper));
    zzi(paramzzbkw, 0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */