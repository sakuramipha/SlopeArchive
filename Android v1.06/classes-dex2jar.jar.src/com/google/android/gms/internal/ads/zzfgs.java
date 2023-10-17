package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzfgs
  extends zzfgo
{
  private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
  private final zzfgq zzb;
  private final zzfgp zzc;
  private final List zzd = new ArrayList();
  private zzfim zze;
  private zzfhp zzf;
  private boolean zzg = false;
  private boolean zzh = false;
  private final String zzi;
  
  zzfgs(zzfgp paramzzfgp, zzfgq paramzzfgq)
  {
    this.zzc = paramzzfgp;
    this.zzb = paramzzfgq;
    this.zzi = UUID.randomUUID().toString();
    zzk(null);
    if ((paramzzfgq.zzd() != zzfgr.zza) && (paramzzfgq.zzd() != zzfgr.zzc)) {
      this.zzf = new zzfhs(paramzzfgq.zzi(), null);
    } else {
      this.zzf = new zzfhq(paramzzfgq.zza());
    }
    this.zzf.zzj();
    zzfhd.zza().zzd(this);
    paramzzfgq = this.zzf;
    zzfhi.zza().zzd(paramzzfgq.zza(), paramzzfgp.zzb());
  }
  
  private final void zzk(View paramView)
  {
    this.zze = new zzfim(paramView);
  }
  
  public final void zzb(View paramView, zzfgu paramzzfgu, String paramString)
  {
    if (!this.zzh)
    {
      if (zza.matcher("Ad overlay").matches())
      {
        Iterator localIterator = this.zzd.iterator();
        while (localIterator.hasNext())
        {
          paramString = (zzfhf)localIterator.next();
          if (paramString.zzb().get() == paramView) {
            break label69;
          }
        }
        paramString = null;
        label69:
        if (paramString == null) {
          this.zzd.add(new zzfhf(paramView, paramzzfgu, "Ad overlay"));
        }
        return;
      }
      throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }
  }
  
  public final void zzc()
  {
    if (this.zzh) {
      return;
    }
    this.zze.clear();
    if (!this.zzh) {
      this.zzd.clear();
    }
    this.zzh = true;
    zzfhp localzzfhp = this.zzf;
    zzfhi.zza().zzc(localzzfhp.zza());
    zzfhd.zza().zze(this);
    this.zzf.zzc();
    this.zzf = null;
  }
  
  public final void zzd(View paramView)
  {
    if (this.zzh) {
      return;
    }
    if (zzf() == paramView) {
      return;
    }
    zzk(paramView);
    this.zzf.zzb();
    Object localObject = zzfhd.zza().zzc();
    if ((localObject != null) && (!((Collection)localObject).isEmpty()))
    {
      Iterator localIterator = ((Collection)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (zzfgs)localIterator.next();
        if ((localObject != this) && (((zzfgs)localObject).zzf() == paramView)) {
          ((zzfgs)localObject).zze.clear();
        }
      }
    }
  }
  
  public final void zze()
  {
    if (this.zzg) {
      return;
    }
    this.zzg = true;
    zzfhd.zza().zzf(this);
    float f = zzfhj.zzb().zza();
    this.zzf.zzh(f);
    this.zzf.zzf(this, this.zzb);
  }
  
  public final View zzf()
  {
    return (View)this.zze.get();
  }
  
  public final zzfhp zzg()
  {
    return this.zzf;
  }
  
  public final String zzh()
  {
    return this.zzi;
  }
  
  public final List zzi()
  {
    return this.zzd;
  }
  
  public final boolean zzj()
  {
    return (this.zzg) && (!this.zzh);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */