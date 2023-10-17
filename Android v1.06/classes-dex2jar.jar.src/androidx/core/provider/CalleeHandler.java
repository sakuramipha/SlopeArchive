package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

class CalleeHandler
{
  static Handler create()
  {
    Handler localHandler;
    if (Looper.myLooper() == null) {
      localHandler = new Handler(Looper.getMainLooper());
    } else {
      localHandler = new Handler();
    }
    return localHandler;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\CalleeHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */