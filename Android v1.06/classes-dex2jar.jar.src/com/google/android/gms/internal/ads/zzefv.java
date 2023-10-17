package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzefv
  implements zzecb
{
  private final Context zza;
  private final Executor zzb;
  private final zzdmt zzc;
  
  public zzefv(Context paramContext, Executor paramExecutor, zzdmt paramzzdmt)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzdmt;
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    try
    {
      paramzzezr = paramzzezr.zza.zza;
      if (paramzzezr.zzo.zza == 3)
      {
        ((zzfav)paramzzeby.zzb).zzr(this.zza, paramzzezr.zzd, paramzzezf.zzw.toString(), (zzboe)paramzzeby.zzc);
        return;
      }
      ((zzfav)paramzzeby.zzb).zzq(this.zza, paramzzezr.zzd, paramzzezf.zzw.toString(), (zzboe)paramzzeby.zzc);
      return;
    }
    catch (Exception paramzzezr)
    {
      zzbzt.zzk("Fail to load ad from adapter ".concat(String.valueOf(paramzzeby.zza)), paramzzezr);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */