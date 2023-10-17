package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService
  extends JobService
  implements ExecutionListener
{
  private static final String TAG = Logger.tagWithPrefix("SystemJobService");
  private final Map<String, JobParameters> mJobParameters = new HashMap();
  private WorkManagerImpl mWorkManagerImpl;
  
  private static String getWorkSpecIdFromJobParameters(JobParameters paramJobParameters)
  {
    try
    {
      paramJobParameters = paramJobParameters.getExtras();
      if ((paramJobParameters != null) && (paramJobParameters.containsKey("EXTRA_WORK_SPEC_ID")))
      {
        paramJobParameters = paramJobParameters.getString("EXTRA_WORK_SPEC_ID");
        return paramJobParameters;
      }
    }
    catch (NullPointerException paramJobParameters)
    {
      for (;;) {}
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    try
    {
      WorkManagerImpl localWorkManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
      this.mWorkManagerImpl = localWorkManagerImpl;
      localWorkManagerImpl.getProcessor().addExecutionListener(this);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (!Application.class.equals(getApplication().getClass())) {
        break label60;
      }
    }
    Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
    return;
    label60:
    throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    WorkManagerImpl localWorkManagerImpl = this.mWorkManagerImpl;
    if (localWorkManagerImpl != null) {
      localWorkManagerImpl.getProcessor().removeExecutionListener(this);
    }
  }
  
  public void onExecuted(String paramString, boolean paramBoolean)
  {
    Logger.get().debug(TAG, String.format("%s executed on JobScheduler", new Object[] { paramString }), new Throwable[0]);
    synchronized (this.mJobParameters)
    {
      paramString = (JobParameters)this.mJobParameters.remove(paramString);
      if (paramString != null) {
        jobFinished(paramString, paramBoolean);
      }
      return;
    }
  }
  
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    if (this.mWorkManagerImpl == null)
    {
      Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
      jobFinished(paramJobParameters, true);
      return false;
    }
    String str = getWorkSpecIdFromJobParameters(paramJobParameters);
    if (TextUtils.isEmpty(str))
    {
      Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
      return false;
    }
    synchronized (this.mJobParameters)
    {
      if (this.mJobParameters.containsKey(str))
      {
        Logger.get().debug(TAG, String.format("Job is already being executed by SystemJobService: %s", new Object[] { str }), new Throwable[0]);
        return false;
      }
      Logger.get().debug(TAG, String.format("onStartJob for %s", new Object[] { str }), new Throwable[0]);
      this.mJobParameters.put(str, paramJobParameters);
      ??? = null;
      if (Build.VERSION.SDK_INT >= 24)
      {
        WorkerParameters.RuntimeExtras localRuntimeExtras = new WorkerParameters.RuntimeExtras();
        if (paramJobParameters.getTriggeredContentUris() != null) {
          localRuntimeExtras.triggeredContentUris = Arrays.asList(paramJobParameters.getTriggeredContentUris());
        }
        if (paramJobParameters.getTriggeredContentAuthorities() != null) {
          localRuntimeExtras.triggeredContentAuthorities = Arrays.asList(paramJobParameters.getTriggeredContentAuthorities());
        }
        ??? = localRuntimeExtras;
        if (Build.VERSION.SDK_INT >= 28)
        {
          localRuntimeExtras.network = paramJobParameters.getNetwork();
          ??? = localRuntimeExtras;
        }
      }
      this.mWorkManagerImpl.startWork(str, (WorkerParameters.RuntimeExtras)???);
      return true;
    }
  }
  
  public boolean onStopJob(JobParameters arg1)
  {
    if (this.mWorkManagerImpl == null)
    {
      Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
      return true;
    }
    String str = getWorkSpecIdFromJobParameters(???);
    if (TextUtils.isEmpty(str))
    {
      Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
      return false;
    }
    Logger.get().debug(TAG, String.format("onStopJob for %s", new Object[] { str }), new Throwable[0]);
    synchronized (this.mJobParameters)
    {
      this.mJobParameters.remove(str);
      this.mWorkManagerImpl.stopWork(str);
      return this.mWorkManagerImpl.getProcessor().isCancelled(str) ^ true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemjob\SystemJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */