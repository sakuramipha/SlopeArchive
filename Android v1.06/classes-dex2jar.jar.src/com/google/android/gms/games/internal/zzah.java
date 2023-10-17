package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzah
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzah(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzk(DataHolder paramDataHolder)
  {
    int i = paramDataHolder.getStatusCode();
    if ((i != 0) && (i != 5))
    {
      GamesStatusUtils.zza(this.zza, i);
      paramDataHolder.close();
      return;
    }
    try
    {
      TaskCompletionSource localTaskCompletionSource = this.zza;
      ScoreSubmissionData localScoreSubmissionData = new com/google/android/gms/games/leaderboard/ScoreSubmissionData;
      localScoreSubmissionData.<init>(paramDataHolder);
      localTaskCompletionSource.setResult(localScoreSubmissionData);
      return;
    }
    finally
    {
      paramDataHolder.close();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */