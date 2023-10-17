package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.mediation.MediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdnx
{
  private final zzfat zza;
  private final zzdnu zzb;
  
  zzdnx(zzfat paramzzfat, zzdnu paramzzdnu)
  {
    this.zza = paramzzfat;
    this.zzb = paramzzdnu;
  }
  
  final zzbny zza()
    throws RemoteException
  {
    zzbny localzzbny = this.zza.zzb();
    if (localzzbny != null) {
      return localzzbny;
    }
    zzbzt.zzj("Unexpected call to adapter creator.");
    throw new RemoteException();
  }
  
  public final zzbpv zzb(String paramString)
    throws RemoteException
  {
    zzbpv localzzbpv = zza().zzc(paramString);
    this.zzb.zze(paramString, localzzbpv);
    return localzzbpv;
  }
  
  public final zzfav zzc(String paramString, JSONObject paramJSONObject)
    throws zzfaf
  {
    try
    {
      Object localObject;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
      {
        paramJSONObject = new com/google/android/gms/internal/ads/zzboy;
        localObject = new com/google/ads/mediation/admob/AdMobAdapter;
        ((AdMobAdapter)localObject).<init>();
        paramJSONObject.<init>((MediationAdapter)localObject);
      }
      else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(paramString))
      {
        paramJSONObject = new com/google/android/gms/internal/ads/zzbqn;
        paramJSONObject.<init>();
        paramJSONObject = new zzboy(paramJSONObject);
      }
      else
      {
        localObject = zza();
        boolean bool = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString);
        if (!bool)
        {
          bool = "com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString);
          if (!bool) {}
        }
        else
        {
          try
          {
            paramJSONObject = paramJSONObject.getString("class_name");
            if (((zzbny)localObject).zze(paramJSONObject)) {
              paramJSONObject = ((zzbny)localObject).zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
            } else if (((zzbny)localObject).zzd(paramJSONObject)) {
              paramJSONObject = ((zzbny)localObject).zzb(paramJSONObject);
            } else {
              paramJSONObject = ((zzbny)localObject).zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
            }
          }
          catch (JSONException paramJSONObject)
          {
            zzbzt.zzh("Invalid custom event.", paramJSONObject);
          }
        }
        paramJSONObject = ((zzbny)localObject).zzb(paramString);
      }
      paramJSONObject = new zzfav(paramJSONObject);
      this.zzb.zzd(paramString, paramJSONObject);
      return paramJSONObject;
    }
    finally
    {
      paramJSONObject = zzbbk.zziM;
      if (((Boolean)zzba.zzc().zzb(paramJSONObject)).booleanValue()) {
        this.zzb.zzd(paramString, null);
      }
    }
  }
  
  public final boolean zzd()
  {
    return this.zza.zzb() != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */