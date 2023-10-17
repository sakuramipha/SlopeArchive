package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.LeaderboardsClient.LeaderboardScores;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.Task;

public final class zzdj
  implements LeaderboardsClient
{
  private final zzar zza;
  
  public zzdj(zzar paramzzar)
  {
    this.zza = paramzzar;
  }
  
  public final Task<Intent> getAllLeaderboardsIntent()
  {
    return this.zza.zzb(zzcz.zza);
  }
  
  public final Task<Intent> getLeaderboardIntent(String paramString)
  {
    return getLeaderboardIntent(paramString, -1, -1);
  }
  
  public final Task<Intent> getLeaderboardIntent(String paramString, int paramInt)
  {
    return getLeaderboardIntent(paramString, paramInt, -1);
  }
  
  public final Task<Intent> getLeaderboardIntent(String paramString, int paramInt1, int paramInt2)
  {
    return this.zza.zzb(new zzcr(paramString, paramInt1, paramInt2));
  }
  
  public final Task<AnnotatedData<LeaderboardScore>> loadCurrentPlayerLeaderboardScore(String paramString, int paramInt1, int paramInt2)
  {
    return this.zza.zzb(new zzcs(paramString, paramInt1, paramInt2));
  }
  
  public final Task<AnnotatedData<Leaderboard>> loadLeaderboardMetadata(String paramString, boolean paramBoolean)
  {
    return this.zza.zzb(new zzcx(paramString, paramBoolean));
  }
  
  public final Task<AnnotatedData<LeaderboardBuffer>> loadLeaderboardMetadata(boolean paramBoolean)
  {
    return this.zza.zzb(new zzcy(paramBoolean));
  }
  
  public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadMoreScores(LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    return this.zza.zzb(new zzcq(paramLeaderboardScoreBuffer, paramInt1, paramInt2));
  }
  
  public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return this.zza.zzb(new zzct(paramString, paramInt1, paramInt2, paramInt3, false));
  }
  
  public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return this.zza.zzb(new zzct(paramString, paramInt1, paramInt2, paramInt3, paramBoolean));
  }
  
  public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadTopScores(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return this.zza.zzb(new zzcu(paramString, paramInt1, paramInt2, paramInt3, false));
  }
  
  public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadTopScores(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return this.zza.zzb(new zzcu(paramString, paramInt1, paramInt2, paramInt3, paramBoolean));
  }
  
  public final void submitScore(String paramString, long paramLong)
  {
    this.zza.zzb(new zzcv(paramString, paramLong));
  }
  
  public final void submitScore(String paramString1, long paramLong, String paramString2)
  {
    this.zza.zzb(new zzcw(paramString1, paramLong, paramString2));
  }
  
  public final Task<ScoreSubmissionData> submitScoreImmediate(String paramString, long paramLong)
  {
    return this.zza.zzb(new zzcv(paramString, paramLong));
  }
  
  public final Task<ScoreSubmissionData> submitScoreImmediate(String paramString1, long paramLong, String paramString2)
  {
    return this.zza.zzb(new zzcw(paramString1, paramLong, paramString2));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */