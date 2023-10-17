package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class zzdqc
{
  private final zzdqh zza;
  private final Executor zzb;
  private final Map zzc;
  
  public zzdqc(zzdqh paramzzdqh, Executor paramExecutor)
  {
    this.zza = paramzzdqh;
    this.zzc = paramzzdqh.zza();
    this.zzb = paramExecutor;
  }
  
  public final zzdqb zza()
  {
    zzdqb localzzdqb = new zzdqb(this);
    zzdqb.zza(localzzdqb);
    return localzzdqb;
  }
  
  public final void zze()
  {
    Object localObject = zzbbk.zzjW;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    localObject = zza();
    ((zzdqb)localObject).zzb("action", "pecr");
    ((zzdqb)localObject).zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */