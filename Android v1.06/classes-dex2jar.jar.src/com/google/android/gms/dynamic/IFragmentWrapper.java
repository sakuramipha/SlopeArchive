package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract interface IFragmentWrapper
  extends IInterface
{
  public abstract boolean zzA()
    throws RemoteException;
  
  public abstract int zzb()
    throws RemoteException;
  
  public abstract int zzc()
    throws RemoteException;
  
  public abstract Bundle zzd()
    throws RemoteException;
  
  public abstract IFragmentWrapper zze()
    throws RemoteException;
  
  public abstract IFragmentWrapper zzf()
    throws RemoteException;
  
  public abstract IObjectWrapper zzg()
    throws RemoteException;
  
  public abstract IObjectWrapper zzh()
    throws RemoteException;
  
  public abstract IObjectWrapper zzi()
    throws RemoteException;
  
  public abstract String zzj()
    throws RemoteException;
  
  public abstract void zzk(IObjectWrapper paramIObjectWrapper)
    throws RemoteException;
  
  public abstract void zzl(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void zzm(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void zzn(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void zzo(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void zzp(Intent paramIntent)
    throws RemoteException;
  
  public abstract void zzq(Intent paramIntent, int paramInt)
    throws RemoteException;
  
  public abstract void zzr(IObjectWrapper paramIObjectWrapper)
    throws RemoteException;
  
  public abstract boolean zzs()
    throws RemoteException;
  
  public abstract boolean zzt()
    throws RemoteException;
  
  public abstract boolean zzu()
    throws RemoteException;
  
  public abstract boolean zzv()
    throws RemoteException;
  
  public abstract boolean zzw()
    throws RemoteException;
  
  public abstract boolean zzx()
    throws RemoteException;
  
  public abstract boolean zzy()
    throws RemoteException;
  
  public abstract boolean zzz()
    throws RemoteException;
  
  public static abstract class Stub
    extends zzb
    implements IFragmentWrapper
  {
    public Stub()
    {
      super();
    }
    
    public static IFragmentWrapper asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      if ((localIInterface instanceof IFragmentWrapper)) {
        return (IFragmentWrapper)localIInterface;
      }
      return new zza(paramIBinder);
    }
    
    protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      boolean bool;
      switch (paramInt1)
      {
      default: 
        return false;
      case 27: 
        zzr(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        break;
      case 26: 
        zzq((Intent)zzc.zza(paramParcel1, Intent.CREATOR), paramParcel1.readInt());
        paramParcel2.writeNoException();
        break;
      case 25: 
        zzp((Intent)zzc.zza(paramParcel1, Intent.CREATOR));
        paramParcel2.writeNoException();
        break;
      case 24: 
        zzo(zzc.zzf(paramParcel1));
        paramParcel2.writeNoException();
        break;
      case 23: 
        zzn(zzc.zzf(paramParcel1));
        paramParcel2.writeNoException();
        break;
      case 22: 
        zzm(zzc.zzf(paramParcel1));
        paramParcel2.writeNoException();
        break;
      case 21: 
        zzl(zzc.zzf(paramParcel1));
        paramParcel2.writeNoException();
        break;
      case 20: 
        zzk(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        break;
      case 19: 
        bool = zzA();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 18: 
        bool = zzz();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 17: 
        bool = zzy();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 16: 
        bool = zzx();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 15: 
        bool = zzw();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 14: 
        bool = zzv();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 13: 
        bool = zzu();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 12: 
        paramParcel1 = zzi();
        paramParcel2.writeNoException();
        zzc.zze(paramParcel2, paramParcel1);
        break;
      case 11: 
        bool = zzt();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 10: 
        paramInt1 = zzc();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        break;
      case 9: 
        paramParcel1 = zzf();
        paramParcel2.writeNoException();
        zzc.zze(paramParcel2, paramParcel1);
        break;
      case 8: 
        paramParcel1 = zzj();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        break;
      case 7: 
        bool = zzs();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, bool);
        break;
      case 6: 
        paramParcel1 = zzh();
        paramParcel2.writeNoException();
        zzc.zze(paramParcel2, paramParcel1);
        break;
      case 5: 
        paramParcel1 = zze();
        paramParcel2.writeNoException();
        zzc.zze(paramParcel2, paramParcel1);
        break;
      case 4: 
        paramInt1 = zzb();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        break;
      case 3: 
        paramParcel1 = zzd();
        paramParcel2.writeNoException();
        zzc.zzd(paramParcel2, paramParcel1);
        break;
      case 2: 
        paramParcel1 = zzg();
        paramParcel2.writeNoException();
        zzc.zze(paramParcel2, paramParcel1);
      }
      return true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\IFragmentWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */