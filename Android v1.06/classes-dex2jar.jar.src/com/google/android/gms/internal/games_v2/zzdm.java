package com.google.android.gms.internal.games_v2;

import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.PlayerStatsClient;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.tasks.Task;

public final class zzdm
  implements PlayerStatsClient
{
  private final zzar zza;
  
  public zzdm(zzar paramzzar)
  {
    this.zza = paramzzar;
  }
  
  public final Task<AnnotatedData<PlayerStats>> loadPlayerStats(boolean paramBoolean)
  {
    return this.zza.zzb(new zzdl(paramBoolean));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */