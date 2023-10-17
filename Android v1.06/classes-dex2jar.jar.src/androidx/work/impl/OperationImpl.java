package androidx.work.impl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.Operation.State;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation.State.SUCCESS;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public class OperationImpl
  implements Operation
{
  private final SettableFuture<Operation.State.SUCCESS> mOperationFuture = SettableFuture.create();
  private final MutableLiveData<Operation.State> mOperationState = new MutableLiveData();
  
  public OperationImpl()
  {
    setState(Operation.IN_PROGRESS);
  }
  
  public ListenableFuture<Operation.State.SUCCESS> getResult()
  {
    return this.mOperationFuture;
  }
  
  public LiveData<Operation.State> getState()
  {
    return this.mOperationState;
  }
  
  public void setState(Operation.State paramState)
  {
    this.mOperationState.postValue(paramState);
    if ((paramState instanceof Operation.State.SUCCESS))
    {
      this.mOperationFuture.set((Operation.State.SUCCESS)paramState);
    }
    else if ((paramState instanceof Operation.State.FAILURE))
    {
      paramState = (Operation.State.FAILURE)paramState;
      this.mOperationFuture.setException(paramState.getThrowable());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\OperationImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */