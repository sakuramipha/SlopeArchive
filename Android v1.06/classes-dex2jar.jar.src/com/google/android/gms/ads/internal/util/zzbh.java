package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzalr;
import com.google.android.gms.internal.ads.zzbzt;

final class zzbh
  implements zzalm
{
  zzbh(zzbo paramzzbo, String paramString, zzbl paramzzbl) {}
  
  public final void zza(zzalr paramzzalr)
  {
    String str = this.zza;
    paramzzalr = paramzzalr.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Failed to load URL: ");
    localStringBuilder.append(str);
    localStringBuilder.append("\n");
    localStringBuilder.append(paramzzalr);
    zzbzt.zzj(localStringBuilder.toString());
    this.zzb.zza(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */