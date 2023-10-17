package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class HandlerCompat
{
  private static final String TAG = "HandlerCompat";
  
  public static Handler createAsync(Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.createAsync(paramLooper);
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      try
      {
        Handler localHandler = (Handler)Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE }).newInstance(new Object[] { paramLooper, null, Boolean.valueOf(true) });
        return localHandler;
      }
      catch (InvocationTargetException paramLooper)
      {
        paramLooper = paramLooper.getCause();
        if (!(paramLooper instanceof RuntimeException))
        {
          if ((paramLooper instanceof Error)) {
            throw ((Error)paramLooper);
          }
          throw new RuntimeException(paramLooper);
        }
        throw ((RuntimeException)paramLooper);
      }
      catch (NoSuchMethodException localNoSuchMethodException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
      Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", localIllegalAccessException);
    }
    return new Handler(paramLooper);
  }
  
  public static Handler createAsync(Looper paramLooper, Handler.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.createAsync(paramLooper, paramCallback);
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      try
      {
        Handler localHandler = (Handler)Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE }).newInstance(new Object[] { paramLooper, paramCallback, Boolean.valueOf(true) });
        return localHandler;
      }
      catch (InvocationTargetException paramLooper)
      {
        paramLooper = paramLooper.getCause();
        if (!(paramLooper instanceof RuntimeException))
        {
          if ((paramLooper instanceof Error)) {
            throw ((Error)paramLooper);
          }
          throw new RuntimeException(paramLooper);
        }
        throw ((RuntimeException)paramLooper);
      }
      catch (NoSuchMethodException localNoSuchMethodException) {}catch (InstantiationException localInstantiationException) {}catch (IllegalAccessException localIllegalAccessException) {}
      Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", localIllegalAccessException);
    }
    return new Handler(paramLooper, paramCallback);
  }
  
  public static boolean hasCallbacks(Handler paramHandler, Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Api29Impl.hasCallbacks(paramHandler, paramRunnable);
    }
    if (Build.VERSION.SDK_INT >= 16) {
      try
      {
        boolean bool = ((Boolean)Handler.class.getMethod("hasCallbacks", new Class[] { Runnable.class }).invoke(paramHandler, new Object[] { paramRunnable })).booleanValue();
        return bool;
      }
      catch (NullPointerException paramHandler) {}catch (NoSuchMethodException paramHandler) {}catch (IllegalAccessException paramHandler) {}catch (InvocationTargetException paramHandler)
      {
        paramHandler = paramHandler.getCause();
        if (!(paramHandler instanceof RuntimeException))
        {
          if ((paramHandler instanceof Error)) {
            throw ((Error)paramHandler);
          }
          throw new RuntimeException(paramHandler);
        }
        throw ((RuntimeException)paramHandler);
      }
    } else {
      paramHandler = null;
    }
    throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", paramHandler);
  }
  
  public static boolean postDelayed(Handler paramHandler, Runnable paramRunnable, Object paramObject, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.postDelayed(paramHandler, paramRunnable, paramObject, paramLong);
    }
    paramRunnable = Message.obtain(paramHandler, paramRunnable);
    paramRunnable.obj = paramObject;
    return paramHandler.sendMessageDelayed(paramRunnable, paramLong);
  }
  
  private static class Api28Impl
  {
    public static Handler createAsync(Looper paramLooper)
    {
      return Handler.createAsync(paramLooper);
    }
    
    public static Handler createAsync(Looper paramLooper, Handler.Callback paramCallback)
    {
      return Handler.createAsync(paramLooper, paramCallback);
    }
    
    public static boolean postDelayed(Handler paramHandler, Runnable paramRunnable, Object paramObject, long paramLong)
    {
      return paramHandler.postDelayed(paramRunnable, paramObject, paramLong);
    }
  }
  
  private static class Api29Impl
  {
    public static boolean hasCallbacks(Handler paramHandler, Runnable paramRunnable)
    {
      return paramHandler.hasCallbacks(paramRunnable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\HandlerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */