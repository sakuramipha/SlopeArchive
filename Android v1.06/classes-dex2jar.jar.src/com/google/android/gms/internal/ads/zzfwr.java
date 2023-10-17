package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

final class zzfwr
  extends zzfvh
  implements RunnableFuture
{
  @CheckForNull
  private volatile zzfwa zza;
  
  zzfwr(zzfux paramzzfux)
  {
    this.zza = new zzfwp(this, paramzzfux);
  }
  
  zzfwr(Callable paramCallable)
  {
    this.zza = new zzfwq(this, paramCallable);
  }
  
  static zzfwr zzf(Runnable paramRunnable, Object paramObject)
  {
    return new zzfwr(Executors.callable(paramRunnable, paramObject));
  }
  
  public final void run()
  {
    zzfwa localzzfwa = this.zza;
    if (localzzfwa != null) {
      localzzfwa.run();
    }
    this.zza = null;
  }
  
  @CheckForNull
  protected final String zza()
  {
    Object localObject = this.zza;
    if (localObject != null)
    {
      localObject = localObject.toString();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("task=[");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    return super.zza();
  }
  
  protected final void zzb()
  {
    if (zzu())
    {
      zzfwa localzzfwa = this.zza;
      if (localzzfwa != null) {
        localzzfwa.zzh();
      }
    }
    this.zza = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */