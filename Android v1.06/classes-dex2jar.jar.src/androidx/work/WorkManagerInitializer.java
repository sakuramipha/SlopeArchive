package androidx.work;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer
  implements Initializer<WorkManager>
{
  private static final String TAG = Logger.tagWithPrefix("WrkMgrInitializer");
  
  public WorkManager create(Context paramContext)
  {
    Logger.get().debug(TAG, "Initializing WorkManager with default configuration.", new Throwable[0]);
    WorkManager.initialize(paramContext, new Configuration.Builder().build());
    return WorkManager.getInstance(paramContext);
  }
  
  public List<Class<? extends Initializer<?>>> dependencies()
  {
    return Collections.emptyList();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\WorkManagerInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */