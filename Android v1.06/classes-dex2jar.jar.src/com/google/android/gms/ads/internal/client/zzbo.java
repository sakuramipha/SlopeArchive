package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkz;

public final class zzbo
  extends zzato
  implements zzbq
{
  zzbo(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  public final zzbn zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    Object localObject = localParcel.readStrongBinder();
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if ((localIInterface instanceof zzbn)) {
        localObject = (zzbn)localIInterface;
      } else {
        localObject = new zzbl((IBinder)localObject);
      }
    }
    localParcel.recycle();
    return (zzbn)localObject;
  }
  
  public final void zzf(zzbfo paramzzbfo)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzg(zzbfr paramzzbfr)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzh(String paramString, zzbfx paramzzbfx, zzbfu paramzzbfu)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbfx);
    zzatq.zzf(localParcel, paramzzbfu);
    zzbh(5, localParcel);
  }
  
  public final void zzi(zzbkz paramzzbkz)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzj(zzbgb paramzzbgb, zzq paramzzq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbgb);
    zzatq.zzd(localParcel, paramzzq);
    zzbh(8, localParcel);
  }
  
  public final void zzk(zzbge paramzzbge)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbge);
    zzbh(10, localParcel);
  }
  
  public final void zzl(zzbh paramzzbh)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbh);
    zzbh(2, localParcel);
  }
  
  public final void zzm(AdManagerAdViewOptions paramAdManagerAdViewOptions)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramAdManagerAdViewOptions);
    zzbh(15, localParcel);
  }
  
  public final void zzn(zzbkq paramzzbkq)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzo(zzbee paramzzbee)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzbee);
    zzbh(6, localParcel);
  }
  
  public final void zzp(PublisherAdViewOptions paramPublisherAdViewOptions)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzq(zzcf paramzzcf)
    throws RemoteException
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */