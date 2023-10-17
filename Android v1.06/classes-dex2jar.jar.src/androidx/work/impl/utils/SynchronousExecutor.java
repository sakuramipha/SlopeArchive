package androidx.work.impl.utils;

import java.util.concurrent.Executor;

public class SynchronousExecutor
  implements Executor
{
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\SynchronousExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */