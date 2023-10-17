package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.tasks.Task;

public final class zzef
  implements PlayersClient
{
  private final zzar zza;
  
  public zzef(zzar paramzzar)
  {
    this.zza = paramzzar;
  }
  
  private final Task zza(String paramString, int paramInt)
  {
    return this.zza.zzb(new zzdo(paramString, paramInt));
  }
  
  private final Task zzb(String paramString, int paramInt, boolean paramBoolean)
  {
    return this.zza.zzb(new zzdp(paramString, paramInt, paramBoolean));
  }
  
  public final Task<Intent> getCompareProfileIntent(Player paramPlayer)
  {
    return this.zza.zzb(new zzee(paramPlayer));
  }
  
  public final Task<Intent> getCompareProfileIntent(String paramString)
  {
    return this.zza.zzb(new zzdq(paramString, null, null));
  }
  
  public final Task<Intent> getCompareProfileIntentWithAlternativeNameHints(String paramString1, String paramString2, String paramString3)
  {
    return this.zza.zzb(new zzdq(paramString1, paramString2, paramString3));
  }
  
  public final Task<Player> getCurrentPlayer()
  {
    return this.zza.zzb(zzdt.zza);
  }
  
  public final Task<AnnotatedData<Player>> getCurrentPlayer(boolean paramBoolean)
  {
    return this.zza.zzb(new zzds(paramBoolean));
  }
  
  public final Task<String> getCurrentPlayerId()
  {
    return this.zza.zzb(zzdu.zza);
  }
  
  public final Task<Intent> getPlayerSearchIntent()
  {
    return this.zza.zzb(zzdv.zza);
  }
  
  public final Task<AnnotatedData<PlayerBuffer>> loadFriends(int paramInt, boolean paramBoolean)
  {
    return zzb("friends_all", paramInt, paramBoolean);
  }
  
  public final Task<AnnotatedData<PlayerBuffer>> loadMoreFriends(int paramInt)
  {
    return zza("friends_all", paramInt);
  }
  
  public final Task<AnnotatedData<PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int paramInt)
  {
    return zza("played_with", paramInt);
  }
  
  public final Task<AnnotatedData<Player>> loadPlayer(String paramString)
  {
    return this.zza.zzb(new zzdr(paramString, false));
  }
  
  public final Task<AnnotatedData<Player>> loadPlayer(String paramString, boolean paramBoolean)
  {
    return this.zza.zzb(new zzdr(paramString, paramBoolean));
  }
  
  public final Task<AnnotatedData<PlayerBuffer>> loadRecentlyPlayedWithPlayers(int paramInt, boolean paramBoolean)
  {
    return zzb("played_with", paramInt, paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */