package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzee
{
  private static volatile zzee zzc;
  protected final Clock zza;
  protected final ExecutorService zzb;
  private final String zzd;
  private final AppMeasurementSdk zze;
  private final List zzf;
  private int zzg;
  private boolean zzh;
  private final String zzi;
  private volatile zzcc zzj;
  
  protected zzee(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramString1 != null) && (zzV(paramString2, paramString3))) {
      this.zzd = paramString1;
    } else {
      this.zzd = "FA";
    }
    this.zza = DefaultClock.getInstance();
    zzbx.zza();
    paramString1 = new zzdi(this);
    paramString1 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramString1);
    int j = 1;
    paramString1.allowCoreThreadTimeOut(true);
    this.zzb = Executors.unconfigurableExecutorService(paramString1);
    this.zze = new AppMeasurementSdk(this);
    this.zzf = new ArrayList();
    try
    {
      paramString1 = zzit.zzc(paramContext, "google_app_id", zzga.zza(paramContext));
      if ((paramString1 != null) && (!zzR()))
      {
        this.zzi = null;
        this.zzh = true;
        Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
        return;
      }
    }
    catch (IllegalStateException paramString1)
    {
      if (!zzV(paramString2, paramString3))
      {
        this.zzi = "fa";
        if ((paramString2 != null) && (paramString3 != null))
        {
          Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        else
        {
          int i;
          if (paramString2 == null) {
            i = 1;
          } else {
            i = 0;
          }
          if (paramString3 != null) {
            j = 0;
          }
          if ((i ^ j) != 0) {
            Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
          }
        }
      }
      else
      {
        this.zzi = paramString2;
      }
      zzU(new zzcx(this, paramString2, paramString3, paramContext, paramBundle));
      paramContext = (Application)paramContext.getApplicationContext();
      if (paramContext == null)
      {
        Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        return;
      }
      paramContext.registerActivityLifecycleCallbacks(new zzed(this));
    }
  }
  
  protected static final boolean zzR()
  {
    try
    {
      Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  private final void zzS(Exception paramException, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzh |= paramBoolean1;
    if (paramBoolean1)
    {
      Log.w(this.zzd, "Data collection startup failed. No data will be collected.", paramException);
      return;
    }
    if (paramBoolean2) {
      zzA(5, "Error with data collection. Data lost.", paramException, null, null);
    }
    Log.w(this.zzd, "Error with data collection. Data lost.", paramException);
  }
  
  private final void zzT(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
  {
    zzU(new zzdr(this, paramLong, paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2));
  }
  
  private final void zzU(zzdt paramzzdt)
  {
    this.zzb.execute(paramzzdt);
  }
  
  private static final boolean zzV(String paramString1, String paramString2)
  {
    return (paramString2 != null) && (paramString1 != null) && (!zzR());
  }
  
  public static zzee zzg(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    Preconditions.checkNotNull(paramContext);
    if (zzc == null) {
      try
      {
        if (zzc == null)
        {
          zzee localzzee = new com/google/android/gms/internal/measurement/zzee;
          localzzee.<init>(paramContext, paramString1, paramString2, paramString3, paramBundle);
          zzc = localzzee;
        }
      }
      finally {}
    }
    return zzc;
  }
  
  public final void zzA(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zzU(new zzdg(this, false, 5, paramString, paramObject1, null, null));
  }
  
  public final void zzB(zzhj paramzzhj)
  {
    Preconditions.checkNotNull(paramzzhj);
    List localList1 = this.zzf;
    int i = 0;
    try
    {
      while (i < this.zzf.size())
      {
        if (paramzzhj.equals(((Pair)this.zzf.get(i)).first))
        {
          Log.w(this.zzd, "OnEventListener already registered.");
          return;
        }
        i++;
      }
      zzdv localzzdv = new com/google/android/gms/internal/measurement/zzdv;
      localzzdv.<init>(paramzzhj);
      List localList2 = this.zzf;
      Pair localPair = new android/util/Pair;
      localPair.<init>(paramzzhj, localzzdv);
      localList2.add(localPair);
      if (this.zzj != null) {
        try
        {
          this.zzj.registerOnMeasurementEventListener(localzzdv);
          return;
        }
        catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException paramzzhj)
        {
          Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
        }
      }
      zzU(new zzdp(this, localzzdv));
      return;
    }
    finally {}
  }
  
  public final void zzC()
  {
    zzU(new zzcv(this));
  }
  
  public final void zzD(Bundle paramBundle)
  {
    zzU(new zzcn(this, paramBundle));
  }
  
  public final void zzE(Bundle paramBundle)
  {
    zzU(new zzct(this, paramBundle));
  }
  
  public final void zzF(Bundle paramBundle)
  {
    zzU(new zzcu(this, paramBundle));
  }
  
  public final void zzG(Activity paramActivity, String paramString1, String paramString2)
  {
    zzU(new zzcr(this, paramActivity, paramString1, paramString2));
  }
  
  public final void zzH(boolean paramBoolean)
  {
    zzU(new zzdm(this, paramBoolean));
  }
  
  public final void zzI(Bundle paramBundle)
  {
    zzU(new zzdn(this, paramBundle));
  }
  
  public final void zzJ(zzhi paramzzhi)
  {
    zzdu localzzdu = new zzdu(paramzzhi);
    if (this.zzj != null) {
      try
      {
        this.zzj.setEventInterceptor(localzzdu);
        return;
      }
      catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException paramzzhi)
      {
        Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
      }
    }
    zzU(new zzdo(this, localzzdu));
  }
  
  public final void zzK(Boolean paramBoolean)
  {
    zzU(new zzcs(this, paramBoolean));
  }
  
  public final void zzL(long paramLong)
  {
    zzU(new zzcw(this, paramLong));
  }
  
  public final void zzM(String paramString)
  {
    zzU(new zzcq(this, paramString));
  }
  
  public final void zzN(String paramString1, String paramString2, Object paramObject, boolean paramBoolean)
  {
    zzU(new zzds(this, paramString1, paramString2, paramObject, paramBoolean));
  }
  
  public final void zzO(zzhj paramzzhj)
  {
    Preconditions.checkNotNull(paramzzhj);
    List localList = this.zzf;
    int i = 0;
    try
    {
      while (i < this.zzf.size())
      {
        if (paramzzhj.equals(((Pair)this.zzf.get(i)).first))
        {
          paramzzhj = (Pair)this.zzf.get(i);
          break label75;
        }
        i++;
      }
      paramzzhj = null;
      label75:
      if (paramzzhj == null)
      {
        Log.w(this.zzd, "OnEventListener had not been registered.");
        return;
      }
      this.zzf.remove(paramzzhj);
      paramzzhj = (zzdv)paramzzhj.second;
      if (this.zzj != null) {
        try
        {
          this.zzj.unregisterOnMeasurementEventListener(paramzzhj);
          return;
        }
        catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException localRemoteException)
        {
          Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
        }
      }
      zzU(new zzdq(this, paramzzhj));
      return;
    }
    finally {}
  }
  
  public final int zza(String paramString)
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzdj(this, paramString, localzzbz));
    paramString = (Integer)zzbz.zze(localzzbz.zzb(10000L), Integer.class);
    if (paramString == null) {
      return 25;
    }
    return paramString.intValue();
  }
  
  public final long zzb()
  {
    Object localObject = new zzbz();
    zzU(new zzdc(this, (zzbz)localObject));
    localObject = (Long)zzbz.zze(((zzbz)localObject).zzb(500L), Long.class);
    long l;
    if (localObject == null)
    {
      l = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
      int i = this.zzg + 1;
      this.zzg = i;
      l += i;
    }
    else
    {
      l = ((Long)localObject).longValue();
    }
    return l;
  }
  
  public final Bundle zzc(Bundle paramBundle, boolean paramBoolean)
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzdh(this, paramBundle, localzzbz));
    if (paramBoolean) {
      return localzzbz.zzb(5000L);
    }
    return null;
  }
  
  public final AppMeasurementSdk zzd()
  {
    return this.zze;
  }
  
  protected final zzcc zzf(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext = zzcb.asInterface(DynamiteModule.load(paramContext, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
      return paramContext;
    }
    catch (DynamiteModule.LoadingException paramContext)
    {
      zzS(paramContext, true, false);
    }
    return null;
  }
  
  public final Object zzh(int paramInt)
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzdl(this, localzzbz, paramInt));
    return zzbz.zze(localzzbz.zzb(15000L), Object.class);
  }
  
  public final String zzj()
  {
    return this.zzi;
  }
  
  public final String zzk()
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzdk(this, localzzbz));
    return localzzbz.zzc(120000L);
  }
  
  public final String zzl()
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzdb(this, localzzbz));
    return localzzbz.zzc(50L);
  }
  
  public final String zzm()
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzde(this, localzzbz));
    return localzzbz.zzc(500L);
  }
  
  public final String zzn()
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzdd(this, localzzbz));
    return localzzbz.zzc(500L);
  }
  
  public final String zzo()
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzda(this, localzzbz));
    return localzzbz.zzc(500L);
  }
  
  public final List zzp(String paramString1, String paramString2)
  {
    zzbz localzzbz = new zzbz();
    zzU(new zzcp(this, paramString1, paramString2, localzzbz));
    paramString2 = (List)zzbz.zze(localzzbz.zzb(5000L), List.class);
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = Collections.emptyList();
    }
    return paramString1;
  }
  
  public final Map zzq(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = new zzbz();
    zzU(new zzdf(this, paramString1, paramString2, paramBoolean, (zzbz)localObject1));
    paramString1 = ((zzbz)localObject1).zzb(5000L);
    if ((paramString1 != null) && (paramString1.size() != 0))
    {
      localObject1 = new HashMap(paramString1.size());
      paramString2 = paramString1.keySet().iterator();
      while (paramString2.hasNext())
      {
        String str = (String)paramString2.next();
        Object localObject2 = paramString1.get(str);
        if (((localObject2 instanceof Double)) || ((localObject2 instanceof Long)) || ((localObject2 instanceof String))) {
          ((Map)localObject1).put(str, localObject2);
        }
      }
      return (Map)localObject1;
    }
    return Collections.emptyMap();
  }
  
  public final void zzu(String paramString)
  {
    zzU(new zzcy(this, paramString));
  }
  
  public final void zzv(String paramString1, String paramString2, Bundle paramBundle)
  {
    zzU(new zzco(this, paramString1, paramString2, paramBundle));
  }
  
  public final void zzw(String paramString)
  {
    zzU(new zzcz(this, paramString));
  }
  
  public final void zzx(String paramString, Bundle paramBundle)
  {
    zzT(null, paramString, paramBundle, false, true, null);
  }
  
  public final void zzy(String paramString1, String paramString2, Bundle paramBundle)
  {
    zzT(paramString1, paramString2, paramBundle, true, true, null);
  }
  
  public final void zzz(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    zzT(paramString1, paramString2, paramBundle, true, false, Long.valueOf(paramLong));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */