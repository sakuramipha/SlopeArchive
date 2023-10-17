package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgfo
{
  public static final int zza = 0;
  private static final zzgmu zzb;
  private static final zzgea zzc;
  private static final zzgdw zzd;
  private static final zzgde zze;
  private static final zzgda zzf;
  
  static
  {
    zzgmu localzzgmu = zzgew.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
    zzb = localzzgmu;
    zzc = zzgea.zza(zzgfk.zza, zzgfj.class, zzgem.class);
    zzd = zzgdw.zza(zzgfl.zza, localzzgmu, zzgem.class);
    zze = zzgde.zza(zzgfm.zza, zzgfa.class, zzgel.class);
    zzf = zzgda.zzb(zzgfn.zza, localzzgmu, zzgel.class);
  }
  
  public static void zza(zzgds paramzzgds)
    throws GeneralSecurityException
  {
    paramzzgds.zzf(zzc);
    paramzzgds.zze(zzd);
    paramzzgds.zzd(zze);
    paramzzgds.zzc(zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */