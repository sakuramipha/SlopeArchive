package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzeec
  implements zzecb
{
  private final Context zza;
  private final zzdeq zzb;
  private final zzbzz zzc;
  private final Executor zzd;
  
  public zzeec(Context paramContext, zzbzz paramzzbzz, zzdeq paramzzdeq, Executor paramExecutor)
  {
    this.zza = paramContext;
    this.zzc = paramzzbzz;
    this.zzb = paramzzdeq;
    this.zzd = paramExecutor;
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    ((zzfav)paramzzeby.zzb).zzo(this.zza, paramzzezr.zza.zza.zzd, paramzzezf.zzw.toString(), zzbu.zzl(paramzzezf.zzt), (zzboe)paramzzeby.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */