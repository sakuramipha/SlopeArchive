package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

final class zzp
{
  private final Context zza;
  private final zzo zzb;
  
  zzp(Context paramContext, PurchasesUpdatedListener paramPurchasesUpdatedListener, zzc paramzzc)
  {
    this.zza = paramContext;
    this.zzb = new zzo(this, paramPurchasesUpdatedListener, paramzzc, null);
  }
  
  zzp(Context paramContext, zzbf paramzzbf)
  {
    this.zza = paramContext;
    this.zzb = new zzo(this, null, null);
  }
  
  final zzbf zzb()
  {
    zzo.zza(this.zzb);
    return null;
  }
  
  final PurchasesUpdatedListener zzc()
  {
    return zzo.zzb(this.zzb);
  }
  
  final void zzd()
  {
    this.zzb.zzd(this.zza);
  }
  
  final void zze()
  {
    IntentFilter localIntentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
    localIntentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
    this.zzb.zzc(this.zza, localIntentFilter);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */