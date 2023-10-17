package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import org.json.JSONObject;

public final class zzedg
  implements zzecb
{
  private final Context zza;
  private final zzcqa zzb;
  private View zzc;
  private zzboh zzd;
  
  public zzedg(Context paramContext, zzcqa paramzzcqa)
  {
    this.zza = paramContext;
    this.zzb = paramzzcqa;
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    try
    {
      ((zzbpv)paramzzeby.zzb).zzq(paramzzezf.zzaa);
      Object localObject1 = zzbbk.zzhq;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (paramzzezf.zzah))
      {
        localObject2 = (zzbpv)paramzzeby.zzb;
        localObject1 = paramzzezf.zzV;
        str = paramzzezf.zzw.toString();
        localObject4 = paramzzezr.zza.zza.zzd;
        localObject3 = ObjectWrapper.wrap(this.zza);
        paramzzezf = new com/google/android/gms/internal/ads/zzedf;
        paramzzezf.<init>(this, paramzzeby, null);
        ((zzbpv)localObject2).zzk((String)localObject1, str, (zzl)localObject4, (IObjectWrapper)localObject3, paramzzezf, (zzboe)paramzzeby.zzc, paramzzezr.zza.zza.zze);
        return;
      }
      localObject1 = (zzbpv)paramzzeby.zzb;
      Object localObject2 = paramzzezf.zzV;
      String str = paramzzezf.zzw.toString();
      Object localObject3 = paramzzezr.zza.zza.zzd;
      paramzzezf = ObjectWrapper.wrap(this.zza);
      Object localObject4 = new com/google/android/gms/internal/ads/zzedf;
      ((zzedf)localObject4).<init>(this, paramzzeby, null);
      ((zzbpv)localObject1).zzj((String)localObject2, str, (zzl)localObject3, paramzzezf, (zzbpj)localObject4, (zzboe)paramzzeby.zzc, paramzzezr.zza.zza.zze);
      return;
    }
    catch (RemoteException paramzzezr)
    {
      throw new zzfaf(paramzzezr);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */