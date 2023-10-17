package androidx.work.impl.constraints;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkConstraintsTracker
  implements ConstraintController.OnConstraintUpdatedCallback
{
  private static final String TAG = Logger.tagWithPrefix("WorkConstraintsTracker");
  private final WorkConstraintsCallback mCallback;
  private final ConstraintController<?>[] mConstraintControllers;
  private final Object mLock;
  
  public WorkConstraintsTracker(Context paramContext, TaskExecutor paramTaskExecutor, WorkConstraintsCallback paramWorkConstraintsCallback)
  {
    paramContext = paramContext.getApplicationContext();
    this.mCallback = paramWorkConstraintsCallback;
    this.mConstraintControllers = new ConstraintController[] { new BatteryChargingController(paramContext, paramTaskExecutor), new BatteryNotLowController(paramContext, paramTaskExecutor), new StorageNotLowController(paramContext, paramTaskExecutor), new NetworkConnectedController(paramContext, paramTaskExecutor), new NetworkUnmeteredController(paramContext, paramTaskExecutor), new NetworkNotRoamingController(paramContext, paramTaskExecutor), new NetworkMeteredController(paramContext, paramTaskExecutor) };
    this.mLock = new Object();
  }
  
  WorkConstraintsTracker(WorkConstraintsCallback paramWorkConstraintsCallback, ConstraintController<?>[] paramArrayOfConstraintController)
  {
    this.mCallback = paramWorkConstraintsCallback;
    this.mConstraintControllers = paramArrayOfConstraintController;
    this.mLock = new Object();
  }
  
  public boolean areAllConstraintsMet(String paramString)
  {
    synchronized (this.mLock)
    {
      for (ConstraintController localConstraintController : this.mConstraintControllers) {
        if (localConstraintController.isWorkSpecConstrained(paramString))
        {
          Logger.get().debug(TAG, String.format("Work %s constrained by %s", new Object[] { paramString, localConstraintController.getClass().getSimpleName() }), new Throwable[0]);
          return false;
        }
      }
      return true;
    }
  }
  
  public void onConstraintMet(List<String> paramList)
  {
    synchronized (this.mLock)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        if (areAllConstraintsMet(paramList))
        {
          Logger.get().debug(TAG, String.format("Constraints met for %s", new Object[] { paramList }), new Throwable[0]);
          localArrayList.add(paramList);
        }
      }
      paramList = this.mCallback;
      if (paramList != null) {
        paramList.onAllConstraintsMet(localArrayList);
      }
      return;
    }
  }
  
  public void onConstraintNotMet(List<String> paramList)
  {
    synchronized (this.mLock)
    {
      WorkConstraintsCallback localWorkConstraintsCallback = this.mCallback;
      if (localWorkConstraintsCallback != null) {
        localWorkConstraintsCallback.onAllConstraintsNotMet(paramList);
      }
      return;
    }
  }
  
  public void replace(Iterable<WorkSpec> paramIterable)
  {
    synchronized (this.mLock)
    {
      ConstraintController[] arrayOfConstraintController = this.mConstraintControllers;
      int k = arrayOfConstraintController.length;
      int j = 0;
      for (int i = 0; i < k; i++) {
        arrayOfConstraintController[i].setCallback(null);
      }
      arrayOfConstraintController = this.mConstraintControllers;
      k = arrayOfConstraintController.length;
      for (i = 0; i < k; i++) {
        arrayOfConstraintController[i].replace(paramIterable);
      }
      paramIterable = this.mConstraintControllers;
      k = paramIterable.length;
      for (i = j; i < k; i++) {
        paramIterable[i].setCallback(this);
      }
      return;
    }
  }
  
  public void reset()
  {
    synchronized (this.mLock)
    {
      ConstraintController[] arrayOfConstraintController = this.mConstraintControllers;
      int j = arrayOfConstraintController.length;
      for (int i = 0; i < j; i++) {
        arrayOfConstraintController[i].reset();
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\WorkConstraintsTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */