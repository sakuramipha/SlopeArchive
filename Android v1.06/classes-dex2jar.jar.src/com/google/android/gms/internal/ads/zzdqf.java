package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzdqf
  implements zzfee
{
  private final Map zza;
  private final zzdpx zzb;
  private final Clock zzc;
  private final Map zzd;
  
  public zzdqf(zzdpx paramzzdpx, Set paramSet, Clock paramClock)
  {
    this.zzb = paramzzdpx;
    this.zza = new HashMap();
    this.zzd = new HashMap();
    paramzzdpx = paramSet.iterator();
    while (paramzzdpx.hasNext())
    {
      paramSet = (zzdqe)paramzzdpx.next();
      this.zzd.put(zzdqe.zza(paramSet), paramSet);
    }
    this.zzc = paramClock;
  }
  
  private final void zze(zzfdx paramzzfdx, boolean paramBoolean)
  {
    Object localObject = zzdqe.zzb((zzdqe)this.zzd.get(paramzzfdx));
    if (this.zza.containsKey(localObject))
    {
      String str1;
      if (true != paramBoolean) {
        str1 = "f.";
      } else {
        str1 = "s.";
      }
      long l1 = this.zzc.elapsedRealtime();
      long l2 = ((Long)this.zza.get(localObject)).longValue();
      localObject = this.zzb.zza();
      paramzzfdx = zzdqe.zzc((zzdqe)this.zzd.get(paramzzfdx));
      String str2 = String.valueOf(Long.toString(l1 - l2));
      ((Map)localObject).put("label.".concat(paramzzfdx), str1.concat(str2));
    }
  }
  
  public final void zzbB(zzfdx paramzzfdx, String paramString) {}
  
  public final void zzbC(zzfdx paramzzfdx, String paramString, Throwable paramThrowable)
  {
    if (this.zza.containsKey(paramzzfdx))
    {
      long l1 = this.zzc.elapsedRealtime();
      long l2 = ((Long)this.zza.get(paramzzfdx)).longValue();
      paramThrowable = this.zzb.zza();
      String str = String.valueOf(paramString);
      paramString = String.valueOf(Long.toString(l1 - l2));
      paramThrowable.put("task.".concat(str), "f.".concat(paramString));
    }
    if (this.zzd.containsKey(paramzzfdx)) {
      zze(paramzzfdx, false);
    }
  }
  
  public final void zzc(zzfdx paramzzfdx, String paramString)
  {
    this.zza.put(paramzzfdx, Long.valueOf(this.zzc.elapsedRealtime()));
  }
  
  public final void zzd(zzfdx paramzzfdx, String paramString)
  {
    if (this.zza.containsKey(paramzzfdx))
    {
      long l2 = this.zzc.elapsedRealtime();
      long l1 = ((Long)this.zza.get(paramzzfdx)).longValue();
      Map localMap = this.zzb.zza();
      paramString = String.valueOf(paramString);
      String str = String.valueOf(Long.toString(l2 - l1));
      localMap.put("task.".concat(paramString), "s.".concat(str));
    }
    if (this.zzd.containsKey(paramzzfdx)) {
      zze(paramzzfdx, true);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */