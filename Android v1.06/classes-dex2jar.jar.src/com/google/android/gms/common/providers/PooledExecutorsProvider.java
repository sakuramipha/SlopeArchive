package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class PooledExecutorsProvider
{
  private static PooledExecutorFactory zza;
  
  @Deprecated
  public static PooledExecutorFactory getInstance()
  {
    try
    {
      if (zza == null)
      {
        localObject1 = new com/google/android/gms/common/providers/zza;
        ((zza)localObject1).<init>();
        zza = (PooledExecutorFactory)localObject1;
      }
      Object localObject1 = zza;
      return (PooledExecutorFactory)localObject1;
    }
    finally {}
  }
  
  public static abstract interface PooledExecutorFactory
  {
    @Deprecated
    public abstract ScheduledExecutorService newSingleThreadScheduledExecutor();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\providers\PooledExecutorsProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */