package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class MultiInstanceInvalidationClient
{
  final Context mAppContext;
  final IMultiInstanceInvalidationCallback mCallback = new IMultiInstanceInvalidationCallback.Stub()
  {
    public void onInvalidation(final String[] paramAnonymousArrayOfString)
    {
      MultiInstanceInvalidationClient.this.mExecutor.execute(new Runnable()
      {
        public void run()
        {
          MultiInstanceInvalidationClient.this.mInvalidationTracker.notifyObserversByTableNames(paramAnonymousArrayOfString);
        }
      });
    }
  };
  int mClientId;
  final Executor mExecutor;
  final InvalidationTracker mInvalidationTracker;
  final String mName;
  final InvalidationTracker.Observer mObserver;
  final Runnable mRemoveObserverRunnable;
  IMultiInstanceInvalidationService mService;
  final ServiceConnection mServiceConnection;
  final Runnable mSetUpRunnable;
  final AtomicBoolean mStopped = new AtomicBoolean(false);
  private final Runnable mTearDownRunnable;
  
  MultiInstanceInvalidationClient(Context paramContext, String paramString, InvalidationTracker paramInvalidationTracker, Executor paramExecutor)
  {
    ServiceConnection local2 = new ServiceConnection()
    {
      public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        MultiInstanceInvalidationClient.this.mService = IMultiInstanceInvalidationService.Stub.asInterface(paramAnonymousIBinder);
        MultiInstanceInvalidationClient.this.mExecutor.execute(MultiInstanceInvalidationClient.this.mSetUpRunnable);
      }
      
      public void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        MultiInstanceInvalidationClient.this.mExecutor.execute(MultiInstanceInvalidationClient.this.mRemoveObserverRunnable);
        MultiInstanceInvalidationClient.this.mService = null;
      }
    };
    this.mServiceConnection = local2;
    this.mSetUpRunnable = new Runnable()
    {
      public void run()
      {
        try
        {
          IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = MultiInstanceInvalidationClient.this.mService;
          if (localIMultiInstanceInvalidationService != null)
          {
            MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            localMultiInstanceInvalidationClient.mClientId = localIMultiInstanceInvalidationService.registerCallback(localMultiInstanceInvalidationClient.mCallback, MultiInstanceInvalidationClient.this.mName);
            MultiInstanceInvalidationClient.this.mInvalidationTracker.addObserver(MultiInstanceInvalidationClient.this.mObserver);
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("ROOM", "Cannot register multi-instance invalidation callback", localRemoteException);
        }
      }
    };
    this.mRemoveObserverRunnable = new Runnable()
    {
      public void run()
      {
        MultiInstanceInvalidationClient.this.mInvalidationTracker.removeObserver(MultiInstanceInvalidationClient.this.mObserver);
      }
    };
    this.mTearDownRunnable = new Runnable()
    {
      public void run()
      {
        MultiInstanceInvalidationClient.this.mInvalidationTracker.removeObserver(MultiInstanceInvalidationClient.this.mObserver);
        try
        {
          IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = MultiInstanceInvalidationClient.this.mService;
          if (localIMultiInstanceInvalidationService != null) {
            localIMultiInstanceInvalidationService.unregisterCallback(MultiInstanceInvalidationClient.this.mCallback, MultiInstanceInvalidationClient.this.mClientId);
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", localRemoteException);
        }
        MultiInstanceInvalidationClient.this.mAppContext.unbindService(MultiInstanceInvalidationClient.this.mServiceConnection);
      }
    };
    paramContext = paramContext.getApplicationContext();
    this.mAppContext = paramContext;
    this.mName = paramString;
    this.mInvalidationTracker = paramInvalidationTracker;
    this.mExecutor = paramExecutor;
    this.mObserver = new InvalidationTracker.Observer((String[])paramInvalidationTracker.mTableIdLookup.keySet().toArray(new String[0]))
    {
      boolean isRemote()
      {
        return true;
      }
      
      public void onInvalidated(Set<String> paramAnonymousSet)
      {
        if (MultiInstanceInvalidationClient.this.mStopped.get()) {
          return;
        }
        try
        {
          IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = MultiInstanceInvalidationClient.this.mService;
          if (localIMultiInstanceInvalidationService != null) {
            localIMultiInstanceInvalidationService.broadcastInvalidation(MultiInstanceInvalidationClient.this.mClientId, (String[])paramAnonymousSet.toArray(new String[0]));
          }
        }
        catch (RemoteException paramAnonymousSet)
        {
          Log.w("ROOM", "Cannot broadcast invalidation", paramAnonymousSet);
        }
      }
    };
    paramContext.bindService(new Intent(paramContext, MultiInstanceInvalidationService.class), local2, 1);
  }
  
  void stop()
  {
    if (this.mStopped.compareAndSet(false, true)) {
      this.mExecutor.execute(this.mTearDownRunnable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\MultiInstanceInvalidationClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */