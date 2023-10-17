package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.Configuration.Builder;
import androidx.work.Constraints;
import androidx.work.Constraints.Builder;
import androidx.work.Data.Builder;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OneTimeWorkRequest.Builder;
import androidx.work.WorkManager;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzt;

public class WorkManagerUtil
  extends zzbq
{
  private static void zzb(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getApplicationContext();
      Configuration.Builder localBuilder = new androidx/work/Configuration$Builder;
      localBuilder.<init>();
      WorkManager.initialize(paramContext, localBuilder.build());
      return;
    }
    catch (IllegalStateException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    zzb(paramIObjectWrapper);
    try
    {
      WorkManager localWorkManager = WorkManager.getInstance(paramIObjectWrapper);
      localWorkManager.cancelAllWorkByTag("offline_ping_sender_work");
      paramIObjectWrapper = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
      localWorkManager.enqueue((OneTimeWorkRequest)((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(OfflinePingSender.class).setConstraints(paramIObjectWrapper)).addTag("offline_ping_sender_work")).build());
      return;
    }
    catch (IllegalStateException paramIObjectWrapper)
    {
      zzbzt.zzk("Failed to instantiate WorkManager.", paramIObjectWrapper);
    }
  }
  
  public final boolean zzf(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    zzb(paramIObjectWrapper);
    Constraints localConstraints = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
    paramString1 = new Data.Builder().putString("uri", paramString1).putString("gws_query_id", paramString2).build();
    paramString1 = (OneTimeWorkRequest)((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(OfflineNotificationPoster.class).setConstraints(localConstraints)).setInputData(paramString1)).addTag("offline_notification_work")).build();
    try
    {
      paramIObjectWrapper = WorkManager.getInstance(paramIObjectWrapper);
      paramIObjectWrapper.enqueue(paramString1);
      return true;
    }
    catch (IllegalStateException paramIObjectWrapper)
    {
      zzbzt.zzk("Failed to instantiate WorkManager.", paramIObjectWrapper);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\WorkManagerUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */