package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzrb
  extends Handler
{
  final zzrd zza;
  
  zzrb(zzrd paramzzrd, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    zzrd.zza(this.zza, paramMessage);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */