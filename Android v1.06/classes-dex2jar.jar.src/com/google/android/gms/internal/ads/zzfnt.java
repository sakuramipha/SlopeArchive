package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfnt
  extends zzfnp
{
  final zzfnz zza;
  
  zzfnt(zzfnz paramzzfnz) {}
  
  public final void zza()
  {
    synchronized (zzfnz.zzg(this.zza))
    {
      if ((zzfnz.zzi(this.zza).get() > 0) && (zzfnz.zzi(this.zza).decrementAndGet() > 0))
      {
        zzfnz.zzf(this.zza).zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
        return;
      }
      zzfnz localzzfnz = this.zza;
      if (zzfnz.zzd(localzzfnz) != null)
      {
        zzfnz.zzf(localzzfnz).zzc("Unbind from service.", new Object[0]);
        localzzfnz = this.zza;
        zzfnz.zza(localzzfnz).unbindService(zzfnz.zzb(localzzfnz));
        zzfnz.zzl(this.zza, false);
        zzfnz.zzm(this.zza, null);
        zzfnz.zzk(this.zza, null);
      }
      zzfnz.zzo(this.zza);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */