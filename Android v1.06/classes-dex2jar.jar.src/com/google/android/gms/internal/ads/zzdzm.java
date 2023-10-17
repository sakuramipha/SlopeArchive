package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzdzm
  implements zzfee
{
  private final Map zza;
  private final Map zzb;
  private final zzfem zzc;
  
  public zzdzm(Set paramSet, zzfem paramzzfem)
  {
    this.zzc = paramzzfem;
    this.zza = new HashMap();
    this.zzb = new HashMap();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      paramzzfem = (zzdzl)paramSet.next();
      this.zza.put(zzdzl.zzb(paramzzfem), zzdzl.zzc(paramzzfem));
      this.zzb.put(zzdzl.zza(paramzzfem), zzdzl.zzc(paramzzfem));
    }
  }
  
  public final void zzbB(zzfdx paramzzfdx, String paramString) {}
  
  public final void zzbC(zzfdx paramzzfdx, String paramString, Throwable paramThrowable)
  {
    paramString = String.valueOf(paramString);
    this.zzc.zze("task.".concat(paramString), "f.");
    if (this.zzb.containsKey(paramzzfdx)) {
      this.zzc.zze("label.".concat(String.valueOf((String)this.zzb.get(paramzzfdx))), "f.");
    }
  }
  
  public final void zzc(zzfdx paramzzfdx, String paramString)
  {
    paramString = String.valueOf(paramString);
    this.zzc.zzd("task.".concat(paramString));
    if (this.zza.containsKey(paramzzfdx)) {
      this.zzc.zzd("label.".concat(String.valueOf((String)this.zza.get(paramzzfdx))));
    }
  }
  
  public final void zzd(zzfdx paramzzfdx, String paramString)
  {
    paramString = String.valueOf(paramString);
    this.zzc.zze("task.".concat(paramString), "s.");
    if (this.zzb.containsKey(paramzzfdx)) {
      this.zzc.zze("label.".concat(String.valueOf((String)this.zzb.get(paramzzfdx))), "s.");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */