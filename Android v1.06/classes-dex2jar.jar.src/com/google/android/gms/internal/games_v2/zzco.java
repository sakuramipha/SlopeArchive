package com.google.android.gms.internal.games_v2;

import com.google.android.gms.games.AuthenticationResult;
import com.google.android.gms.games.GamesSignInClient;
import com.google.android.gms.tasks.Task;

public final class zzco
  implements GamesSignInClient
{
  private final zzav zza;
  private final zzar zzb;
  
  public zzco(zzav paramzzav, zzar paramzzar)
  {
    this.zza = paramzzav;
    this.zzb = paramzzar;
  }
  
  public final Task<AuthenticationResult> isAuthenticated()
  {
    return this.zza.zzc();
  }
  
  public final Task<String> requestServerSideAccess(String paramString, boolean paramBoolean)
  {
    return this.zzb.zzb(new zzcn(paramString, paramBoolean));
  }
  
  public final Task<AuthenticationResult> signIn()
  {
    return this.zza.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */