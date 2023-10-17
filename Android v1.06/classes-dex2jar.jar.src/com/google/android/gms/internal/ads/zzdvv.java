package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

final class zzdvv
  implements zzcyd
{
  private final Context zza;
  private final zzbxy zzb;
  
  zzdvv(Context paramContext, zzbxy paramzzbxy)
  {
    this.zza = paramContext;
    this.zzb = paramzzbxy;
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    if (!TextUtils.isEmpty(paramzzezr.zzb.zzb.zzd))
    {
      this.zzb.zzp(this.zza, paramzzezr.zza.zza.zzd);
      this.zzb.zzl(this.zza, paramzzezr.zzb.zzb.zzd);
    }
  }
  
  public final void zzbA(zzbug paramzzbug) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */