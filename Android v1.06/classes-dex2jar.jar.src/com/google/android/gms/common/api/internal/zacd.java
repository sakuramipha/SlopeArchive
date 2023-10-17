package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class zacd<T>
  implements OnCompleteListener<T>
{
  private final GoogleApiManager zaa;
  private final int zab;
  private final ApiKey<?> zac;
  private final long zad;
  private final long zae;
  
  zacd(GoogleApiManager paramGoogleApiManager, int paramInt, ApiKey<?> paramApiKey, long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    this.zaa = paramGoogleApiManager;
    this.zab = paramInt;
    this.zac = paramApiKey;
    this.zad = paramLong1;
    this.zae = paramLong2;
  }
  
  static <T> zacd<T> zaa(GoogleApiManager paramGoogleApiManager, int paramInt, ApiKey<?> paramApiKey)
  {
    if (!paramGoogleApiManager.zaF()) {
      return null;
    }
    Object localObject1 = RootTelemetryConfigManager.getInstance().getConfig();
    boolean bool1;
    if (localObject1 != null)
    {
      if (!((RootTelemetryConfiguration)localObject1).getMethodInvocationTelemetryEnabled()) {
        return null;
      }
      boolean bool2 = ((RootTelemetryConfiguration)localObject1).getMethodTimingTelemetryEnabled();
      localObject1 = paramGoogleApiManager.zak(paramApiKey);
      bool1 = bool2;
      if (localObject1 != null)
      {
        if (!(((zabq)localObject1).zaf() instanceof BaseGmsClient)) {
          return null;
        }
        Object localObject2 = (BaseGmsClient)((zabq)localObject1).zaf();
        bool1 = bool2;
        if (((BaseGmsClient)localObject2).hasConnectionInfo())
        {
          bool1 = bool2;
          if (!((BaseGmsClient)localObject2).isConnecting())
          {
            localObject2 = zab((zabq)localObject1, (BaseGmsClient)localObject2, paramInt);
            if (localObject2 == null) {
              return null;
            }
            ((zabq)localObject1).zaq();
            bool1 = ((ConnectionTelemetryConfiguration)localObject2).getMethodTimingTelemetryEnabled();
          }
        }
      }
    }
    else
    {
      bool1 = true;
    }
    long l1;
    if (bool1) {
      l1 = System.currentTimeMillis();
    } else {
      l1 = 0L;
    }
    long l2;
    if (bool1) {
      l2 = SystemClock.elapsedRealtime();
    } else {
      l2 = 0L;
    }
    return new zacd(paramGoogleApiManager, paramInt, paramApiKey, l1, l2, null, null);
  }
  
  private static ConnectionTelemetryConfiguration zab(zabq<?> paramzabq, BaseGmsClient<?> paramBaseGmsClient, int paramInt)
  {
    paramBaseGmsClient = paramBaseGmsClient.getTelemetryConfiguration();
    if ((paramBaseGmsClient != null) && (paramBaseGmsClient.getMethodInvocationTelemetryEnabled()))
    {
      int[] arrayOfInt = paramBaseGmsClient.getMethodInvocationMethodKeyAllowlist();
      if (arrayOfInt == null)
      {
        arrayOfInt = paramBaseGmsClient.getMethodInvocationMethodKeyDisallowlist();
        if ((arrayOfInt != null) && (ArrayUtils.contains(arrayOfInt, paramInt))) {
          break label72;
        }
      }
      else
      {
        if (!ArrayUtils.contains(arrayOfInt, paramInt)) {
          break label72;
        }
      }
      if (paramzabq.zac() < paramBaseGmsClient.getMaxMethodInvocationsLogged()) {
        return paramBaseGmsClient;
      }
    }
    label72:
    return null;
  }
  
  public final void onComplete(Task<T> paramTask)
  {
    if (!this.zaa.zaF()) {
      return;
    }
    RootTelemetryConfiguration localRootTelemetryConfiguration = RootTelemetryConfigManager.getInstance().getConfig();
    if ((localRootTelemetryConfiguration != null) && (!localRootTelemetryConfiguration.getMethodInvocationTelemetryEnabled())) {
      return;
    }
    zabq localzabq = this.zaa.zak(this.zac);
    if ((localzabq != null) && ((localzabq.zaf() instanceof BaseGmsClient)))
    {
      Object localObject = (BaseGmsClient)localzabq.zaf();
      long l1 = this.zad;
      int m = 1;
      int i;
      if (l1 > 0L) {
        i = 1;
      } else {
        i = 0;
      }
      int i4 = ((BaseGmsClient)localObject).getGCoreServiceId();
      int i1;
      int k;
      int i3;
      int n;
      int j;
      if (localRootTelemetryConfiguration != null)
      {
        i1 = i & localRootTelemetryConfiguration.getMethodTimingTelemetryEnabled();
        k = localRootTelemetryConfiguration.getBatchPeriodMillis();
        i3 = localRootTelemetryConfiguration.getMaxMethodInvocationsInBatch();
        n = localRootTelemetryConfiguration.getVersion();
        i = i1;
        j = i3;
        if (((BaseGmsClient)localObject).hasConnectionInfo())
        {
          i = i1;
          j = i3;
          if (!((BaseGmsClient)localObject).isConnecting())
          {
            localObject = zab(localzabq, (BaseGmsClient)localObject, this.zab);
            if (localObject == null) {
              return;
            }
            if ((((ConnectionTelemetryConfiguration)localObject).getMethodTimingTelemetryEnabled()) && (this.zad > 0L)) {
              i = m;
            } else {
              i = 0;
            }
            j = ((ConnectionTelemetryConfiguration)localObject).getMaxMethodInvocationsLogged();
          }
        }
        m = j;
        i1 = i;
      }
      else
      {
        n = 0;
        k = 5000;
        m = 100;
        i1 = i;
      }
      localObject = this.zaa;
      if (paramTask.isSuccessful())
      {
        i = 0;
        j = 0;
      }
      else
      {
        if (paramTask.isCanceled()) {}
        for (i = 100;; i = 101)
        {
          j = -1;
          break;
          paramTask = paramTask.getException();
          if ((paramTask instanceof ApiException))
          {
            paramTask = ((ApiException)paramTask).getStatus();
            i3 = paramTask.getStatusCode();
            paramTask = paramTask.getConnectionResult();
            if (paramTask == null) {
              i = -1;
            } else {
              i = paramTask.getErrorCode();
            }
            j = i;
            i = i3;
            break;
          }
        }
      }
      long l2;
      int i2;
      if (i1 != 0)
      {
        l2 = this.zad;
        l1 = System.currentTimeMillis();
        i2 = (int)(SystemClock.elapsedRealtime() - this.zae);
      }
      else
      {
        l2 = 0L;
        l1 = 0L;
        i2 = -1;
      }
      ((GoogleApiManager)localObject).zay(new MethodInvocation(this.zab, i, j, l2, l1, null, null, i4, i2), n, k, m);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zacd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */