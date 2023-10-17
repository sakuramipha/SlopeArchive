package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzab
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzab(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzg(DataHolder paramDataHolder)
  {
    int i = paramDataHolder.getStatusCode();
    boolean bool;
    if (i == 3) {
      bool = true;
    } else {
      bool = false;
    }
    if ((i != 0) && (!bool))
    {
      GamesStatusUtils.zza(this.zza, i);
      paramDataHolder.close();
      return;
    }
    this.zza.setResult(new AnnotatedData(new LeaderboardBuffer(paramDataHolder), bool));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */