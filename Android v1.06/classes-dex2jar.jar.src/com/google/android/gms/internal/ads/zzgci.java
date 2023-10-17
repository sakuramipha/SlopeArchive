package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgci
{
  public static final int zza = 0;
  private static final zzgmu zzb;
  private static final zzgea zzc;
  private static final zzgdw zzd;
  private static final zzgde zze;
  private static final zzgda zzf;
  
  static
  {
    zzgmu localzzgmu = zzgew.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    zzb = localzzgmu;
    zzc = zzgea.zza(zzgce.zza, zzgcd.class, zzgem.class);
    zzd = zzgdw.zza(zzgcf.zza, localzzgmu, zzgem.class);
    zze = zzgde.zza(zzgcg.zza, zzgby.class, zzgel.class);
    zzf = zzgda.zzb(zzgch.zza, localzzgmu, zzgel.class);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */