package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

final class zzq
  implements Handler.Callback
{
  final zzr zza;
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i != 0)
    {
      if (i != 1) {
        return false;
      }
      synchronized (zzr.zzh(this.zza))
      {
        zzn localzzn = (zzn)paramMessage.obj;
        zzo localzzo = (zzo)zzr.zzh(this.zza).get(localzzn);
        if ((localzzo != null) && (localzzo.zza() == 3))
        {
          ??? = String.valueOf(localzzn);
          i = String.valueOf(???).length();
          paramMessage = new java/lang/StringBuilder;
          paramMessage.<init>(i + 47);
          paramMessage.append("Timeout waiting for ServiceConnection callback ");
          paramMessage.append((String)???);
          ??? = new java/lang/Exception;
          ((Exception)???).<init>();
          Log.e("GmsClientSupervisor", paramMessage.toString(), (Throwable)???);
          ??? = localzzo.zzb();
          paramMessage = (Message)???;
          if (??? == null) {
            paramMessage = localzzn.zzb();
          }
          ??? = paramMessage;
          if (paramMessage == null)
          {
            ??? = new android/content/ComponentName;
            paramMessage = localzzn.zzd();
            Preconditions.checkNotNull(paramMessage);
            ((ComponentName)???).<init>(paramMessage, "unknown");
          }
          localzzo.onServiceDisconnected((ComponentName)???);
        }
        return true;
      }
    }
    synchronized (zzr.zzh(this.zza))
    {
      ??? = (zzn)paramMessage.obj;
      paramMessage = (zzo)zzr.zzh(this.zza).get(???);
      if ((paramMessage != null) && (paramMessage.zzi()))
      {
        if (paramMessage.zzj()) {
          paramMessage.zzg("GmsClientSupervisor");
        }
        zzr.zzh(this.zza).remove(???);
      }
      return true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */