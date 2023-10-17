package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbca
{
  private final Map zza;
  private final zzbcc zzb;
  
  public zzbca(zzbcc paramzzbcc)
  {
    this.zzb = paramzzbcc;
    this.zza = new HashMap();
  }
  
  public final zzbcc zza()
  {
    return this.zzb;
  }
  
  public final void zzb(String paramString, zzbbz paramzzbbz)
  {
    this.zza.put(paramString, paramzzbbz);
  }
  
  public final void zzc(String paramString1, String paramString2, long paramLong)
  {
    zzbcc localzzbcc = this.zzb;
    paramString2 = (zzbbz)this.zza.get(paramString2);
    if (paramString2 != null) {
      localzzbcc.zze(paramString2, paramLong, new String[] { paramString1 });
    }
    this.zza.put(paramString1, new zzbbz(paramLong, null, null));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */