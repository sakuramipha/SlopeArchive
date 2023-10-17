package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;

public final class zaae
  extends zap
{
  private final ArraySet<ApiKey<?>> zad = new ArraySet();
  private final GoogleApiManager zae;
  
  zaae(LifecycleFragment paramLifecycleFragment, GoogleApiManager paramGoogleApiManager, GoogleApiAvailability paramGoogleApiAvailability)
  {
    super(paramLifecycleFragment, paramGoogleApiAvailability);
    this.zae = paramGoogleApiManager;
    this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
  }
  
  public static void zad(Activity paramActivity, GoogleApiManager paramGoogleApiManager, ApiKey<?> paramApiKey)
  {
    LifecycleFragment localLifecycleFragment = getFragment(paramActivity);
    zaae localzaae = (zaae)localLifecycleFragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
    paramActivity = localzaae;
    if (localzaae == null) {
      paramActivity = new zaae(localLifecycleFragment, paramGoogleApiManager, GoogleApiAvailability.getInstance());
    }
    Preconditions.checkNotNull(paramApiKey, "ApiKey cannot be null");
    paramActivity.zad.add(paramApiKey);
    paramGoogleApiManager.zaC(paramActivity);
  }
  
  private final void zae()
  {
    if (!this.zad.isEmpty()) {
      this.zae.zaC(this);
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    zae();
  }
  
  public final void onStart()
  {
    super.onStart();
    zae();
  }
  
  public final void onStop()
  {
    super.onStop();
    this.zae.zaD(this);
  }
  
  final ArraySet<ApiKey<?>> zaa()
  {
    return this.zad;
  }
  
  protected final void zab(ConnectionResult paramConnectionResult, int paramInt)
  {
    this.zae.zaz(paramConnectionResult, paramInt);
  }
  
  protected final void zac()
  {
    this.zae.zaA();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */