package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzq
  extends AsyncTask
{
  final zzs zza;
  
  protected final String zza(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.zza;
      zzs.zzv(paramVarArgs, (zzaqq)zzs.zzu(paramVarArgs).get(1000L, TimeUnit.MILLISECONDS));
    }
    catch (TimeoutException paramVarArgs)
    {
      zzbzt.zzk("", paramVarArgs);
    }
    catch (ExecutionException paramVarArgs) {}catch (InterruptedException paramVarArgs) {}
    zzbzt.zzk("", paramVarArgs);
    return this.zza.zzp();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */