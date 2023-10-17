package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import org.json.JSONObject;

public final class zzefz
  implements zzecb
{
  private final Context zza;
  private final zzdmt zzb;
  
  public zzefz(Context paramContext, zzdmt paramzzdmt)
  {
    this.zza = paramContext;
    this.zzb = paramzzdmt;
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    try
    {
      ((zzbpv)paramzzeby.zzb).zzq(paramzzezf.zzaa);
      if (paramzzezr.zza.zza.zzo.zza == 3)
      {
        localObject2 = (zzbpv)paramzzeby.zzb;
        localObject1 = paramzzezf.zzV;
        paramzzezf = paramzzezf.zzw.toString();
        paramzzezr = paramzzezr.zza.zza.zzd;
        localIObjectWrapper = ObjectWrapper.wrap(this.zza);
        localObject3 = new com/google/android/gms/internal/ads/zzefy;
        ((zzefy)localObject3).<init>(this, paramzzeby, null);
        ((zzbpv)localObject2).zzo((String)localObject1, paramzzezf, paramzzezr, localIObjectWrapper, (zzbps)localObject3, (zzboe)paramzzeby.zzc);
        return;
      }
      Object localObject1 = (zzbpv)paramzzeby.zzb;
      Object localObject2 = paramzzezf.zzV;
      paramzzezf = paramzzezf.zzw.toString();
      Object localObject3 = paramzzezr.zza.zza.zzd;
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(this.zza);
      paramzzezr = new com/google/android/gms/internal/ads/zzefy;
      paramzzezr.<init>(this, paramzzeby, null);
      ((zzbpv)localObject1).zzp((String)localObject2, paramzzezf, (zzl)localObject3, localIObjectWrapper, paramzzezr, (zzboe)paramzzeby.zzc);
      return;
    }
    catch (RemoteException paramzzezr)
    {
      zze.zzb("Remote exception loading a rewarded RTB ad", paramzzezr);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */