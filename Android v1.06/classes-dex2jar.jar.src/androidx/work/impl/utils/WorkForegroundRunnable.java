package androidx.work.impl.utils;

import android.content.Context;
import androidx.core.os.BuildCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public class WorkForegroundRunnable
  implements Runnable
{
  static final String TAG = Logger.tagWithPrefix("WorkForegroundRunnable");
  final Context mContext;
  final ForegroundUpdater mForegroundUpdater;
  final SettableFuture<Void> mFuture = SettableFuture.create();
  final TaskExecutor mTaskExecutor;
  final WorkSpec mWorkSpec;
  final ListenableWorker mWorker;
  
  public WorkForegroundRunnable(Context paramContext, WorkSpec paramWorkSpec, ListenableWorker paramListenableWorker, ForegroundUpdater paramForegroundUpdater, TaskExecutor paramTaskExecutor)
  {
    this.mContext = paramContext;
    this.mWorkSpec = paramWorkSpec;
    this.mWorker = paramListenableWorker;
    this.mForegroundUpdater = paramForegroundUpdater;
    this.mTaskExecutor = paramTaskExecutor;
  }
  
  public ListenableFuture<Void> getFuture()
  {
    return this.mFuture;
  }
  
  public void run()
  {
    if ((this.mWorkSpec.expedited) && (!BuildCompat.isAtLeastS()))
    {
      final SettableFuture localSettableFuture = SettableFuture.create();
      this.mTaskExecutor.getMainThreadExecutor().execute(new Runnable()
      {
        public void run()
        {
          localSettableFuture.setFuture(WorkForegroundRunnable.this.mWorker.getForegroundInfoAsync());
        }
      });
      localSettableFuture.addListener(new Runnable()
      {
        public void run()
        {
          try
          {
            Object localObject = (ForegroundInfo)localSettableFuture.get();
            if (localObject != null)
            {
              Logger.get().debug(WorkForegroundRunnable.TAG, String.format("Updating notification for %s", new Object[] { WorkForegroundRunnable.this.mWorkSpec.workerClassName }), new Throwable[0]);
              WorkForegroundRunnable.this.mWorker.setRunInForeground(true);
              WorkForegroundRunnable.this.mFuture.setFuture(WorkForegroundRunnable.this.mForegroundUpdater.setForegroundAsync(WorkForegroundRunnable.this.mContext, WorkForegroundRunnable.this.mWorker.getId(), (ForegroundInfo)localObject));
            }
            else
            {
              String str = String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[] { WorkForegroundRunnable.this.mWorkSpec.workerClassName });
              localObject = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject).<init>(str);
              throw ((Throwable)localObject);
            }
          }
          finally
          {
            WorkForegroundRunnable.this.mFuture.setException(localThrowable);
          }
        }
      }, this.mTaskExecutor.getMainThreadExecutor());
      return;
    }
    this.mFuture.set(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\WorkForegroundRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */