package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class zzsx
{
  private final zzaav zza;
  private final Map zzb;
  private final Set zzc;
  private final Map zzd;
  private zzfw zze;
  
  public zzsx(zzaav paramzzaav)
  {
    this.zza = paramzzaav;
    this.zzb = new HashMap();
    this.zzc = new HashSet();
    this.zzd = new HashMap();
  }
  
  public final void zza(zzfw paramzzfw)
  {
    if (paramzzfw != this.zze)
    {
      this.zze = paramzzfw;
      this.zzb.clear();
      this.zzd.clear();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */