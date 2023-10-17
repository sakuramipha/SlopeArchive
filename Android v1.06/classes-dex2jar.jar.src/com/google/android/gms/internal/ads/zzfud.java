package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

abstract class zzfud
  extends zzfvh
  implements Runnable
{
  @CheckForNull
  zzfwb zza;
  @CheckForNull
  Class zzb;
  @CheckForNull
  Object zzc;
  
  zzfud(zzfwb paramzzfwb, Class paramClass, Object paramObject)
  {
    Objects.requireNonNull(paramzzfwb);
    this.zza = paramzzfwb;
    this.zzb = paramClass;
    Objects.requireNonNull(paramObject);
    this.zzc = paramObject;
  }
  
  public final void run()
  {
    zzfwb localzzfwb = this.zza;
    Class localClass = this.zzb;
    Object localObject6 = this.zzc;
    int k = 1;
    int i;
    if (localzzfwb == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (localClass == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (localObject6 != null) {
      k = 0;
    }
    if (((k | i | j) == 0) && (!isCancelled()))
    {
      this.zza = null;
      try
      {
        try
        {
          if ((localzzfwb instanceof zzfwu)) {
            localObject4 = ((zzfwu)localzzfwb).zzm();
          } else {
            localObject4 = null;
          }
          Object localObject1 = localObject4;
          if (localObject4 == null)
          {
            Object localObject5 = zzfvr.zzo(localzzfwb);
            localObject1 = localObject4;
            localObject4 = localObject5;
          }
        }
        catch (Error localError) {}catch (RuntimeException localRuntimeException) {}
      }
      catch (ExecutionException localExecutionException)
      {
        for (;;)
        {
          localObject4 = localExecutionException.getCause();
          localObject2 = localObject4;
          if (localObject4 == null)
          {
            localObject2 = String.valueOf(localzzfwb.getClass());
            String str = String.valueOf(localExecutionException.getClass());
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Future type ");
            ((StringBuilder)localObject4).append((String)localObject2);
            ((StringBuilder)localObject4).append(" threw ");
            ((StringBuilder)localObject4).append(str);
            ((StringBuilder)localObject4).append(" without a cause");
            localObject2 = new NullPointerException(((StringBuilder)localObject4).toString());
          }
        }
      }
      Object localObject4 = null;
      Object localObject2;
      if (localObject2 == null)
      {
        zzd(localObject4);
        return;
      }
      if (localClass.isInstance(localObject2)) {
        try
        {
          localObject2 = zzf(localObject6, (Throwable)localObject2);
          this.zzb = null;
          this.zzc = null;
          zzg(localObject2);
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
            this.zzc = null;
          }
        }
      }
      zzt(localzzfwb);
    }
  }
  
  @CheckForNull
  protected final String zza()
  {
    Object localObject1 = this.zza;
    Object localObject3 = this.zzb;
    Object localObject2 = this.zzc;
    String str = super.zza();
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
    if ((localObject3 != null) && (localObject2 != null))
    {
      str = localObject3.toString();
      localObject3 = localObject2.toString();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("exceptionType=[");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append("], fallback=[");
      ((StringBuilder)localObject2).append((String)localObject3);
      ((StringBuilder)localObject2).append("]");
      return ((StringBuilder)localObject2).toString();
    }
    if (str != null) {
      return ((String)localObject1).concat(str);
    }
    return null;
  }
  
  protected final void zzb()
  {
    zzs(this.zza);
    this.zza = null;
    this.zzb = null;
    this.zzc = null;
  }
  
  abstract Object zzf(Object paramObject, Throwable paramThrowable)
    throws Exception;
  
  abstract void zzg(Object paramObject);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */