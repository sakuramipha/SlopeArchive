package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

final class zzcad
  implements Executor
{
  private final Handler zza = new zzf(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      try
      {
        paramRunnable.run();
        return;
      }
      finally
      {
        zzt.zzp();
        zzs.zzI(zzt.zzo().zzc(), paramRunnable);
      }
    }
    this.zza.post(paramRunnable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */