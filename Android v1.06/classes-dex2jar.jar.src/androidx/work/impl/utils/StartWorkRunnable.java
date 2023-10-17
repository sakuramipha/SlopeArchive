package androidx.work.impl.utils;

import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;

public class StartWorkRunnable
  implements Runnable
{
  private WorkerParameters.RuntimeExtras mRuntimeExtras;
  private WorkManagerImpl mWorkManagerImpl;
  private String mWorkSpecId;
  
  public StartWorkRunnable(WorkManagerImpl paramWorkManagerImpl, String paramString, WorkerParameters.RuntimeExtras paramRuntimeExtras)
  {
    this.mWorkManagerImpl = paramWorkManagerImpl;
    this.mWorkSpecId = paramString;
    this.mRuntimeExtras = paramRuntimeExtras;
  }
  
  public void run()
  {
    this.mWorkManagerImpl.getProcessor().startWork(this.mWorkSpecId, this.mRuntimeExtras);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\StartWorkRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */