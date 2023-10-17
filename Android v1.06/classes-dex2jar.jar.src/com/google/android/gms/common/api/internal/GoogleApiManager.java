package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public class GoogleApiManager
  implements Handler.Callback
{
  public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
  private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
  private static final Object zac = new Object();
  private static GoogleApiManager zad;
  private long zae = 5000L;
  private long zaf = 120000L;
  private long zag = 10000L;
  private boolean zah = false;
  private TelemetryData zai;
  private TelemetryLoggingClient zaj;
  private final Context zak;
  private final GoogleApiAvailability zal;
  private final com.google.android.gms.common.internal.zal zam;
  private final AtomicInteger zan = new AtomicInteger(1);
  private final AtomicInteger zao = new AtomicInteger(0);
  private final Map<ApiKey<?>, zabq<?>> zap = new ConcurrentHashMap(5, 0.75F, 1);
  private zaae zaq = null;
  private final Set<ApiKey<?>> zar = new ArraySet();
  private final Set<ApiKey<?>> zas = new ArraySet();
  @NotOnlyInitialized
  private final Handler zat;
  private volatile boolean zau = true;
  
  private GoogleApiManager(Context paramContext, Looper paramLooper, GoogleApiAvailability paramGoogleApiAvailability)
  {
    this.zak = paramContext;
    paramLooper = new zaq(paramLooper, this);
    this.zat = paramLooper;
    this.zal = paramGoogleApiAvailability;
    this.zam = new com.google.android.gms.common.internal.zal(paramGoogleApiAvailability);
    if (DeviceProperties.isAuto(paramContext)) {
      this.zau = false;
    }
    paramLooper.sendMessage(paramLooper.obtainMessage(6));
  }
  
  public static void reportSignOut()
  {
    synchronized (zac)
    {
      Object localObject2 = zad;
      if (localObject2 != null)
      {
        ((GoogleApiManager)localObject2).zao.incrementAndGet();
        localObject2 = ((GoogleApiManager)localObject2).zat;
        ((Handler)localObject2).sendMessageAtFrontOfQueue(((Handler)localObject2).obtainMessage(10));
      }
      return;
    }
  }
  
  private static Status zaH(ApiKey<?> paramApiKey, ConnectionResult paramConnectionResult)
  {
    String str = paramApiKey.zab();
    paramApiKey = String.valueOf(paramConnectionResult);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(paramApiKey).length());
    localStringBuilder.append("API: ");
    localStringBuilder.append(str);
    localStringBuilder.append(" is not available on this device. Connection failed with: ");
    localStringBuilder.append(paramApiKey);
    return new Status(paramConnectionResult, localStringBuilder.toString());
  }
  
  private final zabq<?> zaI(GoogleApi<?> paramGoogleApi)
  {
    ApiKey localApiKey = paramGoogleApi.getApiKey();
    zabq localzabq2 = (zabq)this.zap.get(localApiKey);
    zabq localzabq1 = localzabq2;
    if (localzabq2 == null)
    {
      localzabq1 = new zabq(this, paramGoogleApi);
      this.zap.put(localApiKey, localzabq1);
    }
    if (localzabq1.zaz()) {
      this.zas.add(localApiKey);
    }
    localzabq1.zao();
    return localzabq1;
  }
  
  private final TelemetryLoggingClient zaJ()
  {
    if (this.zaj == null) {
      this.zaj = TelemetryLogging.getClient(this.zak);
    }
    return this.zaj;
  }
  
  private final void zaK()
  {
    TelemetryData localTelemetryData = this.zai;
    if (localTelemetryData != null)
    {
      if ((localTelemetryData.zaa() > 0) || (zaF())) {
        zaJ().log(localTelemetryData);
      }
      this.zai = null;
    }
  }
  
  private final <T> void zaL(TaskCompletionSource<T> paramTaskCompletionSource, int paramInt, GoogleApi paramGoogleApi)
  {
    if (paramInt != 0)
    {
      paramGoogleApi = zacd.zaa(this, paramInt, paramGoogleApi.getApiKey());
      if (paramGoogleApi != null)
      {
        paramTaskCompletionSource = paramTaskCompletionSource.getTask();
        Handler localHandler = this.zat;
        localHandler.getClass();
        paramTaskCompletionSource.addOnCompleteListener(new zabk(localHandler), paramGoogleApi);
      }
    }
  }
  
  public static GoogleApiManager zal()
  {
    synchronized (zac)
    {
      Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
      GoogleApiManager localGoogleApiManager = zad;
      return localGoogleApiManager;
    }
  }
  
  public static GoogleApiManager zam(Context paramContext)
  {
    synchronized (zac)
    {
      if (zad == null)
      {
        Looper localLooper = GmsClientSupervisor.getOrStartHandlerThread().getLooper();
        GoogleApiManager localGoogleApiManager = new com/google/android/gms/common/api/internal/GoogleApiManager;
        localGoogleApiManager.<init>(paramContext.getApplicationContext(), localLooper, GoogleApiAvailability.getInstance());
        zad = localGoogleApiManager;
      }
      paramContext = zad;
      return paramContext;
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    long l = 300000L;
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    default: 
      i = paramMessage.what;
      paramMessage = new StringBuilder(31);
      paramMessage.append("Unknown message id: ");
      paramMessage.append(i);
      Log.w("GoogleApiManager", paramMessage.toString());
      return false;
    case 19: 
      this.zah = false;
      break;
    case 18: 
      paramMessage = (zace)paramMessage.obj;
      if (paramMessage.zac == 0L)
      {
        paramMessage = new TelemetryData(paramMessage.zab, Arrays.asList(new MethodInvocation[] { paramMessage.zaa }));
        zaJ().log(paramMessage);
      }
      else
      {
        localObject2 = this.zai;
        if (localObject2 != null)
        {
          localObject1 = ((TelemetryData)localObject2).zab();
          if ((((TelemetryData)localObject2).zaa() == paramMessage.zab) && ((localObject1 == null) || (((List)localObject1).size() < paramMessage.zad)))
          {
            this.zai.zac(paramMessage.zaa);
          }
          else
          {
            this.zat.removeMessages(17);
            zaK();
          }
        }
        if (this.zai == null)
        {
          localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(paramMessage.zaa);
          this.zai = new TelemetryData(paramMessage.zab, (List)localObject1);
          localObject1 = this.zat;
          ((Handler)localObject1).sendMessageDelayed(((Handler)localObject1).obtainMessage(17), paramMessage.zac);
        }
      }
      break;
    case 17: 
      zaK();
      break;
    case 16: 
      paramMessage = (zabs)paramMessage.obj;
      if (this.zap.containsKey(zabs.zab(paramMessage))) {
        zabq.zam((zabq)this.zap.get(zabs.zab(paramMessage)), paramMessage);
      }
      break;
    case 15: 
      paramMessage = (zabs)paramMessage.obj;
      if (this.zap.containsKey(zabs.zab(paramMessage))) {
        zabq.zal((zabq)this.zap.get(zabs.zab(paramMessage)), paramMessage);
      }
      break;
    case 14: 
      paramMessage = (zaaf)paramMessage.obj;
      localObject1 = paramMessage.zaa();
      if (!this.zap.containsKey(localObject1))
      {
        paramMessage.zab().setResult(Boolean.valueOf(false));
      }
      else
      {
        boolean bool = zabq.zax((zabq)this.zap.get(localObject1), false);
        paramMessage.zab().setResult(Boolean.valueOf(bool));
      }
      break;
    case 12: 
      if (this.zap.containsKey(paramMessage.obj)) {
        ((zabq)this.zap.get(paramMessage.obj)).zaA();
      }
      break;
    case 11: 
      if (this.zap.containsKey(paramMessage.obj)) {
        ((zabq)this.zap.get(paramMessage.obj)).zaw();
      }
      break;
    case 10: 
      paramMessage = this.zas.iterator();
      while (paramMessage.hasNext())
      {
        localObject1 = (ApiKey)paramMessage.next();
        localObject1 = (zabq)this.zap.remove(localObject1);
        if (localObject1 != null) {
          ((zabq)localObject1).zav();
        }
      }
      this.zas.clear();
      break;
    case 9: 
      if (this.zap.containsKey(paramMessage.obj)) {
        ((zabq)this.zap.get(paramMessage.obj)).zau();
      }
      break;
    case 7: 
      zaI((GoogleApi)paramMessage.obj);
      break;
    case 6: 
      if ((this.zak.getApplicationContext() instanceof Application))
      {
        BackgroundDetector.initialize((Application)this.zak.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zabl(this));
        if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
          this.zag = 300000L;
        }
      }
      break;
    case 5: 
      i = paramMessage.arg1;
      localObject2 = (ConnectionResult)paramMessage.obj;
      localObject3 = this.zap.values().iterator();
      do
      {
        paramMessage = (Message)localObject1;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        paramMessage = (zabq)((Iterator)localObject3).next();
      } while (paramMessage.zab() != i);
      if (paramMessage != null)
      {
        if (((ConnectionResult)localObject2).getErrorCode() == 13)
        {
          localObject1 = this.zal.getErrorString(((ConnectionResult)localObject2).getErrorCode());
          localObject3 = ((ConnectionResult)localObject2).getErrorMessage();
          localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 69 + String.valueOf(localObject3).length());
          ((StringBuilder)localObject2).append("Error resolution was canceled by the user, original error message: ");
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(": ");
          ((StringBuilder)localObject2).append((String)localObject3);
          zabq.zai(paramMessage, new Status(17, ((StringBuilder)localObject2).toString()));
        }
        else
        {
          zabq.zai(paramMessage, zaH(zabq.zag(paramMessage), (ConnectionResult)localObject2));
        }
      }
      else
      {
        localObject1 = new StringBuilder(76);
        ((StringBuilder)localObject1).append("Could not find API instance ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append(" while trying to fail enqueued calls.");
        paramMessage = new Exception();
        Log.wtf("GoogleApiManager", ((StringBuilder)localObject1).toString(), paramMessage);
      }
      break;
    case 4: 
    case 8: 
    case 13: 
      localObject2 = (zach)paramMessage.obj;
      localObject1 = (zabq)this.zap.get(((zach)localObject2).zac.getApiKey());
      paramMessage = (Message)localObject1;
      if (localObject1 == null) {
        paramMessage = zaI(((zach)localObject2).zac);
      }
      if ((paramMessage.zaz()) && (this.zao.get() != ((zach)localObject2).zab))
      {
        ((zach)localObject2).zaa.zad(zaa);
        paramMessage.zav();
      }
      else
      {
        paramMessage.zap(((zach)localObject2).zaa);
      }
      break;
    case 3: 
      paramMessage = this.zap.values().iterator();
    case 2: 
    case 1: 
      while (paramMessage.hasNext())
      {
        localObject1 = (zabq)paramMessage.next();
        ((zabq)localObject1).zan();
        ((zabq)localObject1).zao();
        continue;
        zal localzal = (zal)paramMessage.obj;
        localObject2 = localzal.zab().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramMessage = (ApiKey)((Iterator)localObject2).next();
          localObject1 = (zabq)this.zap.get(paramMessage);
          if (localObject1 == null)
          {
            localzal.zac(paramMessage, new ConnectionResult(13), null);
          }
          else if (((zabq)localObject1).zay())
          {
            localzal.zac(paramMessage, ConnectionResult.RESULT_SUCCESS, ((zabq)localObject1).zaf().getEndpointPackageName());
          }
          else
          {
            localObject3 = ((zabq)localObject1).zad();
            if (localObject3 != null)
            {
              localzal.zac(paramMessage, (ConnectionResult)localObject3, null);
            }
            else
            {
              ((zabq)localObject1).zat(localzal);
              ((zabq)localObject1).zao();
              continue;
              if (true == ((Boolean)paramMessage.obj).booleanValue()) {
                l = 10000L;
              }
              this.zag = l;
              this.zat.removeMessages(12);
              paramMessage = this.zap.keySet().iterator();
              while (paramMessage.hasNext())
              {
                localObject2 = (ApiKey)paramMessage.next();
                localObject1 = this.zat;
                ((Handler)localObject1).sendMessageDelayed(((Handler)localObject1).obtainMessage(12, localObject2), this.zag);
              }
            }
          }
        }
      }
    }
    return true;
  }
  
  public final void zaA()
  {
    Handler localHandler = this.zat;
    localHandler.sendMessage(localHandler.obtainMessage(3));
  }
  
  public final void zaB(GoogleApi<?> paramGoogleApi)
  {
    Handler localHandler = this.zat;
    localHandler.sendMessage(localHandler.obtainMessage(7, paramGoogleApi));
  }
  
  public final void zaC(zaae paramzaae)
  {
    synchronized (zac)
    {
      if (this.zaq != paramzaae)
      {
        this.zaq = paramzaae;
        this.zar.clear();
      }
      this.zar.addAll(paramzaae.zaa());
      return;
    }
  }
  
  final void zaD(zaae paramzaae)
  {
    synchronized (zac)
    {
      if (this.zaq == paramzaae)
      {
        this.zaq = null;
        this.zar.clear();
      }
      return;
    }
  }
  
  final boolean zaF()
  {
    if (this.zah) {
      return false;
    }
    RootTelemetryConfiguration localRootTelemetryConfiguration = RootTelemetryConfigManager.getInstance().getConfig();
    if ((localRootTelemetryConfiguration != null) && (!localRootTelemetryConfiguration.getMethodInvocationTelemetryEnabled())) {
      return false;
    }
    int i = this.zam.zaa(this.zak, 203400000);
    return (i == -1) || (i == 0);
  }
  
  final boolean zaG(ConnectionResult paramConnectionResult, int paramInt)
  {
    return this.zal.zah(this.zak, paramConnectionResult, paramInt);
  }
  
  public final int zaa()
  {
    return this.zan.getAndIncrement();
  }
  
  final zabq zak(ApiKey<?> paramApiKey)
  {
    return (zabq)this.zap.get(paramApiKey);
  }
  
  public final Task<Map<ApiKey<?>, String>> zao(Iterable<? extends HasApiKey<?>> paramIterable)
  {
    zal localzal = new zal(paramIterable);
    paramIterable = this.zat;
    paramIterable.sendMessage(paramIterable.obtainMessage(2, localzal));
    return localzal.zaa();
  }
  
  public final Task<Boolean> zap(GoogleApi<?> paramGoogleApi)
  {
    paramGoogleApi = new zaaf(paramGoogleApi.getApiKey());
    Handler localHandler = this.zat;
    localHandler.sendMessage(localHandler.obtainMessage(14, paramGoogleApi));
    return paramGoogleApi.zab().getTask();
  }
  
  public final <O extends Api.ApiOptions> Task<Void> zaq(GoogleApi<O> paramGoogleApi, RegisterListenerMethod<Api.AnyClient, ?> paramRegisterListenerMethod, UnregisterListenerMethod<Api.AnyClient, ?> paramUnregisterListenerMethod, Runnable paramRunnable)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    zaL(localTaskCompletionSource, paramRegisterListenerMethod.zaa(), paramGoogleApi);
    paramUnregisterListenerMethod = new zaf(new zaci(paramRegisterListenerMethod, paramUnregisterListenerMethod, paramRunnable), localTaskCompletionSource);
    paramRegisterListenerMethod = this.zat;
    paramRegisterListenerMethod.sendMessage(paramRegisterListenerMethod.obtainMessage(8, new zach(paramUnregisterListenerMethod, this.zao.get(), paramGoogleApi)));
    return localTaskCompletionSource.getTask();
  }
  
  public final <O extends Api.ApiOptions> Task<Boolean> zar(GoogleApi<O> paramGoogleApi, ListenerHolder.ListenerKey paramListenerKey, int paramInt)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    zaL(localTaskCompletionSource, paramInt, paramGoogleApi);
    paramListenerKey = new zah(paramListenerKey, localTaskCompletionSource);
    Handler localHandler = this.zat;
    localHandler.sendMessage(localHandler.obtainMessage(13, new zach(paramListenerKey, this.zao.get(), paramGoogleApi)));
    return localTaskCompletionSource.getTask();
  }
  
  public final <O extends Api.ApiOptions> void zaw(GoogleApi<O> paramGoogleApi, int paramInt, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> paramApiMethodImpl)
  {
    zae localzae = new zae(paramInt, paramApiMethodImpl);
    paramApiMethodImpl = this.zat;
    paramApiMethodImpl.sendMessage(paramApiMethodImpl.obtainMessage(4, new zach(localzae, this.zao.get(), paramGoogleApi)));
  }
  
  public final <O extends Api.ApiOptions, ResultT> void zax(GoogleApi<O> paramGoogleApi, int paramInt, TaskApiCall<Api.AnyClient, ResultT> paramTaskApiCall, TaskCompletionSource<ResultT> paramTaskCompletionSource, StatusExceptionMapper paramStatusExceptionMapper)
  {
    zaL(paramTaskCompletionSource, paramTaskApiCall.zaa(), paramGoogleApi);
    paramTaskApiCall = new zag(paramInt, paramTaskApiCall, paramTaskCompletionSource, paramStatusExceptionMapper);
    paramTaskCompletionSource = this.zat;
    paramTaskCompletionSource.sendMessage(paramTaskCompletionSource.obtainMessage(4, new zach(paramTaskApiCall, this.zao.get(), paramGoogleApi)));
  }
  
  final void zay(MethodInvocation paramMethodInvocation, int paramInt1, long paramLong, int paramInt2)
  {
    Handler localHandler = this.zat;
    localHandler.sendMessage(localHandler.obtainMessage(18, new zace(paramMethodInvocation, paramInt1, paramLong, paramInt2)));
  }
  
  public final void zaz(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (!zaG(paramConnectionResult, paramInt))
    {
      Handler localHandler = this.zat;
      localHandler.sendMessage(localHandler.obtainMessage(5, paramInt, 0, paramConnectionResult));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\GoogleApiManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */