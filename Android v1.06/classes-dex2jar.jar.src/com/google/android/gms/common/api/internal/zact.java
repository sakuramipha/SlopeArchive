package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

public final class zact
  extends zac
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private static final Api.AbstractClientBuilder<? extends zae, SignInOptions> zaa = zad.zac;
  private final Context zab;
  private final Handler zac;
  private final Api.AbstractClientBuilder<? extends zae, SignInOptions> zad;
  private final Set<Scope> zae;
  private final ClientSettings zaf;
  private zae zag;
  private zacs zah;
  
  public zact(Context paramContext, Handler paramHandler, ClientSettings paramClientSettings)
  {
    this.zab = paramContext;
    this.zac = paramHandler;
    this.zaf = ((ClientSettings)Preconditions.checkNotNull(paramClientSettings, "ClientSettings must not be null"));
    this.zae = paramClientSettings.getRequiredScopes();
    this.zad = localAbstractClientBuilder;
  }
  
  public final void onConnected(Bundle paramBundle)
  {
    this.zag.zad(this);
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.zah.zae(paramConnectionResult);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.zag.disconnect();
  }
  
  public final void zab(zak paramzak)
  {
    this.zac.post(new zacr(this, paramzak));
  }
  
  public final void zae(zacs paramzacs)
  {
    Object localObject = this.zag;
    if (localObject != null) {
      ((zae)localObject).disconnect();
    }
    this.zaf.zae(Integer.valueOf(System.identityHashCode(this)));
    Api.AbstractClientBuilder localAbstractClientBuilder = this.zad;
    Context localContext = this.zab;
    Looper localLooper = this.zac.getLooper();
    localObject = this.zaf;
    this.zag = localAbstractClientBuilder.buildClient(localContext, localLooper, (ClientSettings)localObject, ((ClientSettings)localObject).zaa(), this, this);
    this.zah = paramzacs;
    paramzacs = this.zae;
    if ((paramzacs != null) && (!paramzacs.isEmpty()))
    {
      this.zag.zab();
      return;
    }
    this.zac.post(new zacq(this));
  }
  
  public final void zaf()
  {
    zae localzae = this.zag;
    if (localzae != null) {
      localzae.disconnect();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */