package com.google.android.gms.internal.games_v2;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.internal.ClientSettings.Builder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.zzn;

public final class zze
  extends GoogleApi
{
  public zze(Context paramContext, zzn paramzzn)
  {
    super(paramContext, Games.zze, paramzzn, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  protected final ClientSettings.Builder createClientSettingsBuilder()
  {
    ClientSettings.Builder localBuilder = super.createClientSettingsBuilder();
    if (getApiOptions() != null) {
      String str = ((zzn)getApiOptions()).zzl;
    }
    return localBuilder;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */