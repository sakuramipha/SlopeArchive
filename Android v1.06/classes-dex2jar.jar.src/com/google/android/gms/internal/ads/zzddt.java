package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzddt
{
  private final zzdey zza;
  private final zzcfb zzb;
  
  public zzddt(zzdey paramzzdey, zzcfb paramzzcfb)
  {
    this.zza = paramzzdey;
    this.zzb = paramzzcfb;
  }
  
  public static final zzdco zzh(zzffc paramzzffc)
  {
    return new zzdco(paramzzffc, zzcag.zzf);
  }
  
  public static final zzdco zzi(zzdfd paramzzdfd)
  {
    return new zzdco(paramzzdfd, zzcag.zzf);
  }
  
  public final View zza()
  {
    zzcfb localzzcfb = this.zzb;
    if (localzzcfb == null) {
      return null;
    }
    return localzzcfb.zzG();
  }
  
  public final View zzb()
  {
    zzcfb localzzcfb = this.zzb;
    if (localzzcfb != null) {
      return localzzcfb.zzG();
    }
    return null;
  }
  
  public final zzcfb zzc()
  {
    return this.zzb;
  }
  
  public final zzdco zzd(Executor paramExecutor)
  {
    return new zzdco(new zzddr(this.zzb), paramExecutor);
  }
  
  public final zzdey zze()
  {
    return this.zza;
  }
  
  public Set zzf(zzcuf paramzzcuf)
  {
    return Collections.singleton(new zzdco(paramzzcuf, zzcag.zzf));
  }
  
  public Set zzg(zzcuf paramzzcuf)
  {
    return Collections.singleton(new zzdco(paramzzcuf, zzcag.zzf));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzddt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */