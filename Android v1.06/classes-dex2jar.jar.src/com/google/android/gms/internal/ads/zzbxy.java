package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbxy
{
  final AtomicBoolean zza = new AtomicBoolean(false);
  private final AtomicReference zzb = new AtomicReference(null);
  private final Object zzc = new Object();
  private String zzd = null;
  private String zze = null;
  private final AtomicInteger zzf = new AtomicInteger(-1);
  private final AtomicReference zzg = new AtomicReference(null);
  private final AtomicReference zzh = new AtomicReference(null);
  private final ConcurrentMap zzi = new ConcurrentHashMap(9);
  private final AtomicReference zzj = new AtomicReference(null);
  private final BlockingQueue zzk = new ArrayBlockingQueue(20);
  private final Object zzl = new Object();
  
  private final void zzA(Context paramContext, String paramString1, String paramString2)
  {
    if (zzE(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true))
    {
      Method localMethod = (Method)this.zzi.get(paramString2);
      if (localMethod != null) {
        paramContext = localMethod;
      } else {
        try
        {
          paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString2, new Class[] { String.class });
          this.zzi.put(paramString2, paramContext);
        }
        catch (Exception paramContext)
        {
          zzC(paramString2, false);
          paramContext = null;
        }
      }
      try
      {
        paramContext.invoke(this.zzg.get(), new Object[] { paramString1 });
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append("Invoke Firebase method ");
        paramContext.append(paramString2);
        paramContext.append(", Ad Unit Id: ");
        paramContext.append(paramString1);
        zze.zza(paramContext.toString());
        return;
      }
      catch (Exception paramContext)
      {
        zzC(paramString2, false);
      }
    }
  }
  
  private final void zzB(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    if (zzu(paramContext))
    {
      Bundle localBundle = new Bundle();
      try
      {
        localBundle.putLong("_aeid", Long.parseLong(paramString2));
      }
      catch (NumberFormatException localNumberFormatException) {}catch (NullPointerException localNullPointerException) {}
      zzbzt.zzh("Invalid event ID: ".concat(String.valueOf(paramString2)), localNullPointerException);
      if ("_ac".equals(paramString1)) {
        localBundle.putInt("_r", 1);
      }
      if (paramBundle != null) {
        localBundle.putAll(paramBundle);
      }
      if (zzv(paramContext))
      {
        zzD("logEventInternal", new zzbxk(paramString1, localBundle));
        return;
      }
      if (zzE(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true))
      {
        paramString2 = (Method)this.zzi.get("logEventInternal");
        if (paramString2 != null) {
          paramContext = paramString2;
        } else {
          try
          {
            paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[] { String.class, String.class, Bundle.class });
            this.zzi.put("logEventInternal", paramContext);
          }
          catch (Exception paramContext)
          {
            zzC("logEventInternal", true);
            paramContext = null;
          }
        }
        try
        {
          paramContext.invoke(this.zzg.get(), new Object[] { "am", paramString1, localBundle });
          return;
        }
        catch (Exception paramContext)
        {
          zzC("logEventInternal", true);
        }
      }
    }
  }
  
  private final void zzC(String paramString, boolean paramBoolean)
  {
    if (!this.zza.get())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invoke Firebase method ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" error.");
      zzbzt.zzj(localStringBuilder.toString());
      if (paramBoolean)
      {
        zzbzt.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
        this.zza.set(true);
      }
    }
  }
  
  private final void zzD(String paramString, zzbxx paramzzbxx)
  {
    synchronized (this.zzj)
    {
      FutureTask localFutureTask = new java/util/concurrent/FutureTask;
      zzbxl localzzbxl = new com/google/android/gms/internal/ads/zzbxl;
      localzzbxl.<init>(this, paramzzbxx, paramString);
      localFutureTask.<init>(localzzbxl, null);
      if (this.zzj.get() != null) {
        localFutureTask.run();
      } else {
        this.zzk.offer(localFutureTask);
      }
      return;
    }
  }
  
  private final boolean zzE(Context paramContext, String paramString, AtomicReference paramAtomicReference, boolean paramBoolean)
  {
    if (paramAtomicReference.get() == null) {
      try
      {
        zzbxh.zza(paramAtomicReference, null, paramContext.getClassLoader().loadClass(paramString).getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext }));
      }
      catch (Exception paramContext)
      {
        zzC("getInstance", paramBoolean);
        return false;
      }
    }
    return true;
  }
  
  static final boolean zzv(Context paramContext)
  {
    zzbbc localzzbbc = zzbbk.zzai;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      int i = DynamiteModule.getLocalVersion(paramContext, "com.google.android.gms.ads.dynamite");
      localzzbbc = zzbbk.zzaj;
      if (i < ((Integer)zzba.zzc().zzb(localzzbbc)).intValue()) {
        return false;
      }
      localzzbbc = zzbbk.zzak;
      if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {}
    }
    try
    {
      paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
      return false;
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;) {}
    }
    return true;
    return false;
  }
  
  private final Object zzw(String paramString, Object paramObject, zzbxw paramzzbxw)
  {
    synchronized (this.zzj)
    {
      zzcgs localzzcgs = (zzcgs)this.zzj.get();
      if (localzzcgs != null) {
        try
        {
          paramzzbxw = paramzzbxw.zza((zzcgs)this.zzj.get());
          return paramzzbxw;
        }
        catch (Exception paramzzbxw)
        {
          zzC(paramString, false);
        }
      }
      return paramObject;
    }
  }
  
  private final Object zzx(String paramString, Context paramContext)
  {
    if (!zzE(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
      return null;
    }
    paramContext = zzy(paramContext, paramString);
    try
    {
      paramContext = paramContext.invoke(this.zzg.get(), new Object[0]);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      zzC(paramString, true);
    }
    return null;
  }
  
  private final Method zzy(Context paramContext, String paramString)
  {
    Method localMethod = (Method)this.zzi.get(paramString);
    if (localMethod != null) {
      return localMethod;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[0]);
      this.zzi.put(paramString, paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      zzC(paramString, false);
    }
    return null;
  }
  
  private final ExecutorService zzz()
  {
    if (this.zzb.get() == null)
    {
      Object localObject;
      if (ClientLibraryUtils.isPackageSide())
      {
        localObject = zzflu.zza();
        zzbbc localzzbbc = zzbbk.zzah;
        localObject = ((zzflr)localObject).zzc(((Integer)zzba.zzc().zzb(localzzbbc)).intValue(), new zzbxv(this), 2);
      }
      else
      {
        localObject = zzbbk.zzah;
        int i = ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue();
        localObject = zzbbk.zzah;
        localObject = new ThreadPoolExecutor(i, ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbxv(this));
      }
      zzbxh.zza(this.zzb, null, localObject);
    }
    return (ExecutorService)this.zzb.get();
  }
  
  public final String zza(Context paramContext)
  {
    if (!zzu(paramContext)) {
      return null;
    }
    if (zzv(paramContext))
    {
      paramContext = (Long)zzw("getAdEventId", null, zzbxm.zza);
      if (paramContext != null) {
        return Long.toString(paramContext.longValue());
      }
      return null;
    }
    paramContext = zzx("generateEventId", paramContext);
    if (paramContext != null) {
      return paramContext.toString();
    }
    return null;
  }
  
  public final String zzb(Context paramContext)
  {
    if (!zzu(paramContext)) {
      return null;
    }
    synchronized (this.zzc)
    {
      String str = this.zze;
      if (str != null) {
        return str;
      }
      if (zzv(paramContext)) {
        this.zze = ((String)zzw("getAppIdOrigin", this.zze, zzbxq.zza));
      } else {
        this.zze = "fa";
      }
      paramContext = this.zze;
      return paramContext;
    }
  }
  
  public final String zzc(Context paramContext)
  {
    if (!zzu(paramContext)) {
      return null;
    }
    Object localObject = zzbbk.zzag;
    long l = ((Long)zzba.zzc().zzb((zzbbc)localObject)).longValue();
    if (zzv(paramContext))
    {
      if (l < 0L) {}
      try
      {
        return (String)zzw("getAppInstanceId", null, zzbxr.zza);
      }
      catch (Exception paramContext)
      {
        return null;
      }
      catch (TimeoutException paramContext)
      {
        return "TIME_OUT";
      }
      paramContext = zzz();
      localObject = new com/google/android/gms/internal/ads/zzbxs;
      ((zzbxs)localObject).<init>(this);
      paramContext = (String)paramContext.submit((Callable)localObject).get(l, TimeUnit.MILLISECONDS);
      return paramContext;
    }
    if (l < 0L) {
      return (String)zzx("getAppInstanceId", paramContext);
    }
    paramContext = zzz().submit(new zzbxt(this, paramContext));
    try
    {
      paramContext = (String)paramContext.get(l, TimeUnit.MILLISECONDS);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      return null;
    }
    catch (TimeoutException paramContext) {}
    return "TIME_OUT";
  }
  
  public final String zzd(Context paramContext)
  {
    boolean bool = zzu(paramContext);
    String str2 = "";
    if (!bool) {
      return "";
    }
    if (zzv(paramContext)) {
      return (String)zzw("getCurrentScreenNameOrScreenClass", "", zzbxn.zza);
    }
    if (!zzE(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
      return "";
    }
    try
    {
      String str3 = (String)zzy(paramContext, "getCurrentScreenName").invoke(this.zzg.get(), new Object[0]);
      String str1 = str3;
      if (str3 == null) {
        str1 = (String)zzy(paramContext, "getCurrentScreenClass").invoke(this.zzg.get(), new Object[0]);
      }
      if (str1 == null) {
        paramContext = str2;
      } else {
        paramContext = str1;
      }
      return paramContext;
    }
    catch (Exception paramContext)
    {
      zzC("getCurrentScreenName", false);
    }
    return "";
  }
  
  public final String zze(Context paramContext)
  {
    if (!zzu(paramContext)) {
      return null;
    }
    synchronized (this.zzc)
    {
      String str = this.zzd;
      if (str != null) {
        return str;
      }
      if (zzv(paramContext)) {
        this.zzd = ((String)zzw("getGmpAppId", this.zzd, zzbxj.zza));
      } else {
        this.zzd = ((String)zzx("getGmpAppId", paramContext));
      }
      paramContext = this.zzd;
      return paramContext;
    }
  }
  
  public final void zzh(Context paramContext, String paramString)
  {
    if (!zzu(paramContext)) {
      return;
    }
    if (zzv(paramContext))
    {
      zzD("beginAdUnitExposure", new zzbxi(paramString));
      return;
    }
    zzA(paramContext, paramString, "beginAdUnitExposure");
  }
  
  public final void zzi(Context paramContext, String paramString)
  {
    if (!zzu(paramContext)) {
      return;
    }
    if (zzv(paramContext))
    {
      zzD("endAdUnitExposure", new zzbxp(paramString));
      return;
    }
    zzA(paramContext, paramString, "endAdUnitExposure");
  }
  
  public final void zzk(Context paramContext, String paramString)
  {
    zzB(paramContext, "_aa", paramString, null);
  }
  
  public final void zzl(Context paramContext, String paramString)
  {
    zzB(paramContext, "_aq", paramString, null);
  }
  
  public final void zzm(Context paramContext, String paramString)
  {
    zzB(paramContext, "_ac", paramString, null);
  }
  
  public final void zzn(Context paramContext, String paramString)
  {
    zzB(paramContext, "_ai", paramString, null);
  }
  
  public final void zzo(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (!zzu(paramContext)) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_ai", paramString2);
    localBundle.putString("reward_type", paramString3);
    localBundle.putInt("reward_value", paramInt);
    zzB(paramContext, "_ar", paramString1, localBundle);
    paramContext = new StringBuilder();
    paramContext.append("Log a Firebase reward video event, reward type: ");
    paramContext.append(paramString3);
    paramContext.append(", reward value: ");
    paramContext.append(paramInt);
    zze.zza(paramContext.toString());
  }
  
  public final void zzp(Context paramContext, zzl arg2)
  {
    ??? = zzbbk.zzan;
    if ((((Boolean)zzba.zzc().zzb(???)).booleanValue()) && (zzu(paramContext)) && (zzv(paramContext))) {
      synchronized (this.zzl) {}
    }
  }
  
  public final void zzq(Context paramContext, zzff arg2)
  {
    zzbxz.zzd(paramContext).zzb().zzd(???);
    ??? = zzbbk.zzan;
    if ((((Boolean)zzba.zzc().zzb(???)).booleanValue()) && (zzu(paramContext)) && (zzv(paramContext))) {
      synchronized (this.zzl) {}
    }
  }
  
  public final void zzr(Bundle paramBundle)
  {
    zzD("setConsent", new zzbxu(paramBundle));
  }
  
  @Deprecated
  public final void zzs(Context paramContext, String paramString)
  {
    if (!zzu(paramContext)) {
      return;
    }
    if (!(paramContext instanceof Activity)) {
      return;
    }
    if (zzv(paramContext))
    {
      zzD("setScreenName", new zzbxo(paramContext, paramString));
      return;
    }
    if (zzE(paramContext, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false))
    {
      Method localMethod = (Method)this.zzi.get("setCurrentScreen");
      Object localObject;
      if (localMethod == null) {
        try
        {
          localMethod = paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[] { Activity.class, String.class, String.class });
          this.zzi.put("setCurrentScreen", localMethod);
        }
        catch (Exception localException)
        {
          zzC("setCurrentScreen", false);
          localObject = null;
        }
      }
      try
      {
        Activity localActivity = (Activity)paramContext;
        ((Method)localObject).invoke(this.zzh.get(), new Object[] { localActivity, paramString, paramContext.getPackageName() });
        return;
      }
      catch (Exception paramContext)
      {
        zzC("setCurrentScreen", false);
      }
    }
  }
  
  public final boolean zzt()
  {
    synchronized (this.zzl)
    {
      return false;
    }
  }
  
  public final boolean zzu(Context paramContext)
  {
    zzbbc localzzbbc = zzbbk.zzab;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!this.zza.get()))
    {
      localzzbbc = zzbbk.zzal;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        return true;
      }
      if (this.zzf.get() == -1)
      {
        zzay.zzb();
        if (!zzbzm.zzs(paramContext, 12451000))
        {
          zzay.zzb();
          if (zzbzm.zzt(paramContext))
          {
            zzbzt.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
            this.zzf.set(0);
            break label116;
          }
        }
        this.zzf.set(1);
      }
      label116:
      if (this.zzf.get() == 1) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */