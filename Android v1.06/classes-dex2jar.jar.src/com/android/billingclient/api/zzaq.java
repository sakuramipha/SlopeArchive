package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;

final class zzaq
  implements ServiceConnection
{
  final BillingClientImpl zza;
  private final Object zzb;
  private boolean zzc;
  private BillingClientStateListener zzd;
  
  private final void zzd(BillingResult paramBillingResult)
  {
    synchronized (this.zzb)
    {
      BillingClientStateListener localBillingClientStateListener = this.zzd;
      if (localBillingClientStateListener != null) {
        localBillingClientStateListener.onBillingSetupFinished(paramBillingResult);
      }
      return;
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    zzb.zzn("BillingClient", "Billing service connected.");
    BillingClientImpl.zzB(this.zza, zzd.zzo(paramIBinder));
    paramComponentName = this.zza;
    if (BillingClientImpl.zzp(paramComponentName, new zzan(this), 30000L, new zzao(this), BillingClientImpl.zzf(paramComponentName)) == null) {
      zzd(BillingClientImpl.zzh(this.zza));
    }
  }
  
  public final void onServiceDisconnected(ComponentName arg1)
  {
    zzb.zzo("BillingClient", "Billing service disconnected.");
    BillingClientImpl.zzB(this.zza, null);
    BillingClientImpl.zzq(this.zza, 0);
    synchronized (this.zzb)
    {
      BillingClientStateListener localBillingClientStateListener = this.zzd;
      if (localBillingClientStateListener != null) {
        localBillingClientStateListener.onBillingServiceDisconnected();
      }
      return;
    }
  }
  
  final void zzc()
  {
    synchronized (this.zzb)
    {
      this.zzd = null;
      this.zzc = true;
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */