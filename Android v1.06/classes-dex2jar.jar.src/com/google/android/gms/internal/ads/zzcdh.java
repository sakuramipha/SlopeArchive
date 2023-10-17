package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class zzcdh
  implements Runnable
{
  final zzcdn zze;
  
  zzcdh(zzcdn paramzzcdn, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheProgress");
    localHashMap.put("src", this.zza);
    localHashMap.put("cachedSrc", this.zzb);
    localHashMap.put("bytesLoaded", Integer.toString(this.zzc));
    localHashMap.put("totalBytes", Integer.toString(this.zzd));
    localHashMap.put("cacheReady", "0");
    zzcdn.zze(this.zze, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */