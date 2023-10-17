package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;

public class SignInClientImpl
  extends GmsClient<zaf>
  implements com.google.android.gms.signin.zae
{
  public static final int zaa = 0;
  private final boolean zab = true;
  private final ClientSettings zac;
  private final Bundle zad;
  private final Integer zae;
  
  public SignInClientImpl(Context paramContext, Looper paramLooper, boolean paramBoolean, ClientSettings paramClientSettings, Bundle paramBundle, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 44, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zac = paramClientSettings;
    this.zad = paramBundle;
    this.zae = paramClientSettings.zab();
  }
  
  public static Bundle createBundleFromClientSettings(ClientSettings paramClientSettings)
  {
    paramClientSettings.zaa();
    Integer localInteger = paramClientSettings.zab();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", paramClientSettings.getAccount());
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
    localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
    localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
    localBundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
    return localBundle;
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    String str = this.zac.getRealClientPackageName();
    if (!getContext().getPackageName().equals(str)) {
      this.zad.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zac.getRealClientPackageName());
    }
    return this.zad;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  public final boolean requiresSignIn()
  {
    return this.zab;
  }
  
  public final void zaa()
  {
    try
    {
      ((zaf)getService()).zae(((Integer)Preconditions.checkNotNull(this.zae)).intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
    }
  }
  
  public final void zab()
  {
    connect(new BaseGmsClient.LegacyClientCallbackAdapter(this));
  }
  
  public final void zac(IAccountAccessor paramIAccountAccessor, boolean paramBoolean)
  {
    try
    {
      ((zaf)getService()).zaf(paramIAccountAccessor, ((Integer)Preconditions.checkNotNull(this.zae)).intValue(), paramBoolean);
      return;
    }
    catch (RemoteException paramIAccountAccessor)
    {
      Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
    }
  }
  
  public final void zad(zae paramzae)
  {
    Preconditions.checkNotNull(paramzae, "Expecting a valid ISignInCallbacks");
    try
    {
      localObject2 = this.zac.getAccountOrDefault();
      if ("<<default account>>".equals(((Account)localObject2).name)) {
        localObject1 = Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount();
      } else {
        localObject1 = null;
      }
      localObject3 = new com/google/android/gms/common/internal/zat;
      ((zat)localObject3).<init>((Account)localObject2, ((Integer)Preconditions.checkNotNull(this.zae)).intValue(), (GoogleSignInAccount)localObject1);
      Object localObject1 = (zaf)getService();
      localObject2 = new com/google/android/gms/signin/internal/zai;
      ((zai)localObject2).<init>(1, (zat)localObject3);
      ((zaf)localObject1).zag((zai)localObject2, paramzae);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2;
      Object localObject3;
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try
      {
        localObject3 = new com/google/android/gms/signin/internal/zak;
        localObject2 = new com/google/android/gms/common/ConnectionResult;
        ((ConnectionResult)localObject2).<init>(8, null);
        ((zak)localObject3).<init>(1, (ConnectionResult)localObject2, null);
        paramzae.zab((zak)localObject3);
        return;
      }
      catch (RemoteException paramzae)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\internal\SignInClientImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */