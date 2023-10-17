package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService.Stub;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ConnectionHolder
  implements ServiceConnection
{
  private static final int STATE_AWAITING_CONNECTION = 0;
  private static final int STATE_CANCELLED = 3;
  private static final int STATE_CONNECTED = 1;
  private static final int STATE_DISCONNECTED = 2;
  private Exception mCancellationException;
  private final Runnable mCloseRunnable;
  private List<CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection>> mCompleters = new ArrayList();
  private TrustedWebActivityServiceConnection mService;
  private int mState = 0;
  private final WrapperFactory mWrapperFactory;
  
  ConnectionHolder(Runnable paramRunnable)
  {
    this(paramRunnable, new WrapperFactory());
  }
  
  ConnectionHolder(Runnable paramRunnable, WrapperFactory paramWrapperFactory)
  {
    this.mCloseRunnable = paramRunnable;
    this.mWrapperFactory = paramWrapperFactory;
  }
  
  public void cancel(Exception paramException)
  {
    Iterator localIterator = this.mCompleters.iterator();
    while (localIterator.hasNext()) {
      ((CallbackToFutureAdapter.Completer)localIterator.next()).setException(paramException);
    }
    this.mCompleters.clear();
    this.mCloseRunnable.run();
    this.mState = 3;
    this.mCancellationException = paramException;
  }
  
  public ListenableFuture<TrustedWebActivityServiceConnection> getServiceWrapper()
  {
    return CallbackToFutureAdapter.getFuture(new ConnectionHolder..ExternalSyntheticLambda0(this));
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.mService = this.mWrapperFactory.create(paramComponentName, paramIBinder);
    paramComponentName = this.mCompleters.iterator();
    while (paramComponentName.hasNext()) {
      ((CallbackToFutureAdapter.Completer)paramComponentName.next()).set(this.mService);
    }
    this.mCompleters.clear();
    this.mState = 1;
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.mService = null;
    this.mCloseRunnable.run();
    this.mState = 2;
  }
  
  static class WrapperFactory
  {
    TrustedWebActivityServiceConnection create(ComponentName paramComponentName, IBinder paramIBinder)
    {
      return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.Stub.asInterface(paramIBinder), paramComponentName);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\ConnectionHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */