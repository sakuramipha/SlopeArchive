package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzegr
  implements zzecb
{
  private final Context zza;
  private final Executor zzb;
  private final zzdmt zzc;
  
  public zzegr(Context paramContext, Executor paramExecutor, zzdmt paramzzdmt)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzdmt;
  }
  
  private static final void zze(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
  {
    try
    {
      ((zzfav)paramzzeby.zzb).zzk(paramzzezr.zza.zza.zzd, paramzzezf.zzw.toString());
      return;
    }
    catch (Exception paramzzezr)
    {
      zzbzt.zzk("Fail to load ad from adapter ".concat(String.valueOf(paramzzeby.zza)), paramzzezr);
    }
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    if (!((zzfav)paramzzeby.zzb).zzC())
    {
      zzegp localzzegp = new zzegp(this, paramzzezr, paramzzezf, paramzzeby);
      ((zzeds)paramzzeby.zzc).zzd(localzzegp);
      ((zzfav)paramzzeby.zzb).zzh(this.zza, paramzzezr.zza.zza.zzd, null, (zzbvh)paramzzeby.zzc, paramzzezf.zzw.toString());
      return;
    }
    zze(paramzzezr, paramzzezf, paramzzeby);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzegr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */