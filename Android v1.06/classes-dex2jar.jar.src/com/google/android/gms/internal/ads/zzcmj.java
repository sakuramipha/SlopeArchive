package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzcmj
{
  private final Map zza;
  private final Map zzb;
  
  zzcmj(Map paramMap1, Map paramMap2)
  {
    this.zza = paramMap1;
    this.zzb = paramMap2;
  }
  
  public final void zza(zzezr paramzzezr)
    throws Exception
  {
    Iterator localIterator1 = paramzzezr.zzb.zzc.iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (zzezp)localIterator1.next();
      if (this.zza.containsKey(((zzezp)localObject).zza))
      {
        ((zzcmm)this.zza.get(((zzezp)localObject).zza)).zza(((zzezp)localObject).zzb);
      }
      else if (this.zzb.containsKey(((zzezp)localObject).zza))
      {
        paramzzezr = (zzcml)this.zzb.get(((zzezp)localObject).zza);
        JSONObject localJSONObject = ((zzezp)localObject).zzb;
        HashMap localHashMap = new HashMap();
        Iterator localIterator2 = localJSONObject.keys();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          localObject = localJSONObject.optString(str);
          if (localObject != null) {
            localHashMap.put(str, localObject);
          }
        }
        paramzzezr.zza(localHashMap);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */