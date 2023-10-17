package com.google.android.gms.games;

import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.tasks.Task;

public abstract interface PlayerStatsClient
{
  public abstract Task<AnnotatedData<PlayerStats>> loadPlayerStats(boolean paramBoolean);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PlayerStatsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */