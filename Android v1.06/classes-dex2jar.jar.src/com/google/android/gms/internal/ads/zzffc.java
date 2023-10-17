package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

public final class zzffc
  implements zzdcf, zzcvy, zzdcj
{
  private final zzffq zza;
  private final zzfff zzb;
  
  zzffc(Context paramContext, zzffq paramzzffq)
  {
    this.zza = paramzzffq;
    this.zzb = zzffe.zza(paramContext, 13);
  }
  
  public final void zza() {}
  
  public final void zzb()
  {
    if (((Boolean)zzbcw.zzd.zze()).booleanValue())
    {
      zzffq localzzffq = this.zza;
      zzfff localzzfff = this.zzb;
      localzzfff.zzf(true);
      localzzffq.zza(localzzfff);
    }
  }
  
  public final void zzf() {}
  
  public final void zzg()
  {
    if (((Boolean)zzbcw.zzd.zze()).booleanValue()) {
      this.zzb.zzh();
    }
  }
  
  public final void zzk(zze paramzze)
  {
    if (((Boolean)zzbcw.zzd.zze()).booleanValue())
    {
      zzffq localzzffq = this.zza;
      zzfff localzzfff = this.zzb;
      localzzfff.zzc(paramzze.zza().toString());
      localzzfff.zzf(false);
      localzzffq.zza(localzzfff);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzffc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */