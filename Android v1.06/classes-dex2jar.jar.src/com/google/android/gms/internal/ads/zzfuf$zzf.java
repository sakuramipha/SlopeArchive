package com.google.android.gms.internal.ads;

final class zzfuf$zzf<V>
  implements Runnable
{
  final zzfuf<V> zza;
  final zzfwb<? extends V> zzb;
  
  zzfuf$zzf(zzfuf paramzzfuf, zzfwb paramzzfwb)
  {
    this.zza = paramzzfuf;
    this.zzb = paramzzfwb;
  }
  
  public final void run()
  {
    if (zzfuf.zzk(this.zza) != this) {
      return;
    }
    Object localObject = zzfuf.zzl(this.zzb);
    if (zzfuf.zzh().zzf(this.zza, this, localObject)) {
      zzfuf.zzq(this.zza, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuf$zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */