package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver
  extends BroadcastReceiver
{
  private static final String TAG = Logger.tagWithPrefix("DiagnosticsRcvr");
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Logger.get().debug(TAG, "Requesting diagnostics", new Throwable[0]);
    try
    {
      WorkManager.getInstance(paramContext).enqueue(OneTimeWorkRequest.from(DiagnosticsWorker.class));
    }
    catch (IllegalStateException paramContext)
    {
      Logger.get().error(TAG, "WorkManager is not initialized", new Throwable[] { paramContext });
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\diagnostics\DiagnosticsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */