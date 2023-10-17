package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

final class zzcpg
  extends zzcpd
{
  private final Context zzc;
  private final View zzd;
  private final zzcfb zze;
  private final zzezg zzf;
  private final zzcrd zzg;
  private final zzdhn zzh;
  private final zzdcy zzi;
  private final zzgvi zzj;
  private final Executor zzk;
  private zzq zzl;
  
  zzcpg(zzcre paramzzcre, Context paramContext, zzezg paramzzezg, View paramView, zzcfb paramzzcfb, zzcrd paramzzcrd, zzdhn paramzzdhn, zzdcy paramzzdcy, zzgvi paramzzgvi, Executor paramExecutor)
  {
    super(paramzzcre);
    this.zzc = paramContext;
    this.zzd = paramView;
    this.zze = paramzzcfb;
    this.zzf = paramzzezg;
    this.zzg = paramzzcrd;
    this.zzh = paramzzdhn;
    this.zzi = paramzzdcy;
    this.zzj = paramzzgvi;
    this.zzk = paramExecutor;
  }
  
  public final int zza()
  {
    zzbbc localzzbbc = zzbbk.zzhq;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (this.zzb.zzah))
    {
      localzzbbc = zzbbk.zzhr;
      if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        return 0;
      }
    }
    return this.zza.zzb.zzb.zzc;
  }
  
  public final View zzc()
  {
    return this.zzd;
  }
  
  public final zzdq zzd()
  {
    try
    {
      zzdq localzzdq = this.zzg.zza();
      return localzzdq;
    }
    catch (zzfaf localzzfaf) {}
    return null;
  }
  
  public final zzezg zze()
  {
    Object localObject = this.zzl;
    if (localObject != null) {
      return zzfae.zzb((zzq)localObject);
    }
    localObject = this.zzb;
    if (((zzezf)localObject).zzad)
    {
      localObject = ((zzezf)localObject).zza.iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if ((str != null) && (str.contains("FirstParty"))) {
          break label94;
        }
      }
      return new zzezg(this.zzd.getWidth(), this.zzd.getHeight(), false);
    }
    label94:
    return (zzezg)this.zzb.zzs.get(0);
  }
  
  public final zzezg zzf()
  {
    return this.zzf;
  }
  
  public final void zzg()
  {
    this.zzi.zza();
  }
  
  public final void zzh(ViewGroup paramViewGroup, zzq paramzzq)
  {
    if (paramViewGroup != null)
    {
      zzcfb localzzcfb = this.zze;
      if (localzzcfb != null)
      {
        localzzcfb.zzag(zzcgq.zzc(paramzzq));
        paramViewGroup.setMinimumHeight(paramzzq.zzc);
        paramViewGroup.setMinimumWidth(paramzzq.zzf);
        this.zzl = paramzzq;
      }
    }
  }
  
  public final void zzj()
  {
    this.zzk.execute(new zzcpf(this));
    super.zzj();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */