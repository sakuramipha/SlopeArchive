package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzcag
{
  public static final zzfwc zza;
  public static final zzfwc zzb;
  public static final zzfwc zzc;
  public static final ScheduledExecutorService zzd = new zzcab(3, new zzcac("Schedule"));
  public static final zzfwc zze = new zzcaf(new zzcad(), null);
  public static final zzfwc zzf = new zzcaf(zzfwi.zzb(), null);
  
  static
  {
    Object localObject;
    if (ClientLibraryUtils.isPackageSide())
    {
      zzflu.zza();
      localObject = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcac("Default")));
    }
    else
    {
      localObject = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcac("Default"));
    }
    zza = new zzcaf((Executor)localObject, null);
    if (ClientLibraryUtils.isPackageSide())
    {
      localObject = zzflu.zza().zzc(5, new zzcac("Loader"), 1);
    }
    else
    {
      localObject = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcac("Loader"));
      ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    }
    zzb = new zzcaf((Executor)localObject, null);
    if (ClientLibraryUtils.isPackageSide())
    {
      localObject = zzflu.zza().zzb(new zzcac("Activeview"), 1);
    }
    else
    {
      localObject = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcac("Activeview"));
      ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    }
    zzc = new zzcaf((Executor)localObject, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */