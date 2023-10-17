package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;

@Deprecated
final class zzak
  extends zzeb
{
  private final ListenerHolder<Connections.ConnectionResponseCallback> zza;
  
  public zzak(ListenerHolder<Connections.ConnectionResponseCallback> paramListenerHolder)
  {
    this.zza = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
  }
  
  public final void zzb(zzfa paramzzfa)
  {
    this.zza.notifyListener(new zzaj(this, paramzzfa));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */