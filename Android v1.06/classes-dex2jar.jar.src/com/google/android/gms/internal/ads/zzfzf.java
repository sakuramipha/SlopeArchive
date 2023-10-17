package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzfzf
  extends zzgdg
{
  final zzfzg zza;
  
  zzfzf(zzfzg paramzzfzg, Class paramClass)
  {
    super(paramClass);
  }
  
  public static final zzghx zzf(zzgia paramzzgia)
    throws GeneralSecurityException
  {
    zzghw localzzghw = zzghx.zzc();
    localzzghw.zzb(paramzzgia.zzg());
    paramzzgia = zzgmq.zza(paramzzgia.zza());
    localzzghw.zza(zzgno.zzv(paramzzgia, 0, paramzzgia.length));
    localzzghw.zzc(0);
    return (zzghx)localzzghw.zzal();
  }
  
  public final void zze(zzgia paramzzgia)
    throws GeneralSecurityException
  {
    zzgms.zza(paramzzgia.zza());
    zzfzg.zzg(this.zza, paramzzgia.zzg());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */