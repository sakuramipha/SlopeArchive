package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdfw
  implements zzbii
{
  private final WeakReference zza;
  
  public final void zza(Object paramObject, Map paramMap)
  {
    zzdfz localzzdfz = (zzdfz)this.zza.get();
    if (localzzdfz == null) {
      return;
    }
    zzdfz.zzb(localzzdfz).onAdClicked();
    paramObject = zzbbk.zzjp;
    if (((Boolean)zzba.zzc().zzb((zzbbc)paramObject)).booleanValue())
    {
      zzdfz.zzd(localzzdfz).zzr();
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("sccg"))) {
        zzdfz.zzd(localzzdfz).zzs();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */