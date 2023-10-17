package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class zzdi
  implements ThreadFactory
{
  private final ThreadFactory zza = Executors.defaultThreadFactory();
  
  zzdi(zzee paramzzee) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = this.zza.newThread(paramRunnable);
    paramRunnable.setName("ScionFrontendApi");
    return paramRunnable;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */