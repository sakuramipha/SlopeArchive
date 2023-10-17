package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

final class zzhk
  extends BroadcastReceiver
  implements Runnable
{
  final zzhm zza;
  private final zzhl zzb;
  private final Handler zzc;
  
  public zzhk(zzhm paramzzhm, Handler paramHandler, zzhl paramzzhl)
  {
    this.zzc = paramHandler;
    this.zzb = paramzzhl;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
      this.zzc.post(this);
    }
  }
  
  public final void run() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */