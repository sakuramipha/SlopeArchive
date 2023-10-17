package com.google.android.gms.games;

import android.app.Activity;
import com.google.android.gms.internal.games_v2.zzar;
import com.google.android.gms.internal.games_v2.zzax;
import com.google.android.gms.internal.games_v2.zzbr;
import com.google.android.gms.internal.games_v2.zzce;
import com.google.android.gms.internal.games_v2.zzcl;
import com.google.android.gms.internal.games_v2.zzco;
import com.google.android.gms.internal.games_v2.zzdj;
import com.google.android.gms.internal.games_v2.zzdm;
import com.google.android.gms.internal.games_v2.zzef;
import com.google.android.gms.internal.games_v2.zzey;

public final class PlayGames
{
  public static AchievementsClient getAchievementsClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzce(zzar.zza(zzbr.zza()));
  }
  
  public static EventsClient getEventsClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzcl(zzar.zza(zzbr.zza()));
  }
  
  public static GamesSignInClient getGamesSignInClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzco(zzax.zza(zzbr.zza()), zzar.zza(zzbr.zza()));
  }
  
  public static LeaderboardsClient getLeaderboardsClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzdj(zzar.zza(zzbr.zza()));
  }
  
  public static PlayerStatsClient getPlayerStatsClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzdm(zzar.zza(zzbr.zza()));
  }
  
  public static PlayersClient getPlayersClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzef(zzar.zza(zzbr.zza()));
  }
  
  public static SnapshotsClient getSnapshotsClient(Activity paramActivity)
  {
    zzbr.zzb();
    return new zzey(zzar.zza(zzbr.zza()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayGames.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */