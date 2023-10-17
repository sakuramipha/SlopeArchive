package com.google.android.gms.internal.nearby;

import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfx
{
  private final ExecutorService zza;
  private volatile InputStream zzb;
  private volatile boolean zzc;
  private final SimpleArrayMap<Long, OutputStream> zzd;
  private final SimpleArrayMap<Long, zzgd> zze;
  
  public zzfx()
  {
    zzg.zza();
    Object localObject = Executors.defaultThreadFactory();
    localObject = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    this.zza = Executors.unconfigurableExecutorService((ExecutorService)localObject);
    this.zzb = null;
    this.zzc = false;
    this.zzd = new SimpleArrayMap();
    this.zze = new SimpleArrayMap();
  }
  
  final void zza(InputStream paramInputStream, OutputStream paramOutputStream1, OutputStream paramOutputStream2, zzgd paramzzgd, long paramLong)
  {
    try
    {
      SimpleArrayMap localSimpleArrayMap = this.zzd;
      Object localObject = Long.valueOf(paramLong);
      localSimpleArrayMap.put(localObject, paramOutputStream1);
      this.zze.put(localObject, paramzzgd);
      paramzzgd = this.zza;
      localObject = new com/google/android/gms/internal/nearby/zzfw;
      ((zzfw)localObject).<init>(this, paramInputStream, paramOutputStream1, paramLong, paramOutputStream2);
      paramzzgd.execute((Runnable)localObject);
      return;
    }
    finally
    {
      paramInputStream = finally;
      throw paramInputStream;
    }
  }
  
  final void zzb(long paramLong)
  {
    try
    {
      Object localObject1 = this.zzd;
      Long localLong = Long.valueOf(paramLong);
      IOUtils.closeQuietly((Closeable)((SimpleArrayMap)localObject1).get(localLong));
      this.zzd.remove(localLong);
      localObject1 = (zzgd)this.zze.remove(localLong);
      if (localObject1 != null)
      {
        IOUtils.closeQuietly(((zzgd)localObject1).zzd());
        IOUtils.closeQuietly(((zzgd)localObject1).zzg());
        return;
      }
      return;
    }
    finally {}
  }
  
  final void zzc()
  {
    try
    {
      this.zzc = true;
      this.zza.shutdownNow();
      IOUtils.closeQuietly(this.zzb);
      int j = 0;
      for (int i = 0; i < this.zzd.size(); i++) {
        IOUtils.closeQuietly((Closeable)this.zzd.valueAt(i));
      }
      this.zzd.clear();
      for (i = j; i < this.zze.size(); i++)
      {
        zzgd localzzgd = (zzgd)this.zze.valueAt(i);
        IOUtils.closeQuietly(localzzgd.zzd());
        IOUtils.closeQuietly(localzzgd.zzg());
      }
      this.zze.clear();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */