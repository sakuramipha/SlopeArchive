package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

final class zzu
  implements Executor
{
  private final Handler zza = new zza(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable)
  {
    this.zza.post(paramRunnable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */