package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentForm.OnConsentFormDismissedListener;
import com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbe
  implements ConsentForm
{
  boolean zza = false;
  private final Application zzb;
  private final zzae zzc;
  private final zzby zzd;
  private final zzas zze;
  private final zzbs zzf;
  private final zzdr zzg;
  private Dialog zzh;
  private zzbw zzi;
  private final AtomicBoolean zzj = new AtomicBoolean();
  private final AtomicReference zzk = new AtomicReference();
  private final AtomicReference zzl = new AtomicReference();
  private final AtomicReference zzm = new AtomicReference();
  
  public zzbe(Application paramApplication, zzae paramzzae, zzby paramzzby, zzas paramzzas, zzbs paramzzbs, zzdr paramzzdr)
  {
    this.zzb = paramApplication;
    this.zzc = paramzzae;
    this.zzd = paramzzby;
    this.zze = paramzzas;
    this.zzf = paramzzbs;
    this.zzg = paramzzdr;
  }
  
  private final void zzg()
  {
    Object localObject = this.zzh;
    if (localObject != null)
    {
      ((Dialog)localObject).dismiss();
      this.zzh = null;
    }
    this.zzd.zza(null);
    localObject = (zzbb)this.zzm.getAndSet(null);
    if (localObject != null) {
      ((zzbb)localObject).zza.zzb.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
    }
  }
  
  public final void show(Activity paramActivity, ConsentForm.OnConsentFormDismissedListener paramOnConsentFormDismissedListener)
  {
    
    if (!this.zzj.compareAndSet(false, true))
    {
      if (true != this.zza) {
        paramActivity = "ConsentForm#show can only be invoked once.";
      } else {
        paramActivity = "Privacy options form is being loading. Please try again later.";
      }
      paramOnConsentFormDismissedListener.onConsentFormDismissed(new zzi(3, paramActivity).zza());
      return;
    }
    Object localObject = new zzbb(this, paramActivity);
    this.zzb.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
    this.zzm.set(localObject);
    this.zzd.zza(paramActivity);
    paramActivity = new Dialog(paramActivity, 16973840);
    paramActivity.setContentView(this.zzi);
    paramActivity.setCancelable(false);
    localObject = paramActivity.getWindow();
    if (localObject == null)
    {
      paramOnConsentFormDismissedListener.onConsentFormDismissed(new zzi(3, "Activity with null windows is passed in.").zza());
      return;
    }
    ((Window)localObject).setLayout(-1, -1);
    ((Window)localObject).setBackgroundDrawable(new ColorDrawable(0));
    ((Window)localObject).setFlags(16777216, 16777216);
    this.zzl.set(paramOnConsentFormDismissedListener);
    paramActivity.show();
    this.zzh = paramActivity;
    this.zzi.zzc("UMP_messagePresented", "");
  }
  
  final zzbw zza()
  {
    return this.zzi;
  }
  
  final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener paramOnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener paramOnConsentFormLoadFailureListener)
  {
    zzbw localzzbw = ((zzbx)this.zzg).zza();
    this.zzi = localzzbw;
    localzzbw.setBackgroundColor(0);
    localzzbw.getSettings().setJavaScriptEnabled(true);
    localzzbw.setWebViewClient(new zzbv(localzzbw, null));
    this.zzk.set(new zzbd(paramOnConsentFormLoadSuccessListener, paramOnConsentFormLoadFailureListener, null));
    this.zzi.loadDataWithBaseURL(this.zzf.zza(), this.zzf.zzb(), "text/html", "UTF-8", null);
    zzct.zza.postDelayed(new zzba(this), 10000L);
  }
  
  final void zzc(int paramInt)
  {
    zzg();
    ConsentForm.OnConsentFormDismissedListener localOnConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener)this.zzl.getAndSet(null);
    if (localOnConsentFormDismissedListener == null) {
      return;
    }
    this.zze.zzg(3);
    localOnConsentFormDismissedListener.onConsentFormDismissed(null);
  }
  
  final void zzd(zzi paramzzi)
  {
    zzg();
    ConsentForm.OnConsentFormDismissedListener localOnConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener)this.zzl.getAndSet(null);
    if (localOnConsentFormDismissedListener == null) {
      return;
    }
    localOnConsentFormDismissedListener.onConsentFormDismissed(paramzzi.zza());
  }
  
  final void zze()
  {
    zzbd localzzbd = (zzbd)this.zzk.getAndSet(null);
    if (localzzbd == null) {
      return;
    }
    localzzbd.onConsentFormLoadSuccess(this);
  }
  
  final void zzf(zzi paramzzi)
  {
    zzbd localzzbd = (zzbd)this.zzk.getAndSet(null);
    if (localzzbd == null) {
      return;
    }
    localzzbd.onConsentFormLoadFailure(paramzzi.zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */