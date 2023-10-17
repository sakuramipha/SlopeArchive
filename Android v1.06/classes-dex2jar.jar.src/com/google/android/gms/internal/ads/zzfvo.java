package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class zzfvo
  implements Runnable
{
  final Future zza;
  final zzfvn zzb;
  
  zzfvo(Future paramFuture, zzfvn paramzzfvn)
  {
    this.zza = paramFuture;
    this.zzb = paramzzfvn;
  }
  
  public final void run()
  {
    Object localObject = this.zza;
    if ((localObject instanceof zzfwu))
    {
      localObject = zzfwv.zza((zzfwu)localObject);
      if (localObject != null)
      {
        this.zzb.zza((Throwable)localObject);
        return;
      }
    }
    try
    {
      try
      {
        localObject = zzfvr.zzo(this.zza);
        this.zzb.zzb(localObject);
        return;
      }
      catch (Error localError) {}catch (RuntimeException localRuntimeException) {}
      this.zzb.zza(localRuntimeException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      this.zzb.zza(localExecutionException.getCause());
    }
  }
  
  public final String toString()
  {
    zzfos localzzfos = zzfot.zza(this);
    localzzfos.zza(this.zzb);
    return localzzfos.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfvo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */