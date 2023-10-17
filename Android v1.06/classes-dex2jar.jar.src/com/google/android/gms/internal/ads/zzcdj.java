package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class zzcdj
  implements Runnable
{
  final zzcdn zzj;
  
  zzcdj(zzcdn paramzzcdn, String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, int paramInt4) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheProgress");
    localHashMap.put("src", this.zza);
    localHashMap.put("cachedSrc", this.zzb);
    localHashMap.put("bytesLoaded", Integer.toString(this.zzc));
    localHashMap.put("totalBytes", Integer.toString(this.zzd));
    localHashMap.put("bufferedDuration", Long.toString(this.zze));
    localHashMap.put("totalDuration", Long.toString(this.zzf));
    String str;
    if (true != this.zzg) {
      str = "0";
    } else {
      str = "1";
    }
    localHashMap.put("cacheReady", str);
    localHashMap.put("playerCount", Integer.toString(this.zzh));
    localHashMap.put("playerPreparedCount", Integer.toString(this.zzi));
    zzcdn.zze(this.zzj, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */