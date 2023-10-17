package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;

public final class AdMobAdapter
  extends AbstractAdViewAdapter
{
  static final String AD_JSON_PARAMETER = "adJson";
  static final String AD_PARAMETER = "_ad";
  static final String HOUSE_ADS_PARAMETER = "mad_hac";
  public static final String NEW_BUNDLE = "_newBundle";
  
  protected Bundle buildExtrasBundle(Bundle paramBundle1, Bundle paramBundle2)
  {
    Bundle localBundle = paramBundle1;
    if (paramBundle1 == null) {
      localBundle = new Bundle();
    }
    paramBundle1 = localBundle;
    if (localBundle.getBoolean("_newBundle")) {
      paramBundle1 = new Bundle(localBundle);
    }
    paramBundle1.putInt("gw", 1);
    paramBundle1.putString("mad_hac", paramBundle2.getString("mad_hac"));
    if (!TextUtils.isEmpty(paramBundle2.getString("adJson"))) {
      paramBundle1.putString("_ad", paramBundle2.getString("adJson"));
    }
    paramBundle1.putBoolean("_noRefresh", true);
    return paramBundle1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\mediation\admob\AdMobAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */