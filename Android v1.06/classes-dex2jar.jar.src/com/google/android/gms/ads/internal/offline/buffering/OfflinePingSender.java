package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbro;

public class OfflinePingSender
  extends Worker
{
  private final zzbro zza;
  
  public OfflinePingSender(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    this.zza = zzay.zza().zzm(paramContext, new zzbnv());
  }
  
  public final ListenableWorker.Result doWork()
  {
    try
    {
      this.zza.zzf();
      ListenableWorker.Result localResult = ListenableWorker.Result.success();
      return localResult;
    }
    catch (RemoteException localRemoteException) {}
    return ListenableWorker.Result.failure();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\offline\buffering\OfflinePingSender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */