package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.Task;

public abstract interface LeaderboardsClient
{
  public abstract Task<Intent> getAllLeaderboardsIntent();
  
  public abstract Task<Intent> getLeaderboardIntent(String paramString);
  
  public abstract Task<Intent> getLeaderboardIntent(String paramString, int paramInt);
  
  public abstract Task<Intent> getLeaderboardIntent(String paramString, int paramInt1, int paramInt2);
  
  public abstract Task<AnnotatedData<LeaderboardScore>> loadCurrentPlayerLeaderboardScore(String paramString, int paramInt1, int paramInt2);
  
  public abstract Task<AnnotatedData<Leaderboard>> loadLeaderboardMetadata(String paramString, boolean paramBoolean);
  
  public abstract Task<AnnotatedData<LeaderboardBuffer>> loadLeaderboardMetadata(boolean paramBoolean);
  
  public abstract Task<AnnotatedData<LeaderboardScores>> loadMoreScores(LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2);
  
  public abstract Task<AnnotatedData<LeaderboardScores>> loadPlayerCenteredScores(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract Task<AnnotatedData<LeaderboardScores>> loadPlayerCenteredScores(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract Task<AnnotatedData<LeaderboardScores>> loadTopScores(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract Task<AnnotatedData<LeaderboardScores>> loadTopScores(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void submitScore(String paramString, long paramLong);
  
  public abstract void submitScore(String paramString1, long paramLong, String paramString2);
  
  public abstract Task<ScoreSubmissionData> submitScoreImmediate(String paramString, long paramLong);
  
  public abstract Task<ScoreSubmissionData> submitScoreImmediate(String paramString1, long paramLong, String paramString2);
  
  public static class LeaderboardScores
    implements Releasable
  {
    private final Leaderboard zza;
    private final LeaderboardScoreBuffer zzb;
    
    public LeaderboardScores(Leaderboard paramLeaderboard, LeaderboardScoreBuffer paramLeaderboardScoreBuffer)
    {
      this.zza = paramLeaderboard;
      this.zzb = paramLeaderboardScoreBuffer;
    }
    
    public Leaderboard getLeaderboard()
    {
      return this.zza;
    }
    
    public LeaderboardScoreBuffer getScores()
    {
      return this.zzb;
    }
    
    public void release()
    {
      this.zzb.release();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\LeaderboardsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */