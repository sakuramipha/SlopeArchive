package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.annotation.CheckForNull;

abstract class zzfun
  extends zzfvh
  implements Runnable
{
  public static final int zzc = 0;
  @CheckForNull
  zzfwb zza;
  @CheckForNull
  Object zzb;
  
  zzfun(zzfwb paramzzfwb, Object paramObject)
  {
    Objects.requireNonNull(paramzzfwb);
    this.zza = paramzzfwb;
    Objects.requireNonNull(paramObject);
    this.zzb = paramObject;
  }
  
  public final void run()
  {
    Object localObject3 = this.zza;
    Object localObject1 = this.zzb;
    boolean bool2 = isCancelled();
    int i = 1;
    boolean bool1;
    if (localObject3 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if (localObject1 != null) {
      i = 0;
    }
    if ((bool2 | bool1 | i)) {
      return;
    }
    this.zza = null;
    if (((zzfwb)localObject3).isCancelled())
    {
      zzt((zzfwb)localObject3);
      return;
    }
    try
    {
      localObject3 = zzfvr.zzo((Future)localObject3);
      try
      {
        localObject1 = zzf(localObject1, localObject3);
        this.zzb = null;
        zzg(localObject1);
        return;
      }
      finally
      {
        try
        {
          zzfwj.zza(localThrowable);
          zze(localThrowable);
          return;
        }
        finally
        {
          this.zzb = null;
        }
      }
      return;
    }
    catch (Error localError)
    {
      zze(localError);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      zze(localRuntimeException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      zze(localExecutionException.getCause());
      return;
    }
    catch (CancellationException localCancellationException)
    {
      cancel(false);
    }
  }
  
  @CheckForNull
  protected final String zza()
  {
    Object localObject1 = this.zza;
    Object localObject3 = this.zzb;
    Object localObject2 = super.zza();
    if (localObject1 != null)
    {
      localObject1 = localObject1.toString();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("inputFuture=[");
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append("], ");
      localObject1 = localStringBuilder.toString();
    }
    else
    {
      localObject1 = "";
    }
    if (localObject3 != null)
    {
      localObject3 = localObject3.toString();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("function=[");
      ((StringBuilder)localObject2).append((String)localObject3);
      ((StringBuilder)localObject2).append("]");
      return ((StringBuilder)localObject2).toString();
    }
    if (localObject2 != null) {
      return ((String)localObject1).concat((String)localObject2);
    }
    return null;
  }
  
  protected final void zzb()
  {
    zzs(this.zza);
    this.zza = null;
    this.zzb = null;
  }
  
  abstract Object zzf(Object paramObject1, Object paramObject2)
    throws Exception;
  
  abstract void zzg(Object paramObject);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */