package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbzc
{
  private final Object zza = new Object();
  private final zzj zzb;
  private final zzbzg zzc;
  private boolean zzd;
  private Context zze;
  private zzbzz zzf;
  private String zzg;
  private zzbbs zzh;
  private Boolean zzi;
  private final AtomicInteger zzj;
  private final zzbzb zzk;
  private final Object zzl;
  private zzfwb zzm;
  private final AtomicBoolean zzn;
  
  public zzbzc()
  {
    zzj localzzj = new zzj();
    this.zzb = localzzj;
    this.zzc = new zzbzg(zzay.zzd(), localzzj);
    this.zzd = false;
    this.zzh = null;
    this.zzi = null;
    this.zzj = new AtomicInteger(0);
    this.zzk = new zzbzb(null);
    this.zzl = new Object();
    this.zzn = new AtomicBoolean();
  }
  
  public final int zza()
  {
    return this.zzj.get();
  }
  
  public final Context zzc()
  {
    return this.zze;
  }
  
  public final Resources zzd()
  {
    if (this.zzf.zzd) {
      return this.zze.getResources();
    }
    try
    {
      zzbbc localzzbbc = zzbbk.zzjr;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        return zzbzx.zza(this.zze).getResources();
      }
      zzbzx.zza(this.zze).getResources();
      return null;
    }
    catch (zzbzw localzzbzw)
    {
      zzbzt.zzk("Cannot load resource from dynamite apk or local jar", localzzbzw);
    }
    return null;
  }
  
  public final zzbbs zzf()
  {
    synchronized (this.zza)
    {
      zzbbs localzzbbs = this.zzh;
      return localzzbbs;
    }
  }
  
  public final zzbzg zzg()
  {
    return this.zzc;
  }
  
  public final zzg zzh()
  {
    synchronized (this.zza)
    {
      zzj localzzj = this.zzb;
      return localzzj;
    }
  }
  
  public final zzfwb zzj()
  {
    if (this.zze != null)
    {
      ??? = zzbbk.zzct;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)???)).booleanValue()) {
        synchronized (this.zzl)
        {
          Object localObject2 = this.zzm;
          if (localObject2 != null) {
            return (zzfwb)localObject2;
          }
          zzfwc localzzfwc = zzcag.zza;
          localObject2 = new com/google/android/gms/internal/ads/zzbyx;
          ((zzbyx)localObject2).<init>(this);
          localObject2 = localzzfwc.zzb((Callable)localObject2);
          this.zzm = ((zzfwb)localObject2);
          return (zzfwb)localObject2;
        }
      }
    }
    return zzfvr.zzh(new ArrayList());
  }
  
  public final Boolean zzk()
  {
    synchronized (this.zza)
    {
      Boolean localBoolean = this.zzi;
      return localBoolean;
    }
  }
  
  public final String zzm()
  {
    return this.zzg;
  }
  
  public final void zzp()
  {
    this.zzk.zza();
  }
  
  public final void zzq()
  {
    this.zzj.decrementAndGet();
  }
  
  public final void zzr()
  {
    this.zzj.incrementAndGet();
  }
  
  public final void zzs(Context paramContext, zzbzz paramzzbzz)
  {
    synchronized (this.zza)
    {
      if (!this.zzd)
      {
        this.zze = paramContext.getApplicationContext();
        this.zzf = paramzzbzz;
        zzt.zzb().zzc(this.zzc);
        this.zzb.zzr(this.zze);
        zzbsy.zzb(this.zze, this.zzf);
        zzt.zze();
        Object localObject1;
        if (!((Boolean)zzbcx.zzc.zze()).booleanValue())
        {
          zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
          localObject1 = null;
        }
        else
        {
          localObject1 = new zzbbs();
        }
        this.zzh = ((zzbbs)localObject1);
        if (localObject1 != null)
        {
          localObject1 = new com/google/android/gms/internal/ads/zzbyy;
          ((zzbyy)localObject1).<init>(this);
          zzcaj.zza(((zzb)localObject1).zzb(), "AppState.registerCsiReporter");
        }
        if (PlatformVersion.isAtLeastO())
        {
          localObject1 = zzbbk.zzhU;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
          {
            ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
            localObject1 = new com/google/android/gms/internal/ads/zzbyz;
            ((zzbyz)localObject1).<init>(this);
            localConnectivityManager.registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback)localObject1);
          }
        }
        this.zzd = true;
        zzj();
      }
      zzt.zzp().zzc(paramContext, paramzzbzz.zza);
      return;
    }
  }
  
  public final void zzt(Throwable paramThrowable, String paramString)
  {
    zzbsy.zzb(this.zze, this.zzf).zzg(paramThrowable, paramString, ((Double)zzbdm.zzg.zze()).floatValue());
  }
  
  public final void zzu(Throwable paramThrowable, String paramString)
  {
    zzbsy.zzb(this.zze, this.zzf).zzf(paramThrowable, paramString);
  }
  
  public final void zzv(Boolean paramBoolean)
  {
    synchronized (this.zza)
    {
      this.zzi = paramBoolean;
      return;
    }
  }
  
  public final void zzw(String paramString)
  {
    this.zzg = paramString;
  }
  
  public final boolean zzx(Context paramContext)
  {
    if (PlatformVersion.isAtLeastO())
    {
      zzbbc localzzbbc = zzbbk.zzhU;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        return this.zzn.get();
      }
    }
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.isConnected());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */