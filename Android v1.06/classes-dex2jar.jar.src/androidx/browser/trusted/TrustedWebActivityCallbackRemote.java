package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub;

public class TrustedWebActivityCallbackRemote
{
  private final ITrustedWebActivityCallback mCallbackBinder;
  
  private TrustedWebActivityCallbackRemote(ITrustedWebActivityCallback paramITrustedWebActivityCallback)
  {
    this.mCallbackBinder = paramITrustedWebActivityCallback;
  }
  
  static TrustedWebActivityCallbackRemote fromBinder(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    } else {
      paramIBinder = ITrustedWebActivityCallback.Stub.asInterface(paramIBinder);
    }
    if (paramIBinder == null) {
      return null;
    }
    return new TrustedWebActivityCallbackRemote(paramIBinder);
  }
  
  public void runExtraCallback(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    this.mCallbackBinder.onExtraCallback(paramString, paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityCallbackRemote.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */