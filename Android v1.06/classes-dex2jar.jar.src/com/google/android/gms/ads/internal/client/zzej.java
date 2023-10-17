package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.RequestConfiguration.Builder;
import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfpo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;

public final class zzej
{
  private static zzej zza;
  private final Object zzb = new Object();
  private final ArrayList zzc = new ArrayList();
  private boolean zzd = false;
  private boolean zze = false;
  private final Object zzf = new Object();
  private zzco zzg;
  @Nullable
  private OnAdInspectorClosedListener zzh = null;
  private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
  
  private final void zzA(Context paramContext)
  {
    if (this.zzg == null) {
      this.zzg = ((zzco)new zzaq(zzay.zza(), paramContext).zzd(paramContext, false));
    }
  }
  
  private final void zzB(RequestConfiguration paramRequestConfiguration)
  {
    try
    {
      zzco localzzco = this.zzg;
      zzff localzzff = new com/google/android/gms/ads/internal/client/zzff;
      localzzff.<init>(paramRequestConfiguration);
      localzzco.zzu(localzzff);
      return;
    }
    catch (RemoteException paramRequestConfiguration)
    {
      zzbzt.zzh("Unable to set request configuration parcel.", paramRequestConfiguration);
    }
  }
  
  public static zzej zzf()
  {
    try
    {
      if (zza == null)
      {
        localzzej = new com/google/android/gms/ads/internal/client/zzej;
        localzzej.<init>();
        zza = localzzej;
      }
      zzej localzzej = zza;
      return localzzej;
    }
    finally {}
  }
  
  private static InitializationStatus zzy(List paramList)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzbke localzzbke = (zzbke)localIterator.next();
      String str = localzzbke.zza;
      if (localzzbke.zzb) {
        paramList = AdapterStatus.State.READY;
      } else {
        paramList = AdapterStatus.State.NOT_READY;
      }
      localHashMap.put(str, new zzbkm(paramList, localzzbke.zzd, localzzbke.zzc));
    }
    return new zzbkn(localHashMap);
  }
  
  private final void zzz(Context paramContext, @Nullable String paramString)
  {
    try
    {
      zzbnr.zza().zzb(paramContext, null);
      this.zzg.zzk();
      this.zzg.zzl(null, ObjectWrapper.wrap(null));
      return;
    }
    catch (RemoteException paramContext)
    {
      zzbzt.zzk("MobileAdsSettingManager initialization failed", paramContext);
    }
  }
  
  public final float zza()
  {
    synchronized (this.zzf)
    {
      zzco localzzco = this.zzg;
      float f2 = 1.0F;
      if (localzzco == null) {
        return 1.0F;
      }
      float f1;
      try
      {
        f1 = localzzco.zze();
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to get app volume.", localRemoteException);
        f1 = f2;
      }
      return f1;
    }
  }
  
  public final RequestConfiguration zzc()
  {
    return this.zzi;
  }
  
  public final InitializationStatus zze()
  {
    synchronized (this.zzf)
    {
      boolean bool;
      if (this.zzg != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "MobileAds.initialize() must be called prior to getting initialization status.");
      try
      {
        InitializationStatus localInitializationStatus = zzy(this.zzg.zzg());
        return localInitializationStatus;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzg("Unable to get Initialization status.");
        zzeb localzzeb = new com/google/android/gms/ads/internal/client/zzeb;
        localzzeb.<init>(this);
        return localzzeb;
      }
    }
  }
  
  public final String zzh()
  {
    synchronized (this.zzf)
    {
      boolean bool;
      if (this.zzg != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "MobileAds.initialize() must be called prior to getting version string.");
      try
      {
        String str = zzfpo.zzc(this.zzg.zzf());
        return str;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to get internal version.", localRemoteException);
        return "";
      }
    }
  }
  
  public final void zzl(Context paramContext)
  {
    synchronized (this.zzf)
    {
      zzA(paramContext);
      try
      {
        this.zzg.zzi();
      }
      catch (RemoteException paramContext)
      {
        zzbzt.zzg("Unable to disable mediation adapter initialization.");
      }
      return;
    }
  }
  
  public final void zzm(boolean paramBoolean)
  {
    synchronized (this.zzf)
    {
      boolean bool;
      if (this.zzg != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
      try
      {
        this.zzg.zzj(paramBoolean);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        if (paramBoolean) {
          localObject1 = "enable";
        } else {
          localObject1 = "disable";
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Unable to ");
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append(" Same App Key.");
        zzbzt.zzh(localStringBuilder.toString(), localRemoteException);
        if ((localRemoteException.getMessage() != null) && (localRemoteException.getMessage().toLowerCase(Locale.ROOT).contains("paid")))
        {
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>(localRemoteException);
          throw ((Throwable)localObject1);
        }
      }
      return;
    }
  }
  
  public final void zzn(Context paramContext, @Nullable String arg2, @Nullable OnInitializationCompleteListener paramOnInitializationCompleteListener)
  {
    synchronized (this.zzb)
    {
      if (this.zzd)
      {
        if (paramOnInitializationCompleteListener != null) {
          this.zzc.add(paramOnInitializationCompleteListener);
        }
        return;
      }
      if (this.zze)
      {
        if (paramOnInitializationCompleteListener != null) {
          paramOnInitializationCompleteListener.onInitializationComplete(zze());
        }
        return;
      }
      this.zzd = true;
      if (paramOnInitializationCompleteListener != null) {
        this.zzc.add(paramOnInitializationCompleteListener);
      }
      if (paramContext != null)
      {
        try
        {
          synchronized (this.zzf)
          {
            zzA(paramContext);
            localObject = this.zzg;
            paramOnInitializationCompleteListener = new com/google/android/gms/ads/internal/client/zzei;
            paramOnInitializationCompleteListener.<init>(this, null);
            ((zzco)localObject).zzs(paramOnInitializationCompleteListener);
            localObject = this.zzg;
            paramOnInitializationCompleteListener = new com/google/android/gms/internal/ads/zzbnv;
            paramOnInitializationCompleteListener.<init>();
            ((zzco)localObject).zzo(paramOnInitializationCompleteListener);
            if ((this.zzi.getTagForChildDirectedTreatment() != -1) || (this.zzi.getTagForUnderAgeOfConsent() != -1)) {
              zzB(this.zzi);
            }
          }
        }
        catch (RemoteException paramOnInitializationCompleteListener)
        {
          Object localObject;
          zzbzt.zzk("MobileAdsSettingManager initialization failed", paramOnInitializationCompleteListener);
          zzbbk.zza(paramContext);
          if (((Boolean)zzbdb.zza.zze()).booleanValue())
          {
            paramOnInitializationCompleteListener = zzbbk.zzjF;
            if (((Boolean)zzba.zzc().zzb(paramOnInitializationCompleteListener)).booleanValue())
            {
              zzbzt.zze("Initializing on bg thread");
              localObject = zzbzi.zza;
              paramOnInitializationCompleteListener = new com/google/android/gms/ads/internal/client/zzec;
              paramOnInitializationCompleteListener.<init>(this, paramContext, null);
              ((ThreadPoolExecutor)localObject).execute(paramOnInitializationCompleteListener);
              break label325;
            }
          }
          if (((Boolean)zzbdb.zzb.zze()).booleanValue())
          {
            paramOnInitializationCompleteListener = zzbbk.zzjF;
            if (((Boolean)zzba.zzc().zzb(paramOnInitializationCompleteListener)).booleanValue())
            {
              paramOnInitializationCompleteListener = zzbzi.zzb;
              localObject = new com/google/android/gms/ads/internal/client/zzed;
              ((zzed)localObject).<init>(this, paramContext, null);
              paramOnInitializationCompleteListener.execute((Runnable)localObject);
              break label325;
            }
          }
          zzbzt.zze("Initializing on calling thread");
          zzz(paramContext, null);
          label325:
          return;
        }
        throw paramContext;
      }
      throw new IllegalArgumentException("Context cannot be null.");
    }
  }
  
  public final void zzq(Context paramContext, OnAdInspectorClosedListener paramOnAdInspectorClosedListener)
  {
    synchronized (this.zzf)
    {
      zzA(paramContext);
      this.zzh = paramOnAdInspectorClosedListener;
      try
      {
        zzco localzzco = this.zzg;
        paramContext = new com/google/android/gms/ads/internal/client/zzeg;
        paramContext.<init>(null);
        localzzco.zzm(paramContext);
      }
      catch (RemoteException paramContext)
      {
        zzbzt.zzg("Unable to open the ad inspector.");
        if (paramOnAdInspectorClosedListener != null)
        {
          paramContext = new com/google/android/gms/ads/AdInspectorError;
          paramContext.<init>(0, "Ad inspector had an internal error.", "com.google.android.gms.ads");
          paramOnAdInspectorClosedListener.onAdInspectorClosed(paramContext);
        }
      }
      return;
    }
  }
  
  public final void zzr(Context paramContext, String paramString)
  {
    synchronized (this.zzf)
    {
      boolean bool;
      if (this.zzg != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "MobileAds.initialize() must be called prior to opening debug menu.");
      try
      {
        this.zzg.zzn(ObjectWrapper.wrap(paramContext), paramString);
      }
      catch (RemoteException paramContext)
      {
        zzbzt.zzh("Unable to open debug menu.", paramContext);
      }
      return;
    }
  }
  
  public final void zzs(Class paramClass)
  {
    try
    {
      synchronized (this.zzf)
      {
        this.zzg.zzh(paramClass.getCanonicalName());
      }
    }
    catch (RemoteException paramClass)
    {
      zzbzt.zzh("Unable to register RtbAdapter", paramClass);
      return;
    }
  }
  
  public final void zzt(boolean paramBoolean)
  {
    synchronized (this.zzf)
    {
      boolean bool;
      if (this.zzg != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "MobileAds.initialize() must be called prior to setting app muted state.");
      try
      {
        this.zzg.zzp(paramBoolean);
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to set app mute state.", localRemoteException);
      }
      return;
    }
  }
  
  public final void zzu(float paramFloat)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1, "The app volume must be a value between 0 and 1 inclusive.");
    synchronized (this.zzf)
    {
      if (this.zzg != null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1, "MobileAds.initialize() must be called prior to setting the app volume.");
      try
      {
        this.zzg.zzq(paramFloat);
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to set app volume.", localRemoteException);
      }
      return;
    }
  }
  
  public final void zzv(String paramString)
  {
    synchronized (this.zzf)
    {
      boolean bool;
      if (this.zzg != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "MobileAds.initialize() must be called prior to setting the plugin.");
      try
      {
        this.zzg.zzt(paramString);
      }
      catch (RemoteException paramString)
      {
        zzbzt.zzh("Unable to set plugin.", paramString);
      }
      return;
    }
  }
  
  public final void zzw(RequestConfiguration paramRequestConfiguration)
  {
    boolean bool;
    if (paramRequestConfiguration != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Null passed to setRequestConfiguration.");
    synchronized (this.zzf)
    {
      RequestConfiguration localRequestConfiguration = this.zzi;
      this.zzi = paramRequestConfiguration;
      if (this.zzg == null) {
        return;
      }
      if ((localRequestConfiguration.getTagForChildDirectedTreatment() != paramRequestConfiguration.getTagForChildDirectedTreatment()) || (localRequestConfiguration.getTagForUnderAgeOfConsent() != paramRequestConfiguration.getTagForUnderAgeOfConsent())) {
        zzB(paramRequestConfiguration);
      }
      return;
    }
  }
  
  public final boolean zzx()
  {
    synchronized (this.zzf)
    {
      zzco localzzco = this.zzg;
      boolean bool1 = false;
      if (localzzco == null) {
        return false;
      }
      try
      {
        boolean bool2 = localzzco.zzv();
        bool1 = bool2;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to get app mute state.", localRemoteException);
      }
      return bool1;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */