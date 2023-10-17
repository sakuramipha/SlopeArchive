package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbma
  implements zzcan
{
  final zzbmk zzc;
  
  zzbma(zzbmk paramzzbmk, zzbmj paramzzbmj, zzfff paramzzfff) {}
  
  public final void zza()
  {
    synchronized (zzbmk.zzf(this.zzc))
    {
      zzbmk.zzh(this.zzc, 1);
      zze.zza("Failed loading new engine. Marking new engine destroyable.");
      this.zza.zzb();
      if (((Boolean)zzbcw.zzd.zze()).booleanValue())
      {
        Object localObject2 = this.zzc;
        if (zzbmk.zze((zzbmk)localObject2) != null)
        {
          localObject2 = zzbmk.zze((zzbmk)localObject2);
          zzfff localzzfff = this.zzb;
          localzzfff.zzc("Failed loading new engine");
          localzzfff.zzf(false);
          ((zzfft)localObject2).zzb(localzzfff.zzl());
        }
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */