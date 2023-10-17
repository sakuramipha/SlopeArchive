package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzelz
  implements zzeqq
{
  private static final Object zza = new Object();
  private final String zzb;
  private final String zzc;
  private final zzcsw zzd;
  private final zzfbg zze;
  private final zzfaa zzf;
  private final zzg zzg;
  private final zzdpx zzh;
  
  public zzelz(String paramString1, String paramString2, zzcsw paramzzcsw, zzfbg paramzzfbg, zzfaa paramzzfaa, zzdpx paramzzdpx)
  {
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramzzcsw;
    this.zze = paramzzfbg;
    this.zzf = paramzzfaa;
    this.zzg = zzt.zzo().zzh();
    this.zzh = paramzzdpx;
  }
  
  public final int zza()
  {
    return 12;
  }
  
  public final zzfwb zzb()
  {
    Bundle localBundle = new Bundle();
    zzbbc localzzbbc = zzbbk.zzhj;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      this.zzh.zza().put("seq_num", this.zzb);
    }
    localzzbbc = zzbbk.zzfn;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      this.zzd.zzg(this.zzf.zzd);
      localBundle.putAll(this.zze.zzb());
    }
    return zzfvr.zzh(new zzely(this, localBundle));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzelz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */