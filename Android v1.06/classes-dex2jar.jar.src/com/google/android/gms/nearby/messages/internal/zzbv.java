package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.SubscribeCallback;

final class zzbv
  extends zzaa
{
  private static final zzhr<SubscribeCallback> zza = new zzbu();
  private final ListenerHolder<SubscribeCallback> zzb;
  
  public zzbv(ListenerHolder<SubscribeCallback> paramListenerHolder)
  {
    this.zzb = paramListenerHolder;
  }
  
  public final void zzd()
  {
    this.zzb.notifyListener(zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */