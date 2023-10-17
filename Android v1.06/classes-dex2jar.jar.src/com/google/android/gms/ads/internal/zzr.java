package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzeqn;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

final class zzr
{
  private final Context zza;
  private final String zzb;
  private final Map zzc;
  private String zzd;
  private String zze;
  private final String zzf;
  
  public zzr(Context paramContext, String paramString)
  {
    this.zza = paramContext.getApplicationContext();
    this.zzb = paramString;
    this.zzc = new TreeMap();
    paramString = paramContext.getPackageName();
    try
    {
      String str = Wrappers.packageManager(paramContext).getPackageInfo(paramContext.getPackageName(), 0).versionName;
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append(paramString);
      paramContext.append("-");
      paramContext.append(str);
      paramContext = paramContext.toString();
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      zzbzt.zzh("Unable to get package version name for reporting", paramContext);
      paramContext = String.valueOf(paramString).concat("-missing");
    }
    this.zzf = paramContext;
  }
  
  public final String zza()
  {
    return this.zzf;
  }
  
  public final String zzb()
  {
    return this.zze;
  }
  
  public final String zzc()
  {
    return this.zzb;
  }
  
  public final String zzd()
  {
    return this.zzd;
  }
  
  public final Map zze()
  {
    return this.zzc;
  }
  
  public final void zzf(zzl paramzzl, zzbzz paramzzbzz)
  {
    this.zzd = paramzzl.zzj.zza;
    paramzzl = paramzzl.zzm;
    if (paramzzl != null) {
      paramzzl = paramzzl.getBundle(AdMobAdapter.class.getName());
    } else {
      paramzzl = null;
    }
    if (paramzzl == null) {
      return;
    }
    String str1 = (String)zzbcr.zzc.zze();
    Iterator localIterator = paramzzl.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      if (str1.equals(str2)) {
        this.zze = paramzzl.getString(str2);
      } else if (str2.startsWith("csa_")) {
        this.zzc.put(str2.substring(4), paramzzl.getString(str2));
      }
    }
    this.zzc.put("SDKVersion", paramzzbzz.zza);
    if (((Boolean)zzbcr.zza.zze()).booleanValue()) {
      try
      {
        paramzzl = new org/json/JSONArray;
        paramzzl.<init>((String)zzbcr.zzb.zze());
        paramzzl = zzeqn.zzc(this.zza, paramzzl);
        localIterator = paramzzl.keySet().iterator();
        while (localIterator.hasNext())
        {
          paramzzbzz = (String)localIterator.next();
          this.zzc.put(paramzzbzz, paramzzl.get(paramzzbzz).toString());
        }
        return;
      }
      catch (JSONException paramzzl)
      {
        zzbzt.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", paramzzl);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */