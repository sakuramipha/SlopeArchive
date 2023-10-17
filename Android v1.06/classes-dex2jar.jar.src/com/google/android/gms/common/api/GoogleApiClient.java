package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
public abstract class GoogleApiClient
{
  public static final String DEFAULT_ACCOUNT = "<<default account>>";
  public static final int SIGN_IN_MODE_OPTIONAL = 2;
  public static final int SIGN_IN_MODE_REQUIRED = 1;
  private static final Set<GoogleApiClient> zaa = Collections.newSetFromMap(new WeakHashMap());
  
  public static void dumpAll(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    synchronized (zaa)
    {
      String str = String.valueOf(paramString).concat("  ");
      Iterator localIterator = ???.iterator();
      for (int i = 0; localIterator.hasNext(); i++)
      {
        GoogleApiClient localGoogleApiClient = (GoogleApiClient)localIterator.next();
        paramPrintWriter.append(paramString).append("GoogleApiClient#").println(i);
        localGoogleApiClient.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      return;
    }
  }
  
  public static Set<GoogleApiClient> getAllClients()
  {
    synchronized (zaa)
    {
      return (Set<GoogleApiClient>)???;
    }
  }
  
  public abstract ConnectionResult blockingConnect();
  
  public abstract ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit);
  
  public abstract PendingResult<Status> clearDefaultAccountAndReconnect();
  
  public abstract void connect();
  
  public void connect(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void disconnect();
  
  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public <C extends Api.Client> C getClient(Api.AnyClientKey<C> paramAnyClientKey)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract ConnectionResult getConnectionResult(Api<?> paramApi);
  
  public Context getContext()
  {
    throw new UnsupportedOperationException();
  }
  
  public Looper getLooper()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean hasApi(Api<?> paramApi)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean hasConnectedApi(Api<?> paramApi);
  
  public abstract boolean isConnected();
  
  public abstract boolean isConnecting();
  
  public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public void maybeSignOut()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void reconnect();
  
  public abstract void registerConnectionCallbacks(ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract void registerConnectionFailedListener(OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public <L> ListenerHolder<L> registerListener(L paramL)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void stopAutoManage(FragmentActivity paramFragmentActivity);
  
  public abstract void unregisterConnectionCallbacks(ConnectionCallbacks paramConnectionCallbacks);
  
  public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public void zao(zada paramzada)
  {
    throw new UnsupportedOperationException();
  }
  
  public void zap(zada paramzada)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public static final class Builder
  {
    private Account zaa;
    private final Set<Scope> zab = new HashSet();
    private final Set<Scope> zac = new HashSet();
    private int zad;
    private View zae;
    private String zaf;
    private String zag;
    private final Map<Api<?>, zab> zah = new ArrayMap();
    private final Context zai;
    private final Map<Api<?>, Api.ApiOptions> zaj = new ArrayMap();
    private LifecycleActivity zak;
    private int zal = -1;
    private GoogleApiClient.OnConnectionFailedListener zam;
    private Looper zan;
    private GoogleApiAvailability zao = GoogleApiAvailability.getInstance();
    private Api.AbstractClientBuilder<? extends zae, SignInOptions> zap = zad.zac;
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> zaq = new ArrayList();
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> zar = new ArrayList();
    
    public Builder(Context paramContext)
    {
      this.zai = paramContext;
      this.zan = paramContext.getMainLooper();
      this.zaf = paramContext.getPackageName();
      this.zag = paramContext.getClass().getName();
    }
    
    public Builder(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this(paramContext);
      Preconditions.checkNotNull(paramConnectionCallbacks, "Must provide a connected listener");
      this.zaq.add(paramConnectionCallbacks);
      Preconditions.checkNotNull(paramOnConnectionFailedListener, "Must provide a connection failed listener");
      this.zar.add(paramOnConnectionFailedListener);
    }
    
    private final <O extends Api.ApiOptions> void zab(Api<O> paramApi, O paramO, Scope... paramVarArgs)
    {
      paramO = new HashSet(((Api.BaseClientBuilder)Preconditions.checkNotNull(paramApi.zac(), "Base client builder must not be null")).getImpliedScopes(paramO));
      int j = paramVarArgs.length;
      for (int i = 0; i < j; i++) {
        paramO.add(paramVarArgs[i]);
      }
      this.zah.put(paramApi, new zab(paramO));
    }
    
    public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> paramApi)
    {
      Preconditions.checkNotNull(paramApi, "Api must not be null");
      this.zaj.put(paramApi, null);
      paramApi = ((Api.BaseClientBuilder)Preconditions.checkNotNull(paramApi.zac(), "Base client builder must not be null")).getImpliedScopes(null);
      this.zac.addAll(paramApi);
      this.zab.addAll(paramApi);
      return this;
    }
    
    public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> paramApi, O paramO)
    {
      Preconditions.checkNotNull(paramApi, "Api must not be null");
      Preconditions.checkNotNull(paramO, "Null options are not permitted for this Api");
      this.zaj.put(paramApi, paramO);
      paramApi = ((Api.BaseClientBuilder)Preconditions.checkNotNull(paramApi.zac(), "Base client builder must not be null")).getImpliedScopes(paramO);
      this.zac.addAll(paramApi);
      this.zab.addAll(paramApi);
      return this;
    }
    
    public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(Api<O> paramApi, O paramO, Scope... paramVarArgs)
    {
      Preconditions.checkNotNull(paramApi, "Api must not be null");
      Preconditions.checkNotNull(paramO, "Null options are not permitted for this Api");
      this.zaj.put(paramApi, paramO);
      zab(paramApi, paramO, paramVarArgs);
      return this;
    }
    
    public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(Api<? extends Api.ApiOptions.NotRequiredOptions> paramApi, Scope... paramVarArgs)
    {
      Preconditions.checkNotNull(paramApi, "Api must not be null");
      this.zaj.put(paramApi, null);
      zab(paramApi, null, paramVarArgs);
      return this;
    }
    
    public Builder addConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
    {
      Preconditions.checkNotNull(paramConnectionCallbacks, "Listener must not be null");
      this.zaq.add(paramConnectionCallbacks);
      return this;
    }
    
    public Builder addOnConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      Preconditions.checkNotNull(paramOnConnectionFailedListener, "Listener must not be null");
      this.zar.add(paramOnConnectionFailedListener);
      return this;
    }
    
    public Builder addScope(Scope paramScope)
    {
      Preconditions.checkNotNull(paramScope, "Scope must not be null");
      this.zab.add(paramScope);
      return this;
    }
    
    public GoogleApiClient build()
    {
      Preconditions.checkArgument(this.zaj.isEmpty() ^ true, "must call addApi() to add at least one API");
      Object localObject4 = zaa();
      Map localMap = ((ClientSettings)localObject4).zad();
      ArrayMap localArrayMap1 = new ArrayMap();
      ArrayMap localArrayMap2 = new ArrayMap();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.zaj.keySet().iterator();
      ??? = null;
      int j = 0;
      boolean bool;
      while (localIterator.hasNext())
      {
        localObject2 = (Api)localIterator.next();
        Object localObject5 = this.zaj.get(localObject2);
        if (localMap.get(localObject2) != null) {
          bool = true;
        } else {
          bool = false;
        }
        localArrayMap1.put(localObject2, Boolean.valueOf(bool));
        Object localObject6 = new zat((Api)localObject2, bool);
        localArrayList.add(localObject6);
        Api.AbstractClientBuilder localAbstractClientBuilder = (Api.AbstractClientBuilder)Preconditions.checkNotNull(((Api)localObject2).zaa());
        localObject6 = localAbstractClientBuilder.buildClient(this.zai, this.zan, (ClientSettings)localObject4, localObject5, (GoogleApiClient.ConnectionCallbacks)localObject6, (GoogleApiClient.OnConnectionFailedListener)localObject6);
        localArrayMap2.put(((Api)localObject2).zab(), localObject6);
        i = j;
        if (localAbstractClientBuilder.getPriority() == 1) {
          if (localObject5 != null) {
            i = 1;
          } else {
            i = 0;
          }
        }
        j = i;
        if (((Api.Client)localObject6).providesSignIn()) {
          if (??? == null)
          {
            ??? = localObject2;
            j = i;
          }
          else
          {
            localObject2 = ((Api)localObject2).zad();
            localObject4 = ((Api)???).zad();
            ??? = new StringBuilder(String.valueOf(localObject2).length() + 21 + String.valueOf(localObject4).length());
            ((StringBuilder)???).append((String)localObject2);
            ((StringBuilder)???).append(" cannot be used with ");
            ((StringBuilder)???).append((String)localObject4);
            throw new IllegalStateException(((StringBuilder)???).toString());
          }
        }
      }
      if (??? != null) {
        if (j == 0)
        {
          if (this.zaa == null) {
            bool = true;
          } else {
            bool = false;
          }
          Preconditions.checkState(bool, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] { ((Api)???).zad() });
          Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] { ((Api)???).zad() });
        }
        else
        {
          localObject2 = ((Api)???).zad();
          ??? = new StringBuilder(String.valueOf(localObject2).length() + 82);
          ((StringBuilder)???).append("With using ");
          ((StringBuilder)???).append((String)localObject2);
          ((StringBuilder)???).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
          throw new IllegalStateException(((StringBuilder)???).toString());
        }
      }
      int i = zabe.zad(localArrayMap2.values(), true);
      Object localObject2 = new zabe(this.zai, new ReentrantLock(), this.zan, (ClientSettings)localObject4, this.zao, this.zap, localArrayMap1, this.zaq, this.zar, localArrayMap2, this.zal, i, localArrayList);
      synchronized (GoogleApiClient.zaq())
      {
        GoogleApiClient.zaq().add(localObject2);
        if (this.zal >= 0) {
          zak.zaa(this.zak).zad(this.zal, (GoogleApiClient)localObject2, this.zam);
        }
        return (GoogleApiClient)localObject2;
      }
    }
    
    public Builder enableAutoManage(FragmentActivity paramFragmentActivity, int paramInt, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      paramFragmentActivity = new LifecycleActivity(paramFragmentActivity);
      boolean bool;
      if (paramInt >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "clientId must be non-negative");
      this.zal = paramInt;
      this.zam = paramOnConnectionFailedListener;
      this.zak = paramFragmentActivity;
      return this;
    }
    
    public Builder enableAutoManage(FragmentActivity paramFragmentActivity, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      enableAutoManage(paramFragmentActivity, 0, paramOnConnectionFailedListener);
      return this;
    }
    
    public Builder setAccountName(String paramString)
    {
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = new Account(paramString, "com.google");
      }
      this.zaa = paramString;
      return this;
    }
    
    public Builder setGravityForPopups(int paramInt)
    {
      this.zad = paramInt;
      return this;
    }
    
    public Builder setHandler(Handler paramHandler)
    {
      Preconditions.checkNotNull(paramHandler, "Handler must not be null");
      this.zan = paramHandler.getLooper();
      return this;
    }
    
    public Builder setViewForPopups(View paramView)
    {
      Preconditions.checkNotNull(paramView, "View must not be null");
      this.zae = paramView;
      return this;
    }
    
    public Builder useDefaultAccount()
    {
      setAccountName("<<default account>>");
      return this;
    }
    
    public final ClientSettings zaa()
    {
      SignInOptions localSignInOptions = SignInOptions.zaa;
      if (this.zaj.containsKey(zad.zag)) {
        localSignInOptions = (SignInOptions)this.zaj.get(zad.zag);
      }
      return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, localSignInOptions, false);
    }
  }
  
  @Deprecated
  public static abstract interface ConnectionCallbacks
    extends ConnectionCallbacks
  {
    public static final int CAUSE_NETWORK_LOST = 2;
    public static final int CAUSE_SERVICE_DISCONNECTED = 1;
  }
  
  @Deprecated
  public static abstract interface OnConnectionFailedListener
    extends OnConnectionFailedListener
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\GoogleApiClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */