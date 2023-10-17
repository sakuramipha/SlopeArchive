package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public abstract interface GoogleSignInOptionsExtension
{
  public static final int FITNESS = 3;
  public static final int GAMES = 1;
  
  public abstract int getExtensionType();
  
  public abstract List<Scope> getImpliedScopes();
  
  public abstract Bundle toBundle();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInOptionsExtension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */