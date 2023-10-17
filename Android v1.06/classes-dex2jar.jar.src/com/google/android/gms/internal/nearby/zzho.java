package com.google.android.gms.internal.nearby;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.internal.Update;
import com.google.android.gms.nearby.messages.internal.zzn;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzho
  extends zzn
{
  private final ListenerHolder<MessageListener> zza;
  
  public zzho(ListenerHolder<MessageListener> paramListenerHolder)
  {
    this.zza = paramListenerHolder;
  }
  
  public static void zzb(Iterable<Update> paramIterable, MessageListener paramMessageListener)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      Update localUpdate = (Update)paramIterable.next();
      if (localUpdate.zza(1)) {
        paramMessageListener.onFound(localUpdate.zzc);
      }
      if (localUpdate.zza(2)) {
        paramMessageListener.onLost(localUpdate.zzc);
      }
      if (localUpdate.zza(4)) {
        paramMessageListener.onDistanceChanged(localUpdate.zzc, localUpdate.zzd);
      }
      if (localUpdate.zza(8)) {
        paramMessageListener.onBleSignalChanged(localUpdate.zzc, localUpdate.zze);
      }
      if (localUpdate.zza(16))
      {
        Object localObject = localUpdate.zzc;
        localObject = localUpdate.zzf;
      }
    }
  }
  
  public static void zzc(Intent paramIntent, MessageListener paramMessageListener)
  {
    paramIntent = paramIntent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
    if (paramIntent == null) {
      paramIntent = Collections.emptyList();
    } else {
      paramIntent = paramIntent.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES");
    }
    zzb(paramIntent, paramMessageListener);
  }
  
  public final void zzd(List<Update> paramList)
    throws RemoteException
  {
    this.zza.notifyListener(new zzhn(this, paramList));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */