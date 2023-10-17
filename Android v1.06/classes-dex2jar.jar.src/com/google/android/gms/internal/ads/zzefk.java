package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzefk
{
  private final Clock zza;
  private final zzefl zzb;
  private final zzfgj zzc;
  private final List zzd = Collections.synchronizedList(new ArrayList());
  private final boolean zze;
  private final zzeca zzf;
  
  public zzefk(Clock paramClock, zzefl paramzzefl, zzeca paramzzeca, zzfgj paramzzfgj)
  {
    this.zza = paramClock;
    this.zzb = paramzzefl;
    paramClock = zzbbk.zzgD;
    this.zze = ((Boolean)zzba.zzc().zzb(paramClock)).booleanValue();
    this.zzf = paramzzeca;
    this.zzc = paramzzfgj;
  }
  
  final zzfwb zze(zzezr paramzzezr, zzezf paramzzezf, zzfwb paramzzfwb, zzfgf paramzzfgf)
  {
    zzezi localzzezi = paramzzezr.zzb.zzb;
    long l = this.zza.elapsedRealtime();
    String str = paramzzezf.zzx;
    if (str != null) {
      zzfvr.zzq(paramzzfwb, new zzefj(this, l, str, paramzzezf, localzzezi, paramzzfgf, paramzzezr), zzcag.zzf);
    }
    return paramzzfwb;
  }
  
  public final String zzf()
  {
    return TextUtils.join("_", this.zzd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */