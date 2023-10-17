package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzdcw;

public final class zzy
  extends zzbru
{
  private final AdOverlayInfoParcel zza;
  private final Activity zzb;
  private boolean zzc = false;
  private boolean zzd = false;
  
  public zzy(Activity paramActivity, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    this.zza = paramAdOverlayInfoParcel;
    this.zzb = paramActivity;
  }
  
  private final void zzb()
  {
    try
    {
      if (!this.zzd)
      {
        zzo localzzo = this.zza.zzc;
        if (localzzo != null) {
          localzzo.zzf(4);
        }
        this.zzd = true;
        return;
      }
      return;
    }
    finally {}
  }
  
  public final boolean zzF()
    throws RemoteException
  {
    return false;
  }
  
  public final void zzg(int paramInt1, int paramInt2, Intent paramIntent)
    throws RemoteException
  {}
  
  public final void zzh()
    throws RemoteException
  {}
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {}
  
  public final void zzk(Bundle paramBundle)
  {
    Object localObject = zzbbk.zzip;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      this.zzb.requestWindowFeature(1);
    }
    int j = 0;
    int i = j;
    if (paramBundle != null)
    {
      i = j;
      if (paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
        i = 1;
      }
    }
    localObject = this.zza;
    if (localObject == null)
    {
      this.zzb.finish();
      return;
    }
    if (i != 0)
    {
      this.zzb.finish();
      return;
    }
    if (paramBundle == null)
    {
      paramBundle = ((AdOverlayInfoParcel)localObject).zzb;
      if (paramBundle != null) {
        paramBundle.onAdClicked();
      }
      paramBundle = this.zza.zzy;
      if (paramBundle != null) {
        paramBundle.zzr();
      }
      if ((this.zzb.getIntent() != null) && (this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)))
      {
        paramBundle = this.zza.zzc;
        if (paramBundle != null) {
          paramBundle.zzb();
        }
      }
    }
    zzt.zzh();
    Activity localActivity = this.zzb;
    localObject = this.zza;
    paramBundle = ((AdOverlayInfoParcel)localObject).zza;
    if (!zza.zzb(localActivity, paramBundle, ((AdOverlayInfoParcel)localObject).zzi, paramBundle.zzi)) {
      this.zzb.finish();
    }
  }
  
  public final void zzl()
    throws RemoteException
  {
    if (this.zzb.isFinishing()) {
      zzb();
    }
  }
  
  public final void zzn()
    throws RemoteException
  {
    zzo localzzo = this.zza.zzc;
    if (localzzo != null) {
      localzzo.zzbo();
    }
    if (this.zzb.isFinishing()) {
      zzb();
    }
  }
  
  public final void zzo(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  public final void zzp()
    throws RemoteException
  {}
  
  public final void zzq()
    throws RemoteException
  {
    if (this.zzc)
    {
      this.zzb.finish();
      return;
    }
    this.zzc = true;
    zzo localzzo = this.zza.zzc;
    if (localzzo != null) {
      localzzo.zzbF();
    }
  }
  
  public final void zzr(Bundle paramBundle)
    throws RemoteException
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
  }
  
  public final void zzs()
    throws RemoteException
  {}
  
  public final void zzt()
    throws RemoteException
  {
    if (this.zzb.isFinishing()) {
      zzb();
    }
  }
  
  public final void zzu()
    throws RemoteException
  {
    zzo localzzo = this.zza.zzc;
    if (localzzo != null) {
      localzzo.zze();
    }
  }
  
  public final void zzw()
    throws RemoteException
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */