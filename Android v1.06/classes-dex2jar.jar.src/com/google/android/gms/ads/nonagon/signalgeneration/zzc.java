package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzdqj;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzc
{
  private final int zza;
  private final long zzb;
  private final boolean zzc;
  private final boolean zzd;
  private final Map zze;
  private final ArrayDeque zzf = new ArrayDeque();
  private final ArrayDeque zzg = new ArrayDeque();
  private final zzdqh zzh;
  private Map zzi;
  
  public zzc(zzdqh paramzzdqh)
  {
    this.zzh = paramzzdqh;
    paramzzdqh = zzbbk.zzgJ;
    this.zza = ((Integer)zzba.zzc().zzb(paramzzdqh)).intValue();
    paramzzdqh = zzbbk.zzgK;
    this.zzb = ((Long)zzba.zzc().zzb(paramzzdqh)).longValue();
    paramzzdqh = zzbbk.zzgP;
    this.zzc = ((Boolean)zzba.zzc().zzb(paramzzdqh)).booleanValue();
    paramzzdqh = zzbbk.zzgN;
    this.zzd = ((Boolean)zzba.zzc().zzb(paramzzdqh)).booleanValue();
    this.zze = Collections.synchronizedMap(new zzb(this));
  }
  
  private final void zzg(zzdpx paramzzdpx)
  {
    try
    {
      boolean bool = this.zzc;
      if (!bool) {
        return;
      }
      ArrayDeque localArrayDeque1 = this.zzg.clone();
      this.zzg.clear();
      ArrayDeque localArrayDeque2 = this.zzf.clone();
      this.zzf.clear();
      zzfwc localzzfwc = zzcag.zza;
      zza localzza = new com/google/android/gms/ads/nonagon/signalgeneration/zza;
      localzza.<init>(this, paramzzdpx, localArrayDeque1, localArrayDeque2);
      localzzfwc.execute(localzza);
      return;
    }
    finally {}
  }
  
  private final void zzh(zzdpx paramzzdpx, ArrayDeque paramArrayDeque, String paramString)
  {
    while (!paramArrayDeque.isEmpty())
    {
      Object localObject1 = (Pair)paramArrayDeque.poll();
      Object localObject2 = new ConcurrentHashMap(paramzzdpx.zza());
      this.zzi = ((Map)localObject2);
      ((Map)localObject2).put("action", "ev");
      this.zzi.put("e_r", paramString);
      this.zzi.put("e_id", (String)((Pair)localObject1).first);
      if (this.zzd)
      {
        localObject2 = (String)((Pair)localObject1).second;
        Pair localPair;
        try
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>((String)localObject2);
          localObject2 = ((JSONObject)localObject1).getString("request_agent");
          String str = ((JSONObject)localObject1).getJSONObject("extras").getString("query_info_type");
          localObject1 = new android/util/Pair;
          ((Pair)localObject1).<init>(zzf.zza(str), localObject2);
        }
        catch (JSONException localJSONException)
        {
          localPair = new Pair("", "");
        }
        zzj(this.zzi, "e_type", (String)localPair.first);
        zzj(this.zzi, "e_agent", (String)localPair.second);
      }
      this.zzh.zze(this.zzi);
    }
  }
  
  /* Error */
  private final void zzi()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 219	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   5: invokeinterface 224 1 0
    //   10: lstore_1
    //   11: aload_0
    //   12: getfield 97	com/google/android/gms/ads/nonagon/signalgeneration/zzc:zze	Ljava/util/Map;
    //   15: invokeinterface 228 1 0
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 234 1 0
    //   27: astore 4
    //   29: aload 4
    //   31: invokeinterface 239 1 0
    //   36: ifeq +101 -> 137
    //   39: aload 4
    //   41: invokeinterface 242 1 0
    //   46: checkcast 244	java/util/Map$Entry
    //   49: astore 6
    //   51: lload_1
    //   52: aload 6
    //   54: invokeinterface 247 1 0
    //   59: checkcast 136	android/util/Pair
    //   62: getfield 166	android/util/Pair:first	Ljava/lang/Object;
    //   65: checkcast 62	java/lang/Long
    //   68: invokevirtual 66	java/lang/Long:longValue	()J
    //   71: lsub
    //   72: aload_0
    //   73: getfield 68	com/google/android/gms/ads/nonagon/signalgeneration/zzc:zzb	J
    //   76: lcmp
    //   77: ifle +60 -> 137
    //   80: aload_0
    //   81: getfield 31	com/google/android/gms/ads/nonagon/signalgeneration/zzc:zzg	Ljava/util/ArrayDeque;
    //   84: astore 5
    //   86: new 136	android/util/Pair
    //   89: astore_3
    //   90: aload_3
    //   91: aload 6
    //   93: invokeinterface 250 1 0
    //   98: checkcast 168	java/lang/String
    //   101: aload 6
    //   103: invokeinterface 247 1 0
    //   108: checkcast 136	android/util/Pair
    //   111: getfield 171	android/util/Pair:second	Ljava/lang/Object;
    //   114: checkcast 168	java/lang/String
    //   117: invokespecial 197	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   120: aload 5
    //   122: aload_3
    //   123: invokevirtual 254	java/util/ArrayDeque:add	(Ljava/lang/Object;)Z
    //   126: pop
    //   127: aload 4
    //   129: invokeinterface 257 1 0
    //   134: goto -105 -> 29
    //   137: aload_0
    //   138: monitorexit
    //   139: return
    //   140: astore_3
    //   141: invokestatic 261	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   144: aload_3
    //   145: ldc_w 263
    //   148: invokevirtual 269	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   151: aload_0
    //   152: monitorexit
    //   153: return
    //   154: astore_3
    //   155: aload_0
    //   156: monitorexit
    //   157: aload_3
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	zzc
    //   10	42	1	l	long
    //   20	103	3	localObject1	Object
    //   140	5	3	localConcurrentModificationException	java.util.ConcurrentModificationException
    //   154	4	3	localObject2	Object
    //   27	101	4	localIterator	java.util.Iterator
    //   84	37	5	localArrayDeque	ArrayDeque
    //   49	53	6	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   21	29	140	java/util/ConcurrentModificationException
    //   29	134	140	java/util/ConcurrentModificationException
    //   2	21	154	finally
    //   21	29	154	finally
    //   29	134	154	finally
    //   141	151	154	finally
  }
  
  private static final void zzj(Map paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  public final String zzb(String paramString, zzdpx paramzzdpx)
  {
    try
    {
      Object localObject = (Pair)this.zze.get(paramString);
      paramzzdpx.zza().put("rid", paramString);
      if (localObject != null)
      {
        localObject = (String)((Pair)localObject).second;
        this.zze.remove(paramString);
        paramzzdpx.zza().put("mhit", "true");
        return (String)localObject;
      }
      paramzzdpx.zza().put("mhit", "false");
      return null;
    }
    finally {}
  }
  
  public final void zzd(String paramString1, String paramString2, zzdpx paramzzdpx)
  {
    try
    {
      Map localMap = this.zze;
      Pair localPair = new android/util/Pair;
      localPair.<init>(Long.valueOf(zzt.zzB().currentTimeMillis()), paramString2);
      localMap.put(paramString1, localPair);
      zzi();
      zzg(paramzzdpx);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void zzf(String paramString)
  {
    try
    {
      this.zze.remove(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */