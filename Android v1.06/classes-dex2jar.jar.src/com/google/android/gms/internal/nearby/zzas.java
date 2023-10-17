package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;

final class zzas
  extends zzef
{
  private final ListenerHolder<Connections.EndpointDiscoveryListener> zza;
  
  zzas(ListenerHolder<Connections.EndpointDiscoveryListener> paramListenerHolder)
  {
    this.zza = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
  }
  
  public final void zzb(zzfg paramzzfg) {}
  
  public final void zzc(zzfi paramzzfi)
  {
    this.zza.notifyListener(new zzaq(this, paramzzfi));
  }
  
  public final void zzd(zzfk paramzzfk)
  {
    this.zza.notifyListener(new zzar(this, paramzzfk));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */