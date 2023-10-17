package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zad
{
  public static final Api.ClientKey<SignInClientImpl> zaa;
  public static final Api.ClientKey<SignInClientImpl> zab;
  public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zac;
  static final Api.AbstractClientBuilder<SignInClientImpl, zac> zad;
  public static final Scope zae;
  public static final Scope zaf;
  public static final Api<SignInOptions> zag;
  public static final Api<zac> zah;
  
  static
  {
    Api.ClientKey localClientKey2 = new Api.ClientKey();
    zaa = localClientKey2;
    Api.ClientKey localClientKey1 = new Api.ClientKey();
    zab = localClientKey1;
    zaa localzaa = new zaa();
    zac = localzaa;
    zab localzab = new zab();
    zad = localzab;
    zae = new Scope("profile");
    zaf = new Scope("email");
    zag = new Api("SignIn.API", localzaa, localClientKey2);
    zah = new Api("SignIn.INTERNAL_API", localzab, localClientKey1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */