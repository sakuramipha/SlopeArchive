package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zacc
  extends zap
{
  private TaskCompletionSource<Void> zad = new TaskCompletionSource();
  
  private zacc(LifecycleFragment paramLifecycleFragment)
  {
    super(paramLifecycleFragment, GoogleApiAvailability.getInstance());
    this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
  }
  
  public static zacc zaa(Activity paramActivity)
  {
    paramActivity = getFragment(paramActivity);
    zacc localzacc = (zacc)paramActivity.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
    if (localzacc != null)
    {
      if (localzacc.zad.getTask().isComplete()) {
        localzacc.zad = new TaskCompletionSource();
      }
      return localzacc;
    }
    return new zacc(paramActivity);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    this.zad.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
  }
  
  protected final void zab(ConnectionResult paramConnectionResult, int paramInt)
  {
    String str2 = paramConnectionResult.getErrorMessage();
    String str1 = str2;
    if (str2 == null) {
      str1 = "Error connecting to Google Play services";
    }
    this.zad.setException(new ApiException(new Status(paramConnectionResult, str1, paramConnectionResult.getErrorCode())));
  }
  
  protected final void zac()
  {
    Activity localActivity = this.mLifecycleFragment.getLifecycleActivity();
    if (localActivity == null)
    {
      this.zad.trySetException(new ApiException(new Status(8)));
      return;
    }
    int i = this.zac.isGooglePlayServicesAvailable(localActivity);
    if (i == 0)
    {
      this.zad.trySetResult(null);
      return;
    }
    if (!this.zad.getTask().isComplete()) {
      zah(new ConnectionResult(i, null), 0);
    }
  }
  
  public final Task<Void> zad()
  {
    return this.zad.getTask();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zacc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */