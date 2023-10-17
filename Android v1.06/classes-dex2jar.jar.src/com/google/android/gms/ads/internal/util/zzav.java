package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

final class zzav
  implements Runnable
{
  zzav(zzaw paramzzaw, Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void run()
  {
    zzt.zzp();
    AlertDialog.Builder localBuilder = zzs.zzG(this.zza);
    localBuilder.setMessage(this.zzb);
    if (this.zzc) {
      localBuilder.setTitle("Error");
    } else {
      localBuilder.setTitle("Info");
    }
    if (this.zzd)
    {
      localBuilder.setNeutralButton("Dismiss", null);
    }
    else
    {
      localBuilder.setPositiveButton("Learn More", new zzau(this));
      localBuilder.setNegativeButton("Dismiss", null);
    }
    localBuilder.create().show();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */