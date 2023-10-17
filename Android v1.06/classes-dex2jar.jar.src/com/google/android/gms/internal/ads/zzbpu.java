package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbpu
  extends zzatp
  implements zzbpv
{
  public zzbpu()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public static zzbpv zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    if ((localIInterface instanceof zzbpv)) {
      return (zzbpv)localIInterface;
    }
    return new zzbpt(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject5 = null;
    Object localObject9 = null;
    Object localObject4 = null;
    Object localObject7 = null;
    Object localObject3 = null;
    Object localObject2 = null;
    Object localObject8 = null;
    Object localObject1 = null;
    Object localObject6 = null;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 5)
          {
            if (paramInt1 != 10)
            {
              if (paramInt1 != 11)
              {
                switch (paramInt1)
                {
                default: 
                  return false;
                case 24: 
                  localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  paramInt1 = zzr((IObjectWrapper)localObject1);
                  paramParcel2.writeNoException();
                  paramParcel2.writeInt(paramInt1);
                  break;
                case 23: 
                  localObject4 = paramParcel1.readString();
                  localObject5 = paramParcel1.readString();
                  localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject6;
                  }
                  for (;;)
                  {
                    break;
                    localObject6 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if ((localObject6 instanceof zzbpg)) {
                      localObject1 = (zzbpg)localObject6;
                    } else {
                      localObject1 = new zzbpe((IBinder)localObject1);
                    }
                  }
                  localObject6 = zzbod.zzb(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  zzi((String)localObject4, (String)localObject5, (zzl)localObject3, (IObjectWrapper)localObject2, (zzbpg)localObject1, (zzboe)localObject6);
                  paramParcel2.writeNoException();
                  break;
                case 22: 
                  localObject2 = paramParcel1.readString();
                  localObject3 = paramParcel1.readString();
                  localObject4 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject6 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject5;
                  }
                  for (;;)
                  {
                    break;
                    localObject5 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    if ((localObject5 instanceof zzbpp)) {
                      localObject1 = (zzbpp)localObject5;
                    } else {
                      localObject1 = new zzbpn((IBinder)localObject1);
                    }
                  }
                  localObject5 = zzbod.zzb(paramParcel1.readStrongBinder());
                  localObject7 = (zzbee)zzatq.zza(paramParcel1, zzbee.CREATOR);
                  zzatq.zzc(paramParcel1);
                  zzn((String)localObject2, (String)localObject3, (zzl)localObject4, (IObjectWrapper)localObject6, (zzbpp)localObject1, (zzboe)localObject5, (zzbee)localObject7);
                  paramParcel2.writeNoException();
                  break;
                case 21: 
                  localObject5 = paramParcel1.readString();
                  localObject2 = paramParcel1.readString();
                  localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject4 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject9;
                  }
                  for (;;)
                  {
                    break;
                    localObject6 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    if ((localObject6 instanceof zzbpj)) {
                      localObject1 = (zzbpj)localObject6;
                    } else {
                      localObject1 = new zzbph((IBinder)localObject1);
                    }
                  }
                  localObject7 = zzbod.zzb(paramParcel1.readStrongBinder());
                  localObject6 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
                  zzatq.zzc(paramParcel1);
                  zzk((String)localObject5, (String)localObject2, (zzl)localObject3, (IObjectWrapper)localObject4, (zzbpj)localObject1, (zzboe)localObject7, (zzq)localObject6);
                  paramParcel2.writeNoException();
                  break;
                case 20: 
                  localObject2 = paramParcel1.readString();
                  localObject6 = paramParcel1.readString();
                  localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject4;
                  }
                  for (;;)
                  {
                    break;
                    localObject4 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    if ((localObject4 instanceof zzbps)) {
                      localObject1 = (zzbps)localObject4;
                    } else {
                      localObject1 = new zzbpq((IBinder)localObject1);
                    }
                  }
                  localObject4 = zzbod.zzb(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  zzo((String)localObject2, (String)localObject6, (zzl)localObject3, (IObjectWrapper)localObject5, (zzbps)localObject1, (zzboe)localObject4);
                  paramParcel2.writeNoException();
                  break;
                case 19: 
                  localObject1 = paramParcel1.readString();
                  zzatq.zzc(paramParcel1);
                  zzq((String)localObject1);
                  paramParcel2.writeNoException();
                  break;
                case 18: 
                  localObject4 = paramParcel1.readString();
                  localObject2 = paramParcel1.readString();
                  localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject7;
                  }
                  for (;;)
                  {
                    break;
                    localObject6 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    if ((localObject6 instanceof zzbpp)) {
                      localObject1 = (zzbpp)localObject6;
                    } else {
                      localObject1 = new zzbpn((IBinder)localObject1);
                    }
                  }
                  localObject6 = zzbod.zzb(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  zzm((String)localObject4, (String)localObject2, (zzl)localObject3, (IObjectWrapper)localObject5, (zzbpp)localObject1, (zzboe)localObject6);
                  paramParcel2.writeNoException();
                  break;
                case 17: 
                  localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  paramInt1 = zzt((IObjectWrapper)localObject1);
                  paramParcel2.writeNoException();
                  paramParcel2.writeInt(paramInt1);
                  break;
                case 16: 
                  localObject2 = paramParcel1.readString();
                  localObject4 = paramParcel1.readString();
                  localObject6 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject3;
                  }
                  for (;;)
                  {
                    break;
                    localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    if ((localObject3 instanceof zzbps)) {
                      localObject1 = (zzbps)localObject3;
                    } else {
                      localObject1 = new zzbpq((IBinder)localObject1);
                    }
                  }
                  localObject3 = zzbod.zzb(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  zzp((String)localObject2, (String)localObject4, (zzl)localObject6, (IObjectWrapper)localObject5, (zzbps)localObject1, (zzboe)localObject3);
                  paramParcel2.writeNoException();
                  break;
                case 15: 
                  localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  paramInt1 = zzs((IObjectWrapper)localObject1);
                  paramParcel2.writeNoException();
                  paramParcel2.writeInt(paramInt1);
                  break;
                case 14: 
                  localObject6 = paramParcel1.readString();
                  localObject3 = paramParcel1.readString();
                  localObject4 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject2;
                  }
                  for (;;)
                  {
                    break;
                    localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if ((localObject2 instanceof zzbpm)) {
                      localObject1 = (zzbpm)localObject2;
                    } else {
                      localObject1 = new zzbpk((IBinder)localObject1);
                    }
                  }
                  localObject2 = zzbod.zzb(paramParcel1.readStrongBinder());
                  zzatq.zzc(paramParcel1);
                  zzl((String)localObject6, (String)localObject3, (zzl)localObject4, (IObjectWrapper)localObject5, (zzbpm)localObject1, (zzboe)localObject2);
                  paramParcel2.writeNoException();
                  break;
                case 13: 
                  localObject5 = paramParcel1.readString();
                  localObject2 = paramParcel1.readString();
                  localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
                  localObject4 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
                  localObject1 = paramParcel1.readStrongBinder();
                  if (localObject1 == null) {
                    localObject1 = localObject8;
                  }
                  for (;;)
                  {
                    break;
                    localObject6 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    if ((localObject6 instanceof zzbpj)) {
                      localObject1 = (zzbpj)localObject6;
                    } else {
                      localObject1 = new zzbph((IBinder)localObject1);
                    }
                  }
                  localObject7 = zzbod.zzb(paramParcel1.readStrongBinder());
                  localObject6 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
                  zzatq.zzc(paramParcel1);
                  zzj((String)localObject5, (String)localObject2, (zzl)localObject3, (IObjectWrapper)localObject4, (zzbpj)localObject1, (zzboe)localObject7, (zzq)localObject6);
                  paramParcel2.writeNoException();
                  break;
                }
              }
              else
              {
                paramParcel1.createStringArray();
                localObject1 = (Bundle[])paramParcel1.createTypedArray(Bundle.CREATOR);
                zzatq.zzc(paramParcel1);
                paramParcel2.writeNoException();
              }
            }
            else
            {
              IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
              zzatq.zzc(paramParcel1);
              paramParcel2.writeNoException();
            }
          }
          else
          {
            paramParcel1 = zze();
            paramParcel2.writeNoException();
            zzatq.zzf(paramParcel2, paramParcel1);
          }
        }
        else
        {
          paramParcel1 = zzg();
          paramParcel2.writeNoException();
          zzatq.zze(paramParcel2, paramParcel1);
        }
      }
      else
      {
        paramParcel1 = zzf();
        paramParcel2.writeNoException();
        zzatq.zze(paramParcel2, paramParcel1);
      }
    }
    else
    {
      localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject4 = paramParcel1.readString();
      localObject3 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      localObject2 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      localObject6 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject7 = paramParcel1.readStrongBinder();
      if (localObject7 != null) {
        for (;;)
        {
          localObject1 = ((IBinder)localObject7).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
          if ((localObject1 instanceof zzbpy)) {
            localObject1 = (zzbpy)localObject1;
          } else {
            localObject1 = new zzbpw((IBinder)localObject7);
          }
        }
      }
      zzatq.zzc(paramParcel1);
      zzh((IObjectWrapper)localObject5, (String)localObject4, (Bundle)localObject3, (Bundle)localObject2, (zzq)localObject6, (zzbpy)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */