package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

public class MultiInstanceInvalidationService
  extends Service
{
  private final IMultiInstanceInvalidationService.Stub mBinder = new IMultiInstanceInvalidationService.Stub()
  {
    public void broadcastInvalidation(int paramAnonymousInt, String[] paramAnonymousArrayOfString)
    {
      synchronized (MultiInstanceInvalidationService.this.mCallbackList)
      {
        String str1 = (String)MultiInstanceInvalidationService.this.mClientNames.get(Integer.valueOf(paramAnonymousInt));
        if (str1 == null)
        {
          Log.w("ROOM", "Remote invalidation client ID not registered");
          return;
        }
        int j = MultiInstanceInvalidationService.this.mCallbackList.beginBroadcast();
        int i = 0;
        while (i < j) {
          try
          {
            int k = ((Integer)MultiInstanceInvalidationService.this.mCallbackList.getBroadcastCookie(i)).intValue();
            String str2 = (String)MultiInstanceInvalidationService.this.mClientNames.get(Integer.valueOf(k));
            if (paramAnonymousInt != k)
            {
              boolean bool = str1.equals(str2);
              if (bool) {
                try
                {
                  ((IMultiInstanceInvalidationCallback)MultiInstanceInvalidationService.this.mCallbackList.getBroadcastItem(i)).onInvalidation(paramAnonymousArrayOfString);
                }
                catch (RemoteException localRemoteException)
                {
                  Log.w("ROOM", "Error invoking a remote callback", localRemoteException);
                }
              }
            }
            i++;
          }
          finally
          {
            MultiInstanceInvalidationService.this.mCallbackList.finishBroadcast();
          }
        }
        MultiInstanceInvalidationService.this.mCallbackList.finishBroadcast();
        return;
      }
    }
    
    public int registerCallback(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, String paramAnonymousString)
    {
      if (paramAnonymousString == null) {
        return 0;
      }
      synchronized (MultiInstanceInvalidationService.this.mCallbackList)
      {
        MultiInstanceInvalidationService localMultiInstanceInvalidationService = MultiInstanceInvalidationService.this;
        int i = localMultiInstanceInvalidationService.mMaxClientId + 1;
        localMultiInstanceInvalidationService.mMaxClientId = i;
        if (MultiInstanceInvalidationService.this.mCallbackList.register(paramAnonymousIMultiInstanceInvalidationCallback, Integer.valueOf(i)))
        {
          MultiInstanceInvalidationService.this.mClientNames.put(Integer.valueOf(i), paramAnonymousString);
          return i;
        }
        paramAnonymousIMultiInstanceInvalidationCallback = MultiInstanceInvalidationService.this;
        paramAnonymousIMultiInstanceInvalidationCallback.mMaxClientId -= 1;
        return 0;
      }
    }
    
    public void unregisterCallback(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, int paramAnonymousInt)
    {
      synchronized (MultiInstanceInvalidationService.this.mCallbackList)
      {
        MultiInstanceInvalidationService.this.mCallbackList.unregister(paramAnonymousIMultiInstanceInvalidationCallback);
        MultiInstanceInvalidationService.this.mClientNames.remove(Integer.valueOf(paramAnonymousInt));
        return;
      }
    }
  };
  final RemoteCallbackList<IMultiInstanceInvalidationCallback> mCallbackList = new RemoteCallbackList()
  {
    public void onCallbackDied(IMultiInstanceInvalidationCallback paramAnonymousIMultiInstanceInvalidationCallback, Object paramAnonymousObject)
    {
      MultiInstanceInvalidationService.this.mClientNames.remove(Integer.valueOf(((Integer)paramAnonymousObject).intValue()));
    }
  };
  final HashMap<Integer, String> mClientNames = new HashMap();
  int mMaxClientId = 0;
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.mBinder;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\MultiInstanceInvalidationService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */