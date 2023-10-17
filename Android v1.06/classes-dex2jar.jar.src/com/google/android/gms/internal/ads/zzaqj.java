package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class zzaqj
  implements zzaqm
{
  private static zzaqj zzb;
  volatile long zza = 0L;
  private final Context zzc;
  private final zzfki zzd;
  private final zzfkp zze;
  private final zzfkr zzf;
  private final zzarl zzg;
  private final zzfit zzh;
  private final Executor zzi;
  private final zzfko zzj;
  private final CountDownLatch zzk;
  private final zzasa zzl;
  private final zzars zzm;
  private final zzarj zzn;
  private final Object zzo = new Object();
  private volatile boolean zzp;
  private volatile boolean zzq = false;
  private final int zzr;
  
  zzaqj(Context paramContext, zzfit paramzzfit, zzfki paramzzfki, zzfkp paramzzfkp, zzfkr paramzzfkr, zzarl paramzzarl, Executor paramExecutor, zzfio paramzzfio, int paramInt, zzasa paramzzasa, zzars paramzzars, zzarj paramzzarj)
  {
    this.zzc = paramContext;
    this.zzh = paramzzfit;
    this.zzd = paramzzfki;
    this.zze = paramzzfkp;
    this.zzf = paramzzfkr;
    this.zzg = paramzzarl;
    this.zzi = paramExecutor;
    this.zzr = paramInt;
    this.zzl = paramzzasa;
    this.zzm = paramzzars;
    this.zzn = paramzzarj;
    this.zzq = false;
    this.zzk = new CountDownLatch(1);
    this.zzj = new zzaqh(this, paramzzfio);
  }
  
  public static zzaqj zza(String paramString, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      paramString = zzb(paramString, paramContext, Executors.newCachedThreadPool(), paramBoolean1, paramBoolean2);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  @Deprecated
  public static zzaqj zzb(String paramString, Context paramContext, Executor paramExecutor, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      if (zzb == null)
      {
        Object localObject1 = zzfiv.zza();
        ((zzfiu)localObject1).zza(paramString);
        ((zzfiu)localObject1).zzc(paramBoolean1);
        Object localObject4 = ((zzfiu)localObject1).zzd();
        zzfit localzzfit = zzfit.zza(paramContext, paramExecutor, paramBoolean2);
        paramString = zzbbk.zzcZ;
        if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          localObject2 = zzaqu.zzc(paramContext);
        } else {
          localObject2 = null;
        }
        paramString = zzbbk.zzda;
        if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          paramString = zzasa.zzd(paramContext, paramExecutor);
        } else {
          paramString = null;
        }
        localObject1 = zzbbk.zzcp;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          localObject1 = new com/google/android/gms/internal/ads/zzars;
          ((zzars)localObject1).<init>();
        }
        else
        {
          localObject1 = null;
        }
        Object localObject3 = zzbbk.zzcr;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject3)).booleanValue())
        {
          localObject3 = new com/google/android/gms/internal/ads/zzarj;
          ((zzarj)localObject3).<init>();
        }
        else
        {
          localObject3 = null;
        }
        Object localObject7 = zzfjm.zze(paramContext, paramExecutor, localzzfit, (zzfiv)localObject4);
        Object localObject5 = new com/google/android/gms/internal/ads/zzark;
        ((zzark)localObject5).<init>(paramContext);
        Object localObject6 = new com/google/android/gms/internal/ads/zzary;
        ((zzary)localObject6).<init>(paramContext, (zzark)localObject5);
        zzarl localzzarl = new com/google/android/gms/internal/ads/zzarl;
        localzzarl.<init>((zzfiv)localObject4, (zzfjm)localObject7, (zzary)localObject6, (zzark)localObject5, (zzaqu)localObject2, paramString, (zzars)localObject1, (zzarj)localObject3);
        int i = zzfjv.zzb(paramContext, localzzfit);
        Object localObject2 = new com/google/android/gms/internal/ads/zzfio;
        ((zzfio)localObject2).<init>();
        localObject4 = new com/google/android/gms/internal/ads/zzaqj;
        localObject5 = new com/google/android/gms/internal/ads/zzfki;
        ((zzfki)localObject5).<init>(paramContext, i);
        localObject6 = new com/google/android/gms/internal/ads/zzfkp;
        localObject7 = new com/google/android/gms/internal/ads/zzaqg;
        ((zzaqg)localObject7).<init>(localzzfit);
        zzbbc localzzbbc = zzbbk.zzbY;
        ((zzfkp)localObject6).<init>(paramContext, i, (zzfjw)localObject7, ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue());
        localObject7 = new com/google/android/gms/internal/ads/zzfkr;
        ((zzfkr)localObject7).<init>(paramContext, localzzarl, localzzfit, (zzfio)localObject2);
        ((zzaqj)localObject4).<init>(paramContext, localzzfit, (zzfki)localObject5, (zzfkp)localObject6, (zzfkr)localObject7, localzzarl, paramExecutor, (zzfio)localObject2, i, paramString, (zzars)localObject1, (zzarj)localObject3);
        zzb = (zzaqj)localObject4;
        ((zzaqj)localObject4).zzm();
        zzb.zzp();
      }
      paramString = zzb;
      return paramString;
    }
    finally {}
  }
  
  private final void zzs()
  {
    zzasa localzzasa = this.zzl;
    if (localzzasa != null) {
      localzzasa.zzh();
    }
  }
  
  private final zzfkh zzt(int paramInt)
  {
    if (!zzfjv.zza(this.zzr)) {
      return null;
    }
    zzbbc localzzbbc = zzbbk.zzbW;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return this.zze.zzc(1);
    }
    return this.zzd.zzc(1);
  }
  
  public final String zze(Context paramContext, String paramString, View paramView)
  {
    return zzf(paramContext, paramString, paramView, null);
  }
  
  public final String zzf(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    zzs();
    Object localObject = zzbbk.zzcp;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      this.zzm.zzi();
    }
    zzp();
    localObject = this.zzf.zza();
    if (localObject != null)
    {
      long l = System.currentTimeMillis();
      paramContext = ((zzfiw)localObject).zza(paramContext, null, paramString, paramView, paramActivity);
      this.zzh.zzf(5000, System.currentTimeMillis() - l, paramContext, null);
      return paramContext;
    }
    return "";
  }
  
  public final String zzg(Context paramContext)
  {
    zzs();
    Object localObject = zzbbk.zzcp;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      this.zzm.zzj();
    }
    zzp();
    localObject = this.zzf.zza();
    if (localObject != null)
    {
      long l = System.currentTimeMillis();
      paramContext = ((zzfiw)localObject).zzc(paramContext, null);
      this.zzh.zzf(5001, System.currentTimeMillis() - l, paramContext, null);
      return paramContext;
    }
    return "";
  }
  
  public final String zzh(Context paramContext, View paramView, Activity paramActivity)
  {
    zzs();
    Object localObject = zzbbk.zzcp;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      this.zzm.zzk(paramContext, paramView);
    }
    zzp();
    localObject = this.zzf.zza();
    if (localObject != null)
    {
      long l = System.currentTimeMillis();
      paramContext = ((zzfiw)localObject).zzb(paramContext, null, paramView, paramActivity);
      this.zzh.zzf(5002, System.currentTimeMillis() - l, paramContext, null);
      return paramContext;
    }
    return "";
  }
  
  public final void zzk(MotionEvent paramMotionEvent)
  {
    zzfiw localzzfiw = this.zzf.zza();
    if (localzzfiw != null) {
      try
      {
        localzzfiw.zzd(null, paramMotionEvent);
        return;
      }
      catch (zzfkq paramMotionEvent)
      {
        this.zzh.zzc(paramMotionEvent.zza(), -1L, paramMotionEvent);
      }
    }
  }
  
  public final void zzl(int paramInt1, int paramInt2, int paramInt3) {}
  
  final void zzm()
  {
    try
    {
      long l = System.currentTimeMillis();
      zzfkh localzzfkh = zzt(1);
      if (localzzfkh != null)
      {
        if (this.zzf.zzc(localzzfkh))
        {
          this.zzq = true;
          this.zzk.countDown();
          return;
        }
        return;
      }
      this.zzh.zzd(4013, System.currentTimeMillis() - l);
      return;
    }
    finally {}
  }
  
  public final void zzn(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    zzarj localzzarj = this.zzn;
    if (localzzarj != null) {
      localzzarj.zzb(Arrays.asList(paramArrayOfStackTraceElement));
    }
  }
  
  public final void zzo(View paramView)
  {
    this.zzg.zzd(paramView);
  }
  
  public final void zzp()
  {
    if (!this.zzp) {
      synchronized (this.zzo)
      {
        if (!this.zzp)
        {
          if (System.currentTimeMillis() / 1000L - this.zza < 3600L) {
            return;
          }
          Object localObject2 = this.zzf.zzb();
          if (((localObject2 == null) || (((zzfkh)localObject2).zzd(3600L))) && (zzfjv.zza(this.zzr)))
          {
            localObject2 = this.zzi;
            zzaqi localzzaqi = new com/google/android/gms/internal/ads/zzaqi;
            localzzaqi.<init>(this);
            ((Executor)localObject2).execute(localzzaqi);
          }
        }
        return;
      }
    }
  }
  
  public final boolean zzr()
  {
    try
    {
      boolean bool = this.zzq;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */