package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.nearby.messages.internal.zzq;

public final class zzhq
  extends zzq
{
  private final ListenerHolder<BaseImplementation.ResultHolder<Status>> zza;
  private boolean zzb = false;
  
  public zzhq(ListenerHolder<BaseImplementation.ResultHolder<Status>> paramListenerHolder)
  {
    this.zza = paramListenerHolder;
  }
  
  public final void zzd(Status paramStatus)
    throws RemoteException
  {
    try
    {
      if (!this.zzb)
      {
        ListenerHolder localListenerHolder = this.zza;
        localObject = new com/google/android/gms/internal/nearby/zzhp;
        ((zzhp)localObject).<init>(this, paramStatus);
        localListenerHolder.notifyListener((ListenerHolder.Notifier)localObject);
        this.zzb = true;
        return;
      }
      Object localObject = String.valueOf(paramStatus);
      int i = String.valueOf(localObject).length();
      paramStatus = new java/lang/StringBuilder;
      paramStatus.<init>(i + 28);
      paramStatus.append("Received multiple statuses: ");
      paramStatus.append((String)localObject);
      paramStatus = paramStatus.toString();
      localObject = new java/lang/Exception;
      ((Exception)localObject).<init>();
      Log.wtf("NearbyMessagesCallbackWrapper", paramStatus, (Throwable)localObject);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */