package androidx.work;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

public abstract interface Operation
{
  public static final Operation.State.IN_PROGRESS IN_PROGRESS = new Operation.State.IN_PROGRESS(null);
  public static final Operation.State.SUCCESS SUCCESS = new Operation.State.SUCCESS(null);
  
  public abstract ListenableFuture<Operation.State.SUCCESS> getResult();
  
  public abstract LiveData<State> getState();
  
  public static abstract class State
  {
    public static final class FAILURE
      extends Operation.State
    {
      private final Throwable mThrowable;
      
      public FAILURE(Throwable paramThrowable)
      {
        this.mThrowable = paramThrowable;
      }
      
      public Throwable getThrowable()
      {
        return this.mThrowable;
      }
      
      public String toString()
      {
        return String.format("FAILURE (%s)", new Object[] { this.mThrowable.getMessage() });
      }
    }
    
    public static final class IN_PROGRESS
      extends Operation.State
    {
      public String toString()
      {
        return "IN_PROGRESS";
      }
    }
    
    public static final class SUCCESS
      extends Operation.State
    {
      public String toString()
      {
        return "SUCCESS";
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\Operation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */