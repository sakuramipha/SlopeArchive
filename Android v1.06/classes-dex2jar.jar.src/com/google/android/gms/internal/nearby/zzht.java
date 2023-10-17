package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.internal.zzx;

public final class zzht
  extends zzx
{
  private final ListenerHolder<StatusCallback> zza;
  
  public zzht(ListenerHolder<StatusCallback> paramListenerHolder)
  {
    this.zza = paramListenerHolder;
  }
  
  public final void zzd(boolean paramBoolean)
  {
    this.zza.notifyListener(new zzhs(this, paramBoolean));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */