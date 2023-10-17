package com.google.android.gms.games;

public final class AuthenticationResult
{
  public static final AuthenticationResult zza = new AuthenticationResult(true);
  public static final AuthenticationResult zzb = new AuthenticationResult(false);
  private final boolean zzc;
  
  private AuthenticationResult(boolean paramBoolean)
  {
    this.zzc = paramBoolean;
  }
  
  public boolean isAuthenticated()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\AuthenticationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */