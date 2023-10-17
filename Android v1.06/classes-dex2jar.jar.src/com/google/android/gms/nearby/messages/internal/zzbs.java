package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.PublishCallback;

final class zzbs
  extends zzu
{
  private static final zzhr<PublishCallback> zza = new zzbr();
  private final ListenerHolder<PublishCallback> zzb;
  
  public zzbs(ListenerHolder<PublishCallback> paramListenerHolder)
  {
    this.zzb = paramListenerHolder;
  }
  
  public final void zzd()
  {
    this.zzb.notifyListener(zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */