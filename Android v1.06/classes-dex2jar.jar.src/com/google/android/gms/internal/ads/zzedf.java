package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzedf
  extends zzbpi
{
  final zzedg zza;
  private final zzeby zzb;
  
  public final void zze(String paramString)
    throws RemoteException
  {
    ((zzedr)this.zzb.zzc).zzi(0, paramString);
  }
  
  public final void zzf(zze paramzze)
    throws RemoteException
  {
    ((zzedr)this.zzb.zzc).zzh(paramzze);
  }
  
  public final void zzg(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    zzedg.zze(this.zza, (View)ObjectWrapper.unwrap(paramIObjectWrapper));
    ((zzedr)this.zzb.zzc).zzo();
  }
  
  public final void zzh(zzboh paramzzboh)
    throws RemoteException
  {
    zzedg.zzd(this.zza, paramzzboh);
    ((zzedr)this.zzb.zzc).zzo();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */