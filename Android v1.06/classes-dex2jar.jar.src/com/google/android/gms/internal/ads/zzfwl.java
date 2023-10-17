package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

final class zzfwl
  implements Runnable
{
  @CheckForNull
  zzfwo zza;
  
  zzfwl(zzfwo paramzzfwo)
  {
    this.zza = paramzzfwo;
  }
  
  public final void run()
  {
    zzfwo localzzfwo = this.zza;
    if (localzzfwo == null) {
      return;
    }
    localzzfwb = zzfwo.zzf(localzzfwo);
    if (localzzfwb == null) {
      return;
    }
    this.zza = null;
    if (localzzfwb.isDone())
    {
      localzzfwo.zzt(localzzfwb);
      return;
    }
    try
    {
      Object localObject5 = zzfwo.zzw(localzzfwo);
      zzfwo.zzx(localzzfwo, null);
      String str1 = "Timed out";
      localObject1 = str1;
      if (localObject5 != null)
      {
        localObject3 = str1;
        try
        {
          long l = Math.abs(((ScheduledFuture)localObject5).getDelay(TimeUnit.MILLISECONDS));
          localObject1 = str1;
          if (l > 10L)
          {
            localObject3 = str1;
            localObject1 = new java/lang/StringBuilder;
            localObject3 = str1;
            ((StringBuilder)localObject1).<init>();
            localObject3 = str1;
            ((StringBuilder)localObject1).append("Timed out");
            localObject3 = str1;
            ((StringBuilder)localObject1).append(" (timeout delayed by ");
            localObject3 = str1;
            ((StringBuilder)localObject1).append(l);
            localObject3 = str1;
            ((StringBuilder)localObject1).append(" ms after scheduled time)");
            localObject3 = str1;
            localObject1 = ((StringBuilder)localObject1).toString();
          }
        }
        finally
        {
          break label276;
        }
      }
      localObject3 = localObject1;
      str2 = localzzfwb.toString();
      localObject3 = localObject1;
      localObject5 = new java/lang/StringBuilder;
      localObject3 = localObject1;
      ((StringBuilder)localObject5).<init>();
      localObject3 = localObject1;
      ((StringBuilder)localObject5).append((String)localObject1);
      localObject3 = localObject1;
      ((StringBuilder)localObject5).append(": ");
      localObject3 = localObject1;
      ((StringBuilder)localObject5).append(str2);
      localObject3 = localObject1;
      localObject1 = ((StringBuilder)localObject5).toString();
      localObject3 = new com/google/android/gms/internal/ads/zzfwn;
      ((zzfwn)localObject3).<init>((String)localObject1, null);
      localzzfwo.zze((Throwable)localObject3);
      return;
    }
    finally
    {
      Object localObject1;
      Object localObject3;
      String str2;
      label276:
      localzzfwb.cancel(true);
    }
    localObject1 = new com/google/android/gms/internal/ads/zzfwn;
    ((zzfwn)localObject1).<init>((String)localObject3, null);
    localzzfwo.zze((Throwable)localObject1);
    throw str2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */