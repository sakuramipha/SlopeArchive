package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzas
{
  static final zzdf zza = zzdf.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
  private final Application zzb;
  private final SharedPreferences zzc;
  private final Set zzd;
  
  zzas(Application paramApplication)
  {
    this.zzb = paramApplication;
    paramApplication = paramApplication.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
    this.zzc = paramApplication;
    this.zzd = new HashSet(paramApplication.getStringSet("written_values", Collections.emptySet()));
  }
  
  public final int zza()
  {
    return this.zzc.getInt("consent_status", 0);
  }
  
  public final ConsentInformation.PrivacyOptionsRequirementStatus zzb()
  {
    return ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(this.zzc.getString("privacy_options_requirement_status", ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
  }
  
  public final Map zzc()
  {
    Application localApplication = this.zzb;
    Object localObject2 = this.zzc.getStringSet("stored_info", zzdf.zzi());
    Object localObject1 = localObject2;
    if (((Set)localObject2).isEmpty()) {
      localObject1 = zza;
    }
    localObject2 = new HashMap();
    Iterator localIterator = ((Set)localObject1).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localObject1 = zzcq.zza(localApplication, str);
      if (localObject1 == null)
      {
        Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
      }
      else
      {
        localObject1 = localApplication.getSharedPreferences(((zzco)localObject1).zza, 0).getAll().get(((zzco)localObject1).zzb);
        if (localObject1 == null)
        {
          Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
        }
        else
        {
          if ((localObject1 instanceof Boolean))
          {
            if (true != ((Boolean)localObject1).booleanValue()) {
              localObject1 = "0";
            } else {
              localObject1 = "1";
            }
          }
          else if ((localObject1 instanceof Number))
          {
            localObject1 = localObject1.toString();
          }
          else
          {
            if (!(localObject1 instanceof String)) {
              break label220;
            }
            localObject1 = (String)localObject1;
          }
          ((Map)localObject2).put(str, localObject1);
          continue;
          label220:
          Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
        }
      }
    }
    return (Map)localObject2;
  }
  
  public final Set zzd()
  {
    return this.zzd;
  }
  
  public final void zze()
  {
    zzcq.zzb(this.zzb, this.zzd);
    this.zzd.clear();
    this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
  }
  
  public final void zzf()
  {
    this.zzc.edit().putStringSet("written_values", this.zzd).apply();
  }
  
  public final void zzg(int paramInt)
  {
    this.zzc.edit().putInt("consent_status", paramInt).apply();
  }
  
  public final void zzh(ConsentInformation.PrivacyOptionsRequirementStatus paramPrivacyOptionsRequirementStatus)
  {
    this.zzc.edit().putString("privacy_options_requirement_status", paramPrivacyOptionsRequirementStatus.name()).apply();
  }
  
  public final void zzi(Set paramSet)
  {
    this.zzc.edit().putStringSet("stored_info", paramSet).apply();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */