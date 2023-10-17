package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;

@Deprecated
final class zzai
  extends zzds
{
  private final ListenerHolder<Connections.ConnectionRequestListener> zza;
  
  zzai(ListenerHolder<Connections.ConnectionRequestListener> paramListenerHolder)
  {
    this.zza = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
  }
  
  public final void zzb(zzey paramzzey)
  {
    this.zza.notifyListener(new zzah(this, paramzzey));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */