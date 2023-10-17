package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class zzdqb
{
  final zzdqc zza;
  private final Map zzb = new ConcurrentHashMap();
  
  zzdqb(zzdqc paramzzdqc) {}
  
  public final zzdqb zzb(String paramString1, String paramString2)
  {
    this.zzb.put(paramString1, paramString2);
    return this;
  }
  
  public final zzdqb zzc(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      this.zzb.put(paramString1, paramString2);
    }
    return this;
  }
  
  public final zzdqb zzd(zzezf paramzzezf)
  {
    this.zzb.put("aai", paramzzezf.zzx);
    zzbbc localzzbbc = zzbbk.zzgL;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      zzc("rid", paramzzezf.zzao);
    }
    return this;
  }
  
  public final zzdqb zze(zzezi paramzzezi)
  {
    this.zzb.put("gqi", paramzzezi.zzb);
    return this;
  }
  
  public final String zzf()
  {
    return zzdqc.zzb(this.zza).zzb(this.zzb);
  }
  
  public final void zzg()
  {
    zzdqc.zzd(this.zza).execute(new zzdqa(this));
  }
  
  public final void zzh()
  {
    zzdqc.zzd(this.zza).execute(new zzdpz(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */