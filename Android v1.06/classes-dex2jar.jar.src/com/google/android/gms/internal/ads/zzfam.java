package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Map;
import javax.annotation.Nullable;

public final class zzfam
{
  public zzfam()
  {
    try
    {
      zzfyg.zza();
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      zze.zza("Failed to Configure Aead. ".concat(localGeneralSecurityException.toString()));
      zzt.zzo().zzu(localGeneralSecurityException, "CryptoUtils.registerAead");
    }
  }
  
  public static final String zza()
  {
    zzgnl localzzgnl = zzgno.zzt();
    try
    {
      zzfwz.zzb(zzfxp.zzc(zzfxi.zza("AES128_GCM")), zzfwy.zzb(localzzgnl));
    }
    catch (IOException localIOException) {}catch (GeneralSecurityException localGeneralSecurityException) {}
    zze.zza("Failed to generate key".concat(localGeneralSecurityException.toString()));
    zzt.zzo().zzu(localGeneralSecurityException, "CryptoUtils.generateKey");
    String str = Base64.encodeToString(localzzgnl.zzb().zzA(), 11);
    localzzgnl.zzc();
    return str;
  }
  
  @Nullable
  public static final String zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString, zzdpx paramzzdpx)
  {
    paramString = zzc(paramString);
    if (paramString == null) {
      return null;
    }
    try
    {
      paramArrayOfByte1 = ((zzfww)paramString.zze(zzfww.class)).zza(paramArrayOfByte1, paramArrayOfByte2);
      paramzzdpx.zza().put("ds", "1");
      paramArrayOfByte1 = new String(paramArrayOfByte1, "UTF-8");
      return paramArrayOfByte1;
    }
    catch (UnsupportedEncodingException paramArrayOfByte1) {}catch (GeneralSecurityException paramArrayOfByte1) {}
    zze.zza("Failed to decrypt ".concat(paramArrayOfByte1.toString()));
    zzt.zzo().zzu(paramArrayOfByte1, "CryptoUtils.decrypt");
    paramzzdpx.zza().put("dsf", paramArrayOfByte1.toString());
    return null;
  }
  
  @Nullable
  private static final zzfxp zzc(String paramString)
  {
    try
    {
      paramString = zzfwz.zza(zzfwx.zzb(Base64.decode(paramString, 11)));
    }
    catch (IOException paramString) {}catch (GeneralSecurityException paramString) {}
    zze.zza("Failed to get keysethandle".concat(paramString.toString()));
    zzt.zzo().zzu(paramString, "CryptoUtils.getHandle");
    paramString = null;
    return paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */