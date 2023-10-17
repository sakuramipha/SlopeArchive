package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.atomic.AtomicInteger;

final class zzb
  extends zzi
{
  final BaseGmsClient zza;
  
  public zzb(BaseGmsClient paramBaseGmsClient, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private static final void zza(Message paramMessage)
  {
    paramMessage = (zzc)paramMessage.obj;
    paramMessage.zzc();
    paramMessage.zzg();
  }
  
  private static final boolean zzb(Message paramMessage)
  {
    return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 7);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (this.zza.zzd.get() != paramMessage.arg1)
    {
      if (zzb(paramMessage)) {
        zza(paramMessage);
      }
      return;
    }
    if (((paramMessage.what != 1) && (paramMessage.what != 7) && ((paramMessage.what != 4) || (this.zza.enableLocalFallback())) && (paramMessage.what != 5)) || (this.zza.isConnecting()))
    {
      int i = paramMessage.what;
      Object localObject = null;
      if (i == 4)
      {
        BaseGmsClient.zzg(this.zza, new ConnectionResult(paramMessage.arg2));
        if (BaseGmsClient.zzo(this.zza))
        {
          paramMessage = this.zza;
          if (!BaseGmsClient.zzm(paramMessage))
          {
            BaseGmsClient.zzi(paramMessage, 3, null);
            return;
          }
        }
        paramMessage = this.zza;
        if (BaseGmsClient.zza(paramMessage) != null) {
          paramMessage = BaseGmsClient.zza(paramMessage);
        } else {
          paramMessage = new ConnectionResult(8);
        }
        this.zza.zzc.onReportServiceBinding(paramMessage);
        this.zza.onConnectionFailed(paramMessage);
        return;
      }
      if (paramMessage.what == 5)
      {
        paramMessage = this.zza;
        if (BaseGmsClient.zza(paramMessage) != null) {
          paramMessage = BaseGmsClient.zza(paramMessage);
        } else {
          paramMessage = new ConnectionResult(8);
        }
        this.zza.zzc.onReportServiceBinding(paramMessage);
        this.zza.onConnectionFailed(paramMessage);
        return;
      }
      if (paramMessage.what == 3)
      {
        if ((paramMessage.obj instanceof PendingIntent)) {
          localObject = (PendingIntent)paramMessage.obj;
        }
        paramMessage = new ConnectionResult(paramMessage.arg2, (PendingIntent)localObject);
        this.zza.zzc.onReportServiceBinding(paramMessage);
        this.zza.onConnectionFailed(paramMessage);
        return;
      }
      if (paramMessage.what == 6)
      {
        BaseGmsClient.zzi(this.zza, 5, null);
        localObject = this.zza;
        if (BaseGmsClient.zzb((BaseGmsClient)localObject) != null) {
          BaseGmsClient.zzb((BaseGmsClient)localObject).onConnectionSuspended(paramMessage.arg2);
        }
        this.zza.onConnectionSuspended(paramMessage.arg2);
        BaseGmsClient.zzn(this.zza, 5, 1, null);
        return;
      }
      if ((paramMessage.what == 2) && (!this.zza.isConnected()))
      {
        zza(paramMessage);
        return;
      }
      if (zzb(paramMessage))
      {
        ((zzc)paramMessage.obj).zze();
        return;
      }
      i = paramMessage.what;
      paramMessage = new StringBuilder(45);
      paramMessage.append("Don't know how to handle message: ");
      paramMessage.append(i);
      localObject = new Exception();
      Log.wtf("GmsClient", paramMessage.toString(), (Throwable)localObject);
      return;
    }
    zza(paramMessage);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */