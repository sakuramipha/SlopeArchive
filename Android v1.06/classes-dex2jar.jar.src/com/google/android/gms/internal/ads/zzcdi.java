package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;

final class zzcdi
  implements Runnable
{
  final zzcdn zzk;
  
  zzcdi(zzcdn paramzzcdn, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, boolean paramBoolean, int paramInt1, int paramInt2) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheProgress");
    localHashMap.put("src", this.zza);
    localHashMap.put("cachedSrc", this.zzb);
    localHashMap.put("bufferedDuration", Long.toString(this.zzc));
    localHashMap.put("totalDuration", Long.toString(this.zzd));
    Object localObject = zzbbk.zzbJ;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localHashMap.put("qoeLoadedBytes", Long.toString(this.zze));
      localHashMap.put("qoeCachedBytes", Long.toString(this.zzf));
      localHashMap.put("totalBytes", Long.toString(this.zzg));
      localHashMap.put("reportTime", Long.toString(zzt.zzB().currentTimeMillis()));
    }
    if (true != this.zzh) {
      localObject = "0";
    } else {
      localObject = "1";
    }
    localHashMap.put("cacheReady", localObject);
    localHashMap.put("playerCount", Integer.toString(this.zzi));
    localHashMap.put("playerPreparedCount", Integer.toString(this.zzj));
    zzcdn.zze(this.zzk, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */