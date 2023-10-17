package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjh;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyk;

public final class zzcc
  extends zzato
  implements zzce
{
  zzcc(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  public final zzbq zzb(IObjectWrapper paramIObjectWrapper, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramString = zzbg(3, localParcel);
    paramzzbny = paramString.readStrongBinder();
    if (paramzzbny == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramIObjectWrapper = paramzzbny.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if ((paramIObjectWrapper instanceof zzbq)) {
        paramIObjectWrapper = (zzbq)paramIObjectWrapper;
      } else {
        paramIObjectWrapper = new zzbo(paramzzbny);
      }
    }
    paramString.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbu zzc(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramzzq = zzbg(13, localParcel);
    paramString = paramzzq.readStrongBinder();
    if (paramString == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramIObjectWrapper = paramString.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramIObjectWrapper instanceof zzbu)) {
        paramIObjectWrapper = (zzbu)paramIObjectWrapper;
      } else {
        paramIObjectWrapper = new zzbs(paramString);
      }
    }
    paramzzq.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbu zzd(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramzzq = zzbg(1, localParcel);
    paramIObjectWrapper = paramzzq.readStrongBinder();
    if (paramIObjectWrapper == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramString = paramIObjectWrapper.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramString instanceof zzbu)) {
        paramIObjectWrapper = (zzbu)paramString;
      } else {
        paramIObjectWrapper = new zzbs(paramIObjectWrapper);
      }
    }
    paramzzq.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbu zze(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramzzq = zzbg(2, localParcel);
    paramString = paramzzq.readStrongBinder();
    if (paramString == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramIObjectWrapper = paramString.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramIObjectWrapper instanceof zzbu)) {
        paramIObjectWrapper = (zzbu)paramIObjectWrapper;
      } else {
        paramIObjectWrapper = new zzbs(paramString);
      }
    }
    paramzzq.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbu zzf(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzd(localParcel, paramzzq);
    localParcel.writeString(paramString);
    localParcel.writeInt(231700000);
    paramzzq = zzbg(10, localParcel);
    paramIObjectWrapper = paramzzq.readStrongBinder();
    if (paramIObjectWrapper == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramString = paramIObjectWrapper.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((paramString instanceof zzbu)) {
        paramIObjectWrapper = (zzbu)paramString;
      } else {
        paramIObjectWrapper = new zzbs(paramIObjectWrapper);
      }
    }
    paramzzq.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzco zzg(IObjectWrapper paramIObjectWrapper, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeInt(231700000);
    localParcel = zzbg(9, localParcel);
    paramIObjectWrapper = localParcel.readStrongBinder();
    if (paramIObjectWrapper == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      IInterface localIInterface = paramIObjectWrapper.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if ((localIInterface instanceof zzco)) {
        paramIObjectWrapper = (zzco)localIInterface;
      } else {
        paramIObjectWrapper = new zzcm(paramIObjectWrapper);
      }
    }
    localParcel.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzdj zzh(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Object localObject = zza();
    zzatq.zzf((Parcel)localObject, paramIObjectWrapper);
    zzatq.zzf((Parcel)localObject, paramzzbny);
    ((Parcel)localObject).writeInt(231700000);
    paramzzbny = zzbg(17, (Parcel)localObject);
    localObject = paramzzbny.readStrongBinder();
    if (localObject == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramIObjectWrapper = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
      if ((paramIObjectWrapper instanceof zzdj)) {
        paramIObjectWrapper = (zzdj)paramIObjectWrapper;
      } else {
        paramIObjectWrapper = new zzdh((IBinder)localObject);
      }
    }
    paramzzbny.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbeu zzi(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    paramIObjectWrapper1 = zzbg(5, localParcel);
    paramIObjectWrapper2 = zzbet.zzbx(paramIObjectWrapper1.readStrongBinder());
    paramIObjectWrapper1.recycle();
    return paramIObjectWrapper2;
  }
  
  public final zzbfa zzj(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper1);
    zzatq.zzf(localParcel, paramIObjectWrapper2);
    zzatq.zzf(localParcel, paramIObjectWrapper3);
    paramIObjectWrapper2 = zzbg(11, localParcel);
    paramIObjectWrapper1 = zzbez.zze(paramIObjectWrapper2.readStrongBinder());
    paramIObjectWrapper2.recycle();
    return paramIObjectWrapper1;
  }
  
  public final zzbji zzk(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt, zzbjf paramzzbjf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    zzatq.zzf(localParcel, paramzzbjf);
    paramIObjectWrapper = zzbg(16, localParcel);
    paramzzbny = zzbjh.zzb(paramIObjectWrapper.readStrongBinder());
    paramIObjectWrapper.recycle();
    return paramzzbny;
  }
  
  public final zzbro zzl(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramzzbny = zzbg(15, localParcel);
    paramIObjectWrapper = zzbrn.zzb(paramzzbny.readStrongBinder());
    paramzzbny.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbrv zzm(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel = zzbg(8, localParcel);
    paramIObjectWrapper = zzbru.zzG(localParcel.readStrongBinder());
    localParcel.recycle();
    return paramIObjectWrapper;
  }
  
  public final zzbuz zzn(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    throw null;
  }
  
  public final zzbvp zzo(IObjectWrapper paramIObjectWrapper, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramIObjectWrapper = zzbg(12, localParcel);
    paramString = zzbvo.zzq(paramIObjectWrapper.readStrongBinder());
    paramIObjectWrapper.recycle();
    return paramString;
  }
  
  public final zzbyk zzp(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramzzbny = zzbg(14, localParcel);
    paramIObjectWrapper = zzbyj.zzb(paramzzbny.readStrongBinder());
    paramzzbny.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */