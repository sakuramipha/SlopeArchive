package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzdql
{
  private final zzg zza;
  private final List zzb = new ArrayList();
  private boolean zzc = false;
  private boolean zzd = false;
  private final String zze;
  private final zzdqh zzf;
  
  public zzdql(String paramString, zzdqh paramzzdqh)
  {
    this.zze = paramString;
    this.zzf = paramzzdqh;
    this.zza = zzt.zzo().zzh();
  }
  
  private final Map zzg()
  {
    Map localMap = this.zzf.zza();
    localMap.put("tms", Long.toString(zzt.zzB().elapsedRealtime(), 10));
    String str;
    if (this.zza.zzP()) {
      str = "";
    } else {
      str = this.zze;
    }
    localMap.put("tid", str);
    return localMap;
  }
  
  public final void zza(String paramString)
  {
    try
    {
      paramString = zzbbk.zzbS;
      if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
      {
        paramString = zzbbk.zzid;
        if (!((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
        {
          paramString = zzg();
          paramString.put("action", "aaia");
          paramString.put("aair", "MalformedJson");
          this.zzb.add(paramString);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = zzbbk.zzbS;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = zzbbk.zzid;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
        {
          localObject = zzg();
          ((Map)localObject).put("action", "adapter_init_finished");
          ((Map)localObject).put("ancn", paramString1);
          ((Map)localObject).put("rqe", paramString2);
          this.zzb.add(localObject);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzc(String paramString)
  {
    try
    {
      Object localObject = zzbbk.zzbS;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = zzbbk.zzid;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
        {
          localObject = zzg();
          ((Map)localObject).put("action", "adapter_init_started");
          ((Map)localObject).put("ancn", paramString);
          this.zzb.add(localObject);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzd(String paramString)
  {
    try
    {
      Object localObject = zzbbk.zzbS;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = zzbbk.zzid;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
        {
          localObject = zzg();
          ((Map)localObject).put("action", "adapter_init_finished");
          ((Map)localObject).put("ancn", paramString);
          this.zzb.add(localObject);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zze()
  {
    try
    {
      Object localObject1 = zzbbk.zzbS;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = zzbbk.zzid;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          if (!this.zzd)
          {
            localObject1 = zzg();
            ((Map)localObject1).put("action", "init_finished");
            this.zzb.add(localObject1);
            localObject1 = this.zzb.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              Map localMap = (Map)((Iterator)localObject1).next();
              this.zzf.zze(localMap);
            }
            this.zzd = true;
            return;
          }
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzf()
  {
    try
    {
      Object localObject1 = zzbbk.zzbS;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = zzbbk.zzid;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          if (!this.zzc)
          {
            localObject1 = zzg();
            ((Map)localObject1).put("action", "init_started");
            this.zzb.add(localObject1);
            this.zzc = true;
            return;
          }
          return;
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */