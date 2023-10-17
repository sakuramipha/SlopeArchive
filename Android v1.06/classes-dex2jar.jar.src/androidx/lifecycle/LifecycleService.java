package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService
  extends Service
  implements LifecycleOwner
{
  private final ServiceLifecycleDispatcher mDispatcher = new ServiceLifecycleDispatcher(this);
  
  public Lifecycle getLifecycle()
  {
    return this.mDispatcher.getLifecycle();
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    this.mDispatcher.onServicePreSuperOnBind();
    return null;
  }
  
  public void onCreate()
  {
    this.mDispatcher.onServicePreSuperOnCreate();
    super.onCreate();
  }
  
  public void onDestroy()
  {
    this.mDispatcher.onServicePreSuperOnDestroy();
    super.onDestroy();
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    this.mDispatcher.onServicePreSuperOnStart();
    super.onStart(paramIntent, paramInt);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\LifecycleService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */