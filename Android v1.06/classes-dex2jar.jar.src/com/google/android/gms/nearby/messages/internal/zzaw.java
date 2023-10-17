package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;

final class zzaw
  extends zzbd
{
  final zzbg zzb;
  
  zzaw(zzbg paramzzbg, ListenerHolder paramListenerHolder1, ListenerHolder paramListenerHolder2)
  {
    super(paramListenerHolder1);
  }
  
  public final void zzd()
  {
    ListenerHolder.ListenerKey localListenerKey = this.zza.getListenerKey();
    if (localListenerKey != null) {
      this.zzb.doUnregisterEventListener(localListenerKey);
    }
    super.zzd();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */