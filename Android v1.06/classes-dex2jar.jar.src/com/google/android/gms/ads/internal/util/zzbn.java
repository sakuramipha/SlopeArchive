package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzamf;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzcal;
import java.util.Map;

public final class zzbn
  extends zzali
{
  private final zzcal zza;
  private final zzbzs zzb;
  
  public zzbn(String paramString, Map paramMap, zzcal paramzzcal)
  {
    super(0, paramString, new zzbm(paramzzcal));
    this.zza = paramzzcal;
    paramMap = new zzbzs(null);
    this.zzb = paramMap;
    paramMap.zzd(paramString, "GET", null, null);
  }
  
  protected final zzalo zzh(zzale paramzzale)
  {
    return zzalo.zzb(paramzzale, zzamf.zzb(paramzzale));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */