package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Data;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbro;

public class OfflineNotificationPoster
  extends Worker
{
  private final zzbro zza;
  
  public OfflineNotificationPoster(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    this.zza = zzay.zza().zzm(paramContext, new zzbnv());
  }
  
  public final ListenableWorker.Result doWork()
  {
    Object localObject = getInputData().getString("uri");
    String str = getInputData().getString("gws_query_id");
    try
    {
      this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), (String)localObject, str);
      localObject = ListenableWorker.Result.success();
      return (ListenableWorker.Result)localObject;
    }
    catch (RemoteException localRemoteException) {}
    return ListenableWorker.Result.failure();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\offline\buffering\OfflineNotificationPoster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */