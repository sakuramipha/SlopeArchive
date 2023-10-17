package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class zzfhd
{
  private static final zzfhd zza = new zzfhd();
  private final ArrayList zzb = new ArrayList();
  private final ArrayList zzc = new ArrayList();
  
  public static zzfhd zza()
  {
    return zza;
  }
  
  public final Collection zzb()
  {
    return Collections.unmodifiableCollection(this.zzc);
  }
  
  public final Collection zzc()
  {
    return Collections.unmodifiableCollection(this.zzb);
  }
  
  public final void zzd(zzfgs paramzzfgs)
  {
    this.zzb.add(paramzzfgs);
  }
  
  public final void zze(zzfgs paramzzfgs)
  {
    boolean bool = zzg();
    this.zzb.remove(paramzzfgs);
    this.zzc.remove(paramzzfgs);
    if ((bool) && (!zzg())) {
      zzfhj.zzb().zzf();
    }
  }
  
  public final void zzf(zzfgs paramzzfgs)
  {
    boolean bool = zzg();
    this.zzc.add(paramzzfgs);
    if (!bool) {
      zzfhj.zzb().zze();
    }
  }
  
  public final boolean zzg()
  {
    return this.zzc.size() > 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */