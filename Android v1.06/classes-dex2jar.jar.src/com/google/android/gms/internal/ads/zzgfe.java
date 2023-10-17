package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgfe
  extends zzgdh
{
  private static final zzgee zza = zzgee.zzb(zzgfb.zza, zzgfa.class, zzgfp.class);
  
  zzgfe()
  {
    super(zzghi.class, new zzgef[] { new zzgfc(zzfxs.class) });
  }
  
  public static void zzm(boolean paramBoolean)
    throws GeneralSecurityException
  {
    zzfyd.zze(new zzgfe(), true);
    int i = zzgfo.zza;
    zzgfo.zza(zzgds.zzb());
    zzgdr.zza().zze(zza);
  }
  
  private static void zzn(zzgho paramzzgho)
    throws GeneralSecurityException
  {
    if (paramzzgho.zza() >= 10)
    {
      if (paramzzgho.zza() <= 16) {
        return;
      }
      throw new GeneralSecurityException("tag size too long");
    }
    throw new GeneralSecurityException("tag size too short");
  }
  
  private static void zzo(int paramInt)
    throws GeneralSecurityException
  {
    if (paramInt == 32) {
      return;
    }
    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
  }
  
  public final zzgdg zza()
  {
    return new zzgfd(this, zzghl.class);
  }
  
  public final zzgjt zzb()
  {
    return zzgjt.zzb;
  }
  
  public final String zzd()
  {
    return "type.googleapis.com/google.crypto.tink.AesCmacKey";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */