package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public final class zzdnu
{
  private final Map zza = new HashMap();
  
  @Nullable
  public final zzdnt zza(String paramString)
  {
    try
    {
      paramString = (zzdnt)this.zza.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  @Nullable
  public final zzdnt zzb(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = zza((String)localIterator.next());
      if (paramList != null) {
        return paramList;
      }
    }
    return null;
  }
  
  public final String zzc(String paramString)
  {
    paramString = zza(paramString);
    if (paramString != null)
    {
      paramString = paramString.zzb;
      if (paramString != null) {
        return paramString.toString();
      }
    }
    return "";
  }
  
  final void zzd(String paramString, @Nullable zzfav paramzzfav)
  {
    for (;;)
    {
      zzdnt localzzdnt;
      Object localObject1;
      zzbqj localzzbqj;
      try
      {
        bool1 = this.zza.containsKey(paramString);
        if (bool1) {
          return;
        }
        localzzdnt = new com/google/android/gms/internal/ads/zzdnt;
        localObject1 = null;
        if (paramzzfav == null) {
          localzzbqj = null;
        }
      }
      finally {}
      try
      {
        localzzbqj = paramzzfav.zze();
        if (paramzzfav != null) {}
      }
      catch (zzfaf localzzfaf1) {}
      try
      {
        localObject2 = paramzzfav.zzf();
        localObject1 = localObject2;
      }
      catch (zzfaf localzzfaf2)
      {
        continue;
      }
      Object localObject2 = zzbbk.zziM;
      boolean bool2 = ((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue();
      boolean bool1 = false;
      if (!bool2) {
        bool1 = true;
      } else if (paramzzfav == null) {}
      try
      {
        paramzzfav.zzC();
      }
      catch (zzfaf paramzzfav)
      {
        continue;
      }
      localzzdnt.<init>(paramString, localzzbqj, (zzbqj)localObject1, bool1);
      this.zza.put(paramString, localzzdnt);
      return;
    }
  }
  
  /* Error */
  final void zze(String paramString, zzbpv paramzzbpv)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	com/google/android/gms/internal/ads/zzdnu:zza	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 70 2 0
    //   12: istore_3
    //   13: iload_3
    //   14: ifeq +6 -> 20
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_2
    //   21: invokeinterface 115 1 0
    //   26: astore 4
    //   28: aload_2
    //   29: invokeinterface 118 1 0
    //   34: astore 5
    //   36: new 26	com/google/android/gms/internal/ads/zzdnt
    //   39: astore_2
    //   40: aload_2
    //   41: aload_1
    //   42: aload 4
    //   44: aload 5
    //   46: iconst_1
    //   47: invokespecial 106	com/google/android/gms/internal/ads/zzdnt:<init>	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbqj;Lcom/google/android/gms/internal/ads/zzbqj;Z)V
    //   50: aload_0
    //   51: getfield 15	com/google/android/gms/internal/ads/zzdnu:zza	Ljava/util/Map;
    //   54: aload_1
    //   55: aload_2
    //   56: invokeinterface 110 3 0
    //   61: pop
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: return
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zzdnu
    //   0	74	1	paramString	String
    //   0	74	2	paramzzbpv	zzbpv
    //   12	2	3	bool	boolean
    //   26	17	4	localzzbqj1	zzbqj
    //   34	11	5	localzzbqj2	zzbqj
    // Exception table:
    //   from	to	target	type
    //   20	36	65	finally
    //   2	13	69	finally
    //   36	62	69	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */