package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api<O extends ApiOptions>
{
  private final AbstractClientBuilder<?, O> zaa;
  private final ClientKey<?> zab;
  private final String zac;
  
  public <C extends Client> Api(String paramString, AbstractClientBuilder<C, O> paramAbstractClientBuilder, ClientKey<C> paramClientKey)
  {
    Preconditions.checkNotNull(paramAbstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
    Preconditions.checkNotNull(paramClientKey, "Cannot construct an Api with a null ClientKey");
    this.zac = paramString;
    this.zaa = paramAbstractClientBuilder;
    this.zab = paramClientKey;
  }
  
  public final AbstractClientBuilder<?, O> zaa()
  {
    return this.zaa;
  }
  
  public final AnyClientKey<?> zab()
  {
    return this.zab;
  }
  
  public final BaseClientBuilder<?, O> zac()
  {
    return this.zaa;
  }
  
  public final String zad()
  {
    return this.zac;
  }
  
  public static abstract class AbstractClientBuilder<T extends Api.Client, O>
    extends Api.BaseClientBuilder<T, O>
  {
    @Deprecated
    public T buildClient(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, O paramO, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      return buildClient(paramContext, paramLooper, paramClientSettings, paramO, paramConnectionCallbacks, paramOnConnectionFailedListener);
    }
    
    public T buildClient(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, O paramO, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      throw new UnsupportedOperationException("buildClient must be implemented");
    }
  }
  
  public static abstract interface AnyClient {}
  
  public static class AnyClientKey<C extends Api.AnyClient> {}
  
  public static abstract interface ApiOptions
  {
    public static final NoOptions NO_OPTIONS = new NoOptions(null);
    
    public static abstract interface HasAccountOptions
      extends Api.ApiOptions.HasOptions, Api.ApiOptions.NotRequiredOptions
    {
      public abstract Account getAccount();
    }
    
    public static abstract interface HasGoogleSignInAccountOptions
      extends Api.ApiOptions.HasOptions
    {
      public abstract GoogleSignInAccount getGoogleSignInAccount();
    }
    
    public static abstract interface HasOptions
      extends Api.ApiOptions
    {}
    
    public static final class NoOptions
      implements Api.ApiOptions.NotRequiredOptions
    {}
    
    public static abstract interface NotRequiredOptions
      extends Api.ApiOptions
    {}
    
    public static abstract interface Optional
      extends Api.ApiOptions.HasOptions, Api.ApiOptions.NotRequiredOptions
    {}
  }
  
  public static abstract class BaseClientBuilder<T extends Api.AnyClient, O>
  {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;
    
    public List<Scope> getImpliedScopes(O paramO)
    {
      return Collections.emptyList();
    }
    
    public int getPriority()
    {
      return Integer.MAX_VALUE;
    }
  }
  
  public static abstract interface Client
    extends Api.AnyClient
  {
    public abstract void connect(BaseGmsClient.ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks);
    
    public abstract void disconnect();
    
    public abstract void disconnect(String paramString);
    
    public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
    
    public abstract Feature[] getAvailableFeatures();
    
    public abstract String getEndpointPackageName();
    
    public abstract String getLastDisconnectMessage();
    
    public abstract int getMinApkVersion();
    
    public abstract void getRemoteService(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet);
    
    public abstract Feature[] getRequiredFeatures();
    
    public abstract Set<Scope> getScopesForConnectionlessNonSignIn();
    
    public abstract IBinder getServiceBrokerBinder();
    
    public abstract Intent getSignInIntent();
    
    public abstract boolean isConnected();
    
    public abstract boolean isConnecting();
    
    public abstract void onUserSignOut(BaseGmsClient.SignOutCallbacks paramSignOutCallbacks);
    
    public abstract boolean providesSignIn();
    
    public abstract boolean requiresAccount();
    
    public abstract boolean requiresGooglePlayServices();
    
    public abstract boolean requiresSignIn();
  }
  
  public static final class ClientKey<C extends Api.Client>
    extends Api.AnyClientKey<C>
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\Api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */