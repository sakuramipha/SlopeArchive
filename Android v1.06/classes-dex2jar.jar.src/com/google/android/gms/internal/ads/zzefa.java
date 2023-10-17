package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public abstract class zzefa
  implements zzebv
{
  private static Bundle zzd(Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    return paramBundle;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    Object localObject2 = paramzzezf.zzw.optString("pubid", "");
    Object localObject3 = paramzzezr.zza.zza;
    Object localObject1 = new zzezy();
    ((zzezy)localObject1).zzp((zzfaa)localObject3);
    ((zzezy)localObject1).zzs((String)localObject2);
    localObject2 = zzd(((zzfaa)localObject3).zzd.zzm);
    Bundle localBundle = zzd(((Bundle)localObject2).getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
    localBundle.putInt("gw", 1);
    String str1 = paramzzezf.zzw.optString("mad_hac", null);
    if (str1 != null) {
      localBundle.putString("mad_hac", str1);
    }
    str1 = paramzzezf.zzw.optString("adJson", null);
    if (str1 != null) {
      localBundle.putString("_ad", str1);
    }
    localBundle.putBoolean("_noRefresh", true);
    Iterator localIterator = paramzzezf.zzE.keys();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      str1 = paramzzezf.zzE.optString(str2, null);
      if (str2 != null) {
        localBundle.putString(str2, str1);
      }
    }
    ((Bundle)localObject2).putBundle("com.google.ads.mediation.admob.AdMobAdapter", localBundle);
    localObject3 = ((zzfaa)localObject3).zzd;
    ((zzezy)localObject1).zzE(new zzl(((zzl)localObject3).zza, ((zzl)localObject3).zzb, localBundle, ((zzl)localObject3).zzd, ((zzl)localObject3).zze, ((zzl)localObject3).zzf, ((zzl)localObject3).zzg, ((zzl)localObject3).zzh, ((zzl)localObject3).zzi, ((zzl)localObject3).zzj, ((zzl)localObject3).zzk, ((zzl)localObject3).zzl, (Bundle)localObject2, ((zzl)localObject3).zzn, ((zzl)localObject3).zzo, ((zzl)localObject3).zzp, ((zzl)localObject3).zzq, ((zzl)localObject3).zzr, ((zzl)localObject3).zzs, ((zzl)localObject3).zzt, ((zzl)localObject3).zzu, ((zzl)localObject3).zzv, ((zzl)localObject3).zzw, ((zzl)localObject3).zzx));
    localObject2 = ((zzezy)localObject1).zzG();
    localObject1 = new Bundle();
    localObject3 = paramzzezr.zzb.zzb;
    localBundle = new Bundle();
    localBundle.putStringArrayList("nofill_urls", new ArrayList(((zzezi)localObject3).zza));
    localBundle.putInt("refresh_interval", ((zzezi)localObject3).zzc);
    localBundle.putString("gws_query_id", ((zzezi)localObject3).zzb);
    ((Bundle)localObject1).putBundle("parent_common_config", localBundle);
    localObject3 = paramzzezr.zza.zza.zzf;
    localBundle = new Bundle();
    localBundle.putString("initial_ad_unit_id", (String)localObject3);
    localBundle.putString("allocation_id", paramzzezf.zzx);
    localBundle.putStringArrayList("click_urls", new ArrayList(paramzzezf.zzc));
    localBundle.putStringArrayList("imp_urls", new ArrayList(paramzzezf.zzd));
    localBundle.putStringArrayList("manual_tracking_urls", new ArrayList(paramzzezf.zzq));
    localBundle.putStringArrayList("fill_urls", new ArrayList(paramzzezf.zzn));
    localBundle.putStringArrayList("video_start_urls", new ArrayList(paramzzezf.zzh));
    localBundle.putStringArrayList("video_reward_urls", new ArrayList(paramzzezf.zzi));
    localBundle.putStringArrayList("video_complete_urls", new ArrayList(paramzzezf.zzj));
    localBundle.putString("transaction_id", paramzzezf.zzk);
    localBundle.putString("valid_from_timestamp", paramzzezf.zzl);
    localBundle.putBoolean("is_closable_area_disabled", paramzzezf.zzQ);
    localBundle.putString("recursive_server_response_data", paramzzezf.zzap);
    if (paramzzezf.zzm != null)
    {
      localObject3 = new Bundle();
      ((Bundle)localObject3).putInt("rb_amount", paramzzezf.zzm.zzb);
      ((Bundle)localObject3).putString("rb_type", paramzzezf.zzm.zza);
      localBundle.putParcelableArray("rewards", new Bundle[] { localObject3 });
    }
    ((Bundle)localObject1).putBundle("parent_ad_config", localBundle);
    return zzc((zzfaa)localObject2, (Bundle)localObject1, paramzzezf, paramzzezr);
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    return !TextUtils.isEmpty(paramzzezf.zzw.optString("pubid", ""));
  }
  
  protected abstract zzfwb zzc(zzfaa paramzzfaa, Bundle paramBundle, zzezf paramzzezf, zzezr paramzzezr);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */