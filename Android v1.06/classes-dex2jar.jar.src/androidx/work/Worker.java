package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class Worker
  extends ListenableWorker
{
  SettableFuture<ListenableWorker.Result> mFuture;
  
  public Worker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  public abstract ListenableWorker.Result doWork();
  
  public final ListenableFuture<ListenableWorker.Result> startWork()
  {
    this.mFuture = SettableFuture.create();
    getBackgroundExecutor().execute(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 17	androidx/work/Worker$1:this$0	Landroidx/work/Worker;
        //   4: invokevirtual 26	androidx/work/Worker:doWork	()Landroidx/work/ListenableWorker$Result;
        //   7: astore_1
        //   8: aload_0
        //   9: getfield 17	androidx/work/Worker$1:this$0	Landroidx/work/Worker;
        //   12: getfield 30	androidx/work/Worker:mFuture	Landroidx/work/impl/utils/futures/SettableFuture;
        //   15: aload_1
        //   16: invokevirtual 36	androidx/work/impl/utils/futures/SettableFuture:set	(Ljava/lang/Object;)Z
        //   19: pop
        //   20: goto +16 -> 36
        //   23: astore_1
        //   24: aload_0
        //   25: getfield 17	androidx/work/Worker$1:this$0	Landroidx/work/Worker;
        //   28: getfield 30	androidx/work/Worker:mFuture	Landroidx/work/impl/utils/futures/SettableFuture;
        //   31: aload_1
        //   32: invokevirtual 40	androidx/work/impl/utils/futures/SettableFuture:setException	(Ljava/lang/Throwable;)Z
        //   35: pop
        //   36: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	37	0	this	1
        //   7	9	1	localResult	ListenableWorker.Result
        //   23	9	1	localThrowable	Throwable
        // Exception table:
        //   from	to	target	type
        //   0	20	23	finally
      }
    });
    return this.mFuture;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\Worker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */