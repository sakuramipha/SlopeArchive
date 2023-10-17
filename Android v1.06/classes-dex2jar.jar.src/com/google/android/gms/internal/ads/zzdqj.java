package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class zzdqj
{
  protected final String zza = (String)zzbcx.zzb.zze();
  protected final Map zzb = new HashMap();
  protected final Executor zzc;
  protected final zzbzy zzd;
  protected final boolean zze;
  private final zzfex zzf;
  private final boolean zzg;
  private final boolean zzh;
  
  protected zzdqj(Executor paramExecutor, zzbzy paramzzbzy, zzfex paramzzfex)
  {
    this.zzc = paramExecutor;
    this.zzd = paramzzbzy;
    paramExecutor = zzbbk.zzbQ;
    this.zze = ((Boolean)zzba.zzc().zzb(paramExecutor)).booleanValue();
    this.zzf = paramzzfex;
    paramExecutor = zzbbk.zzbT;
    this.zzg = ((Boolean)zzba.zzc().zzb(paramExecutor)).booleanValue();
    paramExecutor = zzbbk.zzgM;
    this.zzh = ((Boolean)zzba.zzc().zzb(paramExecutor)).booleanValue();
  }
  
  private final void zza(Map paramMap, boolean paramBoolean)
  {
    if (!paramMap.isEmpty())
    {
      String str = this.zzf.zza(paramMap);
      zze.zza(str);
      boolean bool = Boolean.parseBoolean((String)paramMap.get("scar"));
      if ((this.zze) && ((!paramBoolean) || (this.zzg)) && ((!bool) || (this.zzh))) {
        this.zzc.execute(new zzdqi(this, str));
      }
      return;
    }
    zzbzt.zze("Empty paramMap.");
  }
  
  protected final String zzb(Map paramMap)
  {
    return this.zzf.zza(paramMap);
  }
  
  public final ConcurrentHashMap zzc()
  {
    return new ConcurrentHashMap(this.zzb);
  }
  
  public final void zzd(Map paramMap)
  {
    zza(paramMap, true);
  }
  
  public final void zze(Map paramMap)
  {
    zza(paramMap, false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */