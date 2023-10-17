package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzbnm
  extends zzbzy
{
  private final zzbnl zza;
  
  public zzbnm(zzbnl paramzzbnl, String paramString)
  {
    super(paramString);
    this.zza = paramzzbnl;
  }
  
  public final boolean zza(String paramString)
  {
    zzbzt.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(paramString)));
    if ("oda".equals(Uri.parse(paramString).getScheme())) {
      return true;
    }
    zzbzt.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
    return super.zza(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */