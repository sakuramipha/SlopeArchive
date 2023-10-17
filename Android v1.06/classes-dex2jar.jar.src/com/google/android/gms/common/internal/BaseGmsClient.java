package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseGmsClient<T extends IInterface>
{
  public static final int CONNECT_STATE_CONNECTED = 4;
  public static final int CONNECT_STATE_DISCONNECTED = 1;
  public static final int CONNECT_STATE_DISCONNECTING = 5;
  public static final String DEFAULT_ACCOUNT = "<<default account>>";
  public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = { "service_esmobile", "service_googleme" };
  public static final String KEY_PENDING_INTENT = "pendingIntent";
  private static final Feature[] zze = new Feature[0];
  private volatile String zzA;
  private ConnectionResult zzB = null;
  private boolean zzC = false;
  private volatile zzj zzD = null;
  zzu zza;
  final Handler zzb;
  protected ConnectionProgressReportCallbacks zzc;
  protected AtomicInteger zzd = new AtomicInteger(0);
  private int zzf;
  private long zzg;
  private long zzh;
  private int zzi;
  private long zzj;
  private volatile String zzk = null;
  private final Context zzl;
  private final Looper zzm;
  private final GmsClientSupervisor zzn;
  private final GoogleApiAvailabilityLight zzo;
  private final Object zzp = new Object();
  private final Object zzq = new Object();
  private IGmsServiceBroker zzr;
  private T zzs;
  private final ArrayList<zzc<?>> zzt = new ArrayList();
  private zze zzu;
  private int zzv = 1;
  private final BaseConnectionCallbacks zzw;
  private final BaseOnConnectionFailedListener zzx;
  private final int zzy;
  private final String zzz;
  
  protected BaseGmsClient(Context paramContext, Handler paramHandler, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    this.zzl = paramContext;
    Preconditions.checkNotNull(paramHandler, "Handler must not be null");
    this.zzb = paramHandler;
    this.zzm = paramHandler.getLooper();
    Preconditions.checkNotNull(paramGmsClientSupervisor, "Supervisor must not be null");
    this.zzn = paramGmsClientSupervisor;
    Preconditions.checkNotNull(paramGoogleApiAvailabilityLight, "API availability must not be null");
    this.zzo = paramGoogleApiAvailabilityLight;
    this.zzy = paramInt;
    this.zzw = paramBaseConnectionCallbacks;
    this.zzx = paramBaseOnConnectionFailedListener;
    this.zzz = null;
  }
  
  protected BaseGmsClient(Context paramContext, Looper paramLooper, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, String paramString)
  {
    this(paramContext, paramLooper, localGmsClientSupervisor, localGoogleApiAvailabilityLight, paramInt, paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener, paramString);
  }
  
  protected BaseGmsClient(Context paramContext, Looper paramLooper, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, String paramString)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    this.zzl = paramContext;
    Preconditions.checkNotNull(paramLooper, "Looper must not be null");
    this.zzm = paramLooper;
    Preconditions.checkNotNull(paramGmsClientSupervisor, "Supervisor must not be null");
    this.zzn = paramGmsClientSupervisor;
    Preconditions.checkNotNull(paramGoogleApiAvailabilityLight, "API availability must not be null");
    this.zzo = paramGoogleApiAvailabilityLight;
    this.zzb = new zzb(this, paramLooper);
    this.zzy = paramInt;
    this.zzw = paramBaseConnectionCallbacks;
    this.zzx = paramBaseOnConnectionFailedListener;
    this.zzz = paramString;
  }
  
  private final void zzp(int paramInt, T paramT)
  {
    boolean bool = false;
    int i;
    if (paramInt != 4) {
      i = 0;
    } else {
      i = 1;
    }
    int j;
    if (paramT == null) {
      j = 0;
    } else {
      j = 1;
    }
    if (i == j) {
      bool = true;
    }
    Preconditions.checkArgument(bool);
    synchronized (this.zzp)
    {
      this.zzv = paramInt;
      this.zzs = paramT;
      Object localObject3;
      Object localObject2;
      if (paramInt != 1)
      {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4)
          {
            Preconditions.checkNotNull(paramT);
            onConnectedLocked(paramT);
          }
        }
        else
        {
          paramT = this.zzu;
          if (paramT != null)
          {
            localObject3 = this.zza;
            if (localObject3 != null)
            {
              localObject2 = ((zzu)localObject3).zzc();
              str1 = ((zzu)localObject3).zzb();
              i = String.valueOf(localObject2).length();
              paramInt = String.valueOf(str1).length();
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>(i + 70 + paramInt);
              ((StringBuilder)localObject3).append("Calling connect() while still connected, missing disconnect() for ");
              ((StringBuilder)localObject3).append((String)localObject2);
              ((StringBuilder)localObject3).append(" on ");
              ((StringBuilder)localObject3).append(str1);
              Log.e("GmsClient", ((StringBuilder)localObject3).toString());
              localObject2 = this.zzn;
              localObject3 = this.zza.zzc();
              Preconditions.checkNotNull(localObject3);
              ((GmsClientSupervisor)localObject2).zzb((String)localObject3, this.zza.zzb(), this.zza.zza(), paramT, zze(), this.zza.zzd());
              this.zzd.incrementAndGet();
            }
          }
          localObject2 = new com/google/android/gms/common/internal/zze;
          ((zze)localObject2).<init>(this, this.zzd.get());
          this.zzu = ((zze)localObject2);
          if ((this.zzv == 3) && (getLocalStartServiceAction() != null))
          {
            paramT = new com/google/android/gms/common/internal/zzu;
            paramT.<init>(getContext().getPackageName(), getLocalStartServiceAction(), true, GmsClientSupervisor.getDefaultBindFlags(), false);
          }
          else
          {
            paramT = new zzu(getStartServicePackage(), getStartServiceAction(), false, GmsClientSupervisor.getDefaultBindFlags(), getUseDynamicLookup());
          }
          this.zza = paramT;
          if ((paramT.zzd()) && (getMinApkVersion() < 17895000))
          {
            localObject2 = new java/lang/IllegalStateException;
            paramT = String.valueOf(this.zza.zzc());
            if (paramT.length() != 0) {
              paramT = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(paramT);
            } else {
              paramT = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
            }
            ((IllegalStateException)localObject2).<init>(paramT);
            throw ((Throwable)localObject2);
          }
          paramT = this.zzn;
          String str2 = this.zza.zzc();
          Preconditions.checkNotNull(str2);
          String str1 = this.zza.zzb();
          paramInt = this.zza.zza();
          String str3 = zze();
          bool = this.zza.zzd();
          localObject3 = getBindServiceExecutor();
          zzn localzzn = new com/google/android/gms/common/internal/zzn;
          localzzn.<init>(str2, str1, paramInt, bool);
          if (!paramT.zzc(localzzn, (ServiceConnection)localObject2, str3, (Executor)localObject3))
          {
            paramT = this.zza.zzc();
            localObject3 = this.zza.zzb();
            paramInt = String.valueOf(paramT).length();
            i = String.valueOf(localObject3).length();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>(paramInt + 34 + i);
            ((StringBuilder)localObject2).append("unable to connect to service: ");
            ((StringBuilder)localObject2).append(paramT);
            ((StringBuilder)localObject2).append(" on ");
            ((StringBuilder)localObject2).append((String)localObject3);
            Log.w("GmsClient", ((StringBuilder)localObject2).toString());
            zzl(16, null, this.zzd.get());
          }
        }
      }
      else
      {
        paramT = this.zzu;
        if (paramT != null)
        {
          localObject2 = this.zzn;
          localObject3 = this.zza.zzc();
          Preconditions.checkNotNull(localObject3);
          ((GmsClientSupervisor)localObject2).zzb((String)localObject3, this.zza.zzb(), this.zza.zza(), paramT, zze(), this.zza.zzd());
          this.zzu = null;
        }
      }
      return;
    }
  }
  
  public void checkAvailabilityAndConnect()
  {
    int i = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
    if (i != 0)
    {
      zzp(1, null);
      triggerNotAvailable(new LegacyClientCallbackAdapter(), i, null);
      return;
    }
    connect(new LegacyClientCallbackAdapter());
  }
  
  protected final void checkConnected()
  {
    if (isConnected()) {
      return;
    }
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  public void connect(ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
    this.zzc = paramConnectionProgressReportCallbacks;
    zzp(2, null);
  }
  
  protected abstract T createServiceInterface(IBinder paramIBinder);
  
  public void disconnect()
  {
    this.zzd.incrementAndGet();
    synchronized (this.zzt)
    {
      int j = this.zzt.size();
      for (int i = 0; i < j; i++) {
        ((zzc)this.zzt.get(i)).zzf();
      }
      this.zzt.clear();
      synchronized (this.zzq)
      {
        this.zzr = null;
        zzp(1, null);
        return;
      }
    }
  }
  
  public void disconnect(String paramString)
  {
    this.zzk = paramString;
    disconnect();
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] arg4)
  {
    synchronized (this.zzp)
    {
      int i = this.zzv;
      paramFileDescriptor = this.zzs;
      synchronized (this.zzq)
      {
        Object localObject1 = this.zzr;
        paramPrintWriter.append(paramString).append("mConnectState=");
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i != 5) {
                  paramPrintWriter.print("UNKNOWN");
                } else {
                  paramPrintWriter.print("DISCONNECTING");
                }
              }
              else {
                paramPrintWriter.print("CONNECTED");
              }
            }
            else {
              paramPrintWriter.print("LOCAL_CONNECTING");
            }
          }
          else {
            paramPrintWriter.print("REMOTE_CONNECTING");
          }
        }
        else {
          paramPrintWriter.print("DISCONNECTED");
        }
        paramPrintWriter.append(" mService=");
        if (paramFileDescriptor == null) {
          paramPrintWriter.append("null");
        } else {
          paramPrintWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(paramFileDescriptor.asBinder())));
        }
        paramPrintWriter.append(" mServiceBroker=");
        if (localObject1 == null) {
          paramPrintWriter.println("null");
        } else {
          paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IGmsServiceBroker)localObject1).asBinder())));
        }
        paramFileDescriptor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        long l;
        Object localObject2;
        if (this.zzh > 0L)
        {
          ??? = paramPrintWriter.append(paramString).append("lastConnectedTime=");
          l = this.zzh;
          localObject2 = paramFileDescriptor.format(new Date(l));
          localObject1 = new StringBuilder(String.valueOf(localObject2).length() + 21);
          ((StringBuilder)localObject1).append(l);
          ((StringBuilder)localObject1).append(" ");
          ((StringBuilder)localObject1).append((String)localObject2);
          ???.println(((StringBuilder)localObject1).toString());
        }
        if (this.zzg > 0L)
        {
          paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          i = this.zzf;
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3) {
                paramPrintWriter.append(String.valueOf(i));
              } else {
                paramPrintWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
              }
            }
            else {
              paramPrintWriter.append("CAUSE_NETWORK_LOST");
            }
          }
          else {
            paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
          }
          localObject1 = paramPrintWriter.append(" lastSuspendedTime=");
          l = this.zzg;
          ??? = paramFileDescriptor.format(new Date(l));
          localObject2 = new StringBuilder(String.valueOf(???).length() + 21);
          ((StringBuilder)localObject2).append(l);
          ((StringBuilder)localObject2).append(" ");
          ((StringBuilder)localObject2).append(???);
          ((PrintWriter)localObject1).println(((StringBuilder)localObject2).toString());
        }
        if (this.zzj > 0L)
        {
          paramPrintWriter.append(paramString).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzi));
          paramString = paramPrintWriter.append(" lastFailedTime=");
          l = this.zzj;
          paramPrintWriter = paramFileDescriptor.format(new Date(l));
          paramFileDescriptor = new StringBuilder(String.valueOf(paramPrintWriter).length() + 21);
          paramFileDescriptor.append(l);
          paramFileDescriptor.append(" ");
          paramFileDescriptor.append(paramPrintWriter);
          paramString.println(paramFileDescriptor.toString());
        }
        return;
      }
    }
  }
  
  protected boolean enableLocalFallback()
  {
    return false;
  }
  
  public Account getAccount()
  {
    return null;
  }
  
  public Feature[] getApiFeatures()
  {
    return zze;
  }
  
  public final Feature[] getAvailableFeatures()
  {
    zzj localzzj = this.zzD;
    if (localzzj == null) {
      return null;
    }
    return localzzj.zzb;
  }
  
  protected Executor getBindServiceExecutor()
  {
    return null;
  }
  
  public Bundle getConnectionHint()
  {
    return null;
  }
  
  public final Context getContext()
  {
    return this.zzl;
  }
  
  public String getEndpointPackageName()
  {
    if (isConnected())
    {
      zzu localzzu = this.zza;
      if (localzzu != null) {
        return localzzu.zzb();
      }
    }
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public int getGCoreServiceId()
  {
    return this.zzy;
  }
  
  protected Bundle getGetServiceRequestExtraArgs()
  {
    return new Bundle();
  }
  
  public String getLastDisconnectMessage()
  {
    return this.zzk;
  }
  
  protected String getLocalStartServiceAction()
  {
    return null;
  }
  
  public final Looper getLooper()
  {
    return this.zzm;
  }
  
  public int getMinApkVersion()
  {
    return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  }
  
  public void getRemoteService(IAccountAccessor arg1, Set<Scope> paramSet)
  {
    Object localObject = getGetServiceRequestExtraArgs();
    GetServiceRequest localGetServiceRequest = new GetServiceRequest(this.zzy, this.zzA);
    localGetServiceRequest.zzd = this.zzl.getPackageName();
    localGetServiceRequest.zzg = ((Bundle)localObject);
    if (paramSet != null) {
      localGetServiceRequest.zzf = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
    }
    if (requiresSignIn())
    {
      localObject = getAccount();
      paramSet = (Set<Scope>)localObject;
      if (localObject == null) {
        paramSet = new Account("<<default account>>", "com.google");
      }
      localGetServiceRequest.zzh = paramSet;
      if (??? != null) {
        localGetServiceRequest.zze = ???.asBinder();
      }
    }
    else if (requiresAccount())
    {
      localGetServiceRequest.zzh = getAccount();
    }
    localGetServiceRequest.zzi = zze;
    localGetServiceRequest.zzj = getApiFeatures();
    if (usesClientTelemetry()) {
      localGetServiceRequest.zzm = true;
    }
    try
    {
      try
      {
        synchronized (this.zzq)
        {
          localObject = this.zzr;
          if (localObject != null)
          {
            paramSet = new com/google/android/gms/common/internal/zzd;
            paramSet.<init>(this, this.zzd.get());
            ((IGmsServiceBroker)localObject).getService(paramSet, localGetServiceRequest);
          }
          else
          {
            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
          }
          return;
        }
        Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
      }
      catch (RuntimeException ???) {}catch (RemoteException ???) {}
      onPostInitHandler(8, null, null, this.zzd.get());
      return;
    }
    catch (SecurityException ???)
    {
      throw ???;
    }
    catch (DeadObjectException ???)
    {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
      triggerConnectionSuspended(3);
    }
  }
  
  protected Set<Scope> getScopes()
  {
    return Collections.emptySet();
  }
  
  public final T getService()
    throws DeadObjectException
  {
    synchronized (this.zzp)
    {
      if (this.zzv != 5)
      {
        checkConnected();
        localObject2 = this.zzs;
        Preconditions.checkNotNull(localObject2, "Client is connected but service is null");
        return (T)localObject2;
      }
      Object localObject2 = new android/os/DeadObjectException;
      ((DeadObjectException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public IBinder getServiceBrokerBinder()
  {
    synchronized (this.zzq)
    {
      Object localObject2 = this.zzr;
      if (localObject2 == null) {
        return null;
      }
      localObject2 = ((IGmsServiceBroker)localObject2).asBinder();
      return (IBinder)localObject2;
    }
  }
  
  protected abstract String getServiceDescriptor();
  
  public Intent getSignInIntent()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  protected abstract String getStartServiceAction();
  
  protected String getStartServicePackage()
  {
    return "com.google.android.gms";
  }
  
  public ConnectionTelemetryConfiguration getTelemetryConfiguration()
  {
    zzj localzzj = this.zzD;
    if (localzzj == null) {
      return null;
    }
    return localzzj.zzd;
  }
  
  protected boolean getUseDynamicLookup()
  {
    return getMinApkVersion() >= 211700000;
  }
  
  public boolean hasConnectionInfo()
  {
    return this.zzD != null;
  }
  
  public boolean isConnected()
  {
    synchronized (this.zzp)
    {
      boolean bool;
      if (this.zzv == 4) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public boolean isConnecting()
  {
    synchronized (this.zzp)
    {
      int i = this.zzv;
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (i != 2) {
        if (i == 3) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return bool1;
    }
  }
  
  protected void onConnectedLocked(T paramT)
  {
    this.zzh = System.currentTimeMillis();
  }
  
  protected void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.zzi = paramConnectionResult.getErrorCode();
    this.zzj = System.currentTimeMillis();
  }
  
  protected void onConnectionSuspended(int paramInt)
  {
    this.zzf = paramInt;
    this.zzg = System.currentTimeMillis();
  }
  
  protected void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Handler localHandler = this.zzb;
    localHandler.sendMessage(localHandler.obtainMessage(1, paramInt2, -1, new zzf(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  public void onUserSignOut(SignOutCallbacks paramSignOutCallbacks)
  {
    paramSignOutCallbacks.onSignOutComplete();
  }
  
  public boolean providesSignIn()
  {
    return false;
  }
  
  public boolean requiresAccount()
  {
    return false;
  }
  
  public boolean requiresGooglePlayServices()
  {
    return true;
  }
  
  public boolean requiresSignIn()
  {
    return false;
  }
  
  public void setAttributionTag(String paramString)
  {
    this.zzA = paramString;
  }
  
  public void triggerConnectionSuspended(int paramInt)
  {
    Handler localHandler = this.zzb;
    localHandler.sendMessage(localHandler.obtainMessage(6, this.zzd.get(), paramInt));
  }
  
  protected void triggerNotAvailable(ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks, int paramInt, PendingIntent paramPendingIntent)
  {
    Preconditions.checkNotNull(paramConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
    this.zzc = paramConnectionProgressReportCallbacks;
    paramConnectionProgressReportCallbacks = this.zzb;
    paramConnectionProgressReportCallbacks.sendMessage(paramConnectionProgressReportCallbacks.obtainMessage(3, this.zzd.get(), paramInt, paramPendingIntent));
  }
  
  public boolean usesClientTelemetry()
  {
    return false;
  }
  
  protected final String zze()
  {
    String str2 = this.zzz;
    String str1 = str2;
    if (str2 == null) {
      str1 = this.zzl.getClass().getName();
    }
    return str1;
  }
  
  protected final void zzl(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    paramBundle = this.zzb;
    paramBundle.sendMessage(paramBundle.obtainMessage(7, paramInt2, -1, new zzg(this, paramInt1, null)));
  }
  
  public static abstract interface BaseConnectionCallbacks
  {
    public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
    public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    
    public abstract void onConnected(Bundle paramBundle);
    
    public abstract void onConnectionSuspended(int paramInt);
  }
  
  public static abstract interface BaseOnConnectionFailedListener
  {
    public abstract void onConnectionFailed(ConnectionResult paramConnectionResult);
  }
  
  public static abstract interface ConnectionProgressReportCallbacks
  {
    public abstract void onReportServiceBinding(ConnectionResult paramConnectionResult);
  }
  
  protected class LegacyClientCallbackAdapter
    implements BaseGmsClient.ConnectionProgressReportCallbacks
  {
    public LegacyClientCallbackAdapter() {}
    
    public final void onReportServiceBinding(ConnectionResult paramConnectionResult)
    {
      if (paramConnectionResult.isSuccess())
      {
        paramConnectionResult = BaseGmsClient.this;
        paramConnectionResult.getRemoteService(null, paramConnectionResult.getScopes());
        return;
      }
      if (BaseGmsClient.zzc(BaseGmsClient.this) != null) {
        BaseGmsClient.zzc(BaseGmsClient.this).onConnectionFailed(paramConnectionResult);
      }
    }
  }
  
  public static abstract interface SignOutCallbacks
  {
    public abstract void onSignOutComplete();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\BaseGmsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */