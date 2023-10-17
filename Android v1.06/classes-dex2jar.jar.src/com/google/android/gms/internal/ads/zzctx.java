package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzctx
  implements zzcyd
{
  private final Context zza;
  private final zzfaa zzb;
  private final zzbzz zzc;
  private final zzg zzd;
  private final zzdse zze;
  private final zzfft zzf;
  private final String zzg;
  
  public zzctx(Context paramContext, zzfaa paramzzfaa, zzbzz paramzzbzz, zzg paramzzg, zzdse paramzzdse, zzfft paramzzfft, String paramString)
  {
    this.zza = paramContext;
    this.zzb = paramzzfaa;
    this.zzc = paramzzbzz;
    this.zzd = paramzzg;
    this.zze = paramzzdse;
    this.zzf = paramzzfft;
    this.zzg = paramString;
  }
  
  public final void zzb(zzezr paramzzezr) {}
  
  public final void zzbA(zzbug paramzzbug)
  {
    paramzzbug = zzbbk.zzdH;
    if (((Boolean)zzba.zzc().zzb(paramzzbug)).booleanValue())
    {
      paramzzbug = this.zzd.zzh();
      zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, paramzzbug, this.zzf);
    }
    paramzzbug = zzbbk.zzfu;
    if (((Boolean)zzba.zzc().zzb(paramzzbug)).booleanValue())
    {
      paramzzbug = this.zzg;
      if ((paramzzbug == "app_open_ad") || ((paramzzbug != null) && (paramzzbug.equals("app_open_ad")))) {
        return;
      }
    }
    this.zze.zzr();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzctx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */