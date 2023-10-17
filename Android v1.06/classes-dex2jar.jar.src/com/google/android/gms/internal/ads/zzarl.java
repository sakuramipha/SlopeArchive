package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

final class zzarl
  implements zzfks
{
  private final zzfiv zza;
  private final zzfjm zzb;
  private final zzary zzc;
  private final zzark zzd;
  private final zzaqu zze;
  private final zzasa zzf;
  private final zzars zzg;
  private final zzarj zzh;
  
  zzarl(zzfiv paramzzfiv, zzfjm paramzzfjm, zzary paramzzary, zzark paramzzark, zzaqu paramzzaqu, zzasa paramzzasa, zzars paramzzars, zzarj paramzzarj)
  {
    this.zza = paramzzfiv;
    this.zzb = paramzzfjm;
    this.zzc = paramzzary;
    this.zzd = paramzzark;
    this.zze = paramzzaqu;
    this.zzf = paramzzasa;
    this.zzg = paramzzars;
    this.zzh = paramzzarj;
  }
  
  private final Map zze()
  {
    HashMap localHashMap = new HashMap();
    Object localObject = this.zzb.zzb();
    localHashMap.put("v", this.zza.zzb());
    localHashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
    localHashMap.put("int", ((zzaol)localObject).zzh());
    localHashMap.put("up", Boolean.valueOf(this.zzd.zza()));
    localHashMap.put("t", new Throwable());
    localObject = this.zzg;
    if (localObject != null)
    {
      localHashMap.put("tcq", Long.valueOf(((zzars)localObject).zzc()));
      localHashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
      localHashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
      localHashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
      localHashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
      localHashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
      localHashMap.put("tcc", Long.valueOf(this.zzg.zza()));
      localHashMap.put("tpc", Long.valueOf(this.zzg.zze()));
    }
    return localHashMap;
  }
  
  public final Map zza()
  {
    Map localMap = zze();
    localMap.put("lts", Long.valueOf(this.zzc.zza()));
    return localMap;
  }
  
  public final Map zzb()
  {
    Map localMap = zze();
    Object localObject = this.zzb.zza();
    localMap.put("gai", Boolean.valueOf(this.zza.zzd()));
    localMap.put("did", ((zzaol)localObject).zzg());
    localMap.put("dst", Integer.valueOf(((zzaol)localObject).zzal() - 1));
    localMap.put("doo", Boolean.valueOf(((zzaol)localObject).zzai()));
    localObject = this.zze;
    if (localObject != null) {
      localMap.put("nt", Long.valueOf(((zzaqu)localObject).zza()));
    }
    localObject = this.zzf;
    if (localObject != null)
    {
      localMap.put("vs", Long.valueOf(((zzasa)localObject).zzc()));
      localMap.put("vf", Long.valueOf(this.zzf.zzb()));
    }
    return localMap;
  }
  
  public final Map zzc()
  {
    Map localMap = zze();
    zzarj localzzarj = this.zzh;
    if (localzzarj != null) {
      localMap.put("vst", localzzarj.zza());
    }
    return localMap;
  }
  
  final void zzd(View paramView)
  {
    this.zzc.zzd(paramView);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzarl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */