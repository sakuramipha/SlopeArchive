package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import org.json.JSONObject;

public final class zzeev
  implements zzecb
{
  private final Context zza;
  private final zzdfm zzb;
  private zzbon zzc;
  private final zzbzz zzd;
  
  public zzeev(Context paramContext, zzdfm paramzzdfm, zzbzz paramzzbzz)
  {
    this.zza = paramContext;
    this.zzb = paramzzdfm;
    this.zzd = paramzzbzz;
  }
  
  public final void zzb(zzezr paramzzezr, zzezf paramzzezf, zzeby paramzzeby)
    throws zzfaf
  {
    try
    {
      ((zzbpv)paramzzeby.zzb).zzq(paramzzezf.zzaa);
      int i = this.zzd.zzc;
      Object localObject1 = zzbbk.zzbB;
      if (i < ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue())
      {
        localObject1 = (zzbpv)paramzzeby.zzb;
        localObject2 = paramzzezf.zzV;
        paramzzezf = paramzzezf.zzw.toString();
        paramzzezr = paramzzezr.zza.zza.zzd;
        localIObjectWrapper = ObjectWrapper.wrap(this.zza);
        localzzeeu = new com/google/android/gms/internal/ads/zzeeu;
        localzzeeu.<init>(this, paramzzeby, null);
        ((zzbpv)localObject1).zzm((String)localObject2, paramzzezf, paramzzezr, localIObjectWrapper, localzzeeu, (zzboe)paramzzeby.zzc);
        return;
      }
      Object localObject2 = (zzbpv)paramzzeby.zzb;
      localObject1 = paramzzezf.zzV;
      String str = paramzzezf.zzw.toString();
      paramzzezf = paramzzezr.zza.zza.zzd;
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(this.zza);
      zzeeu localzzeeu = new com/google/android/gms/internal/ads/zzeeu;
      localzzeeu.<init>(this, paramzzeby, null);
      ((zzbpv)localObject2).zzn((String)localObject1, str, paramzzezf, localIObjectWrapper, localzzeeu, (zzboe)paramzzeby.zzc, paramzzezr.zza.zza.zzi);
      return;
    }
    catch (RemoteException paramzzezr)
    {
      throw new zzfaf(paramzzezr);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */