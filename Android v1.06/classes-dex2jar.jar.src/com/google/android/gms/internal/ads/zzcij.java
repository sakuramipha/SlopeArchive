package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

final class zzcij
  extends zzerx
{
  private final zzetd zza;
  private final zzcir zzb;
  private final zzcij zzc;
  private final zzgwb zzd;
  private final zzgwb zze;
  private final zzgwb zzf;
  private final zzgwb zzg;
  private final zzgwb zzh;
  private final zzgwb zzi;
  private final zzgwb zzj;
  private final zzgwb zzk;
  private final zzgwb zzl;
  private final zzgwb zzm;
  private final zzgwb zzn;
  
  public final zzeqt zza()
  {
    Context localContext = zzcir.zzC(this.zzb).zza();
    zzgvw.zzb(localContext);
    Object localObject2 = new zzbyq();
    Object localObject1 = zzcag.zza;
    zzgvw.zzb(localObject1);
    zzesx localzzesx = new zzesx((zzbyq)localObject2, (zzfwc)localObject1, zzete.zza(this.zza));
    localObject2 = zzcag.zza;
    zzgvw.zzb(localObject2);
    ScheduledExecutorService localScheduledExecutorService = (ScheduledExecutorService)zzcir.zzaw(this.zzb).zzb();
    zzffq localzzffq = (zzffq)this.zzn.zzb();
    zzdqc localzzdqc = (zzdqc)zzcir.zzQ(this.zzb).zzb();
    localObject1 = new HashSet();
    ((Set)localObject1).add(new zzeow(localzzesx, 0L, localScheduledExecutorService));
    return new zzeqt(localContext, (Executor)localObject2, (Set)localObject1, localzzffq, localzzdqc);
  }
  
  public final zzfed zzb()
  {
    return (zzfed)this.zzm.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */