package com.google.android.gms.internal.drive;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.zzd;
import com.google.android.gms.drive.events.zzl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzaw
  extends GmsClient<zzeo>
{
  private final String zzeb;
  protected final boolean zzec;
  private volatile DriveId zzed;
  private volatile DriveId zzee;
  private volatile boolean zzef = false;
  private final Map<DriveId, Map<ChangeListener, zzee>> zzeg = new HashMap();
  private final Map<zzd, zzee> zzeh = new HashMap();
  private final Map<DriveId, Map<zzl, zzee>> zzei = new HashMap();
  private final Map<DriveId, Map<zzl, zzee>> zzej = new HashMap();
  private final Bundle zzz;
  
  public zzaw(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, Bundle paramBundle)
  {
    super(paramContext, paramLooper, 11, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzeb = paramClientSettings.getRealClientPackageName();
    this.zzz = paramBundle;
    paramLooper = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
    paramLooper.setPackage(paramContext.getPackageName());
    paramContext = paramContext.getPackageManager().queryIntentServices(paramLooper, 0);
    int i = paramContext.size();
    if (i != 0)
    {
      if (i == 1)
      {
        paramContext = ((ResolveInfo)paramContext.get(0)).serviceInfo;
        if (paramContext.exported)
        {
          this.zzec = true;
          return;
        }
        paramContext = paramContext.name;
        paramLooper = new StringBuilder(String.valueOf(paramContext).length() + 60);
        paramLooper.append("Drive event service ");
        paramLooper.append(paramContext);
        paramLooper.append(" must be exported in AndroidManifest.xml");
        throw new IllegalStateException(paramLooper.toString());
      }
      paramLooper = paramLooper.getAction();
      paramContext = new StringBuilder(String.valueOf(paramLooper).length() + 72);
      paramContext.append("AndroidManifest.xml can only define one service that handles the ");
      paramContext.append(paramLooper);
      paramContext.append(" action");
      throw new IllegalStateException(paramContext.toString());
    }
    this.zzec = false;
  }
  
  public final void disconnect()
  {
    if (isConnected()) {}
    try
    {
      zzeo localzzeo = (zzeo)getService();
      ??? = new com/google/android/gms/internal/drive/zzad;
      ((zzad)???).<init>();
      localzzeo.zza((zzad)???);
      super.disconnect();
      synchronized (this.zzeg)
      {
        this.zzeg.clear();
        synchronized (this.zzeh)
        {
          this.zzeh.clear();
          synchronized (this.zzei)
          {
            this.zzei.clear();
            synchronized (this.zzej)
            {
              this.zzej.clear();
              return;
            }
          }
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    String str = getContext().getPackageName();
    Preconditions.checkNotNull(str);
    Preconditions.checkState(getClientSettings().getAllRequestedScopes().isEmpty() ^ true);
    Bundle localBundle = new Bundle();
    if (!str.equals(this.zzeb)) {
      localBundle.putString("proxy_package_name", this.zzeb);
    }
    localBundle.putAll(this.zzz);
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.drive.internal.IDriveService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.drive.ApiService.START";
  }
  
  protected final void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if (paramBundle != null)
    {
      paramBundle.setClassLoader(getClass().getClassLoader());
      this.zzed = ((DriveId)paramBundle.getParcelable("com.google.android.gms.drive.root_id"));
      this.zzee = ((DriveId)paramBundle.getParcelable("com.google.android.gms.drive.appdata_id"));
      this.zzef = true;
    }
    super.onPostInitHandler(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public final boolean requiresAccount()
  {
    return true;
  }
  
  public final boolean requiresSignIn()
  {
    return (!getContext().getPackageName().equals(this.zzeb)) || (!UidVerifier.isGooglePlayServicesUid(getContext(), Process.myUid()));
  }
  
  final PendingResult<Status> zza(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId, ChangeListener paramChangeListener)
  {
    Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, paramDriveId));
    Preconditions.checkNotNull(paramChangeListener, "listener");
    Preconditions.checkState(isConnected(), "Client must be connected");
    synchronized (this.zzeg)
    {
      Object localObject2 = (Map)this.zzeg.get(paramDriveId);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        this.zzeg.put(paramDriveId, localObject1);
      }
      localObject2 = (zzee)((Map)localObject1).get(paramChangeListener);
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/internal/drive/zzee;
        ((zzee)localObject2).<init>(getLooper(), getContext(), 1, paramChangeListener);
        ((Map)localObject1).put(paramChangeListener, localObject2);
        paramChangeListener = (ChangeListener)localObject2;
      }
      else
      {
        paramChangeListener = (ChangeListener)localObject2;
        if (((zzee)localObject2).zzg(1))
        {
          paramDriveId = new com/google/android/gms/internal/drive/zzat;
          paramDriveId.<init>(paramGoogleApiClient, Status.RESULT_SUCCESS);
          return paramDriveId;
        }
      }
      paramChangeListener.zzf(1);
      localObject1 = new com/google/android/gms/internal/drive/zzj;
      ((zzj)localObject1).<init>(1, paramDriveId);
      paramDriveId = new com/google/android/gms/internal/drive/zzax;
      paramDriveId.<init>(this, paramGoogleApiClient, (zzj)localObject1, paramChangeListener);
      paramGoogleApiClient = paramGoogleApiClient.execute(paramDriveId);
      return paramGoogleApiClient;
    }
  }
  
  public final DriveId zzae()
  {
    return this.zzed;
  }
  
  public final DriveId zzaf()
  {
    return this.zzee;
  }
  
  public final boolean zzag()
  {
    return this.zzef;
  }
  
  public final boolean zzah()
  {
    return this.zzec;
  }
  
  final PendingResult<Status> zzb(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId, ChangeListener paramChangeListener)
  {
    Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, paramDriveId));
    Preconditions.checkState(isConnected(), "Client must be connected");
    Preconditions.checkNotNull(paramChangeListener, "listener");
    synchronized (this.zzeg)
    {
      Object localObject = (Map)this.zzeg.get(paramDriveId);
      if (localObject == null)
      {
        paramDriveId = new com/google/android/gms/internal/drive/zzat;
        paramDriveId.<init>(paramGoogleApiClient, Status.RESULT_SUCCESS);
        return paramDriveId;
      }
      paramChangeListener = (zzee)((Map)localObject).remove(paramChangeListener);
      if (paramChangeListener == null)
      {
        paramDriveId = new com/google/android/gms/internal/drive/zzat;
        paramDriveId.<init>(paramGoogleApiClient, Status.RESULT_SUCCESS);
        return paramDriveId;
      }
      if (((Map)localObject).isEmpty()) {
        this.zzeg.remove(paramDriveId);
      }
      localObject = new com/google/android/gms/internal/drive/zzgs;
      ((zzgs)localObject).<init>(paramDriveId, 1);
      paramDriveId = new com/google/android/gms/internal/drive/zzay;
      paramDriveId.<init>(this, paramGoogleApiClient, (zzgs)localObject, paramChangeListener);
      paramGoogleApiClient = paramGoogleApiClient.execute(paramDriveId);
      return paramGoogleApiClient;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */