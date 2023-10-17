package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

public final class zak
  extends zap
{
  private final SparseArray<zaj> zad = new SparseArray();
  
  private zak(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment, GoogleApiAvailability.getInstance());
    this.mLifecycleFragment.addCallback("AutoManageHelper", this);
  }
  
  public static zak zaa(LifecycleActivity paramLifecycleActivity)
  {
    paramLifecycleActivity = getFragment(paramLifecycleActivity);
    zak localzak = (zak)paramLifecycleActivity.getCallbackOrNull("AutoManageHelper", zak.class);
    if (localzak != null) {
      return localzak;
    }
    return new zak(paramLifecycleActivity);
  }
  
  private final zaj zai(int paramInt)
  {
    if (this.zad.size() <= paramInt) {
      return null;
    }
    SparseArray localSparseArray = this.zad;
    return (zaj)localSparseArray.get(localSparseArray.keyAt(paramInt));
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (int i = 0; i < this.zad.size(); i++)
    {
      zaj localzaj = zai(i);
      if (localzaj != null)
      {
        paramPrintWriter.append(paramString).append("GoogleApiClient #").print(localzaj.zaa);
        paramPrintWriter.println(":");
        localzaj.zab.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    boolean bool = this.zaa;
    String str = String.valueOf(this.zad);
    Object localObject = new StringBuilder(String.valueOf(str).length() + 14);
    ((StringBuilder)localObject).append("onStart ");
    ((StringBuilder)localObject).append(bool);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(str);
    Log.d("AutoManageHelper", ((StringBuilder)localObject).toString());
    if (this.zab.get() == null) {
      for (int i = 0; i < this.zad.size(); i++)
      {
        localObject = zai(i);
        if (localObject != null) {
          ((zaj)localObject).zab.connect();
        }
      }
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    for (int i = 0; i < this.zad.size(); i++)
    {
      zaj localzaj = zai(i);
      if (localzaj != null) {
        localzaj.zab.disconnect();
      }
    }
  }
  
  protected final void zab(ConnectionResult paramConnectionResult, int paramInt)
  {
    Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
    if (paramInt < 0)
    {
      Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
      return;
    }
    Object localObject = (zaj)this.zad.get(paramInt);
    if (localObject != null)
    {
      zae(paramInt);
      localObject = ((zaj)localObject).zac;
      if (localObject != null) {
        ((GoogleApiClient.OnConnectionFailedListener)localObject).onConnectionFailed(paramConnectionResult);
      }
    }
  }
  
  protected final void zac()
  {
    for (int i = 0; i < this.zad.size(); i++)
    {
      zaj localzaj = zai(i);
      if (localzaj != null) {
        localzaj.zab.connect();
      }
    }
  }
  
  public final void zad(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    if (this.zad.indexOfKey(paramInt) < 0) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject = new StringBuilder(54);
    ((StringBuilder)localObject).append("Already managing a GoogleApiClient with id ");
    ((StringBuilder)localObject).append(paramInt);
    Preconditions.checkState(bool, ((StringBuilder)localObject).toString());
    localObject = (zam)this.zab.get();
    boolean bool = this.zaa;
    String str = String.valueOf(localObject);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 49);
    localStringBuilder.append("starting AutoManage for client ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" ");
    localStringBuilder.append(bool);
    localStringBuilder.append(" ");
    localStringBuilder.append(str);
    Log.d("AutoManageHelper", localStringBuilder.toString());
    paramOnConnectionFailedListener = new zaj(this, paramInt, paramGoogleApiClient, paramOnConnectionFailedListener);
    paramGoogleApiClient.registerConnectionFailedListener(paramOnConnectionFailedListener);
    this.zad.put(paramInt, paramOnConnectionFailedListener);
    if ((this.zaa) && (localObject == null))
    {
      Log.d("AutoManageHelper", "connecting ".concat(paramGoogleApiClient.toString()));
      paramGoogleApiClient.connect();
    }
  }
  
  public final void zae(int paramInt)
  {
    zaj localzaj = (zaj)this.zad.get(paramInt);
    this.zad.remove(paramInt);
    if (localzaj != null)
    {
      localzaj.zab.unregisterConnectionFailedListener(localzaj);
      localzaj.zab.disconnect();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */