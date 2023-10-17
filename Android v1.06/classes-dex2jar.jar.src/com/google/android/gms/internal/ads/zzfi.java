package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

final class zzfi
  implements zzeh
{
  private Message zza;
  private zzfj zzb;
  
  private final void zzd()
  {
    this.zza = null;
    this.zzb = null;
    zzfj.zzl(this);
  }
  
  public final void zza()
  {
    Message localMessage = this.zza;
    Objects.requireNonNull(localMessage);
    localMessage.sendToTarget();
    zzd();
  }
  
  public final zzfi zzb(Message paramMessage, zzfj paramzzfj)
  {
    this.zza = paramMessage;
    this.zzb = paramzzfj;
    return this;
  }
  
  public final boolean zzc(Handler paramHandler)
  {
    Message localMessage = this.zza;
    Objects.requireNonNull(localMessage);
    boolean bool = paramHandler.sendMessageAtFrontOfQueue(localMessage);
    zzd();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */