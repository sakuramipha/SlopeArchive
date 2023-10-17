package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeca
{
  private final List zza = Collections.synchronizedList(new ArrayList());
  private final Map zzb = Collections.synchronizedMap(new HashMap());
  private final String zzc;
  private zzezi zzd = null;
  private zzezf zze = null;
  private zzu zzf = null;
  
  public zzeca(String paramString)
  {
    this.zzc = paramString;
  }
  
  private final void zzi(zzezf paramzzezf, int paramInt)
  {
    for (;;)
    {
      Object localObject1;
      Bundle localBundle;
      String str1;
      try
      {
        localObject1 = zzbbk.zzdj;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
          localObject1 = paramzzezf.zzaq;
        } else {
          localObject1 = paramzzezf.zzx;
        }
        boolean bool = this.zzb.containsKey(localObject1);
        if (bool) {
          return;
        }
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        localObject2 = paramzzezf.zzw.keys();
        if (((Iterator)localObject2).hasNext()) {
          str1 = (String)((Iterator)localObject2).next();
        }
      }
      finally {}
      try
      {
        localBundle.putString(str1, paramzzezf.zzw.getString(str1));
      }
      catch (JSONException localJSONException) {}
      Object localObject2 = zzbbk.zzgz;
      String str3;
      String str2;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        str1 = paramzzezf.zzG;
        str3 = paramzzezf.zzH;
        str2 = paramzzezf.zzI;
        localObject2 = paramzzezf.zzJ;
      }
      else
      {
        str1 = "";
        str3 = "";
        str2 = "";
        localObject2 = "";
      }
      zzu localzzu = new com/google/android/gms/ads/internal/client/zzu;
      localzzu.<init>(paramzzezf.zzF, 0L, null, localBundle, str1, str3, str2, (String)localObject2);
      try
      {
        this.zza.add(paramInt, localzzu);
      }
      catch (IndexOutOfBoundsException paramzzezf)
      {
        zzt.zzo().zzu(paramzzezf, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
      }
      this.zzb.put(localObject1, localzzu);
      return;
    }
  }
  
  private final void zzj(zzezf paramzzezf, long paramLong, zze paramzze, boolean paramBoolean)
  {
    Object localObject = zzbbk.zzdj;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      localObject = paramzzezf.zzaq;
    } else {
      localObject = paramzzezf.zzx;
    }
    if (!this.zzb.containsKey(localObject)) {
      return;
    }
    if (this.zze == null) {
      this.zze = paramzzezf;
    }
    paramzzezf = (zzu)this.zzb.get(localObject);
    paramzzezf.zzb = paramLong;
    paramzzezf.zzc = paramzze;
    paramzze = zzbbk.zzgA;
    if ((((Boolean)zzba.zzc().zzb(paramzze)).booleanValue()) && (paramBoolean)) {
      this.zzf = paramzzezf;
    }
  }
  
  public final zzu zza()
  {
    return this.zzf;
  }
  
  public final zzcvb zzb()
  {
    return new zzcvb(this.zze, "", this, this.zzd, this.zzc);
  }
  
  public final List zzc()
  {
    return this.zza;
  }
  
  public final void zzd(zzezf paramzzezf)
  {
    zzi(paramzzezf, this.zza.size());
  }
  
  public final void zze(zzezf paramzzezf, long paramLong, zze paramzze)
  {
    zzj(paramzzezf, paramLong, paramzze, false);
  }
  
  public final void zzf(zzezf paramzzezf, long paramLong, zze paramzze)
  {
    zzj(paramzzezf, paramLong, null, true);
  }
  
  public final void zzg(String paramString, List paramList)
  {
    try
    {
      boolean bool = this.zzb.containsKey(paramString);
      if (!bool) {
        return;
      }
      zzu localzzu = (zzu)this.zzb.get(paramString);
      int i = this.zza.indexOf(localzzu);
      try
      {
        this.zza.remove(i);
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        zzt.zzo().zzu(localIndexOutOfBoundsException, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
      }
      this.zzb.remove(paramString);
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        zzi((zzezf)paramString.next(), i);
        i++;
      }
      return;
    }
    finally {}
  }
  
  public final void zzh(zzezi paramzzezi)
  {
    this.zzd = paramzzezi;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */