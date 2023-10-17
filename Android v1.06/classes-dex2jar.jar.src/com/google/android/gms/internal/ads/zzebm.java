package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

final class zzebm
  extends TimerTask
{
  final AlertDialog zza;
  
  zzebm(AlertDialog paramAlertDialog, Timer paramTimer, zzl paramzzl) {}
  
  public final void run()
  {
    this.zza.dismiss();
    this.zzb.cancel();
    zzl localzzl = this.zzc;
    if (localzzl != null) {
      localzzl.zzb();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzebm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */