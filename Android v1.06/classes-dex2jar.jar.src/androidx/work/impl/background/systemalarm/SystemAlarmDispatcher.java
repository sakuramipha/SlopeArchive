package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SystemAlarmDispatcher
  implements ExecutionListener
{
  private static final int DEFAULT_START_ID = 0;
  private static final String KEY_START_ID = "KEY_START_ID";
  private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
  static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
  final CommandHandler mCommandHandler;
  private CommandsCompletedListener mCompletedListener;
  final Context mContext;
  Intent mCurrentIntent;
  final List<Intent> mIntents;
  private final Handler mMainHandler;
  private final Processor mProcessor;
  private final TaskExecutor mTaskExecutor;
  private final WorkManagerImpl mWorkManager;
  private final WorkTimer mWorkTimer;
  
  SystemAlarmDispatcher(Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  SystemAlarmDispatcher(Context paramContext, Processor paramProcessor, WorkManagerImpl paramWorkManagerImpl)
  {
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
    this.mCommandHandler = new CommandHandler(localContext);
    this.mWorkTimer = new WorkTimer();
    if (paramWorkManagerImpl == null) {
      paramWorkManagerImpl = WorkManagerImpl.getInstance(paramContext);
    }
    this.mWorkManager = paramWorkManagerImpl;
    if (paramProcessor == null) {
      paramProcessor = paramWorkManagerImpl.getProcessor();
    }
    this.mProcessor = paramProcessor;
    this.mTaskExecutor = paramWorkManagerImpl.getWorkTaskExecutor();
    paramProcessor.addExecutionListener(this);
    this.mIntents = new ArrayList();
    this.mCurrentIntent = null;
    this.mMainHandler = new Handler(Looper.getMainLooper());
  }
  
  private void assertMainThread()
  {
    if (this.mMainHandler.getLooper().getThread() == Thread.currentThread()) {
      return;
    }
    throw new IllegalStateException("Needs to be invoked on the main thread.");
  }
  
  private boolean hasIntentWithAction(String paramString)
  {
    assertMainThread();
    synchronized (this.mIntents)
    {
      Iterator localIterator = this.mIntents.iterator();
      while (localIterator.hasNext()) {
        if (paramString.equals(((Intent)localIterator.next()).getAction())) {
          return true;
        }
      }
      return false;
    }
  }
  
  private void processCommand()
  {
    assertMainThread();
    PowerManager.WakeLock localWakeLock = WakeLocks.newWakeLock(this.mContext, "ProcessCommand");
    try
    {
      localWakeLock.acquire();
      TaskExecutor localTaskExecutor = this.mWorkManager.getWorkTaskExecutor();
      Runnable local1 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1;
      local1.<init>(this);
      localTaskExecutor.executeOnBackgroundThread(local1);
      return;
    }
    finally
    {
      localWakeLock.release();
    }
  }
  
  public boolean add(Intent paramIntent, int paramInt)
  {
    Object localObject2 = Logger.get();
    Object localObject1 = TAG;
    int i = 0;
    ((Logger)localObject2).debug((String)localObject1, String.format("Adding command %s (%s)", new Object[] { paramIntent, Integer.valueOf(paramInt) }), new Throwable[0]);
    assertMainThread();
    localObject2 = paramIntent.getAction();
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      Logger.get().warning((String)localObject1, "Unknown command. Ignoring", new Throwable[0]);
      return false;
    }
    if (("ACTION_CONSTRAINTS_CHANGED".equals(localObject2)) && (hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED"))) {
      return false;
    }
    paramIntent.putExtra("KEY_START_ID", paramInt);
    localObject1 = this.mIntents;
    paramInt = i;
    try
    {
      if (!this.mIntents.isEmpty()) {
        paramInt = 1;
      }
      this.mIntents.add(paramIntent);
      if (paramInt == 0) {
        processCommand();
      }
      return true;
    }
    finally {}
  }
  
  void dequeueAndCheckForCompletion()
  {
    ??? = Logger.get();
    Object localObject2 = TAG;
    ((Logger)???).debug((String)localObject2, "Checking if commands are complete.", new Throwable[0]);
    assertMainThread();
    synchronized (this.mIntents)
    {
      if (this.mCurrentIntent != null)
      {
        Logger.get().debug((String)localObject2, String.format("Removing command %s", new Object[] { this.mCurrentIntent }), new Throwable[0]);
        if (((Intent)this.mIntents.remove(0)).equals(this.mCurrentIntent))
        {
          this.mCurrentIntent = null;
        }
        else
        {
          localObject2 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject2).<init>("Dequeue-d command is not the first.");
          throw ((Throwable)localObject2);
        }
      }
      SerialExecutor localSerialExecutor = this.mTaskExecutor.getBackgroundExecutor();
      if ((!this.mCommandHandler.hasPendingCommands()) && (this.mIntents.isEmpty()) && (!localSerialExecutor.hasPendingTasks()))
      {
        Logger.get().debug((String)localObject2, "No more commands & intents.", new Throwable[0]);
        localObject2 = this.mCompletedListener;
        if (localObject2 != null) {
          ((CommandsCompletedListener)localObject2).onAllCommandsCompleted();
        }
      }
      else if (!this.mIntents.isEmpty())
      {
        processCommand();
      }
      return;
    }
  }
  
  Processor getProcessor()
  {
    return this.mProcessor;
  }
  
  TaskExecutor getTaskExecutor()
  {
    return this.mTaskExecutor;
  }
  
  WorkManagerImpl getWorkManager()
  {
    return this.mWorkManager;
  }
  
  WorkTimer getWorkTimer()
  {
    return this.mWorkTimer;
  }
  
  void onDestroy()
  {
    Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher", new Throwable[0]);
    this.mProcessor.removeExecutionListener(this);
    this.mWorkTimer.onDestroy();
    this.mCompletedListener = null;
  }
  
  public void onExecuted(String paramString, boolean paramBoolean)
  {
    postOnMainThread(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(this.mContext, paramString, paramBoolean), 0));
  }
  
  void postOnMainThread(Runnable paramRunnable)
  {
    this.mMainHandler.post(paramRunnable);
  }
  
  void setCompletedListener(CommandsCompletedListener paramCommandsCompletedListener)
  {
    if (this.mCompletedListener != null)
    {
      Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
      return;
    }
    this.mCompletedListener = paramCommandsCompletedListener;
  }
  
  static class AddRunnable
    implements Runnable
  {
    private final SystemAlarmDispatcher mDispatcher;
    private final Intent mIntent;
    private final int mStartId;
    
    AddRunnable(SystemAlarmDispatcher paramSystemAlarmDispatcher, Intent paramIntent, int paramInt)
    {
      this.mDispatcher = paramSystemAlarmDispatcher;
      this.mIntent = paramIntent;
      this.mStartId = paramInt;
    }
    
    public void run()
    {
      this.mDispatcher.add(this.mIntent, this.mStartId);
    }
  }
  
  static abstract interface CommandsCompletedListener
  {
    public abstract void onAllCommandsCompleted();
  }
  
  static class DequeueAndCheckForCompletion
    implements Runnable
  {
    private final SystemAlarmDispatcher mDispatcher;
    
    DequeueAndCheckForCompletion(SystemAlarmDispatcher paramSystemAlarmDispatcher)
    {
      this.mDispatcher = paramSystemAlarmDispatcher;
    }
    
    public void run()
    {
      this.mDispatcher.dequeueAndCheckForCompletion();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\SystemAlarmDispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */