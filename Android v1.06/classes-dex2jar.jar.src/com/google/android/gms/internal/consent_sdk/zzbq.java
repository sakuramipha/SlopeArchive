package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentForm.OnConsentFormDismissedListener;
import com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus;
import com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbq
{
  private final zzdr zza;
  private final Executor zzb;
  private final AtomicReference zzc = new AtomicReference();
  private final AtomicReference zzd = new AtomicReference();
  
  zzbq(zzdr paramzzdr, Executor paramExecutor)
  {
    this.zza = paramzzdr;
    this.zzb = paramExecutor;
  }
  
  public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener paramOnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener paramOnConsentFormLoadFailureListener)
  {
    zzct.zza();
    zzbs localzzbs = (zzbs)this.zzc.get();
    if (localzzbs == null)
    {
      paramOnConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzi(3, "No available form can be built.").zza());
      return;
    }
    Object localObject = this.zza.zzb();
    ((zzay)localObject).zza(localzzbs);
    ((zzay)localObject).zzb().zza().zzb(paramOnConsentFormLoadSuccessListener, paramOnConsentFormLoadFailureListener);
  }
  
  public final void zzc()
  {
    Object localObject1 = (zzbs)this.zzc.get();
    if (localObject1 == null)
    {
      Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
      return;
    }
    Object localObject2 = this.zza.zzb();
    ((zzay)localObject2).zza((zzbs)localObject1);
    localObject1 = ((zzay)localObject2).zzb().zza();
    ((zzbe)localObject1).zza = true;
    zzct.zza.post(new zzbk(this, (zzbe)localObject1));
  }
  
  public final void zzd(zzbs paramzzbs)
  {
    this.zzc.set(paramzzbs);
  }
  
  public final void zze(Activity paramActivity, ConsentForm.OnConsentFormDismissedListener paramOnConsentFormDismissedListener)
  {
    zzct.zza();
    Object localObject = zzc.zza(paramActivity).zzb();
    if (localObject == null)
    {
      zzct.zza.post(new zzbl(paramOnConsentFormDismissedListener));
      return;
    }
    if ((!((zzl)localObject).isConsentFormAvailable()) && (((zzl)localObject).getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED))
    {
      zzct.zza.post(new zzbm(paramOnConsentFormDismissedListener));
      ((zzl)localObject).zza(paramActivity);
      return;
    }
    if (((zzl)localObject).getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED)
    {
      zzct.zza.post(new zzbn(paramOnConsentFormDismissedListener));
      return;
    }
    localObject = (ConsentForm)this.zzd.get();
    if (localObject == null)
    {
      zzct.zza.post(new zzbo(paramOnConsentFormDismissedListener));
      return;
    }
    ((ConsentForm)localObject).show(paramActivity, paramOnConsentFormDismissedListener);
    this.zzb.execute(new zzbp(this));
  }
  
  public final boolean zzf()
  {
    return this.zzc.get() != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */