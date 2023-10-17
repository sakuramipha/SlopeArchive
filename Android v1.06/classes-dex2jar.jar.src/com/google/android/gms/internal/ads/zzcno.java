package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcno
  implements zzcvi, zzcww, zzcwc, zza, zzcvy
{
  private final Context zza;
  private final Executor zzb;
  private final Executor zzc;
  private final ScheduledExecutorService zzd;
  private final zzezr zze;
  private final zzezf zzf;
  private final zzfgf zzg;
  private final zzfaj zzh;
  private final zzaqq zzi;
  private final zzbcm zzj;
  private final zzffq zzk;
  private final WeakReference zzl;
  private final WeakReference zzm;
  private final zzcuk zzn;
  private boolean zzo;
  private final AtomicBoolean zzp = new AtomicBoolean();
  private final zzbco zzq;
  
  zzcno(Context paramContext, Executor paramExecutor1, Executor paramExecutor2, ScheduledExecutorService paramScheduledExecutorService, zzezr paramzzezr, zzezf paramzzezf, zzfgf paramzzfgf, zzfaj paramzzfaj, View paramView, zzcfb paramzzcfb, zzaqq paramzzaqq, zzbcm paramzzbcm, zzbco paramzzbco, zzffq paramzzffq, zzcuk paramzzcuk)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor1;
    this.zzc = paramExecutor2;
    this.zzd = paramScheduledExecutorService;
    this.zze = paramzzezr;
    this.zzf = paramzzezf;
    this.zzg = paramzzfgf;
    this.zzh = paramzzfaj;
    this.zzi = paramzzaqq;
    this.zzl = new WeakReference(paramView);
    this.zzm = new WeakReference(paramzzcfb);
    this.zzj = paramzzbcm;
    this.zzq = paramzzbco;
    this.zzk = paramzzffq;
    this.zzn = paramzzcuk;
  }
  
  private final void zzs()
  {
    Object localObject1 = zzbbk.zzjV;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
    {
      localObject1 = this.zzf.zzd;
      if ((localObject1 == null) || (((List)localObject1).isEmpty())) {
        return;
      }
    }
    localObject1 = zzbbk.zzdg;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
      localObject1 = this.zzi.zzc().zzh(this.zza, (View)this.zzl.get(), null);
    } else {
      localObject1 = null;
    }
    Object localObject2 = zzbbk.zzao;
    if (((((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue()) && (this.zze.zzb.zzb.zzg)) || (!((Boolean)zzbdc.zzh.zze()).booleanValue()))
    {
      localObject3 = this.zzh;
      localObject2 = this.zzg;
      zzezr localzzezr = this.zze;
      zzezf localzzezf = this.zzf;
      ((zzfaj)localObject3).zza(((zzfgf)localObject2).zzd(localzzezr, localzzezf, false, (String)localObject1, null, localzzezf.zzd));
      return;
    }
    if (((Boolean)zzbdc.zzg.zze()).booleanValue())
    {
      int i = this.zzf.zzb;
      if ((i == 1) || (i == 2) || (i == 5)) {
        localObject2 = (zzcfb)this.zzm.get();
      }
    }
    Object localObject3 = zzfvi.zzv(zzfvr.zzh(null));
    localObject2 = zzbbk.zzaS;
    zzfvr.zzq((zzfvi)zzfvr.zzn((zzfwb)localObject3, ((Long)zzba.zzc().zzb((zzbbc)localObject2)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnn(this, (String)localObject1), this.zzb);
  }
  
  private final void zzt(int paramInt1, int paramInt2)
  {
    if (paramInt1 > 0)
    {
      View localView = (View)this.zzl.get();
      if ((localView == null) || (localView.getHeight() == 0) || (localView.getWidth() == 0))
      {
        this.zzd.schedule(new zzcnh(this, paramInt1, paramInt2), paramInt2, TimeUnit.MILLISECONDS);
        return;
      }
    }
    zzs();
  }
  
  public final void onAdClicked()
  {
    Object localObject1 = zzbbk.zzao;
    if (((!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) || (!this.zze.zzb.zzb.zzg)) && (((Boolean)zzbdc.zzd.zze()).booleanValue()))
    {
      zzfvr.zzq(zzfvr.zze(zzfvi.zzv(this.zzj.zza()), Throwable.class, zzcni.zza, zzcag.zzf), new zzcnm(this), this.zzb);
      return;
    }
    localObject1 = this.zzh;
    Object localObject2 = this.zzg;
    zzezr localzzezr = this.zze;
    zzezf localzzezf = this.zzf;
    localObject2 = ((zzfgf)localObject2).zzc(localzzezr, localzzezf, localzzezf.zzc);
    boolean bool = zzt.zzo().zzx(this.zza);
    int i = 1;
    if (true == bool) {
      i = 2;
    }
    ((zzfaj)localObject1).zzc((List)localObject2, i);
  }
  
  public final void zzbr()
  {
    zzfaj localzzfaj = this.zzh;
    zzfgf localzzfgf = this.zzg;
    zzezr localzzezr = this.zze;
    zzezf localzzezf = this.zzf;
    localzzfaj.zza(localzzfgf.zzc(localzzezr, localzzezf, localzzezf.zzh));
  }
  
  public final void zzj() {}
  
  public final void zzk(zze paramzze)
  {
    zzbbc localzzbbc = zzbbk.zzbr;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      paramzze = zzfgf.zzf(2, paramzze.zza, this.zzf.zzp);
      this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, paramzze));
    }
  }
  
  public final void zzl()
  {
    if (!this.zzp.compareAndSet(false, true)) {
      return;
    }
    zzbbc localzzbbc = zzbbk.zzdp;
    int i = ((Integer)zzba.zzc().zzb(localzzbbc)).intValue();
    if (i > 0)
    {
      localzzbbc = zzbbk.zzdq;
      zzt(i, ((Integer)zzba.zzc().zzb(localzzbbc)).intValue());
      return;
    }
    localzzbbc = zzbbk.zzdo;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      this.zzc.execute(new zzcnk(this));
      return;
    }
    zzs();
  }
  
  public final void zzm() {}
  
  public final void zzn()
  {
    try
    {
      Object localObject1;
      if (this.zzo)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(this.zzf.zzd);
        ((List)localObject1).addAll(this.zzf.zzg);
        this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, (List)localObject1));
      }
      else
      {
        Object localObject3 = this.zzh;
        localObject1 = this.zzg;
        Object localObject5 = this.zze;
        Object localObject4 = this.zzf;
        ((zzfaj)localObject3).zza(((zzfgf)localObject1).zzc((zzezr)localObject5, (zzezf)localObject4, ((zzezf)localObject4).zzn));
        localObject1 = zzbbk.zzdl;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          localObject1 = this.zzn;
          if (localObject1 != null)
          {
            localObject1 = zzfgf.zzg(((zzcuk)localObject1).zzb().zzn, ((zzcuk)localObject1).zza().zzf());
            this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), (List)localObject1));
          }
        }
        localObject5 = this.zzh;
        localObject4 = this.zzg;
        localObject3 = this.zze;
        localObject1 = this.zzf;
        ((zzfaj)localObject5).zza(((zzfgf)localObject4).zzc((zzezr)localObject3, (zzezf)localObject1, ((zzezf)localObject1).zzg));
      }
      this.zzo = true;
      return;
    }
    finally {}
  }
  
  public final void zzo() {}
  
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2)
  {
    zzfaj localzzfaj = this.zzh;
    paramString2 = this.zzg;
    paramString1 = this.zzf;
    localzzfaj.zza(paramString2.zze(paramString1, paramString1.zzi, paramzzbuw));
  }
  
  public final void zzq()
  {
    zzfaj localzzfaj = this.zzh;
    zzfgf localzzfgf = this.zzg;
    zzezr localzzezr = this.zze;
    zzezf localzzezf = this.zzf;
    localzzfaj.zza(localzzfgf.zzc(localzzezr, localzzezf, localzzezf.zzj));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */