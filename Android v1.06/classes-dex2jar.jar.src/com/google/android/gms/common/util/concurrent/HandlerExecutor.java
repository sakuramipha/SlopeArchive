package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

public class HandlerExecutor
  implements Executor
{
  private final Handler zza;
  
  public HandlerExecutor(Looper paramLooper)
  {
    this.zza = new zzi(paramLooper);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    this.zza.post(paramRunnable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\concurrent\HandlerExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */