package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.PublishCallback;

class zzbd
  extends zzu
{
  private static final zzhr<PublishCallback> zza = new zzbc();
  private final ListenerHolder<PublishCallback> zzb;
  
  public zzbd(ListenerHolder<PublishCallback> paramListenerHolder)
  {
    this.zzb = paramListenerHolder;
  }
  
  public void zzd()
  {
    ListenerHolder localListenerHolder = this.zzb;
    if (localListenerHolder != null) {
      localListenerHolder.notifyListener(zza);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */