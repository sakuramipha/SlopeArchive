package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory
  implements ThreadFactory
{
  private final String zza;
  private final ThreadFactory zzb = Executors.defaultThreadFactory();
  
  public NamedThreadFactory(String paramString)
  {
    Preconditions.checkNotNull(paramString, "Name must not be null");
    this.zza = paramString;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = this.zzb.newThread(new zza(paramRunnable, 0));
    paramRunnable.setName(this.zza);
    return paramRunnable;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\concurrent\NamedThreadFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */