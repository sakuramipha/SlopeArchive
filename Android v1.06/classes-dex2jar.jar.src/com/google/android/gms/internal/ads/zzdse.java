package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdse
{
  private boolean zza = false;
  private boolean zzb = false;
  private boolean zzc = false;
  private final long zzd;
  private final zzcal zze = new zzcal();
  private final Context zzf;
  private final WeakReference zzg;
  private final zzdnx zzh;
  private final Executor zzi;
  private final Executor zzj;
  private final ScheduledExecutorService zzk;
  private final zzdql zzl;
  private final zzbzz zzm;
  private final Map zzn = new ConcurrentHashMap();
  private final zzdbz zzo;
  private final zzfft zzp;
  private boolean zzq = true;
  
  public zzdse(Executor paramExecutor1, Context paramContext, WeakReference paramWeakReference, Executor paramExecutor2, zzdnx paramzzdnx, ScheduledExecutorService paramScheduledExecutorService, zzdql paramzzdql, zzbzz paramzzbzz, zzdbz paramzzdbz, zzfft paramzzfft)
  {
    this.zzh = paramzzdnx;
    this.zzf = paramContext;
    this.zzg = paramWeakReference;
    this.zzi = paramExecutor2;
    this.zzk = paramScheduledExecutorService;
    this.zzj = paramExecutor1;
    this.zzl = paramzzdql;
    this.zzm = paramzzbzz;
    this.zzo = paramzzdbz;
    this.zzp = paramzzfft;
    this.zzd = zzt.zzB().elapsedRealtime();
    zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
  }
  
  private final zzfwb zzu()
  {
    try
    {
      Object localObject1 = zzt.zzo().zzh().zzh().zzc();
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject1 = zzfvr.zzh(localObject1);
        return (zzfwb)localObject1;
      }
      zzcal localzzcal = new com/google/android/gms/internal/ads/zzcal;
      localzzcal.<init>();
      localObject1 = zzt.zzo().zzh();
      zzdsa localzzdsa = new com/google/android/gms/internal/ads/zzdsa;
      localzzdsa.<init>(this, localzzcal);
      ((zzg)localObject1).zzq(localzzdsa);
      return localzzcal;
    }
    finally {}
  }
  
  private final void zzv(String paramString1, boolean paramBoolean, String paramString2, int paramInt)
  {
    this.zzn.put(paramString1, new zzbke(paramString1, paramBoolean, paramInt, paramString2));
  }
  
  public final List zzg()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zzn.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      zzbke localzzbke = (zzbke)this.zzn.get(str);
      localArrayList.add(new zzbke(str, localzzbke.zzb, localzzbke.zzc, localzzbke.zzd));
    }
    return localArrayList;
  }
  
  public final void zzl()
  {
    this.zzq = false;
  }
  
  public final void zzr()
  {
    if (!((Boolean)zzbdj.zza.zze()).booleanValue())
    {
      int i = this.zzm.zzc;
      Object localObject1 = zzbbk.zzbG;
      if ((i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue()) && (this.zzq))
      {
        if (this.zza) {
          return;
        }
        try
        {
          if (this.zza) {
            return;
          }
          this.zzl.zzf();
          this.zzo.zzf();
          Object localObject3 = this.zze;
          localObject1 = new com/google/android/gms/internal/ads/zzdru;
          ((zzdru)localObject1).<init>(this);
          ((zzcal)localObject3).zzc((Runnable)localObject1, this.zzi);
          this.zza = true;
          localObject1 = zzu();
          ScheduledExecutorService localScheduledExecutorService = this.zzk;
          localObject3 = new com/google/android/gms/internal/ads/zzdrx;
          ((zzdrx)localObject3).<init>(this);
          zzbbc localzzbbc = zzbbk.zzbI;
          localScheduledExecutorService.schedule((Runnable)localObject3, ((Long)zzba.zzc().zzb(localzzbbc)).longValue(), TimeUnit.SECONDS);
          localObject3 = new com/google/android/gms/internal/ads/zzdsc;
          ((zzdsc)localObject3).<init>(this);
          zzfvr.zzq((zzfwb)localObject1, (zzfvn)localObject3, this.zzi);
          return;
        }
        finally {}
      }
    }
    if (!this.zza)
    {
      zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
      this.zze.zzd(Boolean.valueOf(false));
      this.zza = true;
      this.zzb = true;
    }
  }
  
  public final void zzs(zzbkl paramzzbkl)
  {
    this.zze.zzc(new zzdry(this, paramzzbkl), this.zzj);
  }
  
  public final boolean zzt()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */