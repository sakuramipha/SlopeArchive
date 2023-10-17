package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.ClientSettings.Builder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public abstract class GoogleApi<O extends Api.ApiOptions>
  implements HasApiKey<O>
{
  protected final GoogleApiManager zaa;
  private final Context zab;
  private final String zac;
  private final Api<O> zad;
  private final O zae;
  private final ApiKey<O> zaf;
  private final Looper zag;
  private final int zah;
  @NotOnlyInitialized
  private final GoogleApiClient zai;
  private final StatusExceptionMapper zaj;
  
  public GoogleApi(Activity paramActivity, Api<O> paramApi, O paramO, Settings paramSettings)
  {
    this(paramActivity, paramActivity, paramApi, paramO, paramSettings);
  }
  
  @Deprecated
  public GoogleApi(Activity paramActivity, Api<O> paramApi, O paramO, StatusExceptionMapper paramStatusExceptionMapper)
  {
    this(paramActivity, paramApi, paramO, localBuilder.build());
  }
  
  private GoogleApi(Context paramContext, Activity paramActivity, Api<O> paramApi, O paramO, Settings paramSettings)
  {
    Preconditions.checkNotNull(paramContext, "Null context is not permitted.");
    Preconditions.checkNotNull(paramApi, "Api must not be null.");
    Preconditions.checkNotNull(paramSettings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    this.zab = paramContext.getApplicationContext();
    boolean bool = PlatformVersion.isAtLeastR();
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (bool) {
      try
      {
        localObject1 = (String)Context.class.getMethod("getAttributionTag", new Class[0]).invoke(paramContext, new Object[0]);
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramContext)
      {
        localObject1 = localObject2;
      }
    }
    this.zac = ((String)localObject1);
    this.zad = paramApi;
    this.zae = paramO;
    this.zag = paramSettings.zab;
    paramApi = ApiKey.zaa(paramApi, paramO, (String)localObject1);
    this.zaf = paramApi;
    this.zai = new zabv(this);
    paramContext = GoogleApiManager.zam(this.zab);
    this.zaa = paramContext;
    this.zah = paramContext.zaa();
    this.zaj = paramSettings.zaa;
    if ((paramActivity != null) && (!(paramActivity instanceof GoogleApiActivity)) && (Looper.myLooper() == Looper.getMainLooper())) {
      zaae.zad(paramActivity, paramContext, paramApi);
    }
    paramContext.zaB(this);
  }
  
  @Deprecated
  public GoogleApi(Context paramContext, Api<O> paramApi, O paramO, Looper paramLooper, StatusExceptionMapper paramStatusExceptionMapper)
  {
    this(paramContext, paramApi, paramO, localBuilder.build());
  }
  
  public GoogleApi(Context paramContext, Api<O> paramApi, O paramO, Settings paramSettings)
  {
    this(paramContext, null, paramApi, paramO, paramSettings);
  }
  
  @Deprecated
  public GoogleApi(Context paramContext, Api<O> paramApi, O paramO, StatusExceptionMapper paramStatusExceptionMapper)
  {
    this(paramContext, paramApi, paramO, localBuilder.build());
  }
  
  private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zad(int paramInt, T paramT)
  {
    paramT.zak();
    this.zaa.zaw(this, paramInt, paramT);
    return paramT;
  }
  
  private final <TResult, A extends Api.AnyClient> Task<TResult> zae(int paramInt, TaskApiCall<A, TResult> paramTaskApiCall)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    this.zaa.zax(this, paramInt, paramTaskApiCall, localTaskCompletionSource, this.zaj);
    return localTaskCompletionSource.getTask();
  }
  
  public GoogleApiClient asGoogleApiClient()
  {
    return this.zai;
  }
  
  protected ClientSettings.Builder createClientSettingsBuilder()
  {
    ClientSettings.Builder localBuilder = new ClientSettings.Builder();
    Object localObject = this.zae;
    if ((localObject instanceof Api.ApiOptions.HasGoogleSignInAccountOptions))
    {
      localObject = ((Api.ApiOptions.HasGoogleSignInAccountOptions)localObject).getGoogleSignInAccount();
      if (localObject != null)
      {
        localObject = ((GoogleSignInAccount)localObject).getAccount();
        break label69;
      }
    }
    localObject = this.zae;
    if ((localObject instanceof Api.ApiOptions.HasAccountOptions)) {
      localObject = ((Api.ApiOptions.HasAccountOptions)localObject).getAccount();
    } else {
      localObject = null;
    }
    label69:
    localBuilder.zab((Account)localObject);
    localObject = this.zae;
    if ((localObject instanceof Api.ApiOptions.HasGoogleSignInAccountOptions))
    {
      localObject = ((Api.ApiOptions.HasGoogleSignInAccountOptions)localObject).getGoogleSignInAccount();
      if (localObject == null) {
        localObject = Collections.emptySet();
      } else {
        localObject = ((GoogleSignInAccount)localObject).getRequestedScopes();
      }
    }
    else
    {
      localObject = Collections.emptySet();
    }
    localBuilder.zaa((Collection)localObject);
    localBuilder.zac(this.zab.getClass().getName());
    localBuilder.setRealClientPackageName(this.zab.getPackageName());
    return localBuilder;
  }
  
  protected Task<Boolean> disconnectService()
  {
    return this.zaa.zap(this);
  }
  
  public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T paramT)
  {
    zad(2, paramT);
    return paramT;
  }
  
  public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> paramTaskApiCall)
  {
    return zae(2, paramTaskApiCall);
  }
  
  public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T paramT)
  {
    zad(0, paramT);
    return paramT;
  }
  
  public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> paramTaskApiCall)
  {
    return zae(0, paramTaskApiCall);
  }
  
  @Deprecated
  public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T paramT, U paramU)
  {
    Preconditions.checkNotNull(paramT);
    Preconditions.checkNotNull(paramU);
    Preconditions.checkNotNull(paramT.getListenerKey(), "Listener has already been released.");
    Preconditions.checkNotNull(paramU.getListenerKey(), "Listener has already been released.");
    Preconditions.checkArgument(Objects.equal(paramT.getListenerKey(), paramU.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
    return this.zaa.zaq(this, paramT, paramU, zad.zaa);
  }
  
  public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(RegistrationMethods<A, ?> paramRegistrationMethods)
  {
    Preconditions.checkNotNull(paramRegistrationMethods);
    Preconditions.checkNotNull(paramRegistrationMethods.register.getListenerKey(), "Listener has already been released.");
    Preconditions.checkNotNull(paramRegistrationMethods.zaa.getListenerKey(), "Listener has already been released.");
    return this.zaa.zaq(this, paramRegistrationMethods.register, paramRegistrationMethods.zaa, paramRegistrationMethods.zab);
  }
  
  public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> paramListenerKey)
  {
    return doUnregisterEventListener(paramListenerKey, 0);
  }
  
  public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> paramListenerKey, int paramInt)
  {
    Preconditions.checkNotNull(paramListenerKey, "Listener key cannot be null.");
    return this.zaa.zar(this, paramListenerKey, paramInt);
  }
  
  public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T paramT)
  {
    zad(1, paramT);
    return paramT;
  }
  
  public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> paramTaskApiCall)
  {
    return zae(1, paramTaskApiCall);
  }
  
  public final ApiKey<O> getApiKey()
  {
    return this.zaf;
  }
  
  public O getApiOptions()
  {
    return this.zae;
  }
  
  public Context getApplicationContext()
  {
    return this.zab;
  }
  
  protected String getContextAttributionTag()
  {
    return this.zac;
  }
  
  @Deprecated
  protected String getContextFeatureId()
  {
    return this.zac;
  }
  
  public Looper getLooper()
  {
    return this.zag;
  }
  
  public <L> ListenerHolder<L> registerListener(L paramL, String paramString)
  {
    return ListenerHolders.createListenerHolder(paramL, this.zag, paramString);
  }
  
  public final int zaa()
  {
    return this.zah;
  }
  
  public final Api.Client zab(Looper paramLooper, zabq<O> paramzabq)
  {
    ClientSettings localClientSettings = createClientSettingsBuilder().build();
    paramzabq = ((Api.AbstractClientBuilder)Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, paramLooper, localClientSettings, this.zae, paramzabq, paramzabq);
    paramLooper = getContextAttributionTag();
    if ((paramLooper != null) && ((paramzabq instanceof BaseGmsClient))) {
      ((BaseGmsClient)paramzabq).setAttributionTag(paramLooper);
    }
    if ((paramLooper != null) && ((paramzabq instanceof NonGmsServiceBrokerClient))) {
      ((NonGmsServiceBrokerClient)paramzabq).zac(paramLooper);
    }
    return paramzabq;
  }
  
  public final zact zac(Context paramContext, Handler paramHandler)
  {
    return new zact(paramContext, paramHandler, createClientSettingsBuilder().build());
  }
  
  public static class Settings
  {
    public static final Settings DEFAULT_SETTINGS = new Builder().build();
    public final StatusExceptionMapper zaa;
    public final Looper zab;
    
    private Settings(StatusExceptionMapper paramStatusExceptionMapper, Account paramAccount, Looper paramLooper)
    {
      this.zaa = paramStatusExceptionMapper;
      this.zab = paramLooper;
    }
    
    public static class Builder
    {
      private StatusExceptionMapper zaa;
      private Looper zab;
      
      public GoogleApi.Settings build()
      {
        if (this.zaa == null) {
          this.zaa = new ApiExceptionMapper();
        }
        if (this.zab == null) {
          this.zab = Looper.getMainLooper();
        }
        return new GoogleApi.Settings(this.zaa, null, this.zab, null);
      }
      
      public Builder setLooper(Looper paramLooper)
      {
        Preconditions.checkNotNull(paramLooper, "Looper must not be null.");
        this.zab = paramLooper;
        return this;
      }
      
      public Builder setMapper(StatusExceptionMapper paramStatusExceptionMapper)
      {
        Preconditions.checkNotNull(paramStatusExceptionMapper, "StatusExceptionMapper must not be null.");
        this.zaa = paramStatusExceptionMapper;
        return this;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\GoogleApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */