package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zap
  extends LifecycleCallback
  implements DialogInterface.OnCancelListener
{
  protected volatile boolean zaa;
  protected final AtomicReference<zam> zab = new AtomicReference(null);
  protected final GoogleApiAvailability zac;
  private final Handler zad = new zaq(Looper.getMainLooper());
  
  zap(LifecycleFragment paramLifecycleFragment, GoogleApiAvailability paramGoogleApiAvailability)
  {
    super(paramLifecycleFragment);
    this.zac = paramGoogleApiAvailability;
  }
  
  private final void zaa(ConnectionResult paramConnectionResult, int paramInt)
  {
    this.zab.set(null);
    zab(paramConnectionResult, paramInt);
  }
  
  private final void zad()
  {
    this.zab.set(null);
    zac();
  }
  
  private static final int zae(zam paramzam)
  {
    if (paramzam == null) {
      return -1;
    }
    return paramzam.zaa();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    zam localzam = (zam)this.zab.get();
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        paramInt1 = this.zac.isGooglePlayServicesAvailable(getActivity());
        if (paramInt1 == 0)
        {
          zad();
          return;
        }
        if (localzam == null) {
          return;
        }
        if ((localzam.zab().getErrorCode() != 18) || (paramInt1 != 18)) {}
      }
    }
    else
    {
      if (paramInt2 == -1)
      {
        zad();
        return;
      }
      if (paramInt2 == 0)
      {
        if (localzam == null) {
          return;
        }
        paramInt1 = 13;
        if (paramIntent != null) {
          paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
        }
        zaa(new ConnectionResult(paramInt1, null, localzam.zab().toString()), zae(localzam));
        return;
      }
    }
    if (localzam != null) {
      zaa(localzam.zab(), localzam.zaa());
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    zaa(new ConnectionResult(13, null), zae((zam)this.zab.get()));
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      AtomicReference localAtomicReference = this.zab;
      if (paramBundle.getBoolean("resolving_error", false)) {
        paramBundle = new zam(new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution")), paramBundle.getInt("failed_client_id", -1));
      } else {
        paramBundle = null;
      }
      localAtomicReference.set(paramBundle);
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    zam localzam = (zam)this.zab.get();
    if (localzam == null) {
      return;
    }
    paramBundle.putBoolean("resolving_error", true);
    paramBundle.putInt("failed_client_id", localzam.zaa());
    paramBundle.putInt("failed_status", localzam.zab().getErrorCode());
    paramBundle.putParcelable("failed_resolution", localzam.zab().getResolution());
  }
  
  public void onStart()
  {
    super.onStart();
    this.zaa = true;
  }
  
  public void onStop()
  {
    super.onStop();
    this.zaa = false;
  }
  
  protected abstract void zab(ConnectionResult paramConnectionResult, int paramInt);
  
  protected abstract void zac();
  
  public final void zah(ConnectionResult paramConnectionResult, int paramInt)
  {
    paramConnectionResult = new zam(paramConnectionResult, paramInt);
    if (this.zab.compareAndSet(null, paramConnectionResult)) {
      this.zad.post(new zao(this, paramConnectionResult));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */