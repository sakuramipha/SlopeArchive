package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzedk
  implements zzebv
{
  private final Context zza;
  private final zzdeq zzb;
  private final Executor zzc;
  private final zzeze zzd;
  
  public zzedk(Context paramContext, Executor paramExecutor, zzdeq paramzzdeq, zzeze paramzzeze)
  {
    this.zza = paramContext;
    this.zzb = paramzzdeq;
    this.zzc = paramExecutor;
    this.zzd = paramzzeze;
  }
  
  private static String zzd(zzezf paramzzezf)
  {
    try
    {
      paramzzezf = paramzzezf.zzw.getString("tab_url");
      return paramzzezf;
    }
    catch (Exception paramzzezf) {}
    return null;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    Object localObject = zzd(paramzzezf);
    if (localObject != null) {
      localObject = Uri.parse((String)localObject);
    } else {
      localObject = null;
    }
    return zzfvr.zzm(zzfvr.zzh(null), new zzedi(this, (Uri)localObject, paramzzezr, paramzzezf), this.zzc);
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    paramzzezr = this.zza;
    return ((paramzzezr instanceof Activity)) && (zzbcl.zzg(paramzzezr)) && (!TextUtils.isEmpty(zzd(paramzzezf)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */