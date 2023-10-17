package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections.MessageListener;

@Deprecated
final class zzav
  extends zzdv
{
  private final Context zza;
  private final ListenerHolder<Connections.MessageListener> zzb;
  
  zzav(Context paramContext, ListenerHolder<Connections.MessageListener> paramListenerHolder)
  {
    this.zza = ((Context)Preconditions.checkNotNull(paramContext));
    this.zzb = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
  }
  
  public final void zzb(zzfm paramzzfm)
  {
    this.zzb.notifyListener(new zzat(this, paramzzfm));
  }
  
  public final void zzc(zzfe paramzzfe)
  {
    this.zzb.notifyListener(new zzau(this, paramzzfe));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */