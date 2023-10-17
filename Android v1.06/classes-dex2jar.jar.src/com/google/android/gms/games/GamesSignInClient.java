package com.google.android.gms.games;

import com.google.android.gms.tasks.Task;

public abstract interface GamesSignInClient
{
  public abstract Task<AuthenticationResult> isAuthenticated();
  
  public abstract Task<String> requestServerSideAccess(String paramString, boolean paramBoolean);
  
  public abstract Task<AuthenticationResult> signIn();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GamesSignInClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */