package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdig
  implements View.OnClickListener
{
  String zza;
  Long zzb;
  WeakReference zzc;
  private final zzdlz zzd;
  private final Clock zze;
  private zzbgk zzf;
  private zzbii zzg;
  
  public zzdig(zzdlz paramzzdlz, Clock paramClock)
  {
    this.zzd = paramzzdlz;
    this.zze = paramClock;
  }
  
  private final void zzd()
  {
    this.zza = null;
    this.zzb = null;
    Object localObject = this.zzc;
    if (localObject == null) {
      return;
    }
    localObject = (View)((WeakReference)localObject).get();
    if (localObject == null) {
      return;
    }
    ((View)localObject).setClickable(false);
    ((View)localObject).setOnClickListener(null);
    this.zzc = null;
  }
  
  public final void onClick(View paramView)
  {
    WeakReference localWeakReference = this.zzc;
    if ((localWeakReference != null) && (localWeakReference.get() == paramView))
    {
      if ((this.zza != null) && (this.zzb != null))
      {
        paramView = new HashMap();
        paramView.put("id", this.zza);
        paramView.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
        paramView.put("messageType", "onePointFiveClick");
        this.zzd.zzg("sendMessageToNativeJs", paramView);
      }
      zzd();
    }
  }
  
  public final zzbgk zza()
  {
    return this.zzf;
  }
  
  public final void zzb()
  {
    if (this.zzf == null) {
      return;
    }
    if (this.zzb == null) {
      return;
    }
    zzd();
    try
    {
      this.zzf.zze();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzc(zzbgk paramzzbgk)
  {
    this.zzf = paramzzbgk;
    zzbii localzzbii = this.zzg;
    if (localzzbii != null) {
      this.zzd.zzk("/unconfirmedClick", localzzbii);
    }
    paramzzbgk = new zzdif(this, paramzzbgk);
    this.zzg = paramzzbgk;
    this.zzd.zzi("/unconfirmedClick", paramzzbgk);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */