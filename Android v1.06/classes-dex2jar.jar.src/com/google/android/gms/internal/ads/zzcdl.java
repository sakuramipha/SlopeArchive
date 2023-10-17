package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class zzcdl
  implements Runnable
{
  final zzcdn zzd;
  
  zzcdl(zzcdn paramzzcdn, String paramString1, String paramString2, long paramLong) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheComplete");
    localHashMap.put("src", this.zza);
    localHashMap.put("cachedSrc", this.zzb);
    localHashMap.put("totalDuration", Long.toString(this.zzc));
    zzcdn.zze(this.zzd, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */