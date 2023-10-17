package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeib
{
  private final Map zza = new HashMap();
  private final Map zzb = new HashMap();
  private final Map zzc = new HashMap();
  private final Executor zzd;
  private JSONObject zze;
  
  zzeib(Executor paramExecutor)
  {
    this.zzd = paramExecutor;
  }
  
  private final List zzg(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (paramJSONObject == null) {
        return localArrayList;
      }
      Bundle localBundle = zzl(paramJSONObject.optJSONObject("data"));
      Object localObject = paramJSONObject.optJSONArray("rtb_adapters");
      if (localObject == null) {
        return localArrayList;
      }
      paramJSONObject = new java/util/ArrayList;
      paramJSONObject.<init>();
      int j = 0;
      String str;
      for (int i = 0; i < ((JSONArray)localObject).length(); i++)
      {
        str = ((JSONArray)localObject).optString(i, "");
        if (!TextUtils.isEmpty(str)) {
          paramJSONObject.add(str);
        }
      }
      int k = paramJSONObject.size();
      for (i = j; i < k; i++)
      {
        str = (String)paramJSONObject.get(i);
        zzf(str);
        if ((zzeid)this.zza.get(str) != null)
        {
          localObject = new com/google/android/gms/internal/ads/zzeid;
          ((zzeid)localObject).<init>(str, paramString, localBundle);
          localArrayList.add(localObject);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  private final void zzh()
  {
    try
    {
      this.zzb.clear();
      this.zza.clear();
      zzj();
      zzk();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final void zzi(String paramString1, String paramString2, List paramList)
  {
    try
    {
      if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
      {
        Object localObject2 = (Map)this.zzc.get(paramString1);
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
        }
        this.zzc.put(paramString1, localObject1);
        localObject2 = (List)((Map)localObject1).get(paramString2);
        paramString1 = (String)localObject2;
        if (localObject2 == null)
        {
          paramString1 = new java/util/ArrayList;
          paramString1.<init>();
        }
        paramString1.addAll(paramList);
        ((Map)localObject1).put(paramString2, paramString1);
        return;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  private final void zzj()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 130	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   5: invokevirtual 135	com/google/android/gms/internal/ads/zzbzc:zzh	()Lcom/google/android/gms/ads/internal/util/zzg;
    //   8: invokeinterface 140 1 0
    //   13: invokevirtual 145	com/google/android/gms/internal/ads/zzbyw:zzf	()Lorg/json/JSONObject;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnonnull +6 -> 24
    //   21: goto +198 -> 219
    //   24: aload_3
    //   25: ldc -109
    //   27: invokevirtual 56	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   30: astore 4
    //   32: aload_0
    //   33: aload_3
    //   34: ldc -107
    //   36: invokevirtual 46	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   39: putfield 151	com/google/android/gms/internal/ads/zzeib:zze	Lorg/json/JSONObject;
    //   42: aload 4
    //   44: ifnull +175 -> 219
    //   47: iconst_0
    //   48: istore_1
    //   49: iload_1
    //   50: aload 4
    //   52: invokevirtual 62	org/json/JSONArray:length	()I
    //   55: if_icmpge +164 -> 219
    //   58: aload 4
    //   60: iload_1
    //   61: invokevirtual 155	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   64: astore 5
    //   66: getstatic 161	com/google/android/gms/internal/ads/zzbbk:zzjs	Lcom/google/android/gms/internal/ads/zzbbc;
    //   69: astore_3
    //   70: invokestatic 166	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   73: aload_3
    //   74: invokevirtual 171	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   77: checkcast 173	java/lang/Boolean
    //   80: invokevirtual 177	java/lang/Boolean:booleanValue	()Z
    //   83: ifeq +22 -> 105
    //   86: aload 5
    //   88: ldc -77
    //   90: ldc 64
    //   92: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: getstatic 188	java/util/Locale:ROOT	Ljava/util/Locale;
    //   98: invokevirtual 192	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   101: astore_3
    //   102: goto +13 -> 115
    //   105: aload 5
    //   107: ldc -77
    //   109: ldc 64
    //   111: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   114: astore_3
    //   115: aload 5
    //   117: ldc -62
    //   119: ldc 64
    //   121: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   124: astore 6
    //   126: new 37	java/util/ArrayList
    //   129: astore 7
    //   131: aload 7
    //   133: invokespecial 38	java/util/ArrayList:<init>	()V
    //   136: aload 5
    //   138: ldc -60
    //   140: invokevirtual 46	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   143: astore 5
    //   145: aload 5
    //   147: ifnonnull +6 -> 153
    //   150: goto +54 -> 204
    //   153: aload 5
    //   155: ldc -58
    //   157: invokevirtual 56	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   160: astore 5
    //   162: aload 5
    //   164: ifnull +40 -> 204
    //   167: iconst_0
    //   168: istore_2
    //   169: iload_2
    //   170: aload 5
    //   172: invokevirtual 62	org/json/JSONArray:length	()I
    //   175: if_icmpge +29 -> 204
    //   178: aload 7
    //   180: aload_0
    //   181: aload 5
    //   183: iload_2
    //   184: invokevirtual 155	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   187: aload 6
    //   189: invokespecial 200	com/google/android/gms/internal/ads/zzeib:zzg	(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    //   192: invokeinterface 122 2 0
    //   197: pop
    //   198: iinc 2 1
    //   201: goto -32 -> 169
    //   204: aload_0
    //   205: aload 6
    //   207: aload_3
    //   208: aload 7
    //   210: invokespecial 202	com/google/android/gms/internal/ads/zzeib:zzi	(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   213: iinc 1 1
    //   216: goto -167 -> 49
    //   219: aload_0
    //   220: monitorexit
    //   221: return
    //   222: astore_3
    //   223: ldc -52
    //   225: aload_3
    //   226: invokestatic 209	com/google/android/gms/ads/internal/util/zze:zzb	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   229: aload_0
    //   230: monitorexit
    //   231: return
    //   232: astore_3
    //   233: aload_0
    //   234: monitorexit
    //   235: aload_3
    //   236: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	zzeib
    //   48	166	1	i	int
    //   168	31	2	j	int
    //   16	192	3	localObject1	Object
    //   222	4	3	localJSONException	JSONException
    //   232	4	3	localObject2	Object
    //   30	29	4	localJSONArray	JSONArray
    //   64	118	5	localObject3	Object
    //   124	82	6	str	String
    //   129	80	7	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   24	42	222	org/json/JSONException
    //   49	102	222	org/json/JSONException
    //   105	115	222	org/json/JSONException
    //   115	145	222	org/json/JSONException
    //   153	162	222	org/json/JSONException
    //   169	198	222	org/json/JSONException
    //   204	213	222	org/json/JSONException
    //   2	17	232	finally
    //   24	42	232	finally
    //   49	102	232	finally
    //   105	115	232	finally
    //   115	145	232	finally
    //   153	162	232	finally
    //   169	198	232	finally
    //   204	213	232	finally
    //   223	229	232	finally
  }
  
  private final void zzk()
  {
    try
    {
      if (!((Boolean)zzbdj.zzf.zze()).booleanValue())
      {
        Object localObject1 = zzbbk.zzbF;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          localObject1 = zzt.zzo().zzh().zzh().zzf();
          if (localObject1 == null) {
            return;
          }
          try
          {
            JSONArray localJSONArray = ((JSONObject)localObject1).getJSONArray("signal_adapters");
            for (int i = 0; i < localJSONArray.length(); i++)
            {
              Object localObject3 = localJSONArray.getJSONObject(i);
              Bundle localBundle = zzl(((JSONObject)localObject3).optJSONObject("data"));
              localObject1 = ((JSONObject)localObject3).optString("adapter_class_name");
              boolean bool1 = ((JSONObject)localObject3).optBoolean("render", false);
              boolean bool2 = ((JSONObject)localObject3).optBoolean("collect_signals", false);
              if (!TextUtils.isEmpty((CharSequence)localObject1))
              {
                Map localMap = this.zzb;
                localObject3 = new com/google/android/gms/internal/ads/zzeif;
                ((zzeif)localObject3).<init>((String)localObject1, bool2, bool1, localBundle);
                localMap.put(localObject1, localObject3);
              }
            }
            return;
          }
          catch (JSONException localJSONException)
          {
            zze.zzb("Malformed config loading JSON.", localJSONException);
            return;
          }
        }
      }
      return;
    }
    finally {}
  }
  
  private static final Bundle zzl(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    if (paramJSONObject != null)
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localBundle.putString(str, paramJSONObject.optString(str, ""));
      }
    }
    return localBundle;
  }
  
  public final Map zza(String paramString1, String paramString2)
  {
    try
    {
      if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
      {
        Object localObject3 = (Map)this.zzc.get(paramString1);
        if (localObject3 == null)
        {
          paramString1 = zzfru.zzd();
          return paramString1;
        }
        Object localObject2 = (List)((Map)localObject3).get(paramString2);
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          paramString2 = zzdoe.zza(this.zze, paramString2, paramString1);
          localObject1 = zzbbk.zzjs;
          paramString1 = paramString2;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
            paramString1 = paramString2.toLowerCase(Locale.ROOT);
          }
          localObject1 = (List)((Map)localObject3).get(paramString1);
        }
        if (localObject1 == null)
        {
          paramString1 = zzfru.zzd();
          return paramString1;
        }
        paramString1 = new java/util/HashMap;
        paramString1.<init>();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (zzeid)((Iterator)localObject1).next();
          localObject2 = ((zzeid)localObject3).zza;
          if (!paramString1.containsKey(localObject2))
          {
            paramString2 = new java/util/ArrayList;
            paramString2.<init>();
            paramString1.put(localObject2, paramString2);
          }
          ((List)paramString1.get(localObject2)).add(((zzeid)localObject3).zzc);
        }
        paramString1 = zzfru.zzc(paramString1);
        return paramString1;
      }
      paramString1 = zzfru.zzd();
      return paramString1;
    }
    finally {}
  }
  
  public final Map zzb()
  {
    try
    {
      zzfru localzzfru = zzfru.zzc(this.zzb);
      return localzzfru;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzd()
  {
    zzt.zzo().zzh().zzq(new zzehz(this));
    this.zzd.execute(new zzeia(this));
  }
  
  public final void zzf(String paramString)
  {
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool) {
        return;
      }
      bool = this.zza.containsKey(paramString);
      if (bool) {
        return;
      }
      Map localMap = this.zza;
      zzeid localzzeid = new com/google/android/gms/internal/ads/zzeid;
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localzzeid.<init>(paramString, "", localBundle);
      localMap.put(paramString, localzzeid);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */