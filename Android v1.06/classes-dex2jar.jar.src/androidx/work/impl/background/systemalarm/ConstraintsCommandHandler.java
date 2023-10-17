package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ConstraintsCommandHandler
{
  private static final String TAG = Logger.tagWithPrefix("ConstraintsCmdHandler");
  private final Context mContext;
  private final SystemAlarmDispatcher mDispatcher;
  private final int mStartId;
  private final WorkConstraintsTracker mWorkConstraintsTracker;
  
  ConstraintsCommandHandler(Context paramContext, int paramInt, SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    this.mContext = paramContext;
    this.mStartId = paramInt;
    this.mDispatcher = paramSystemAlarmDispatcher;
    this.mWorkConstraintsTracker = new WorkConstraintsTracker(paramContext, paramSystemAlarmDispatcher.getTaskExecutor(), null);
  }
  
  void handleConstraintsChanged()
  {
    Object localObject2 = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getScheduledWork();
    ConstraintProxy.updateAll(this.mContext, (List)localObject2);
    this.mWorkConstraintsTracker.replace((Iterable)localObject2);
    Object localObject1 = new ArrayList(((List)localObject2).size());
    long l = System.currentTimeMillis();
    Object localObject3 = ((List)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      WorkSpec localWorkSpec = (WorkSpec)((Iterator)localObject3).next();
      localObject2 = localWorkSpec.id;
      if ((l >= localWorkSpec.calculateNextRunTime()) && ((!localWorkSpec.hasConstraints()) || (this.mWorkConstraintsTracker.areAllConstraintsMet((String)localObject2)))) {
        ((List)localObject1).add(localWorkSpec);
      }
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = ((WorkSpec)((Iterator)localObject1).next()).id;
      localObject2 = CommandHandler.createDelayMetIntent(this.mContext, (String)localObject3);
      Logger.get().debug(TAG, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[] { localObject3 }), new Throwable[0]);
      localObject3 = this.mDispatcher;
      ((SystemAlarmDispatcher)localObject3).postOnMainThread(new SystemAlarmDispatcher.AddRunnable((SystemAlarmDispatcher)localObject3, (Intent)localObject2, this.mStartId));
    }
    this.mWorkConstraintsTracker.reset();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\ConstraintsCommandHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */