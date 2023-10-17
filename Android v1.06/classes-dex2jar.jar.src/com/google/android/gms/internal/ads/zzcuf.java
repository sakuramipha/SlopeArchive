package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcuf
  implements zzcvi, zzdcf, zzdaa, zzcvy, zzaty
{
  private final zzcwa zza;
  private final zzezf zzb;
  private final ScheduledExecutorService zzc;
  private final Executor zzd;
  private final zzfwk zze = zzfwk.zzf();
  private ScheduledFuture zzf;
  private final AtomicBoolean zzg = new AtomicBoolean();
  
  zzcuf(zzcwa paramzzcwa, zzezf paramzzezf, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor)
  {
    this.zza = paramzzcwa;
    this.zzb = paramzzezf;
    this.zzc = paramScheduledExecutorService;
    this.zzd = paramExecutor;
  }
  
  private final boolean zzh()
  {
    return this.zzb.zzZ == 2;
  }
  
  public final void zzbr() {}
  
  public final void zzc(zzatx paramzzatx)
  {
    zzbbc localzzbbc = zzbbk.zzjM;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!zzh()) && (paramzzatx.zzj) && (this.zzg.compareAndSet(false, true)))
    {
      com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
      this.zza.zza();
    }
  }
  
  public final void zzd()
  {
    zzbbc localzzbbc = zzbbk.zzjM;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!zzh())) {
      this.zza.zza();
    }
  }
  
  public final void zze()
  {
    try
    {
      boolean bool = this.zze.isDone();
      if (bool) {
        return;
      }
      ScheduledFuture localScheduledFuture = this.zzf;
      if (localScheduledFuture != null) {
        localScheduledFuture.cancel(true);
      }
      this.zze.zzd(Boolean.valueOf(true));
      return;
    }
    finally {}
  }
  
  public final void zzf()
  {
    zzbbc localzzbbc = zzbbk.zzbs;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (zzh()))
    {
      if (this.zzb.zzr == 0)
      {
        this.zza.zza();
        return;
      }
      zzfvr.zzq(this.zze, new zzcue(this), this.zzd);
      this.zzf = this.zzc.schedule(new zzcud(this), this.zzb.zzr, TimeUnit.MILLISECONDS);
    }
  }
  
  public final void zzg() {}
  
  public final void zzj() {}
  
  public final void zzk(com.google.android.gms.ads.internal.client.zze paramzze)
  {
    try
    {
      boolean bool = this.zze.isDone();
      if (bool) {
        return;
      }
      paramzze = this.zzf;
      if (paramzze != null) {
        paramzze.cancel(true);
      }
      zzfwk localzzfwk = this.zze;
      paramzze = new java/lang/Exception;
      paramzze.<init>();
      localzzfwk.zze(paramzze);
      return;
    }
    finally {}
  }
  
  public final void zzm() {}
  
  public final void zzo()
  {
    int i = this.zzb.zzZ;
    if ((i == 0) || (i == 1))
    {
      zzbbc localzzbbc = zzbbk.zzjM;
      if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        this.zza.zza();
      }
    }
  }
  
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2) {}
  
  public final void zzq() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcuf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */