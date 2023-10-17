package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzr
  extends BroadcastReceiver
{
  final zzs zza;
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction()))
    {
      zzs.zze(this.zza, true);
      return;
    }
    if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction())) {
      zzs.zze(this.zza, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */