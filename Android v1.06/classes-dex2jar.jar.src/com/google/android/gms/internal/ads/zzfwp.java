package com.google.android.gms.internal.ads;

import java.util.Objects;

final class zzfwp
  extends zzfwa
{
  final zzfwr zza;
  private final zzfux zzb;
  
  zzfwp(zzfwr paramzzfwr, zzfux paramzzfux)
  {
    Objects.requireNonNull(paramzzfux);
    this.zzb = paramzzfux;
  }
  
  final String zzb()
  {
    return this.zzb.toString();
  }
  
  final void zzd(Throwable paramThrowable)
  {
    this.zza.zze(paramThrowable);
  }
  
  final boolean zzg()
  {
    return this.zza.isDone();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */