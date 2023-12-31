package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzca
  extends zzbm
  implements zzcc
{
  zzca(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
  }
  
  public final void beginAdUnitExposure(String paramString, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    zzc(23, localParcel);
  }
  
  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbo.zze(localParcel, paramBundle);
    zzc(9, localParcel);
  }
  
  public final void clearMeasurementEnabled(long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeLong(paramLong);
    zzc(43, localParcel);
  }
  
  public final void endAdUnitExposure(String paramString, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    zzc(24, localParcel);
  }
  
  public final void generateEventId(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    zzc(22, localParcel);
  }
  
  public final void getAppInstanceId(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    zzc(20, localParcel);
  }
  
  public final void getCachedAppInstanceId(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    zzc(19, localParcel);
  }
  
  public final void getConditionalUserProperties(String paramString1, String paramString2, zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbo.zzf(localParcel, paramzzcf);
    zzc(10, localParcel);
  }
  
  public final void getCurrentScreenClass(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    zzc(17, localParcel);
  }
  
  public final void getCurrentScreenName(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    zzc(16, localParcel);
  }
  
  public final void getGmpAppId(zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    zzc(21, localParcel);
  }
  
  public final void getMaxUserProperties(String paramString, zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbo.zzf(localParcel, paramzzcf);
    zzc(6, localParcel);
  }
  
  public final void getTestFlag(zzcf paramzzcf, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzcf);
    localParcel.writeInt(paramInt);
    zzc(38, localParcel);
  }
  
  public final void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, zzcf paramzzcf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbo.zzd(localParcel, paramBoolean);
    zzbo.zzf(localParcel, paramzzcf);
    zzc(5, localParcel);
  }
  
  public final void initForTests(Map paramMap)
    throws RemoteException
  {
    throw null;
  }
  
  public final void initialize(IObjectWrapper paramIObjectWrapper, zzcl paramzzcl, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    zzbo.zze(localParcel, paramzzcl);
    localParcel.writeLong(paramLong);
    zzc(1, localParcel);
  }
  
  public final void isDataCollectionEnabled(zzcf paramzzcf)
    throws RemoteException
  {
    throw null;
  }
  
  public final void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbo.zze(localParcel, paramBundle);
    zzbo.zzd(localParcel, paramBoolean1);
    zzbo.zzd(localParcel, paramBoolean2);
    localParcel.writeLong(paramLong);
    zzc(2, localParcel);
  }
  
  public final void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, zzcf paramzzcf, long paramLong)
    throws RemoteException
  {
    throw null;
  }
  
  public final void logHealthData(int paramInt, String paramString, IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(5);
    localParcel.writeString(paramString);
    zzbo.zzf(localParcel, paramIObjectWrapper1);
    zzbo.zzf(localParcel, paramIObjectWrapper2);
    zzbo.zzf(localParcel, paramIObjectWrapper3);
    zzc(33, localParcel);
  }
  
  public final void onActivityCreated(IObjectWrapper paramIObjectWrapper, Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    zzbo.zze(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzc(27, localParcel);
  }
  
  public final void onActivityDestroyed(IObjectWrapper paramIObjectWrapper, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzc(28, localParcel);
  }
  
  public final void onActivityPaused(IObjectWrapper paramIObjectWrapper, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzc(29, localParcel);
  }
  
  public final void onActivityResumed(IObjectWrapper paramIObjectWrapper, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzc(30, localParcel);
  }
  
  public final void onActivitySaveInstanceState(IObjectWrapper paramIObjectWrapper, zzcf paramzzcf, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    zzbo.zzf(localParcel, paramzzcf);
    localParcel.writeLong(paramLong);
    zzc(31, localParcel);
  }
  
  public final void onActivityStarted(IObjectWrapper paramIObjectWrapper, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzc(25, localParcel);
  }
  
  public final void onActivityStopped(IObjectWrapper paramIObjectWrapper, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzc(26, localParcel);
  }
  
  public final void performAction(Bundle paramBundle, zzcf paramzzcf, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zze(localParcel, paramBundle);
    zzbo.zzf(localParcel, paramzzcf);
    localParcel.writeLong(paramLong);
    zzc(32, localParcel);
  }
  
  public final void registerOnMeasurementEventListener(zzci paramzzci)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzci);
    zzc(35, localParcel);
  }
  
  public final void resetAnalyticsData(long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeLong(paramLong);
    zzc(12, localParcel);
  }
  
  public final void setConditionalUserProperty(Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zze(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzc(8, localParcel);
  }
  
  public final void setConsent(Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zze(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzc(44, localParcel);
  }
  
  public final void setConsentThirdParty(Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zze(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzc(45, localParcel);
  }
  
  public final void setCurrentScreen(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeLong(paramLong);
    zzc(15, localParcel);
  }
  
  public final void setDataCollectionEnabled(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzd(localParcel, paramBoolean);
    zzc(39, localParcel);
  }
  
  public final void setDefaultEventParameters(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zze(localParcel, paramBundle);
    zzc(42, localParcel);
  }
  
  public final void setEventInterceptor(zzci paramzzci)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzci);
    zzc(34, localParcel);
  }
  
  public final void setInstanceIdProvider(zzck paramzzck)
    throws RemoteException
  {
    throw null;
  }
  
  public final void setMeasurementEnabled(boolean paramBoolean, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzd(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    zzc(11, localParcel);
  }
  
  public final void setMinimumSessionDuration(long paramLong)
    throws RemoteException
  {
    throw null;
  }
  
  public final void setSessionTimeoutDuration(long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeLong(paramLong);
    zzc(14, localParcel);
  }
  
  public final void setUserId(String paramString, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    zzc(7, localParcel);
  }
  
  public final void setUserProperty(String paramString1, String paramString2, IObjectWrapper paramIObjectWrapper, boolean paramBoolean, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbo.zzf(localParcel, paramIObjectWrapper);
    zzbo.zzd(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    zzc(4, localParcel);
  }
  
  public final void unregisterOnMeasurementEventListener(zzci paramzzci)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzbo.zzf(localParcel, paramzzci);
    zzc(36, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */