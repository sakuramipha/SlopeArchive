package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import org.json.JSONObject;

public final class zzeco
  implements zzecb
{
  private final Context zza;
  private final zzcor zzb;
  
  zzeco(Context paramContext, zzcor paramzzcor)
  {
    this.zza = paramContext;
    this.zzb = paramzzcor;
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    try
    {
      ((zzbpv)paramzzeby.zzb).zzq(paramzzezf.zzaa);
      zzbpv localzzbpv = (zzbpv)paramzzeby.zzb;
      String str = paramzzezf.zzV;
      paramzzezf = paramzzezf.zzw.toString();
      zzl localzzl = paramzzezr.zza.zza.zzd;
      paramzzezr = ObjectWrapper.wrap(this.zza);
      zzecn localzzecn = new com/google/android/gms/internal/ads/zzecn;
      localzzecn.<init>(paramzzeby, null);
      localzzbpv.zzi(str, paramzzezf, localzzl, paramzzezr, localzzecn, (zzboe)paramzzeby.zzc);
      return;
    }
    catch (RemoteException paramzzezr)
    {
      zze.zzb("Remote exception loading an app open RTB ad", paramzzezr);
      throw new zzfaf(paramzzezr);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */