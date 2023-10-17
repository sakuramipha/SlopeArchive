package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

public final class zzfxi
{
  public static zzfxh zza(String paramString)
    throws GeneralSecurityException
  {
    paramString = (zzfxh)zzfyd.zzd().get("AES128_GCM");
    if (paramString != null) {
      return paramString;
    }
    throw new GeneralSecurityException("cannot find key template: AES128_GCM");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */