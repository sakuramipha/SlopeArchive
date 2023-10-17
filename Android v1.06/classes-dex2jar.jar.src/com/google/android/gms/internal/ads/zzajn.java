package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class zzajn
  implements zzajg
{
  final zzajp zza;
  private final zzfc zzb = new zzfc(new byte[4], 4);
  
  public zzajn(zzajp paramzzajp) {}
  
  public final void zza(zzfd paramzzfd)
  {
    if (paramzzfd.zzk() != 0) {
      return;
    }
    if ((paramzzfd.zzk() & 0x80) == 0) {
      return;
    }
    paramzzfd.zzG(6);
    int j = paramzzfd.zza() / 4;
    for (int i = 0; i < j; i++)
    {
      paramzzfd.zzA(this.zzb, 4);
      int k = this.zzb.zzd(16);
      this.zzb.zzl(3);
      if (k == 0)
      {
        this.zzb.zzl(13);
      }
      else
      {
        k = this.zzb.zzd(13);
        if (zzajp.zzf(this.zza).get(k) == null)
        {
          zzajp localzzajp = this.zza;
          zzajp.zzf(localzzajp).put(k, new zzajh(new zzajo(localzzajp, k)));
          localzzajp = this.zza;
          zzajp.zzm(localzzajp, zzajp.zze(localzzajp) + 1);
        }
      }
    }
    zzajp.zzf(this.zza).remove(0);
  }
  
  public final void zzb(zzfl paramzzfl, zzaar paramzzaar, zzajt paramzzajt) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */