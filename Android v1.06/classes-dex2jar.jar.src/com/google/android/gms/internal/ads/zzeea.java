package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeea
  implements zzdey
{
  private final zzezf zza;
  private final zzbpv zzb;
  private final AdFormat zzc;
  private zzcwa zzd = null;
  
  zzeea(zzezf paramzzezf, zzbpv paramzzbpv, AdFormat paramAdFormat)
  {
    this.zza = paramzzezf;
    this.zzb = paramzzbpv;
    this.zzc = paramAdFormat;
  }
  
  public final void zza(boolean paramBoolean, Context paramContext, zzcvv paramzzcvv)
    throws zzdex
  {
    try
    {
      paramzzcvv = AdFormat.BANNER;
      int i = this.zzc.ordinal();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 6) {
            break label131;
          }
          paramBoolean = this.zzb.zzr(ObjectWrapper.wrap(paramContext));
        }
        else
        {
          paramBoolean = this.zzb.zzt(ObjectWrapper.wrap(paramContext));
        }
      }
      else {
        paramBoolean = this.zzb.zzs(ObjectWrapper.wrap(paramContext));
      }
      if (paramBoolean)
      {
        if (this.zzd == null) {
          return;
        }
        paramContext = zzbbk.zzbs;
        if ((!((Boolean)zzba.zzc().zzb(paramContext)).booleanValue()) && (this.zza.zzZ == 2)) {
          this.zzd.zza();
        }
        return;
      }
      label131:
      throw new zzdex("Adapter failed to show.");
    }
    finally {}
  }
  
  public final void zzb(zzcwa paramzzcwa)
  {
    this.zzd = paramzzcwa;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */