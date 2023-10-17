package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzakz
{
  private final Executor zza;
  
  public zzakz(Handler paramHandler)
  {
    this.zza = new zzakx(this, paramHandler);
  }
  
  public final void zza(zzali paramzzali, zzalr paramzzalr)
  {
    paramzzali.zzm("post-error");
    zzalo localzzalo = zzalo.zza(paramzzalr);
    paramzzalr = this.zza;
    paramzzali = new zzaky(paramzzali, localzzalo, null);
    ((zzakx)paramzzalr).zza.post(paramzzali);
  }
  
  public final void zzb(zzali paramzzali, zzalo paramzzalo, Runnable paramRunnable)
  {
    paramzzali.zzq();
    paramzzali.zzm("post-response");
    Executor localExecutor = this.zza;
    paramzzali = new zzaky(paramzzali, paramzzalo, paramRunnable);
    ((zzakx)localExecutor).zza.post(paramzzali);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */