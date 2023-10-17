package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfzg
  extends zzgdh
{
  zzfzg()
  {
    super(zzghx.class, new zzgef[] { new zzfze(zzgmk.class) });
  }
  
  public static final void zzh(zzghx paramzzghx)
    throws GeneralSecurityException
  {
    zzgms.zzb(paramzzghx.zza(), 0);
    zzgms.zza(paramzzghx.zzh().zzd());
    zzm(paramzzghx.zzg());
  }
  
  private static final void zzm(zzgid paramzzgid)
    throws GeneralSecurityException
  {
    if ((paramzzgid.zza() >= 12) && (paramzzgid.zza() <= 16)) {
      return;
    }
    throw new GeneralSecurityException("invalid IV size");
  }
  
  public final zzgdg zza()
  {
    return new zzfzf(this, zzgia.class);
  }
  
  public final zzgjt zzb()
  {
    return zzgjt.zzb;
  }
  
  public final String zzd()
  {
    return "type.googleapis.com/google.crypto.tink.AesCtrKey";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */