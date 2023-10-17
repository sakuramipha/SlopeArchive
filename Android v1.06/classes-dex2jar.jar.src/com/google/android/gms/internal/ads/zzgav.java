package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class zzgav
  extends zzgdh
{
  zzgav()
  {
    super(zzgiv.class, new zzgef[] { new zzgat(zzfww.class) });
  }
  
  public static void zzg(boolean paramBoolean)
    throws GeneralSecurityException
  {
    if (zzm())
    {
      zzfyd.zze(new zzgav(), true);
      int i = zzgbf.zza;
      zzgbf.zza(zzgds.zzb());
    }
  }
  
  private static boolean zzm()
  {
    try
    {
      Cipher.getInstance("AES/GCM-SIV/NoPadding");
      return true;
    }
    catch (NoSuchAlgorithmException|NoSuchPaddingException localNoSuchAlgorithmException) {}
    return false;
  }
  
  public final zzgdg zza()
  {
    return new zzgau(this, zzgiy.class);
  }
  
  public final zzgjt zzb()
  {
    return zzgjt.zzb;
  }
  
  public final String zzd()
  {
    return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */