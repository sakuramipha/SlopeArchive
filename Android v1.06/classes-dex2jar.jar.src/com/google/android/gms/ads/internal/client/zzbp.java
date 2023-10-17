package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbkz;

public abstract class zzbp
  extends zzatp
  implements zzbq
{
  public zzbp()
  {
    super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject2 = null;
    switch (paramInt1)
    {
    case 11: 
    case 12: 
    default: 
      return false;
    case 15: 
      localObject1 = (AdManagerAdViewOptions)zzatq.zza(paramParcel1, AdManagerAdViewOptions.CREATOR);
      zzatq.zzc(paramParcel1);
      zzm((AdManagerAdViewOptions)localObject1);
      paramParcel2.writeNoException();
      break;
    case 14: 
      localObject1 = zzbky.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzi((zzbkz)localObject1);
      paramParcel2.writeNoException();
      break;
    case 13: 
      localObject1 = (zzbkq)zzatq.zza(paramParcel1, zzbkq.CREATOR);
      zzatq.zzc(paramParcel1);
      zzn((zzbkq)localObject1);
      paramParcel2.writeNoException();
      break;
    case 10: 
      localObject1 = zzbgd.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzk((zzbge)localObject1);
      paramParcel2.writeNoException();
      break;
    case 9: 
      localObject1 = (PublisherAdViewOptions)zzatq.zza(paramParcel1, PublisherAdViewOptions.CREATOR);
      zzatq.zzc(paramParcel1);
      zzp((PublisherAdViewOptions)localObject1);
      paramParcel2.writeNoException();
      break;
    case 8: 
      localObject2 = zzbga.zzb(paramParcel1.readStrongBinder());
      localObject1 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      zzatq.zzc(paramParcel1);
      zzj((zzbgb)localObject2, (zzq)localObject1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcf((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzq((zzcf)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject1 = (zzbee)zzatq.zza(paramParcel1, zzbee.CREATOR);
      zzatq.zzc(paramParcel1);
      zzo((zzbee)localObject1);
      paramParcel2.writeNoException();
      break;
    case 5: 
      localObject1 = paramParcel1.readString();
      localObject2 = zzbfw.zzb(paramParcel1.readStrongBinder());
      zzbfu localzzbfu = zzbft.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzh((String)localObject1, (zzbfx)localObject2, localzzbfu);
      paramParcel2.writeNoException();
      break;
    case 4: 
      localObject1 = zzbfq.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzg((zzbfr)localObject1);
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject1 = zzbfn.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzf((zzbfo)localObject1);
      paramParcel2.writeNoException();
      break;
    case 2: 
      localObject2 = paramParcel1.readStrongBinder();
      if (localObject2 != null)
      {
        localObject1 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
        if ((localObject1 instanceof zzbh)) {
          localObject1 = (zzbh)localObject1;
        } else {
          localObject1 = new zzbf((IBinder)localObject2);
        }
      }
      zzatq.zzc(paramParcel1);
      zzl((zzbh)localObject1);
      paramParcel2.writeNoException();
      break;
    case 1: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */