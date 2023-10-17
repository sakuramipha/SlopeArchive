package androidx.work;

public abstract interface RunnableScheduler
{
  public abstract void cancel(Runnable paramRunnable);
  
  public abstract void scheduleWithDelay(long paramLong, Runnable paramRunnable);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\RunnableScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */