package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class StorageNotLowController
  extends ConstraintController<Boolean>
{
  public StorageNotLowController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getStorageNotLowTracker());
  }
  
  boolean hasConstraint(WorkSpec paramWorkSpec)
  {
    return paramWorkSpec.constraints.requiresStorageNotLow();
  }
  
  boolean isConstrained(Boolean paramBoolean)
  {
    return paramBoolean.booleanValue() ^ true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\constraints\controllers\StorageNotLowController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */