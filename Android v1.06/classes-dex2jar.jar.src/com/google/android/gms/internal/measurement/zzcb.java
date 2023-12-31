package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.Map;

public abstract class zzcb
  extends zzbn
  implements zzcc
{
  public zzcb()
  {
    super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
  }
  
  public static zzcc asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    if ((localIInterface instanceof zzcc)) {
      return (zzcc)localIInterface;
    }
    return new zzca(paramIBinder);
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject16 = null;
    Object localObject9 = null;
    Object localObject13 = null;
    Object localObject12 = null;
    Object localObject4 = null;
    IBinder localIBinder = null;
    Object localObject7 = null;
    Object localObject15 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    Object localObject14 = null;
    Object localObject5 = null;
    Object localObject8 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject1 = null;
    Object localObject6 = null;
    long l;
    boolean bool1;
    switch (paramInt1)
    {
    case 41: 
    default: 
      return false;
    case 45: 
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setConsentThirdParty((Bundle)localObject1, l);
      break;
    case 44: 
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setConsent((Bundle)localObject1, l);
      break;
    case 43: 
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      clearMeasurementEnabled(l);
      break;
    case 42: 
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      zzbo.zzc(paramParcel1);
      setDefaultEventParameters((Bundle)localObject1);
      break;
    case 40: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject6;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      isDataCollectionEnabled((zzcf)localObject1);
      break;
    case 39: 
      bool1 = zzbo.zzg(paramParcel1);
      zzbo.zzc(paramParcel1);
      setDataCollectionEnabled(bool1);
      break;
    case 38: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject16;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      paramInt1 = paramParcel1.readInt();
      zzbo.zzc(paramParcel1);
      getTestFlag((zzcf)localObject1, paramInt1);
      break;
    case 37: 
      localObject1 = zzbo.zzb(paramParcel1);
      zzbo.zzc(paramParcel1);
      initForTests((Map)localObject1);
      break;
    case 36: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject9;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        if ((localObject2 instanceof zzci)) {
          localObject1 = (zzci)localObject2;
        } else {
          localObject1 = new zzcg((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      unregisterOnMeasurementEventListener((zzci)localObject1);
      break;
    case 35: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject13;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        if ((localObject2 instanceof zzci)) {
          localObject1 = (zzci)localObject2;
        } else {
          localObject1 = new zzcg((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      registerOnMeasurementEventListener((zzci)localObject1);
      break;
    case 34: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject12;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        if ((localObject2 instanceof zzci)) {
          localObject1 = (zzci)localObject2;
        } else {
          localObject1 = new zzcg((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      setEventInterceptor((zzci)localObject1);
      break;
    case 33: 
      paramInt1 = paramParcel1.readInt();
      localObject2 = paramParcel1.readString();
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject4 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzbo.zzc(paramParcel1);
      logHealthData(paramInt1, (String)localObject2, (IObjectWrapper)localObject1, (IObjectWrapper)localObject4, (IObjectWrapper)localObject3);
      break;
    case 32: 
      localObject2 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject4;
      }
      else
      {
        localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject3 instanceof zzcf)) {
          localObject1 = (zzcf)localObject3;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      performAction((Bundle)localObject2, (zzcf)localObject1, l);
      break;
    case 31: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localIBinder;
      }
      else
      {
        localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject3 instanceof zzcf)) {
          localObject1 = (zzcf)localObject3;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivitySaveInstanceState((IObjectWrapper)localObject2, (zzcf)localObject1, l);
      break;
    case 30: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivityResumed((IObjectWrapper)localObject1, l);
      break;
    case 29: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivityPaused((IObjectWrapper)localObject1, l);
      break;
    case 28: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivityDestroyed((IObjectWrapper)localObject1, l);
      break;
    case 27: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivityCreated((IObjectWrapper)localObject2, (Bundle)localObject1, l);
      break;
    case 26: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivityStopped((IObjectWrapper)localObject1, l);
      break;
    case 25: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      onActivityStarted((IObjectWrapper)localObject1, l);
      break;
    case 24: 
      localObject1 = paramParcel1.readString();
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      endAdUnitExposure((String)localObject1, l);
      break;
    case 23: 
      localObject1 = paramParcel1.readString();
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      beginAdUnitExposure((String)localObject1, l);
      break;
    case 22: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject7;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      generateEventId((zzcf)localObject1);
      break;
    case 21: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject15;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getGmpAppId((zzcf)localObject1);
      break;
    case 20: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject10;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getAppInstanceId((zzcf)localObject1);
      break;
    case 19: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject11;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getCachedAppInstanceId((zzcf)localObject1);
      break;
    case 18: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject14;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
        if ((localObject2 instanceof zzck)) {
          localObject1 = (zzck)localObject2;
        } else {
          localObject1 = new zzcj((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      setInstanceIdProvider((zzck)localObject1);
      break;
    case 17: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject5;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getCurrentScreenClass((zzcf)localObject1);
      break;
    case 16: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject8;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getCurrentScreenName((zzcf)localObject1);
      break;
    case 15: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setCurrentScreen((IObjectWrapper)localObject2, (String)localObject3, (String)localObject1, l);
      break;
    case 14: 
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setSessionTimeoutDuration(l);
      break;
    case 13: 
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setMinimumSessionDuration(l);
      break;
    case 12: 
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      resetAnalyticsData(l);
      break;
    case 11: 
      bool1 = zzbo.zzg(paramParcel1);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setMeasurementEnabled(bool1, l);
      break;
    case 10: 
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getConditionalUserProperties((String)localObject3, (String)localObject4, (zzcf)localObject1);
      break;
    case 9: 
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      zzbo.zzc(paramParcel1);
      clearConditionalUserProperty((String)localObject2, (String)localObject3, (Bundle)localObject1);
      break;
    case 8: 
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setConditionalUserProperty((Bundle)localObject1, l);
      break;
    case 7: 
      localObject1 = paramParcel1.readString();
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setUserId((String)localObject1, l);
      break;
    case 6: 
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject3;
      }
      else
      {
        localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject3 instanceof zzcf)) {
          localObject1 = (zzcf)localObject3;
        } else {
          localObject1 = new zzcd((IBinder)localObject1);
        }
      }
      zzbo.zzc(paramParcel1);
      getMaxUserProperties((String)localObject2, (zzcf)localObject1);
      break;
    case 5: 
      localObject3 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      bool1 = zzbo.zzg(paramParcel1);
      localObject4 = paramParcel1.readStrongBinder();
      if (localObject4 != null)
      {
        localObject1 = ((IBinder)localObject4).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject1 instanceof zzcf)) {
          localObject1 = (zzcf)localObject1;
        } else {
          localObject1 = new zzcd((IBinder)localObject4);
        }
      }
      zzbo.zzc(paramParcel1);
      getUserProperties((String)localObject3, (String)localObject2, bool1, (zzcf)localObject1);
      break;
    case 4: 
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      bool1 = zzbo.zzg(paramParcel1);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      setUserProperty((String)localObject2, (String)localObject3, (IObjectWrapper)localObject1, bool1, l);
      break;
    case 3: 
      localObject2 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      localObject3 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = localIBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject1 instanceof zzcf)) {
          localObject1 = (zzcf)localObject1;
        } else {
          localObject1 = new zzcd(localIBinder);
        }
      }
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      logEventAndBundle((String)localObject2, (String)localObject4, (Bundle)localObject3, (zzcf)localObject1, l);
      break;
    case 2: 
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject1 = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      boolean bool2 = zzbo.zzg(paramParcel1);
      bool1 = zzbo.zzg(paramParcel1);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      logEvent((String)localObject2, (String)localObject3, (Bundle)localObject1, bool2, bool1, l);
      break;
    case 1: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = (zzcl)zzbo.zza(paramParcel1, zzcl.CREATOR);
      l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      initialize((IObjectWrapper)localObject1, (zzcl)localObject2, l);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */