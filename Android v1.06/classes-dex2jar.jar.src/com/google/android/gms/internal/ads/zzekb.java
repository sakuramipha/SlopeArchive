package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

final class zzekb
  implements zzfvn
{
  final zzekc zze;
  
  zzekb(zzekc paramzzekc, zzeju paramzzeju, zzffq paramzzffq, zzfff paramzzfff, zzdfm paramzzdfm) {}
  
  public final void zza(Throwable paramThrowable)
  {
    Object localObject1 = this.zzd.zza().zza(paramThrowable);
    this.zzd.zzb().zza((zze)localObject1);
    zzekc.zzc(this.zze).zzA().execute(new zzeka(this, (zze)localObject1));
    zzfau.zzb(((zze)localObject1).zza, paramThrowable, "NativeAdLoader.onFailure");
    this.zza.zza();
    if (((Boolean)zzbcw.zzc.zze()).booleanValue())
    {
      localObject2 = this.zzb;
      if (localObject2 != null)
      {
        ((zzffq)localObject2).zzc((zze)localObject1);
        localObject1 = this.zzc;
        ((zzfff)localObject1).zzg(paramThrowable);
        ((zzfff)localObject1).zzf(false);
        ((zzffq)localObject2).zza((zzfff)localObject1);
        ((zzffq)localObject2).zzg();
        return;
      }
    }
    Object localObject2 = zzekc.zze(this.zze);
    zzfff localzzfff = this.zzc;
    localzzfff.zza((zze)localObject1);
    localzzfff.zzg(paramThrowable);
    localzzfff.zzf(false);
    ((zzfft)localObject2).zzb(localzzfff.zzl());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzekb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */