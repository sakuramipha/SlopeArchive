package com.google.android.gms.games;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.internal.games_v2.zzd;
import com.google.android.gms.internal.games_v2.zzf;
import com.google.android.gms.internal.games_v2.zzi;
import com.google.android.gms.internal.games_v2.zzj;
import com.google.android.gms.internal.games_v2.zzk;
import com.google.android.gms.internal.games_v2.zzl;

public final class Games
{
  static final Api.ClientKey zza;
  public static final Scope zzb;
  public static final Scope zzc;
  public static final Scope zzd;
  @Deprecated
  public static final Api zze;
  public static final Scope zzf;
  public static final Api zzg;
  @Deprecated
  public static final GamesMetadata zzh = new com.google.android.gms.internal.games_v2.zzg();
  @Deprecated
  public static final Achievements zzi = new zzd();
  @Deprecated
  public static final Events zzj = new zzf();
  @Deprecated
  public static final Leaderboards zzk = new com.google.android.gms.internal.games_v2.zzh();
  @Deprecated
  public static final Players zzl = new zzi();
  @Deprecated
  public static final Snapshots zzm = new zzj();
  @Deprecated
  public static final Stats zzn = new zzk();
  @Deprecated
  public static final Videos zzo = new zzl();
  private static final Api.AbstractClientBuilder zzp;
  private static final Api.AbstractClientBuilder zzq;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    zza = localClientKey;
    zzg localzzg = new zzg();
    zzp = localzzg;
    zzh localzzh = new zzh();
    zzq = localzzh;
    zzb = new Scope("https://www.googleapis.com/auth/games");
    zzc = new Scope("https://www.googleapis.com/auth/games_lite");
    zzd = new Scope("https://www.googleapis.com/auth/drive.appdata");
    zze = new Api("Games.API", localzzg, localClientKey);
    zzf = new Scope("https://www.googleapis.com/auth/games.firstparty");
    zzg = new Api("Games.API_1P", localzzh, localClientKey);
  }
  
  @Deprecated
  public static abstract interface GetServerAuthCodeResult
    extends Result
  {
    public abstract String getCode();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\Games.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */