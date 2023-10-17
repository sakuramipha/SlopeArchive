package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Objects;

public final class zzele
  implements zzeqq
{
  private final zzfwc zza;
  private final zzdnx zzb;
  private final zzdse zzc;
  private final zzelg zzd;
  
  public zzele(zzfwc paramzzfwc, zzdnx paramzzdnx, zzdse paramzzdse, zzelg paramzzelg)
  {
    this.zza = paramzzfwc;
    this.zzb = paramzzdnx;
    this.zzc = paramzzdse;
    this.zzd = paramzzelg;
  }
  
  public final int zza()
  {
    return 1;
  }
  
  public final zzfwb zzb()
  {
    Object localObject = zzbbk.zzjX;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (this.zzd.zza() != null))
    {
      localObject = this.zzd.zza();
      Objects.requireNonNull(localObject);
      return zzfvr.zzh(localObject);
    }
    localObject = zzbbk.zzbn;
    if (!zzfpo.zzd((String)zzba.zzc().zzb((zzbbc)localObject)))
    {
      localObject = zzbbk.zzjX;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) || ((!this.zzd.zzd()) && (this.zzc.zzt())))
      {
        this.zzd.zzc(true);
        return this.zza.zzb(new zzeld(this));
      }
    }
    return zzfvr.zzh(new zzelf(new Bundle()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzele.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */