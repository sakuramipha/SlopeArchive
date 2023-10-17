package androidx.concurrent.futures;

import java.util.concurrent.Executor;

 enum DirectExecutor
  implements Executor
{
  private static final DirectExecutor[] $VALUES;
  
  static
  {
    DirectExecutor localDirectExecutor = new DirectExecutor("INSTANCE", 0);
    INSTANCE = localDirectExecutor;
    $VALUES = new DirectExecutor[] { localDirectExecutor };
  }
  
  private DirectExecutor() {}
  
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public String toString()
  {
    return "DirectExecutor";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\concurrent\futures\DirectExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */