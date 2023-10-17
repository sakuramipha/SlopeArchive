package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzejf
  implements AppEventListener, zzcyd, zzcww, zzcvl, zzcwc, zza, zzcvi, zzcxt, zzcvy, zzdcw
{
  final BlockingQueue zza;
  private final AtomicReference zzb = new AtomicReference();
  private final AtomicReference zzc = new AtomicReference();
  private final AtomicReference zzd = new AtomicReference();
  private final AtomicReference zze = new AtomicReference();
  private final AtomicReference zzf = new AtomicReference();
  private final AtomicBoolean zzg = new AtomicBoolean(true);
  private final AtomicBoolean zzh = new AtomicBoolean(false);
  private final AtomicBoolean zzi = new AtomicBoolean(false);
  private final zzfen zzj;
  
  public zzejf(zzfen paramzzfen)
  {
    zzbbc localzzbbc = zzbbk.zzio;
    this.zza = new ArrayBlockingQueue(((Integer)zzba.zzc().zzb(localzzbbc)).intValue());
    this.zzj = paramzzfen;
  }
  
  private final void zzu()
  {
    if ((this.zzh.get()) && (this.zzi.get()))
    {
      Iterator localIterator = this.zza.iterator();
      while (localIterator.hasNext())
      {
        Pair localPair = (Pair)localIterator.next();
        zzewk.zza(this.zzc, new zzeiw(localPair));
      }
      this.zza.clear();
      this.zzg.set(false);
    }
  }
  
  public final void onAdClicked()
  {
    zzbbc localzzbbc = zzbbk.zzjp;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      zzewk.zza(this.zzb, zzeix.zza);
    }
  }
  
  public final void onAppEvent(String paramString1, String paramString2)
  {
    try
    {
      if (this.zzg.get())
      {
        localObject2 = this.zza;
        localObject1 = new android/util/Pair;
        ((Pair)localObject1).<init>(paramString1, paramString2);
        if (!((BlockingQueue)localObject2).offer(localObject1))
        {
          zzbzt.zze("The queue for app events is full, dropping the new event.");
          localObject2 = this.zzj;
          if (localObject2 != null)
          {
            localObject1 = zzfem.zzb("dae_action");
            ((zzfem)localObject1).zza("dae_name", paramString1);
            ((zzfem)localObject1).zza("dae_data", paramString2);
            ((zzfen)localObject2).zzb((zzfem)localObject1);
            return;
          }
        }
        return;
      }
      Object localObject2 = this.zzc;
      Object localObject1 = new com/google/android/gms/internal/ads/zzeis;
      ((zzeis)localObject1).<init>(paramString1, paramString2);
      zzewk.zza((AtomicReference)localObject2, (zzewj)localObject1);
      return;
    }
    finally {}
  }
  
  public final void zza(zze paramzze)
  {
    zzewk.zza(this.zzb, new zzeiz(paramzze));
    zzewk.zza(this.zzb, new zzeja(paramzze));
    zzewk.zza(this.zze, new zzejb(paramzze));
    this.zzg.set(false);
    this.zza.clear();
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    this.zzg.set(true);
    this.zzi.set(false);
  }
  
  public final void zzbA(zzbug paramzzbug) {}
  
  public final void zzbr() {}
  
  public final zzbh zzc()
  {
    try
    {
      zzbh localzzbh = (zzbh)this.zzb.get();
      return localzzbh;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzcb zzd()
  {
    try
    {
      zzcb localzzcb = (zzcb)this.zzc.get();
      return localzzcb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zze(zzbh paramzzbh)
  {
    this.zzb.set(paramzzbh);
  }
  
  public final void zzf(zzbk paramzzbk)
  {
    this.zze.set(paramzzbk);
  }
  
  public final void zzg(zzdg paramzzdg)
  {
    this.zzd.set(paramzzdg);
  }
  
  public final void zzh(zzs paramzzs)
  {
    zzewk.zza(this.zzd, new zzeiu(paramzzs));
  }
  
  public final void zzi(zzcb paramzzcb)
  {
    this.zzc.set(paramzzcb);
    this.zzh.set(true);
    zzu();
  }
  
  public final void zzj()
  {
    zzewk.zza(this.zzb, zzeje.zza);
    zzewk.zza(this.zzf, zzein.zza);
  }
  
  public final void zzk(zze paramzze)
  {
    zzewk.zza(this.zzf, new zzeit(paramzze));
  }
  
  public final void zzl()
  {
    zzewk.zza(this.zzb, zzeim.zza);
  }
  
  public final void zzm()
  {
    zzewk.zza(this.zzb, zzeiv.zza);
  }
  
  public final void zzn()
  {
    try
    {
      zzewk.zza(this.zzb, zzejc.zza);
      zzewk.zza(this.zze, zzejd.zza);
      this.zzi.set(true);
      zzu();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzo()
  {
    zzewk.zza(this.zzb, zzeip.zza);
    zzewk.zza(this.zzf, zzeiq.zza);
    zzewk.zza(this.zzf, zzeir.zza);
  }
  
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2) {}
  
  public final void zzq() {}
  
  public final void zzr()
  {
    zzbbc localzzbbc = zzbbk.zzjp;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      zzewk.zza(this.zzb, zzeix.zza);
    }
    zzewk.zza(this.zzf, zzeiy.zza);
  }
  
  public final void zzs()
  {
    zzewk.zza(this.zzb, zzeio.zza);
  }
  
  public final void zzt(zzci paramzzci)
  {
    this.zzf.set(paramzzci);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzejf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */