package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

public final class NonGmsServiceBrokerClient
  implements Api.Client, ServiceConnection
{
  private static final String zaa = "NonGmsServiceBrokerClient";
  private final String zab;
  private final String zac;
  private final ComponentName zad;
  private final Context zae;
  private final ConnectionCallbacks zaf;
  private final Handler zag;
  private final OnConnectionFailedListener zah;
  private IBinder zai;
  private boolean zaj = false;
  private String zak = null;
  private String zal;
  
  public NonGmsServiceBrokerClient(Context paramContext, Looper paramLooper, ComponentName paramComponentName, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, null, null, paramComponentName, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private NonGmsServiceBrokerClient(Context paramContext, Looper paramLooper, String paramString1, String paramString2, ComponentName paramComponentName, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zae = paramContext;
    this.zag = new zaq(paramLooper);
    this.zaf = paramConnectionCallbacks;
    this.zah = paramOnConnectionFailedListener;
    if ((paramString1 != null) && (paramString2 != null))
    {
      if (paramComponentName != null) {
        break label86;
      }
      paramComponentName = null;
    }
    else
    {
      if (paramComponentName == null) {
        break label86;
      }
    }
    this.zab = paramString1;
    this.zac = paramString2;
    this.zad = paramComponentName;
    return;
    label86:
    throw new AssertionError("Must specify either package or component, but not both");
  }
  
  public NonGmsServiceBrokerClient(Context paramContext, Looper paramLooper, String paramString1, String paramString2, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, paramString1, paramString2, null, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private final void zad()
  {
    if (Thread.currentThread() == this.zag.getLooper().getThread()) {
      return;
    }
    throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
  }
  
  private final void zae(String paramString)
  {
    String.valueOf(String.valueOf(this.zai)).length();
  }
  
  public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks)
  {
    zad();
    zae("Connect started.");
    if (isConnected()) {}
    try
    {
      disconnect("connect() called when already connected");
      try
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        paramConnectionProgressReportCallbacks = this.zad;
        if (paramConnectionProgressReportCallbacks != null) {
          localIntent.setComponent(paramConnectionProgressReportCallbacks);
        } else {
          localIntent.setPackage(this.zab).setAction(this.zac);
        }
        boolean bool = this.zae.bindService(localIntent, this, GmsClientSupervisor.getDefaultBindFlags());
        this.zaj = bool;
        if (!bool)
        {
          this.zai = null;
          this.zah.onConnectionFailed(new ConnectionResult(16));
        }
        zae("Finished connect.");
        return;
      }
      catch (SecurityException paramConnectionProgressReportCallbacks)
      {
        this.zaj = false;
        this.zai = null;
        throw paramConnectionProgressReportCallbacks;
      }
    }
    catch (Exception paramConnectionProgressReportCallbacks)
    {
      for (;;) {}
    }
  }
  
  public final void disconnect()
  {
    zad();
    zae("Disconnect called.");
    try
    {
      this.zae.unbindService(this);
      this.zaj = false;
      this.zai = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public final void disconnect(String paramString)
  {
    zad();
    this.zak = paramString;
    disconnect();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public final Feature[] getAvailableFeatures()
  {
    return new Feature[0];
  }
  
  public IBinder getBinder()
  {
    zad();
    return this.zai;
  }
  
  public final String getEndpointPackageName()
  {
    String str = this.zab;
    if (str != null) {
      return str;
    }
    Preconditions.checkNotNull(this.zad);
    return this.zad.getPackageName();
  }
  
  public final String getLastDisconnectMessage()
  {
    return this.zak;
  }
  
  public final int getMinApkVersion()
  {
    return 0;
  }
  
  public final void getRemoteService(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet) {}
  
  public final Feature[] getRequiredFeatures()
  {
    return new Feature[0];
  }
  
  public final Set<Scope> getScopesForConnectionlessNonSignIn()
  {
    return Collections.emptySet();
  }
  
  public final IBinder getServiceBrokerBinder()
  {
    return null;
  }
  
  public final Intent getSignInIntent()
  {
    return new Intent();
  }
  
  public final boolean isConnected()
  {
    zad();
    return this.zai != null;
  }
  
  public final boolean isConnecting()
  {
    zad();
    return this.zaj;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.zag.post(new zacg(this, paramIBinder));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.zag.post(new zacf(this));
  }
  
  public final void onUserSignOut(BaseGmsClient.SignOutCallbacks paramSignOutCallbacks) {}
  
  public final boolean providesSignIn()
  {
    return false;
  }
  
  public final boolean requiresAccount()
  {
    return false;
  }
  
  public final boolean requiresGooglePlayServices()
  {
    return false;
  }
  
  public final boolean requiresSignIn()
  {
    return false;
  }
  
  public final void zac(String paramString)
  {
    this.zal = paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\NonGmsServiceBrokerClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */