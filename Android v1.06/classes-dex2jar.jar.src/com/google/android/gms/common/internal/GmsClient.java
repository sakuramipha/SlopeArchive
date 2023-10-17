package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class GmsClient<T extends IInterface>
  extends BaseGmsClient<T>
  implements Api.Client, zaj
{
  private static volatile Executor zaa;
  private final ClientSettings zab;
  private final Set<Scope> zac;
  private final Account zad;
  
  protected GmsClient(Context paramContext, Handler paramHandler, int paramInt, ClientSettings paramClientSettings)
  {
    super(paramContext, paramHandler, GmsClientSupervisor.getInstance(paramContext), GoogleApiAvailability.getInstance(), paramInt, null, null);
    this.zab = ((ClientSettings)Preconditions.checkNotNull(paramClientSettings));
    this.zad = paramClientSettings.getAccount();
    this.zac = zaa(paramClientSettings.getAllRequestedScopes());
  }
  
  protected GmsClient(Context paramContext, Looper paramLooper, int paramInt, ClientSettings paramClientSettings)
  {
    this(paramContext, paramLooper, GmsClientSupervisor.getInstance(paramContext), GoogleApiAvailability.getInstance(), paramInt, paramClientSettings, null, null);
  }
  
  @Deprecated
  protected GmsClient(Context paramContext, Looper paramLooper, int paramInt, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, paramInt, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  protected GmsClient(Context paramContext, Looper paramLooper, int paramInt, ClientSettings paramClientSettings, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, GmsClientSupervisor.getInstance(paramContext), GoogleApiAvailability.getInstance(), paramInt, paramClientSettings, (ConnectionCallbacks)Preconditions.checkNotNull(paramConnectionCallbacks), (OnConnectionFailedListener)Preconditions.checkNotNull(paramOnConnectionFailedListener));
  }
  
  protected GmsClient(Context paramContext, Looper paramLooper, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailability paramGoogleApiAvailability, int paramInt, ClientSettings paramClientSettings, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramGmsClientSupervisor, paramGoogleApiAvailability, paramInt, paramConnectionCallbacks, paramOnConnectionFailedListener, paramClientSettings.zac());
    this.zab = paramClientSettings;
    this.zad = paramClientSettings.getAccount();
    this.zac = zaa(paramClientSettings.getAllRequestedScopes());
  }
  
  private final Set<Scope> zaa(Set<Scope> paramSet)
  {
    Set localSet = validateScopes(paramSet);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext()) {
      if (!paramSet.contains((Scope)localIterator.next())) {
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
      }
    }
    return localSet;
  }
  
  public final Account getAccount()
  {
    return this.zad;
  }
  
  protected final Executor getBindServiceExecutor()
  {
    return null;
  }
  
  protected final ClientSettings getClientSettings()
  {
    return this.zab;
  }
  
  public Feature[] getRequiredFeatures()
  {
    return new Feature[0];
  }
  
  protected final Set<Scope> getScopes()
  {
    return this.zac;
  }
  
  public Set<Scope> getScopesForConnectionlessNonSignIn()
  {
    Set localSet;
    if (requiresSignIn()) {
      localSet = this.zac;
    } else {
      localSet = Collections.emptySet();
    }
    return localSet;
  }
  
  protected Set<Scope> validateScopes(Set<Scope> paramSet)
  {
    return paramSet;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\GmsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */